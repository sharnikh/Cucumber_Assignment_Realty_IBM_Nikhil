package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions( features = "src/main/java/Cucumber_Demo_Nikhil_IBM", 
                   glue = { "StepDefinition" }
                 
		         )


public class Runner {
	
}