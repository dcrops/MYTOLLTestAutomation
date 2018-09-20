package bookapickup;

import java.util.Map;

import global.PageBase;
import baseWebdriver.BaseWebdriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manifest.ManifestActions;
import reviewyourpickup.ReviewYourPickupActions;

public class BookAPickupStepDefinitions{


	@When("^User selects Sender$")
	public void user_selects_Sender(DataTable bookAPickupTestData) throws Throwable {
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
		//for (Map<Integer, Integer> bookapickup : bookAPickupTestData.asMaps(Integer.class, Integer.class)) {
			String s=bookAPickup.get("SenderIndex");
			System.out.println("S  "+ s);
			BookAPickupActions.SelectLocation2(Integer.parseInt(s));
		}
	}

	@Then("^User verify Toll Carrier and AcountNumber selected as below$")
	public void user_verify_Toll_Carrier_and_AcountNumber_selected_as_below(DataTable bookAPickupTestData)
			throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			BookAPickupActions.VerifyTollCarrier(bookAPickup.get("TollCarrier"));
		}

	}

	@When("^User select Service as Express$")
	public void user_select_Service_as_Express(DataTable bookAPickupTestData) throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterService(bookAPickup.get("Service"));
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
			//BookAPickupActions.EnterItem(bookapickup.get("ItemDescription"));
			
					
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


	@When("^User selects Dangerous Goods as below$")
	public void user_selects_Dangerous_Goods_as_below(DataTable bookAPickupTestData) throws Throwable {
	
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			 PageBase.MaximumWaitForElementEnabled();
			 PageBase.MaximumWaitForElementEnabled();

			
			BookAPickupActions.SelectDangerousGoods(Integer.parseInt(bookAPickup.get("DgGoods")));
		
		}
	}

	@When("^User selects Contains Food or food packaging$")
	public void user_selects_Contains_Food_or_food_packaging(DataTable arg1) throws Throwable {
		 PageBase.MaximumWaitForElementEnabled();
		 PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.selectContainFoodItem();
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.dangerousGoodNo);
	}

	@When("^User selects Dispatch date as Tommorow$")
	public void user_selects_Dispatch_date_as_Tommorow() throws Throwable {
		
		BookAPickupActions.SelectDispatchDateTomorrow();
		
	    
	}

	@When("^User selects Ready Time$")
	public void user_selects_Ready_Time(DataTable bookAPickupTestData) throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			
			ManifestActions.selectReadyTimeJS(bookAPickup.get("ReadyTime"));
			 PageBase.MaximumWaitForElementEnabled();
		}
	
	
	}

	@When("^User enters Special Instructions as below$")
	public void user_enters_Special_Instructions_as_below(DataTable bookAPickupTestData) throws Throwable {
	   
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			 PageBase.MaximumWaitForElementEnabled();
			 PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
			BookAPickupActions.EnterSpecialInstructions(bookAPickup.get("Special Instructions"));
			
		}
	}

	@When("^User clicks on Review & Book$")
	public void user_clicks_on_Review_Book() throws Throwable {
		BookAPickupActions.ClickReviewBook();
	}

	@Then("^User navigates to Bookings details Review Page$")
	public void user_navigates_to_Bookings_details_Review_Page() throws Throwable {
	  
	}


	
	@When("^User clicks on Confirm Book$")
	public void user_clicks_on_Confirm_Book() throws Throwable {
	   
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		ReviewYourPickupActions.ClickConfirmPickup();
		 PageBase.MaximumWaitForElementEnabled();
		 PageBase.MaximumWaitForElementEnabled();
		 PageBase.MaximumWaitForElementEnabled();
		 PageBase.MaximumWaitForElementEnabled();
	}

	@Then("^User navigates to Pickup confirmed page$")
	public void user_navigates_to_Pickup_confirmed_page() throws Throwable {
	   
		
	}

	
	@When("^User is logout$")
	public void user_is_logout() throws Throwable {
		BaseWebdriver.tearDown();
	}

}
