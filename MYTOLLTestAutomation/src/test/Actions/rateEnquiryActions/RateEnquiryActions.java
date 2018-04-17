package rateEnquiryActions;

import GlobalActions.PageBase;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;

public class RateEnquiryActions {

	public static By TollCarrierTextfield = By.name("placeholder-bu");
	public static By collectionDate = By.name("date");
	public static By collectionDateItem = By.xpath("//*[@id=\"pickup-location\"]/div[1]/div[1]/div/div/ul/li[2]");
	public static By message = By.id("selected-bu-content");
	public static By messageHeading = By.id("selected-bu-header");
	public static By servicedropdown = By.xpath("//*[@id=\"service-selector\"]/label/a/i");
	public static By serviceTextField = By.xpath("//*[@id=\"service-selector\"]/label/input[2]");
	public static By selectMode = By.xpath("//*[@id=\"mode-selector\"]/label/a/i");
	public static By originSuburbPostCode = By.xpath("//*[@id=\"sender-selector\"]/div[1]/a/i");
	public static By originSuburbPostCodeTextField = By.id("originAddress");
	public static By destinationSuburbPostcode = By.xpath("//*[@id=\"receiver-selector\"]/div[1]/a/i");
	public static By destinationSuburbPostcodeTextField = By.xpath("//*[@id=\"destinationAddress\"]");
	public static By destinationCountryTextField = By.name("placeholder-country");
	public static By destinationPostCode = By.id("destination-postcode");
	public static By itemDescription = By.xpath("//*[@id=\"freight-type-selector\"]/div[1]/a/i");
	public static By itemDescriptionType = By.id("item-description");
	public static By numberOfItem = By.id("numberOfItem");
	public static By quantityType = By.xpath("//*[@id=\"item-type-selector\"]/div[1]/a/i"); 
	public static By numberofGarments = By.id("garments-count");
	public static By weight = By.id("item-weight");
	public static By billingTypeTextFeild = By.xpath("//*[@id=\"billing-type-selector\"]/div[1]/input[2]"); 
	public static By billingTypeTDF = By.xpath("//*[@id=\"billing-type-selector\"]/div[1]/a/i"); 
	public static By billingType = By.xpath("//*[@id=\"billing-type-selector0\"]/div[1]/a/i"); 
	public static By billingTypeAddLineItem = By.xpath("//*[@id=\"billing-type-selector\"]/div[1]/a/i");
	public static By addNewLine = By.id("add-freight-item");
	public static By pricenowBtn = By.id("price-now");
	public static By pricenowMsg = By.xpath("//*[@id=\"show-calculated-rate\"]/div[2]");
	public static By totalCharge = By.xpath("//*[@id=\"show-calculated-rate\"]/div[1]/p[1]");
	public static By rate = By.xpath("//*[@id=\"show-calculated-rate\"]/div[1]/p[2]/span[1]");
	public static By gst = By.xpath("//*[@id=\"show-calculated-rate\"]/div[1]/p[2]/span[2]");
	public static By createShipmentBtn = By.id("move-to-create-shipmnt"); 
	public static By createShipmentContinue = By.id("confirm-true");
	public static By enterAccountNumber = By.xpath("//*[@id=\"account-selector\"]/label/input[2]");
	public static Boolean valid;
	public static By shipmentCarrierName= By.xpath("//*[@id=\"carrier-name\"]");
	public static By shipmentService= By.xpath("//*[@id=\"service-selector\"]/label/input[2]");
	public static By shipmentAccountNo= By.xpath("//*[@id=\"account\"]");
	public static By country = By.xpath("//*[@id=\"country-selector\"]/label/input[2]");
	public static By countryPostCode = By.xpath("//*[@id=\"destination-postcode\"]");
	public static By ShipmentDimention = By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[4]");
	public static By PageLoadingBox = By.xpath("//*[@id=\"page-loader\"]/div/i");
	
	//Error Msg Check - Negative Scenario
	public static By errorMsgItemDescription = By.xpath("//*[@id=\"steps-2\"]/div[1]/div[1]/div/span");
	public static By errorMsgBillingType = By.xpath("//*[@id=\"steps-2\"]/div[1]/div[2]/div/span");
	public static By errorMsgNoOfItems = By.xpath("//*[@id=\"items-number\"]/span");
	public static By errorMsgNoOfItemsExceedQty = By.xpath("//*[@id=\"error-bottom\"]/div[1]/div[2]/h3");
	public static By errorMsgQuantityType = By.xpath("//*[@id=\"steps-2\"]/div[2]/div[1]/div[2]/div/span");
	public static By errorMsgLength = By.xpath("//*[@id=\"dimensions-length\"]/span[2]");
	public static By errorMsgWidth = By.xpath("//*[@id=\"dimensions-width\"]/span[2]");
	public static By errorMsgHeight = By.xpath("//*[@id=\"dimensions-height\"]/span[2]");
	public static By errorMsgWeight = By.xpath("//*[@id=\"item-total-weight\"]/span[2]");
	public static By errorMsgCubicVolume = By.xpath("//*[@id=\"volume-container\"]/div/span[2]");
	
	//TES
	public static By tollExtraServiceLable = By.xpath("//*[@id=\"is-extra-service\"]/div/div/div[1]/label");
	public static By tollExtraServiceSlider = By.xpath("//*[@id=\"is-extra-service\"]/div/div/div[1]/div/label/span[1]");
	public static By tollExtraServiceAmountLable = By.xpath("//*[@id=\"extra-service\"]/div/label");
	public static By tollExtraServiceAmount = By.xpath("//*[@id=\"extra-service-amount\"]");
	
	//Rate Within a Shipment
	public static By priceNowCurtainBtn = By.xpath("//*[@id=\"get-shipment-rate-header\"]");
	public static By priceNowCurtainClose = By.xpath("//*[@id=\"get-shipment-rate-container\"]/div[1]/i");
	public static By priceNowCurtainMsg = By.xpath("//*[@id=\"rate-value-template-container\"]/div[2]");
	public static By priceNowCurtainTotalCharge = By.xpath("//*[@id=\"rate-value-template-container\"]/div[1]/p[@class=\"total-charge\"]");
	public static By priceNowCurtainRate = By.xpath("//*[@id=\"rate-value-template-container\"]/div[1]/p[1]");
	public static By priceNowCurtainGST = By.xpath("//*[@id=\"rate-value-template-container\"]/div[1]/p[2]");
	
	//Retrieve from AddressBook
	public static By orginAddressBookCheckbox = By.xpath("//*[@id=\"from-address-book-chkbox\"]");
	public static By destinationAddressBookCheckbox = By.xpath("//*[@id=\"to-address-book-chkbox\"]");
	public static By orginAddressBookDropdown = By.xpath("//*[@id=\"sender-selector\"]/label/a/i");
	public static By destinationAddressBookDropdown = By.xpath("//*[@id=\"receiver-selector\"]/label/a/i");
	
	
	public static void SelectTollCarrierItem(int i) {
		PageBase.MinimumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"BU-selector\"]/div[1]/a/i")).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"BU-selector\"]/div[2]/ul/li[" + i + "]")).click();

	}
	
	public static void EnterTollCarrier(String pTollCarrierName) {
		Reporter.log("User Selects Toll Carrier - "+pTollCarrierName);
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.click(TollCarrierTextfield, 5);
		//PageBase.click(By.xpath("//div[@id='BU-selector']/div/ul/li/div[text()='"+pTollCarrierName+"']"), 5);
		PageBase.click(By.xpath("//div[@id='BU-selector']/div/ul/li/div[contains(text(),'"+pTollCarrierName+"')]"), 5);
		
	}

	public static void VerifyMessage(String msgHeading, String msgContent) {
		PageBase.MinimumWaitForElementEnabled_1();
		assertEquals(msgHeading, BaseWebdriver.driver.findElement(messageHeading).getText());
		assertEquals(msgContent, BaseWebdriver.driver.findElement(message).getText());
	}

	public static void SelectService(int i) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(servicedropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li[" + i + "]")).click();

	}
	
	public static void EnterService(String pService ) {
		/*PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(servicedropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li/div[text()='"+pService +"']")).click();
		PageBase.MinimumWaitForElementEnabled_1();*/
		Reporter.log("User Selects Service - "+pService);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.sendText(shipmentService, 10, pService);
		PageBase.click(By.xpath("//*[@id=\"service-selector\"]/div/ul/li/div[text()='"+pService +"']"), 5);
	}
	
	public static void EnterAccountNumberAndSelect(String account) {
		Reporter.log("User Enters Account No - "+account);
		PageBase.sendText(enterAccountNumber, 10, account);
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"account-selector\"]/div/ul/li/div[contains(text(),'"+account+"')]"), 5);  

	}

	public static void SelectModeItem(int j) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(selectMode).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-selector\"]/div/ul/li[" + j + "]/div")).click();

	}
	
	public static void SelectMode(String mode) {
		Reporter.log("User Selects Mode - "+mode);
		PageBase.click(selectMode, 5);
		PageBase.click(By.xpath("//*[@id=\"mode-selector\"]/div/ul/li/div[text()='"+mode+"']"), 5);
	}

	public static void SelectOriginSuburbPostcode(int j) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(originSuburbPostCode).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[3]/ul/li[" + j + "]/div[3]"))
				.click();

	}

	public static void SelectOriginSuburbPostcodeRateEnquiry(String pSuburb, int j) {
		PageBase.MaximumWaitForElementEnabled_1(); 
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).click();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).clear();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).sendKeys(pSuburb);
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"enquiry-step1\"]/div[3]/div[2]/div/div/ul/li["+j+"]/div"))
				.click();
		
	}
	
	public static void SelectOrigin(String Suburb, String PostCode) {
		Reporter.log("User Selects Orgin - Surburb:"+Suburb+" PostCode:"+PostCode);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.sendText(originSuburbPostCodeTextField, 5, Suburb);
		PageBase.click(originSuburbPostCodeTextField, 2);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"origin-suburb-postcode\"]/div[1]/ul/li/div[contains(text(),'"+PostCode+"') and contains(text(),'"+Suburb+"')]"), 5);
	}
	
	public static void SelecDestination(String Suburb, String PostCode) {
		Reporter.log("User Selects Destination - Surburb:"+Suburb+" PostCode:"+PostCode);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(destinationSuburbPostcodeTextField, 2);
		PageBase.sendText(destinationSuburbPostcodeTextField, 5, Suburb);
		PageBase.MaximumWaitForElementEnabled_1();
		//PageBase.click(destinationSuburbPostcodeTextField, 2);
		//PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"destination-suburb-postcode\"]/div[1]/ul/li/div[contains(text(),'"+PostCode+"') and contains(text(),'"+Suburb+"')]"), 5);
	}
	
	
	public static void SelectCountry(String Country) {
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.sendText(country, 5, Country);
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"country-selector\"]/div/ul/li/div[text()='"+Country+"']"), 5);
	}
	
	
	public static void SelectCountryPostCode(String PostCode) {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.sendText(countryPostCode, 5, PostCode);
	}
	

	public static void SelectOriginSuburbPostcodeRateEnquiryTollNQX(String pSuburb, int j) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).click();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).clear();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).sendKeys(pSuburb);
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"enquiry-step1\"]/div[3]/div[2]/div/div/ul/li[" + j + "]/div")).click();

	}
	
	public static void EnterOriginSuburbPostcodeRateEnquiryTollPrioAU(String pSuburb,String pSuburbItem ) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).click();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).clear();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).sendKeys(pSuburb);
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"enquiry-step1\"]/div[3]/div[2]/div/div/ul/li/div[text()='"+pSuburbItem+"']")).click();

	}

	public static void SelectDestinationSuburbPostcode(int j) {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.retryingFindClick(destinationSuburbPostcode);
		BaseWebdriver.driver.findElement(destinationSuburbPostcode).click();
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[3]/ul/li[" + j + "]/div[2]"))
				.click();

	}

	public static void SelectDestinationSuburbPostcodeRateEnquiry(String pSuburb, int j) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(destinationSuburbPostcodeTextField).click();
		BaseWebdriver.driver.findElement(destinationSuburbPostcodeTextField).clear();
		BaseWebdriver.driver.findElement(destinationSuburbPostcodeTextField).sendKeys(pSuburb);
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"destination-type-address\"]/div/div/ul/li[" + j + "]/div"))
				.click();
		PageBase.MaximumWaitForElementEnabled_1();

	}

	public static void SelectDestinationCountry(String pCountry, int j) {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.retryingFindClick(destinationCountryTextField);
		BaseWebdriver.driver.findElement(destinationCountryTextField).click();
		BaseWebdriver.driver.findElement(destinationCountryTextField).clear();
		// BaseWebdriver.driver.findElement(destinationCountryTextField).sendKeys(pCountry);
		PageBase.MinimumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"country-selector\"]/div/ul/li[" + j + "]/div")).click(); 
	}
	
	public static void EnterDestinationCountry(String pCountry,String pCountryItem) {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.retryingFindClick(destinationCountryTextField);
		BaseWebdriver.driver.findElement(destinationCountryTextField).click();
		BaseWebdriver.driver.findElement(destinationCountryTextField).clear();
		BaseWebdriver.driver.findElement(destinationCountryTextField).sendKeys(pCountry);
		PageBase.MinimumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"country-selector\"]/div/ul/li/div[text()='"+pCountryItem+"']")).click(); 
	}


	public static void EnterDestinationPostcode(String pDestinationPostcode) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(destinationPostCode).click();
		BaseWebdriver.driver.findElement(destinationPostCode).clear();
		BaseWebdriver.driver.findElement(destinationPostCode).sendKeys(pDestinationPostcode);
		PageBase.Scrollbar(250, 500);
		
	}

	public static void SelectItemDescription(int j) {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.Scrollbar(0, 500);
		
		BaseWebdriver.driver.findElement(itemDescription).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"freight-type-selector\"]/div[2]/ul/li[" + j + "]/div"))
				.click();
	}

	public static void NumberOfItem(String pnumberOfItem) {
		Reporter.log("User Enters No. of Items - "+pnumberOfItem);
		PageBase.MaximumWaitForElementEnabled_1();
		//BaseWebdriver.driver.findElement(numberOfItem).click();
		//BaseWebdriver.driver.findElement(numberOfItem).clear();
		//BaseWebdriver.driver.findElement(numberOfItem).sendKeys(pnumberOfItem);
		PageBase.sendText(numberOfItem, 2, pnumberOfItem);
	}

	public static void QuantityType(int j) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(quantityType).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"item-type-selector\"]/div[2]/ul/li[" + j + "]/div"))
				.click();

	}
	
	public static void QuantityTypeSelect(String  QtyType) {
		Reporter.log("User Selects Quantity Type - "+QtyType);
		PageBase.click(quantityType, 2);
		PageBase.click(By.xpath("//*[@id=\"item-type-selector\"]/div[2]/ul/li/div[text()='"+QtyType+"']"), 2);
	}
	
	

	public static void NumberOfGarments(String pNumberOfGarments) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(numberofGarments).click();
		BaseWebdriver.driver.findElement(numberofGarments).clear();
		BaseWebdriver.driver.findElement(numberofGarments).sendKeys(pNumberOfGarments);

	}

	public static void EnterWeight(String pweight) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(weight).click();
		BaseWebdriver.driver.findElement(weight).clear();
		BaseWebdriver.driver.findElement(weight).sendKeys(pweight);

	}

	public static void SelectBillingType() {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(billingType).click();
		PageBase.MinimumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector0\"]/div[2]/ul/li/div")).click();
	}
	
	public static void EnterBillingType(String pBillingType) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(billingTypeTDF).click();
		PageBase.MinimumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li/div[text()='"+pBillingType+"']")).click();
	}


	// Toll Intermodal, Toll NQX
	public static void SelectBillingTypeItem1TDF(int i) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(billingTypeTDF).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector0\"]/div[2]/ul/li["+i+"]/div"))
				.click(); 
	}

	// Toll Intermodal, Toll NQX
	
	public static void EnterBillingTypeTDF(String pBillingType) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(billingTypeTDF).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li/div[text()='"+pBillingType+"']")).click();
	}
	
	public static void BillingType(String BillingType) {
		Reporter.log("User Billing Type - "+BillingType);
		PageBase.sendText(billingTypeTextFeild, 5, BillingType);
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li/div[text()='"+BillingType+"']"), 5);
	}
	

	
	public static void SelectBillingTypeTDF(int i) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(billingTypeTDF).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click(); 
	}
	
	public static void SelectBillingTypeAddLineItem(int i) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(billingTypeAddLineItem).click();
		PageBase.MinimumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click();
	}

	public static void AddANewLine() {

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250);");
		BaseWebdriver.driver.findElement(addNewLine).click();

		RateEnquiryActions.SelectItemDescription(1);

		RateEnquiryActions.NumberOfItem("15");
		// RateEnquiryActions.QuantityType(2);
		RateEnquiryActions.NumberOfGarments("10");
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		RateEnquiryActions.EnterWeight("20");

		RateEnquiryActions.SelectBillingType();

	}

	public static void AddANewLineTDF() {

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(250,800);");
		BaseWebdriver.driver.findElement(addNewLine).click();

		RateEnquiryActions.SelectItemDescription(1);

		RateEnquiryActions.NumberOfItem("15");
		RateEnquiryActions.QuantityType(2);
		// RateEnquiryActions.NumberOfGarments("10");
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		RateEnquiryActions.EnterWeight("20");

		RateEnquiryActions.EnterBillingTypeTDF("General Freight");

	}

	public static void AddANewLineNZAUS() {

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250);");
		BaseWebdriver.driver.findElement(addNewLine).click();

		RateEnquiryActions.SelectItemDescription(3);

		RateEnquiryActions.NumberOfItem("15");
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		RateEnquiryActions.EnterWeight("20");

	}

	public static void ClickPriceNow() {
		Reporter.log("User Clicks Price Now");
	/*	PageBase.MinimumWaitForElementEnabled_1();
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(250, 800);");
		BaseWebdriver.driver.findElement(pricenowBtn).click();
		*/
		PageBase.moveToElement(pricenowBtn);
		PageBase.click(pricenowBtn, 2);

	}
	
	public static void validShipement (Boolean valid) {
		
	}

	public static void ContinueCreateShipment() {
		try {
		PageBase.MaximumWaitForElementEnabled_1();
		Boolean results=BaseWebdriver.driver.findElement(createShipmentContinue).isDisplayed();
		
		if (results=true && valid) {
			Reporter.log("FAILED - Valid Shipment Price Unavailable");
			System.out.println("FAILED - Valid Shipment Price Unavailable");
			Assert.fail("FAILED - Valid Shipment Price Unavailable");
			
		}
		
		if (results=true) {
		System.out.println("PopUp: Continue to Shipment");
		Reporter.log("Popup Exits as Price is Unavailable, Moving to Shipment");
		BaseWebdriver.driver.findElement(createShipmentContinue).click();
		PageBase.MaximumWaitForElementEnabled_1();
		}
		}
		
		catch(Exception e) {
			System.out.println("Continue Verifying Price and Moves to Shipment");
			Reporter.log("User Continues Verifying Price and Moves to Shipment");
			RateEnquiryActions.VerifyPriceNowDetails();
			RateEnquiryActions.ClickCreateShipment();
		}
		}
		
	public static void VerifyPriceNowDetails() {
		try {
		PageBase.MaximumWaitForElementEnabled_1();
		Boolean results=BaseWebdriver.driver.findElement(totalCharge).isDisplayed();
		if (results=true) {
		//RateEnquiryActions.VerifyPricenowMessage("Note: The rate shown may change if there are any variations to the actual weight, dimensions, or locations entered above.");
		//RateEnquiryActions.VerifyPricenowMessage("Note:The rate displayed is an estimate only. The rate may change if there are any variations to the actual weight, dimensions or location entered above and are based on Mon - Fri business hours. Extra service and other surcharges may apply. For further enquiries please call our Sales Dept on 1300 865 547 (Option 3)");	

			RateEnquiryActions.VerifyTotalCharge("Total Charge:");
			RateEnquiryActions.VerifyGST("GST:");
			RateEnquiryActions.VerifyRate("Rate:"); 
		PageBase.MinimumWaitForElementEnabled_1();
		}
		}
		
		catch(Exception ex) {
			System.out.println(ex);
		}
		}
		
	public static void VerifyPricenowMessage(String pPricenowMsg) {
		PageBase.MinimumWaitForElementEnabled_1();
		//assertEquals(pPricenowMsg, BaseWebdriver.driver.findElement(pricenowMsg).getText());
		PageBase.verifyTextExist(pricenowMsg, pPricenowMsg);

	}

	public static void VerifyTotalCharge(String pTotalCharge) {
		PageBase.MinimumWaitForElementEnabled_1();
		//assertEquals(pTotalCharge, BaseWebdriver.driver.findElement(totalCharge).getText());
		String fullCharge = BaseWebdriver.driver.findElement(totalCharge).getText();
		Reporter.log("Full Charge: "+fullCharge);
		System.out.println("Full Charge: "+fullCharge);
		String getText = BaseWebdriver.driver.findElement(totalCharge).getText().substring(0, 13);
		
		if (getText.equals(pTotalCharge)){
			Reporter.log("Expected Text : "+pTotalCharge+ " Matched the Text on Screen :" +getText);
			System.out.println("Expected Text : "+pTotalCharge+ " Matched the Text on Screen :" +getText);
		}else{
			Reporter.log("FAILED: Expected Text : "+pTotalCharge+ " DOES NOT Match the Text on Screen :" +getText);
			Assert.fail("FAILED: Expected Text : "+pTotalCharge+ " DOES NOT Match the Text on Screen :" +getText);
		}

	}

	public static void VerifyGST(String pGST) {
		PageBase.MinimumWaitForElementEnabled_1();
		//assertEquals(pGST, BaseWebdriver.driver.findElement(gst).getText());
		String getText = BaseWebdriver.driver.findElement(gst).getText().substring(0, 4);
	
		if (getText.equals(pGST)){
			Reporter.log("Expected Text : "+pGST+ " Matched the Text on Screen :" +getText);
			System.out.println("Expected Text : "+pGST+ " Matched the Text on Screen :" +getText);
		}else{
			Reporter.log("FAILED: Expected Text : "+pGST+ " DOES NOT Match the Text on Screen :" +getText);
			Assert.fail("FAILED: Expected Text : "+pGST+ " DOES NOT Match the Text on Screen :" +getText);
		}

	}

	public static void VerifyRate(String pRate) {
		PageBase.MinimumWaitForElementEnabled_1();
		//assertEquals(pRate, BaseWebdriver.driver.findElement(rate).getText());
		String getText = BaseWebdriver.driver.findElement(rate).getText().substring(0, 5);
		if (getText.equals(pRate)){
			Reporter.log("Expected Text : "+pRate+ " Matched the Text on Screen :" +getText);
			System.out.println("Expected Text : "+pRate+ " Matched the Text on Screen :" +getText);
		}else{
			Reporter.log("FAILED: Expected Text : "+pRate+ " DOES NOT Match the Text on Screen :" +getText);
			Assert.fail("FAILED: Expected Text : "+pRate+ " DOES NOT Match the Text on Screen :" +getText);
		}

	}

	public static void VerifyRateEnquiryDetails(String Carrier, String Service, String AccountNo, String Length, String Width, String Height) {
		PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, AccountNo);
		PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+" cm x "+Height+"cm" );

	}
	
	public static void VerifyRateEnquiryDetails_TollPriorityAUS(String Carrier, String Service, String AccountNo, String Length, String Width, String Height) {
		PageBase.waitForElement(RateEnquiryActions.shipmentCarrierName, 10);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentCarrierName, Carrier);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentService, Service);
		PageBase.verifyTextExistAttribute(RateEnquiryActions.shipmentAccountNo, AccountNo);
		PageBase.verifyTextExist(RateEnquiryActions.ShipmentDimention, Length+"cm x "+Width+"cm x "+Height+"cm" );

	}
	public static void ClickCreateShipment() {
		PageBase.MinimumWaitForElementEnabled_1();
		//BaseWebdriver.driver.findElement(createShipmentBtn).click();
		PageBase.click(createShipmentBtn, 2);
	}
	
	public static void EnterItem(String itemName) {
		Reporter.log("User Enters Item Description - "+itemName);
		PageBase.click(RateEnquiryActions.itemDescriptionType, 2);
		PageBase.sendText(RateEnquiryActions.itemDescriptionType, 2, itemName);
	
	}
	
	public static void EnterLengthWidthHeightVolumeWeight(String plength, String pwidth, String pheight,
			String pweight) {
		Reporter.log("User Enters Dimension - Length:"+plength+", Width:"+pwidth+", Height:"+pheight+", Weight:"+pweight);
		PageBase.sendText(BookAPickupActions.length, 2, plength);
		PageBase.sendText(BookAPickupActions.width, 2, pwidth );
		PageBase.sendText(BookAPickupActions.height, 2, pheight);
		PageBase.sendText(RateEnquiryActions.weight, 2, pweight);
	}
	
	public static void verifyNoOfItemsLengthWidthHeightVolumeWeight(String NumberOfItems, String plength, String pwidth, String pheight,
			String pweight) {
		Reporter.log("User Verifies Dimension - NumberOfItems:"+NumberOfItems+", Length:"+plength+", Width:"+pwidth+", Height:"+pheight+", Weight:"+pweight);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExistAttribute(numberOfItem, NumberOfItems);
		PageBase.verifyTextExistAttribute(BookAPickupActions.length, plength);
		PageBase.verifyTextExistAttribute(BookAPickupActions.width, pwidth );
		PageBase.verifyTextExistAttribute(BookAPickupActions.height, pheight);
		PageBase.verifyTextExistAttribute(weight, pweight);
	}
	
	
		
	public static void priceCurtainVerifyPricenowMessage(String pPricenowMsg) {
		PageBase.MinimumWaitForElementEnabled_1();
		//assertEquals(pPricenowMsg, BaseWebdriver.driver.findElement(pricenowMsg).getText());
		PageBase.verifyTextExist(priceNowCurtainMsg, pPricenowMsg);

	}

	public static void priceCurtainVerifyTotalCharge(String pTotalCharge) {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		//assertEquals(pTotalCharge, BaseWebdriver.driver.findElement(totalCharge).getText());
		String fullCharge = BaseWebdriver.driver.findElement(priceNowCurtainTotalCharge).getText();
		Reporter.log("Full Charge: "+fullCharge);
		System.out.println("Full Charge: "+fullCharge);
		String getText = BaseWebdriver.driver.findElement(priceNowCurtainTotalCharge).getText().substring(0, 14);
		
		if (getText.equals(pTotalCharge)){
			Reporter.log("Expected Text : "+pTotalCharge+ " Matched the Text on Screen :" +getText);
			System.out.println("Expected Text : "+pTotalCharge+ " Matched the Text on Screen :" +getText);
		}else{
			Reporter.log("FAILED: Expected Text : "+pTotalCharge+ " DOES NOT Match the Text on Screen :" +getText);
			Assert.fail("FAILED: Expected Text : "+pTotalCharge+ " DOES NOT Match the Text on Screen :" +getText);
		}

	}

	public static void priceCurtainVerifyGST(String pGST) {
		PageBase.MinimumWaitForElementEnabled_1();
		//assertEquals(pGST, BaseWebdriver.driver.findElement(gst).getText());
		String getText = BaseWebdriver.driver.findElement(priceNowCurtainGST).getText().substring(0, 5);
	
		if (getText.equals(pGST)){
			Reporter.log("Expected Text : "+pGST+ " Matched the Text on Screen :" +getText);
			System.out.println("Expected Text : "+pGST+ " Matched the Text on Screen :" +getText);
		}else{
			Reporter.log("FAILED: Expected Text : "+pGST+ " DOES NOT Match the Text on Screen :" +getText);
			Assert.fail("FAILED: Expected Text : "+pGST+ " DOES NOT Match the Text on Screen :" +getText);
		}

	}

	public static void priceCurtainVerifyRate(String pRate) {
		PageBase.MinimumWaitForElementEnabled_1();
		//assertEquals(pRate, BaseWebdriver.driver.findElement(rate).getText());
		String getText = BaseWebdriver.driver.findElement(priceNowCurtainRate).getText().substring(0, 6);
		if (getText.equals(pRate)){
			Reporter.log("Expected Text : "+pRate+ " Matched the Text on Screen :" +getText);
			System.out.println("Expected Text : "+pRate+ " Matched the Text on Screen :" +getText);
		}else{
			Reporter.log("FAILED: Expected Text : "+pRate+ " DOES NOT Match the Text on Screen :" +getText);
			Assert.fail("FAILED: Expected Text : "+pRate+ " DOES NOT Match the Text on Screen :" +getText);
		}

	}
	
	public static void ShipmentSenderSelect(String Sender) {
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.sendText(CreateShipmentActions.senderTextfield, 5, Sender);
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"sender-selector\"]//*/div[text()='"+Sender+"']"), 5);
	}
	
	public static void ShipmentReceiverSelect(String Receiver) {
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.sendText(CreateShipmentActions.receiverTextfield, 5, Receiver);
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"receiver-selector\"]//*/div[text()='"+Receiver+"']"), 5);
	}
	
}
