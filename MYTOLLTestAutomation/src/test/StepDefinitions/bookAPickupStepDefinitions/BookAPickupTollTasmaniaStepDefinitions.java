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

public class BookAPickupTollTasmaniaStepDefinitions{


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
	
	@When("^User is logout$")
	public void user_is_logout() throws Throwable {
		BaseWebdriver.tearDown();
	}

}
