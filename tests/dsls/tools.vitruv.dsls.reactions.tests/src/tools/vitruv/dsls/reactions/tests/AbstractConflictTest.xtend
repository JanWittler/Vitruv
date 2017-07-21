package tools.vitruv.dsls.reactions.tests

import allElementTypes.AllElementTypesFactory
import allElementTypes.Root
import java.util.Collection
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.graphstream.graph.Graph
import tools.vitruv.framework.change.description.VitruviusChange
import tools.vitruv.framework.change.echange.EChange
import tools.vitruv.framework.util.datatypes.VURI
import tools.vitruv.framework.versioning.BranchDiff
import tools.vitruv.framework.versioning.Conflict
import tools.vitruv.framework.versioning.ConflictDetector
import tools.vitruv.framework.versioning.DependencyGraphCreator
import tools.vitruv.framework.versioning.ModelMerger
import tools.vitruv.framework.versioning.extensions.GraphExtension

import static org.hamcrest.CoreMatchers.equalTo
import static org.hamcrest.CoreMatchers.is
import static org.hamcrest.CoreMatchers.not
import static org.junit.Assert.assertThat
import tools.vitruv.framework.versioning.extensions.VirtualModelExtension
import tools.vitruv.framework.versioning.Reapplier

abstract class AbstractConflictTest extends AbstractVersioningTest {
	protected BranchDiff branchDiff
	protected Collection<Root> roots
	protected ConflictDetector conflictDetector = ConflictDetector::createConflictDetector
	protected Graph graph
	protected List<Conflict> conflicts
	protected List<EChange> echanges
	protected List<VitruviusChange> changes
	protected Map<String, String> modelPairs
	protected ModelMerger modelMerger
	protected Reapplier reapplier
	protected Root rootElement2
//	protected SourceTargetRecorder stRecorder
	protected VURI newSourceVURI
	protected VURI newTargetVURI
	protected VURI sourceVURI
	protected VURI targetVURI
	protected static extension DependencyGraphCreator = DependencyGraphCreator::instance
	protected static extension GraphExtension = GraphExtension::instance
	protected static extension VirtualModelExtension = VirtualModelExtension::instance
	protected static val containerId = "NonRootObjectContainer"
	protected static val newTestSourceModelName = "Further_Source_Test_Model"
	protected static val newTestTargetModelName = "Further_Target_Test_Model"

	override setup() {
		super.setup
		// Setup sourceTargetRecorder 
		sourceVURI = VURI::getInstance(rootElement.eResource)
		targetVURI = VURI::getInstance(
			URI::createURI(sourceVURI.EMFUri.toString.replace(TEST_SOURCE_MODEL_NAME, TEST_TARGET_MODEL_NAME)))

		rootElement2 = AllElementTypesFactory::eINSTANCE.createRoot
		roots = #[rootElement, rootElement2]
		rootElement2.id = newTestSourceModelName
		newTestSourceModelName.projectModelPath.createAndSynchronizeModel(rootElement2)

		modelMerger = ModelMerger::createModelMerger
		newSourceVURI = VURI::getInstance(rootElement2.eResource)
		val uri = URI::createURI(newSourceVURI.EMFUri.toString.replace(newTestSourceModelName, newTestTargetModelName))
		newTargetVURI = VURI::getInstance(uri)

		val rootToRootMap = #{
			sourceVURI.EMFUri.toFileString -> newSourceVURI.EMFUri.toFileString,
			targetVURI.EMFUri.toFileString -> newTargetVURI.EMFUri.toFileString
		}
		conflictDetector.addMap(rootToRootMap)
		reapplier = Reapplier::createReapplier
		assertThat(newSourceVURI, not(equalTo(sourceVURI)))
		assertThat(newTargetVURI, not(equalTo(targetVURI)))
		assertThat(newSourceVURI.hashCode, not(is(sourceVURI.hashCode)))
		assertThat(newTargetVURI.hashCode, not(is(targetVURI.hashCode)))

		val sourcePropagatedChanges = virtualModel.getResolvedPropagatedChanges(sourceVURI)
		val newSourcepropagatedChanges = virtualModel.getResolvedPropagatedChanges(newSourceVURI)
		assertThat(sourcePropagatedChanges.length, is(1))
		assertThat(newSourcepropagatedChanges.length, is(1))
	}

	override unresolveChanges() {
		true
	}

	protected def checkChangeMatchesLength(int l1, int l2) {
		roots.forEach[saveAndSynchronizeChanges]
		// FIXME PS "- 1" should be removed if the drop(1) is removed in  virtualModel.getChangeMatches
		assertThat(virtualModel.getChangeMatches(sourceVURI).length, is(l1 - 1))
		assertThat(virtualModel.getChangeMatches(newSourceVURI).length, is(l2 - 1))
	}

	protected final def assertMappedModelsAreEqual() {
		assertMappedModelsEqual(TEST_SOURCE_MODEL_NAME.projectModelPath, newTestSourceModelName.projectModelPath)
		assertMappedModelsEqual(TEST_TARGET_MODEL_NAME.projectModelPath, newTestTargetModelName.projectModelPath)
	}

	protected final def void assertMappedModelsEqual(String firstModelPathWithinProject,
		String secondModelPathWithinProject) {
		val testResourceSet = new ResourceSetImpl
		val firstRoot = getFirstRootElement(firstModelPathWithinProject, testResourceSet) as Root
		val secondRoot = getFirstRootElement(secondModelPathWithinProject, testResourceSet) as Root

		assertThat(firstRoot.eContents.length, is(secondRoot.eContents.length))
		firstRoot.eContents.forEach [ firstElement |
			val element = secondRoot.eContents.findFirst[EcoreUtil::equals(it, firstElement)]
			assertThat(element, not(equalTo(null)))
		]
		val id = firstRoot.id
		if (modelPairs.containsKey(id)) {
			val mappedId = modelPairs.get(id)
			assertThat(secondRoot.id, equalTo(mappedId))
		} else
			throw new IllegalStateException("ID should be contained in the map.")
	}

	protected final def assertDifferentNonRootContainment() {
		differentNonRootContainment(TEST_SOURCE_MODEL_NAME.projectModelPath, newTestSourceModelName.projectModelPath)
		differentNonRootContainment(TEST_TARGET_MODEL_NAME.projectModelPath, newTestTargetModelName.projectModelPath)
	}

	protected final def void differentNonRootContainment(String firstModelPathWithinProject,
		String secondModelPathWithinProject) {
		val testResourceSet = new ResourceSetImpl
		val firstRoot = getFirstRootElement(firstModelPathWithinProject, testResourceSet) as Root
		val secondRoot = getFirstRootElement(secondModelPathWithinProject, testResourceSet) as Root
		val firstContainer = firstRoot.nonRootObjectContainerHelper
		val secondContainer = secondRoot.nonRootObjectContainerHelper
		assertThat(firstContainer.id, equalTo(secondContainer.id))
		assertThat(firstContainer.nonRootObjectsContainment.size, is(secondContainer.nonRootObjectsContainment.size))
		val unmatchedElements = firstContainer.nonRootObjectsContainment.filter [ nonRoot1 |
			secondContainer.nonRootObjectsContainment.forall[!EcoreUtil::equals(it, nonRoot1)]
		]
		assertThat(unmatchedElements.size, is(1))
	}
}