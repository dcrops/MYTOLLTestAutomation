package rateEnquiryE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class TollIPECTests {
	
	public static Integer tollCarrier=4;
	
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test
	public void RateEnquiry_TollIPEC_E2ETest_TID_1052_Service_Refrigeration()
	{
		 
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
		RateEnquiryActions.SelectService(1);; 
		BookAPickupActions.SelectAccountNumber1();
		
		//RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll IPEC","Toll IPEC is a leading provider of express road freight within Australia with the capability to create customised solutions to meet our customers’ freight distribution needs, no matter their size or urgency.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiry("Mel",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("MEL",2);
	
		RateEnquiryActions.SelectItemDescription(1);
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.NumberOfGarments("10");
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		RateEnquiryActions.AddANewLine();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	
	}
	
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
			//EnvConfig.tearDown();
	
		}

}
