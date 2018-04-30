package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/manifest/E2E_Manual_Manifest_TCHEM.feature"}
	,glue= {"commonStepsDefinitions","createShipmentStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Manifest\\cucumber-pretty",

        "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\Manifest\\cucumber-json\\CucumberTestReport.json",
		
}
		
)

public class ManifestTestRunner extends AbstractTestNGCucumberTests {

}
