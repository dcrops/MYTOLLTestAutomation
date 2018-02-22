package commonStepsDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.testng.Reporter;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class CreateShipmentCommonStepsDefinitions {
	
	@Given("^User is Registered in MyToll and is on Shipment page$")
	public void user_is_Registered_in_MyToll_and_is_on_Shipment_page() throws Throwable {

		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@When("^User selects Toll Carrier and select Service$")
	public void user_selects_Toll_Carrier_and_select_Service(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			if(shipment.get("TollCarrier").contains("Intermodal")) {
				BookAPickupActions.SelectIntermodalSpecializedCarrier(shipment.get("TollCarrier"));
			}
			else {
				BookAPickupActions.EnterTollCarrier(shipment.get("TollCarrier"));
			}
			CreateShipmentActions.EnterService(shipment.get("Service"));

		}
	}

	@When("^User enters shipment overview details as below to create a shipment$")
	public void user_enters_shipment_overview_details_as_below_to_create_a_shipment(DataTable shipmentTestData)
			throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
			String s = shipment.get("Whopays");
			System.out.println("S  " + s);
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			CreateShipmentActions.EnterQuoteNumber(shipment.get("QuoteNumber"));
			String s2 = shipment.get("Mode");
			System.out.println("S2  " + s2);
			CreateShipmentActions.SelectMode(Integer.parseInt(s2));
			PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
			String s3 = shipment.get("Sender");
			System.out.println("S3  " + s3);
			CreateShipmentActions.SelectSender(Integer.parseInt(s3));
			String s4 = shipment.get("Receiver");
			System.out.println("S4  " + s4);
			CreateShipmentActions.SelectReceiver(Integer.parseInt(s4));

			CreateShipmentActions.SelectShipmentConsolidationContinue();

			PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
					CreateShipmentActions.notifyReceiverCheckBox);
			// CreateShipmentActions.EnterSenderEmail(SenderEmail);
			CreateShipmentActions.EnterReceiverEmail(shipment.get("ReceiverEmail"));
			CreateShipmentActions.EnterDropOffDepot(shipment.get("DropOffDepot"));
			CreateShipmentActions.EnterCollectionDepot(shipment.get("CollectionDepot"));

			PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
			CreateShipmentActions.EnterShipmentReferences(shipment.get("ShipmentRef1"), shipment.get("ShipmentRef2"));
		}
	}
	
	@And("^User cannot edit any Shipment feilds$")
	public void UserCannotEditAnyShipmentFeilds() throws Throwable {
	
		try {		
			PageBase.click(CreateShipmentActions.addNewLine, 5);
			Reporter.log("Able to Modify Shipment Details - NOT AS EXPECTED");
			System.out.println("Able to Modify Shipment Details - NOT AS EXPECTED");
			Assert.fail("Able to Modify Shipment Details - NOT AS EXPECTED");
		}
		catch (Exception ex) {
			Reporter.log("Unable to Modify Shipment Details as expected");
			System.out.println("Unable to Modify Shipment Details as expected");
		}
	}


}
