package tools.vitruv.framework.variability.vave;

import java.io.File;
import java.util.List;
import tools.vitruv.framework.change.description.ConcreteChange;

interface Management {
	 
///////////////PROBLEM SPACE API////////////////
	 
	 File getFeatureModelForFeatureIDE();
	 void addRootFeature(String featureName);
	 void addFeature(String featureName, String parentName, String type);
	 void deleteFeature(String featureName);
	 void changeFeature();
	 
///////////////SOLUTION SPACE API////////////////
	 
	 File getVariant(List<String> featureList);
	 void addMapping(String expression, ConcreteChange change);
	 void deleteMapping(String featureName);
	 
}
