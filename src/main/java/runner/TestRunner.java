package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/harikrishna.r/eclipse-workspace/FreeCucu/src/main/java/Features/some.feature"
		,glue= {"stepDefinition"}
		,format = {"pretty","html:test-output"}
		,monochrome = true
		,dryRun = false		
		)
public class TestRunner {

}