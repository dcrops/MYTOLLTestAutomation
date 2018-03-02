package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
,features = { "src/test/Resources/advanceSearch/MYT_3483_Advance_Search_ViewSearchShipmentResults.feature"}
,glue= {"commonStepsDefinitions","advanceSearchStepDefinitions"}
, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

        "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
		
}
		
)

public class AdvancedSearchTestRunner extends AbstractTestNGCucumberTests {

	
	
}

