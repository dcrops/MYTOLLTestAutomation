package manifestE2ETests;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import createShipmentActions.ShipmentReviewActions;
import myTollHomePageActions.MyTollHomePageActions;
import manifestActions.ManifestActions;


public class ManualManifestTollPriorityAUSTests {
	
	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		
	}

	
	@Test(priority = 1)
	@Parameters({"TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTSPD", "ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
		"TollExtraServiceAmount"}) 
	public void Manifest_TollPriorityAU_E2ETest_TID_1127_Service_ServiceParcelsOffPeak_AddManifestManual(String TollCarrier, String ServiceParcelsOffPeak,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {
		
		//Random Manifest Name
		int Number = (int) (Math.random()*10000);
		String newNumber = String.valueOf(Number);
		String NewManifestName = "TESTMANIFEST"+newNumber;
		
		ManifestActions.addManifestManually();
		PageBase.MaximumWaitForElementEnabled();
		
		//Create Manifest Pop Up
		ManifestActions.createManifestPopUp(TollCarrier, 2, NewManifestName);
		
		//Verify Manifest and proceed to shipment
		PageBase.verifyTextExist(ManifestActions.manifestHeading, "MANIFEST - "+NewManifestName);
		Reporter.log("User Clicks Add New Shipment");
		PageBase.click(ManifestActions.AddNewShipment, 5);
		PageBase.verifyTextExistAttribute(ManifestActions.TollCarier, TollCarrier);
		Reporter.log("User Enters Shipment Details");
		CreateShipmentActions.EnterService(ServiceParcelsOffPeak);
		
		CreateShipmentActions.SelectWhoPays(1);
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectReceiver(2);
		ManifestActions.SelectShipmentConsolidated();
		
		//Shipment Product Details
		PageBase.moveToElement(BookAPickupActions.itemDescriptionTextField);
		PageBase.sendText(BookAPickupActions.itemDescriptionTextField, 2, ItemTemplateName);
		CreateShipmentActions.NumberOfItem("15"); 
		BookAPickupActions.EnterLengthWidthHeight("40","20","10");
		CreateShipmentActions.EnterWeight("10");
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//Submit Shipment and Print Manifest
		Reporter.log("User Clicks Review Shipment");
		PageBase.click(CreateShipmentActions.reviewCreateShipmentBtn,5);
		String AccountNo = BaseWebdriver.driver.findElement(ShipmentReviewActions.accountNumber).getText();
		Reporter.log("User Clicks Continue to Manifest");
		PageBase.waitForElement(ManifestActions.ContinuetoManifest, 5);
		PageBase.click(ManifestActions.ContinuetoManifest, 5);
		ManifestActions.submitandPrintManifest();		

		//Move from Manifest to Book a PickUp
		Reporter.log("User Clicks Go To Dashboard to Book a Pick Up");
		PageBase.click(ManifestActions.GoToDashboard, 2);
		ManifestActions.manifestToBookaPickUp(NewManifestName);
		
		//Book a Pick Up Page
		PageBase.waitForElement(BookAPickupActions.TollCarrierTextField, 5);
		PageBase.verifyTextExistAttribute(BookAPickupActions.TollCarrierTextField, TollCarrier);
		String pickABookUpAccountNo = BaseWebdriver.driver.findElement(BookAPickupActions.accountNumber).getAttribute("value");
		if (pickABookUpAccountNo.contains(AccountNo)) {
			Reporter.log("Expected Text : "+AccountNo+ " Matched the Text on Screen :" +pickABookUpAccountNo);
			System.out.println("Expected Text : "+AccountNo+ " Matched the Text on Screen :" +pickABookUpAccountNo);
		}else{
			Reporter.log("FAILED: Expected Text : "+AccountNo+ " DOES NOT Match the Text on Screen :" +pickABookUpAccountNo);
			Assert.fail("FAILED: Expected Text : "+AccountNo+ " DOES NOT Match the Text on Screen :" +pickABookUpAccountNo);
		}
		BookAPickupActions.SelectItemDescriptionTollPriorityAU();
		ManifestActions.selectPickupDate();
		ManifestActions.selectReadyTimeJS("09:15");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		
		//Submit and Get PickUp Reference Number
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.ConfirmPickUpandGetReferenceNo();
		Reporter.log("---------------END OF TEST---------------");
	}
	
	

	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();
	}
	
}
