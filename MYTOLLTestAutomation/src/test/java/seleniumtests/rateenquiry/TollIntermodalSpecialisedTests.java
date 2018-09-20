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

public class TollIntermodalSpecialisedTests {
	
		
	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username2 , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	
	@Test(groups = {"E2E" })
	@Parameters({"TollIntermodalSpecialised", "ServiceGeneral","TNAccountNo","ItemTemplateName","TNBillingType","TNMode", "TNNumberOfItems","TNLength", "TNWidth", "TNHeight", "TNWeight","TNQtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollIntermodalSpecialised_E2ETest_TID_1052_Service_General(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
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
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentAccountNo, AccountNo);
		//PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
		RateEnquiryActions.VerifyLineItem(ItemTemplateName, BillingType, NumberOfItems, QtyType, Length, Width, Height, Weight);
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	@Test(groups = { "Shakeout Testing", "E2E" })
	@Parameters({"TollIntermodalSpecialised", "ServiceExpress","TNAccountNo","ItemTemplateName","TNBillingType","TNMode", "TNNumberOfItems","TNLength", "TNWidth", "TNHeight", "TNWeight","TNQtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollIntermodalSpecialised_E2ETest_TID_1052_Service_Express(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
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
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentAccountNo, AccountNo);
		//PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
		RateEnquiryActions.VerifyLineItem(ItemTemplateName, BillingType, NumberOfItems, QtyType, Length, Width, Height, Weight);
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	@Test(groups = {"E2E" })
	@Parameters({"TollIntermodalSpecialised", "ServicePremium","TNAccountNo","ItemTemplateName","TNBillingType","TNMode", "TNNumberOfItems","TNLength", "TNWidth", "TNHeight", "TNWeight","TNQtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollIntermodalSpecialised_E2ETest_TID_1052_Service_Premium(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
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
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentAccountNo, AccountNo);
		//PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
		RateEnquiryActions.VerifyLineItem(ItemTemplateName, BillingType, NumberOfItems, QtyType, Length, Width, Height, Weight);
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	@Test(groups = {"E2E" })
	@Parameters({"TollIntermodalSpecialised", "ServiceRefrigeration","TNAccountNo","ItemTemplateName","TNBillingType","TNMode", "TNNumberOfItems","TNLength", "TNWidth", "TNHeight", "TNWeight","TNQtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollIntermodalSpecialised_E2ETest_TID_1052_Service_Refrigeration(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
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
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentAccountNo, AccountNo);
		//PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
		RateEnquiryActions.VerifyLineItem(ItemTemplateName, BillingType, NumberOfItems, QtyType, Length, Width, Height, Weight);
		Reporter.log("---------------END OF TEST---------------");
	}
	
	@Test(groups = {"E2E" })
	@Parameters({"TollIntermodalSpecialised", "ServiceDangerousGoods","TNAccountNo","ItemTemplateName","TNBillingType","TNMode", "TNNumberOfItems","TNLength", "TNWidth", "TNHeight", "TNWeight","TNQtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollIntermodalSpecialised_E2ETest_TID_1052_Service_DangerousGoods(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
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
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentAccountNo, AccountNo);
		//PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
		RateEnquiryActions.VerifyLineItem(ItemTemplateName, BillingType, NumberOfItems, QtyType, Length, Width, Height, Weight);
		Reporter.log("---------------END OF TEST---------------");
	}
	
	@Test(groups = {"E2E" })
	@Parameters({"TollIntermodalSpecialised", "ServiceDGExpress","TNAccountNo","ItemTemplateName","TNBillingType","TNMode", "TNNumberOfItems","TNLength", "TNWidth", "TNHeight", "TNWeight","TNQtyType", "TNOriginSuburb","TNOriginPostCode", "TNDesSuburb", "TNDesPostCode"})
	public void RateEnquiry_TollIntermodalSpecialised_E2ETest_TID_1052_Service_DGExpress(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
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
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentAccountNo, AccountNo);
		//PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
		RateEnquiryActions.VerifyLineItem(ItemTemplateName, BillingType, NumberOfItems, QtyType, Length, Width, Height, Weight);
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	@Test(groups = { "Shakeout Testing", "E2E" })
	@Parameters({"TollIntermodalSpecialised", "ServiceFCL","FCLAccountNo","ItemTemplateName","FCLBillingType","FCLMode", "FCLNumberOfItems","FCLLength", "FCLWidth", "FCLHeight", "FCLWeight","FCLQtyType", "FCLOriginSuburb","FCLOriginPostCode", "FCLDesSuburb", "FCLDesPostCode"})
	public void RateEnquiry_TollIntermodalSpecialised_E2ETest_TID_1052_Service_FCL(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = true;
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
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentAccountNo, AccountNo);
		//PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
		RateEnquiryActions.VerifyLineItem(ItemTemplateName, BillingType, NumberOfItems, QtyType, Length, Width, Height, Weight);
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	@Test(groups = { "Shakeout Testing", "E2E" })
	@Parameters({"TollIntermodalSpecialised", "ServiceDGFCL","DGFCLAccountNo","ItemTemplateName","DGFCLBillingType","DGFCLMode", "DGFCLNumberOfItems","DGFCLLength", "DGFCLWidth", "DGFCLHeight", "DGFCLWeight","DGFCLQtyType", "DGFCLOriginSuburb","DGFCLOriginPostCode", "DGFCLDesSuburb", "DGFCLDesPostCode"})
	public void RateEnquiry_TollIntermodalSpecialised_E2ETest_TID_1052_Service_DGFCL(String Carrier, String Service,  String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = true;
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
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentAccountNo, AccountNo);
		//PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
		RateEnquiryActions.VerifyLineItem(ItemTemplateName, BillingType, NumberOfItems, QtyType, Length, Width, Height, Weight);
		Reporter.log("---------------END OF TEST---------------");
	}
	
	@AfterMethod(alwaysRun = true)
	public void RunTearDown() throws Exception
	{
		BaseWebdriver.tearDown();

	}

}
