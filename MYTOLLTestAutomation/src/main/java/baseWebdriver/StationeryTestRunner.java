package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/stationery/MYT_6079_6080_Stationery - Order Stationery.feature",
				
				"src/test/Resources/stationery/MYT_6080_My Orders List Orders that I have submitted previously.feature"
			}
	,glue= {"commonStepsDefinitions","stationeryStepDefinitions","createShipmentStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Stationery\\cucumber-pretty",

		"json:C:\\Source\\MYTOLLTestAutomation\\Reports\\Stationery\\cucumber-json\\CucumberTestReport.json",

}
)

public class StationeryTestRunner extends AbstractTestNGCucumberTests {

}
