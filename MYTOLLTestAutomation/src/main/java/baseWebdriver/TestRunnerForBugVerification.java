package baseWebdriver;

	
import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/bugVerification/MYT_8628 Users are unable to view certain POD.feature",
        		"src/test/Resources/bugVerification/MYT_6850 Add Ship to mode for Intermodal & Specialised.feature",
        		"src/test/Resources/bugVerification/MYT_6361 Primary Address change verification.feature",
        		"src/test/Resources/bugVerification/MYT_6523 Ready Time and close time check.feature",
        		"src/test/Resources/bugVerification/MYT_7077_UN_number_delete_clear_check.feature"
        		
        }
		, glue= {"bugVerificationStepsDefinitions"}
		, plugin= {"html:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

                "json:C:\\Source\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
}
				
)

public class TestRunnerForBugVerification extends AbstractTestNGCucumberTests    {
//BookAPIckup_TollTasmania_Service_Express.feature
	
}
