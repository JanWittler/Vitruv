package tools.vitruv.framework.tests

import java.io.File
import java.util.function.Function
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.rules.TestName
import tools.vitruv.framework.tests.util.TestUtil
import tools.vitruv.framework.tuid.TuidManager

/** 
 * Basic test class for all Vitruvius tests that require a test project within
 * the test workspace. The class creates a test project for each test case
 * within the workspace of the Eclipse test instance.
 * @author Heiko Klare
 */
abstract class VitruviusTest {
	@Rule
	public TestName testName = new TestName
	File folder
	Function<String, File> testProjectCreator

	@BeforeClass
	def static void setUpAllTests() {
		TestUtil::initializeLogger
	}

	new() {
		this.testProjectCreator = [String s|initializeTestProject(s)]
	}

	/** 
	 * Overwrites the default creator for initializing the test project with the
	 * given one
	 * @param testProjectCreator- the new test project creator
	 */
	def protected void setTestProjectCreator(Function<String, File> testProjectCreator) {
		this.testProjectCreator = testProjectCreator
	}

	/** 
	 * Initializes each test case and creates the test project in the test
	 * workspace. When overwriting this method, ensure that the super method
	 * gets called.
	 */
	@Before
	def void beforeTest() {
		TuidManager::instance.reinitialize()
		val testMethodName = testName.methodName
		this.folder = testProjectCreator.apply(testMethodName)
	}

	/** 
	 * Initializes a test project with the given name extended by a timestamp in the temporary files folder or in the folder
	 * specified by the VM argument.
	 * @param testName- the name of the test project
	 * @return the created test project folder
	 */
	def private static File initializeTestProject(String testName) {
		return TestUtil::createProjectFolder(testName, true)
	}

	def protected File getCurrentTestProjectFolder() {
		return folder
	}
}