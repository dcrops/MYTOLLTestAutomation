package bugVerificationStepsDefinitions;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myAdminActions.MyAdminActions;
import myTollHomePageActions.MyTollHomePageActions;

public class MYT_6200_BU_Admin_Cannot_View_MyAdmin_Menu 
{
	@Given("^User has logged in and is on the Home page$")
	public void user_has_logged_in_and_is_on_the_Home_page() throws Exception 
	{
	   BaseWebdriver.setUp(); 
	   MyTollHomePageActions.Login(BaseWebdriver.AdminUser, BaseWebdriver.AdminPassword);
	}

	@When("^User clicks on Hamburger menu$")
	public void user_clicks_on_Hamburger_menu() 
	{
	   PageBase.click(MyTollHomePageActions.HmbugerMenu, 10);
	}

	@Then("^User can see and click on the My Admin menu option$")
	public void user_can_see_and_click_on_the_My_Admin_menu_option() 
	{
	   PageBase.click(MyTollHomePageActions.MyAdminMenu, 10);
	   MyAdminActions.VerifyUserSettingsPageLoaded();
	}

}
