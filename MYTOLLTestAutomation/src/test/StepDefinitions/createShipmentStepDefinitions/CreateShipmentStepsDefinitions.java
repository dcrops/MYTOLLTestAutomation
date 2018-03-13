package createShipmentStepDefinitions;

import java.util.Map;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;

public class CreateShipmentStepsDefinitions  {


	@When("^User enters following input data for the line item$")
	public void user_enters_following_input_data_for_the_line_item(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.EnterItem(shipment.get("Item description"));
			CreateShipmentActions.EnterBillingType(shipment.get("Billing Type"));
			CreateShipmentActions.NumberOfItem(shipment.get("No of Items"));
			//CreateShipmentActions.ItemType(2);
			BookAPickupActions.EnterLengthWidthHeight(shipment.get("Length"), shipment.get("Width"),
					shipment.get("Height"));
			CreateShipmentActions.EnterWeight(shipment.get("Weight"));
			PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

			CreateShipmentActions.EnterSenderReference(shipment.get("SenderReference"),
					shipment.get("ReceiverReference"));

		}

	}

	@When("^User selects Dangerous Goods$")
	public void user_selects_Dangerous_Goods(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			String s = shipment.get("DgGoods");
			System.out.println("S4  " + s);
			BookAPickupActions.SelectDangerousGoods(Integer.parseInt(s));
		}
	}

	@When("^User enters additional information as below$")
	public void user_enters_additional_information_as_below(DataTable shipmentTestData) throws Throwable {
		
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			CreateShipmentActions.EnterPurchaseOrder(shipment.get("PurchaseOrder"));
			CreateShipmentActions.SelectFoodPackagingYes();
			CreateShipmentActions.EnterTollExtraServiceAmount(shipment.get("TotalExtraAmount"));

			BookAPickupActions.EnterSpecialInstructions(shipment.get("SpecialInstructions"));
		}

	}

	@When("^User clicks on 'Create Shipment'$")
	public void user_clicks_on_Create_Shipment() throws Throwable {
		CreateShipmentActions.ClickReviewCreateShipment();
	}

}
