package manifestE2ETests;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import myTollHomePageActions.MyTollHomePageActions;
import manifestActions.ManifestActions;


public class ManualManifestTollIntermodalTests {
	
	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		
	}

	
	@Test(priority = 1)
	@Parameters({"TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTSPD", "ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
		"TollExtraServiceAmount"}) 
	public void Manifest_TollIntermodal_E2ETest_TID_1127_Service_Express_AddManifestManual(String TollCarrier, String ServiceExpress,
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
		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.SelectSender(2);
		PageBase.sendText(ManifestActions.ManualManifestName, 5, NewManifestName);
		PageBase.click(ManifestActions.ManualManifestSave, 5);
		
		//Verify Manifest and proceed to shipment
		PageBase.verifyTextExist(ManifestActions.manifestHeading, "MANIFEST - "+NewManifestName);
		PageBase.click(ManifestActions.AddNewShipment, 5);
		PageBase.verifyTextExistAttribute(ManifestActions.TollCarier, TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectWhoPays(1);
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectReceiver(2);
		
		//Shipment Product Details
		PageBase.moveToElement(BookAPickupActions.itemDescriptionTextField);
		PageBase.sendText(BookAPickupActions.itemDescriptionTextField, 2, ItemTemplateName);
		CreateShipmentActions.SelectBillingType(1);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//Submit Shipment and Print Manifest
		PageBase.click(CreateShipmentActions.reviewCreateShipmentBtn,5);
		PageBase.waitForElement(ManifestActions.ContinuetoManifest, 5);
		PageBase.click(ManifestActions.ContinuetoManifest, 5);
		ManifestActions.submitandPrintManifest();		
		
		//Move from Manifest to Book a PickUp
		PageBase.click(ManifestActions.GoToDashboard, 2);
		ManifestActions.manifestToBookaPickUp(NewManifestName);
		
		//Book a Pick Up Page
		PageBase.waitForElement(BookAPickupActions.TollCarrierTextField, 5);
		PageBase.verifyTextExistAttribute(BookAPickupActions.TollCarrierTextField, TollCarrier);
		ManifestActions.selectPickupDate();
		ManifestActions.selectReadyTimeJS("09:15");
		BookAPickupActions.ClickReviewBook();
		
		//Submit and Get PickUp Reference Number
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.ConfirmPickUpandGetReferenceNo();
	}
	
	

	@AfterMethod
	public void RunTearDown() throws Exception {
		//BaseWebdriver.tearDown();
	}
	
}
