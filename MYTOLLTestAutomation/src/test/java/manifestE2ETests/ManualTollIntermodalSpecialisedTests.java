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


public class ManualTollIntermodalSpecialisedTests {
	
	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		
	}

	
	@Test(groups = { "Shakeout Testing" })
	@Parameters({"TollIntermodalSpecialised","AccountNumberTINTER", "ServicePremium", "AccountNumberTSPD", "ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
		"TollExtraServiceAmount"}) 
	public void Manifest_TollIntermodalSpecialised_E2ETest_TID_1127_Service_Premium_AddManifestManual(String TollCarrier,String AccountNumberTINTER, String ServicePremium,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {
		
		//Random Manifest Name
		int Number = (int) (Math.random()*10000);
		String newNumber = String.valueOf(Number);
		String NewManifestName = "TESTMANIFEST"+newNumber;
		
		ManifestActions.addManifestManually();
		PageBase.MaximumWaitForElementEnabled_1();
		
		//Create Manifest Pop Up
		ManifestActions.createManifestPopUp(TollCarrier, 1, NewManifestName);
		
		//Verify Manifest and proceed to shipment
		PageBase.verifyTextExist(ManifestActions.manifestHeading, "MANIFEST - "+NewManifestName);
		Reporter.log("User Clicks Add New Shipment");
		PageBase.click(ManifestActions.AddNewShipment, 5);
		PageBase.verifyTextExistAttributeContains(ManifestActions.TollCarier, TollCarrier);
		Reporter.log("User Enters Shipment Details");
		CreateShipmentActions.EnterService(ServicePremium);
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectWhoPays(1);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		CreateShipmentActions.SelectReceiver(2);
		ManifestActions.SelectShipmentConsolidated();
		
		//Shipment Product Details
		PageBase.moveToElement(BookAPickupActions.itemDescriptionTextField);
		PageBase.sendText(BookAPickupActions.itemDescriptionTextField, 2, ItemTemplateName);
		ManifestActions.SelectBillingType(1);
		
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//Submit Shipment and Print Manifest
		Reporter.log("User Clicks Review Shipment");
		PageBase.click(CreateShipmentActions.reviewCreateShipmentBtn,5);
		String AccountNo = BaseWebdriver.driver.findElement(ShipmentReviewActions.accountNumber).getText();
		Reporter.log("User Clicks Continue to Manifest");
		PageBase.waitForElement(ManifestActions.ContinuetoManifest, 5);
		PageBase.click(ManifestActions.ContinuetoManifest, 5);
		ManifestActions.submitandPrintManifest();	
		
		//User Reprints Manifest
		Reporter.log("User Clicks Go To Dashboard to Reprint");
		PageBase.click(ManifestActions.GoToDashboard, 2);
		ManifestActions.reprintManifest(NewManifestName);

		//Move from Manifest to Book a PickUp
		Reporter.log("User Clicks Go To Dashboard to Book a Pick Up");
		PageBase.click(ManifestActions.GoToDashboard, 2);
		ManifestActions.manifestToBookaPickUp(NewManifestName);
		
		//Book a Pick Up Page
		PageBase.waitForElement(BookAPickupActions.TollCarrierTextField, 5);
		PageBase.verifyTextExistAttributeContains(BookAPickupActions.TollCarrierTextField, TollCarrier);
		PageBase.sendText(BookAPickupActions.phoneNumber, 10, "398185656");
		String pickABookUpAccountNo = BaseWebdriver.driver.findElement(BookAPickupActions.accountNumber).getAttribute("value");
		if (pickABookUpAccountNo.contains(AccountNo)) {
			Reporter.log("Expected Text : "+AccountNo+ " Matched the Text on Screen :" +pickABookUpAccountNo);
			System.out.println("Expected Text : "+AccountNo+ " Matched the Text on Screen :" +pickABookUpAccountNo);
		}else{
			Reporter.log("FAILED: Expected Text : "+AccountNo+ " DOES NOT Match the Text on Screen :" +pickABookUpAccountNo);
			Assert.fail("FAILED: Expected Text : "+AccountNo+ " DOES NOT Match the Text on Screen :" +pickABookUpAccountNo);
		}
		ManifestActions.selectPickupDate();
		ManifestActions.selectReadyTimeJS("09:15");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		
		//Submit and Get PickUp Reference Number
		PageBase.MaximumWaitForElementEnabled_1();
		BookAPickupActions.ConfirmPickUpandGetReferenceNo();
		Reporter.log("---------------END OF TEST---------------");	
		
		
	}
	
	

	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();
	}
	
}
