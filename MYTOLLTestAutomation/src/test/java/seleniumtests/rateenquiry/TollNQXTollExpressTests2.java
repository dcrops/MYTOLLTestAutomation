package seleniumtests.rateenquiry;


import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import global.PageBase;
import baseWebdriver.BaseWebdriver;
import mytollhomepage.MyTollHomePageActions;
import rateenquiry.RateEnquiryActions;

public class TollNQXTollExpressTests2 {
	
		
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username2 , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceGeneral","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_General(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		this.TollNQXTollExpress_Actions(Carrier, Service, AccountNo, ItemTemplateName, BillingType, Mode, NumberOfItems, 
				Length, Width, Height, Weight, QtyType, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
	}
	
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceExpress","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Express(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		this.TollNQXTollExpress_Actions(Carrier, Service, AccountNo, ItemTemplateName, BillingType, Mode, NumberOfItems, 
				Length, Width, Height, Weight, QtyType, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
	}
	
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServicePremium","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Premium(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		this.TollNQXTollExpress_Actions(Carrier, Service, AccountNo, ItemTemplateName, BillingType, Mode, NumberOfItems, 
				Length, Width, Height, Weight, QtyType, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
	}
	
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceRefrigeration","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_Refrigeration(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		this.TollNQXTollExpress_Actions(Carrier, Service, AccountNo, ItemTemplateName, BillingType, Mode, NumberOfItems, 
				Length, Width, Height, Weight, QtyType, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
	}
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceDangerousGoods","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_DangerousGoods(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		this.TollNQXTollExpress_Actions(Carrier, Service, AccountNo, ItemTemplateName, BillingType, Mode, NumberOfItems, 
				Length, Width, Height, Weight, QtyType, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
	}
	
	@Test
	@Parameters({"TollCarrierTollNQXTollExpress", "ServiceDGExpress","TNAccountNo","ItemTemplateName","BillingType","Mode", "NumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollNQXTollExpress_E2ETest_TID_1052_Service_DGExpress(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		this.TollNQXTollExpress_Actions(Carrier, Service, AccountNo, ItemTemplateName, BillingType, Mode, NumberOfItems, 
				Length, Width, Height, Weight, QtyType, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
	}
	
	// Actions for Rate Enquiry
		private void TollNQXTollExpress_Actions(String Carrier, String Service, String AccountNo, String ItemTemplateName,String BillingType, String Mode,String NumberOfItems, String Length, String Width,
				String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode ) {
			
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
			PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
			Reporter.log("---------------END OF TEST---------------");
		}
		
		// Actions for Rate Enquiry
				private void TollNQXTollExpress_Actions2(String Carrier, String Service, String AccountNo, String ItemTemplateName,String BillingType, String Mode,String NumberOfItems, String Length, String Width,
						String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode ) {
					
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
					PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
					Reporter.log("---------------END OF TEST---------------");
				}
		
		
	
	@AfterMethod
	public void RunTearDown() throws Exception
	{
		BaseWebdriver.tearDown();

	}

}
