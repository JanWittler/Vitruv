package edu.kit.ipd.sdq.vitruvius.tests.casestudies.pcmjava.integration.transformations.packagemapping.java2pcm

import edu.kit.ipd.sdq.vitruvius.codeintegration.tests.CodeIntegrationTestCBSNamespace
import edu.kit.ipd.sdq.vitruvius.tests.casestudies.pcmjava.transformations.util.CompilationUnitManipulatorHelper
import org.junit.Test

class IntegrationMethodMappingTransformationTest extends Java2PCMPackageIntegrationMappingTransformationTest{
	
	@Test
	def public void addMethodInIntegratedArea() throws Throwable{
		val String methodString = "void " + INTEGRATED_METHOD_NAME + "();";
		CompilationUnitManipulatorHelper.addMethodToCompilationUnit(CodeIntegrationTestCBSNamespace.I_DISPLAY_INTERFACE_NAME, 
			methodString, currentTestProject);
		
		assertMessage(1, "Elements in change were integrated into Vitruvius")
	}
		
}