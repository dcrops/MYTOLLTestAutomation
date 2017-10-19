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

public class TollIntermodalTests {
	
	String AccountNo = "5685";
	String Mode = "ROAD";
	String BillingType = "CARTONS - OVER 301KG";
	String Qty = "1";
	String QtyType = "Items";
	String Lenght = "20";
	String Width = "20";
	String Height = "20";
	String Weight = "100";
	String OriginSuburb ="ROWLAND FLAT";
	String OriginPostCode ="5352";
	String DesSuburb ="ALBERT PARK";
	String DesPostCode ="5014";	
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickGetRateEnquiery();
	}

	@Test
	@Parameters({"TollCarrierTollIntermodal", "ServiceGeneral"})
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_General(String Carrier, String Service) {
		
		
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		PageBase.sendText(RateEnquiryActions.itemDescriptionType, 2, "Test_Automation");
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		PageBase.sendText(RateEnquiryActions.numberOfItem, 5, Qty);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
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
		
	@Test
	@Parameters({"TollCarrierTollIntermodal", "ServiceDGFreight"})
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_DGFreight(String Carrier, String Service) {
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		PageBase.sendText(RateEnquiryActions.itemDescriptionType, 2, "Test_Automation");
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		PageBase.sendText(RateEnquiryActions.numberOfItem, 5, Qty);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
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
	
	@Test
	@Parameters({"TollCarrierTollIntermodal", "ServiceRefrigeration"})
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_Refrigeration(String Carrier, String Service) {
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		PageBase.sendText(RateEnquiryActions.itemDescriptionType, 2, "Test_Automation");
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		PageBase.sendText(RateEnquiryActions.numberOfItem, 5, Qty);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
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
	
	
	@Test
	@Parameters({"TollCarrierTollIntermodal", "ServiceExpress"})
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_Express(String Carrier, String Service) {
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		PageBase.sendText(RateEnquiryActions.itemDescriptionType, 2, "Test_Automation");
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		PageBase.sendText(RateEnquiryActions.numberOfItem, 5, Qty);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
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
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();
		//BaseWebdriver.driver.quit();

	}
}
