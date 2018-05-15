package reviewYourPickupActions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;

public class ReviewYourPickupActions {

	//
	public static By reviewYourPickupHeading = By.xpath("//*[@id=\"book-a-pickup-placeholder\"]/div/header/div/h1");
	public static By pickupDetailsHeading = By.cssSelector("h5.review-box-label");
	public static By pickupDateTimeHeading = By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div[2]/div/h5");// *[@id="book-a-pickup-placeholder"]/div/div[1]/div[1]/div/div[1]/div/p
	public static By accountNumber = By.xpath(
			"//*[@id=\"book-a-pickup-placeholder\"]//div[@class='pickup-summary__review-section upper-section clearfix']//label[text()='Account number']/following::div/p");
	public static By tollCarrier = By.xpath(
			"//*[@id=\"book-a-pickup-placeholder\"]//div[@class='pickup-summary__review-section upper-section clearfix']//label[text()='Toll carrier']/following::div/p");
	public static By company = By.xpath(
			"//*[@id=\"book-a-pickup-placeholder\"]//div[@class='pickup-summary__review-section upper-section clearfix']//label[text()='Company']/following::div/p");
	public static By location = By.xpath(
			"//*[@id=\"book-a-pickup-placeholder\"]//div[@class='pickup-summary__review-section upper-section clearfix']//label[text()='Location']/following::div/p");
	public static By bookedBy = By.xpath(
			"//*[@id=\"book-a-pickup-placeholder\"]//div[@class='pickup-summary__review-section upper-section clearfix']//label[text()='Booked by']/following::div/p");
	public static By phoneNumber = By.xpath(
			"//*[@id=\"book-a-pickup-placeholder\"]//div[@class='pickup-summary__review-section upper-section clearfix']//label[text()='Phone number']/following::div/p");
	public static By dispatchDate = By.xpath(
			"//*[@id=\"book-a-pickup-placeholder\"]//div[@class='pickup-summary__review-section upper-section clearfix']//label[text()='Dispatch date']/following::div/p");
	public static By readyTime = By.xpath(
			"//*[@id=\"book-a-pickup-placeholder\"]//div[@class='pickup-summary__review-section upper-section clearfix']//label[text()='Ready time']/following::div/p");
	public static By closingTime = By.xpath(
			"//*[@id=\"book-a-pickup-placeholder\"]//div[@class='pickup-summary__review-section upper-section clearfix']//label[text()='Location closing time']/following::div/p");
	public static By specialInstructions = By.xpath(
			"//*[@id=\"book-a-pickup-placeholder\"]//div[@class='pickup-summary__review-section upper-section clearfix']//label[text()='Special instructions']/following::div/p");

	public static By itemDescription1 = By.cssSelector("div.item.hide-open");
	public static By numberofItems = By.cssSelector("div.quantity.hide-open");
	public static By lengthWidthHeight = By.cssSelector("div.dimensions.hide-open");
	public static By volume1 = By.cssSelector("div.volume.hide-open");
	public static By weight1 = By.cssSelector("div.weight.hide-open");

	// Item1 details validation
	public static By itemArrowDownItem1 = By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[7]/a/i");
	public static By itemArrowDownItem1TPrioAU = By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[7]/a/i");
	public static By itemDetailsHeading = By.xpath("//*[@id=\"line-item-0\"]/div[@class='item-body content-box']/h5");
	public static By destination = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Destination']/following::div/p");
	public static By itemDescription = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Item description']/following::div/p");
	public static By serviceType = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Service type']/following::div/p");
	public static By mode = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Mode']/following::div/p");
	public static By chargeTo = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Charge to']/following::div/p");
	public static By numberOfItems = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Number of items']/following::div/p");
	public static By palletSpaces = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Pallet space']/following::div/p");
	public static By largestitemDimensions = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Largest item dimensions']/following::div/p");
	public static By volume = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Total volume']/following::div/p");
	public static By weight = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Total weight']/following::div/p");
	public static By dangerousGood = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Dangerous goods']/following::div/p");
	public static By foodItems = By.xpath(
			"//*[@id=\"line-item-0\"]//div[@class='item-body content-box']//label[text()='Food item ']/following::div/p");

	// Dangerous Goods Details validation
	public static By dangerousGoodsHeading = By.xpath("//*[@id=\"line-item-0\"]//div[@class='clearfix']/h5");
	public static By dangerousGoodsArrowdown = By.xpath("//*[@id=\"dg-line-00\"]/div[1]/div[7]/a/i");
	public static By unNumber = By.xpath(
			"//*[@id=\"dg-line-00\"]//div[@class='col-ms-6 col-md-6 col-lg-6']//label[text()='Un number']/following::div/p");
	public static By classDivision = By.xpath(
			"//*[@id=\"dg-line-00\"]//div[@class='col-ms-6 col-md-6 col-lg-6']//label[text()='Class division']/following::div/p");
	public static By packingGroup = By.xpath(
			"//*[@id=\"dg-line-00\"]//div[@class='col-ms-6 col-md-6 col-lg-6']//label[text()='Packing group']/following::div/p");
	public static By subrisk = By.xpath(
			"//*[@id=\"dg-line-00\"]//div[@class='col-ms-6 col-md-6 col-lg-6']//label[text()='Sub risk']/following::div/p");
	public static By properShippingName = By.xpath(
			"//*[@id=\"dg-line-00\"]//div[@class='col-ms-6 col-md-6 col-lg-6']//label[text()='Proper shipping name ']/following::div/p");
	public static By dgPackingDescription = By.xpath(
			"//*[@id=\"dg-line-00\"]//div[@class='col-ms-6 col-md-6 col-lg-6']//label[text()='DG packaging description']/following::div/p");
	public static By dgPKG = By.xpath(
			"//*[@id=\"dg-line-00\"]//div[@class='col-ms-6 col-md-6 col-lg-6']//label[text()='DG pkg (qty)']/following::div/p");
	public static By dgQTY = By.xpath(
			"//*[@id=\"dg-line-00\"]//div[@class='col-ms-6 col-md-6 col-lg-6']//label[text()='DG qty (kg or L)']/following::div/p");
	public static By technicalName = By.xpath(
			"//*[@id=\"dg-line-00\"]//div[@class='col-ms-6 col-md-6 col-lg-6']//label[text()='Technical name']/following::div/p");

	// Item2 details validation
	public static By itemArrowDownItem2 = By.xpath("//*[@id=\"line-item-1\"]/div[1]/div[7]/a/i");
	public static By itemDetailsHeading2 = By.xpath("//*[@id=\"line-item-1\"]/div[@class='item-body content-box']/h5");
	public static By destination2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Destination']/following::div/p");
	public static By itemDescription2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Item description']/following::div/p");
	public static By serviceType2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Service type']/following::div/p");
	public static By mode2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Mode']/following::div/p");
	public static By chargeTo2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Charge to']/following::div/p");
	public static By numberOfItems2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Number of items']/following::div/p");
	public static By palletSpaces2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Pallet space']/following::div/p");
	public static By largestitemDimensions2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Largest item dimensions']/following::div/p");
	public static By volume2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Total volume']/following::div/p");
	public static By weight2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Total weight']/following::div/p");
	public static By dangerousGood2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Dangerous goods']/following::div/p");
	public static By foodItems2 = By.xpath(
			"//*[@id=\"line-item-1\"]//div[@class='item-body content-box']//label[text()='Food item ']/following::div/p");

	public static By lenghthHeightWeight = By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div/div/p");

	public static By tempLow = By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div/div/p");
	public static By tempHigh = By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div[2]/div/p");
	public static By refNumber = By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div[3]/div/p");
	public static By bookInNumbers = By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div[4]/div/p");

	public static By confirmPickupBtn = By.id("submit-pickup");
	public static By pickupConfirmed = By.xpath("//*[@id=\"book-a-pickup-placeholder\"]/div[1]/div[1]/div[1]/h1");
	public static By emailLable = By.xpath("//*[@id=\"book-a-pickup-placeholder\"]/div[1]/div[1]/div[2]/h4");
	public static By pickupSubmitted = By.xpath("//*[@id=\"pickup-trails\"]/div[1]/span");
	public static By pickedupLable = By.xpath("//*[@id=\"pickup-trails\"]/div[2]/span[2]");
	public static By intransit = By.xpath("//*[@id=\"pickup-trails\"]/div[3]/span[2]");
	public static By outForDeliveryLable = By.xpath("//*[@id=\"pickup-trails\"]/div[4]/span[2]");
	public static By deliveredLable = By.xpath("//*[@id=\"pickup-trails\"]/div[5]/span[2]");
	public static By reference = By
			.xpath("//*[@id=\"book-a-pickup-placeholder\"]/div[1]/div[1]/div[1]/div[3]/span/span");
	public static By emailAddress = By.xpath("//*[@id=\"book-a-pickup-placeholder\"]/div[1]/div[1]/div[2]/h4/a");

	public static By EditBtn = By.id("edit-pickup");

	public static void ClickItemArrowdown(int itemIineNumber) {
		BaseWebdriver.driver.findElement(By.xpath("//*[@id='line-item-" + itemIineNumber + "']/div[1]/div[7]/a/i"))
				.click();
	}

	// Review your overview verification
	public static void VerifyPickupDetails(String pTollCarrier, String pAccountNumber, String pCompanyName,
			String pLocation, String pBookedBy, String pPhoneNumber, String pReadyTime, String pClosingTime,
			String pSpecialInstructions) {
		PageBase.MaximumWaitForElementEnabled();
		// assertEquals(pTollCarrier.replaceAll("\\s",
		// ""),BaseWebdriver.driver.findElement(tollCarrier).getText().replaceAll("\\s",
		// ""));
		assertEquals(pAccountNumber.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(accountNumber).getText().replaceAll("\\s", ""));
		assertEquals(pCompanyName.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(company).getText().replaceAll("\\s", ""));
		assertEquals(pLocation.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(location).getText().replaceAll("\\s", ""));
		assertEquals(pBookedBy.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(bookedBy).getText().replaceAll("\\s", ""));
		assertEquals(pPhoneNumber.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(phoneNumber).getText().replaceAll("\\s", ""));
		assertEquals(pReadyTime.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(readyTime).getText().replaceAll("\\s", ""));
		assertEquals(pClosingTime.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(closingTime).getText().replaceAll("\\s", ""));
		assertEquals(pSpecialInstructions.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(specialInstructions).getText().replaceAll("\\s", ""));

	}

	public static void VerifyPickupDetailsTollPrioNZ(String pTollCarrier, String pAccountNumber, String pCompanyName,
			String pLocation, String pBookedBy, String pPhoneNumber, String pReadyTime, String pClosingTime,
			String pSpecialInstructions) {
		PageBase.MaximumWaitForElementEnabled();
		// assertEquals(pTollCarrier.replaceAll("\\s",
		// ""),BaseWebdriver.driver.findElement(tollCarrier).getText().replaceAll("\\s",
		// ""));
		assertEquals(pAccountNumber.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(accountNumber).getText().replaceAll("\\s", ""));
		assertEquals(pCompanyName.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(company).getText().replaceAll("\\s", ""));
		assertEquals(pLocation.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(location).getText().replaceAll("\\s", ""));
		assertEquals(pBookedBy.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(bookedBy).getText().replaceAll("\\s", ""));
		assertEquals(pPhoneNumber.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(phoneNumber).getText().replaceAll("[-+.^:,]", ""));
		assertEquals(pReadyTime.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(readyTime).getText().replaceAll("\\s", ""));
		assertEquals(pClosingTime.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(closingTime).getText().replaceAll("\\s", ""));
		assertEquals(pSpecialInstructions.replaceAll("\\s", ""),
				BaseWebdriver.driver.findElement(specialInstructions).getText().replaceAll("\\s", ""));

	}

	public static String VerifyItemDescription(int lineNumber) {
		return BaseWebdriver.driver
				.findElement(By.xpath("//*[@id='line-item-" + lineNumber + "']/div[2]/div/div[1]/div[1]/div/p"))
				.getText();

	}

	public static String VerifyService(int lineNumber) {
		return BaseWebdriver.driver
				.findElement(By.xpath("//div[@id='line-item-" + lineNumber + "']/div[2]/div/div/div[3]/div/p"))
				.getText();

	}

	public static String VerifyChargeToAccount(int lineNumber, String pChargeToAccount) {
		return BaseWebdriver.driver.findElement(By.xpath("//div[@id='line-item-" + lineNumber
				+ "']/div[2]/div/div[1]/div[label(text()='" + pChargeToAccount + "')]/div/p")).getText();

	}// *[@id="line-item-0"]/div[2]/div/div[1]/div[5]/label
		// *[@id="line-item-0"]/div[2]/div/div[1]/div[5]/div/p

	public static String VerifyNumberofItems(int lineNumber) {
		return BaseWebdriver.driver
				.findElement(By.xpath("//div[@id='line-item-" + lineNumber + "']/div[2]/div/div/div[5]/div/p"))
				.getText();

	}

	public static String VerifyPalletSpace(int lineNumber) {
		return BaseWebdriver.driver
				.findElement(By.xpath("//div[@id='line-item-" + lineNumber + "']/div[2]/div/div/div[6]/div/p"))
				.getText();

	}

	public static String VerifyDangerousItems(int lineNumber) {
		return BaseWebdriver.driver
				.findElement(By.xpath("//div[@id='line-item-" + lineNumber + "']/div[2]/div/div[2]/div[4]/div/p"))
				.getText();

	}

	public static String VerifyFoodItem(int lineNumber) {
		return BaseWebdriver.driver
				.findElement(By.xpath("//div[@id='line-item-" + lineNumber + "']/div[2]/div/div[2]/div[5]/div/p"))
				.getText();

	}

	public static void verifyReviewYourPickupScreenHeadings() {
		assertEquals("BOOK A PICKUP", BaseWebdriver.driver.findElement(reviewYourPickupHeading).getText());
	}

	public static void verifyPickupDetailsHeading() {
		assertEquals("PICKUP DETAILS", BaseWebdriver.driver.findElement(pickupDetailsHeading).getText());
	}

	public static void verifyPickupDateTimeHeading() {
		assertEquals("PICKUP DATE & TIME", BaseWebdriver.driver.findElement(pickupDateTimeHeading).getText());
	}

	public static void VerifyAccountNumber(String pAccountNumber) {
		assertEquals(pAccountNumber, BaseWebdriver.driver.findElement(accountNumber).getText());
	}

	public static void VerifyTollCarrier(String pTollCarrier) {
		assertEquals(pTollCarrier, BaseWebdriver.driver.findElement(tollCarrier).getText());
	}

	public static void VerifyCompany(String pCompany) {
		assertEquals(pCompany, BaseWebdriver.driver.findElement(company).getText());
	}

	public static void VerifyLocation(String pLocation) {
		assertEquals(pLocation, BaseWebdriver.driver.findElement(location).getText());
	}

	public static void VerifyBookedby(String pBookedBy) {
		assertEquals(pBookedBy, BaseWebdriver.driver.findElement(bookedBy).getText());
	}

	public static void VerifyPhoneNumber(String pPhoneNumber) {
		assertEquals(pPhoneNumber, BaseWebdriver.driver.findElement(phoneNumber).getText());
	}

	public static void VerifyPickupDate() {
		// assertEquals("15-08-2017",
		// BaseWebdriver.driver.findElement(pickupDate).getText());
	}

	public static void verifyReadyTime(String pReadyTime) {
		assertEquals(pReadyTime, BaseWebdriver.driver.findElement(readyTime).getText());
	}

	public static void verifyClosingTime(String pClosingTime) {
		assertEquals(pClosingTime, BaseWebdriver.driver.findElement(closingTime).getText());
	}

	public static void verifySpecialInstructions(String pSpecialIns) {
		assertEquals(pSpecialIns, BaseWebdriver.driver.findElement(specialInstructions).getText());
	}

	public static void verifyItemDescription() {
		// assertEquals("Industrial
		// Paint",BaseWebdriver.driver.findElement(itemDescription).getText());
	}

	public static void verifyNumberofItems(String pNumberOfItems) {
		assertEquals(pNumberOfItems, BaseWebdriver.driver.findElement(numberofItems).getText());
	}

	public static void verifyLengthWidthHeight(String pLengthWidthHeight) {
		assertEquals(pLengthWidthHeight, BaseWebdriver.driver.findElement(lengthWidthHeight).getText());
	}

	public static void verifyVolume(String pVolume) {
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume1).getText());
	}

	public static void verifyWeight(String pWeight) {
		assertEquals(pWeight, BaseWebdriver.driver.findElement(weight1).getText());
	}

	public static void VerifyItemDetails1(String lineNumber, String pPickupHeading, String pItemName,
			String pDestination, String Service, String mode, String chargeToAccount, String noOfItems,
			String palletSpace, String length, String width, String height, String pVolume, String pWeight,
			String pDangerousGoods, String pFoodItems) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemArrowDownItem1).click();
		PageBase.MaximumWaitForElementEnabled();
		// assertEquals(pPickupHeading,
		// BaseWebdriver.driver.findElement(itemDetailsHeading).getText());
		assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription).getText());
		// assertEquals(pDestination,
		// BaseWebdriver.driver.findElement(destination).getText());
		assertEquals(Service, BaseWebdriver.driver.findElement(serviceType).getText());
		assertEquals(chargeToAccount, BaseWebdriver.driver.findElement(chargeTo).getText());
		assertEquals(noOfItems, BaseWebdriver.driver.findElement(numberOfItems).getText());
		assertEquals(palletSpace, BaseWebdriver.driver.findElement(palletSpaces).getText());
		assertEquals("L: " + length + "cm W: " + width + "cm H: " + height + "cm",
				BaseWebdriver.driver.findElement(largestitemDimensions).getText());
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume).getText());
		assertEquals(pWeight, BaseWebdriver.driver.findElement(weight).getText());
		assertEquals(pDangerousGoods, BaseWebdriver.driver.findElement(dangerousGood).getText());
		assertEquals(pFoodItems, BaseWebdriver.driver.findElement(foodItems).getText());
	}

	public static void VerifyItemDetails1TollNQX(String lineNumber, String pPickupHeading, String pItemName,
			String pDestination, String Service, String chargeToAccount, String noOfItems, String palletSpace,
			String length, String width, String height, String pVolume, String pWeight, String pDangerousGoods,
			String pFoodItems) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemArrowDownItem1).click();
		PageBase.MaximumWaitForElementEnabled();
		// assertEquals(pPickupHeading,
		// BaseWebdriver.driver.findElement(itemDetailsHeading).getText());
		assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription).getText());
		// assertEquals(pDestination,
		// BaseWebdriver.driver.findElement(destination).getText());
		assertEquals(Service, BaseWebdriver.driver.findElement(serviceType).getText());
		assertEquals(chargeToAccount, BaseWebdriver.driver.findElement(chargeTo).getText());
		assertEquals(noOfItems, BaseWebdriver.driver.findElement(numberOfItems).getText());
		assertEquals(palletSpace, BaseWebdriver.driver.findElement(palletSpaces).getText());
		assertEquals("L: " + length + "cm W: " + width + "cm H: " + height + "cm",
				BaseWebdriver.driver.findElement(largestitemDimensions).getText());
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume).getText());
		assertEquals(pWeight, BaseWebdriver.driver.findElement(weight).getText());
		assertEquals(pDangerousGoods, BaseWebdriver.driver.findElement(dangerousGood).getText());
		assertEquals(pFoodItems, BaseWebdriver.driver.findElement(foodItems).getText());
	}

	public static void VerifyItemDetails1TollTasmania(String lineNumber, String pPickupHeading, String pItemName,
			String pDestination, String Service, String chargeToAccount, String noOfItems, String palletSpace,
			String length, String width, String height, String pVolume, String pWeight, String pDangerousGoods) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemArrowDownItem1).click();
		PageBase.MaximumWaitForElementEnabled();
		// assertEquals(pPickupHeading,
		// BaseWebdriver.driver.findElement(itemDetailsHeading).getText());
		assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription).getText());
		// assertEquals(pDestination,
		// BaseWebdriver.driver.findElement(destination).getText());
		assertEquals(Service, BaseWebdriver.driver.findElement(serviceType).getText());
		assertEquals(chargeToAccount, BaseWebdriver.driver.findElement(chargeTo).getText());
		assertEquals(noOfItems, BaseWebdriver.driver.findElement(numberOfItems).getText());
		assertEquals(palletSpace, BaseWebdriver.driver.findElement(palletSpaces).getText());
		assertEquals("L: " + length + "cm W: " + width + "cm H: " + height + "cm",
				BaseWebdriver.driver.findElement(largestitemDimensions).getText());
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume).getText());
		assertEquals(pWeight, BaseWebdriver.driver.findElement(weight).getText());
		assertEquals(pDangerousGoods, BaseWebdriver.driver.findElement(dangerousGood).getText());

	}

	public static void VerifyItemDetails1TollPrioAU(String lineNumber, String pPickupHeading, String pItemName,
			String pDestination, String Service, String noOfItems, String length, String width, String height,
			String pWeight, String pDangerousGoods) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemArrowDownItem1TPrioAU).click();
		PageBase.MaximumWaitForElementEnabled();
		// assertEquals(pPickupHeading,
		// BaseWebdriver.driver.findElement(itemDetailsHeading).getText());
		assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription).getText());
		// assertEquals(pDestination,
		// BaseWebdriver.driver.findElement(destination).getText());
		assertEquals(Service, BaseWebdriver.driver.findElement(serviceType).getText());
		assertEquals(noOfItems, BaseWebdriver.driver.findElement(numberOfItems).getText());
		assertEquals("L: " + length + "cm W: " + width + "cm H: " + height + "cm",
				BaseWebdriver.driver.findElement(largestitemDimensions).getText());
		assertEquals(pWeight, BaseWebdriver.driver.findElement(weight).getText());
		assertEquals(pDangerousGoods, BaseWebdriver.driver.findElement(dangerousGood).getText());

	}

	public static void VerifyItemDetails1TollPrioNZ(String lineNumber, String pPickupHeading, String pItemName,
			String pDestination, String Service, String noOfItems, String length, String width, String height,
			String pWeight, String pDangerousGoods) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemArrowDownItem1TPrioAU).click();
		PageBase.MaximumWaitForElementEnabled();
		// assertEquals(pPickupHeading,
		// BaseWebdriver.driver.findElement(itemDetailsHeading).getText());
		assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription).getText());
		// assertEquals(pDestination,
		// BaseWebdriver.driver.findElement(destination).getText());
		assertEquals(Service, BaseWebdriver.driver.findElement(serviceType).getText());
		assertEquals(noOfItems, BaseWebdriver.driver.findElement(numberOfItems).getText());
		assertEquals("L: " + length + "cm W: " + width + "cm H: " + height + "cm",
				BaseWebdriver.driver.findElement(largestitemDimensions).getText());
		assertEquals(pWeight, BaseWebdriver.driver.findElement(weight).getText());
		assertEquals(pDangerousGoods, BaseWebdriver.driver.findElement(dangerousGood).getText());

	}

	public static void VerifyItemDetails2(String lineNumber, String pPickupHeading, String pItemName,
			String pDestination, String Service, String mode, String chargeToAccount, String noOfItems,
			String palletSpace, String length, String width, String height, String pVolume, String pWeight,
			String pDangerousGoods, String pFoodItems) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemArrowDownItem2).click();
		PageBase.MaximumWaitForElementEnabled();
		// assertEquals(pPickupHeading,
		// BaseWebdriver.driver.findElement(itemDetailsHeading2).getText());
		assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription2).getText());
		// assertEquals(pDestination,
		// BaseWebdriver.driver.findElement(destination2).getText());
		assertEquals(Service, BaseWebdriver.driver.findElement(serviceType2).getText());
		assertEquals(chargeToAccount, BaseWebdriver.driver.findElement(chargeTo2).getText());
		assertEquals(noOfItems, BaseWebdriver.driver.findElement(numberOfItems2).getText());
		assertEquals(palletSpace, BaseWebdriver.driver.findElement(palletSpaces2).getText());
		assertEquals("L: " + length + "cm W: " + width + "cm H: " + height + "cm",
				BaseWebdriver.driver.findElement(largestitemDimensions2).getText());
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume2).getText());
		assertEquals(pWeight, BaseWebdriver.driver.findElement(weight2).getText());
		assertEquals(pDangerousGoods, BaseWebdriver.driver.findElement(dangerousGood2).getText());
		assertEquals(pFoodItems, BaseWebdriver.driver.findElement(foodItems2).getText());
	}

	public static void VerifyItemDetails2TollNQX(String lineNumber, String pPickupHeading, String pItemName,
			String pDestination, String Service, String chargeToAccount, String noOfItems, String palletSpace,
			String length, String width, String height, String pVolume, String pWeight, String pDangerousGoods,
			String pFoodItems) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		//BaseWebdriver.driver.findElement(itemArrowDownItem2).click();
		PageBase.click(itemArrowDownItem2, 5);
		PageBase.MaximumWaitForElementEnabled();
		// assertEquals(pPickupHeading,
		// BaseWebdriver.driver.findElement(itemDetailsHeading2).getText());
		assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription2).getText());
		// assertEquals(pDestination,
		// BaseWebdriver.driver.findElement(destination2).getText());
		assertEquals(Service, BaseWebdriver.driver.findElement(serviceType2).getText());
		assertEquals(chargeToAccount, BaseWebdriver.driver.findElement(chargeTo2).getText());
		assertEquals(noOfItems, BaseWebdriver.driver.findElement(numberOfItems2).getText());
		assertEquals(palletSpace, BaseWebdriver.driver.findElement(palletSpaces2).getText());
		assertEquals("L: " + length + "cm W: " + width + "cm H: " + height + "cm",
				BaseWebdriver.driver.findElement(largestitemDimensions2).getText());
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume2).getText());
		assertEquals(pWeight, BaseWebdriver.driver.findElement(weight2).getText());
		assertEquals(pDangerousGoods, BaseWebdriver.driver.findElement(dangerousGood2).getText());
		assertEquals(pFoodItems, BaseWebdriver.driver.findElement(foodItems2).getText());
	}

	public static void VerifyItemDetails2TollTasmania(String lineNumber, String pPickupHeading, String pItemName,
			String pDestination, String Service, String chargeToAccount, String noOfItems, String palletSpace,
			String length, String width, String height, String pVolume, String pWeight, String pDangerousGoods) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemArrowDownItem2).click();
		PageBase.MaximumWaitForElementEnabled();
		// assertEquals(pPickupHeading,
		// BaseWebdriver.driver.findElement(itemDetailsHeading2).getText());
		assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription2).getText());
		// assertEquals(pDestination,
		// BaseWebdriver.driver.findElement(destination2).getText());
		assertEquals(Service, BaseWebdriver.driver.findElement(serviceType2).getText());
		assertEquals(chargeToAccount, BaseWebdriver.driver.findElement(chargeTo2).getText());
		assertEquals(noOfItems, BaseWebdriver.driver.findElement(numberOfItems2).getText());
		assertEquals(palletSpace, BaseWebdriver.driver.findElement(palletSpaces2).getText());
		assertEquals("L: " + length + "cm W: " + width + "cm H: " + height + "cm",
				BaseWebdriver.driver.findElement(largestitemDimensions2).getText());
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume2).getText());
		assertEquals(pWeight, BaseWebdriver.driver.findElement(weight2).getText());
		assertEquals(pDangerousGoods, BaseWebdriver.driver.findElement(dangerousGood2).getText());
	}

	public static void VerifyItemDetails(int itemLineNumber, String pItemName, String pDestination, String pPostCode,
			String Service, String chargeToAccount, String noOfItems, String palletSpace, String length, String width,
			String height, String pVolume, String pWeight, String pDangerousGoods, String pFoodItems) {

		// BaseWebdriver.driver.findElement(itemArrowDownItem1).click();

		ReviewYourPickupActions.ClickItemArrowdown(itemLineNumber);
		assertEquals(pItemName, VerifyItemDescription(itemLineNumber));
		// assertEquals(pItemName,
		// BaseWebdriver.driver.findElement(itemDescription).getText());
		assertEquals(pDestination + ", " + pPostCode, BaseWebdriver.driver.findElement(destination).getText());
		assertEquals(Service, VerifyService(itemLineNumber));
		assertEquals(chargeToAccount, VerifyChargeToAccount(itemLineNumber, "Charge to"));
		assertEquals(noOfItems, VerifyNumberofItems(itemLineNumber));
		assertEquals(palletSpace, VerifyPalletSpace(itemLineNumber));
		assertEquals("L: " + length + "cm W: " + width + "cm H: " + height + "cm",
				BaseWebdriver.driver.findElement(lenghthHeightWeight).getText());
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume).getText());
		assertEquals(pWeight + " kgs", BaseWebdriver.driver.findElement(weight).getText());
		assertEquals(pDangerousGoods, VerifyDangerousItems(0));
		assertEquals(pFoodItems, VerifyFoodItem(0));

	}

	public static void VerifyNewItemDetails(int itemLineNumber, String pItemName, String pDestination, String pPostCode,
			String Service, String chargeToAccount, String noOfItems, String palletSpace, String length, String width,
			String height, String pVolume, String pWeight) {

		ReviewYourPickupActions.ClickItemArrowdown(itemLineNumber);
		// BaseWebdriver.driver.findElement(By.cssSelector("#line-item-1 >
		// div.item-header.clearfix > div.edit-wrpr > a.edit >
		// i.ico-arrow-down-green")).click();
		// assertEquals(pItemName,
		// BaseWebdriver.driver.findElement(itemDescription).getText());
		assertEquals(pItemName, VerifyItemDescription(itemLineNumber));

		assertEquals(pDestination + ", " + pPostCode, BaseWebdriver.driver.findElement(destination).getText());
		assertEquals(Service, VerifyService(1));
		assertEquals(chargeToAccount, VerifyChargeToAccount(itemLineNumber, chargeToAccount));
		assertEquals(noOfItems, VerifyNumberofItems(itemLineNumber));
		assertEquals(palletSpace, VerifyPalletSpace(itemLineNumber));
		assertEquals("L: " + length + "cm W: " + width + "cm H: " + height + "cm",
				BaseWebdriver.driver.findElement(lenghthHeightWeight).getText());
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume).getText());
		assertEquals(pWeight + " kgs", BaseWebdriver.driver.findElement(weight).getText());
		assertEquals("No", VerifyDangerousItems(itemLineNumber));
		assertEquals("No", VerifyFoodItem(itemLineNumber));

	}

	public static void VerifyRefrigerationDetails(String pTempLow, String pTempHigh, String pRefNumber,
			String pBookInNumbers) {
		assertEquals(pTempLow, BaseWebdriver.driver.findElement(tempLow).getText());
		assertEquals(pTempHigh, BaseWebdriver.driver.findElement(tempHigh).getText());
		assertEquals(pRefNumber, BaseWebdriver.driver.findElement(refNumber).getText());
		assertEquals(pBookInNumbers, BaseWebdriver.driver.findElement(bookInNumbers).getText());
		//// assertEquals("Tomorrow, Tuesday, 15 August 2017",
		//// driver.findElement(By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div[2]/div/div/p")).getText());
		// assertEquals("Wednesday, 16 August 2017",
		//// driver.findElement(By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div[2]/div[2]/div/p")).getText());
		// assertEquals("16:00",
		//// driver.findElement(By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div[2]/div[3]/div/p")).getText());
	}

	public static void VerifyDangerousGoodsDetails(String pDangerousGoodsHeading, String pUNnumber,
			String pClassDivision, String pPackingGroup, String pSubrisk, String pProperShippingName,
			String pDgPackingGroup, String pDgPKG, String pDgQTY, String pTechnicalName) {
		assertEquals(pDangerousGoodsHeading, BaseWebdriver.driver.findElement(dangerousGoodsHeading).getText());
		BaseWebdriver.driver.findElement(dangerousGoodsArrowdown).click();
		PageBase.MediumWaitForElementEnabled();
		assertEquals(pUNnumber, BaseWebdriver.driver.findElement(unNumber).getText());
		assertEquals(pClassDivision, BaseWebdriver.driver.findElement(classDivision).getText());
		assertEquals(pPackingGroup, BaseWebdriver.driver.findElement(packingGroup).getText());
		assertEquals(pSubrisk, BaseWebdriver.driver.findElement(subrisk).getText());
		assertEquals(pProperShippingName, BaseWebdriver.driver.findElement(properShippingName).getText());
		assertEquals(pDgPackingGroup, BaseWebdriver.driver.findElement(dgPackingDescription).getText());
		assertEquals(pDgPKG, BaseWebdriver.driver.findElement(dgPKG).getText());
		assertEquals(pDgQTY, BaseWebdriver.driver.findElement(dgQTY).getText());
		assertEquals(pTechnicalName, BaseWebdriver.driver.findElement(technicalName).getText());
		PageBase.MoveToElement(ReviewYourPickupActions.itemArrowDownItem1, BookAPickupActions.dangerousGoodsArrowdown);

		// Submit Book a pickup details
	}

	public static void ClickConfirmPickup() {
		try {
			BaseWebdriver.driver.findElement(confirmPickupBtn).click();
		} catch (Exception ex) {

			BaseWebdriver.driver.findElement(destination).click();
			BaseWebdriver.driver.findElement(destination).clear();
			PageBase.MinimumWaitForElementEnabled();
			PageBase.retryingFindClick(
					By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[2]/div"));
			PageBase.MinimumWaitForElementEnabled();
			BookAPickupActions.ClickReviewBook();
			BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
			PageBase.MinimumWaitForElementEnabled();
		}

	}

	public static void ClickEdit() {
		BaseWebdriver.driver.findElement(EditBtn).click();
	}

	public static void VerifyNoEditBtn() {
		try {
			BaseWebdriver.driver.findElement(EditBtn).click();
		}

		catch (Exception ex) {
			System.out.println("Cannot Edit This page");

		}
	}//*[@id="book-a-pickup-placeholder"]/div[1]/div[1]/div[1]/div[3]/span/span

	public static String VerifyConfirmPickupDetails(String userName) {
		// assertEquals("PICKUP Submitted",
		// BaseWebdriver.driver.findElement(pickupConfirmed).getText());
		PageBase.MaximumWaitForElementEnabled();
		assertEquals("Pickup booked", BaseWebdriver.driver.findElement(pickupSubmitted).getText());
		assertEquals("Picked up", BaseWebdriver.driver.findElement(pickedupLable).getText());
		assertEquals("In transit", BaseWebdriver.driver.findElement(intransit).getText());
		assertEquals("Out for delivery", BaseWebdriver.driver.findElement(outForDeliveryLable).getText());
		assertEquals("Delivered", BaseWebdriver.driver.findElement(deliveredLable).getText());
		 BookAPickupActions.GetReferenceNumber() ;
		String Emailable = "We have sent you an email confirming your pickup booking to:";
		// assertEquals(Emailable.replaceAll("\\s", "")+userName
		// , BaseWebdriver.driver.findElement(emailLable).getText().replaceAll("\\s",
		// ""));
		// assertEquals(userName,
		// BaseWebdriver.driver.findElement(emailAddress).getText());
		return BaseWebdriver.driver.findElement(emailAddress).getText();
	}
	
	public static void VerifyRefrenceNumberContainsTW() {
		
		 String ref=BookAPickupActions.GetReferenceNumber();
		 Boolean results=ref.contains("TW");
		 assertEquals(true, results);
		 
	}

	public static void VerifyEmailableMessage(String EmailableMsg) {

		assertEquals(EmailableMsg, BaseWebdriver.driver.findElement(emailLable).getText().replaceAll("\\s", ""));

	}

	public static void VerifyEmailAddress(String Email) {

		assertEquals(Email, BaseWebdriver.driver.findElement(emailAddress).getText());

	}
}
