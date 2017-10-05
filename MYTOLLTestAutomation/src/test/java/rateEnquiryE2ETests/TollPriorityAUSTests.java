package rateEnquiryE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class TollPriorityAUSTests {
	
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_OvernightRegionalCollection()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(5);
		
		RateEnquiryActions.SelectService(1);; 
		BookAPickupActions.SelectAccountNumber1();
		
		//RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll IPEC","Toll IPEC is a leading provider of express road freight within Australia with the capability to create customised solutions to meet our customers’ freight distribution needs, no matter their size or urgency.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Mel",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("MELBO",2);
	
		RateEnquiryActions.SelectItemDescription(3);
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		 
		RateEnquiryActions.NumberOfItem("15"); 
		//RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		RateEnquiryActions.AddANewLineNZAUS();
		
		RateEnquiryActions.ClickPriceNow();
		
		RateEnquiryActions.VerifyPricenowMessage("Note: The rate shown may change if there are any variations to the actual weight, dimensions, or locations entered above.");
		
		/*RateEnquiryActions.VerifyToatlCharge("Total Charge:");
		RateEnquiryActions.VerifyGST("GST:");
		RateEnquiryActions.VerifyRate("Rate:"); */
		
		RateEnquiryActions.ClickCreateShipment(); 
	
	}
	
	@Test
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_GlobalExpressDocuments()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(5);
		
		RateEnquiryActions.SelectService(18);; 
		BookAPickupActions.SelectAccountNumber1();
		
		//RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll IPEC","Toll IPEC is a leading provider of express road freight within Australia with the capability to create customised solutions to meet our customers’ freight distribution needs, no matter their size or urgency.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		RateEnquiryActions.SelectDestinationCountry("United States",220);
	
		RateEnquiryActions.SelectItemDescription(3);
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.NumberOfItem("15"); 
		//RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		RateEnquiryActions.AddANewLineNZAUS();
		
		RateEnquiryActions.ClickPriceNow();
		
		RateEnquiryActions.VerifyPricenowMessage("Note: The rate shown may change if there are any variations to the actual weight, dimensions, or locations entered above.");
		
		/*RateEnquiryActions.VerifyToatlCharge("Total Charge:");
		RateEnquiryActions.VerifyGST("GST:");
		RateEnquiryActions.VerifyRate("Rate:"); */
		
		RateEnquiryActions.ClickCreateShipment();
	
	}
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
		//BaseWebdriver.tearDown();
	
		}

}
