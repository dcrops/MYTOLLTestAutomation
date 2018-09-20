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

public class TollPriorityAUSTests2 {
	
		
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username2 , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test
	@Parameters({"TollCarrierTollPrioAU", "ServiceAusWideSatchel", "TPAccountNo","ItemTemplateName","TPNumberOfItems","TIPLength", "TIPWidth", "TIPHeight", "TPWeight","QtyType", "TIPOriginSuburb","TIPOriginPostCode", "TPDesSuburb", "TPDesPostCode", "Country"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_AuswideSatchel(String Carrier, String Service, String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		this.TollPriority_Actions(Carrier, Service, AccountNo, ItemTemplateName, NumberOfItems,
				Length, Width, Height, Weight, QtyType, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode, Country);
	}
	

	@Test
	@Parameters({"TollCarrierTollPrioAU", "ServiceParcelsOffPeak","TPAccountNo","ItemTemplateName","TPNumberOfItems","TIPLength", "TIPWidth", "TIPHeight", "TPWeight","QtyType", "TIPOriginSuburb","TIPOriginPostCode", "TPDesSuburb", "TPDesPostCode", "Country"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_ParcelOffPeak(String Carrier, String Service,String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		this.TollPriority_Actions(Carrier, Service, AccountNo, ItemTemplateName, NumberOfItems,
				Length, Width, Height, Weight, QtyType, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode, Country);
	}
	
	
	@Test
	@Parameters({"TollCarrierTollPrioAU", "ServiceGlobalExpressDocuments","TPAccountNo","ItemTemplateName","TPNumberOfItems","TIPLength", "TIPWidth", "TIPHeight", "TPWeight","QtyType", "TIPOriginSuburb","TIPOriginPostCode", "TPDesSuburb", "TPDesPostCode", "Country"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_GlobalExpressDocuments(String Carrier, String Service,String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		this.TollPriority_Actions(Carrier, Service, AccountNo, ItemTemplateName, NumberOfItems,
				Length, Width, Height, Weight, QtyType, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode, Country);
	}
	
	// Actions for Rate Enquiry
		private void TollPriority_Actions(String Carrier, String Service,String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
				String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country) { 
			
			RateEnquiryActions.valid = false;
			RateEnquiryActions.EnterTollCarrier(Carrier);
			RateEnquiryActions.EnterService(Service);
			RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
			RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
			
			if (Service.contains("global")) {
			RateEnquiryActions.SelectCountry(Country);
			}
			else {
				RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);	
			}
			
			if (Service.contains("Satchel")) {
				RateEnquiryActions.EnterItem(ItemTemplateName);
			}
			else {
				RateEnquiryActions.NumberOfItem(NumberOfItems);
				RateEnquiryActions.EnterItem(ItemTemplateName);
				RateEnquiryActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
			}
			//Check for Price and Continue to Shipment
			RateEnquiryActions.ClickPriceNow();
			RateEnquiryActions.ContinueCreateShipment();
			
			//Verify Details on Shipment Page
			PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
			PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, Carrier);
			PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
			PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, AccountNo);
			if (Service.contains("Satchel") == false) {
			PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );
			}
			PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
			Reporter.log("---------------END OF TEST---------------");
			
		}
			
	
	

	@AfterMethod
	  public void RunTearDown() throws Exception
		{
		BaseWebdriver.tearDown();
	
		}

}
