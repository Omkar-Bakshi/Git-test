package MyRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/features",
		dryRun = true,
		glue = "stepdefinition"
		)

public class TestRunner {
	
	

}
