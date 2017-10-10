package rateEnquiryE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class TollNQXTollExpressTests {
	
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Refrigeration()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(3);
		RateEnquiryActions.SelectTollCarrierItem(3); 
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectService(6);; 
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melbo",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		//RateEnquiryActions.SelectBillingTypeTDF(1);
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	}
	
	@Test
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_DangerousGoods()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(3);
		RateEnquiryActions.SelectTollCarrierItem(3);
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectService(1);; 
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melbo",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		//RateEnquiryActions.SelectBillingTypeTDF(1);
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	
	}
	
	@Test
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Express()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(3);
		RateEnquiryActions.SelectTollCarrierItem(3);
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectService(2);; 
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melbo",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		//RateEnquiryActions.SelectBillingTypeTDF(1);
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	}
	
	
	@Test
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_General()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(3);
		RateEnquiryActions.SelectTollCarrierItem(3);
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectService(3);; 
				
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melbo",2);
	
		//BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 500)");
				
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		//RateEnquiryActions.SelectBillingTypeTDF(1);
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	}
	
	@Test
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Premium()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(3);
		RateEnquiryActions.SelectTollCarrierItem(3);
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectService(4);; 
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melbo",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 500)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		//RateEnquiryActions.SelectBillingTypeTDF(1);
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	}
	
	@Test
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_RailGeneral()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(3);
		RateEnquiryActions.SelectTollCarrierItem(3);
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectService(5);; 
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melbo",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		//RateEnquiryActions.SelectBillingTypeTDF(1);
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	}
	
	@Test
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_DGRefrigerated()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(3);
		RateEnquiryActions.SelectTollCarrierItem(3);
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectService(7);; 
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melbo",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		//RateEnquiryActions.SelectBillingTypeTDF(1);
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.AddANewLineTDF();
	
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	}
	
	
	@Test
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_RailDangerousGoods()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(3);
		RateEnquiryActions.SelectTollCarrierItem(3);
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectService(8);; 
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melbo",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		//RateEnquiryActions.SelectBillingTypeTDF(1);
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
	}
	
	@Test
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_DGExpress()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(3);
		RateEnquiryActions.SelectTollCarrierItem(3);
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectService(9);; 
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melbo",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melbo",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		//RateEnquiryActions.SelectBillingTypeTDF(1);
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.EnterBillingType("General Freight");
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	
	}
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
			//BaseWebdriver.tearDown();
	
		}

}
