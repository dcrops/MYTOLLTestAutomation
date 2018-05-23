package commonStepsDefinitions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Reporter;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manifestActions.ManifestActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class ManifestCommonStepsDefinitions {
	
	
	public static String NewManifestName;
	public static String SenderCompanyName;
	public static String SenderContactName;
	public static String SenderLocation;
	public static String ReceiverCompanyName;
	public static String ReceiverContactName;
	public static String ReceiverLocation;
	public static String ShipmentNumber;
	
	@When("^User Click My Manifest tab on My Dahsboad and Click Add Manifest Manually$")
	public void UserClickMyManifestTabOnMyDahsboadandClickAddManifestManually() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		ManifestActions.addManifestManually();
		PageBase.MaximumWaitForElementEnabled_1();
	}
	
	@And("^User Creates Manual Manifest$")
	public void UserCreatesManualManifest(DataTable manifestTestData) throws Throwable {
		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {
			//Random Manifest Name
			int Number = (int) (Math.random()*10000);
			String newNumber = String.valueOf(Number);
			NewManifestName = "TESTMANIFEST"+newNumber;
			
			ManifestActions.createManifestPopUpSpecificSender(manifest.get("Toll carrier"), manifest.get("Sender"), NewManifestName);
		}
	}
	
	@Then("^User Verify Manifest and Proceed to Shipment$")
	public void UserVerifyManifestAndProceedtoShipment(DataTable manifestTestData) throws Throwable {
		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {
			PageBase.verifyTextExist(ManifestActions.manifestHeading, "MANIFEST - "+NewManifestName);
			Reporter.log("User Clicks Add New Shipment");
			PageBase.click(ManifestActions.AddNewShipment, 5);
			PageBase.verifyTextExistAttributeContains(ManifestActions.TollCarier, manifest.get("Toll carrier"));
			Reporter.log("User Enters Shipment Details");
		}
	}
	
	@And("^User Selects Service$")
	public void UserSelectsService(DataTable manifestTestData) throws Throwable {

		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {
			CreateShipmentActions.EnterService(manifest.get("Service"));

		}
	}
	
	
	@Then("^User enters shipment overview details as below - Manual Manifest$")
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
			RateEnquiryActions.ShipmentReceiverSelect(shipment.get("Receiver"));
			System.out.println("User checks for shipment Consolidation");
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.MediumWaitForElementEnabled_1();
			CreateShipmentActions.SelectShipmentConsolidationContinue();
		}
	}
	
	@Then("^User enters shipment overview details as below Draft Shipment - Manual Manifest - Prio$")
	public void User_enters_shipment_overview_details_asbelow_Draft_Shipment_ManualManifestPrio(DataTable shipmentTestData)
			throws Throwable {

		for (java.util.Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MediumWaitForElementEnabled_1();
			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
			String s = shipment.get("Whopays");
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			RateEnquiryActions.ShipmentReceiverSelect(shipment.get("Receiver"));
			System.out.println("User checks for shipment Consolidation");
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.MediumWaitForElementEnabled_1();
			CreateShipmentActions.SelectShipmentConsolidationContinue();
		}
	}
	
	
	@And("^User Enters Export Declarations$")
	public void UserEntersExportDeclarations(DataTable manifestTestData) throws Throwable {

		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {
			CreateShipmentActions.TypeOfExport(manifest.get("TypeOfExport"));
			CreateShipmentActions.DeclaredValue(manifest.get("DeclaredValue"));
			CreateShipmentActions.DeclaredValueCurrency(manifest.get("DeclaredValueCurrency"));
			CreateShipmentActions.WhoPaysDutiesTaxes(manifest.get("WhoPaysDutiesTaxes"));
			CreateShipmentActions.HarmonisedCommodityCode(manifest.get("CommodityCode"));
		
		}
	}
	
	@Then("^User Click Review and Create Shipment$")
	public void UserClickReviewandCreateShipment() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(CreateShipmentActions.reviewCreateShipmentBtn,5);
		PageBase.MaximumWaitForElementEnabled_1();
		
	}
	
	@Then("^User Prints Labels and Enables Commercial Invoice$")
	public void UserPrintsLabelsandEnablesCommercialInvoice() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		ManifestActions.printLabelsandEnableComercialInvoice();
		PageBase.MaximumWaitForElementEnabled_1();
		ShipmentNumber = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]//*//h1")).getText().substring(18);
		System.out.println("ShipmentNumber ="+ShipmentNumber);
	}
	
	@Then("^User Creates Commercial Invoice and Verifies Page Details$")
	public void UserCreatesCommercialInvoiceandVerifiesPageDetails() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		ManifestActions.verifyCommercialInvoicePageItems();
	}
	
	@And("^User Retrives Sender and Reciver Locations and Detials$")
	public void UserRetrivesSenderandReciverLocationsandDetials() throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();

		SenderCompanyName = BaseWebdriver.driver.findElement(CreateShipmentActions.senderTextfield).getAttribute("value");
		SenderContactName = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[1]/div[2]")).getText();
		SenderLocation = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[1]/div[3]")).getText();
		System.out.println("SenderCompanyName ="+SenderCompanyName);
		System.out.println("SenderContactName ="+ SenderContactName);
		System.out.println("SenderLocation ="+SenderLocation);

		ReceiverCompanyName = BaseWebdriver.driver.findElement(CreateShipmentActions.receiverTextfield).getAttribute("value");
		ReceiverContactName = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[1]/div[2]")).getText();
		ReceiverLocation = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[1]/div[3]")).getText();
		System.out.println("ReceiverCompanyName ="+ReceiverCompanyName);
		System.out.println("ReceiverContactName ="+ReceiverContactName);
		System.out.println("ReceiverLocation ="+ReceiverLocation);
		
		//ManifestActions.UserRetrivesSenderandReciverLocationsandDetials();
		
	}
	
	@And("^User Verifies Shipment Details Commercial Invoice Page$")
	public void UserVerifiesShipmentDetailsCommercialInvoicePage(DataTable manifestTestData) throws Throwable {

		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {
			String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			
			String[] shipmentDetails = {ShipmentNumber,timeStamp,manifest.get("NumberOfItems"),manifest.get("Weight")+"kg","NZD "+manifest.get("DeclaredValue")};
			for (int i =1; i<=shipmentDetails.length; i++) {
				PageBase.verifyTextSubString(By.xpath("//*[@id=\"commercial-invoice\"]/div[1]/div[1]/div/form/div["+i+"]/div/p"), shipmentDetails[i-1]);
			}
			
			PageBase.verifyTextExist(ManifestActions.commericalInvoiceSenderContactName, SenderContactName);
			PageBase.verifyTextExist(ManifestActions.commericalInvoiceSenderCompanyName, SenderCompanyName);
			//PageBase.verifyTextExist(ManifestActions.commericalInvoiceSenderAddress, SenderLocation);
			PageBase.verifyTextExist(ManifestActions.commericalInvoiceCountryofExport, manifest.get("CountryOfExportAU"));
			PageBase.verifyTextExist(ManifestActions.commericalInvoiceReceiverContactName, ReceiverContactName);
			PageBase.verifyTextExist(ManifestActions.commericalInvoiceReceiverCompanyName, ReceiverCompanyName);
			//PageBase.verifyTextExist(ManifestActions.commericalInvoiceReceiverAddress, ReceiverLocation);
			PageBase.verifyTextExist(ManifestActions.commericalInvoiceCountryofUltimateDestination, manifest.get("DestinationNZ"));
		
		}
	}
	
	@Then("^User Enters Commercial Invoice Item Details$")
	public void UserEntersCommercialInvoiceItemDetails(DataTable manifestTestData) throws Throwable {

		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {
			ManifestActions.commercialInvoiceItemDetails(manifest.get("CommercialInvoiceDes"), manifest.get("PartNo"), manifest.get("ACHECC"), 
					manifest.get("NumberOfItems"), manifest.get("Weight"), manifest.get("UnitValue"), manifest.get("DeclaredValue"));
		}
	}
	
	@And("^User Enters Commercial Invoice Other Details And Clicks Save$")
	public void UserEntersCommercialInvoiceOtherItemDetailsAndClicksSave(DataTable manifestTestData) throws Throwable {

		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {
			ManifestActions.commercailInvoiceOtherDetails(manifest.get("TypeOfExport"), Integer.parseInt(manifest.get("TermsofTrade")));
			PageBase.verifyTextExistAttribute(ManifestActions.DeclarationCompanyName, SenderCompanyName);
			PageBase.verifyTextExistAttribute(ManifestActions.DeclarationContactName, SenderContactName);
			PageBase.click(ManifestActions.commericalInvoiceSave, 5);
		}
	}
	
	@Then("^User Verifies Shipment Details on Commercial Invoice Review Page$")
	public void UserVerifiesShipmentDetailsOnCommercialInvoiceReviewPage(DataTable manifestTestData) throws Throwable {

		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {
			ManifestActions.verifyCommercialInvoicePage(manifest.get("CommercialInvoiceDes"), manifest.get("PartNo"), manifest.get("ACHECC"), 
					manifest.get("NumberOfItems"), manifest.get("Weight"), manifest.get("UnitValue"), manifest.get("DeclaredValue"));
		
		}
	}
	
	@Then("^User Prints Commercial Invoice$")
	public void UserPrintsCommercialInvoice() throws Throwable {
		PageBase.click(ManifestActions.printCommericalInvoice, 10);
		PageBase.verifyTextExist(ManifestActions.commericalInvoiceErrorMsg2, "Please remember that this Commercial Invoice must be printed on to your company letterhead .");
		PageBase.isElementPresent(ManifestActions.finalPrintCommericalInvoice, 10, "Commercial Invoice Final Print Button");
	}

	@Then("^User Navigates Back to Dashboard$")
	public void UserNavigatesBackToDashboard() throws Throwable {
		PageBase.click(ManifestActions.GoToDashboard, 2);
	}
	
	@And("^User Selects the Shipment for BAP$")
	public void UserSelectsTheShipmentForBAP(DataTable manifestTestData) throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		ManifestActions.manifestToBookaPickUp(NewManifestName);
		PageBase.waitForElement(BookAPickupActions.TollCarrierTextField, 5);
	}
	
	@Then("^User Verifies Shipment Details on BAP Page$")
	public void UserVerifiesShipmentDetailsonBAPPage(DataTable manifestTestData) throws Throwable {
		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {
			ManifestActions.UserVerifiesShipmentDetailsonBAPPage(manifest.get("Toll carrier"), manifest.get("AccountNumber"), manifest.get("Service"));
		}
	}
	
	@And("^User Verifies Line Item on BAP Page$")
	public void UserVerifiesLineItemOnBAPPage(DataTable manifestTestData) throws Throwable {
		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {	
			ManifestActions.UserVerifiesLineItemOnBAPPage_TDF(manifest.get("Item description"), manifest.get("No of Items"), manifest.get("Length"), manifest.get("Width"), 
					manifest.get("Height"), manifest.get("Weight"));
		}
	}
	
	@Then("^User Selects Dispatch Date and Ready Time$")
	public void UserSelectsDispatchDateAndReadyTime(DataTable manifestTestData) throws Throwable {
		for (Map<String, String> manifest : manifestTestData.asMaps(String.class, String.class)) {
			ManifestActions.selectPickupDate();
			ManifestActions.selectReadyTimeJS(manifest.get("ReadyTime"));
		}
	}
	
	@Then("^User Clicks Review and Book$")
	public void UserClicksReviewAndBook() throws Throwable {
		BookAPickupActions.ClickReviewBook();
	}
	
	@Then("^User Confirms Pick Up and Gets BAP Reference Number$")
	public void UserConfirmsPickUpAndGetsBAPReferenceNumber() throws Throwable {
		BookAPickupActions.ConfirmPickUpandGetReferenceNo();
	}
	
	@Then("^User Enters Phone Number$")
	public void UserEntersPhoneNumber() throws Throwable {
		PageBase.sendText(BookAPickupActions.phoneNumber, 10, "424579833");
	}
	
	
	
}
