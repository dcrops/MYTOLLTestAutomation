package rateEnquiryStepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class RateEnquiryStepDefinitions {
	
	public static String SenderRateEnquiry;
	public static String SenderShipmentPage;
	public static String SenderLocRateEnquiry;
	public static String SenderLocShipmentPage;
	public static String ReceiverRateEnquiry;
	public static String ReceiverShipmentPage;
	public static String ReceiverLocRateEnquiry;
	public static String ReceiverLocShipmentPage;
	public static String fullChargeBeforeDraft;
	public static String fullChargeAfterDraft;

		
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
	
	@Then("^User Enters Orgin$")
	public void userEntersOrgin(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				RateEnquiryActions.SelectOrigin(rateEnquiry.get("OriginSuburb"), rateEnquiry.get("OriginPostCode"));
			   }
	}
	
	@Then("^User Enters Destination$")
	public void userEntersDestination(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				RateEnquiryActions.SelecDestination(rateEnquiry.get("DesSuburb"), rateEnquiry.get("DesPostCode"));
			   }
	}
	
	
	@And("^User Enters Line Items for Rate Enquiry$")
	public void userEntersLineItems(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				PageBase.MinimumWaitForElementEnabled_1();
				RateEnquiryActions.NumberOfItem(rateEnquiry.get("NumberOfItems"));
				RateEnquiryActions.EnterItem(rateEnquiry.get("ItemTemplateName"));
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
	
	@And("^User Selects Quantity type$")
	public void userSelectsQuantityType(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				RateEnquiryActions.QuantityTypeSelect(rateEnquiry.get("QtyType"));	
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
				PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, rateEnquiry.get("TollCarrier"));
				PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, rateEnquiry.get("Service"));
				PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentAccountNo, rateEnquiry.get("Account"));
				//PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, rateEnquiry.get("Length")+"cm x "+rateEnquiry.get("Width")+" cm x "+rateEnquiry.get("Height")+"cm" );
				PageBase.waitForPageLoadingEnd(RateEnquiryActions.PageLoadingBox, 15, "Create Shipment");
			}
	}

	@Then("^User Verifies if Sender is pre selected from addressbook$")
	public void UserVerifiesIfSenderIsPreSelectedFromAddressbook() throws Throwable {
		SenderShipmentPage = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(SenderShipmentPage);
		
		SenderLocShipmentPage = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(SenderLocShipmentPage);
		
		if (SenderRateEnquiry.contentEquals(SenderShipmentPage) & SenderLocRateEnquiry.contentEquals(SenderLocShipmentPage)) {
			System.out.println("Sender Details from Rate Enquiry to Shipment Page - MATCHES as EXPECTED");	
			Reporter.log("Sender Details from Rate Enquiry to Shipment Page  - MATCHES as EXPECTED");
		}
		else {
			System.out.println("FAILED: Sender Details from Rate Enquiry to Shipment Page - DOES NOT MATCH");
			Reporter.log("FAILED: Sender Details from Rate Enquiry to Shipment Page - DOES NOT MATCH");
			Assert.fail("FAILED: Sender Details from Rate Enquiry to Shipment Page - DOES NOT MATCH");
		}
		
		Reporter.log("---------------END OF TEST---------------");
	}
	
	@Then("^User Verifies if Receiver is pre selected from addressbook$")
	public void UserVerifiesIfReceiverIsPreSelectedFromAddressbook() throws Throwable {
		ReceiverShipmentPage = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(ReceiverShipmentPage);
		
		ReceiverLocShipmentPage = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(ReceiverLocShipmentPage);
		
		if (ReceiverRateEnquiry.contentEquals(ReceiverShipmentPage) & ReceiverLocRateEnquiry.contentEquals(ReceiverLocShipmentPage)) {
			System.out.println("Receiverr Details from Rate Enquiry to Shipment Page - MATCHES as EXPECTED");	
			Reporter.log("Receiver Details from Rate Enquiry to Shipment Page  - MATCHES as EXPECTED");
		}
		else {
			System.out.println("FAILED: Receiver Details from Rate Enquiry to Shipment Page - DOES NOT MATCH");
			Reporter.log("FAILED: Receiver Details from Rate Enquiry to Shipment Page - DOES NOT MATCH");
			Assert.fail("FAILED: Receiver Details from Rate Enquiry to Shipment Page - DOES NOT MATCH");
		}
		
		Reporter.log("---------------END OF TEST---------------");
	}


	
	@Then("^User Clicks Price Now Curtain on Shipment Page$")
	public void UserClicksPriceNowCurtainoOnShipmentPage() throws Throwable {
		PageBase.click(RateEnquiryActions.priceNowCurtainBtn, 10);
	}
	
	
	@Then("^Rate is Displayed with no breakdown and with a disclaimer$")
	public void RateisDisplayedwithNobreakdownAndWithAdisclaimer() throws Throwable {
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.MediumWaitForElementEnabled_1();
		fullChargeBeforeDraft = BaseWebdriver.driver.findElement(RateEnquiryActions.priceNowCurtainTotalCharge).getText();
		RateEnquiryActions.priceCurtainVerifyTotalCharge("Total charge :");
		RateEnquiryActions.priceCurtainVerifyGST("GST :");
		RateEnquiryActions.priceCurtainVerifyRate("Rate :");	
		RateEnquiryActions.priceCurtainVerifyPricenowMessage("Note: The rate shown may change if there are any variations to the actual weight, dimensions or locations entered above.");	
	}
	
	@Then("^Rate is Displayed with no breakdown and with a disclaimer - Prio$")
	public void RateisDisplayedwithNobreakdownAndWithAdisclaimerPrio() throws Throwable {
		fullChargeBeforeDraft = BaseWebdriver.driver.findElement(RateEnquiryActions.priceNowCurtainTotalCharge).getText();
		RateEnquiryActions.priceCurtainVerifyTotalCharge("Total charge :");	
		RateEnquiryActions.priceCurtainVerifyPricenowMessage("Note: The rate shown may change if there are any variations to the actual weight, dimensions or locations entered above.");	
	}
	
	@And("^User closes Rate Enquiry Curtain$")
	public void UserClosesRateEnquiryCurtain() throws Throwable {
		PageBase.click(RateEnquiryActions.priceNowCurtainClose, 10);
	}
	
	@Then("^User Click Retrieve from address book checkbox under Orgin$")
	public void UserClickRetrieveFromAddressBookCheckboxUnderOrgin() throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		WebElement element = BaseWebdriver.driver.findElement(By.id("from-address-book-chkbox"));
		jse.executeScript("arguments[0].click();", element);

	}		
	
	@Then("^User Click Retrieve from address book checkbox under Destination$")
	public void UserClickRetrievefromAddressbookCheckboxUnderDestination() throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		WebElement element = BaseWebdriver.driver.findElement(By.id("to-address-book-chkbox"));
		jse.executeScript("arguments[0].click();", element);
	}
	
	@And("^User is able to select sender address from address book$")
	public void UserIsAbleToSelectSenderAddressFromAddressBook() throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		CreateShipmentActions.SelectSender(1);
		SenderRateEnquiry = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(SenderRateEnquiry);;
		SenderLocRateEnquiry = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(SenderLocRateEnquiry);
	}
	
	@And("^User is able to select receiver address from address book$")
	public void UserIsAbleToSelectReceiberAddressFromAddressBook() throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		CreateShipmentActions.SelectReceiver(1);
		ReceiverRateEnquiry = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(ReceiverRateEnquiry);
	    ReceiverLocRateEnquiry = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(ReceiverLocRateEnquiry);
	}
	 

	@And("^User Selects Mode$")
	public void userSelectsMode(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
				RateEnquiryActions.SelectMode(rateEnquiry.get("Mode"));;
			   }
	}
	
	@Then("^User Verifies Details on Shipment Page Line Items$")
	public void userVerifiesDetailsOnShipmentPageLineTtems(DataTable rateEquiryTestData) throws Throwable {
		
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
			   {   
			    RateEnquiryActions.VerifyLineItem(rateEnquiry.get("ItemTemplateName"), rateEnquiry.get("BillingType"), rateEnquiry.get("NumberOfItems"), rateEnquiry.get("QtyType"), 
			    		rateEnquiry.get("Length"), rateEnquiry.get("Width"), rateEnquiry.get("Height"), rateEnquiry.get("Weight"));
			    
			}
	}
	
	@Then("^User Verifies Shipment Details and Clicks Price Now Curtain$")
	public void UserVerifiesShipmentDetailsAndClicksPriceNowCurtain(DataTable rateEquiryTestData) throws Throwable {
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, rateEnquiry.get("TollCarrier"));
			PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, rateEnquiry.get("Service"));PageBase.MaximumWaitForElementEnabled_1();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.click(RateEnquiryActions.priceNowCurtainBtn, 10);
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.MaximumWaitForElementEnabled_1();
		}
	}
	
	@Then("^User Verifies if the Total Charge Remained the Same$")
	public void UserVerifiesIfTheTotalChargeRemainedTheSame(DataTable rateEquiryTestData) throws Throwable {
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.waitForElement(RateEnquiryActions.priceNowCurtainTotalCharge, 10);
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExist(RateEnquiryActions.priceNowCurtainTotalCharge, fullChargeBeforeDraft);
		}
	
	}
	

}
