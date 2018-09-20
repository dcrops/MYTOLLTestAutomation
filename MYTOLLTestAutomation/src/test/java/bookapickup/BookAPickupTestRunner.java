package bookapickup;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/bookapickup/MYT_1524_Book a Pickup'Default' mode to Quick EntryMode.feature",
        		"src/test/Resources/bookapickup/MYT_5885_EditSenderAddressFromBookAPickupPage.feature",
        		      "src/test/Resources/bookapickup/MYT_622_BAP Share my book a pickup.feature",
        		      "src/test/Resources/bookapickup/MYT_6242_Toll Mining Services Book A Pickup.feature",
        		      "src/test/Resources/bookapickup/MYT-6226_Toll Energy Book A Pickup.feature"
        		}
		//,features = { "src/test/Resources/bookapickup/MYT_6242_Toll Mining Services Book A Pickup.feature",
						//"src/test/Resources/bookapickup/MYT-6226_Toll Energy Book A Pickup.feature"}
	//,tags = {"@tag1"}

		,glue= {"commonStepsDefinitions", "bookAPickupStepDefinitions", "createShipmentStepDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Pickups\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\Pickups\\cucumber-json\\CucumberTestReport.json",
				
}
				
)

public class BookAPickupTestRunner extends AbstractTestNGCucumberTests    {

	
	
}
