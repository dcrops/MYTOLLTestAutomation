package rateEnquiryStepDefinitions;

import java.util.Map;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class RateEnquiryStepDefinitions {
	
		
	@Given("^User is Registered in MyToll and is on Rate Enquiry Page$")
	public void user_is_Registered_in_MyToll_and_is_on_Book_a_pickup_page() throws Throwable {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickGetRateEnquiery();
		
		//Test
	}

	@When("^User selects Toll Carrier$")
	public void userSelectsTollCarrierTollTPEC(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {
				   
				RateEnquiryActions.EnterTollCarrier(rateEnquiry.get("TollCarrier"));
			   }
	}
	
	@And("^User select Service$")
	public void userSelectsService(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				RateEnquiryActions.EnterService(rateEnquiry.get("Service"));
			   }
	}
	
	@And("^User Enters and selects Account$")
	public void userEntersandSelectsService(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				RateEnquiryActions.EnterAccountNumberAndSelect(rateEnquiry.get("Account"));
			   }
	}
	
	@Then("^User Enters Orgin and Destination$")
	public void userEntersOrginAndDestination(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				RateEnquiryActions.SelectOrigin(rateEnquiry.get("OriginSuburb"), rateEnquiry.get("OriginPostCode"));
				RateEnquiryActions.SelecDestination(rateEnquiry.get("DesSuburb"), rateEnquiry.get("DesPostCode"));
			   }
	}
	
	
	@And("^User Enters Line Items for Rate Enquiry$")
	public void userEntersLineItems(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				RateEnquiryActions.EnterItem(rateEnquiry.get("ItemTemplateName"));
				RateEnquiryActions.NumberOfItem(rateEnquiry.get("NumberOfItems"));
				RateEnquiryActions.EnterLengthWidthHeightVolumeWeight(rateEnquiry.get("Length"), rateEnquiry.get("Width"), rateEnquiry.get("Height"), rateEnquiry.get("Weight"));
			   }
	}
	
	@And("^User Selects Item type$")
	public void userSelectsItemType(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				PageBase.moveToElement(RateEnquiryActions.billingTypeTDF);
				RateEnquiryActions.BillingType(rateEnquiry.get("BillingType"));;
			   }
	}
	
	
	@When("^User Clicks Price Now$")
	public void userClicksPriceNow() throws Throwable {
	RateEnquiryActions.ClickPriceNow();
	}
	
	@Then("^User Verifies Price and Continues to Shipment$")
	public void userVerifiesPriceAndContinueToShipment() throws Throwable {
		RateEnquiryActions.ContinueCreateShipment();
	}
	
	@Then("^User Verifies Details on Shipment Page$")
	public void userVerifiesDetailsOnShipmentPage(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
				PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, rateEnquiry.get("TollCarrier"));
				PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, rateEnquiry.get("Service"));
				PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, rateEnquiry.get("Account"));
				PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, rateEnquiry.get("Length")+"cm x "+rateEnquiry.get("Width")+" cm x "+rateEnquiry.get("Height")+"cm" );
				PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
				Reporter.log("---------------END OF TEST---------------");
			}
	}


	@Then("^UTESser Verifies Details on Shipment Page$")
	public void userVerifieTESTsDetailsOnShipmentPage(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
				PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, rateEnquiry.get("TollCarrier"));
				PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, rateEnquiry.get("Service"));
				PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, rateEnquiry.get("Account"));
				PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, rateEnquiry.get("Length")+"cm x "+rateEnquiry.get("Width")+" cm x "+rateEnquiry.get("Height")+"cm" );
				PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
				Reporter.log("---------------END OF TEST---------------");
				Reporter.log("New Merge");
			}
	}

	

}
