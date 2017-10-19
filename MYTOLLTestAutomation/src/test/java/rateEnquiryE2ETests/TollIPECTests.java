package rateEnquiryE2ETests;

import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import rateEnquiryActions.RateEnquiryActions;

public class TollIPECTests {
	
	String AccountNo = "2230899";
	String BillingType = "ALL FREIGHT";
	String Qty = "10";
	String QtyType = "Items";
	String Lenght = "10";
	String Width = "10";
	String Height = "10";
	String Weight = "10";
	String OriginSuburb ="MELBOURNE";
	String OriginPostCode ="3000";
	String DesSuburb ="FOOTSCRAY";
	String DesPostCode ="3011";	
	
	
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test
	@Parameters({"TollCarrierTollIPEC", "ServiceRoadExpress"})
	public void RateEnquiry_TollIPEC_E2ETest_TID_1052_Service_RoadExpress(String Carrier, String Service)
	{
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		PageBase.sendText(RateEnquiryActions.itemDescriptionType, 2, "Test_Automation");
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		PageBase.sendText(RateEnquiryActions.numberOfItem, 5, Qty);
		PageBase.sendText(BookAPickupActions.length, 2, Lenght);
		PageBase.sendText(BookAPickupActions.width, 2, Width );
		PageBase.sendText(BookAPickupActions.height, 2, Height);
		PageBase.sendText(RateEnquiryActions.weight, 2, Weight);
		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
		//Wait below needs to be fixed
		/*PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();*/
		PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, AccountNo);
		
		PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Lenght+" x "+Width+" x "+Height+" cm" );
		
	}
	
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
		BaseWebdriver.tearDown();
		//BaseWebdriver.driver.quit();
		}

}
