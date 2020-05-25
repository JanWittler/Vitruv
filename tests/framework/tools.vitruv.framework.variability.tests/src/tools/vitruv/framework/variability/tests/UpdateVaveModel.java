package tools.vitruv.framework.variability.tests;

import org.junit.jupiter.api.Test;
import tools.vitruv.framework.variability.vave.impl.VaveModel;

public class UpdateVaveModel {
	
	VaveModel vavemodel = new VaveModel();
	
	@Test
	public void addRootFeature()  {
		vavemodel.addRootFeature("Root");
	}

}
