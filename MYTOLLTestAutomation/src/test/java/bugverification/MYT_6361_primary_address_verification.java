package bugVerification.stepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;

import Global.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickup.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePage.MyTollHomePageActions;
public class MYT_6361_primary_address_verification
{

@Given("^User is Registered in MyToll and is on ABOUT ME page$")
public void user_is_Registered_in_MyToll_and_is_on_ABOUT_ME_page() throws Throwable {
   
	BaseWebdriver.setUp();
	MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
 	PageBase.MaximumWaitForElementEnabled();
 	MyTollHomePageActions.ClickMenu();
 	PageBase.click(MyTollHomePageActions.aboutMeMenu, 2);
 	   
}

@When("^user changes the address and clicks SAVE$")
public void user_changes_the_address_and_clicks_SAVE(DataTable addressNew) throws Throwable {
	PageBase.FindElement(MyTollHomePageActions.addressTextbox).clear();	
	for (Map < String, String>addressUpdated: addressNew.asMaps(String.class, String.class)) {
		PageBase.sendText(MyTollHomePageActions.addressTextbox, 2, addressUpdated.get("Address"));
	}   
	PageBase.click(By.xpath("//*[@id=\"addressSection\"]/div/div/ul"), 2);

	PageBase.click(MyTollHomePageActions.aboutMeSaveButton, 2);
	PageBase.MaximumWaitForElementEnabled();
	PageBase.MaximumWaitForElementEnabled();

}

@Then("^SUCCESS msg pops up$")
public void success_msg_pops_up() throws Throwable {
	PageBase.MaximumWaitForElementEnabled();
	PageBase.MaximumWaitForElementEnabled();
	PageBase.verifyTextExist(MyTollHomePageActions.aboutMeSavePopup, "Your profile has been successfully updated.");
}

@When("^user closes the msg and goes to book a pickup$")
public void user_closes_the_msg_and_goes_to_book_a_pickup() throws Throwable {
	PageBase.click(MyTollHomePageActions.aboutMeSavePopupClose, 2);
	PageBase.MaximumWaitForElementEnabled();
	MyTollHomePageActions.ClickMenu();
	PageBase.MaximumWaitForElementEnabled();
	MyTollHomePageActions.ClickBookAPIckupMenu();
	PageBase.MaximumWaitForElementEnabled();

}
@When("^enters the pickup details$")
public void enters_the_pickup_details() throws Throwable {

	PageBase.click(BookAPickupActions.TollCarrierDropdown, 2);
	PageBase.click(By.xpath("//*[@id=\"BU-selector\"]/div/ul/li[1]/div"), 2);
	
	PageBase.click(BookAPickupActions.AccountNumberDropdown, 2);
	PageBase.click(By.xpath("//*[@id=\"account-selector\"]/div/ul/li[1]"), 2);
}

@Then("^the updated address is available under the Sender section$")
public void the_updated_address_is_available_under_the_Sender_section() throws Throwable {
	PageBase.MaximumWaitForElementEnabled();
	PageBase.verifyTextExist(By.xpath("//*[@id=\"location-selector\"]/div[1]/div[3]"), "13 Hewat Dr");
	PageBase.verifyTextExist(By.xpath("//*[@id=\"location-selector\"]/div[1]/div[4]"), "HIGHTON VIC 3216 AU");
	
}


@When("^user goes back to ABOUT ME page and edits the address and saves it$")
public void user_goes_back_to_ABOUT_ME_page_and_edits_the_address_and_saves_it(DataTable addressNew) throws Throwable {
 	MyTollHomePageActions.ClickMenu();
 	PageBase.click(MyTollHomePageActions.aboutMeMenu, 2);
	PageBase.FindElement(MyTollHomePageActions.addressTextbox).clear();	
	for (Map < String, String>addressUpdated2: addressNew.asMaps(String.class, String.class)) {
		PageBase.sendText(MyTollHomePageActions.addressTextbox, 2, addressUpdated2.get("Address"));
	}   
	PageBase.click(By.xpath("//*[@id=\"addressSection\"]/div/div/ul"), 2);
	PageBase.MaximumWaitForElementEnabled();
	PageBase.click(MyTollHomePageActions.aboutMeSaveButton, 2);
	PageBase.MaximumWaitForElementEnabled();
	PageBase.click(MyTollHomePageActions.aboutMeSavePopupClose, 2);
	
}

@Then("^another success msg pops up$")
public void another_success_msg_pops_up() throws Throwable {
System.out.println("line 95");
}
}
