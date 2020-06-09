package tools.vitruv.framework.variability.tests;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import tools.vitruv.framework.variability.vave.impl.VaveModel;

public class FeatureIDETransformation2VaveModel {
	File featureIDE_file = new File("models/screwdriverFeaturemodel.xml");
	VaveModel vavemodel = new VaveModel();

	@Test
	public void createFeatureIDEModel() throws ParserConfigurationException, SAXException, IOException, TransformerException {
		vavemodel.setVaveModelfromFeatureIDE(featureIDE_file);
	}

}
