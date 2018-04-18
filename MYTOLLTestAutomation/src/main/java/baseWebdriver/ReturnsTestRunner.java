package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/returns/MYT_6143_CreateReturn.feature"}
	,glue= {"commonStepsDefinitions", "rateEnquiryStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Returns\\cucumber-pretty",

			"json:C:\\Source\\MYTOLLTestAutomation\\Reports\\Returns\\cucumber-json\\CucumberTestReport.json",

}
)

public class ReturnsTestRunner extends AbstractTestNGCucumberTests{

}
