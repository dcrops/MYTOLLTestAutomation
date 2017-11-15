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

public class TollPriorityNZTests {

	
	
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceGlobalExpressParcels", "TNZAccountNo","ItemTemplateName","TNZNumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNZOriginSuburb","TNZOriginPostCode", "TNZDesSuburb", "TNZDesPostCode", "TNZCountry", "CountryPostCode"})
	public void RateEnquiry_TollPriorityNZ_E2ETest_TID_1052_Service_GlobalExpressParcels(String Carrier, String Service, String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country, String CountryPostCode) {
		
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelectCountry(Country);
		RateEnquiryActions.SelectCountryPostCode(CountryPostCode);
		
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
	@Parameters({"TollCarrierTollPrioNZ", "ServiceParcelsOffPeak", "TNZAccountNo","ItemTemplateName","TNZNumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNZOriginSuburb","TNZOriginPostCode", "TNZDesSuburb", "TNZDesPostCode"})
	public void RateEnquiry_TollPriorityNZ_E2ETest_TID_1052_Service_ParcelOffPeak(String Carrier, String Service, String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = true;
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
	@Parameters({"TollCarrierTollPrioNZ", "ServiceParcelsSameDays", "TNZAccountNo","ItemTemplateName","TNZNumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNZOriginSuburb","TNZOriginPostCode", "TNZDesSuburb", "TNZDesPostCode"})
	public void RateEnquiry_TollPriorityNZ_E2ETest_TID_1052_Service_ParcelsSameDay(String Carrier, String Service, String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = true;
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
	
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
		BaseWebdriver.tearDown();
	
		}
}
