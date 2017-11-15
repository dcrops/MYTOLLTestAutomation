package rateEnquiryE2ETests;
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
	
		
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceGeneral","TNAccountNo","ItemTemplateName","BillingType","Mode", "TNNumberOfItems","TNLength", "TNWidth", "TNHeight", "TNWeight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_General(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		BookAPickupActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		

		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
		RateEnquiryActions.VerifyRateEnquiryDetails(Carrier, Service, AccountNo, Length, Width, Height);
	}
	
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceExpress","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Express(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		BookAPickupActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

			
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
		RateEnquiryActions.VerifyRateEnquiryDetails(Carrier, Service, AccountNo, Length, Width, Height);
	}
	
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServicePremium","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Premium(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		BookAPickupActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
				
		//Verify Details on Shipment Page
		RateEnquiryActions.VerifyRateEnquiryDetails(Carrier, Service, AccountNo, Length, Width, Height);
	}
	
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceRefrigeration","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Refrigeration(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		BookAPickupActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
		RateEnquiryActions.VerifyRateEnquiryDetails(Carrier, Service, AccountNo, Length, Width, Height);
	}
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceDangerousGoods","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_DangerousGoods(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		BookAPickupActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
		RateEnquiryActions.VerifyRateEnquiryDetails(Carrier, Service, AccountNo, Length, Width, Height);
	}
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceDGExpress","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_DGExpress(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		BookAPickupActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.QuantityTypeSelect(QtyType);	
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
		RateEnquiryActions.VerifyRateEnquiryDetails(Carrier, Service, AccountNo, Length, Width, Height);

	}
	
	@AfterMethod
	public void RunTearDown() throws Exception
	{
		BaseWebdriver.tearDown();

	}

}
