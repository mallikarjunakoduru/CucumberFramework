package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(format = { "html:target/cucumber"},
		features={"classpath:FeatureFiles"},
		   glue="classpath:StepDefinitions"
		 // , dryRun=true
		   ,tags="@tag2"
		)
public class TestRunner {

}
