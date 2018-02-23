package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/rateEnquiry/ABC.feature"}
	,glue= {"commonStepsDefinitions","rateEnquiryStepDefinitions","createShipmentStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

    "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
	
}
	
)

public class RateEnquiryTestRunner extends AbstractTestNGCucumberTests{

}
