package createshipment;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import global.PageBase;
import bookapickup.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manifest.ManifestActions;
import mytollhomepage.MyTollHomePageActions;

public class MYT_6138_SaveAshipmentAsADraft_StepsDefinitions {

	@When("^User navigates to Shipment from MyDashboard$")
	public void user_navigates_to_Shipment_from_MyDashboard() throws Throwable {
		CreateShipmentActions.DeleteExistingDraftShipments();
		PageBase.MaximumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
		PageBase.MaximumWaitForElementEnabled();
	}

	@When("^User selects 'Dispatch date' in to create a shipment$")
	public void user_selects_Dispatch_date_in_to_create_a_shipment() throws Throwable {
		CreateShipmentActions.SelectDispatchDate();
	}

	@Then("^User MUST have an option to save the Shipment as a Draft$")
	public void user_MUST_have_an_option_to_save_the_Shipment_as_a_Draft(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			assertEquals(shipment.get("ButtonName"), CreateShipmentActions.GetSaveDraftButtonName());

		}
	}

	@When("^User enters following fields$")
	public void user_enters_following_fields(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.EnterTollCarrier(shipment.get("TollCarrier"));
			CreateShipmentActions.EnterService(shipment.get("Service"));
			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
		}
	}

	@When("^User enters following fields to create a shipment$")
	public void user_enters_following_fields_to_create_a_shipment(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.EnterTollCarrier(shipment.get("TollCarrier"));
			CreateShipmentActions.EnterService(shipment.get("Service"));
			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
		}
	}

	@When("^User Clicks on the Save Draft option$")
	public void user_Clicks_on_the_Save_Draft_option() throws Throwable {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		CreateShipmentActions.ClickSaveDraft();

	}

	@When("^User Clicks on the Save Draft option next to Review Shipment Button$")
	public void user_Clicks_on_the_Save_Draft_option_next_to_Review_Shipment_Button() throws Throwable {
		PageBase.Scrollbar(500, 1000);
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.receiverEmail);
		PageBase.MaximumWaitForElementEnabled();
		CreateShipmentActions.ClickSaveDraft();
	}

	@Then("^User be able to see UI prompt displaying the Shipment has been Saved as a Draft$")
	public void user_be_able_to_see_UI_prompt_displaying_the_Shipment_has_been_Saved_as_a_Draft(
			DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			assertEquals(shipment.get("Message"), CreateShipmentActions.GetSaveDraftSuccessfulMessage());

		}

	}

	@Then("^User MUST have an option in the UI prompt to Go back to the 'Create Shipment' page$")
	public void user_MUST_have_an_option_in_the_UI_prompt_to_Go_back_to_the_Create_Shipment_page(DataTable arg1)
			throws Throwable {

		CreateShipmentActions.ClickGoBackBtn();
	}

	@Then("^User MUST have an option in the UI prompt to be re-directed to 'My Dashboard'$")
	public void user_MUST_have_an_option_in_the_UI_prompt_to_be_re_directed_to_My_Dashboard(DataTable arg1)
			throws Throwable {

		CreateShipmentActions.ClickGoToMyDashboardBtn();
	}

	@Then("^User can see pre-filled data available in 'Draft Shipments'$")
	public void user_can_see_pre_filled_data_available_in_Draft_Shipments(DataTable shipmentTestData) throws Throwable {

		System.out.println(
				"Toll Carrier in Dashboard  " + CreateShipmentActions.GetDraftShipmentTollCarrierInMyDashboard());
		System.out.println("Sender in Dashboard  " + CreateShipmentActions.GetDraftShipmentSenderInMyDashboard());
		System.out.println("Receiver in Dashboard  " + CreateShipmentActions.GetDraftShipmentReceiverInMyDashboard());

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			assertEquals(shipment.get("TollCarrier"), CreateShipmentActions.GetDraftShipmentTollCarrierInMyDashboard());
			//assertEquals(shipment.get("Sender"), CreateShipmentActions.GetDraftShipmentSenderInMyDashboard());
			assertEquals(shipment.get("Receiver"), CreateShipmentActions.GetDraftShipmentReceiverInMyDashboard());

		}
	}

	@Then("^User enters following data to complete the shipment as below$")
	public void user_enters_following_data_to_complete_the_shipment_as_below(DataTable shipmentTestData) throws Throwable {
	  
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			CreateShipmentActions.NumberOfItem(shipment.get("No of Items"));
			BookAPickupActions.EnterItem(shipment.get("Item description"));
			
			BookAPickupActions.EnterLengthWidthHeight(shipment.get("Length"), shipment.get("Width"),
					shipment.get("Height"));
			CreateShipmentActions.EnterWeight(shipment.get("Weight"));
			PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

			CreateShipmentActions.EnterSenderReference(shipment.get("SenderReference"),
					shipment.get("ReceiverReference"));
			PageBase.Scrollbar(500, 800);
			BookAPickupActions.selectDangerousGood();
			PageBase.Scrollbar(1200, 1500);
		}
	}
	
	@Then("^Draft Shipment MUST be saved under 'Draft Shipments' tab in 'My Dashboard'$")
	public void draft_Shipment_MUST_be_saved_under_Draft_Shipments_tab_in_My_Dashboard(DataTable arg1)
			throws Throwable {

	}

	@When("^User selects a Draft Shipment$")
	public void user_selects_a_Draft_Shipment() throws Throwable {
		CreateShipmentActions.ClickOnDraftShipmenInMyDashboard();

	}

	@Then("^User can see all data in the draft shipment transferred to the 'Create Shipment' page$")
	public void user_can_see_all_data_in_the_draft_shipment_transferred_to_the_Create_Shipment_page(
			DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			//assertEquals(shipment.get("AccountNumber").replaceAll("\\s", ""), BookAPickupActions.GetAccountNumber());
			assertTrue(BookAPickupActions.GetAccountNumber().contains(shipment.get("AccountNumber")));

			System.out.println("Account number  " + BookAPickupActions.GetAccountNumber());
			assertEquals(shipment.get("TollCarrier").replaceAll("\\s", ""), BookAPickupActions.GetTollCarrier());
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			assertEquals(shipment.get("Service").replaceAll("\\s", ""),
					CreateShipmentActions.GetService().replaceAll("\\s", ""));
			System.out.println("Service  " + CreateShipmentActions.GetService());

		}

	}

	@When("^User moves to Add NEW LInes$")
	public void user_moves_to_Add_NEW_LInes() throws Throwable {
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
	}

	@Then("^User be able to view the Draft is removed from My Draft Shipments in My Dashboard$")
	public void user_be_able_to_view_the_Draft_is_removed_from_My_Draft_Shipments_in_My_Dashboard() throws Throwable {
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickMyDashboard();
		CreateShipmentActions.ClickDraftShipmentTabInMyDashboard();
		CreateShipmentActions.VerifyDraftShipmentHasRemovedFromMyDashboard();

	}

	@When("^User clicks on 'Add New Shipment' from an 'In Progress' Manifest$")
	public void user_clicks_on_Add_New_Shipment_from_an_In_Progress_Manifest() throws Throwable {
		ManifestActions.ClickAddNewShipmentBtn();
	}

	@Then("^User MUST have an option to SAVE the Shipment as a Draft Shipment$")
	public void user_MUST_have_an_option_to_SAVE_the_Shipment_as_a_Draft_Shipment(DataTable shipmentTestData)
			throws Throwable {
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			assertEquals(shipment.get("ButtonName"), CreateShipmentActions.GetSaveDraftButtonName());
			PageBase.MaximumWaitForElementEnabled();
			CreateShipmentActions.ClickSaveDraft();
			assertEquals(shipment.get("Message"), CreateShipmentActions.GetSaveDraftSuccessfulMessage());
			
			assertEquals(shipment.get("TollCarrier"), CreateShipmentActions.GetDraftShipmentTollCarrierInMyDashboard());
			assertEquals(shipment.get("Sender"), CreateShipmentActions.GetDraftShipmentSenderInMyDashboard());
			assertEquals(shipment.get("Receiver"), CreateShipmentActions.GetDraftShipmentReceiverInMyDashboard());
		}

	}

	@When("^User changes either of the fields$")
	public void user_changes_either_of_the_fields(DataTable arg1) throws Throwable {

	}

	@Then("^User can see all other fields cleared$")
	public void user_can_see_all_other_fields_cleared(DataTable arg1) throws Throwable {

	}

	@When("^user moves to shipment reference number$")
	public void user_moves_to_shipment_reference_number() throws Throwable {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
	}

	@Then("^User selects the Service and other details as below to complete the shipment as below$")
	public void user_selects_the_Service_and_other_details_as_below_to_complete_the_shipment_as_below(
			DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			CreateShipmentActions.EnterService(shipment.get("Service"));
			String s = shipment.get("Whopays");
			System.out.println("S  " + s);
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));

			CreateShipmentActions.EnterSender(shipment.get("Sender"));

			CreateShipmentActions.EnterReceiver(shipment.get("Receiver"));
			CreateShipmentActions.SelectShipmentConsolidationContinue();
			CreateShipmentActions.EnterShipmentReference1(shipment.get("ShipmentRef1"));
			PageBase.MaximumWaitForElementEnabled();
			/*CreateShipmentActions.NumberOfItem(shipment.get("No of Items"));
			BookAPickupActions.EnterItem(shipment.get("Item description"));
			
			BookAPickupActions.EnterLengthWidthHeight(shipment.get("Length"), shipment.get("Width"),
					shipment.get("Height"));
			CreateShipmentActions.EnterWeight(shipment.get("Weight"));
			PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

			CreateShipmentActions.EnterSenderReference(shipment.get("SenderReference"),
					shipment.get("ReceiverReference"));
			PageBase.Scrollbar(500, 800);
			BookAPickupActions.selectDangerousGood();
			PageBase.Scrollbar(1200, 1500);*/

		}

	}

	@When("^User enters following input data to complete the shipment as below$")
	public void user_enters_following_input_data_to_complete_the_shipment_as_below(DataTable arg1) throws Throwable {

	}

	@When("^User Clicks on 'Review & Create Shipment' and see all data$")
	public void user_Clicks_on_Review_Create_Shipment_and_see_all_data(DataTable arg1) throws Throwable {

	}
}
