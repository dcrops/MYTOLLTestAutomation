package rateEnquiryE2ETests;

import GlobalActions.PageBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class TollTasmaniaTests {
	
	String AccountNo = "100428";
	String Mode = "ROAD";
	String BillingType = "General Freight";
	String Qty = "3";
	String QtyType = "Items";
	String Lenght = "33";
	String Width = "33";
	String Height = "33";
	String Weight = "3";
	String OriginSuburb ="MULGRAVE";
	String OriginPostCode ="3170";
	String DesSuburb ="GLEBE";
	String DesPostCode ="7000";	
	
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	
	@Test
	@Parameters({"TollCarrierTollTasmania", "ServiceGeneral"})
	public void RateEnquiry_TollTasmanias_E2ETest_TID_1052_Service_General(String Carrier, String Service) {
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
	}
		
	@Test
	@Parameters({"TollCarrierTollTasmania", "ServiceDGFreight"})
	public void RateEnquiry_TollTasmanias_E2ETest_TID_1052_Service_DGFreight(String Carrier, String Service) {
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
		
	}
	
	@Test
	@Parameters({"TollCarrierTollTasmania", "ServiceRefrigeration"})
	public void RateEnquiry_TollTasmanias_E2ETest_TID_1052_Service_Refrigeration(String Carrier, String Service) {
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
		
	}
	
	
	@Test
	@Parameters({"TollCarrierTollTasmania", "ServiceExpress"})
	public void RateEnquiry_TollTasmanias_E2ETest_TID_1052_Service_Express(String Carrier, String Service) {
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
		
	}

	@AfterMethod
	  public void RunTearDown() throws Exception
		{
			BaseWebdriver.tearDown();
	
		}

}
