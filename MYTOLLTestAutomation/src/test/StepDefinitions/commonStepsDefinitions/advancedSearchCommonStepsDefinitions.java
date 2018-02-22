package commonStepsDefinitions;

import java.util.Map;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class advancedSearchCommonStepsDefinitions {

	@Given("^User is on the Advance Search Page$")
	public void User_is_Registered_in_MyToll_and_is_on_AdvanceSearch_page() throws Throwable {

		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickAdvanceSearchTab();
	}
	
	
	
	
	
}
