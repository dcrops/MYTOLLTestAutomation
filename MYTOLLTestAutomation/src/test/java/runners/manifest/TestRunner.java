package runners.manifest;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/manifest/MYT_1795_Create_Commercial_Invoice.feature"}
		, glue= {"manifestStepDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
				
}
				
)

public class TestRunner extends AbstractTestNGCucumberTests    {
//BookAPIckup_TollTasmania_Service_Express.feature
	
}
