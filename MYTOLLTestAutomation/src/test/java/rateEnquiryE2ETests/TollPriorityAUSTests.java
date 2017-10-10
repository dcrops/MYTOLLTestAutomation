package rateEnquiryE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
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
	@Parameters({ "TollCarrierTollPrioAU","ServiceParcelsOffPeak"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_ParcelOffPeak(String TollCarrier,
			String ServiceParcelsOffPeak)
	{
		
		//RateEnquiryActions.SelectTollCarrierItem(5);
		RateEnquiryActions.EnterTollCarrier(TollCarrier);
		RateEnquiryActions.EnterService(ServiceParcelsOffPeak);
				
		BookAPickupActions.SelectAccountNumber1();
		
		//RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll IPEC","Toll IPEC is a leading provider of express road freight within Australia with the capability to create customised solutions to meet our customers’ freight distribution needs, no matter their size or urgency.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Mel",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("MELBO",1);
	
		RateEnquiryActions.SelectItemDescription(3);
		//BookAPickupActions.EnterItem("Automation Template");
		
		 
		//RateEnquiryActions.NumberOfItem("15"); 
		//RateEnquiryActions.QuantityType(2);
		//BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		//RateEnquiryActions.EnterWeight("3");
		
		RateEnquiryActions.AddANewLineNZAUS();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	
	}
	
	@Test 
	@Parameters({ "TollCarrierTollPrioAU", "ServiceGlobalExpressDocuments"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_GlobalExpressDocuments(String TollCarrier,
			String ServiceGlobalExpressDocuments)
	{
		
		//RateEnquiryActions.SelectTollCarrierItem(5);
		RateEnquiryActions.EnterTollCarrier(TollCarrier);
		RateEnquiryActions.EnterService(ServiceGlobalExpressDocuments);
		BookAPickupActions.SelectAccountNumber1();
		
		
		//RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll IPEC","Toll IPEC is a leading provider of express road freight within Australia with the capability to create customised solutions to meet our customers’ freight distribution needs, no matter their size or urgency.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		//RateEnquiryActions.EnterOriginSuburbPostcodeRateEnquiryTollPrioAU("Melbou","3000, MELBOURNE, VIC, AU");
		//RateEnquiryActions.SelectDestinationCountry("United States",220);
		RateEnquiryActions.EnterDestinationCountry("United States", "UNITED STATES");
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		BookAPickupActions.EnterItem("Automation Template");
		
		jse.executeScript("scroll(0, 250)");
		//RateEnquiryActions.SelectItemDescription(3);
		
	
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
