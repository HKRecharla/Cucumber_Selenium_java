package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Harikrishna Recharla
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/harikrishna.r/eclipse-workspace/FreeCucu/src/main/java/Features/login.feature"
		,glue= {"stepDefinition"}
		,format = {"pretty","html:test-output"}
		,monochrome = true
		,dryRun = false		
		)

public class ApiRunner {

}
