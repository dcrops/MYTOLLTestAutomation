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
	
/*	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceGlobalExpressParcels", "TNZAccountNo","ItemTemplateName","TNZNumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNZOriginSuburb","TNZOriginPostCode", "TNZDesSuburb", "TNZDesPostCode", "TNZCountry", "CountryPostCode"})
	public void RateEnquiry_TollPriorityNZ_E2ETest_TID_1052_Service_GlobalExpressParcels(String Carrier, String Service, String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country, String CountryPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelectCountry(Country);
		RateEnquiryActions.SelectCountryPostCode(CountryPostCode);
		
<<<<<<< HEAD
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.EnterItem(ItemTemplateName);
		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

=======
		BookAPickupActions.EnterItem(ItemTemplateName);
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		
>>>>>>> 71b800104d08d4e757c8715d096c1fcd1689978b
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
<<<<<<< HEAD
		PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, AccountNo);
		PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
=======
		RateEnquiryActions.VerifyRateEnquiryDetails(Carrier, Service, AccountNo, Length, Width, Height);
>>>>>>> 71b800104d08d4e757c8715d096c1fcd1689978b
	}
	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceParcelsOffPeak", "TNZAccountNo","ItemTemplateName","TNZNumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNZOriginSuburb","TNZOriginPostCode", "TNZDesSuburb", "TNZDesPostCode"})
	public void RateEnquiry_TollPriorityNZ_E2ETest_TID_1052_Service_ParcelOffPeak(String Carrier, String Service, String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country, String CountryPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);

<<<<<<< HEAD
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.EnterItem(ItemTemplateName);
		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
=======
		BookAPickupActions.EnterItem(ItemTemplateName);
		
	
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
>>>>>>> 71b800104d08d4e757c8715d096c1fcd1689978b

		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
<<<<<<< HEAD
		PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, AccountNo);
		PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
	}*/
=======
		RateEnquiryActions.VerifyRateEnquiryDetails(Carrier, Service, AccountNo, Length, Width, Height);
	}
>>>>>>> 71b800104d08d4e757c8715d096c1fcd1689978b
	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceParcelsSameDays", "TNZAccountNo","ItemTemplateName","TNZNumberOfItems","Length", "Width", "Height", "Weight","QtyType", "TNZOriginSuburb","TNZOriginPostCode", "TNZDesSuburb", "TNZDesPostCode"})
	public void RateEnquiry_TollPriorityNZ_E2ETest_TID_1052_Service_ParcelsSameDay(String Carrier, String Service, String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country, String CountryPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
<<<<<<< HEAD
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		RateEnquiryActions.EnterItem(ItemTemplateName);
		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
=======
		BookAPickupActions.EnterItem(ItemTemplateName);
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		RateEnquiryActions.NumberOfItem(NumberOfItems);
		
>>>>>>> 71b800104d08d4e757c8715d096c1fcd1689978b

		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.ContinueCreateShipment();
		
		//Verify Details on Shipment Page
<<<<<<< HEAD
	
		PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, AccountNo);
		PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
=======
		RateEnquiryActions.VerifyRateEnquiryDetails(Carrier, Service, AccountNo, Length, Width, Height);

>>>>>>> 71b800104d08d4e757c8715d096c1fcd1689978b
	}
	
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
		BaseWebdriver.tearDown();
	
		}
}
