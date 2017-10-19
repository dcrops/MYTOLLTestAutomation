package createShipmentE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;
import createShipmentActions.CreateShipmentActions;

public class TollPriorityNZ {
	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceGlobalExpressDocuments"})
	public void CreateShipment_TollPriorityNZ_E2ETest_TID_921_Service_GlobalExpressDocuments(String TollCarrier, String ServiceGlobalExpressDocuments)
	{
	
	//CreateShipmentActions.SelectTollCarrierItem(TollCarrier);
			BookAPickupActions.EnterTollCarrier(TollCarrier);
			CreateShipmentActions.EnterService(ServiceGlobalExpressDocuments); 
			BookAPickupActions.SelectAccountNumber1();
			CreateShipmentActions.SelectWhoPays(1);
			CreateShipmentActions.SelectSender(2);
			CreateShipmentActions.SelectReceiver(3);
			
			CreateShipmentActions.SelectShipmentConsolidated();
			CreateShipmentActions.EnterShipmentReferences("1234", "6789");
			BookAPickupActions.EnterItem("Automation Temp1");
			CreateShipmentActions.NumberOfItem("15"); 
			BookAPickupActions.EnterLengthWidthHeight("200","100","50");
			CreateShipmentActions.EnterWeight("20");
			PageBase.Scrollbar(500, 800);
			BookAPickupActions.selectDangerousGood();
			PageBase.Scrollbar(1200,1500);
			CreateShipmentActions.AddANewLineNZAUS(500,800);
			BookAPickupActions.selectDangerousGood();
			PageBase.Scrollbar(800, 1000);
			BookAPickupActions.EnterSpecialInstructions("special instructions test");
			CreateShipmentActions.ClickReviewCreateShipment();

}
	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceParcelsOffPeak"})
	public void CreateShipment_TollPriorityNZ_E2ETest_TID_921_Service_ParcelsOffPeak(String TollCarrier, String ServiceParcelsOffPeak)
	{
		
		
		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceParcelsOffPeak);
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(2);
		CreateShipmentActions.SelectSender(1); 
		//CreateShipmentActions.SelectReceiver(2);
		CreateShipmentActions.EnterReceiver("Test", "Test174");
		
		CreateShipmentActions.SelectShipmentConsolidated();
		CreateShipmentActions.EnterShipmentReferences("1234", "6789");
		BookAPickupActions.EnterItem("Automation Temp1");
		CreateShipmentActions.NumberOfItem("15"); 
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		CreateShipmentActions.EnterWeight("20");
		BookAPickupActions.selectDangerousGood();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
				
		CreateShipmentActions.AddANewLineNZAUS(500, 800);
		BookAPickupActions.selectDangerousGood();
		
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		CreateShipmentActions.ClickReviewCreateShipment();
	}
}
