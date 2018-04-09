package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
,features = { "src/test/Resources/advanceSearch/MYT_3482_Advance_Search_Sender_Receiver_Location.feature","src/test/Resources/advanceSearch/MYT_6201_Advance_Search_Location_Reference_CreationDate_TollCarrier.feature"}
,glue= {"commonStepsDefinitions","advanceSearchStepDefinitions"}
, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

        "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
		
}
		
)

public class AdvancedSearchTestRunner extends AbstractTestNGCucumberTests {

	
	
}

