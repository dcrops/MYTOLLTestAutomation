package baseWebdriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
	,features = { "src/test/Resources/financialFeatures/MYT_2698_Select Financials.feature" ,
			"src/test/Resources/financialFeatures/MYT_2699_Select my Carrier and Account.Feature" ,
			"src/test/Resources/financialFeatures/MYT_2700_View and access my Account Summary.feature" , 
			"src/test/Resources/financialFeatures/MYT_3765_Expanding the charges for an invoice.feature" ,
			"src/test/Resources/financialFeatures/MYT_3766_Expanding the Payment Adjustment for an invoice.feature", 
			"src/test/Resources/financialFeatures/MYT_6297_Toll Energy Financials.feature", 
			"src/test/Resources/financialFeatures/MYT_6298_Toll Mining Services Financials.feature"}
	//,features = {"src/test/Resources/financialFeatures/MYT_2700_View and access my Account Summary.feature" }
 //,tags = {"@Shakeout"}
	,glue= {"commonStepsDefinitions","financialsStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\Finance\\cucumber-pretty",

"json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\Finance\\CucumberTestReport.json",

}

)

public class FinancialTestRunner extends AbstractTestNGCucumberTests {

}
