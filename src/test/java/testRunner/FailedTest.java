 package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(

		features = "@target/rerun.txt",

		glue = { "stepDefinitions", "appHooks" }, dryRun = false,
		// tags = "@sanity and @regression"
		// tags="@sanity and not @regression"
		// tags="smoke"
//		 plugin = { "pretty", "html:reports/myreport.html",
		// "rerun:target/rerun.txt"
		// // To capture failures}
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/", "rerun:target/rerun.txt" }, monochrome = true)

public class FailedTest {

}
