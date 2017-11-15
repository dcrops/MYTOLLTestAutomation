package createShipmentE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import baseWebdriver.BaseWebdriver;


public class TollPriorityNZ {
	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceGlobalExpressDocuments", "ShipmentRef1", "ShipmentRef2","ItemTemplateName","NumberOfItems", "Length", "Width", "Height", "Weight","SpeceialIns"})
	public void CreateShipment_TollPriorityNZ_E2ETest_TID_921_Service_GlobalExpressDocuments(String TollCarrier, String ServiceGlobalExpressDocuments, String ShipmentRef1,
			String ShipmentRef2,String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight, String SpeceialIns)
	{
	
	//CreateShipmentActions.SelectTollCarrierItem(TollCarrier);
			BookAPickupActions.EnterTollCarrier(TollCarrier);
			CreateShipmentActions.EnterService(ServiceGlobalExpressDocuments); 
			BookAPickupActions.SelectAccountNumber1();
			CreateShipmentActions.SelectWhoPays(1);
			CreateShipmentActions.SelectSender(2);
			CreateShipmentActions.SelectReceiver(3);
			
			CreateShipmentActions.SelectShipmentConsolidated();
			CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
			BookAPickupActions.EnterItem(ItemTemplateName);
			CreateShipmentActions.NumberOfItem(NumberOfItems); 
			BookAPickupActions.EnterLengthWidthHeight(Length,Width,Height);
			CreateShipmentActions.EnterWeight(Weight);
			BookAPickupActions.selectDangerousGood();
			PageBase.Scrollbar(1200,1500);
			CreateShipmentActions.AddANewLineNZAUS(500,800);
			BookAPickupActions.selectDangerousGood();
			PageBase.Scrollbar(800, 1000);
			BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
			CreateShipmentActions.ClickReviewCreateShipment();

}
	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceParcelsOffPeak", "ShipmentRef1", "ShipmentRef2","ItemTemplateName","NumberOfItems", "Length", "Width", "Height", "Weight","SpeceialIns"})
	public void CreateShipment_TollPriorityNZ_E2ETest_TID_921_Service_ParcelsOffPeak(String TollCarrier, String ServiceParcelsOffPeak, String ShipmentRef1,
			String ShipmentRef2,String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight, String SpeceialIns)
	{
		
		
		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceParcelsOffPeak);
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(2);
		CreateShipmentActions.SelectSender(1); 
		//CreateShipmentActions.SelectReceiver(2);
		CreateShipmentActions.EnterReceiver("Test", "Test174");
		
		CreateShipmentActions.SelectShipmentConsolidated();
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems); 
		BookAPickupActions.EnterLengthWidthHeight(Length,Width,Height);
		CreateShipmentActions.EnterWeight(Weight);
		BookAPickupActions.selectDangerousGood();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
				
		CreateShipmentActions.AddANewLineNZAUS(500, 800);
		BookAPickupActions.selectDangerousGood();
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
	}
}
