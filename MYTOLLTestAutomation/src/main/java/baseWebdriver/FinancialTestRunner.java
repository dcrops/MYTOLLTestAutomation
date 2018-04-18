package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/financialFeatures/ABC.feature"}
	,glue= {"commonStepsDefinitions","financialStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Finance\\cucumber-pretty",

"json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\Finance\\CucumberTestReport.json",

}

)

public class FinancialTestRunner extends AbstractTestNGCucumberTests {

}
