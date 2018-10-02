package runners.trackandtrace;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/tollFast_TAndT/ABC.feature"}
	,glue= {"steps"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\TollFast\\cucumber-pretty",

	"json:C:\\Source\\MYTOLLTestAutomation\\Reports\\TollFast\\cucumber-json\\CucumberTestReport.json",

}
)

public class TollFAST_TAndTTestRunner extends AbstractTestNGCucumberTests {

}
