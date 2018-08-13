package createShipmentE2ETests;


import java.awt.print.Pageable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.Page;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import myTollHomePageActions.MyTollHomePageActions;



public class TollCarrierIntermodalSpecialized_addAddress {

	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test(groups = { "Shakeout Testing", "E2E", "Nishant" })
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceExpress", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
			"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollCarrierIntermodalSpecialized_AddAddress(String TollCarrier,
			String ServiceExpress, String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot,
			String collectionDepot, String DGContactName, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String ItemTemplateName2, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns,
			String TollExtraServiceAmount) {


		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		
		//Add Address
		CreateShipmentActions.addSenderAdderess();
		CreateShipmentActions.addReceiverAdderess(); 
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		System.out.println("About to enter the Verify Sender Address function");
		
		
		
		CreateShipmentActions.verifySenderAddress();
		

		CreateShipmentActions.verifyReceiverAddress();
	}
	
	@AfterMethod(alwaysRun = true)
	public void RunTearDown() throws Exception {
//		BaseWebdriver.tearDown();
		//BaseWebdriver.driver.quit();
	}

}
