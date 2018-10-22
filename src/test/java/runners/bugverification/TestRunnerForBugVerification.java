package runners.bugverification;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;
 


@CucumberOptions( strict=true


        ,features = {"src/test/Resources/bugverification/MYT_9043_Save_template_Minimal_info.feature",
        "src/test/Resources/bugverification/MYT_550_checking_references_with_spaces_can_be_searched.feature",
        "src/test/Resources/bugverification/MYT_6850 Add Ship to mode for Intermodal & Specialised.feature",
        "src/test/Resources/bugverification/MYT_6361 Primary Address change verification.feature",
        "src/test/Resources/bugverification/MYT_6523 Ready Time and close time check.feature",
		"src/test/Resources/bugverification/MYT_7077_UN_number_delete_clear_check.feature",

/////////////////// retested upto here///////////////////////////
         		"src/test/Resources/bugverification/MYT_6200 BU Admin User cannot see the My Admin Menu.feature" ,
//         		"src/test/Resources/bugverification/MYT_6126_Rate_enquiry_disclaimer_content.feature",
         		"src/test/Resources/bugverification/MYT_9027_Grammar_error_on_the_My_Returns_page.feature",
        		"src/test/Resources/bugverification/MYT_8887Shipment_International_Domestic_Addresses.feature",
         		"src/test/Resources/bugverification/MYT_8628 Users are unable to view certain POD.feature",
				"src/test/Resources/bugverification/MYT_9205_Toll_Energy_default_payer_to_be_third_party.feature",
				"src/test/Resources/bugverification/MYT_8826_Weights_Change_to_zero_at_print_and_close.feature",
				"src/test/Resources/bugverification/MYT_9154_phone_number_returns.feature",
				"src/test/Resources/bugverification/MYT_8815_Total_Cubic_Volume_incorrect_in_my_templates.feature",
				"src/test/Resources/bugverification/MYT_9000_Oops_error_when_creating_shipment_with_decimal_DG.feature"
		,"src/test/Resources/bugverification/MYT_8447_error messages are displayed even when filled in.feature",
		"src/test/Resources/bugverification/MYT_9022_Spelling_Error_in_the_account_already_exists_message.feature"

        		}
		, glue= {"steps"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
}
				
)

public class TestRunnerForBugVerification extends AbstractTestNGCucumberTests    {
//BookAPIckup_TollTasmania_Service_Express.feature
	
}
