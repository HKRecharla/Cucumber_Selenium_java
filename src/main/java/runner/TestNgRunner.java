package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * @author Harikrishna Recharla
 *
 */

@CucumberOptions(
		features = "/Users/harikrishna.r/eclipse-workspace/FreeCucu/src/main/java/Features/login.feature"
		,glue= {"stepDefinition"}
		,format = {"pretty","html:test-output"}
		,monochrome = true
		,dryRun = false		
		)


/**
 * Adding Abstract Testng
 * --> Runing cucumber every detected feature as separated test
 *
 */
public class TestNgRunner extends AbstractTestNGCucumberTests {

}
