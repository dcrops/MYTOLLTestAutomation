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

public class TollPriorityAUSTests {
	
		
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test
	@Parameters({"TollCarrierTollPrioAU", "ServiceAusWideSatchel", "TPAccountNo","ItemTemplateName","TPNumberOfItems","TPALength", "TPAWidth", "TPAHeight", "TPWeight","QtyType", "TIPOriginSuburb","TIPOriginPostCode", "TPDesSuburb", "TPDesPostCode"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_AuswideSatchel(String Carrier, String Service, String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		BookAPickupActions.EnterItem(ItemTemplateName);
		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
		RateEnquiryActions.VerifyRateEnquiryDetails_TollPriorityAUS(Carrier, Service, AccountNo, Length, Width, Height);
	}
	
	
	@Test
	@Parameters({"TollCarrierTollPrioAU", "ServiceParcelsOffPeak","TPAccountNo","ItemTemplateName","TPNumberOfItems","TIPLength", "TIPWidth", "TIPHeight", "TPWeight","QtyType", "TIPOriginSuburb","TIPOriginPostCode", "TPDesSuburb", "TPDesPostCode"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_ParcelOffPeak(String Carrier, String Service,String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		BookAPickupActions.EnterItem(ItemTemplateName);
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
		RateEnquiryActions.VerifyRateEnquiryDetails(Carrier, Service, AccountNo, Length, Width, Height);
	}
	
	
	@Test
	@Parameters({"TollCarrierTollPrioAU", "ServiceGlobalExpressDocuments","TPAccountNo","ItemTemplateName","TPNumberOfItems","TIPLength", "TIPWidth", "TIPHeight", "TPWeight","QtyType", "TIPOriginSuburb","TIPOriginPostCode", "TPDesSuburb", "TPDesPostCode", "Country"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_GlobalExpressDocuments(String Carrier, String Service,String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country) {
		
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelectCountry(Country);
		
		BookAPickupActions.EnterItem(ItemTemplateName);
	
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		
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
