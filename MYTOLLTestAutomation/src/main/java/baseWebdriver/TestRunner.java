package baseWebdriver;

import java.io.File;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/rateEnquiryFeatures/rateEnquiryTest.feature"}
		, glue= {"rateEnquiryStepDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
				
}
				
)


//Test


public class TestRunner extends AbstractTestNGCucumberTests    {

	
}
