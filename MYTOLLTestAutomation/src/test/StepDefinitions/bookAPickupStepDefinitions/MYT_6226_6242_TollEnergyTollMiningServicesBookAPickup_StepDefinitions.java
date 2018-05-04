package bookAPickupStepDefinitions;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import reviewYourPickupActions.ReviewYourPickupActions;

public class MYT_6226_6242_TollEnergyTollMiningServicesBookAPickup_StepDefinitions {

	@Then("^User clicks on Review & Book and User be able to see pickup details entered in Review Your Pickup screen$")
	public void user_clicks_on_Review_Book_and_User_be_able_to_see_pickup_details_entered_in_Review_Your_Pickup_screen(
			DataTable bookAPickupTestData) throws Throwable {
		
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		String company = BookAPickupActions.GetCompany();
		System.out.println(company);
		String location = BookAPickupActions.GetLocation();
		System.out.println(location);
		String locationLine2 = BookAPickupActions.GetLocationAddressLine2();
		System.out.println(locationLine2);
		String senderLocation = location + locationLine2;
		jse.executeScript("scroll(800,1000)");
		BookAPickupActions.ClickReviewBook();
		//BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			String PhoneNumber = "+61-" + bookAPickup.get("Phone number");
			ReviewYourPickupActions.VerifyPickupDetails(bookAPickup.get("TollCarrier"),
					bookAPickup.get("AccountNumber"), company, senderLocation,
					bookAPickup.get("Booked by"), PhoneNumber, bookAPickup.get("Ready time"),
					bookAPickup.get("Location closing time"), bookAPickup.get("Special instructions"));

		}

	}

	@Then("^User be able to see first item details entered in Review Your Pickup screen$")
	public void user_be_able_to_see_first_item_details_entered_in_Review_Your_Pickup_screen(DataTable bookAPickupTestData)
			throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();

			ReviewYourPickupActions.VerifyItemDetails1("0", "ITEM DETAILS", bookAPickup.get("ItemDescription"),
					bookAPickup.get("Destination"), bookAPickup.get("Service"), bookAPickup.get("Mode"),
					bookAPickup.get("ChargeTo"), bookAPickup.get("NoOfItems"), bookAPickup.get("PalletSpaces"),
					bookAPickup.get("Length"), bookAPickup.get("Width"), bookAPickup.get("Height"),
					bookAPickup.get("Volume"), bookAPickup.get("TotalWeight"), bookAPickup.get("DangerousGoods"),
					bookAPickup.get("FoodItem"));

		}

	}

	@Then("^User be able to see dangerous goods details in Review Your Pickup screen$")
	public void user_be_able_to_see_dangerous_goods_details_in_Review_Your_Pickup_screen(DataTable bookAPickupTestData)
			throws Throwable {

		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();

			ReviewYourPickupActions.VerifyDangerousGoodsDetails(bookAPickup.get("DangerousGoodsDetailsHeading"),
					bookAPickup.get("UnNumber"), bookAPickup.get("ClassDivision"),
					bookAPickup.get("PackagingGroup"), bookAPickup.get("SubRisk"),
					bookAPickup.get("ProperShippingName"), bookAPickup.get("DGPackagingDescription"),
					bookAPickup.get("DGPkg"), bookAPickup.get("DGQty"),
					bookAPickup.get("TechnicalName"));

		}

	}

	@Then("^User be able to see second item details entered in Review Your Pickup screen$")
	public void user_be_able_to_see_second_item_details_entered_in_Review_Your_Pickup_screen(DataTable bookAPickupTestData) throws Throwable {
	    
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();

			ReviewYourPickupActions.VerifyItemDetails2("1", "ITEM DETAILS", bookAPickup.get("ItemDescription"),
					bookAPickup.get("Destination"), bookAPickup.get("Service"), bookAPickup.get("Mode"),
					bookAPickup.get("ChargeTo"), bookAPickup.get("NoOfItems"), bookAPickup.get("PalletSpaces"),
					bookAPickup.get("Length"), bookAPickup.get("Width"), bookAPickup.get("Height"),
					bookAPickup.get("Volume"), bookAPickup.get("TotalWeight"), bookAPickup.get("DangerousGoods"),
					bookAPickup.get("FoodItem"));

		}
		
	}
	
	@When("^User presses on Confirm Pickup button$")
	public void user_presses_on_Confirm_Pickup_button() throws Throwable {

		ReviewYourPickupActions.ClickConfirmPickup();
	}

	@Then("^User navigates to \"([^\"]*)\" screen$")
	public void user_navigates_to_screen(String arg1) throws Throwable {
		String reference = ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
		System.out.println("Book A Pickup reference  " + reference);

	}

	@Then("^User can see \"([^\"]*)\" with \"([^\"]*)\"$")
	public void user_can_see_with(String arg1, String arg2) throws Throwable {
		//BookAPickupActions.GetReferenceNumber() ;
	}

	@Then("^User be able to see a message as an email delivered\\.$")
	public void user_be_able_to_see_a_message_as_an_email_delivered(DataTable bookAPickupTestData) throws Throwable {
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			String Message=bookAPickup.get("Msg")+BaseWebdriver.SitUsername1;
			ReviewYourPickupActions.VerifyEmailableMessage(Message);    

		}
	}

	@Then("^User can see email address for an email deliveredpickup confirmation\\.$")
	public void user_can_see_email_address_for_an_email_deliveredpickup_confirmation() throws Throwable {

		ReviewYourPickupActions.VerifyEmailAddress(BaseWebdriver.SitUsername1);
	}
}
