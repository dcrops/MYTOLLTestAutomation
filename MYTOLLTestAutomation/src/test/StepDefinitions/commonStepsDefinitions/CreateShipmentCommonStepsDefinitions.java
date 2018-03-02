package commonStepsDefinitions;

import java.util.Map;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;

public class CreateShipmentCommonStepsDefinitions {
	
	@Given("^User is Registered in MyToll and is on Shipment page$")
	public void user_is_Registered_in_MyToll_and_is_on_Shipment_page() throws Throwable {

		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

		
	@When("^User selects Toll Carrier and select Service$")
	public void user_selects_Toll_Carrier_and_select_Service(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.SelectIntermodalSpecializedCarrier(shipment.get("TollCarrier"));
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

	
	@When("^User enters shipment overview details as below to create a shipment with Dangerous Goods$")
	public void user_enters_shipment_overview_details_as_below_to_create_a_shipment_with_Dangerous_Goods(DataTable shipmentTestData) throws Throwable {
	  
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.SelectIntermodalSpecializedCarrier(shipment.get("TollCarrier"));
			CreateShipmentActions.EnterService(shipment.get("Service"));
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

			CreateShipmentActions.EnterDGContactDetails(shipment.get("DGContactName"), shipment.get("DGContactNumber"));
			PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
			CreateShipmentActions.EnterShipmentReferences(shipment.get("ShipmentRef1"), shipment.get("ShipmentRef2"));
		}
		
	}

}
