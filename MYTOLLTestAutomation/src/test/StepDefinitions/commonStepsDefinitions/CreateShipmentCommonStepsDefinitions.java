package commonStepsDefinitions;

import java.util.Map;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;

public class CreateShipmentCommonStepsDefinitions {
	
	@Given("^User is Registered in MyToll and is on Shipment page$")
	public void user_is_Registered_in_MyToll_and_is_on_Shipment_page() throws Throwable {

		BaseWebdriver.setUp();
		PageBase.MaximumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Given("^User is Registered in MyToll and is on MyDashboard$")
	public void user_is_Registered_in_MyToll_and_is_on_MyDashboard() throws Throwable {
	   
		BaseWebdriver.setUp();
		PageBase.MaximumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
	}
		
	@When("^User selects Toll Carrier and select Service$")
	public void user_selects_Toll_Carrier_and_select_Service(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterTollCarrierItem(shipment.get("TollCarrier"));
			CreateShipmentActions.EnterService(shipment.get("Service"));

		}
	}

	@When("^user selects Toll Carrier as below to create shipment$")
	public void user_selects_Toll_Carrier_as_below_to_create_shipment(DataTable shipmentTestData) throws Throwable {
		
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
		
		BookAPickupActions.EnterTollCarrier(shipment.get("TollCarrier"));
		}
		
	}
	
	

	@Then("^User be able to see following Services$")
	public void user_be_able_to_see_following_Services(DataTable shipmentTestData) throws Throwable {
	   
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			
		//	BookAPickupActions.EnterTollCarrier(shipment.get("TollCarrier"));
		/*	int listSize=CreateShipmentActions.GetServiceItemListSize();
			for(int i=1; i<=listSize; i++)
			{
				System.out.println("from cucumber"+shipment.get("Service"+i+""));
			//CreateShipmentActions.GetServiceItemList(shipment.get("Service"+i+""),listSize) ;
			} */
			CreateShipmentActions.EnterService(shipment.get("Service5"));
			}
	}
	
	@When("^User enters shipment overview details as below to create a shipment$")
	public void user_enters_shipment_overview_details_as_below_to_create_a_shipment(DataTable shipmentTestData)
			throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			//CreateShipmentActions.EnterService(shipment.get("Service"));
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
	
	@When("^User clicks on ADD NEW LINES to add an another item and User enters following input data for the line item$")
	public void user_clicks_on_ADD_NEW_LINES_to_add_an_another_item_and_User_enters_following_input_data_for_the_line_item(DataTable shipmentTestData) throws Throwable {
	   
				
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			
			CreateShipmentActions.AddANewLineNZAUS(1000, 1500, shipment.get("Item description"),
					shipment.get("Billing Type"), shipment.get("No of Items"), shipment.get("Length"),
					shipment.get("Width"), shipment.get("Height"), shipment.get("TotalWeight"),
					shipment.get("SenderReference"), shipment.get("ReceiverReference"));
		
			
		}
	}
	
	@When("^User Navigates Back to Shipment Page$")
	public void UserNavigatesBackToShipmentPage() throws Throwable {
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
		PageBase.MediumWaitForElementEnabled_1();
		
	}
	

}
