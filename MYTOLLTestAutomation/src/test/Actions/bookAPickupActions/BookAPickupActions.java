
package bookAPickupActions;

import GlobalActions.PageBase;
import createShipmentActions.CreateShipmentActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

import static org.junit.Assert.assertEquals;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import baseWebdriver.BaseWebdriver;
import rateEnquiryActions.RateEnquiryActions;

public class BookAPickupActions {

	public static By TollCarrierDropdown = By.xpath("//*[@id=\"BU-selector\"]/label/a/i");
	public static By TollCarrierTextField = By.name("placeholder-bu");
	public static By TollCarrierIntermodalSpecialized = By.xpath("//*[@id=\"BU-selector\"]/div/ul/li[4]/div");
	public static By AccountNumberDropdown = By.xpath("//*[@id=\"account-selector\"]/label/a/i");
	public static By AccountNumberDropdownitem1 = By.xpath("//*[@id=\"account-selector\"]/div/ul/li[1]/div[1]");
	public static By ServiceDropdown = By.xpath("//*[@id=\"service-type-selector\"]//a/i");
	public static By BookaPickupScreenHeading = By.cssSelector("h1");
	public static By tollCarrier = By.name("placeholder-bu");
	public static By accountNumber = By.name("placeholder-account");
	public static By locationDropdown = By.xpath("//*[@id=\"location-selector\"]/label/a/i");
	public static By yesBtn = By.xpath("//*[@id=\"pickup-location\"]/div[1]/div[3]/div/label/span[1]");
	public static By location = By.name("placeholder-location");
	public static By name = By.id("name");
	public static By phoneNumber = By.id("phone");
	public static By countryCode = By.cssSelector("div.selected-dial-code");
	public static By quickModelabel = By
			.xpath("//*[@id=\"grid-view-selector-wrpr\"]/div/label[text(), 'Quick entry mode']");
	public static By destinationDropdown = By.xpath("//*[@id=\"destination-country-selector\"]/label/a/i");

	public static By destination = By.id("destination-address");
	public static By destinationCountry = By.xpath("//*[@id=\"destination-country-selector\"]/label/input[2]");
	public static By destinationaddress = By.cssSelector("ul.option-list > li > div");
	public static By destinationCountryItem = By.xpath("//*[@id=\"destination-country-selector\"]/div/ul/li[11]/div");
	public static By service = By.xpath("//*[@id=\"service-type-selector\"]/div[1]/a/i");
	public static By serviceItem = By.xpath("//*[@id=\"service-type-selector\"]/div[2]/ul/li[3]/div");
	public static By mode = By
			.cssSelector("#mode-type-selector > label.label-wrapper > a.toggler > i.ico-arrow-down-green");
	public static By Mode = By.xpath("//*[@id=\"mode-type-selector\"]/label/a/i");
	public static By modeItem = By.xpath("//*[@id=\"mode-type-selector\"]/div/ul/li");
	public static By chargeToAccountItem = By.xpath("//*[@id=\"charge-to-selector\"]/div/ul/li[1]/div");
	public static By chargeToAccount = By.xpath("//*[@id=\"charge-to-selector\"]/label/a/i");
	public static By itemDescription = By.xpath("//*[@id=\"freight-type-selector\"]/label/a/i");
	public static By itemDescriptionDropdown = By.xpath("//*[@id=\"freight-type-selector\"]/label/a/i");
	public static By itemDescriptionTextField = By.id("item-description");
	public static By selectItemDescription = By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li[3]/div");
	public static By selectItemDescriptionTollPrioAU = By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li/div");
	public static By enterQuantity = By.id("quantity");
	public static By enaterPalletspace = By.xpath("//*[@id=\"pallet-space\"]");
	public static By selectLargestItem = By.xpath("//*[@id=\"freight-type-selector\"]/label/a/i");

	public static By length = By.id("length");
	public static By width = By.id("width");
	public static By height = By.id("height");
	public static By volume = By.xpath("//*[@id=\"volume\"]");
	public static By weight = By.id("weight");

	public static By dangerousGoodNo = By.xpath("(//input[@name='dangerous-radios'])[2]");
	public static By dangerousItemsNewLine = By.xpath("//*[@id=\"dg-radios\"]/label[2]/input");
	public static By containFoodItem = By.xpath("//*[@id=\"containsFoodItems-no\"]");
	public static By UNNumberDropdown = By.xpath("//*[@id=\"un-code-selector-\"]/label/a/i");
	public static By UNNumberTextField = By.xpath("//*[@id=\"un-code-selector-\"]/div/div/div/input");
	public static By UNNumberName = By.xpath("//*[@id=\"un-code-selector-\"]/div/ul/li/div");
	public static By searchBtn = By.xpath("//*[@id=\"un-code-selector-\"]/div/div/div/span/i");

	public static By UNNumberItem = By.xpath("//*[@id=\"un-code-selector-\"]/div/ul/li/div"); // *[@id="un-code-selector-"]/div/ul/li/div
	public static By packingGroupDropdown = By.xpath("//*[@id=\"packaging-grp-selector-\"]/label/a/i");
	public static By packingGroupItem = By.xpath("//*[@id=\"packaging-grp-selector-\"]/div/ul/li[1]/div");
	public static By dgPackagingDescription = By.xpath("//*[@id=\"dg-form\"]/div/div[3]/div[1]/div/input");
	public static By dgPkgQty = By.xpath("//*[@id=\"dg-form\"]/div/div[3]/div[2]/div[1]/div/input");
	public static By dgQtyKg = By.xpath("//*[@id=\"dg-form\"]/div/div[3]/div[2]/div[2]/div/input");
	public static By technicalName = By.id("technical-name-");
	public static By dangerousGoodsArrowdown = By.xpath("//*[@id=\"un-code-selector-\"]/label/a/i");
	public static By classDivision = By.id("class-division-");
	public static By subRisk = By.xpath("//*[@id=\"sub-risk-selector-\"]/label/input[2]");
	public static By packingGroup = By.xpath("//*[@id=\"packaging-grp-selector-\"]/label/input[2]");
	public static By properShippingName = By.id("shipping-name-");

	public static By add = By.id("add-dg-item");
	public static By saveAsTemplateBtn = By.id("save-as-template");

	public static By pickupDate = By.id("pickup-date");
	public static By pickupDateTomorrow = By.xpath("//*[@id=\"steps-3\"]/div[1]/div/div[1]/div/div/ul/li[2]");
	public static By pickupFrom = By.xpath("//*[@id=\"other-pick-location-selector\"]/label/a/i");
	public static By availableTime = By.id("available-time");
	public static By increaseAvailableTimeHours = By.xpath("//*[@id=\"steps-3\"]//*//i[@class=\"ico-accordian-up\"]");
	public static By decreaseReadyTime = By.xpath("//*[@id=\"steps-3\"]//*//i[@class=\"ico-accordian-down\"]");
	public static By increaseAvailableTimeminutes = By
			.xpath("//*[@id=\"steps-3\"]/div[1]/div/div[2]/div[2]/div/div[3]/div[1]/i");
	public static By closingTime = By.id("location-closing-time");
	public static By increaseClosingTimeHours = By
			.xpath("//*[@id=\"steps-3\"]/div[1]/div/div[3]/div[2]/div/div[1]/div[1]/i");
	public static By confirmReadyTime = By.id("confirm-true");
	public static By increaseClosingTimeMinutes = By
			.xpath("//*[@id=\"steps-3\"]/div[1]/div/div[3]/div[2]/div/div[3]/div[1]/i");
	public static By specialInstructions = By.id("comments");
	public static By referenceNumber = By.xpath("//*[@id=\"custom-ref-num\"]");
	public static By consignmentNotes = By.xpath("//*[@id=\"steps-3\"]/div[2]/div[1]/div/label/span[2]");
	public static By reviewBookBtn = By.id("review-pickup");

	public static By recieverAccount = By.id("reciever-account");

	public static By temperatureLow = By.id("temperature-lo");
	public static By temperatureHigh = By.id("temperature-high");
	public static By refrigerationRefNum = By.id("refrigeration-ref-num");
	public static By bookInNum = By.id("book-in-num");
	public static By refrigerationOrderDate = By.id("refrigeraion-order-date");
	public static By refrigerationOrderDateItem = By
			.xpath("//*[@id=\"refrigeration-details-wrpr\"]/div[4]/div/div[1]/div/ul/li[3]");
	public static By refrigerationDeliveryDate = By.id("refrigeraion-delivery-date");
	public static By refrigerationDeliveryDateItem = By
			.xpath("//*[@id=\"refrigeration-details-wrpr\"]/div[4]/div/div[2]/div/ul/li[4]");
	public static By vendorNumber = By.id("vendor-num");
	public static By timeSlot = By.id("refrigeraion-time-slot");
	public static By increaseTimeHours = By.cssSelector("i.ico-accordian-up");
	public static By increaseTimeMinutes = By.cssSelector("div.mins > div.prev.action-next > i.ico-accordian-up");
	public static By confirmMsgReadyTime = By.xpath("//*[@id=\"confirm-box-wrapper\"]/div/div[1]/h3");
	public static By confirmMsgConfirmBtnReadyTime = By.id("confirm-true");
	public static By addANewLine = By.id("add-line-item");
	public static By confirmBtn = By.id("confirm-true");

	// *[@id="alert-box-wrapper"]/div/div/div[1]/h3
	// Error Messages
	public static By NOUNAddedMsgTiltle = By.xpath("//*[@id=\"confirm-box-wrapper\"]/div/div[1]/h3/i");
	public static By NOUNAddedMsgConte = By.xpath("//*[@id=\"confirm-box-wrapper\"]/div/div[1]/h3/i");
	public static By NOUNAddedMsgHeading = By.xpath("//*[@id=\"alert-box-wrapper\"]/div/div/div[1]/h3");
	public static By NOUNAddedMsgContent = By.xpath("//*[@id=\"alert-box-wrapper\"]/div/div/div[2]");
	public static By CloseAlert = By.id("closeAlert");

	// Add Address
	public static final By BookAPickup_Location_Dropdown = By.xpath("//*[@id=\"location-selector\"]/label/a/i");
	public static final By BookAPickup_Location_Selected = By.name("placeholder-location");
	public static final By BookAPickup_Add_Address = By.className("add-new-elem");
	public static final By BookAPickup_New_AddressCompanName = By.id("add-adrr-company-aut");
	public static final By BookAPickup_New_AddressSearch = By.id("address-srch");
	public static final By BookAPickup_New_AddressSearch_Select = By
			.xpath("//*[@id=\"address-srch-wrpr\"]/div/ul/li[1]/div");
	public static final By BookAPickup_New_AddressSearch_Contine = By.id("addr-continue-autmatic");
	public static final By BookAPickup_New_Address_Name = By.id("add-addr-name");
	public static final By BookAPickup_New_Address_Number = By.id("add-addr-phone");
	public static final By BookAPickup_New_Address_Email = By.id("add-addr-email");
	public static final By BookAPickup_New_Address_DGName = By.id("add-addr-dg-contact-name");
	public static final By BookAPickup_New_Address_DGNumber = By.id("add-addr-dg-contact-phone");
	public static final By BookAPickup_New_Address_Add = By.id("add-address-btn-final");
	public static final By BookAPickup_CompanyName = By.id("name");

	public static final String NewAddressCompanyName = "Test";
	public static final String NewAddressCompanyAdd = "60 Collins Street, MELBOURNE VIC 3000";
	public static String NewCompanyName = "Test5213";
	public static final By SearchContactTxtFeild = By.id("sContact");
	public static final By SearchContactButton = By.id("search-field");
	public static final By SearchContactCompanyLocation = By.xpath(
			"//*[@id=\"portlet_mytolladdressbookportlet_WAR_mytolladdressbookportlet\"]//*//div[@class=\"contact-col company-name\"]/p");
	public static final By SearchContactEdit = By.xpath(
			"//*[@id=\"portlet_mytolladdressbookportlet_WAR_mytolladdressbookportlet\"]//*//div[@class=\"contact-col edit\"]/input");
	public static final By SearchContactEditCompanyName = By.xpath("//*[@id=\"CompanyName\"]");
	public static final By SearchContactEditName = By.xpath("//*[@id=\"ContactFirstName\"]");
	public static final By SearchContactEditCompanyNameErrorMsg = By
			.xpath("//*[@id=\"updateJSONData\"]//*//div[1]/div/span[3]");
	public static final By SearchContactEditNameErrorMsg = By
			.xpath("//*[@id=\"updateJSONData\"]//*//div[2]/div/span[2]");
	public static final By SearchContactEditSave = By.cssSelector("input.save-btn");
	public static final By popUpMsg = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//h2");
	public static final By popUpClose = By.xpath("//*[@id=\"response-poup-wrpr\"]//*/a/i");

	// Add Template
	public static final By addTemplate = By.linkText("ADD TEMPLATE");
	public static final By addTemplateCarrier = By.xpath("//*[@id=\"bu-dropdown-new\"]/label/a/i");
	public static final By addTemplateName = By.xpath("//*[@id=\"newTemplate\"]//*//input[@name=\"templateName\"]");
	public static final By addTemplateQty = By.id("addQuantity");
	public static final By addTemplateWeight = By
			.xpath("//*[@id=\"newTemplate\"]//*//input[@name=\"templateTotalWight\"]");
	public static final By addTemplateLenght = By.id("addLength");
	public static final By addTemplateWidth = By.id("addWidth");
	public static final By addTemplateHeight = By.id("addHeight");
	public static final By addTemplateSave = By.id("templateSave");
	public static final By addTemplateSaveMsg = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//h2");
	public static final By addTemplateSaveMsgClose = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//a/i");
	public static final By addTemplateViewMore = By
			.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytolltemplateportlet\"]//*//a[text()='View More']");

	// Add Accounts
	public static final By addAccount = By.linkText("ADD ACCOUNT");
	public static final By addAccountCarrier = By.xpath("//*[@id=\"addAccountForm\"]//*//label/a/i");
	public static final By addAccountNumber = By
			.xpath("//*[@id=\"addAccountForm\"]//*//div/input[@name=\"AccountCode\"]");
	public static final By addAccountAccessType = By
			.xpath("//*[@id=\"addAccountForm\"]//*//div[@data-placeholder=\"Select Access Type\"]/label/a/i");
	public static final By addAccountSave = By.linkText("SAVE");
	public static final By addAccountSaveMsg = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//h2");
	public static final By addAccountSaveMsgClose = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//a/i");
	public static final By addAccountViewMore = By
			.xpath("//*[@id=\"portlet_mytolluserAccountportlet_WAR_mytollupsportlet\"]//*//a[text()='VIEW MORE']");
	public static final By addAccountDeleteMsg = By.xpath("//*[@id=\"confirm-box-wrapper\"]//*//p");
	public static final By addAccountDeleteContinue = By.xpath("//*[@id=\"confirm-true\"]");
	public static final By addAccountDeleteSuccessfull = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//header/h2");
	public static final By addAccountDeleteClose = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//a/i");
	public static final By addAccountCarrierSelector = By.xpath("//*[@id=\"BU-selector\"]/label/a");
	public static final By addTemplateCarrierSelector = By.xpath("//*[@id=\"BU-selector-filter\"]/label/a");

	public static By confirmPickupBtn = By.id("submit-pickup");
	public static By pickUpReferenceNumber = By
			.xpath("//*[@id=\"book-a-pickup-placeholder\"]//*//span[@class=\"reference-no\"]/span");
	public static String pressARROW_DOWN = Keys.chord(Keys.ARROW_DOWN); 
	public static String pressEnter = Keys.chord(Keys.ENTER);
	public static String pressTab = Keys.chord(Keys.TAB);
	public static Actions action = new Actions(BaseWebdriver.driver);
	public static ArrayList BookAPickUpNumbers = new ArrayList();

	
	public static void EnterTollCarrierItem(String pTollCarrierName) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(TollCarrierDropdown).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//div[@id='BU-selector']/div/ul/li/div[text()='" + pTollCarrierName + "']"))
				.click();

	}

	public static void EnterTollCarrier(String pTollCarrierName) {
		try {
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(TollCarrierDropdown).click();
			BaseWebdriver.driver
					.findElement(By.xpath("//div[@id='BU-selector']/div/ul/li/div[text()='" + pTollCarrierName + "']"))
					.click();
		}

		catch (Exception ex) {
			BaseWebdriver.driver.navigate().refresh();
			PageBase.retryingFindClick(TollCarrierDropdown);
			BaseWebdriver.driver
					.findElement(By.xpath("//div[@id='BU-selector']/div/ul/li/div[text()='" + pTollCarrierName + "']"))
					.click();
		}

	}
	
	public static void SelectIntermodalSpecializedCarrier(String pTollCarrierName) {
				 
		try {
			PageBase.MaximumWaitForElementEnabled();
			//action.sendKeys(BaseWebdriver.driver.findElement(TollCarrierTextField), pressTab).perform();//BaseWebdriver.driver.findElement(TollCarrierDropdown).click();	
			PageBase.retryingFindClick(TollCarrierDropdown);
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(TollCarrierTextField).sendKeys(pTollCarrierName);
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(TollCarrierTextField).click();
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"BU-selector\"]/div/ul/li/div[text()='Intermodal & Specialised']")).click();//.sendKeys(Keys.ARROW_DOWN);
			action.sendKeys(pressEnter).perform();
			PageBase.MaximumWaitForElementEnabled();
		
			
			
		}

		catch (Exception ex) {
			BaseWebdriver.driver.navigate().refresh();
			//action.sendKeys(BaseWebdriver.driver.findElement(TollCarrierTextField), pressTab).perform();
			PageBase.retryingFindClick(TollCarrierDropdown);
			BaseWebdriver.driver.findElement(TollCarrierTextField).sendKeys(pTollCarrierName);
			PageBase.MaximumWaitForElementEnabled();
			//BaseWebdriver.driver.findElement(TollCarrierTextField).click();
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(TollCarrierIntermodalSpecialized).click();//.sendKeys(Keys.ARROW_DOWN);
			action.sendKeys(pressEnter).perform();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			
			
		}

	}

	public static void SelectTollCarrierItem(int i) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(tollCarrier).click();
		BaseWebdriver.driver.findElement(By.xpath("//div[@id='BU-selector']/div/ul/li[" + i + "]/div")).click();

	}

	public static void SelectTollCarrier(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"BU-selector\"]/label/a/i")).click();
		BaseWebdriver.driver.findElement(By.xpath("//div[@id='BU-selector']/div/ul/li[" + i + "]/div")).click();

	}
	
	public static String GetTollCarrier() {
		PageBase.MaximumWaitForElementEnabled();
		String TollCarrier=BaseWebdriver.driver.findElement(TollCarrierTextField).getAttribute("value").replaceAll("\\s", "");
		
		return TollCarrier;

	}

	public static void SelectAccountNumberItem(int j) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AccountNumberDropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"account-selector\"]/div/ul/li[" + j + "]+/div[2]"))
				.click();

	}

	public static void EnterAccountNumber(String pAccountNumber) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AccountNumberDropdown).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"account-selector\"]/div/ul/li/div[text()=" + pAccountNumber + "]"))
				.click();

	}

	public static void SelectServiceItemItem(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-type-selector\"]//a/i")).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-type-selector\"]//ul/li[" + j + "]/div")).click();
		PageBase.MinimumWaitForElementEnabled();
	}

	public static void EnterService(String pService) {
		PageBase.MaximumWaitForElementEnabled();
		try {
			PageBase.MoveToElement(BookAPickupActions.accountNumber, BookAPickupActions.name);
			BaseWebdriver.driver.findElement(ServiceDropdown).click();
			BaseWebdriver.driver
					.findElement(By.xpath("//*[@id=\"service-type-selector\"]//ul/li/div[text()='" + pService + "']"))
					.click();
			PageBase.MinimumWaitForElementEnabled();
		} catch (Exception ex) {
			PageBase.MoveToElement(BookAPickupActions.name, BookAPickupActions.serviceItem);
			BaseWebdriver.driver.findElement(ServiceDropdown).click();
			BaseWebdriver.driver.findElement(ServiceDropdown).click();
			BaseWebdriver.driver
					.findElement(By.xpath("//*[@id=\"service-type-selector\"]//ul/li/div[text()='" + pService + "']"))
					.click();
			PageBase.MinimumWaitForElementEnabled();
		}
	}

	public static void SelectServiceItemByText(String pService) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-type-selector\"]//a/i")).click();
		BaseWebdriver.driver
				.findElement(By.xpath(".//*[@id=\"service-type-selector\"]/div/div/ul/li[text()=" + pService + "]"))
				.click();
		// BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-type-selector\"]//ul/li["
		// + j + "]/div")).click();
		PageBase.MinimumWaitForElementEnabled();
	}

	public static String SelectModeItem(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-type-selector\"]/label/a/i")).click();
		String mode = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-type-selector\"]/div/ul/li[" + j + "]"))
				.getText();// *[@id="mode-type-selector"]/label/a/i
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-type-selector\"]/div/ul/li[" + j + "]")).click();
		return mode;

	}

	public static void VerifyModeIsNotAvailable() {
		PageBase.MaximumWaitForElementEnabled();
		try {
			BaseWebdriver.driver.findElement(Mode).click();
		}

		catch (Exception ex) {
			System.out.println("Mode is not available for this Toll carrier");
		}

	}

	public static String SelectChargeToAccount(int j) {// *[@id="charge-to-selector"]/div/ul/li[1]/div
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(chargeToAccount).click();
		String chargeToAccount = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"charge-to-selector\"]//ul/li[" + j + "]/div")).getText();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"charge-to-selector\"]//ul/li[" + j + "]/div")).click();
		return chargeToAccount;
	}

	public static void EnterChargeToAccount(String pChargeToAccount) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(chargeToAccount).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"charge-to-selector\"]/div/ul//div[text()='" + pChargeToAccount + "']"))
				.click();
		// *[@id="charge-to-selector"]/div/ul/li[2]/div
	}

	// *[@id="charge-to-selector"]/div/ul/li[1]/div
	public static void SelectDangerousGoods(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("(//input[@name='dangerous-radios'])[" + j + "]")).click();

	}

	public static void SelectUNNumber(int j, String lookupItem) {
		PageBase.MaximumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(UNNumberDropdown).click();
		BaseWebdriver.driver.findElement(UNNumberTextField).sendKeys(lookupItem);
		BaseWebdriver.driver.findElement(searchBtn).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"un-code-selector\"]//ul/li[" + j + "]/div")).click();
	}

	// *[@id="alert-box-wrapper"]/div/div/div[1]/h3

	public static void VerifyShipmentMsg() {
		PageBase.MaximumWaitForElementEnabled();
		assertEquals("Shipment", BaseWebdriver.driver.findElement(NOUNAddedMsgHeading).getText());
		assertEquals("Select at least one line item", BaseWebdriver.driver.findElement(NOUNAddedMsgContent).getText());
		BaseWebdriver.driver.findElement(CloseAlert).click();
	}

	public static void NoUNAddedErrorMsgValidation() {

		assertEquals("No UN added", BaseWebdriver.driver.findElement(NOUNAddedMsgHeading).getText());
		assertEquals(
				"You have selected a dangerous goods (DG) freight service but you have entered no items in the freight details that contain DGs. Please specify the DG details or change the service type",
				BaseWebdriver.driver.findElement(NOUNAddedMsgContent).getText());
		BaseWebdriver.driver.findElement(CloseAlert).click();
	}

	public static void SelectPackingGroup() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(packingGroupDropdown).click();
		BaseWebdriver.driver.findElement(packingGroupItem).click();

	}

	public static void SelectTollCarrier1(Integer i) {

		SelectTollCarrierItem(i);

	}

	public static void SelectPickupFrom(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(pickupFrom).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"other-pick-location-selector\"]/div/ul/li[" + j + "]/div"))
				.click();
	}

	public static void SelectAccountNumber1() {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(AccountNumberDropdown).click();
		PageBase.MinimumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(AccountNumberDropdownitem1).click();
		PageBase.MinimumWaitForElementEnabled();
	}
	
	public static void SelectAccountNumberUsingKeyboard() {
		PageBase.MaximumWaitForElementEnabled_1();
		action.sendKeys(BaseWebdriver.driver.findElement(AccountNumberDropdown),pressTab).perform();
		action.sendKeys(pressARROW_DOWN).perform();
		action.sendKeys(pressEnter).perform();
		
		
	}

	public static String GetSelectedTollCarrierName() {
		PageBase.MinimumWaitForElementEnabled();
		String tollCarrierTextField = BaseWebdriver.driver.findElement(TollCarrierTextField).getText();
		return tollCarrierTextField;
	}

	public static String GetAccountNumber() {
		PageBase.MinimumWaitForElementEnabled();
		String accountNo = BaseWebdriver.driver.findElement(accountNumber).getAttribute("value");
		return accountNo;

	}

	public static String GetCompany(Integer i) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(locationDropdown).click();
		PageBase.MinimumWaitForElementEnabled();
		String vCompany = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[" + i + "]/div[1]")).getText();
		return vCompany;

	}

	public static String GetLocation(Integer i) {
		PageBase.MaximumWaitForElementEnabled();
		String vLocation = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[" + i + "]/div[2]")).getText();
		return vLocation;

	}

	public static String GetLocationAddressLine2(Integer i) {
		PageBase.MaximumWaitForElementEnabled();
		String vLocationAddressLine2 = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"location-selector\"]/div[" + i + "]/div[3]")).getText();
		return vLocationAddressLine2;

	}

	public static String GetAddressPhoneNumber(Integer i) {
		PageBase.MaximumWaitForElementEnabled();
		String vPhoneNumber = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"location-selector\"]/div[" + i + "]/div[4]")).getText();
		return vPhoneNumber;

	}

	public static String GetName() {
		PageBase.MaximumWaitForElementEnabled();
		String vName = BaseWebdriver.driver.findElement(name).getAttribute("value");
		return vName;
	}

	public static String GetPhoneNumber() {
		PageBase.MaximumWaitForElementEnabled();
		String vName = BaseWebdriver.driver.findElement(phoneNumber).getAttribute("value");
		return vName;
	}

	public static String GetCountryCode() {
		PageBase.MaximumWaitForElementEnabled();
		String vCountryCode = BaseWebdriver.driver.findElement(countryCode).getText();
		return vCountryCode;
	}

	public static String GetVoulme() {
		PageBase.MaximumWaitForElementEnabled();
		String vVolume = BaseWebdriver.driver.findElement(volume).getAttribute("value");
		return vVolume;
	}

	public static String GetReadyTime() {
		//BookAPickupActions.selectReadyTime();
		PageBase.MaximumWaitForElementEnabled();
		
		String vAvailableTime = BaseWebdriver.driver.findElement(availableTime).getAttribute("value");
		return vAvailableTime;
	}

	public static String GetClosingTime() {
		PageBase.MaximumWaitForElementEnabled();
		String vClosingTime = BaseWebdriver.driver.findElement(closingTime).getAttribute("value");
		return vClosingTime;
	}

	public static String GetSpecialIns() {
		PageBase.MaximumWaitForElementEnabled();
		String vSpecialInstructions = BaseWebdriver.driver.findElement(specialInstructions).getAttribute("value");
		return vSpecialInstructions;
	}

	public static void EnterPhoneNumber() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(phoneNumber).click();
		BaseWebdriver.driver.findElement(phoneNumber).clear();
		BaseWebdriver.driver.findElement(phoneNumber).sendKeys("123456789");

	}

	public static void SelectLocation() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(locationDropdown).click();
		// BaseWebdriver.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[1]")).click();

	}

	public static void SelectLocation2(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(locationDropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[" + i + "]")).click();

	}
	
	public static void SelectLocationUsingKeyboard(int i) {
		PageBase.MaximumWaitForElementEnabled();
		action.sendKeys(BaseWebdriver.driver.findElement(locationDropdown), pressTab).perform();  
		BaseWebdriver.driver.findElement(location).click();
		//action.sendKeys(BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[" + i + "]")),pressARROW_DOWN).perform();
		PageBase.MaximumWaitForElementEnabled();
		action.sendKeys(pressARROW_DOWN).perform();
		action.sendKeys(pressEnter).perform();
		//BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[" + i + "]")).sendKeys(pressARROW_DOWN);
		//BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[" + i + "]")).sendKeys(pressEnter);
		//action.keyDown(BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[" + i + "]")),pressARROW_DOWN).perform();//.click();
		//action.sendKeys(BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[" + i + "]")),pressEnter).perform();//.click();
	}

	public static void SelectLocation1(String location) {
		PageBase.MaximumWaitForElementEnabled();
		// BaseWebdriver.driver.findElement(locationDropdown).click();
		// BaseWebdriver.MaximumWaitForElementEnabled();
		// BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[1]")).click();

		// Select selectByValue = new
		// Select(BaseWebdriver.driver.findElement(locationDropdown).click());
		// selectByValue.selectByValue(location);
	}

	// Verification of Book A Pickup screen, Toll Carrier and Account number
	public static void VerifyBookAPickupScreen() {
		assertEquals("BOOK A PICKUP", BaseWebdriver.driver.findElement(BookaPickupScreenHeading).getText());

	}

	public static void VerifyTollCarrier(String tollCarrier1) {
		assertEquals(tollCarrier1, BaseWebdriver.driver.findElement(tollCarrier).getAttribute("value"));

	}

	public static void VerifyAccountnumber(String accountNumber) {
		assertEquals(accountNumber, BaseWebdriver.driver.findElement(AccountNumberDropdownitem1).getAttribute("value"));

	}

	
	public static void VerifyAccountnumber1() {
		assertEquals(GetAccountNumber(),
				BaseWebdriver.driver.findElement(AccountNumberDropdownitem1).getAttribute("value"));

	}

	public static void VerifyYesBtn() {
		assertEquals("YES", BaseWebdriver.driver.findElement(yesBtn).getText());

	}

	public static void VerifyLocation(String location1) {

		assertEquals(location1, BaseWebdriver.driver.findElement(location).getAttribute("value"));
	}

	public static void VerifyName(String name1) {
		assertEquals(name1, BaseWebdriver.driver.findElement(name).getAttribute("value"));

	}

	public static void verifyPhonenumber(String phoneNumber1, String pCountryCode) {
		assertEquals(phoneNumber1, BaseWebdriver.driver.findElement(phoneNumber).getAttribute("value"));
		assertEquals(pCountryCode, BaseWebdriver.driver.findElement(countryCode).getText());
	}

	public static void VerifyQuickMode() {
		assertEquals("Quick entry mode", BaseWebdriver.driver.findElement(quickModelabel).getText());
	}

	public static void Selectservice(int j) {
		SelectServiceItemItem(j);

	}

	public static void SelectDestination(String pDestination) {

		PageBase.MinimumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(destination).click();
		BaseWebdriver.driver.findElement(destination).clear();
		BaseWebdriver.driver.findElement(destination).sendKeys(pDestination);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.retryingFindClick(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[2]/div"));
		PageBase.MinimumWaitForElementEnabled();
		/*
		 * PageBase.MaximumWaitForElementEnabled();
		 * PageBase.retryingFindClick(destination);
		 * PageBase.waitForElement(BaseWebdriver.driver.findElement(destination), 10);
		 * BaseWebdriver.driver.findElement(destination).clear();
		 * BaseWebdriver.driver.findElement(destination).sendKeys(pDestination);
		 * PageBase.MaximumWaitForElementEnabled();
		 * BaseWebdriver.driver.findElement(By.xpath(
		 * "//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[text()='"+
		 * pDestination+"']")).click(); PageBase.retryingFindClick(destinationaddress);
		 */

	}

	public static String SelectDestination1(String pDestination, String pDestinationValue) {

		PageBase.MinimumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(destination).click();
		BaseWebdriver.driver.findElement(destination).clear();
		BaseWebdriver.driver.findElement(destination).sendKeys(pDestination);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.retryingFindClick(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[2]/div"));
		String Destination = BaseWebdriver.driver.findElement(destination).getAttribute("value");
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		return Destination;

	}

	public static void SelectDestinationCountry(String pDestination, String pDestinationCountry) {

		PageBase.MinimumWaitForElementEnabled();
		PageBase.retryingFindClick(destinationCountry);
		PageBase.waitForElement(BaseWebdriver.driver.findElement(destinationCountry), 10);
		BaseWebdriver.driver.findElement(destinationCountry).clear();
		BaseWebdriver.driver.findElement(destinationCountry).sendKeys(pDestination);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(By.xpath("//*[@id=\"destination-country-selector\"]/div/ul/li[11]/div"));
		// *[@id="item-details-sub-form"]/div[1]/div[2]/div/div/ul/li[2]/div

	}

	public static void EnterDestination(String pDestination) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destination);
		PageBase.waitForElement(BaseWebdriver.driver.findElement(destination), 10);
		BaseWebdriver.driver.findElement(destination).clear();
		BaseWebdriver.driver.findElement(destination).sendKeys(pDestination);
		// BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[text()='"+pDestination+"']")).click();
		PageBase.retryingFindClick(By.xpath(
				"//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[text()='" + pDestination + "']"));

	}

	public static void EnterDestinationNZ(String pDestination, String pDestinationItem) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destination);
		PageBase.waitForElement(BaseWebdriver.driver.findElement(destination), 10);
		BaseWebdriver.driver.findElement(destination).clear();
		BaseWebdriver.driver.findElement(destination).sendKeys(pDestination);
		PageBase.MinimumWaitForElementEnabled();
		// BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[1]/div")).click();
		PageBase.retryingFindClick(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[1]/div"));

		// BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[text()='"+pDestinationItem+"']/div")).click();
		// PageBase.retryingFindClick(destinationaddress);
		// *[@id="item-details-sub-form"]/div[1]/div[2]/div/div/ul/li[1]/div

	}

	public static void SelectDestinationCountry(int j) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destinationDropdown);
		PageBase.waitForElement(BaseWebdriver.driver.findElement(destinationDropdown), 10);
		// BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"destination-country-selector\"]/div/ul/li["+j+"]/div")).click();
		PageBase.retryingFindClick(By.xpath("//*[@id=\"destination-country-selector\"]/div/ul/li[" + j + "]/div"));

	}

	public static void SelectMode() {
		// BookAPickupObjects.SelectModeItem(j);
		PageBase.waitForElement(BaseWebdriver.driver.findElement(mode), 10);
		BaseWebdriver.driver.findElement(mode).click();
		PageBase.waitForElement(BaseWebdriver.driver.findElement(mode), 10);
		BaseWebdriver.driver.findElement(modeItem).click();

	}

	public static void SelectMode2(int j) {
		SelectModeItem(j);

	}

	public static void SelectChargeToAccount() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(chargeToAccount).click();
		BaseWebdriver.driver.findElement(chargeToAccountItem).click();
	}

	public static String SelectChargeToAccount2(int j) {
		PageBase.waitForElement(BaseWebdriver.driver.findElement(chargeToAccount), 10);
		return SelectChargeToAccount(j);

	}

	public static void SelectItemDescription() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemDescription).click();
		BaseWebdriver.driver.findElement(selectItemDescription).click();
	}

	public static void SelectItemDescriptionTollPriorityAU(String pItem) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemDescription).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li/div[text()='" + pItem + "']"))
				.click();
	}

	public static void SelectItem(int j) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemDescriptionTextField).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"freight-type-selector\"]/div[2]/ul/li[" + j + "]/div"))
				.click();
	}

	public static void SelectItemDescriptionTollPriorityAU() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemDescription).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li[2]/div")).click();
	}

	public static void EnterItem(String itemName) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemDescriptionTextField).click();
		BaseWebdriver.driver.findElement(itemDescriptionTextField).clear();
		BaseWebdriver.driver.findElement(itemDescriptionTextField).sendKeys(itemName);

	}

	public static void SelectLargestItem(int j) {

		PageBase.click(selectLargestItem, 2);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.click(By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li[" + j + "]/div"), 2);
	}

	public static void EnterQuantity(String quntity) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(enterQuantity).click();
		BaseWebdriver.driver.findElement(enterQuantity).clear();
		BaseWebdriver.driver.findElement(enterQuantity).sendKeys(quntity);

	}

	public static void EnterPalletSpace(String palletSpace) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(enaterPalletspace).click();
		BaseWebdriver.driver.findElement(enaterPalletspace).clear();
		BaseWebdriver.driver.findElement(enaterPalletspace).sendKeys(palletSpace);
	}

	public static void EnterLengthWidthHeightVolumeWeight(String plength, String pwidth, String pheight,
			String pweight) {
		try {
			PageBase.MinimumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(length).click();
			BaseWebdriver.driver.findElement(length).clear();
			BaseWebdriver.driver.findElement(length).sendKeys(plength);
			BaseWebdriver.driver.findElement(width).click();
			BaseWebdriver.driver.findElement(width).clear();
			BaseWebdriver.driver.findElement(width).sendKeys(pwidth);
			BaseWebdriver.driver.findElement(height).click();
			BaseWebdriver.driver.findElement(height).clear();
			BaseWebdriver.driver.findElement(height).sendKeys(pheight);
			PageBase.MinimumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(weight).click();
			BaseWebdriver.driver.findElement(weight).clear();
			BaseWebdriver.driver.findElement(weight).sendKeys(pweight);
		}

		catch (Exception ex) {
			RateEnquiryActions.EnterWeight(pweight);
		}
	}

	public static void EnterLengthWidthHeight(String plength, String pwidth, String pheight) {
		PageBase.waitForElement(BaseWebdriver.driver.findElement(length), 10);
		BaseWebdriver.driver.findElement(length).click();
		BaseWebdriver.driver.findElement(length).clear();
		BaseWebdriver.driver.findElement(length).sendKeys(plength);
		BaseWebdriver.driver.findElement(width).click();
		BaseWebdriver.driver.findElement(width).clear();
		BaseWebdriver.driver.findElement(width).sendKeys(pwidth);
		BaseWebdriver.driver.findElement(height).click();
		BaseWebdriver.driver.findElement(height).clear();
		BaseWebdriver.driver.findElement(height).sendKeys(pheight);

	}

	public static void EnterWeight(String pweight) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(weight).click();
		BaseWebdriver.driver.findElement(weight).clear();
		BaseWebdriver.driver.findElement(weight).sendKeys(pweight);
	}

	public static void selectDangerousGood() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(dangerousGoodNo).click();
	}

	public static void selectDangerousGoodNewLine() {
		BaseWebdriver.driver.findElement(dangerousItemsNewLine).click();
	}

	public static void EnterTechnicalName(String pTechnicalName) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(technicalName).click();
		BaseWebdriver.driver.findElement(technicalName).clear();
		BaseWebdriver.driver.findElement(technicalName).sendKeys(pTechnicalName);
	}

	public static void ClickAdd() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(add).click();
	}

	public static void selectContainFoodItem() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(containFoodItem).click();
	}

	public static void selectPickupDate() {
		BaseWebdriver.driver.findElement(pickupDate).click();
		BaseWebdriver.driver.findElement(pickupDateTomorrow).click();

	}

	public static String ReturnPickupDate() {
		return BaseWebdriver.driver.findElement(pickupDate).getText();
	}

	public static void selectReadyTime() {

		String readyTime = GetReadyTime().toString();
		String newReadyTime = readyTime.substring(0, 2);
		System.out.println(newReadyTime);
		Integer readyTimeInt = Integer.parseInt(newReadyTime);
		System.out.println(readyTimeInt);

		if (readyTimeInt >= 15) {
			BaseWebdriver.driver.findElement(availableTime).click();
			BaseWebdriver.driver.findElement(decreaseReadyTime).click();
			BaseWebdriver.driver.findElement(decreaseReadyTime).click();

			BaseWebdriver.driver.findElement(decreaseReadyTime).click();
			BaseWebdriver.driver.findElement(decreaseReadyTime).click();
		}

		if (readyTimeInt <= 8) {
			BaseWebdriver.driver.findElement(availableTime).click();
			BaseWebdriver.driver.findElement(increaseAvailableTimeHours).click();
			BaseWebdriver.driver.findElement(increaseAvailableTimeHours).click();

			BaseWebdriver.driver.findElement(increaseAvailableTimeHours).click();
		}
		/*
		 * Integer i; for (i=1; i<=17; i++) {
		 * BaseWebdriver.driver.findElement(increaseAvailableTimeHours).click();
		 * 
		 * }
		 * 
		 * BaseWebdriver.driver.findElement(increaseAvailableTimeminutes).click();
		 * BaseWebdriver.driver.findElement(increaseAvailableTimeminutes).click();
		 * BaseWebdriver.driver.findElement(increaseAvailableTimeminutes).click();
		 * BaseWebdriver.driver.findElement(increaseAvailableTimeminutes).click();
		 */

	}

	public static void selectClosingTime() {
		BaseWebdriver.driver.findElement(closingTime).click();
		BaseWebdriver.driver.findElement(increaseClosingTimeHours).click();

	}

	public static void selectConsignmentNotes(int j) {

		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"steps-3\"]/div[2]/div[1]/div/label/span[" + j + "]"))
				.click();
	}

	public static void EnterSpecialInstructions(String comment) {
		BaseWebdriver.driver.findElement(specialInstructions).click();
		BaseWebdriver.driver.findElement(specialInstructions).clear();
		BaseWebdriver.driver.findElement(specialInstructions).sendKeys(comment);
	}

	public static void ClickReviewBook() {
		BaseWebdriver.driver.findElement(reviewBookBtn).click();
		// PageBase.click(reviewBookBtn, 2);
	}

	public static void ConfirmReadyTimeAndConfirmPickup() {

		boolean results = true;
		try {
			if (BaseWebdriver.driver.findElement(confirmReadyTime).isDisplayed() == results) {
				BaseWebdriver.driver.findElement(confirmReadyTime).click();
			}
		} catch (Exception ex) {
			System.out.println(ex);
			// ReviewYouPickupActions.ClickConfirmPickup();
			// BookAPickupActions.ClickReviewBook();

		}

	}

	public static String ReadyTime() {
		String readyTime = BaseWebdriver.driver.findElement(availableTime).getText();
		return readyTime;
	}

	public static String ClosingTime() {
		String pclosingTime = BaseWebdriver.driver.findElement(closingTime).getText();
		return pclosingTime;
	}

	public static void EnterReferenceNumber(String ref) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(referenceNumber).click();
		BaseWebdriver.driver.findElement(referenceNumber).clear();
		BaseWebdriver.driver.findElement(referenceNumber).sendKeys(ref);

	}

	public static void ReceiverAccountNumber(String paccountNumber) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(recieverAccount).click();
		BaseWebdriver.driver.findElement(recieverAccount).clear();
		BaseWebdriver.driver.findElement(recieverAccount).sendKeys(paccountNumber);

	}

	public static void EnterTempretureRefBookinNumbers(String tempLow, String tempHigh, String ref, String BookNo) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(temperatureLow).click();
		BaseWebdriver.driver.findElement(temperatureLow).clear();
		BaseWebdriver.driver.findElement(temperatureLow).sendKeys(tempLow);
		BaseWebdriver.driver.findElement(temperatureHigh).click();
		BaseWebdriver.driver.findElement(temperatureHigh).clear();
		BaseWebdriver.driver.findElement(temperatureHigh).sendKeys(tempHigh);
		BaseWebdriver.driver.findElement(refrigerationRefNum).click();
		BaseWebdriver.driver.findElement(refrigerationRefNum).clear();
		BaseWebdriver.driver.findElement(refrigerationRefNum).sendKeys(ref);
		BaseWebdriver.driver.findElement(bookInNum).click();
		BaseWebdriver.driver.findElement(bookInNum).clear();
		BaseWebdriver.driver.findElement(bookInNum).sendKeys(BookNo);
	}

	public static void EnterRefrigerationOrderDate() {
		BaseWebdriver.driver.findElement(refrigerationOrderDate).click();
		BaseWebdriver.driver.findElement(refrigerationOrderDateItem).click();
	}

	public static void EnterRefrigerationDeliveryDate() {
		BaseWebdriver.driver.findElement(refrigerationDeliveryDate).click();
		BaseWebdriver.driver.findElement(refrigerationDeliveryDateItem).click();
	}

	public static void EnterVendorDetails(String vendorNum) {
		BaseWebdriver.driver.findElement(vendorNumber).click();
		BaseWebdriver.driver.findElement(vendorNumber).clear();
		BaseWebdriver.driver.findElement(vendorNumber).sendKeys(vendorNum);
	}

	public static void EnterTimeSlot() {

		BaseWebdriver.driver.findElement(timeSlot).click();
		BaseWebdriver.driver.findElement(increaseTimeHours).click();
		BaseWebdriver.driver.findElement(increaseTimeHours).click();
		BaseWebdriver.driver.findElement(increaseTimeHours).click();
		BaseWebdriver.driver.findElement(increaseTimeHours).click();
		BaseWebdriver.driver.findElement(increaseTimeMinutes).click();
		BaseWebdriver.driver.findElement(increaseTimeMinutes).click();
		BaseWebdriver.driver.findElement(increaseTimeMinutes).click();
		BaseWebdriver.driver.findElement(increaseTimeMinutes).click();
	}

	public static void AddANewLine(String pDestination, String pDestinationItem, String pService,
			String pItemTemplateName, String pNumberOfItems, String palletSpace, String pChargeToAccount,
			String pLength, String pWidth, String pHeight, String pWeight) {

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BaseWebdriver.driver.findElement(addANewLine).click();
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.EnterService(pService);
		BookAPickupActions.EnterItem(pItemTemplateName);
		BookAPickupActions.SelectModeItem(1);

		BookAPickupActions.EnterQuantity(pNumberOfItems);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(pLength, pWidth, pHeight, pWeight);

		BookAPickupActions.SelectChargeToAccount2(1);

		BookAPickupActions.SelectDestination1(pDestination, pDestinationItem);
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);

	}

	public static void AddANewLineTollNQX(String pDestination, String pDestinationItem, String pService,
			String pItemTemplateName, String pNumberOfItems, String palletSpace, String pChargeToAccount,
			String pLength, String pWidth, String pHeight, String pWeight) {

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BaseWebdriver.driver.findElement(addANewLine).click();
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.EnterService(pService);
		BookAPickupActions.EnterItem(pItemTemplateName);
		BookAPickupActions.EnterQuantity(pNumberOfItems);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(pLength, pWidth, pHeight, pWeight);

		BookAPickupActions.SelectChargeToAccount2(1);

		BookAPickupActions.SelectDestination1(pDestination, pDestinationItem);
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);

	}

	public static void ClickAddANewLine() {
		BaseWebdriver.driver.findElement(addANewLine).click();
	}

	public static void AddANewLineTollTasmania(String ServiceGeneral) {

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);

		BaseWebdriver.driver.findElement(addANewLine).click();
		BookAPickupActions.EnterItem("Automation Temp1");
		BookAPickupActions.Selectservice(2);
		BookAPickupActions.SelectDestination("melb");
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.selectDangerousGoodNewLine();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(addANewLine).click();
		// BookAPickupActions.selectContainFoodItem(); removed
		// PageBase.Scrollbar(800, 1200);
		PageBase.MediumWaitForElementEnabled();

		// PageBase.MoveToElement(BookAPickupActions.length, BookAPickupActions.width);

	}

	public static void SaveAsTemplate() {

		BaseWebdriver.driver.findElement(saveAsTemplateBtn).click();

	}

	public static void EnterDangerousGoodsDetails(int j, String lookupItem, String packageDescription, String pDgPkgQty,
			String pDgQtyKg) {
		try {
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(UNNumberDropdown).click();
			BaseWebdriver.driver.findElement(UNNumberTextField).sendKeys(lookupItem);
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(searchBtn).click();
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"un-code-selector-\"]/div/ul/li[" + j + "]/div"))
					.click();
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(dgPackagingDescription).sendKeys(packageDescription);
			BaseWebdriver.driver.findElement(dgPkgQty).sendKeys(pDgPkgQty);
			BaseWebdriver.driver.findElement(dgQtyKg).sendKeys(pDgQtyKg);

		}

		catch (Exception ex) {
			CreateShipmentActions.EnterDangerousGoodsDetails(j, lookupItem, packageDescription, pDgPkgQty, pDgQtyKg);

		}

	}

	public static void SelectDangerousGoodsDetails(String lookupItem, String packageDescription, String pDgPkgQty,
			String pDgQtyKg) {

		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(UNNumberDropdown).click();
		BaseWebdriver.driver.findElement(UNNumberTextField).sendKeys(lookupItem);
		BaseWebdriver.driver.findElement(searchBtn).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"un-code-selector-\"]/div/ul/li/div")).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(dgPackagingDescription).sendKeys(packageDescription);
		BaseWebdriver.driver.findElement(dgPkgQty).sendKeys(pDgPkgQty);
		BaseWebdriver.driver.findElement(dgQtyKg).sendKeys(pDgQtyKg);

	}

	public static void EnterPackgingGroup(Integer packagingGroup) {
		try {
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(packingGroupDropdown).click();
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver
					.findElement(By.xpath(
							"//*[@id=\"packaging-grp-selector-\"]/div/ul/li/div[text()='" + packagingGroup + "']"))
					.click();
		} catch (Exception ex) {
			CreateShipmentActions.SelectPackgingGroup(packagingGroup);
		}
	}

	public static void SelectPackgingGroup(Integer packagingGroup) {
		try {
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(packingGroupDropdown).click();
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver
					.findElement(By.xpath("//*[@id=\"packaging-grp-selector-\"]/div/ul/li[" + packagingGroup + "]/div"))
					.click();
		} catch (Exception ex) {
			CreateShipmentActions.SelectPackgingGroup(packagingGroup);
		}
	}

	public static String GetUNNumber() {
		PageBase.MediumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(dangerousGoodsArrowdown).click();
		PageBase.MediumWaitForElementEnabled();
		return BaseWebdriver.driver.findElement(UNNumberItem).getText().toString();

	}

	public static String GetClassDivision() {

		return BaseWebdriver.driver.findElement(classDivision).getAttribute("value").toString();

	}

	public static String GetSubRisk() {

		return BaseWebdriver.driver.findElement(subRisk).getAttribute("value").toString();

	}

	public static String GetPackingGroup() {

		return BaseWebdriver.driver.findElement(packingGroup).getAttribute("value").toString();

	}

	public static String GetProperShippingName() {

		return BaseWebdriver.driver.findElement(properShippingName).getAttribute("value").toString();

	}
	
	public static String GetReferenceNumber() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		String referenceNumber=BaseWebdriver.driver.findElement(pickUpReferenceNumber).getAttribute("value").toString();
		System.out.println("Reference Number ");
		return referenceNumber;

	}

	public static void ClickConfirm() {
		PageBase.MaximumWaitForElementEnabled();
		// BaseWebdriver.driver.findElement(confirmBtn).click();

	}

	public static void ConfirmPickUpandGetReferenceNo() {
		Reporter.log("User Clicks Confirm Pick Up and Awaits Reference Number");
		PageBase.waitForElement(confirmPickupBtn, 10);
		PageBase.click(confirmPickupBtn, 2);
		PageBase.waitForElement(pickUpReferenceNumber, 10);
		String ReferenceNumber = BaseWebdriver.driver.findElement(pickUpReferenceNumber).getText().substring(19);
		if (ReferenceNumber != null && !ReferenceNumber.contains("undefined")) {
			System.out.println("Reference No: " + ReferenceNumber);
			Reporter.log("Reference No: " + ReferenceNumber);
			BookAPickUpNumbers.add(ReferenceNumber);
		} else {
			System.out.println("FAILED : Book A PickUp was not submitted properly, Reference No: " + ReferenceNumber);
			Reporter.log("FAILED : Book A PickUp was not submitted properly, Reference No: " + ReferenceNumber);
			Assert.fail("FAILED : Book A PickUp was not submitted properly, Reference No: " + ReferenceNumber);
		}

		System.out.println("Book a Pick Up Array : " + BookAPickUpNumbers);
	}

	// NOUNAddedMsg //*[@id="alert-box-wrapper"]/div/div/div[2]

	public static void ErrorMsgValidation() {
		String mainPage = BaseWebdriver.driver.getWindowHandle();

		Alert alt = BaseWebdriver.driver.switchTo().alert(); // to move control to alert popup
		assertEquals(" No UN added", BaseWebdriver.driver.findElement(NOUNAddedMsgTiltle).getText());
		// alt.accept(); // to click on ok.

		// alt.dismiss(); // to click on cancel.

		// Then move the control back to main web page-

		BaseWebdriver.driver.switchTo().window(mainPage);

	}

	public static void addAdderess() {
		// Add Address
		PageBase.waitForElement(BookAPickup_Location_Dropdown, 10);
		PageBase.click(BookAPickup_Location_Dropdown, 10);

		PageBase.waitForElement(BookAPickup_Add_Address, 10);
		PageBase.click(BookAPickup_Add_Address, 10);

		int Number = (int) (Math.random() * 10000);
		String newNumber = String.valueOf(Number);
		NewCompanyName = NewAddressCompanyName + newNumber;
		PageBase.sendText(BookAPickup_New_AddressCompanName, 10, NewCompanyName);
		PageBase.click(BookAPickup_New_AddressSearch, 10);
		PageBase.sendText(BookAPickup_New_AddressSearch, 10, NewAddressCompanyAdd);
		PageBase.click(BookAPickup_New_AddressSearch_Select, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(BookAPickup_New_AddressSearch_Contine, 10);
		PageBase.sendText(BookAPickup_New_Address_Name, 10, NewCompanyName);
		PageBase.sendText(BookAPickup_New_Address_Number, 10, "0452456876");
		PageBase.sendText(BookAPickup_New_Address_Email, 10, "Test@test.com");

		// Verify if DG fields exists
		Boolean DG = PageBase.isElementPresent(BookAPickup_New_Address_DGName);
		if (DG == true) {
			PageBase.sendText(BookAPickup_New_Address_DGName, 10, "Test	");
			PageBase.sendText(BookAPickup_New_Address_DGNumber, 10, "0452567879");
		}
		PageBase.click(BookAPickup_New_Address_Add, 10);
		PageBase.MaximumWaitForElementEnabled_1();

		// Verify Address is Selected
		PageBase.verifyTextExistAttribute(BookAPickup_Location_Selected, NewCompanyName);

		String Address = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[1]/div[2]"))
				.getText();
		if (Address.contains(Address)) {
			System.out.println("New Address Exists in Location Feild AS EXPECTED");
		} else {
			System.out.println("FAILED: New Address DOEN NOT Exists in Location Feild");
			Reporter.log("FAILED: New Address DOEN NOT Exists in Location Feild");
			Assert.fail("FAILED: New Address DOEN NOT Exists in Location Feild");
		}
		PageBase.verifyTextExistAttribute(BookAPickup_CompanyName, NewCompanyName);

	}

	public static void verfiyAddress() {
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Contactcs Page");
		PageBase.click(MyTollHomePageActions.myContactMenu, 10);
		Reporter.log("User Searches for New Contact added -" + NewCompanyName);
		PageBase.sendText(SearchContactTxtFeild, 10, NewCompanyName);
		PageBase.click(SearchContactButton, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(SearchContactCompanyLocation, NewCompanyName);
		Reporter.log("User Clicks Edit Contact and Edits Contact Details");
		PageBase.click(SearchContactEdit, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(SearchContactEditCompanyName).click();
		BaseWebdriver.driver.findElement(SearchContactEditCompanyName).clear();
		BaseWebdriver.driver.findElement(SearchContactEditName).click();
		BaseWebdriver.driver.findElement(SearchContactEditName).clear();
		PageBase.click(SearchContactEditSave, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(SearchContactEditCompanyNameErrorMsg, "Enter Company Name");
		PageBase.verifyTextExist(SearchContactEditNameErrorMsg, "Enter First Name");
		PageBase.sendText(SearchContactEditCompanyName, 5, NewCompanyName);
		PageBase.sendText(SearchContactEditName, 5, NewCompanyName);
		Reporter.log("User Saves Contact Details");
		PageBase.click(SearchContactEditSave, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(popUpMsg, 10);
		PageBase.verifyTextExist(popUpMsg, "Address Successfully Updated To Addressbook");
		PageBase.click(popUpClose, 5);
		PageBase.MaximumWaitForElementEnabled_1();

	}

}
