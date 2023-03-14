package cucumberSalesforceTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/resources/Feature11.feature"},
		glue= {}
		)
public class RunnerforSalesforceLogin extends AbstractTestNGCucumberTests {

}
