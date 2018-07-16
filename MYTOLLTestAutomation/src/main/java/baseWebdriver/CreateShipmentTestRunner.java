package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.testng.*;
import myTollHomePageActions.MyTollHomePageActions;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/createShipmentFeatures/MYT_1650_Shipment Default mode to Quick Entry  mode.feature",
        			"src/test/Resources/createShipmentFeatures/MYT_6138_Save a shipment as a Draft.feature"
        		     ,"src/test/Resources/createShipmentFeatures/MYT_6225_Toll Energy_Shipment Manifesting Printing.feature", 
        		      "src/test/Resources/createShipmentFeatures/MYT_6240_Toll Mining Services Shipment Manifesting Printing.feature"
        			}
		//,tags = {"@tag2"}
		,glue= {"commonStepsDefinitions", "createShipmentStepDefinitions", "bookAPickupStepDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Shipment\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\Shipment\\cucumber-json\\CucumberTestReport.json",
				
}
				
)

public class CreateShipmentTestRunner extends AbstractTestNGCucumberTests    {

	
}