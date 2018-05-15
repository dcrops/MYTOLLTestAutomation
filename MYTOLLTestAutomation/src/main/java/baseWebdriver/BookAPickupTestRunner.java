package baseWebdriver;


import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.testng.*;
import myTollHomePageActions.MyTollHomePageActions;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/bookAPickupFeatures/MYT_5885_EditSenderAddressFromBookAPickupPage.feature"}
		,glue= {"commonStepsDefinitions","bookAPickupStepDefinitions","createShipmentStepDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Pickups\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\Pickups\\cucumber-json\\CucumberTestReport.json",
				
}
				
)

public class BookAPickupTestRunner extends AbstractTestNGCucumberTests    {

	
	
}
