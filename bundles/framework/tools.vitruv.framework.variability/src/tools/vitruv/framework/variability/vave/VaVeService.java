package tools.vitruv.framework.variability.vave;

import java.io.File;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import tools.vitruv.framework.change.description.ConcreteChange;

public interface VaVeService {
	 
///////////////PROBLEM SPACE API////////////////
	 
	 File getFeatureModelForFeatureIDE();
	 void addRootFeature(String featureName, String systemName, Resource vaveResource);
	 void addFeature(String featureName, String parentName, String type);
	 void deleteFeature(String featureName);
	 void changeFeature();
	 
///////////////SOLUTION SPACE API////////////////
	 
	 File getVariant(List<String> featureList);
	 void addMapping(String expression, ConcreteChange change);
	 void deleteMapping(String featureName);
	 
}
