package runer;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun=true,
		monochrome = true,
		features =  {"feature\\addproject.feature"},
		
//		features =  {"feature"},
		tags="@tag11",
        glue={"stepdefination"}	,
//      
        plugin= {"pretty", "html:target/cucumber-reports","html:target/cucumber-html-report"}
		
		
		
        
         )
public class junit {

}
 
