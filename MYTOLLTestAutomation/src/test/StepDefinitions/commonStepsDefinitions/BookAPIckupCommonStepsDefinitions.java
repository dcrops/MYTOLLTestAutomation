package commonStepsDefinitions;

import java.util.Map;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;

public class BookAPIckupCommonStepsDefinitions {

	@Given("^User is Registered in MyToll and is on Book a pickup page$")
	public void user_is_Registered_in_MyToll_and_is_on_Book_a_pickup_page() throws Throwable {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}
	
	
	@When("^User selects Toll Carrier as TollTasmania and select Account Number$")
	public void user_selects_Toll_Carrier_as_TollTasmania_and_select_Account_Number(DataTable bookAPickupTestData)
			throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterTollCarrier(bookAPickup.get("TollCarrier"));

			//bookAPickupActions.BookAPickupActions.SelectAccountNumberUsingKeyboard();
		}

	}

}
