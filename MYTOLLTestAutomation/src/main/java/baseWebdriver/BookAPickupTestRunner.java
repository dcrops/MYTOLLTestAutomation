package baseWebdriver;


import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.testng.*;
import myTollHomePageActions.MyTollHomePageActions;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/bookAPickupFeatures/MYT_622_BAP Share my book a pickup.feature"} //MYT_1524_Book a Pickup'Default' mode to Quick EntryMode.feature"} //"}
		,glue= {"commonStepsDefinitions","bookAPickupStepDefinitions","createShipmentStepDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
				
}
				
)

public class BookAPickupTestRunner extends AbstractTestNGCucumberTests    {

	
	
}
