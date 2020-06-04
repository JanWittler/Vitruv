package tools.vitruv.framework.variability.vave;

import java.io.File;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Document;

import tools.vitruv.framework.change.description.ConcreteChange;

public interface VaveService {
	 
///////////////PROBLEM SPACE API////////////////
	 
	 Document getFeatureModelForFeatureIDE(Resource vaveResource);
	 void addRootFeature(String featureName, String systemName, Resource vaveResource);
	 void addFeature(String featureName, String parentName, String type);
	 void deleteFeature(String featureName);
	 void changeFeature();
	 
///////////////SOLUTION SPACE API////////////////
	 
	 File getVariant(List<String> featureList);
	 void addMapping(String expression, ConcreteChange change);
	 void deleteMapping(String featureName);
	 
}
