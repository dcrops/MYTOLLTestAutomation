package steps.dashboard;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.openqa.selenium.By;

import global.PageBase;
import basewebdriver.BaseWebdriver;
import bookapickup.BookAPickupActions;
import createshipment.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mytollhomepage.MyTollHomePageActions;
import rateenquiry.RateEnquiryActions;

public class DashboardCommonStepsDefinitions {
	
	
	@Given("^User is Registered in MyToll and is on Shipment Page - Draft Shipment$")
	public void user_is_Registered_in_MyToll_and_is_on_Shipment_page() throws Throwable {

		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}
	
	
	@When("^User enters shipment overview details as below to Create Darft Shipment$")
	public void User_enters_shipment_overview_details_asbelow_to_create_draft_Shipement(DataTable shipmentTestData)
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
	
	@Then("^User enters shipment overview details as below - Specific Sender Receiver$")
	public void User_enters_shipment_overview_details_asbelow_to_get_a_Rate_within_a_Shipment_SpecifcSenderReceiver(DataTable shipmentTestData)
			throws Throwable {

		for (java.util.Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MediumWaitForElementEnabled_1();
			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
			String s = shipment.get("Whopays");
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			String s2 = shipment.get("Mode");
			System.out.println("S2  " + s2);
			CreateShipmentActions.SelectMode(Integer.parseInt(s2));
			RateEnquiryActions.ShipmentSenderSelect(shipment.get("Sender"));
			PageBase.MaximumWaitForElementEnabled_1();
			RateEnquiryActions.ShipmentReceiverSelect(shipment.get("Receiver"));
			System.out.println("User checks for shipment Consolidation");
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.MediumWaitForElementEnabled_1();
			CreateShipmentActions.SelectShipmentConsolidationContinue();
		}
	}
	
	@Then("^User enters shipment overview details as below Draft Shipment - Specific Sender Receiver - Prio$")
	public void User_enters_shipment_overview_details_asbelow_Draft_Shipment_SpecifcSenderReceiverPrio(DataTable shipmentTestData)
			throws Throwable {

		for (java.util.Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MediumWaitForElementEnabled_1();
			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
			String s = shipment.get("Whopays");
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			RateEnquiryActions.ShipmentSenderSelect(shipment.get("Sender"));
			PageBase.MaximumWaitForElementEnabled_1();
			RateEnquiryActions.ShipmentReceiverSelect(shipment.get("Receiver"));
			System.out.println("User checks for shipment Consolidation");
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.MediumWaitForElementEnabled_1();
			CreateShipmentActions.SelectShipmentConsolidation();
		}
	}
	
	@When("^User enters following input data for the line item for Draft Shipment - Prio$")
	public void user_enters_following_input_data_for_the_line_item_ForDraftShipment_Prio(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
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
	
	@Then("^User Clicks Save Draft on Shipment Page$")
	public void UserClicksSaveDraftOnShipmentDPage() throws Throwable {
		PageBase.click(MyTollHomePageActions.SaveDraft, 5);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(By.xpath("//*[@id=\"confirm-box-wrapper\"]//*/h3"), "Success");
		PageBase.verifyTextExist(By.xpath("//*[@id=\"confirm-box-wrapper\"]//*/p"), "Draft Shipment Created");
		PageBase.click(MyTollHomePageActions.DraftShipmentGoToDashboard, 5);
	}
	
	
	@Then("^User Navigates to Draft Shipment Page and Verifies Page Items$")
	public void UserNavigatesToDraftShipmentPageAndVerifiesPageItems(DataTable draftShipmentTestData) throws Throwable {

		for (Map<String, String> draftShipment : draftShipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.click(MyTollHomePageActions.DraftShipmentTab, 5);
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.isElementPresent(MyTollHomePageActions.DraftShipmentTabTollCarrier , 5, draftShipment.get("Toll carrier"));
			PageBase.isElementPresent(MyTollHomePageActions.DraftShipmentTabSender, 5, draftShipment.get("Sender"));
			PageBase.isElementPresent(MyTollHomePageActions.DraftShipmentTabReceiver, 5, draftShipment.get("Receiver"));
			PageBase.isElementPresent(MyTollHomePageActions.DraftShipmentTabDispatchDate, 5, draftShipment.get("Dispatch date"));
		}
	}
	
	@And("^User Click Complete Shipment and is Navagiated Back to Create Shipment page$")
	public void UserClickCompleteShipmentandisNavagiatedBacktoCreateShipmentPage(DataTable draftShipmentTestData) throws Throwable {
		for (Map<String, String> draftShipment : draftShipmentTestData.asMaps(String.class, String.class)) {
		PageBase.MaximumWaitForElementEnabled_1();
		//PageBase.click(By.xpath("//*/td[5]/a"), 5);
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		String date = sdf.format(new Date()); 
		System.out.println(date);
		String xpath= "	//*/td[preceding-sibling::td[text()='"+draftShipment.get("Toll carrier")+"']][preceding-sibling::td[text()='"+draftShipment.get("Sender")+"']] "
				+ "[preceding-sibling::td[text()='"+draftShipment.get("Receiver")+"']] [preceding-sibling::td[text()='"+date+"']]/a";
		PageBase.click(By.xpath(xpath), 5);
		
		}
	}
	
	@Then("^User Verifies if Shipment Details are correct in the Shipment Page$")
	public void UserVerifiesIfShipmentDetailsareCorrectforModule1(DataTable draftShipmentTestData) throws Throwable {
		for (Map<String, String> draftShipment : draftShipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, draftShipment.get("TollCarrier"));
			PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, draftShipment.get("Service"));
			PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo,draftShipment.get("AccountNumber"));
			PageBase.verifyTextExistAttribute(CreateShipmentActions.senderTextfield,draftShipment.get("Sender"));
			PageBase.verifyTextExistAttribute(CreateShipmentActions.receiverTextfield,draftShipment.get("Receiver"));
			PageBase.verifyTextExistAttributeContains(BookAPickupActions.itemDescriptionTextField, draftShipment.get("Item description"));
			PageBase.verifyTextExistAttribute(By.xpath("//*[@id=\"billing-type-description\"]"), draftShipment.get("Billing Type"));
			PageBase.verifyTextExistAttribute(CreateShipmentActions.numberOfItem,draftShipment.get("No of Items"));
			PageBase.verifyTextExistAttribute(BookAPickupActions.length,draftShipment.get("Length"));
			PageBase.verifyTextExistAttribute(BookAPickupActions.width,draftShipment.get("Width"));
			PageBase.verifyTextExistAttribute(BookAPickupActions.height,draftShipment.get("Height"));
			PageBase.verifyTextExistAttribute(BookAPickupActions.weight,draftShipment.get("Weight"));
		}
	}
	
	@Then("^User Verifies if Shipment Details are correct in the Shipment Page - Prio$")
	public void UserVerifiesIfShipmentDetailsareCorrectforModule1Prio(DataTable draftShipmentTestData) throws Throwable {
		for (Map<String, String> draftShipment : draftShipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, draftShipment.get("TollCarrier"));
			PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, draftShipment.get("Service"));
			PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo,draftShipment.get("AccountNumber"));
			PageBase.verifyTextExistAttribute(CreateShipmentActions.senderTextfield,draftShipment.get("Sender"));
			PageBase.verifyTextExistAttribute(CreateShipmentActions.receiverTextfield,draftShipment.get("Receiver"));
			PageBase.verifyTextExistAttributeContains(BookAPickupActions.itemDescriptionTextField, draftShipment.get("Item description"));
			PageBase.verifyTextExistAttribute(CreateShipmentActions.numberOfItem,draftShipment.get("No of Items"));
			PageBase.verifyTextExistAttribute(BookAPickupActions.length,draftShipment.get("Length"));
			PageBase.verifyTextExistAttribute(BookAPickupActions.width,draftShipment.get("Width"));
			PageBase.verifyTextExistAttribute(BookAPickupActions.height,draftShipment.get("Height"));
			PageBase.verifyTextExistAttribute(BookAPickupActions.weight,draftShipment.get("Weight"));
		}
	}
	
	@And("^User Navigates back to Dashboard and Draft Shipment Tab$")
	public void UserNavigatesBacktoDashboardandDraftShipment() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		MyTollHomePageActions.ClickMenu();
		PageBase.click(MyTollHomePageActions.Dashboard, 2);	
		PageBase.click(MyTollHomePageActions.DraftShipmentTab, 5);
	}
	
	@Then("^User Deletes Draft Shipment$")
	public void UserDeletesDraftShipment(DataTable draftShipmentTestData) throws Throwable {
		for (Map<String, String> draftShipment : draftShipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled_1();
			//PageBase.click(By.xpath("//*/td[5]/a"), 5);
			SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
			String date = sdf.format(new Date()); 
			PageBase.click(By.xpath("	//*/td[preceding-sibling::td[text()='"+draftShipment.get("Toll carrier")+"']][preceding-sibling::td[text()='"+draftShipment.get("Sender")+"']] "
					+ "[preceding-sibling::td[text()='"+draftShipment.get("Receiver")+"']] [preceding-sibling::td[text()='"+date+"']]/span/i"), 5);
			}
	}
	
	@Then("^User Cancels Delete Draft Search$")
	public void UserCancelsDeleteSavedSearch() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.DeleteSaveSearchCancel, 5);
	}
	
	@Then("^User Confirms Delete Draft Search$")
	public void UserConfirmsDeleteSavedSearch() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.DeleteSaveSearchConfirm, 5);
	}
	
	
	@Given("^User is Registered in MyToll and is on My Dashboard$")
	public void user_is_Registered_in_MyToll_and_is_on_My_Dashboard() throws Throwable {

		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
	}
	
	@Given("^User is Registered in MyToll and is on Shipment Page - Commercial Invoice$")
	public void user_is_Registered_in_MyToll_and_is_on_Shipment_page_Commercial_Invoice() throws Throwable {

		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}
	
	@Then("^User Closes the Browser$")
	public void UserClosestheBrowser() throws Throwable {
		BaseWebdriver.tearDown();
	}

}
