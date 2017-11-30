package createShipmentE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import myTollHomePageActions.MyTollHomePageActions;
import baseWebdriver.BaseWebdriver;


public class TollPriorityNZ {
	
	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}
	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceGlobalExpressDocuments", "SenderEmail", "ReceiverEmail","ShipmentRef1", "ShipmentRef2","ItemTemplateName","BillingType","NumberOfItems", "Length", "Width", "Height", "Weight","ItemTemplateName2", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2","SpeceialIns"})
	public void CreateShipment_TollPriorityNZ_E2ETest_TID_921_Service_GlobalExpressDocuments(String TollCarrier, String ServiceGlobalExpressDocuments, String SenderEmail, String ReceiverEmail,String ShipmentRef1,
			String ShipmentRef2,String ItemTemplateName, String BillingType, String NumberOfItems, String Length, String Width, String Height, String Weight,String ItemTemplateName2,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, String SpeceialIns)
	{
	
	//CreateShipmentActions.SelectTollCarrierItem(TollCarrier);
			BookAPickupActions.EnterTollCarrier(TollCarrier);
			CreateShipmentActions.EnterService(ServiceGlobalExpressDocuments); 
			BookAPickupActions.SelectAccountNumber1();
			CreateShipmentActions.SelectWhoPays(1);
			CreateShipmentActions.SelectSender(2);
			CreateShipmentActions.SelectReceiver(3);
			
			CreateShipmentActions.SelectShipmentConsolidated();

			CreateShipmentActions.EnterSenderEmail(SenderEmail);
			CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
			CreateShipmentActions.EnterShipmentReference1(ShipmentRef1);
			BookAPickupActions.EnterItem(ItemTemplateName);
			CreateShipmentActions.NumberOfItem(NumberOfItems); 
			BookAPickupActions.EnterLengthWidthHeight(Length,Width,Height);
			CreateShipmentActions.EnterWeight(Weight);
			BookAPickupActions.selectDangerousGood();
			PageBase.Scrollbar(1200,1500);
			CreateShipmentActions.AddANewLineNZAUS(1000, 1500,ItemTemplateName2,BillingType,NumberOfItems2, Length2, Width2, Height2, Weight2,ShipmentRef1, ShipmentRef2);
			BookAPickupActions.selectDangerousGood();
			PageBase.Scrollbar(800, 1000);
			BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
			CreateShipmentActions.ClickReviewCreateShipment();

}
	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceParcelsOffPeak", "SenderEmail", "ReceiverEmail","ShipmentRef1", "ShipmentRef2","ItemTemplateName","BillingType","NumberOfItems", "Length", "Width", "Height", "Weight","ItemTemplateName2", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2","SpeceialIns"})
	public void CreateShipment_TollPriorityNZ_E2ETest_TID_921_Service_ParcelsOffPeak(String TollCarrier, String ServiceParcelsOffPeak, String SenderEmail, String ReceiverEmail,String ShipmentRef1,
			String ShipmentRef2,String ItemTemplateName, String BillingType, String NumberOfItems, String Length, String Width, String Height, String Weight, String ItemTemplateName2,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2,String SpeceialIns)
	{
		
		
		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceParcelsOffPeak);
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(2);
		CreateShipmentActions.SelectSender(1); 
		CreateShipmentActions.SelectReceiver(3);
		//CreateShipmentActions.EnterReceiver("Test", "Test174");
		
		CreateShipmentActions.SelectShipmentConsolidated();

		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		CreateShipmentActions.EnterShipmentReference1(ShipmentRef1);
		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems); 
		BookAPickupActions.EnterLengthWidthHeight(Length,Width,Height);
		CreateShipmentActions.EnterWeight(Weight);
		BookAPickupActions.selectDangerousGood();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
				
		CreateShipmentActions.AddANewLineNZAUS(1000, 1500,ItemTemplateName2,BillingType,NumberOfItems2, Length2, Width2, Height2, Weight2,ShipmentRef1, ShipmentRef2);
		BookAPickupActions.selectDangerousGood();
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
	}
}
