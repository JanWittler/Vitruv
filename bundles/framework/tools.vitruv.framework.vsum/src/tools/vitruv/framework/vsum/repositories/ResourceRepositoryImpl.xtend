package tools.vitruv.framework.vsum.repositories

import edu.kit.ipd.sdq.commons.util.org.eclipse.emf.common.util.URIUtil
import java.io.File
import java.io.IOException
import java.util.HashMap
import java.util.Map
import java.util.concurrent.Callable
import java.util.function.Consumer
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.lib.annotations.Accessors
import tools.vitruv.framework.change.description.TransactionalChange
import tools.vitruv.framework.change.description.VitruviusChangeFactory
import tools.vitruv.framework.change.recording.AtomicEmfChangeRecorder
import tools.vitruv.framework.correspondence.CorrespondenceModel
import tools.vitruv.framework.correspondence.CorrespondenceModelFactory
import tools.vitruv.framework.correspondence.CorrespondenceProviding
import tools.vitruv.framework.correspondence.InternalCorrespondenceModel
import tools.vitruv.framework.domains.VitruvDomain
import tools.vitruv.framework.domains.repository.VitruvDomainRepository
import tools.vitruv.framework.tuid.TuidManager
import tools.vitruv.framework.util.bridges.EcoreResourceBridge
import tools.vitruv.framework.util.datatypes.ModelInstance
import tools.vitruv.framework.util.datatypes.VURI
import tools.vitruv.framework.uuid.UuidGeneratorAndResolver
import tools.vitruv.framework.uuid.UuidGeneratorAndResolverImpl
import tools.vitruv.framework.uuid.UuidResolver
import tools.vitruv.framework.vsum.ModelRepository
import tools.vitruv.framework.vsum.helper.FileSystemHelper

import static java.util.Collections.emptyMap
import static extension tools.vitruv.framework.util.ResourceSetUtil.getRequiredTransactionalEditingDomain
import static extension tools.vitruv.framework.util.ResourceSetUtil.withGlobalFactories
import static extension tools.vitruv.framework.util.command.EMFCommandBridge.executeVitruviusRecordingCommand
import tools.vitruv.framework.util.command.VitruviusRecordingCommand

class ResourceRepositoryImpl implements ModelRepository, CorrespondenceProviding {
	static val logger = Logger.getLogger(ResourceRepositoryImpl.simpleName)
	val ResourceSet resourceSet
	val VitruvDomainRepository metamodelRepository
	val Map<VURI, ModelInstance> modelInstances
	InternalCorrespondenceModel correspondenceModel
	val FileSystemHelper fileSystemHelper
	val File folder
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER)
	UuidGeneratorAndResolver uuidGeneratorAndResolver
	val Map<VitruvDomain, AtomicEmfChangeRecorder> domainToRecorder
	var isRecording = false

	new(File folder, VitruvDomainRepository metamodelRepository) {
		this(folder, metamodelRepository, null)
	}

	new(File folder, VitruvDomainRepository metamodelRepository, ClassLoader classLoader) {
		this.metamodelRepository = metamodelRepository
		this.folder = folder
		this.resourceSet = new ResourceSetImpl().withGlobalFactories()
		this.modelInstances = new HashMap<VURI, ModelInstance>()
		try {
			this.fileSystemHelper = new FileSystemHelper(this.folder)
		} catch (IOException e) {
			val message = '''Unable to initialize V-SUM metadata folders in folder: «folder»'''
            		logger.error(message, e)
            		throw new IllegalStateException(message, e)
        	}
		initializeUuidProviderAndResolver()
		this.domainToRecorder = new HashMap<VitruvDomain, AtomicEmfChangeRecorder>()
		initializeCorrespondenceModel()
		loadVURIsOfVSMUModelInstances()
	}

	def private AtomicEmfChangeRecorder getOrCreateChangeRecorder(VURI vuri) {
		var VitruvDomain domain = getMetamodelByURI(vuri)
		domainToRecorder.putIfAbsent(domain, new AtomicEmfChangeRecorder(this.uuidGeneratorAndResolver))
		return domainToRecorder.get(domain)
	}

	/** 
	 * Supports three cases: 1) get registered 2) create non-existing 3) get unregistered but
	 * existing that contains at most a root element without children. But throws an exception if an
	 * instance that contains more than one element exists at the uri.
	 * DECISION Since we do not throw an exception (which can happen in 3) we always return a valid
	 * model. Hence the caller do not have to check whether the retrieved model is null.
	 */
	def private ModelInstance getAndLoadModelInstanceOriginal(VURI modelURI, boolean forceLoadByDoingUnloadBeforeLoad) {
		val ModelInstance modelInstance = getModelInstanceOriginal(modelURI)
		try {
			if (modelURI.EMFUri.toString().startsWith("pathmap") || URIUtil.existsResourceAtUri(modelURI.EMFUri)) {
				modelInstance.load(getMetamodelByURI(modelURI).defaultLoadOptions, forceLoadByDoingUnloadBeforeLoad)
				relinkUuids(modelInstance)
			}
		} catch (RuntimeException re) {
			// could not load model instance --> this should only be the case when the
			// model is not existing yet
			logger.info('''Exception during loading of model instance «modelInstance» occured: «re»''')
		}

		return modelInstance
	}

	def private void relinkUuids(ModelInstance modelInstance) {
		for (EObject root : modelInstance.rootElements) {
			root.eAllContents.forEachRemaining([ object |
				if (uuidGeneratorAndResolver.hasUuid(object)) {
					uuidGeneratorAndResolver.registerEObject(this.uuidGeneratorAndResolver.getUuid(object), object)
				} else {
					logger.warn('''Element «object» has no UUID that can be linked during resource reload''')
				}
			])
		}
	}

	override ModelInstance getModel(VURI modelURI) {
		return getAndLoadModelInstanceOriginal(modelURI, false)
	}

	override void forceReloadModelIfExisting(VURI modelURI) {
		if (existsModelInstance(modelURI)) {
			getAndLoadModelInstanceOriginal(modelURI, true)
		}
	}

	def private ModelInstance getModelInstanceOriginal(VURI modelURI) {
		var ModelInstance modelInstance = modelInstances.get(modelURI)
		if (modelInstance === null) {
			executeAsCommand [
				// case 2 or 3
				var ModelInstance internalModelInstance = getOrCreateUnregisteredModelInstance(modelURI)
				registerModelInstance(modelURI, internalModelInstance)
			]
			modelInstance = modelInstances.get(modelURI)
		}
		return modelInstance
	}

	def private void registerModelInstance(VURI modelUri, ModelInstance modelInstance) {
		this.modelInstances.put(modelUri, modelInstance)
		// Do not record other URI types than file and platform (e.g. pathmap) because they cannot
		// be modified
		if (modelUri.EMFUri.isFile() || modelUri.EMFUri.isPlatform()) {
			var recorder = getOrCreateChangeRecorder(modelUri)
			recorder.addToRecording(modelInstance.resource)
			if (isRecording && !recorder.isRecording()) {
				recorder.beginRecording()
			}
		}
		saveVURIsOfVsumModelInstances()
	}

	def private boolean existsModelInstance(VURI modelURI) {
		return modelInstances.containsKey(modelURI)
	}

	def private void saveModelInstance(ModelInstance modelInstance) {
		executeAsCommand [
			var metamodel = getMetamodelByURI(modelInstance.URI)
			var resourceToSave = modelInstance.resource
			val saveOptions = if (metamodel !== null) metamodel.defaultSaveOptions else emptyMap
			try {
				if (!resourceSet.requiredTransactionalEditingDomain.isReadOnly(resourceToSave)) {
					// we allow resources without a domain for internal uses.
					EcoreResourceBridge.saveResource(resourceToSave, saveOptions)
				}
			} catch (IOException e) {
				logger.warn('''Model could not be saved: «modelInstance.URI»''')
				throw new RuntimeException('''Could not save VURI «modelInstance.URI»: «e»''')
			}
			return null
		]
	}

	override void persistAsRoot(EObject rootEObject, VURI vuri) {
		val ModelInstance modelInstance = getModelInstanceOriginal(vuri)
		executeAsCommand [
			TuidManager.instance.registerObjectUnderModification(rootEObject)
			val resource = modelInstance.resource
			resource.contents += rootEObject
			resource.modified = true
			logger.debug('''Create model with resource: «resource»'''.toString)
			TuidManager.instance.updateTuidsOfRegisteredObjects()
		// Usually we should deregister the object, but since we do not know if it was
		// registered before and if the other objects should still be registered
		// we cannot remove it or flush the registry
		]
	}

	override void saveAllModels() {
		logger.debug('''Saving all models of model repository for VSUM: «this.folder»''')
		saveAllChangedModels()
		saveAllChangedCorrespondenceModels()
	}

	def private void deleteEmptyModels() {
		// materialize the models to delete because else we’ll get a ConcurrentModificationException
		modelInstances.values.filter[rootElements.isEmpty].toList.forEach[deleteModel(it.URI)]
	}

	def private void saveAllChangedModels() {
		deleteEmptyModels()
		for (ModelInstance modelInstance : this.modelInstances.values()) {
			var Resource resourceToSave = modelInstance.resource
			if (resourceToSave.isModified()) {
				logger.trace('''Saving resource: «resourceToSave»''')
				saveModelInstance(modelInstance)
				modelInstance.getResource().setModified(false)
			}
		}
	}

	def private void saveAllChangedCorrespondenceModels() {
		executeAsCommand [
			logger.trace( '''Saving correspondence model: «correspondenceModel.URI»''')
			correspondenceModel.saveModel()
		]
	}

	def private ModelInstance getOrCreateUnregisteredModelInstance(VURI modelURI) {
		var String fileExtension = modelURI.fileExtension
		var VitruvDomain metamodel = this.metamodelRepository.getDomain(fileExtension)
		if (metamodel === null) {
			throw new RuntimeException( '''Cannot create a new model instance at the uri '«modelURI»' because no metamodel is registered for the file extension '«fileExtension»'!''')
		}
		return loadModelInstance(modelURI, metamodel)
	}

	def private ModelInstance loadModelInstance(VURI modelURI, VitruvDomain metamodel) {
		var URI emfURI = modelURI.EMFUri
		var Resource modelResource = URIUtil.loadResourceAtURI(emfURI, this.resourceSet, metamodel.defaultLoadOptions)
		var ModelInstance modelInstance = new ModelInstance(modelURI, modelResource)
		relinkUuids(modelInstance)
		return modelInstance
	}

	def private void initializeCorrespondenceModel() {
		executeAsCommand[
			var correspondencesVURI = fileSystemHelper.correspondencesVURI
			var Resource correspondencesResource = null
			if (URIUtil.existsResourceAtUri(correspondencesVURI.EMFUri)) {
				logger.trace('''Loading correspondence model from: «fileSystemHelper.correspondencesVURI»''')
				correspondencesResource = resourceSet.getResource(correspondencesVURI.EMFUri, true)
			} else {
				correspondencesResource = resourceSet.createResource(correspondencesVURI.EMFUri)
				correspondencesResource.save(null)
			}
			var recorder = getOrCreateChangeRecorder(correspondencesVURI)
			recorder.addToRecording(correspondencesResource)
			recorder.beginRecording()
			correspondenceModel = CorrespondenceModelFactory.instance.createCorrespondenceModel(
				new TuidResolverImpl(metamodelRepository, this), uuidGeneratorAndResolver, this, metamodelRepository,
				correspondencesVURI, correspondencesResource)
			recorder.endRecording()
			recorder.addToRecording(correspondencesResource)
		]
	}

	def private void initializeUuidProviderAndResolver() {
		executeAsCommand [
			var uuidProviderVURI = fileSystemHelper.uuidProviderAndResolverVURI
			var Resource uuidProviderResource = null
			if (URIUtil.existsResourceAtUri(uuidProviderVURI.EMFUri)) {
				logger.
					trace('''Loading uuid provider and resolver model from: «fileSystemHelper.uuidProviderAndResolverVURI»''')
				uuidProviderResource = resourceSet.getResource(uuidProviderVURI.EMFUri, true)
			} else {
				uuidProviderResource = resourceSet.createResource(uuidProviderVURI.EMFUri)
			}
			// TODO HK We cannot enable strict mode here, because for textual views we will not get
			// create changes in any case. We should therefore use one monitor per model and turn on
			// strict mode
			// depending on the kind of model/view (textual vs. semantic)
			uuidGeneratorAndResolver = new UuidGeneratorAndResolverImpl(this.resourceSet, uuidProviderResource, false)
		]
	}

	/** 
	 * Returns the correspondence model in this model repository
	 * @return the correspondence model
	 */
	override CorrespondenceModel getCorrespondenceModel() {
		correspondenceModel.genericView
	}

	def private void loadVURIsOfVSMUModelInstances() {
		for (VURI vuri : fileSystemHelper.loadVsumVURIsFromFile()) {
			var metamodel = getMetamodelByURI(vuri)
			var modelInstance = loadModelInstance(vuri, metamodel)
			registerModelInstance(vuri, modelInstance)
		}
	}

	def private void saveVURIsOfVsumModelInstances() {
	        // TODO Reimplement saving of V-SUM with a proper reload mechanism
		// fileSystemHelper.saveVsumVURIsToFile(modelInstances.keySet)
	}

	def private VitruvDomain getMetamodelByURI(VURI uri) {
		metamodelRepository.getDomain(uri.fileExtension)
	}

	override void startRecording() {
		domainToRecorder.values.forEach[beginRecording()]
		isRecording = true
		logger.debug("Start recording virtual model")
	}

	override Iterable<? extends TransactionalChange> endRecording() {
		logger.debug("End recording virtual model")
		isRecording = false
		executeAsCommand[
			domainToRecorder.values.forEach[endRecording()]
		]
		return domainToRecorder.values.map [ recorder |
			val compChange = VitruviusChangeFactory.instance.createCompositeTransactionalChange()
			recorder.changes.forEach[compChange.addChange(it)]
			return compChange
		].filter[it.containsConcreteChange()]
	}

	def private void deleteModel(VURI vuri) {
		val modelInstance = getModelInstanceOriginal(vuri)
		val resource = modelInstance.resource
		executeAsCommand [
			try {
				logger.debug('''Deleting resource: «resource»''')
				resource.delete(null)
				modelInstances.remove(vuri)
			} catch (IOException e) {
				logger.error('''Deletion of resource «resource» did not work.''', e)
				return null
			}
		]
	}

	override <T> T executeAsCommand(Callable<T> command) {
		resourceSet.requiredTransactionalEditingDomain.executeVitruviusRecordingCommand(command)
	}

	override VitruviusRecordingCommand executeAsCommand(Runnable command) {
		resourceSet.requiredTransactionalEditingDomain.executeVitruviusRecordingCommand(command)
	}

	override void executeOnUuidResolver(Consumer<UuidResolver> function) {
		executeAsCommand [function.accept(uuidGeneratorAndResolver)]
	}

	override VURI getMetadataModelURI(String... metadataKey) {
		fileSystemHelper.getConsistencyMetadataModelVURI(metadataKey)
	}

	override Resource getModelResource(VURI vuri) {
		getModelInstanceOriginal(vuri).resource
	}
}