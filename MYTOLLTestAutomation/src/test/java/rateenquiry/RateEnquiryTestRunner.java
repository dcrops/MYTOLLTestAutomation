package rateEnquiry;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( strict=true
/*,features = {"src/test/Resources/rateEnquiryFeatures/MYT_6157_TollEnergyRateEnquiryTest.feature", "src/test/Resources/rateEnquiryFeatures/MYT_6235_TollMiningServiceRateEnquiryTest.feature",
		   "src/test/Resources/rateEnquiryFeatures/MYT_1692_RateEnquiry_RateWithinAShipment.feature", "src/test/Resources/rateEnquiryFeatures/MYT_5499_RateEnquiry_AddressBook.feature"}
*/
,features = {"src/test/Resources/rateEnquiryFeatures/MYT_6157_TollEnergyRateEnquiryTest.feature", 
		"src/test/Resources/rateEnquiryFeatures/MYT_6235_TollMiningServiceRateEnquiryTest.feature",
		   "src/test/Resources/rateEnquiryFeatures/MYT_1692_RateEnquiry_RateWithinAShipment.feature", 
		  "src/test/Resources/rateEnquiryFeatures/MYT_5499_RateEnquiry_AddressBook.feature"
		}
//,tags = {"@Shakeout"}
,glue= {"commonStepsDefinitions", "rateEnquiryStepDefinitions", "createShipmentStepDefinitions"}
	, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\RateEnquiry\\cucumber-pretty",

    "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\RateEnquiry\\cucumber-json\\CucumberTestReport.json",
	
}
	
)

public class RateEnquiryTestRunner extends AbstractTestNGCucumberTests{

}

