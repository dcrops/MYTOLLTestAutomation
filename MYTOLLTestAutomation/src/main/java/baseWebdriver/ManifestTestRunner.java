package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/manifest/MYT_1795_Create_Commercial_Invoice.feature", "src/test/Resources/manifest/E2E_Manual_Manifest_TCHEM.feature",
			 "src/test/Resources/manifest/MYT_6292_Manifest_SaveShipmentAsDraft.feature" ,  "src/test/Resources/manifest/E2E_Manual_Manifest_TEM.feature", 
			 "src/test/Resources/manifest/E2E_Manual_Manifest_TMS.feature"}
	//,features = {"src/test/Resources/manifest/E2E_Manual_Manifest_TMS.feature"}
	,tags = {"@Shakeout"}
	,glue= {"commonStepsDefinitions","createShipmentStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Manifest\\cucumber-pretty",

        "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\Manifest\\cucumber-json\\CucumberTestReport.json",
		
}
		
)

public class ManifestTestRunner extends AbstractTestNGCucumberTests {

}
