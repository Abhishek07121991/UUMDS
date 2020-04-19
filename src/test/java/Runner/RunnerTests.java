package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src\\test\\java\\feature\\UMDSapplication.feature",
		glue= {"stepDefinition"},
		//plugin = {"pretty","html:test-output"},
plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json"}
		//plugin = {"html:target/cucumber-html-report"}
		
		)

public class RunnerTests {

	
}
