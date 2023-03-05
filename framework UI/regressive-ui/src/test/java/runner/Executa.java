package runner;

import org.junit.runner.RunWith;

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		
		features = "src/test/resources/features"
				, 
		glue = "steps", 
tags = "@loginPositivo",
		dryRun = false,
plugin = {"pretty", "html:target/report.html" }, 


monochrome = true
		
		
		
		)

public class Executa {

}
