package Cucmberoptions;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



//Which test to run
	//what is ur feature file and what is ur glue code 
	//options (tags and reports) - html, json, junit, xml

	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/"
			+ "", glue = "stepDefinitions",
			monochrome = true
			
	)

public class TestRunner {

}
