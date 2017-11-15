package rateEnquiryE2ETests;

import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
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
	

	@Test
	@Parameters({"TollCarrierTollIntermodal", "ServiceGeneral","TIAccountNo","ItemTemplateName","TIBillingType","Mode", "TINumberOfItems","TILength", "TIWidth", "TIHeight", "TIWeight","QtyType", "TIOriginSuburb","TIOriginPostCode", "TIDesSuburb", "TIDesPostCode"})
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_General(String Carrier, String Service,String AccountNo, String ItemTemplateName,String BillingType, String Mode,String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode ) {
		
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		RateEnquiryActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
		
		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
	
		PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, AccountNo);
		PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
	}
		
	@Test
	@Parameters({"TollCarrierTollIntermodal", "ServiceDGFreight","TIAccountNo","ItemTemplateName","TIBillingType","Mode", "TINumberOfItems","TILength", "TIWidth", "TIHeight", "TIWeight","QtyType", "TIOriginSuburb","TIOriginPostCode", "TIDesSuburb", "TIDesPostCode"})
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_DGFreight(String Carrier, String Service, String AccountNo, String ItemTemplateName,String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		RateEnquiryActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
		
		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
	
		PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, AccountNo);
		PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		
	}
	
	
	@Test
	@Parameters({"TollCarrierTollIntermodal", "ServiceRefrigeration","TIAccountNo","ItemTemplateName","TIBillingType","Mode", "TINumberOfItems","TILength", "TIWidth", "TIHeight", "TIWeight","QtyType", "TIOriginSuburb","TIOriginPostCode", "TIDesSuburb", "TIDesPostCode"})
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_Refrigeration(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		RateEnquiryActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);

		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
		
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
		
	}
	
	
	@Test
	@Parameters({"TollCarrierTollIntermodal", "ServiceExpress","TIAccountNo","ItemTemplateName","TIBillingType","Mode", "TINumberOfItems","TILength", "TIWidth", "TIHeight", "TIWeight","QtyType", "TIOriginSuburb","TIOriginPostCode", "TIDesSuburb", "TIDesPostCode"})
	public void RateEnquiry_TollIntermodal_E2ETest_TID_1052_Service_Express(String Carrier, String Service,String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		RateEnquiryActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
		
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
		
	}

	
	@AfterMethod
	public void RunTearDown() throws Exception {
		//BaseWebdriver.tearDown();
		BaseWebdriver.driver.quit();

	}
}
