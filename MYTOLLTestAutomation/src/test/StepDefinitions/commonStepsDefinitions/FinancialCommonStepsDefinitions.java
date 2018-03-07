package commonStepsDefinitions;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import cucumber.api.java.en.Given;
import myTollHomePageActions.MyTollHomePageActions;

public class FinancialCommonStepsDefinitions {
	
	@Given("^User is Registered in MyToll$")
	public void user_is_Registered_in_MyToll() throws Throwable {
	  
		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		
	}

}
