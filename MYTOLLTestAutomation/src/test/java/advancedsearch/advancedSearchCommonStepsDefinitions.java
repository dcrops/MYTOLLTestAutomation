package advancedsearch;

import global.PageBase;
import basewebdriver.BaseWebdriver;
import cucumber.api.java.en.Given;
import mytollhomepage.MyTollHomePageActions;

public class advancedSearchCommonStepsDefinitions {

	@Given("^User is on the Advance Search Page$")
	public void User_is_Registered_in_MyToll_and_is_on_AdvanceSearch_page() throws Throwable {

		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickAdvanceSearchTab();
		PageBase.MaximumWaitForElementEnabled_1();
		//Test
	}
	
	
	
	
	
}
