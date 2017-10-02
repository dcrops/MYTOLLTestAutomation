package rateEnquiryActions;

import GlobalActions.PageBase;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;

public class RateEnquiryActions {

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
	public static By destinationSuburbPostcodeTextField = By.id("destinationAddress");
	public static By destinationCountryTextField = By.name("placeholder-country");
	public static By destinationPostCode = By.id("destination-postcode");
	public static By itemDescription = By.xpath("//*[@id=\"freight-type-selector\"]/div[1]/a/i");
	public static By numberOfItem = By.id("numberOfItem");
	public static By quantityType = By.xpath("//*[@id=\"item-type-selector\"]/div[1]/a/i"); 
	public static By numberofGarments = By.id("garments-count");
	public static By weight = By.id("item-weight");
	public static By billingTypeTDF = By.xpath("//*[@id=\"billing-type-selector\"]/div[1]/a/i"); 
	public static By billingType = By.xpath("//*[@id=\"billing-type-selector0\"]/div[1]/a/i"); //*[@id="billing-type-selector"]/div[1]/a/i
	public static By billingTypeAddLineItem = By.xpath("//*[@id=\"billing-type-selector\"]/div[1]/a/i");
	public static By addNewLine = By.id("add-freight-item");
	public static By pricenowBtn = By.id("price-now");
	public static By pricenowMsg = By.xpath("//*[@id=\"show-calculated-rate\"]/div[2]");
	public static By totalCharge = By.xpath("//*[@id=\"show-calculated-rate\"]/div[1]/p[1]");
	public static By rate = By.xpath("//*[@id=\"show-calculated-rate\"]/div[1]/p[2]/span[1]");
	public static By gst = By.xpath("//*[@id=\"show-calculated-rate\"]/div[1]/p[2]/span[2]");
	public static By createShipmentBtn = By.id("move-to-create-shipmnt");

	
	public static void SelectTollCarrierItem(int i) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"BU-selector\"]/div[1]/a/i")).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"BU-selector\"]/div[2]/ul/li[" + i + "]")).click();

	}

	public static void VerifyMessage(String msgHeading, String msgContent) {
		PageBase.MinimumWaitForElementEnabled();
		assertEquals(msgHeading, BaseWebdriver.driver.findElement(messageHeading).getText());
		assertEquals(msgContent, BaseWebdriver.driver.findElement(message).getText());
	}

	public static void SelectService(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(servicedropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li[" + i + "]")).click();

	}

	public static void SelectModeItem(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(selectMode).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-selector\"]/div/ul/li[" + j + "]/div")).click();

	}

	public static void SelectOriginSuburbPostcode(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(originSuburbPostCode).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[3]/ul/li[" + j + "]/div[3]"))
				.click();

	}

	public static void SelectOriginSuburbPostcodeRateEnquiry(String pSuburb, int j) {
		PageBase.MaximumWaitForElementEnabled(); 
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).click();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).clear();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).sendKeys(pSuburb);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"enquiry-step1\"]/div[3]/div[2]/div/div/ul/li["+j+"]/div"))
				.click();
		
	}

	public static void SelectOriginSuburbPostcodeRateEnquiryTollNQX(String pSuburb, int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).click();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).clear();
		BaseWebdriver.driver.findElement(originSuburbPostCodeTextField).sendKeys(pSuburb);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"enquiry-step1\"]/div[3]/div[2]/div/div/ul/li[" + j + "]/div")).click();

	}

	public static void SelectDestinationSuburbPostcode(int j) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destinationSuburbPostcode);
		BaseWebdriver.driver.findElement(destinationSuburbPostcode).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[3]/ul/li[" + j + "]/div[2]"))
				.click();

	}

	public static void SelectDestinationSuburbPostcodeRateEnquiry(String pSuburb, int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(destinationSuburbPostcodeTextField).click();
		BaseWebdriver.driver.findElement(destinationSuburbPostcodeTextField).clear();
		BaseWebdriver.driver.findElement(destinationSuburbPostcodeTextField).sendKeys(pSuburb);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"destination-type-address\"]/div/div/ul/li[" + j + "]/div"))
				.click();
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void SelectDestinationCountry(String pCountry, int j) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destinationCountryTextField);
		BaseWebdriver.driver.findElement(destinationCountryTextField).click();
		BaseWebdriver.driver.findElement(destinationCountryTextField).clear();
		// BaseWebdriver.driver.findElement(destinationCountryTextField).sendKeys(pCountry);
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"country-selector\"]/div/ul/li[" + j + "]/div")).click(); // *[@id="country-selector"]/div/ul/li[220]/div

	}

	public static void EnterDestinationPostcode(String pDestinationPostcode) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(destinationPostCode).click();
		BaseWebdriver.driver.findElement(destinationPostCode).clear();
		BaseWebdriver.driver.findElement(destinationPostCode).sendKeys(pDestinationPostcode);

	}

	public static void SelectItemDescription(int j) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemDescription).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"freight-type-selector\"]/div[2]/ul/li[" + j + "]/div"))
				.click();
	}

	public static void NumberOfItem(String pnumberOfItem) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(numberOfItem).click();
		BaseWebdriver.driver.findElement(numberOfItem).clear();
		BaseWebdriver.driver.findElement(numberOfItem).sendKeys(pnumberOfItem);

	}

	public static void QuantityType(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(quantityType).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"item-type-selector\"]/div[2]/ul/li[" + j + "]/div"))
				.click();

	}

	public static void NumberOfGarments(String pNumberOfGarments) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(numberofGarments).click();
		BaseWebdriver.driver.findElement(numberofGarments).clear();
		BaseWebdriver.driver.findElement(numberofGarments).sendKeys(pNumberOfGarments);

	}

	public static void EnterWeight(String pweight) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(weight).click();
		BaseWebdriver.driver.findElement(weight).clear();
		BaseWebdriver.driver.findElement(weight).sendKeys(pweight);

	}

	public static void SelectBillingType() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingType).click();
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector0\"]/div[2]/ul/li/div")).click();
	}
	
	public static void EnterBillingType(String pBillingType) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingTypeTDF).click();
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li/div[text()='"+pBillingType+"']")).click();
	}


	// Toll Intermodal, Toll NQX
	public static void SelectBillingTypeItem1TDF(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingTypeTDF).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector0\"]/div[2]/ul/li["+i+"]/div"))
				.click(); 
	}

	// Toll Intermodal, Toll NQX
	
	public static void EnterBillingTypeTDF(String pBillingType) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingTypeTDF).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li/div[text()='"+pBillingType+"']")).click();
	}
	

	
	public static void SelectBillingTypeTDF(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingTypeTDF).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click(); 
	}
	
	public static void SelectBillingTypeAddLineItem(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingTypeAddLineItem).click();
		PageBase.MinimumWaitForElementEnabled();
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
		jse.executeScript("scroll(0, 250);");
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
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(pricenowBtn).click();

	}

	public static void VerifyPricenowMessage(String pPricenowMsg) {
		PageBase.MinimumWaitForElementEnabled();
		assertEquals(pPricenowMsg, BaseWebdriver.driver.findElement(pricenowMsg).getText());

	}

	public static void VerifyToatlCharge(String pTotalCharge) {
		PageBase.MinimumWaitForElementEnabled();
		assertEquals(pTotalCharge, BaseWebdriver.driver.findElement(totalCharge).getText());

	}

	public static void VerifyGST(String pGST) {
		PageBase.MinimumWaitForElementEnabled();
		assertEquals(pGST, BaseWebdriver.driver.findElement(gst).getText());

	}

	public static void VerifyRate(String pRate) {
		PageBase.MinimumWaitForElementEnabled();
		assertEquals(pRate, BaseWebdriver.driver.findElement(rate).getText());

	}

	public static void ClickCreateShipment() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(createShipmentBtn).click();

	}
}
