package rateEnquiryE2ETests;

import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import rateEnquiryActions.RateEnquiryActions;

public class TollIPECTests {
		
	
	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test(groups = { "Shakeout Testing" })
	@Parameters({"TollCarrierTollIPEC", "ServiceRoadExpress", "TIPAccountNo","ItemTemplateName","TIPBillingType","TIPMode", "TIPNumberOfItems","TIPLength", "TIPWidth", "TIPHeight", "TIPWeight","TIPQtyType", "TIPOriginSuburb","TIPOriginPostCode", "TIPDesSuburb", "TIPDesPostCode"})
	public void RateEnquiry_TollIPEC_E2ETest_TID_1052_Service_RoadExpress(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode)
	{
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		RateEnquiryActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		

		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		//Verify Details on Shipment Page
		PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, AccountNo);
		
		PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
		BaseWebdriver.tearDown();
		}

}
