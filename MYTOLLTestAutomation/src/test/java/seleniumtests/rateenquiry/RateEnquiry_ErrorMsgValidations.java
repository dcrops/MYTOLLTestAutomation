package rateEnquiryE2ETests;


import myTollHomePage.MyTollHomePageActions;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Global.PageBase;
import baseWebdriver.BaseWebdriver;
import rateEnquiry.RateEnquiryActions;

public class RateEnquiry_ErrorMsgValidations {
	
	
	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickGetRateEnquiery();
	}
	

	
	//This Test Case Covers Error Msg Validations in Rate Enquiry for all Toll Carriers
	
	@Test(groups = { "E2E" })
	@Parameters({"TollIntermodalSpecialised", "ServiceGeneral","TNAccountNo","ItemTemplateName","TIBillingType","TIMode", "TINumberOfItems","TILength", "TIWidth", "TIHeight", "TIWeight","TIQtyType", "TIOriginSuburb","TIOriginPostCode", "TIDesSuburb", "TIDesPostCode"})
	public void RateEnquiry_TollIntermodalSpecialised_E2ETest_TID_1052_Service_General(String Carrier, String Service,String AccountNo, String ItemTemplateName,String BillingType, String Mode,String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode ) {
		
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.SelectMode(Mode);
		// TES Check
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(RateEnquiryActions.tollExtraServiceLable, 10);
		PageBase.verifyTextExist(RateEnquiryActions.tollExtraServiceLable, "Toll Extra Service required");
		PageBase.isElementPresent(RateEnquiryActions.tollExtraServiceSlider, 5, "TES Slider");
		PageBase.click(RateEnquiryActions.tollExtraServiceSlider, 5);
		PageBase.verifyTextExist(RateEnquiryActions.tollExtraServiceAmountLable, "Amount");
		PageBase.isElementPresent(RateEnquiryActions.tollExtraServiceAmount, 5, "TES Amount Feild");	
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		RateEnquiryActions.NumberOfItem("9999");
		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.NumberOfItem("9999");
		//Verify Error Msgs in the Rate Enquiry Page
		Reporter.log("User Verifies Error Msg on Screen");
		//PageBase.verifyTextExist(RateEnquiryActions.errorMsgNoOfItemsExceedQty, "Rate could not be calculated as you have exceeded the maximum item limit of 250. Please edit your line items and calculate your rate again.");
		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight("9999", "9999", "9999", "9999");
		RateEnquiryActions.ClickPriceNow();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgItemDescription, "Please enter item description");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgBillingType, "Please select billing type");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgNoOfItems, "Input value must not be greater than 250");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgQuantityType, "Please enter quantity type");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgLength, "Input value must not be greater than 1500");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgWidth, "Input value must not be greater than 1500");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgCubicVolume, "Input value must not be greater than 999999.999");
		
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	@Test(groups = { "E2E" })
	@Parameters({"TollCarrierTollIPEC", "ServiceRoadExpress", "TIPAccountNo","ItemTemplateName","TIPBillingType","TIPMode", "TIPNumberOfItems","TIPLength", "TIPWidth", "TIPHeight", "TIPWeight","TIPQtyType", "TIPOriginSuburb","TIPOriginPostCode", "TIPDesSuburb", "TIPDesPostCode"})
	public void RateEnquiry_TollIPEC_E2ETest_TID_1052_Service_RoadExpress(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode)
	{
		RateEnquiryActions.valid = true;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		// TES Check
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(RateEnquiryActions.tollExtraServiceLable, 10);
		PageBase.verifyTextExist(RateEnquiryActions.tollExtraServiceLable, "Toll Extra Service required");
		PageBase.isElementPresent(RateEnquiryActions.tollExtraServiceSlider, 5, "TES Slider");
		PageBase.click(RateEnquiryActions.tollExtraServiceSlider, 5);
		PageBase.verifyTextExist(RateEnquiryActions.tollExtraServiceAmountLable, "Amount");
		PageBase.isElementPresent(RateEnquiryActions.tollExtraServiceAmount, 5, "TES Amount Feild");
	
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		RateEnquiryActions.NumberOfItem("9999");
		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.NumberOfItem("9999");
		//Verify Error Msgs in the Rate Enquiry Page
		Reporter.log("User Verifies Error Msg on Screen");
		//PageBase.verifyTextExist(RateEnquiryActions.errorMsgNoOfItemsExceedQty, "Rate could not be calculated as you have exceeded the maximum item limit of 99. Please edit your line items and calculate your rate again.");
		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight("9999", "9999", "9999", "9999");
		RateEnquiryActions.ClickPriceNow();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgItemDescription, "Please enter item description");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgBillingType, "Please select item type");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgNoOfItems, "Input value must not be greater than 99");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgLength, "Input value must not be greater than 1500");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgWidth, "Input value must not be greater than 1500");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgHeight, "Input value must not be greater than 999");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgCubicVolume, "Input value must not be greater than 10070737.36");
		
		Reporter.log("---------------END OF TEST---------------");
	}
	
	@Test(groups = { "E2E" })
	@Parameters({"TollCarrierTollPrioAU", "ServiceParcelsOffPeak","TPAccountNo","ItemTemplateName","TPANumberOfItems","TPALength", "TPAWidth", "TPAHeight", "TPAWeight","TPAQtyType", "TPAOriginSuburb","TPAOriginPostCode", "TPADesSuburb", "TPADesPostCode"})
	public void RateEnquiry_TollPriorityAUS_E2ETest_TID_1052_Service_ParcelOffPeak(String Carrier, String Service,String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		RateEnquiryActions.NumberOfItem("9999");

		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.NumberOfItem("9999");
		//Verify Error Msgs in the Rate Enquiry Page
		Reporter.log("User Verifies Error Msg on Screen");
		//PageBase.verifyTextExist(RateEnquiryActions.errorMsgNoOfItemsExceedQty, "Rate could not be calculated as you have exceeded the maximum item limit of 99. Please edit your line items and calculate your rate again.");
		RateEnquiryActions.ClickPriceNow();
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgLength, "Please enter length");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgWidth, "Please enter width");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgHeight, "Please enter height");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgWeight, "Please enter weight");
		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight("9999", "9999", "9999", "9999");
		RateEnquiryActions.ClickPriceNow();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgItemDescription, "Please enter item description");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgNoOfItems, "Input value must not be greater than 99");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgLength, "Input value must not be greater than 1500");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgWidth, "Input value must not be greater than 1500");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgCubicVolume, "Input value must not be greater than 999999.999");
		
	}
	
	
	@Test(groups = { "E2E" })
	@Parameters({"TollCarrierTollPrioNZ", "ServiceGlobalExpressParcels", "TNZAccountNo","ItemTemplateName","TNZNumberOfItems","TNZLength", "TNZWidth", "TNZHeight", "TNZWeight","TNZQtyType", "TNZOriginSuburb1","TNZOriginPostCode1", "TNZDesSuburb", "TNZDesPostCode", "TNZCountry", "CountryPostCode"})
	public void RateEnquiry_TollPriorityNZ_E2ETest_TID_1052_Service_GlobalExpressParcels(String Carrier, String Service, String AccountNo, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode, String Country, String CountryPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelectCountry(Country);
		RateEnquiryActions.SelectCountryPostCode(CountryPostCode);
		RateEnquiryActions.NumberOfItem("9999");
		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.NumberOfItem("9999");
		//Verify Error Msgs in the Rate Enquiry Page
		Reporter.log("User Verifies Error Msg on Screen");
		//PageBase.verifyTextExist(RateEnquiryActions.errorMsgNoOfItemsExceedQty, "Rate could not be calculated as you have exceeded the maximum item limit of 99. Please edit your line items and calculate your rate again.");
		RateEnquiryActions.ClickPriceNow();
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgLength, "Please enter length");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgWidth, "Please enter width");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgHeight, "Please enter height");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgWeight, "Please enter weight");
		
		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight("9999", "9999", "9999", "9999");
		RateEnquiryActions.ClickPriceNow();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgItemDescription, "Please enter item description");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgNoOfItems, "Input value must not be greater than 99");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgLength, "Input value must not be greater than 1500");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgWidth, "Input value must not be greater than 1500");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgCubicVolume, "Input value must not be greater than 999999.999");
		
	}

	
	@Test(groups = { "E2E" })
	@Parameters({"TollCarrierTollTasmania", "ServiceDGFreight","TTAccountNo","ItemTemplateName","TTBillingType","TTMode", "TTNumberOfItems","TTLength", "TTWidth", "TTHeight", "TTWeight","TTQtyType", "TTOriginSuburb","TTOriginPostCode", "TTDesSuburb", "TTDesPostCode"})
	public void RateEnquiry_TollTasmanias_E2ETest_TID_1052_Service_DGFreight(String Carrier, String Service, String AccountNo, String ItemTemplateName, String BillingType, String Mode, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String QtyType, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		
		RateEnquiryActions.valid = false;
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		//RateEnquiryActions.SelectMode(Mode);
		
		// TES Check
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(RateEnquiryActions.tollExtraServiceLable, 10);
		PageBase.verifyTextExist(RateEnquiryActions.tollExtraServiceLable, "Toll Extra Service required");
		PageBase.isElementPresent(RateEnquiryActions.tollExtraServiceSlider, 5, "TES Slider");
		PageBase.click(RateEnquiryActions.tollExtraServiceSlider, 5);
		PageBase.verifyTextExist(RateEnquiryActions.tollExtraServiceAmountLable, "Amount");
		PageBase.isElementPresent(RateEnquiryActions.tollExtraServiceAmount, 5, "TES Amount Feild");
		
		RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		RateEnquiryActions.NumberOfItem("9999");
		
		//Check for Price and Continue to Shipment
		RateEnquiryActions.ClickPriceNow();
		RateEnquiryActions.NumberOfItem("9999");
		//Verify Error Msgs in the Rate Enquiry Page
		Reporter.log("User Verifies Error Msg on Screen");
		//PageBase.verifyTextExist(RateEnquiryActions.errorMsgNoOfItemsExceedQty, "Rate could not be calculated as you have exceeded the maximum item limit of 250. Please edit your line items and calculate your rate again.");
		RateEnquiryActions.EnterLengthWidthHeightVolumeWeight("9999", "9999", "9999", "9999");
		RateEnquiryActions.ClickPriceNow();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgItemDescription, "Please enter item description");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgBillingType, "Please select billing type");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgNoOfItems, "Input value must not be greater than 250");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgQuantityType, "Please enter quantity type");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgLength, "Input value must not be greater than 1500");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgWidth, "Input value must not be greater than 1500");
		PageBase.verifyTextExist(RateEnquiryActions.errorMsgCubicVolume, "Input value must not be greater than 999999.999");
		
		Reporter.log("---------------END OF TEST---------------");
	}
	
	@AfterMethod(alwaysRun = true)
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();

	}
}
