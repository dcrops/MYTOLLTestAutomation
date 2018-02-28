package bookAPickupStepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import GlobalActions.PageBase;
import bookAPickupActions.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYT_622_BAPShareMyBookAPickup_StepDefinitions {



	@Then("^User navigates to Pickup confirmation page and see Print and Share options$")
	public void user_navigates_to_Pickup_confirmation_page_and_see_Print_and_Share_options() throws Throwable {
	
		
	}

	@When("^User selects on share option$")
	public void user_selects_on_share_option() throws Throwable {
		BookAPickupActions.ClickShareInPickupBookedScreen();
	    
	}

	@Then("^User can send email to (\\d+) users with the booking content$")
	public void user_can_send_email_to_users_with_the_booking_content(int arg1, DataTable bookAPickupTestData) throws Throwable {
	 
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			// Add Address
			 PageBase.MaximumWaitForElementEnabled();
			 PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.EnterEmail1(bookAPickup.get("User1"));
			 PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.ClickAddMoreEmailButton();
			BookAPickupActions.EnterEmail2(bookAPickup.get("User2"));
			 PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.ClickAddMoreEmailButton();
			BookAPickupActions.EnterEmail3(bookAPickup.get("User3"));
			 PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.ClickAddMoreEmailButton();
			BookAPickupActions.EnterEmail4(bookAPickup.get("User4"));
			 PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.ClickAddMoreEmailButton();
			BookAPickupActions.EnterEmail5(bookAPickup.get("User5"));
			 PageBase.MaximumWaitForElementEnabled();
			assertEquals(BookAPickupActions.GetShareScreenMessage(), bookAPickup.get("Message"));
			BookAPickupActions.EnterMessage(bookAPickup.get("MessagetoSend"));
			 PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.ClickShareInShareScreen();
			 PageBase.MaximumWaitForElementEnabled();
			 PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.ClickMyPickupsInShareScreen();
		}
		
		}
		
	
		@When("^User enter Total Weight$")
		public void user_enter_Total_Weight(DataTable bookAPickupTestData) throws Throwable {
		 
			for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
	              
				 PageBase.MaximumWaitForElementEnabled();
				
				BookAPickupActions.EnterWeight(bookAPickup.get("TotalWeight"));
			
			}
		}

	
}
