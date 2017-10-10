package createShipmentE2ETests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import myTollHomePageActions.MyTollHomePageActions;
import createShipmentActions.ShipmentReviewActions;


public class TollIntermodalTests_AddAdress {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test(priority = 4)
	@Parameters({ "TollCarrierItemTollIntermodal", "ServiceDGFreight", "DropOffDepot", "CollectionDepot",
			"DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
			"Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_DGFreight(Integer TollCarrierItem,
			Integer ServiceDGFreight, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		CreateShipmentActions.SelectTollCarrierItem(3);
		CreateShipmentActions.SelectService(1);
		BookAPickupActions.SelectAccountNumber1();
		
		//Add Address
		CreateShipmentActions.addSenderAdderess();
		CreateShipmentActions.addReceiverAdderess();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		
		
	}
	
	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();
		BaseWebdriver.driver.quit();

	}

}
