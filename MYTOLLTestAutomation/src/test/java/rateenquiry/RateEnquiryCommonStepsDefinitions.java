package rateenquiry;

import global.PageBase;
import basewebdriver.BaseWebdriver;
import bookapickup.BookAPickupActions;
import createshipment.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mytollhomepage.MyTollHomePageActions;

public class RateEnquiryCommonStepsDefinitions {


	
	@Given("^User is Registered in MyToll and is on Shipment Page - Rate Enquiry$")
	public void user_is_Registered_in_MyToll_and_is_on_Shipment_page() throws Throwable {

		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
		//Test
	}
	
	
	@When("^User enters shipment overview details as below to get a Rate within a Shipment$")
	public void User_enters_shipment_overview_details_asbelow_to_get_a_Rate_within_a_Shipment(DataTable shipmentTestData)
			throws Throwable {

		for (java.util.Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

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
			System.out.println("User checks for shipment Consolidation");
			CreateShipmentActions.SelectShipmentConsolidationContinue();
		}
	}
	
	@When("^User enters shipment overview details as below to get a Rate within a Shipment - Prio$")
	public void User_enters_shipment_overview_details_asbelow_to_get_a_Rate_within_a_Shipment_Prio(DataTable shipmentTestData)
			throws Throwable {

		for (java.util.Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
			String s = shipment.get("Whopays");
			System.out.println("S  " + s);
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			String s3 = shipment.get("Sender");
			System.out.println("S3  " + s3);
			CreateShipmentActions.SelectSender(Integer.parseInt(s3));
			String s4 = shipment.get("Receiver");
			System.out.println("S4  " + s4);
			CreateShipmentActions.SelectReceiver(Integer.parseInt(s4));
			System.out.println("User checks for shipment Consolidation");
			CreateShipmentActions.SelectShipmentConsolidationContinue();
		}
	}
	
	@When("^User enters following input data for the line item - Prio$")
	public void user_enters_following_input_data_for_the_line_item_Prio(DataTable shipmentTestData) throws Throwable {

		for (java.util.Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.EnterItem(shipment.get("Item description"));
			CreateShipmentActions.NumberOfItem(shipment.get("No of Items"));
			BookAPickupActions.EnterLengthWidthHeight(shipment.get("Length"), shipment.get("Width"),
					shipment.get("Height"));
			CreateShipmentActions.EnterWeight(shipment.get("Weight"));
			PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

			CreateShipmentActions.EnterSenderReference(shipment.get("SenderReference"),
					shipment.get("ReceiverReference"));

		}

	}
	
	@Then("^User enters shipment overview details as below to get a Rate within a Shipment - Specific Sender Receiver$")
	public void User_enters_shipment_overview_details_asbelow_to_get_a_Rate_within_a_Shipment_SpecifcSenderReceiver(DataTable shipmentTestData)
			throws Throwable {

		for (java.util.Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MediumWaitForElementEnabled_1();
			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
			String s = shipment.get("Whopays");
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			RateEnquiryActions.ShipmentSenderSelect(shipment.get("Sender"));
			RateEnquiryActions.ShipmentReceiverSelect(shipment.get("Receiver"));
			System.out.println("User checks for shipment Consolidation");
			CreateShipmentActions.SelectShipmentConsolidationContinue();
		}
	}

}
