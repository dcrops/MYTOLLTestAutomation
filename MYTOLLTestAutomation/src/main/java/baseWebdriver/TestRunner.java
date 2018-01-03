package baseWebdriver;

import java.io.File;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;
 


@CucumberOptions( strict=true
        ,features = { "src/test/Resources/bookAPickupFeatures/"}
		, glue= {""}
		, plugin= {"html:C:\\Source2\\Source21122017\\MYTOLLTestAutomation\\Reports\\cucumber-pretty",

                "json:C:\\Source2\\Source21122017\\MYTOLLTestAutomation\\Reports\\cucumber-json\\CucumberTestReport.json",
				
}
				
)

public class TestRunner extends AbstractTestNGCucumberTests    {

	
}
