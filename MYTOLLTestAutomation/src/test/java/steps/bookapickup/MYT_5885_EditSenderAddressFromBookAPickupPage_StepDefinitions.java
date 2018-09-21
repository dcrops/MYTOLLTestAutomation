package steps.bookapickup;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import bookapickup.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYT_5885_EditSenderAddressFromBookAPickupPage_StepDefinitions {
	
	
	@When("^User Press Edit Sender button$")
	public void user_Press_Edit_button() throws Throwable {
		
		BookAPickupActions.ClickEditSenderAddress();
	   
	}

	@When("^User Press Edit Receiver button$")
	public void user_Press_Edit_Receiver_button() throws Throwable {

		BookAPickupActions.ClickEditReceiverAddress();

	}

	@Then("^User be able to EDIT the address using Edit button$")
	public void user_be_able_to_EDIT_the_address_using_Edit_button(DataTable bookAPickupTestData) throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
		assertEquals(BookAPickupActions.GetEditAddressScreenHeading(),bookAPickup.get("Heading"));
		
		}
	}

	@Then("^User Edit the address entering new address details$")
	public void user_Edit_the_address_entering_new_address_details(DataTable bookAPickupTestData) throws Throwable {
	
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			BookAPickupActions.EditAddressDetails(bookAPickup.get("CompanyName"), bookAPickup.get("Name"),bookAPickup.get("Email"), bookAPickup.get("PhoneNumber"),bookAPickup.get("AddressLine1"), bookAPickup.get("AddressLine2"));
			
			}
	}


	@Then("^User Delete the email address$")
	public void user_Delete_the_email_address() throws Throwable {
	   
	}

	@When("^User Press Save$")
	public void user_Press_Save() throws Throwable {
		BookAPickupActions.SaveEditSenderAddress();
	}

	@Then("^Message displays as Address is saved$")
	public void message_displays_as_Address_is_saved(DataTable bookAPickupTestData) throws Throwable {
		for (Map<String, String> bookAPickup: bookAPickupTestData.asMaps(String.class, String.class)) {
			assertEquals(BookAPickupActions.GetEditAddressSavedMessageText(), bookAPickup.get("Message"));
		}
		BookAPickupActions.CloseSaveMsgEditSenderAddress();
	}

	@When("^user enter email address$")
	public void user_enter_email_address(DataTable bookAPickupTestData) throws Throwable {

	}

	@When("^User can see a text as edit their full address via the My profile section$")
	public void user_can_see_a_text_as_edit_their_full_address_via_the_My_profile_section(DataTable bookAPickupTestData) throws Throwable {
	
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			assertEquals(BookAPickupActions.GetEditAddressFullAddressText(), bookAPickup.get("TextEditFullAddress"));
			
			}
		
	}

	@Then("^Message displays as Address able to saved$")
	public void message_displays_as_Address_able_to_saved(DataTable bookAPickupTestData) throws Throwable {
	   

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			assertEquals(BookAPickupActions.GetEditAddressSavedMessageText(), bookAPickup.get("Message"));
			BookAPickupActions.CloseSaveMsgEditSenderAddress();
			
			}
	}

	@Then("^User able to see modified address in MY Contacts in My Profile$")
	public void user_able_to_see_modified_address_in_MY_Contacts_in_My_Profile(DataTable bookAPickupTestData) throws Throwable {
	 

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			BookAPickupActions.verfiyEditAddress(bookAPickup.get("CompanyName"),bookAPickup.get("AddressLine1"), bookAPickup.get("Name"), bookAPickup.get("CountryCode"),bookAPickup.get("PhoneNumber"),bookAPickup.get("Email"));
			BookAPickupActions.DeleteBtnMyContactAddress();
			}
		
		
	}
}
