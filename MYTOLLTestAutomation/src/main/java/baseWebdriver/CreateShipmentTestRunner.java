package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.testng.*;
import myTollHomePageActions.MyTollHomePageActions;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/createShipmentFeatures/MYT_6240_Toll Mining Services Shipment Manifesting Printing.feature"}
		,glue= {"commonStepsDefinitions", "createShipmentStepDefinitions", "bookAPickupStepDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Shipment\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\Shipment\\cucumber-json\\CucumberTestReport.json",
				
}
				
)

public class CreateShipmentTestRunner extends AbstractTestNGCucumberTests    {

	
}