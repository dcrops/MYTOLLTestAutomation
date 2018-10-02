package runners.trackandtrace;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/trackAndTrace/ABC.feature"}
	,glue= {"steps"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\TrackAndTrace\\cucumber-pretty",

"json:C:\\Source\\MYTOLLTestAutomation\\Reports\\TrackAndTrace\\cucumber-json\\CucumberTestReport.json",

}
)

public class TrackAndTraceTestRunner extends AbstractTestNGCucumberTests {

}
