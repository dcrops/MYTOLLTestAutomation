package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = {"src/test/Resources/rateEnquiryFeatures/MYT_1692_RateEnquiry_RateWithinAShipment.feature" }
    ,glue= {"commonStepsDefinitions","rateEnquiryStepDefinitions","createShipmentStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\RateEnquiry\\cucumber-pretty",

    "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\RateEnquiry\\cucumber-json\\CucumberTestReport.json",
	
}
	
)

public class RateEnquiryTestRunner extends AbstractTestNGCucumberTests{

}

