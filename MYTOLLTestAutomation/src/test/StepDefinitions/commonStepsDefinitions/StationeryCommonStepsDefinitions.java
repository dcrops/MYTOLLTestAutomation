package commonStepsDefinitions;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;
import stationeryActions.StationeryActions;

public class StationeryCommonStepsDefinitions {
	

	@Given("^MyToll Toll Priority AU User logged in and has a Toll Priority AU Standard / Full Financial account and Stationery function is enabled$")
	public void mytoll_Toll_Priority_AU_User_logged_in_and_has_a_Toll_Priority_AU_Standard_Full_Financial_account_and_Stationery_function_is_enabled() throws Throwable {
	  
		//BaseWebdriver.SetUp("firefox");
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		PageBase.MaximumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickStationery();
	}
	
	@When("^User clicks on the mega menu$")
	public void user_clicks_on_the_mega_menu() throws Throwable {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.WaitForElement(MyTollHomePageActions.HmbugerMenu,30);
		MyTollHomePageActions.ClickMenu();
		
	}
	
	@Then("^User selects Order Stationery$")
	public void user_selects_Order_Stationery() throws Throwable {
		
		MyTollHomePageActions.GetOrderMyStationery();
	}

}
