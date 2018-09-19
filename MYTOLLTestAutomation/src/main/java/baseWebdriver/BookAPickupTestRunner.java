package baseWebdriver;


import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.testng.*;
import myTollHomePageActions.MyTollHomePageActions;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/bookAPickupFeatures/MYT_1524_Book a Pickup'Default' mode to Quick EntryMode.feature",
        		"src/test/Resources/bookAPickupFeatures/MYT_5885_EditSenderAddressFromBookAPickupPage.feature",
        		      "src/test/Resources/bookAPickupFeatures/MYT_622_BAP Share my book a pickup.feature", 
        		      "src/test/Resources/bookAPickupFeatures/MYT_6242_Toll Mining Services Book A Pickup.feature", 
        		      "src/test/Resources/bookAPickupFeatures/MYT-6226_Toll Energy Book A Pickup.feature"
        		}
		//,features = { "src/test/Resources/bookAPickupFeatures/MYT_6242_Toll Mining Services Book A Pickup.feature",
						//"src/test/Resources/bookAPickupFeatures/MYT-6226_Toll Energy Book A Pickup.feature"}
	//,tags = {"@tag1"}

		,glue= {"commonStepsDefinitions","bookAPickupStepDefinitions","createShipmentStepDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Pickups\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\Pickups\\cucumber-json\\CucumberTestReport.json",
				
}
				
)

public class BookAPickupTestRunner extends AbstractTestNGCucumberTests    {

	
	
}
