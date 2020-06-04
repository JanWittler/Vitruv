package tools.vitruv.framework.variability.vave.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;

import tools.vitruv.framework.change.description.ConcreteChange;
import tools.vitruv.framework.variability.vave.VaveService;
import tools.vitruv.framework.variability.vave.util.Vave2FeatureIDE;
import tools.vitruv.framework.variability.vave.util.VaveModelHelper;
import tools.vitruv.framework.variability.vave.util.VaveXMIResourceImpl;
import vavemodel.Variant;
import vavemodel.VavemodelFactory;

public class VaveModel implements VaveService {

	public VaveModel() {
	}

	public VaveModel(Resource vaveResource, String systemName) { // needed for vitruv integration
		loadVave(vaveResource, systemName);
	}

	private void loadVave(Resource vaveResource, String systemName) {
		try {
			vaveResource.load(null);
		} catch (IOException e) {
		}
		vavemodel.System system = VavemodelFactory.eINSTANCE.createSystem();
		vaveResource.getContents().add(system);
		system.setName(systemName);
	}

	@SuppressWarnings("unchecked")
	public void addRootFeatureLocal(String featureName) {
		Resource vaveRes = VaveXMIResourceImpl.createAndAddResource();
		vavemodel.System system = VavemodelFactory.eINSTANCE.createSystem();
		vaveRes.getContents().add(system);
		system.setName(featureName);
		Variant rootVariant = VavemodelFactory.eINSTANCE.createVariant();
		rootVariant.setName(featureName);
		EStructuralFeature rootVariantFeature = VaveModelHelper.getStructuralFeatureValue(system, "name", "variant");
		if (rootVariant != null) {
			((EList<EObject>)system.eGet(rootVariantFeature)).add(rootVariant);
		}
		VaveXMIResourceImpl.saveResource(vaveRes);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRootFeature(String featureName, String systemName, Resource vaveResource) {
		try {
			vaveResource.load(null);
		} catch (IOException e) {
		}
		EObject childElementIn = VaveModelHelper.findFeature(vaveResource, systemName);
		Variant rootVariant = VavemodelFactory.eINSTANCE.createVariant();
		rootVariant.setName(featureName);
		EStructuralFeature rootVariantFeature = VaveModelHelper.getStructuralFeatureValue(childElementIn, "name", "variant");
		if (rootVariant != null) {
			((EList<EObject>)childElementIn.eGet(rootVariantFeature)).add(rootVariant);
		}
		VaveXMIResourceImpl.saveResource(vaveResource);
	}

	@Override
	public Document getFeatureModelForFeatureIDE(Resource vaveRes) {
		// create the featureIDE document
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = null;
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e2) {
			e2.printStackTrace();
		}
		Document featureModelDocument = documentBuilder.newDocument();
		try {
			Vave2FeatureIDE.createFeatureModelInstance(vaveRes, featureModelDocument);
			Vave2FeatureIDE.createModelFile(featureModelDocument);
		} catch (IOException | ParserConfigurationException | TransformerException e1) {
			e1.printStackTrace();
		}
		return featureModelDocument;
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

}
