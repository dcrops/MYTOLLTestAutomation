package rateEnquiryE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class TollPriorityNZTests {

	public static Integer tollCarrier=6;
	
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test
	public void RateEnquiry_TollPriorityNZ_E2ETest_TID_1052_Service_ParcelsSameDay()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
	
		RateEnquiryActions.SelectService(4);; 
		BookAPickupActions.SelectAccountNumber1();
		
		//RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll IPEC","Toll IPEC is a leading provider of express road freight within Australia with the capability to create customised solutions to meet our customers’ freight distribution needs, no matter their size or urgency.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiry("WELLINGTON",3);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("CHRISTCHURCH CENTRAL",2);
	
		RateEnquiryActions.SelectItemDescription(3);
		//BookAPickupActions.EnterItem("Automation Template");
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 500)");
		
		RateEnquiryActions.NumberOfItem("15"); 
		//RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50"); 
		RateEnquiryActions.EnterWeight("20");
		
		RateEnquiryActions.AddANewLineNZAUS();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
	
	}
	
	@Test
	public void RateEnquiry_TollPriorityNZ_E2ETest_TID_1052_Service_GlobalExpressDocuments()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
	
		RateEnquiryActions.SelectService(6);; 
		BookAPickupActions.SelectAccountNumber1();
	
		//RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll IPEC","Toll IPEC is a leading provider of express road freight within Australia with the capability to create customised solutions to meet our customers’ freight distribution needs, no matter their size or urgency.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiry("WELLINGTON",3);
		//RateEnquiryActions.SelectDestinationCountry("Australia",13);
		RateEnquiryActions.EnterDestinationCountry("Aus", "AUSTRALIA");
		RateEnquiryActions.EnterDestinationPostcode("3000");
	
		//RateEnquiryActions.SelectItemDescription(1);
		BookAPickupActions.EnterItem("Automation Template");
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
	
		
		RateEnquiryActions.NumberOfItem("15"); 
		//RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		RateEnquiryActions.AddANewLineNZAUS();
		
		RateEnquiryActions.ClickPriceNow();
		
		RateEnquiryActions.ContinueCreateShipment();
		
	
	
	}
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
		//BaseWebdriver.tearDown();
	
		}
}
