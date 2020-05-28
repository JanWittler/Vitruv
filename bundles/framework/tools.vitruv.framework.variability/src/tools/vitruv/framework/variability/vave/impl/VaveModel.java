package tools.vitruv.framework.variability.vave.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import tools.vitruv.framework.change.description.ConcreteChange;
import tools.vitruv.framework.variability.vave.VaVeService;
import tools.vitruv.framework.variability.vave.util.VaveXMIResourceFactoryImpl;
import vavemodel.Variant;
import vavemodel.VavemodelFactory;

public class VaveModel implements VaVeService {
	
	@Override
	public void addRootFeature(String featureName) {
		Resource vaveRes = createAndAddResource();
		vavemodel.System system = VavemodelFactory.eINSTANCE.createSystem();
		vaveRes.getContents().add(system);
		system.setName(featureName);
		Variant rootVariant = VavemodelFactory.eINSTANCE.createVariant();
		rootVariant.setName(featureName);
		EStructuralFeature rootVariantFeature = getStructuralFeatureValue(system, "name", "variant");
		if (rootVariant != null) {
			((EList) system.eGet(rootVariantFeature)).add(rootVariant);
		}
		saveResource(vaveRes);
	}

	@Override
	public File getFeatureModelForFeatureIDE() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFeature(String featureName, String parentName, String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFeature(String featureName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeFeature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public File getVariant(List<String> featureList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMapping(String expression, ConcreteChange change) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMapping(String featureName) {
		// TODO Auto-generated method stub
		
	}
	
	private static Resource createAndAddResource() {
		ResourceSet resSet = new ResourceSetImpl();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("vavemodel", new VaveXMIResourceFactoryImpl());
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vavemodel",
				new VaveXMIResourceFactoryImpl());
		Resource vaveRes = resSet.createResource(URI.createURI("models/vave.vavemodel"));
		return vaveRes;
	}
	
	private static EStructuralFeature getStructuralFeatureValue(EObject object, String attrKey, String attrValue) {
		EList<EStructuralFeature> allFeatures = object.eClass().getEAllStructuralFeatures();
		EStructuralFeature feat = null;
		for (EStructuralFeature feature : allFeatures) {
			if (getStructuralFeature(feature, attrKey) == attrValue)
				feat = feature;
		}
		return feat;
	}
	
	private static Object getStructuralFeature(EObject object, String attrName) {
		Object attr = null;
		try {
			attr = object.eGet(object.eClass().getEStructuralFeature(attrName));
		} catch (NullPointerException e) {
			java.lang.System.out.println(e.getMessage());
		}
		return attr;
	}
	
	public static void saveResource(Resource resource) {
		Map saveOptions = ((XMLResource) resource).getDefaultSaveOptions();
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
		try {
			resource.save(saveOptions);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	

}
