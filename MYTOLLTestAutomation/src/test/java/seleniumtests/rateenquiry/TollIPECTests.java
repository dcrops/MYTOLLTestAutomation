package rateEnquiryE2ETests;

import myTollHomePage.MyTollHomePageActions;

import static org.junit.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Global.PageBase;
import baseWebdriver.BaseWebdriver;
import rateEnquiry.RateEnquiryActions;

public class TollIPECTests {
		
	
	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username2 , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickGetRateEnquiery();
			}
	
	@Test(groups = { "Shakeout Testing", "E2E" })
	@Parameters({"TollCarrierTollIPEC", "ServiceRoadExpress", "TIPAccountNo","ItemTemplateName","TIPBillingType","TIPMode", "TIPNumberOfItems","TIPLength", "TIPWidth", "TIPHeight", "TIPWeight","TIPQtyType", "TIPOriginSuburb","TIPOriginPostCode", "TIPDesSuburb", "TIPDesPostCode"})
	public void RateEnquiry_TollIPEC_E2ETest_TID_1052_Service_RoadExpress(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode)
	{
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		//BookAPickupActions.EnterAccountNumber(AccountNo);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		RateEnquiryActions.EnterItem(ItemTemplateName);
		PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
		RateEnquiryActions.BillingType(BillingType);
		
		RateEnquiryActions.NumberOfItem(NumberOfItems);
		

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
