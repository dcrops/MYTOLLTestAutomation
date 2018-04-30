package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true

,features = { "src/test/Resources/advanceSearch/MYT_3482_Advance_Search_LoadSavedSearch.feature","src/test/Resources/advanceSearch/MYT_3482_Advance_Search_Sender_Receiver_Location.feature",
		  "src/test/Resources/advanceSearch/MYT_3483_Advance_Search_ViewSearchShipmentResults.feature","src/test/Resources/advanceSearch/MYT_3540_AccessSavedSearchesInDashboard.feature",
		  "src/test/Resources/advanceSearch/MYT_6201_Advance_Search_Location_Reference_CreationDate_TollCarrier.feature","src/test/Resources/advanceSearch/MYT_6231_Advance_Search_ServiceType_Milestone_Conditions.feature"}

,glue= {"commonStepsDefinitions","advanceSearchStepDefinitions"}
, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\AdvancedSearch\\cucumber-pretty",

        "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\AdvancedSearch\\cucumber-json\\CucumberTestReport.json",
		
}
		
)

public class AdvancedSearchTestRunner extends AbstractTestNGCucumberTests {

	
	
}

