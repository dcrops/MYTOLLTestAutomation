package rateEnquiryE2ETests;

import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import rateEnquiryActions.RateEnquiryActions;

public class TollIntermodalTests {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickGetRateEnquiery();
	}

	@Test(priority = 1)
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_Refrigeration() {

		RateEnquiryActions.SelectTollCarrierItem(1);

		RateEnquiryActions.SelectService(1);
		BookAPickupActions.SelectAccountNumber1();

		RateEnquiryActions.SelectModeItem(1);

		// RateEnquiryActions.VerifyMessage("Toll Intermodal","Toll Intermodal is a
		// freight transport partner of choice, offering end-to-end road, rail, coastal
		// shipping and wharf cartage services. We have an extensive range of linehaul
		// equipment that enables us to meet our customers� diverse requirements.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiry("Melb", 1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("MEL", 2);

		RateEnquiryActions.SelectItemDescription(2);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 500)");

		RateEnquiryActions.NumberOfItem("15");
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		RateEnquiryActions.EnterWeight("20");

		RateEnquiryActions.SelectBillingTypeTDF(1);

		RateEnquiryActions.AddANewLineTDF();

		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
	}

	@Test(priority = 2)
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_Express() {

		RateEnquiryActions.SelectTollCarrierItem(1);

		RateEnquiryActions.SelectService(3);
		;
		BookAPickupActions.SelectAccountNumber1();

		RateEnquiryActions.SelectModeItem(1);
		// RateEnquiryActions.VerifyMessage("Toll Intermodal ","Toll Intermodal is a
		// freight transport partner of choice, offering end-to-end road, rail, coastal
		// shipping and wharf cartage services. We have an extensive range of linehaul
		// equipment that enables us to meet our customers� diverse requirements.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiry("Melb", 1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("MEL", 2);

		RateEnquiryActions.SelectItemDescription(2);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

		RateEnquiryActions.NumberOfItem("15");
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		RateEnquiryActions.EnterWeight("20");

		RateEnquiryActions.SelectBillingTypeTDF(1);

		RateEnquiryActions.AddANewLineTDF();

		RateEnquiryActions.ClickPriceNow();

	}

	@Test(priority = 3)
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_DGFreight() {

		RateEnquiryActions.SelectTollCarrierItem(1);

		RateEnquiryActions.SelectService(2);
		;
		BookAPickupActions.SelectAccountNumber1();

		RateEnquiryActions.SelectModeItem(1);
		// RateEnquiryActions.VerifyMessage("Toll Intermodal ","Toll Intermodal is a
		// freight transport partner of choice, offering end-to-end road, rail, coastal
		// shipping and wharf cartage services. We have an extensive range of linehaul
		// equipment that enables us to meet our customers� diverse requirements.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiry("Melb", 1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("MEL", 2);
		RateEnquiryActions.SelectItemDescription(2);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

		RateEnquiryActions.NumberOfItem("15");
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		RateEnquiryActions.EnterWeight("20");
		RateEnquiryActions.SelectBillingTypeTDF(1);

		RateEnquiryActions.AddANewLineTDF();
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	}

	@Test(priority = 4)
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_General() {

		RateEnquiryActions.SelectTollCarrierItem(1);

		RateEnquiryActions.SelectService(4);
		;
		BookAPickupActions.SelectAccountNumber1();

		RateEnquiryActions.SelectModeItem(1);
		// RateEnquiryActions.VerifyMessage("Toll Intermodal ","Toll Intermodal is a
		// freight transport partner of choice, offering end-to-end road, rail, coastal
		// shipping and wharf cartage services. We have an extensive range of linehaul
		// equipment that enables us to meet our customers� diverse requirements.");
		RateEnquiryActions.SelectOriginSuburbPostcodeRateEnquiry("Melb", 1);
		RateEnquiryActions.SelectDestinationSuburbPostcodeRateEnquiry("MEL", 2);

		RateEnquiryActions.SelectItemDescription(2);
		
		RateEnquiryActions.NumberOfItem("15");
		RateEnquiryActions.QuantityType(2);
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		RateEnquiryActions.EnterWeight("20");
		RateEnquiryActions.SelectBillingTypeTDF(1);

		RateEnquiryActions.AddANewLineTDF();
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();

	}
}
