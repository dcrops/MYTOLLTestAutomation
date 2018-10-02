package steps.createshipment;

import java.util.Map;

import createshipment.CreateShipmentActions;
import createshipment.ShipmentReviewActions;
import cucumber.api.PendingException;
import global.PageBase;
import basewebdriver.BaseWebdriver;
import bookapickup.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manifest.ManifestActions;
import org.testng.Assert;

public class CreateShipmentStepsDefinitions {

	public static String AccountNo;


	@When("^User enters following input data for the line item$")
	public void user_enters_following_input_data_for_the_line_item(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			CreateShipmentActions.setQEMNo();
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

	@Then("^User Clicks Review and Create Shipment$")
	public void UserClicksReviewAndCreateShipment() throws Throwable {
		PageBase.click(CreateShipmentActions.reviewCreateShipmentBtn, 5);
	}

	@Then("^User Clicks Continue Manifest on Shipment Review Page$")
	public void UserClicksContinueManifestonShipmentReviewPage() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		AccountNo = BaseWebdriver.driver.findElement(ShipmentReviewActions.accountNumber).getText();
		System.out.println(AccountNo);
		System.out.println("Line 90");
		PageBase.waitForElement(ManifestActions.ContinuetoManifest, 5);
		System.out.println("Line 92");
		PageBase.click(ManifestActions.ContinuetoManifest, 5);
		System.out.println("Line 94");
		System.out.println(ManifestActions.ContinuetoManifest);
	}

	@And("^User Submits and Prints Manifest$")
	public void UserSubmitsandPrintsManifest() throws Throwable {
		ManifestActions.submitandPrintManifest();
	}

	@When("^User enters following input data for the line item - TCHEM$")
	public void user_enters_following_input_data_for_the_line_item_TCHEM(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.EnterItem(shipment.get("Item description"));
			CreateShipmentActions.EnterBillingType(shipment.get("Billing Type") + " ");
			CreateShipmentActions.NumberOfItem(shipment.get("No of Items"));
			BookAPickupActions.EnterLengthWidthHeight(shipment.get("Length"), shipment.get("Width"),
					shipment.get("Height"));
			CreateShipmentActions.EnterWeight(shipment.get("Weight"));
		}

	}

	@And("^User adds \"([^\"]*)\" as purchase order number$")
	public void userAddsAsPurchaseOrderNumber(String purchaseOrderNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		CreateShipmentActions.EnterPurchaseOrder(purchaseOrderNumber);
	}

	@And("^User adds entered dangerous goods details$")
	public void userAddsEnteredDangerousGoodsDetails() throws Throwable {
		BookAPickupActions.addDGItemQME();
	}

	@Then("^User does not see AE4599 error message$")
	public void userDoesNotSeeErrorMessage() throws Throwable {

		Assert.assertFalse(PageBase.isElementPresent(CreateShipmentActions.errorBox), "Oops error box for error AE4599 is displayed");
	}
}
