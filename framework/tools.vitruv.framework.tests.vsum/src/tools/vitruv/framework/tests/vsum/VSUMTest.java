package tools.vitruv.framework.tests.vsum;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import pcm_mockup.Component;
import pcm_mockup.PInterface;
import pcm_mockup.Pcm_mockupFactory;
import pcm_mockup.Repository;
import tools.vitruv.framework.metamodel.ModelInstance;
import tools.vitruv.framework.util.datatypes.VURI;
import tools.vitruv.framework.vsum.InternalVirtualModel;
import uml_mockup.UClass;
import uml_mockup.UPackage;
import uml_mockup.Uml_mockupFactory;

public class VSUMTest extends AbstractVSUMTest {
    protected String getCurrentProjectModelFolder() {
        return getCurrentProjectFolderName() + "/model/";
    }

    protected String getDefaultPCMInstanceURI() {
        return getCurrentProjectModelFolder() + "My.pcm_mockup";
    }

    protected String getDefaultUMLInstanceURI() {
        return getCurrentProjectModelFolder() + "My.uml_mockup";
    }

    protected String getAlternativePCMInstanceURI() {
        return getCurrentProjectModelFolder() + "NewPCMInstance.pcm_mockup";
    }

    protected String getAlterantiveUMLInstanceURI() {
        return getCurrentProjectModelFolder() + "NewUMLInstance.uml_mockup";
    }

    @Test
    public void testAll() {
        createMetaRepositoryVSUMAndModelInstances();
    }

    @Test
    public void testVSUMAddGetChangeAndSaveModel() {
        // create VSUM
        InternalVirtualModel vsum = createMetaRepositoryAndVSUM();

        // create test model
        VURI vuri = VURI.getInstance(getAlternativePCMInstanceURI());
        ModelInstance mi = vsum.getModelInstance(vuri);
        final Repository repo = Pcm_mockupFactory.eINSTANCE.createRepository();
        vsum.saveModelInstanceWithRoot(vuri, repo, null);
        final Component component = Pcm_mockupFactory.eINSTANCE.createComponent();
        vsum.executeCommand(new Callable<Void>() {
            @Override
            public Void call() {
                repo.getComponents().add(component);
                return null;
            }
        });

        // save test model
        vsum.saveModelInstance(vuri);

        // this is fine, the component is contained in the resource
        assertTrue("Resource of component is null", null != component.eResource());
        // causes a unload and a load of the model
        vsum.reloadModelInstance(vuri);
        mi = vsum.getModelInstance(vuri);

        // not fine anymore: component is not contained in the resource and it is a proxy
        boolean isProxy = component.eIsProxy();
        Resource resource = component.eResource();
        // resolve the eObject in the new resource
        Component resolvedComponent = (Component) EcoreUtil.resolve(component, mi.getResource());
        isProxy = resolvedComponent.eIsProxy();
        resource = resolvedComponent.eResource();
        assertTrue("Resource of component is null", null != resource);
        assertTrue("Component is a proxy", !isProxy);

        assertTrue("Resource of model instance is null", null != mi.getResource());
    }

    @Test
    public void testVUMResourceIsChangedExternally() throws IOException {
        // same as above
        InternalVirtualModel vsum = createMetaRepositoryAndVSUM();

        // create test model
        VURI vuri = VURI.getInstance(getAlternativePCMInstanceURI());
        ModelInstance mi = vsum.getModelInstance(vuri);
        final Repository repo = Pcm_mockupFactory.eINSTANCE.createRepository();
        vsum.saveModelInstanceWithRoot(vuri, repo, null);
        final Component component = Pcm_mockupFactory.eINSTANCE.createComponent();
        vsum.executeCommand(new Callable<Void>() {
            @Override
            public Void call() {
                repo.getComponents().add(component);
                return null;
            }
        });
        vsum.saveModelInstance(vuri);
        // simulate external change
        changeTestModelExternally(vuri);

        // the interface should not be in the model instance (before the reload)
        PInterface foundMockInterface = findInterfaceInModelInstance(mi);
        assertTrue("interface should not be in the model instance with uri: " + vuri.getEMFUri() + " and resource: "
                + mi.getResource(), null == foundMockInterface);

        // the interface should be in the model now.
        mi = vsum.getModelInstance(vuri);
        foundMockInterface = findInterfaceInModelInstance(mi);

        assertTrue("no interface found in the model instance with uri: " + vuri.getEMFUri() + " and resource: "
                + mi.getResource(), null != foundMockInterface);
    }

    @Test
    public void testLoadVSUMRepeadly() {
        InternalVirtualModel vsum = createMetaRepositoryAndVSUM();

        ModelInstance mi = fillVSUM(vsum);

        ModelInstance interfaceMi = vsum.getModelInstance(mi.getURI());
        PInterface foundInterface = findInterfaceInModelInstance(interfaceMi);
        assertTrue("The interface in " + foundInterface + " in the model instance: " + mi + " has no resource",
                null != foundInterface.eResource());

        ModelInstance compMi = vsum.getModelInstance(mi.getURI());
        Component foundComponent = findComponentInModelInstance(compMi);

        assertTrue("The component " + foundComponent + " in the model instance: " + mi + " has no resource",
                null != foundComponent.eResource());
        assertTrue("The interface " + foundInterface + " in the model instance: " + mi + " has no resource",
                null != foundInterface.eResource());

    }

    protected ModelInstance fillVSUM(final InternalVirtualModel vsum) {
        // create PCM
        VURI vuri = VURI.getInstance(getAlternativePCMInstanceURI());
        ModelInstance mi = vsum.getModelInstance(vuri);
        final Repository repo = Pcm_mockupFactory.eINSTANCE.createRepository();
        vsum.saveModelInstanceWithRoot(vuri, repo, null);
        vsum.executeCommand(new Callable<Void>() {
            @Override
            public Void call() {
                Component component = Pcm_mockupFactory.eINSTANCE.createComponent();
                repo.getComponents().add(component);
                return null;
            }
        });
        vsum.saveModelInstance(vuri);
        vsum.executeCommand(new Callable<Void>() {
            @Override
            public Void call() {
                PInterface mockIf = Pcm_mockupFactory.eINSTANCE.createPInterface();
                repo.getInterfaces().add(mockIf);
                return null;
            }
        });
        vsum.saveModelInstance(vuri);

        // create UML
        VURI vuriUML = VURI.getInstance(getAlterantiveUMLInstanceURI());
        final UPackage uPackage = Uml_mockupFactory.eINSTANCE.createUPackage();
        vsum.saveModelInstanceWithRoot(vuriUML, uPackage, null);
        vsum.executeCommand(new Callable<Void>() {
            @Override
            public Void call() {
                UClass uClass = Uml_mockupFactory.eINSTANCE.createUClass();
                uPackage.getClasses().add(uClass);
                uml_mockup.UInterface uInterface = Uml_mockupFactory.eINSTANCE.createUInterface();
                uPackage.getInterfaces().add(uInterface);
                return null;
            }
        });
        vsum.saveModelInstance(vuriUML);

        return mi;
    }

    private Component findComponentInModelInstance(final ModelInstance compMi) {
        return findEObjectInModelInstance(compMi, Component.class);
    }

    private PInterface findInterfaceInModelInstance(final ModelInstance mi) {
        return findEObjectInModelInstance(mi, PInterface.class);
    }

    private <T> T findEObjectInModelInstance(final ModelInstance mi, final Class<T> classToLookFor) {
        Iterator<EObject> iterator = mi.getResource().getAllContents();
        while (iterator.hasNext()) {
            EObject eObject = iterator.next();
            if (classToLookFor.isInstance(eObject)) {
                return classToLookFor.cast(eObject);
            }
        }
        return null;
    }

    private void changeTestModelExternally(final VURI vuri) throws IOException {
        // simulate external change. For example a change that is done by a user.
        // in this case we add an interface to the resource.
        ResourceSet extResourceSet = new ResourceSetImpl();
        Resource extRes = extResourceSet.createResource(vuri.getEMFUri());
        extRes.load(Collections.EMPTY_MAP);
        PInterface mockIf = Pcm_mockupFactory.eINSTANCE.createPInterface();
        Repository repo = (Repository) extRes.getContents().get(0);
        repo.getInterfaces().add(mockIf);
        extRes.save(Collections.EMPTY_MAP);
    }

    protected InternalVirtualModel createMetaRepositoryVSUMAndModelInstances(final String pcmModelUriString,
            final String umlModelUriString) {
        InternalVirtualModel vsum = createMetaRepositoryAndVSUM();
        createMockupModels(pcmModelUriString, umlModelUriString, vsum);
        return vsum;
    }

    protected InternalVirtualModel createMetaRepositoryVSUMAndModelInstances() {
        InternalVirtualModel vsum = createMetaRepositoryAndVSUM();
        createMockupModelsWithDefaultUris(vsum);
        return vsum;
    }

    protected InternalVirtualModel createMetaRepositoryAndVSUM() {
        return createMetaRepositoryAndVSUM(PCM_MM_URI, PCM_FILE_EXT, UML_MM_URI, UML_FILE_EXT);
    }

    private void createMockupModelsWithDefaultUris(final InternalVirtualModel vsum) {
        createMockupModels(getDefaultPCMInstanceURI(), getDefaultUMLInstanceURI(), vsum);
    }

    private void createMockupModels(final String pcmModelUriString, final String umlModelUriString,
            final InternalVirtualModel vsum) {
        createPcmMockupModel(pcmModelUriString, vsum);
        createUmlMockupModel(umlModelUriString, vsum);
    }

    private void createPcmMockupModel(final String modelURIString, final InternalVirtualModel vsum) {
        VURI modelURI = VURI.getInstance(modelURIString);
        ModelInstance model = vsum.getModelInstance(modelURI);
        final EList<EObject> contents = model.getResource().getContents();
        vsum.executeCommand(new Callable<Void>() {
            @Override
            public Void call() {
                Repository repo = Pcm_mockupFactory.eINSTANCE.createRepository();
                repo.getInterfaces().add(Pcm_mockupFactory.eINSTANCE.createPInterface());
                repo.getComponents().add(Pcm_mockupFactory.eINSTANCE.createComponent());
                contents.add(repo);
                return null;
            }
        });
        vsum.saveModelInstance(modelURI);
    }

    private void createUmlMockupModel(final String modelURIString, final InternalVirtualModel vsum) {
        VURI modelURI = VURI.getInstance(modelURIString);
        ModelInstance model = vsum.getModelInstance(modelURI);
        final EList<EObject> contents = model.getResource().getContents();
        vsum.executeCommand(new Callable<Void>() {
            @Override
            public Void call() {
                UPackage pckg = Uml_mockupFactory.eINSTANCE.createUPackage();
                pckg.getInterfaces().add(Uml_mockupFactory.eINSTANCE.createUInterface());
                pckg.getClasses().add(Uml_mockupFactory.eINSTANCE.createUClass());
                contents.add(pckg);
                return null;
            }
        });
        vsum.saveModelInstance(modelURI);
    }

    @Test
    public void testMockupModelInstantiation() {
        InternalVirtualModel vsum = createMetaRepositoryAndVSUM();
        String model1URIString = getDefaultUMLInstanceURI();
        String model2URIString = getDefaultUMLInstanceURI();
        createMockupModels(model1URIString, model2URIString, vsum);

        VURI model1URI = VURI.getInstance(model1URIString);
        VURI model2URI = VURI.getInstance(model2URIString);
        ModelInstance model1 = vsum.getModelInstance(model1URI);
        ModelInstance model2 = vsum.getModelInstance(model2URI);
        EList<EObject> contents1 = model1.getResource().getContents();
        assertNotNull(contents1);
        EObject root1 = contents1.get(0);
        assertNotNull(root1);
        EList<EObject> contents2 = model2.getResource().getContents();
        assertNotNull(contents2);
        EObject root2 = contents2.get(0);
        assertNotNull(root2);
    }
}
