package commonStepsDefinitions;

import java.util.Map;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;

public class BookAPIckupCommonStepsDefinitions {

	@Given("^User is Registered in MyToll and is on Book a pickup page$")
	public void user_is_Registered_in_MyToll_and_is_on_Book_a_pickup_page() throws Throwable {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		MyTollHomePageActions.LaunchMyToll("https://ps.mytoll.com/");
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}

	@When("^User selects Toll Carrier as Toll Intermodal Specialised  and Account Number$")
	public void user_selects_Toll_Carrier_as_Toll_Intermodal_Specialised_and_Account_Number(
			DataTable bookAPickupTestData) throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.SelectIntermodalSpecializedCarrier(bookAPickup.get("TollCarrier"));
			BookAPickupActions.EnterAccountNumber(bookAPickup.get("AccountNumber"));
		}
	}

	@When("^User selects Toll Carrier and Account Number$")
	public void user_selects_Toll_Carrier_and_Account_Number(DataTable bookAPickupTestData) throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterTollCarrier(bookAPickup.get("TollCarrier"));
			BookAPickupActions.EnterAccountNumber(bookAPickup.get("AccountNumber"));

		}

	}

	@When("^User selects Toll Carrier as TollTasmania and select Account Number$")
	public void user_selects_Toll_Carrier_as_TollTasmania_and_select_Account_Number(DataTable bookAPickupTestData)
			throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterTollCarrier(bookAPickup.get("TollCarrier"));
		}

	}

	@When("^User add Address for the sender in TDF$")
	public void user_add_Address_for_the_sender_in_TDF(DataTable bookAPickupTestData) throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			// Add Address
			BookAPickupActions.AddAddressManuallyTDF(bookAPickup.get("CompanyName"), bookAPickup.get("AddressLine1"),
					bookAPickup.get("AddressLine2"), bookAPickup.get("Suburb"), bookAPickup.get("SuburbItem"),
					bookAPickup.get("State"), bookAPickup.get("Postcode"));
			BookAPickupActions.ClickAddAddress();

		}

	}

	@When("^User selects a existing Sender address from the Sender field$")
	public void user_selects_a_existing_Sender_address_from_the_Sender_field(DataTable bookAPickupTestData)
			throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			// Add Address
			BookAPickupActions.EnterLocation(bookAPickup.get("Sender"));
		}
	}

	@When("^User add Address for the sender in TGX$")
	public void user_add_Address_for_the_sender_in_TGX(DataTable bookAPickupTestData) throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			// Add Address Prio Aus

			BookAPickupActions.AddAddressManuallyPrioAUS(bookAPickup.get("CompanyName"), bookAPickup.get("Country"),
					bookAPickup.get("AddressLine1"), bookAPickup.get("AddressLine2"), bookAPickup.get("Suburb"),
					bookAPickup.get("Postcode"), bookAPickup.get("Email"), bookAPickup.get("PhoneNumber"),
					bookAPickup.get("Phone Country"));

		}

	}

	@When("^User add Address for the sender$")
	public void user_add_Address_for_the_sender(DataTable bookAPickupTestData) throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			// Add Address Prio Aus

			BookAPickupActions.EnterLocation(bookAPickup.get("Sender"));
		}

	}

	@When("^User selects NO I am located at the pick up location option$")
	public void user_selects_NO_I_am_located_at_the_pick_up_location_option() throws Throwable {

		BookAPickupActions.SelectPickupLocation();
	}

	@When("^User be able to add Suburb with string max (\\d+) and Postcode with (\\d+) Strings for Sender Address$")
	public void user_be_able_to_add_Suburb_with_string_max_and_Postcode_with_Strings_for_Sender_Address(int suburbMax,
			int postcaodeMax, DataTable bookAPickupTestData) throws Throwable {
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			BookAPickupActions.UpdateSuburbPostcodeAddAddress(bookAPickup.get("CompanyName"), bookAPickup.get("Suburb"),bookAPickup.get("Postcode"));
			BookAPickupActions.CloseAddAddressScreen();
		}

	}

	@When("^User be able to add Suburb and Postcode for Sender Address$")
	public void user_be_able_to_add_Suburb_and_Postcode_for_Sender_Address(DataTable bookAPickupTestData) throws Throwable {
	 					
			for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
				
				BookAPickupActions.AddAddressManuallyTDF(bookAPickup.get("CompanyName"), bookAPickup.get("AddressLine1"),
						bookAPickup.get("AddressLine2"), bookAPickup.get("Suburb"), bookAPickup.get("SuburbItem"),
						bookAPickup.get("State"), bookAPickup.get("Postcode"));
				BookAPickupActions.ClickAddAddress();
				
			}
			
		
	}
	
	@When("^User be able to add ContactEmail with string max (\\d+) and characters a(\\d+)@\\. for Sender Address$")
	public void user_be_able_to_add_ContactEmail_with_string_max_and_characters_a_for_Sender_Address(int arg1, int arg2, DataTable bookAPickupTestData) throws Throwable {
	   
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			BookAPickupActions.UpdateAddAddressManuallyPrioEmail(bookAPickup.get("CompanyName"), bookAPickup.get("Country"),
					bookAPickup.get("AddressLine1"), bookAPickup.get("AddressLine2"), bookAPickup.get("Suburb"),
					bookAPickup.get("Postcode"), bookAPickup.get("Email"));
			BookAPickupActions.CloseEditAddressScreen();
		}
	}
	
	

}
