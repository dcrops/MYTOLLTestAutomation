package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/dashboard/MYT_3539_Access_Draft_Shipment.feature"}
	,glue= {"commonStepsDefinitions","dashboardStepDefinitions","createShipmentStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Dashboard\\cucumber-pretty",

"json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\Dashboard\\CucumberTestReport.json",

}

)
public class DashboardTestRunner extends AbstractTestNGCucumberTests {

}
