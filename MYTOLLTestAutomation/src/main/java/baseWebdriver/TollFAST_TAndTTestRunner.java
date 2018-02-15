package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/tollFast_TAndT/ABC.feature"}
	,glue= {"commonStepsDefinitions","tollFast_TAndTStepDefinitions","createShipmentStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

	"json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",

}
)

public class TollFAST_TAndTTestRunner extends AbstractTestNGCucumberTests {

}
