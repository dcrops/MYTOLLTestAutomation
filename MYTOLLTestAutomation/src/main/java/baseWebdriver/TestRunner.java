package baseWebdriver;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/bookAPickupFeatures/BookAPIckup_TollTasmania_Service_Express.feature"}
		, glue= {"bookAPickupStepDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
				
}
				
)

public class TestRunner extends AbstractTestNGCucumberTests    {
//BookAPIckup_TollTasmania_Service_Express.feature
	
}
