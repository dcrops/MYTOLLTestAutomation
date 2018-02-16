package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.testng.*;
import myTollHomePageActions.MyTollHomePageActions;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/createShipmentFeatures/create.feature"}
		,glue= {"commonStepsDefinitions", "createShipmentStepDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
				
}
				
)

public class CreateShipmentTestRunner extends AbstractTestNGCucumberTests    {

	
}