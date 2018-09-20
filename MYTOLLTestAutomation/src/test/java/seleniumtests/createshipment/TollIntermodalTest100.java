package seleniumtests.createshipment;

import org.openqa.selenium.By;
import global.PageBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import bookapickup.BookAPickupActions;
import createShipment.CreateShipmentActions;
import mytollhomepage.MyTollHomePageActions;


public class TollIntermodalTest100 {
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}



	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "DropOffDepot", "CollectionDepot", "DGContactName",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height",
			"Weight","DGYes", "DGNo", "BillingType", "SpeceialIns" }) 
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Express(String TollCarrier,
			String ServiceExpress, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		//CreateShipmentActions.SelectTollCarrierItem(TollCarrierItem);
		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);
		//CreateShipmentActions.SelectService(ServiceExpress);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		
		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		
		 CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.Scrollbar(500, 800);
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
		

		for (int i = 0; i<100 ; i++) {
			PageBase.moveToElement(BookAPickupActions.itemDescriptionTextField);
			PageBase.sendText(BookAPickupActions.itemDescriptionTextField, 10, "Automation Template1");
			PageBase.click(By.xpath("//*[@id=\"freight-type-selector\"]/div[2]/ul/li[4]/div"), 1);
			BookAPickupActions.SelectDangerousGoods(DGNo);
			PageBase.moveToElement(CreateShipmentActions.addNewLine);
			BaseWebdriver.driver.findElement(CreateShipmentActions.addNewLine).click();
			PageBase.MaximumWaitForElementEnabled();
			System.out.println("Loop no :"+i);
		}

		
		//CreateShipmentActions.AddANewLineNZAUS();
		//BookAPickupActions.SelectDangerousGoods(DGNo);

		//BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		//CreateShipmentActions.ClickReviewCreateShipment();
		
		
	}
	
	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();
		//BaseWebdriver.driver.quit();

	}
	
}
