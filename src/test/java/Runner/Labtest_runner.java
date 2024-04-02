package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="StepDefinition",
		//plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		//plugin={"pretty","json:target/cucumberReports.json"},
		//plugin={"pretty","junit:target/cucumberReports.xml"},
		plugin={"html:target/cucumber.html"},
		dryRun=true)
		//tags="@SmokeTest"
		
public class Labtest_runner {
	

}
