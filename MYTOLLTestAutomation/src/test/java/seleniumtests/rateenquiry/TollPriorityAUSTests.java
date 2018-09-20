package rateEnquiryE2ETests;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Global.PageBase;
import baseWebdriver.BaseWebdriver;
import myTollHomePage.MyTollHomePageActions;
import rateEnquiry.RateEnquiryActions;

public class TollPriorityAUSTests {
	
		
	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username2 , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test(groups = {"E2E" })
	@Parameters({"TollCarrierTollPrioAU", "ServiceAusWideSatchel","TPAccountNo","ItemTemplateName","TPANumberOfItems","TPALength", "TPAWidth", "TPAHeight", "TPAWeight","TPAQtyType", "TPAOriginSuburb","TPAOriginPostCode", "TPADesSuburb", "TPADesPostCode"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_AuswideSatchel(String Carrier, String Service, String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		//BookAPickupActions.EnterAccountNumber(AccountNo);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		RateEnquiryActions.EnterItem(ItemTemplateName);
		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
		PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentAccountNo, AccountNo);
		//PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
		//PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
		Reporter.log("---------------END OF TEST---------------");
	}
	

	@Test(groups = {"E2E" })
	@Parameters({"TollCarrierTollPrioAU", "ServiceParcelsOffPeak","TPAccountNo","ItemTemplateName","TPANumberOfItems","TPALength", "TPAWidth", "TPAHeight", "TPAWeight","TPAQtyType", "TPAOriginSuburb","TPAOriginPostCode", "TPADesSuburb", "TPADesPostCode"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_ParcelOffPeak(String Carrier, String Service,String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		//BookAPickupActions.EnterAccountNumber(AccountNo);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.EnterItem(ItemTemplateName);
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
		RateEnquiryActions.VerifyLineItemIPEC(ItemTemplateName, NumberOfItems, Length, Width, Height, Weight);
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	@Test(groups = { "Shakeout Testing", "E2E" })
	@Parameters({"TollCarrierTollPrioAU", "ServiceGlobalExpressDocuments","TPAccountNo","ItemTemplateName","TPANumberOfItems","TPALength", "TPAWidth", "TPAHeight", "TPAWeight","TPAQtyType", "TPAOriginSuburb","TPAOriginPostCode", "TPADesSuburb", "TPADesPostCode", "Country"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_GlobalExpressDocuments(String Carrier, String Service,String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		//BookAPickupActions.EnterAccountNumber(AccountNo);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelectCountry(Country);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.EnterItem(ItemTemplateName);
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
		RateEnquiryActions.VerifyLineItemIPEC(ItemTemplateName, NumberOfItems, Length, Width, Height, Weight);
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	

	@AfterMethod(alwaysRun = true)
	  public void RunTearDown() throws Exception
		{
		BaseWebdriver.tearDown();
	
		}

}
