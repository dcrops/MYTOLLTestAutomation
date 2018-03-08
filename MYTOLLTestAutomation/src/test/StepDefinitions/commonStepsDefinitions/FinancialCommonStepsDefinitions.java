package commonStepsDefinitions;

import FinanceActions.FinanceActions;
import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import cucumber.api.java.en.Given;
import myTollHomePageActions.MyTollHomePageActions;

public class FinancialCommonStepsDefinitions {
	
	@Given("^User is Registered in MyToll$")
	public void user_is_Registered_in_MyToll() throws Throwable {
	  
		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
				
	}
	
	@Given("^User is Registered in MyToll and user has full financial access$")
	public void user_is_Registered_in_MyToll_and_user_has_full_financial_access() throws Throwable {
		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		FinanceActions.ClickFinance();		
		
		
	}

}
