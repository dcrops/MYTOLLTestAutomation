package rateEnquiryE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class TollNQXTollExpressTests {
	
	String AccountNo = "614060";
	String Mode = "ROAD";
	String BillingType = "General Freight";
	String Qty = "3";
	String QtyType = "Items";
	String Lenght = "33";
	String Width = "33";
	String Height = "33";
	String Weight = "3";
	String OriginSuburb ="MELBOURNE";
	String OriginPostCode ="3000";
	String DesSuburb ="SYDNEY";
	String DesPostCode ="2000";	
	
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceGeneral"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_General(String Carrier, String Service) {
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
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceExpress"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Express(String Carrier, String Service) {
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
	@Parameters({"TollCarrierTollNQXTollExpress", "ServicePremium"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Premium(String Carrier, String Service) {
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
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceRefrigeration"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Refrigeration(String Carrier, String Service) {
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
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceDangerousGoods"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_DangerousGoods(String Carrier, String Service) {
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
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceDGExpress"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_DGExpress(String Carrier, String Service) {
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
	
	@AfterMethod
	public void RunTearDown() throws Exception
	{
		BaseWebdriver.tearDown();

	}

}
