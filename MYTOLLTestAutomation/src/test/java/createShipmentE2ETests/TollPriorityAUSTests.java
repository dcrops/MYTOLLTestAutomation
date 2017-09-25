package createShipmentE2ETests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;
import createShipmentActions.CreateShipmentActions;

public class TollPriorityAUSTests {
	
	//public Integer TollCarrierItem=5;
	//public Integer ServiceDXSPalletsOffpeakItem=1;
	//public Integer GlobalExpressDocumentsItem=15;
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				CreateShipmentActions.ClickShipment();
			}
	
	@Test
	@Parameters({"TollCarrierItem", "ServiceDXSPalletsOffpeakItem"})
	public void CreateShipment_TollPriorityAUS_E2ETest_TID_920_Service_OvernightRegionalCollection(Integer TollCarrierItem, Integer ServiceDXSPalletsOffpeakItem)
	{
		
		CreateShipmentActions.SelectTollCarrierItem(TollCarrierItem);
		CreateShipmentActions.SelectTollCarrierItem(TollCarrierItem);
		CreateShipmentActions.SelectService(ServiceDXSPalletsOffpeakItem);; 
		//BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(2);
		CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectSender(2); 
		CreateShipmentActions.SelectReceiver(2);
		//new WebDriverWait(BaseWebdriver.driver, 10).until(ExpectedConditions.alertIsPresent());
		//BaseWebdriver.driver.switchTo().alert().accept();
		//CreateShipmentActions.SelectShipmentConsolidated();
		CreateShipmentActions.EnterShipmentReferences("1234", "6789");
		BookAPickupActions.EnterItem("Automation Temp1");
		CreateShipmentActions.NumberOfItem("15"); 
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		CreateShipmentActions.EnterWeight("20");
		BookAPickupActions.selectDangerousGood();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
				
		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.selectDangerousGood();
		
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test
	@Parameters({"TollCarrierItem", "GlobalExpressDocumentsItem"})
	public void CreateShipment_TollPriorityAUS_E2ETest_TID_920_Service_GlobalExpressDocuments(Integer TollCarrierItem, Integer GlobalExpressDocumentsItem)
	{
		
		CreateShipmentActions.SelectTollCarrierItem(TollCarrierItem);
		CreateShipmentActions.SelectTollCarrierItem(TollCarrierItem);
		CreateShipmentActions.SelectService(GlobalExpressDocumentsItem); 
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		CreateShipmentActions.SelectSender(3);
		CreateShipmentActions.SelectReceiver(2);
		//Alert alert = BaseWebdriver.driver.switchTo().alert();
		//alert.accept();
		//CreateShipmentActions.SelectShipmentConsolidated();
		CreateShipmentActions.EnterShipmentReferences("1234", "6789");
		BookAPickupActions.EnterItem("Automation Temp1");
		CreateShipmentActions.NumberOfItem("15"); 
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		CreateShipmentActions.EnterWeight("20");
		BookAPickupActions.selectDangerousGood();
		
	
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
				
		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.selectDangerousGood();
		
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
		//BaseWebdriver.tearDown();
	
		}

}
