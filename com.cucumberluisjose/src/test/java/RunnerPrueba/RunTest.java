package RunnerPrueba;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		tags = "@test2",
		features = "/Users/macbook/eclipse-workspace/com.cucumberluisjose/src/test/resources/features/step.feature",
		glue = "com.steps",
		plugin = { "summary", "pretty", 
				"html:target/cucumber-reports.html", 
				"json:target/cucumber-reports", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true
		
		
		)





public class RunTest {

}
