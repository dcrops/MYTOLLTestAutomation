package rateEnquiryE2ETests;

import GlobalActions.PageBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class TollTasmaniaTests {
	
	public static Integer tollCarrier=2;
	
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test(priority=1)
	public void RateEnquiry_TollTasmania_E2ETest_TID_1052_Service_Refrigeration() 
	{
		
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectService(1);
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melb",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melb",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		RateEnquiryActions.SelectBillingTypeTDF(1);
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		
		RateEnquiryActions.VerifyPricenowMessage("Note: The rate shown may change if there are any variations to the actual weight, dimensions, or locations entered above.");
		
		/*RateEnquiryActions.VerifyToatlCharge("Total Charge:");
		RateEnquiryActions.VerifyGST("GST:");
		RateEnquiryActions.VerifyRate("Rate:"); */
		
		RateEnquiryActions.ClickCreateShipment();
	
	}
	
	@Test(priority=2)
	public void RateEnquiry_TollTasmanias_E2ETest_TID_1052_Service_DGFreight()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
		RateEnquiryActions.SelectService(2);
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melb",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melb",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		RateEnquiryActions.SelectBillingTypeItem1TDF(1);
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		
		RateEnquiryActions.VerifyPricenowMessage("Note: The rate shown may change if there are any variations to the actual weight, dimensions, or locations entered above.");
		
		/*RateEnquiryActions.VerifyToatlCharge("Total Charge:");
		RateEnquiryActions.VerifyGST("GST:");
		RateEnquiryActions.VerifyRate("Rate:"); */
		
		RateEnquiryActions.ClickCreateShipment();
	
	}
	
	@Test(priority=3)
	public void RateEnquiry_TollTasmania_E2ETest_TID_1052_Service_Express()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
		RateEnquiryActions.SelectService(3);
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melb",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melb",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		RateEnquiryActions.SelectBillingTypeItem1TDF(1);
		RateEnquiryActions.AddANewLineTDF();
		
		RateEnquiryActions.ClickPriceNow();
		
		RateEnquiryActions.VerifyPricenowMessage("Note: The rate shown may change if there are any variations to the actual weight, dimensions, or locations entered above.");
		
		/*RateEnquiryActions.VerifyToatlCharge("Total Charge:");
		RateEnquiryActions.VerifyGST("GST:");
		RateEnquiryActions.VerifyRate("Rate:"); */
		
		RateEnquiryActions.ClickCreateShipment();
	
	}
	
	@Test(priority=4)
	public void RateEnquiry_TollTasmania_E2ETest_TID_1052_Service_General()
	{
		
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
		RateEnquiryActions.SelectTollCarrierItem(tollCarrier);
		RateEnquiryActions.SelectService(4);
		//WebElement.sendKeys(Keys.RETURN);
		//new WebDriverWait(BaseWebdriver.driver, 10).until(ExpectedConditions.alertIsPresent());
		//BaseWebdriver.driver.switchTo().alert().accept();
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		
		RateEnquiryActions.SelectModeItem(1); 
		//RateEnquiryActions.VerifyMessage("Toll NQX | Toll Express", "Backed by an unbeatable national network, we deliver freight and logistics solutions across Australia that are driven by our commitment to innovation, safety and service excellence.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiryTollNQX("Melb",1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("Melb",2);
	
		BookAPickupActions.SelectAccountNumber1();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		
		RateEnquiryActions.SelectItemDescription(1);
		
		RateEnquiryActions.NumberOfItem("15"); 
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200","100","50");
		RateEnquiryActions.EnterWeight("20");
		
		RateEnquiryActions.SelectBillingTypeItem1TDF(1);
		RateEnquiryActions.AddANewLineTDF();
		
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
