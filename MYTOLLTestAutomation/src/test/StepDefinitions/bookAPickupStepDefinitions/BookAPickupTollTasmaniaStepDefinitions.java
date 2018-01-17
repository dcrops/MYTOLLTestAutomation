package bookAPickupStepDefinitions;

import java.util.Map;

import org.testng.annotations.BeforeClass;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;

public class BookAPickupTollTasmaniaStepDefinitions {

	@Given("^User is Registered in MyToll and is on Book a pickup page$")
	public void user_is_Registered_in_MyToll_and_is_on_Book_a_pickup_page() throws Throwable {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}

	@When("^User selects Toll Carrier as TollTasmania and select Account Number$")
	public void user_selects_Toll_Carrier_as_TollTasmania_and_select_Account_Number(DataTable bookAPickupTestData)
			throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterTollCarrier(bookAPickup.get("TollCarrier"));

			bookAPickupActions.BookAPickupActions.SelectAccountNumberUsingKeyboard();
		}

	}

	@When("^User selects Sender$")
	public void user_selects_Sender(DataTable bookAPickupTestData) throws Throwable {
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
		//for (Map<Integer, Integer> bookAPickup : bookAPickupTestData.asMaps(Integer.class, Integer.class)) {
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
			BookAPickupActions.EnterItem(bookAPickup.get("ItemDescription"));
			BookAPickupActions.EnterQuantity(bookAPickup.get("NoOfItems"));
			BookAPickupActions.EnterPalletSpace(bookAPickup.get("PalletSpace"));
			BookAPickupActions.EnterLengthWidthHeightVolumeWeight(bookAPickup.get("Length"), bookAPickup.get("Width"),
					bookAPickup.get("Height"), bookAPickup.get("Weight"));
		}

	}

}
