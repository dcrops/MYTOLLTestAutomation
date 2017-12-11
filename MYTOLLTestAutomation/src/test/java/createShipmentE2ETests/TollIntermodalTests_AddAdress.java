package createShipmentE2ETests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import myTollHomePageActions.MyTollHomePageActions;



public class TollIntermodalTests_AddAdress {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
			"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Express(String TollCarrier,
			String ServiceExpress, String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot,
			String collectionDepot, String DGContactName, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String ItemTemplateName2, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns,
			String TollExtraServiceAmount) {


		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		
		//Add Address
		CreateShipmentActions.addSenderAdderess();
		CreateShipmentActions.addReceiverAdderess(); 
		CreateShipmentActions.verifySenderAddress();
		CreateShipmentActions.verifyReceiverAddress();
	}
	
	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();
		//BaseWebdriver.driver.quit();
	}

}
