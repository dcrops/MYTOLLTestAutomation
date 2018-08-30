package bugVerificationStepsDefinitions;

import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.gargoylesoftware.htmlunit.Page;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manifestActions.ManifestActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class MYT_6523_ready_time_and_close_time_check{
	@Given("^User is Registered in MyToll and is on Book a Picup Page$")
	public void user_is_Registered_in_MyToll_and_is_on_Book_a_Picup_Page() throws Throwable {
		
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		PageBase.MaximumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();		
	}

	@When("^User selects Toll Carrier and an Account Number$")
	public void user_selects_Toll_Carrier_and_an_Account_Number(DataTable bookAPickupTestData) throws Throwable {
	  
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterTollCarrier(bookAPickup.get("TollCarrier"));
			BookAPickupActions.EnterAccountNumber(bookAPickup.get("AccountNumber"));
		}

	}

	@When("^User selects an existing Sender address from the Sender field$")
	public void user_selects_an_existing_Sender_address_from_the_Sender_field(DataTable bookAPickupTestData) throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			// Add Address
			BookAPickupActions.EnterLocation(bookAPickup.get("Sender"));
		}
	}

	@When("^User enter following input data to Add Item$")
	public void user_enter_following_input_data_to_Add_Item(DataTable bookAPickupTestData) throws Throwable {
	for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.setQEMNo();
			BookAPickupActions.EnterService(bookAPickup.get("Service"));
			BookAPickupActions.EnterQuantity(bookAPickup.get("NoOfItems"));
			BookAPickupActions.EnterItem(bookAPickup.get("ItemDescription"));
			BookAPickupActions.EnterPalletSpace(bookAPickup.get("PalletSpace"));
			BookAPickupActions.SelectDestination(bookAPickup.get("Destination"));
			BookAPickupActions.VerifyDestination(bookAPickup.get("Destination")); 
			//BookAPickupActions.EnterItem(bookAPickup.get("ItemDescription"));
			
					
		}
		
	}

	@When("^User Selects Charge to Account as below$")
	public void user_Selects_Charge_to_Account_as_below(DataTable bookAPickupTestData) throws Throwable {
	    
	for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			String chargeToAccount = BookAPickupActions.SelectChargeToAccount2(Integer.parseInt(bookAPickup.get("ChargeToAccount")));
			
		}
	}

	@When("^User enter following details$")
	public void user_enter_following_details(DataTable bookAPickupTestData) throws Throwable {
	
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			 PageBase.MaximumWaitForElementEnabled();
			 PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.EnterLengthWidthHeightVolumeWeight(bookAPickup.get("Length"), bookAPickup.get("Width"),
					bookAPickup.get("Height"), bookAPickup.get("Weight"));
		}
		
	}

	@When("^User selects Contains Food or food packaging$")
	public void user_selects_Contains_Food_or_food_packaging(DataTable arg1) throws Throwable {
		
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.selectContainFoodItem();
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.dangerousGoodNo);
		
	}

	@When("^User selects Dangerous Goods as below$")
	public void user_selects_Dangerous_Goods_as_below(DataTable bookAPickupTestData) throws Throwable {
	   
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			 PageBase.MaximumWaitForElementEnabled();
			 PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.SelectDangerousGoods(Integer.parseInt(bookAPickup.get("DgGoods")));
		
		}
	}

	@When("^User selects Dispatch date as Today$")
	public void user_selects_Dispatch_date_as_Today() throws Throwable {
	PageBase.FindElement(BookAPickupActions.pickupDate).click();
		
	}

	@When("^User selects Ready Time$")
	public void user_selects_Ready_Time(DataTable bookAPickupTestData) throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			
			ManifestActions.selectReadyTimeJS(bookAPickup.get("ReadyTime"));
			 PageBase.MaximumWaitForElementEnabled();
		}
		
	}
	
	@When("^User selects Closing Time$")
	public void user_selects_Closing_Time(DataTable bookAPickupTestData) throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			
			ManifestActions.selectClosingTimeJS(bookAPickup.get("ClosingTime"));
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(BookAPickupActions.specialInstructions).click();
		}
	}

	
	@When("^User clicks on Review & Book$")
	public void user_clicks_on_Review_Book() throws Throwable {
		BaseWebdriver.driver.findElement(BookAPickupActions.specialInstructions).click();
		BookAPickupActions.ClickReviewBook();		
	}

	@Then("^error message is displayed$")
	public void error_message_is_displayed() throws Throwable {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.readyTimeErrorMsg, "Ready time should be before closing time");
	}
}