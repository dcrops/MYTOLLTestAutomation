
package bookAPickupActions;

import GlobalActions.PageBase;
import createShipmentActions.CreateShipmentActions;
import manifestActions.ManifestActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.Page;

import baseWebdriver.BaseWebdriver;
import rateEnquiryActions.RateEnquiryActions;

public class BookAPickupActions {

	public static By TollCarrierDropdown = By.xpath("//*[@id=\"BU-selector\"]/label/a/i");
	public static By TollCarrierTextField = By.name("placeholder-bu");
	public static By TollCarrierIntermodalSpecialized = By.xpath("//*[@id=\"BU-selector\"]/div/ul/li[4]/div");
	public static By AccountNumberTextField = By.name("placeholder-account");
	public static By AccountNumberDropdown = By.xpath("//*[@id=\"account-selector\"]/label/a/i");
	public static By AccountNumberDropdownitem1 = By.xpath("//*[@id=\"account-selector\"]/div/ul/li[1]/div[1]");
	public static By pickupLocation = By.xpath("//*[@id=\"pickup-location\"]/div[1]/div[3]/div/label/span[2]");
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
	public static By destinationErrorMsg = By.id("error-destination");
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
	//public static By chargeToAccount = By.xpath("//*[@id=\"charge-to-selector\"]/label/a/i");
	public static By chargeToAccount = By.id("charge-to-selector");
	public static By ReceiverAccount = By.id("reciever-account");
	public static By itemDescription = By.xpath("//*[@id=\"freight-type-selector\"]/label/a/i");
	public static By itemDescriptionDropdown = By.xpath("//*[@id=\"freight-type-selector\"]//a/i");
	public static By itemDescriptionTextField = By.id("item-description");
	public static By DescriptionOfGoodsTextField = By.id("detailed-description");
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
	public static By UNNumberTextField =By.id("unlookup-"); 
	public static By UNNumberName = By.xpath("//*[@id=\"un-code-selector-\"]/div/ul/li/div");
	public static By searchBtn = By.xpath("//*[@id=\"un-code-selector-\"]/div/div/div/span/i");

	public static By UNNumberItem = By.xpath("//*[@id=\"un-code-selector-\"]/div/ul/li/div");
	public static By packingGroupDropdown = By.xpath("//*[@id=\"packaging-grp-selector-\"]/label/a/i"); 
	public static By packingGroupItem = By.xpath("//*[@id=\"packaging-grp-selector-\"]/div/ul/li[1]/div");
	public static By dgPackagingDescription = By.id("dg-pckg-description-"); 
	public static By dgPkgQty =By.id("dgPkgQty-"); 
	public static By dgQtyKg =By.id("dgPkgWgt-"); 
	public static By technicalName = By.id("technical-name-");
	public static By dangerousGoodsArrowdown = By.xpath("//*[@id=\"un-code-selector-\"]/label/a/i");
	public static By classDivision = By.id("class-division-");
	public static By subRisk = By.xpath("//*[@id=\"sub-risk-selector-\"]/label/input[2]");
	public static By packingGroup = By.xpath("//*[@id=\"packaging-grp-selector-\"]/label/input[2]");
	public static By properShippingName = By.id("shipping-name-");

	public static By add = By.id("add-dg-item");
	public static By saveAsTemplateBtn = By.id("save-as-template");

	public static By pickupDate = By.id("pickup-date");
	public static By pickupDateToday = By.xpath("//*[@id=\"steps-3\"]/div[1]/div/div[1]/div/div/ul/li[1]");
	public static By pickupDateTomorrow = By.xpath("//*[@id=\"steps-3\"]/div[1]/div/div[1]/div/div/ul/li[2]");
	public static By pickupFrom = By.xpath("//*[@id=\"other-pick-location-selector\"]/label/a/i");
	public static By availableTime = By.id("available-time");
	public static By increaseAvailableTimeHours = By.xpath("//*[@id=\"steps-3\"]//*//i[@class=\"ico-accordian-up\"]");
	public static By decreaseReadyTime = By.xpath("//*[@id=\"steps-3\"]//*//i[@class=\"ico-accordian-down\"]");
	public static By increaseAvailableTimeminutes = By
			.xpath("//*[@id=\"steps-3\"]/div[1]/div/div[2]/div[2]/div/div[3]/div[1]/i");
	public static By closingTime = By.id("location-closing-time");
	public static By increaseClosingTimeHours = By
			.xpath("//*[@id=\"steps-3\"]//div[3]//div[1]/div[1]/i");
	public static By decreaseClosingTimeHours = By
			.xpath("//*[@id=\"steps-3\"]//div[3]//div[1]/div[3]/i");
	public static By confirmReadyTime = By.id("confirm-true");
	public static By increaseClosingTimeMinutes = By
			.xpath("//*[@id=\"steps-3\"]/div[1]/div/div[3]/div[2]/div/div[3]/div[1]/i");
	public static By specialInstructions = By.id("comments");
	public static By referenceNumber = By.xpath("//*[@id=\"custom-ref-num\"]");
	public static By consignmentNotes = By.xpath("//*[@id=\"steps-3\"]/div[2]/div[1]/div/label/span[2]");
	public static By reviewBookBtn = By.id("review-pickup"); 

	//Nishant
	public static By readyTimeErrorMsg = By.xpath("//*[@id=\"error-ready-time\"]");
	//
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

	public static By searchNumberReference = By.xpath("//*[@id=\"quickSearch\"]");
	public static By searchNumberShipmentNo = By.xpath("//*[@id=\"quickSearchTableResult\"]/tbody/tr[3]/td[1]");
	public static By searchNumberReferenceName = By.xpath("//*[@id=\"quickSearchTableResult\"]/tbody/tr[3]/td[2]");
	public static By searchShipmentButton = By.xpath("//*[@id=\"search-shipment-btn\"]");
	public static By searchResultMsg = By.xpath("//*[@id=\"quickSearchTableResult\"]/tbody/tr[2]/td");
	// *[@id="alert-box-wrapper"]/div/div/div[1]/h3
	// Error Messages
	public static By itemDescriptionErrorMsg = By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[1]/div/span");
	public static By NoOfItemsMsg = By.xpath("//*[@id=\"item-details-sub-form\"]/div[2]/div[1]/div[1]/div/span");
	public static By LengthMsg= By.xpath("//*[@id=\"lwh-wrpr\"]/div[1]/span[2]");
	public static By widthMsg = By.xpath("//*[@id=\"lwh-wrpr\"]/div[2]/span[2]");
	public static By heightMsg = By.xpath("//*[@id=\"lwh-wrpr\"]/div[3]/span[2]");
	public static By totalVolumeMsg = By.xpath("//*[@id=\"item-details-sub-form\"]/div[2]/div[3]/div[1]/div/span[2]");
	public static By weightMsg= By.xpath("//*[@id=\"item-details-sub-form\"]/div[2]/div[3]/div[2]/div/span[2]");
	public static By dgErrorMsg = By.xpath("//*[@id=\"dg-radios\"]/span");
	
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
	public static By AddAddressCountryCode = By.xpath("//*[@id=\"add-add-form\"]/div[1]/div[4]/div/div/div/div/div[3]");
	public static final By BookAPickup_New_Address_Email = By.id("add-addr-email");
	public static final By BookAPickup_New_Address_DGName = By.id("add-addr-dg-contact-name");
	public static final By BookAPickup_New_Address_DGNumber = By.id("add-addr-dg-contact-phone");
	public static final By BookAPickup_New_Address_Add = By.id("add-address-btn-final");
	public static final By BookAPickup_CompanyName = By.id("name");

	public static final String NewAddressCompanyName = "Test";
	public static final String NewAddressCompanyAdd = "60 Collins Street, MELBOURNE VIC 3000";
	public static String NewCompanyName = "Test5213";
	public static By AddAdressManually = By.id("add-address-manually-link");
	public static By AddAdressCompanyName = By.id("add-addr-company");
	public static By AddAdressAddressLine1 = By.name("add-adr-line1");
	public static By AddAdressAddressLine2 = By.name("add-adr-line2");
	public static By AddAdressAddressSuburb = By.id("add-addr-suburb");
	public static By AddAdressAddressState = By.id("add-addr-state-label");
	public static By AddAdressAddressPostcode = By.id("add-addr-postcode");
	public static By AddAdressCountryTGXTextField = By.xpath("//*[@id=\"add-addr-country-selector\"]/label/input[2]"); 
	public static By AddAdressEmailTGXTextField = By.id("add-addr-email");
	public static By AddAdressAddressContinue = By.xpath("//*[@id=\"addr-continue-manual\"]");
	public static By CloseAddAddressScreen = By.xpath("//*[@id=\"close-add-manually-adr-popup\"]/i");
	public static By CloseEditAddressScreen = By.xpath("//*[@id=\"close-edit-adr-popup\"]/i");
	public static By AddAdressDGContactName = By.id("add-addr-dg-contact-name");
	public static By AddAdressDGContactNumber = By.id("add-addr-dg-contact-phone");
	public static final By SearchContactTxtFeild = By.id("sContact");
	public static final By SearchContactButton = By.id("search-field");
	public static final By SearchContactCompanyLocation = By.xpath(
			"//*[@id=\"portlet_mytolladdressbookportlet_WAR_mytollupsportlet\"]//*//div[@class=\"contact-col company-name\"]/p");
	public static By CompanyName = By.xpath(
			"//*[@id=\"portlet_mytolladdressbookportlet_WAR_mytollupsportlet\"]//*//div[@class=\"contacts-list-box\"]//div[@class=\"contact-col company-name\"]/p");
	public static By address = By.xpath(
			"//*[@id=\"portlet_mytolladdressbookportlet_WAR_mytollupsportlet\"]//*//div[@class=\"contacts-list-box\"]//div[@class=\"contact-col company-address\"]/p");
	public static By ContactName = By.xpath(
			"//*[@id=\"portlet_mytolladdressbookportlet_WAR_mytollupsportlet\"]//*//div[@class=\"contacts-list-box\"]//div[@class=\"contact-col contact-name\"]/p");
	public static By PhoneNumber = By.xpath(
			"//*[@id=\"portlet_mytolladdressbookportlet_WAR_mytollupsportlet\"]//*//div[@class=\"contacts-list-box\"]//div[@class=\"contact-col phone-numbers\"]/p");
	public static By Email = By.xpath(
			"//*[@id=\"portlet_mytolladdressbookportlet_WAR_mytollupsportlet\"]//*//div[@class=\"contacts-list-box\"]//div[@class=\"contact-col email-address\"]/p");
	public static By deleteButton = By.xpath(
			"//*[@id=\"portlet_mytolladdressbookportlet_WAR_mytollupsportlet\"]//*//div[@class=\"contacts-list-box\"]//a/i");
	public static final By SearchContactEdit = By.xpath(
			"//*[@id=\"portlet_mytolladdressbookportlet_WAR_mytollupsportlet\"]//*//div[@class=\"contact-col edit\"]/input");
	public static final By SearchContactEditCompanyName = By.xpath("//*[@id=\"CompanyName\"]");
	public static final By SearchContactEditName = By.xpath("//*[@id=\"ContactFirstName\"]");
	
	
	public static final By SearchContactEditCompanyNameErrorMsg = By .xpath("//*[@id=\"updateJSONData\"]/div/section//div/span[3]");
	//new-xpath = //*[@id=\"updateJSONData\"]//div/span[@class='cust-error-msg' and text()='Enter Company Name'];
	//old-xpath = //*[@id=\"updateJSONData\"]/div/section/div[1]/div[1]/div[1]/div
	//public static final By SearchContactEditCompanyNameErrorMsg = By .xpath("//*[@id=\"updateJSONData\"]/div/section//div/span[3]");
	
	public static final By SearchContactEditNameErrorMsg = By.xpath("//*[@id=\"updateJSONData\"]/div/section/div[1]/div[1]/div[2]/div/span[2]");
	
//	public static final By SearchContactEditSave = By.cssSelector("input.save-btn");
	public static final By SearchContactEditSave = By.xpath("//*[@id=\"updateJSONData\"]/div/footer/input");
	
	public static final By popUpMsg = By.xpath("//*[@id=\"response-poup-wrpr\"]/div[2]/div/header/h2");
										
	public static final By popUpClose = By.xpath("//*[@id=\"response-poup-wrpr\"]//*/a/i");
	
	// Edit Address

	public static By EditAddressIcon = By.xpath("//*[@id=\"location-selector\"]/div[1]/div[1]/a/i");
	public static By EditAddressScreenHeading = By.xpath("//*[@id=\"edit-addr\"]/header/h2");
	public static By EditAddressPleaseClickHereText = By.xpath("//*[@id=\"edit-addr\"]/header/label");
	public static By EditAddressCompanyName = By.id("edit-addr-company");
	public static By EditAddressName = By.id("edit-addr-name");
	public static By EditAddressEmail = By.id("edit-addr-email");
	public static By EditAddressPhoneNumber = By.id("edit-addr-phone");
	public static By EditAddressAddressLine1 = By.id("edit-adr-line1");
	public static By EditAddressAddressLine2 = By.id("edit-adr-line2");
	public static By EditAddressSaveButton = By.xpath("//*[@id=\"edit-address-btn-final\"]");
	public static By EditAddressSavedSuccessfullyMessage = By.xpath("//*[@id=\"alert-box-wrapper\"]/div/div/div[2]");
	public static By EditAddressCloseSaveMsg = By.xpath("//*[@id=\"closeAlert\"]");
	public static By EditAddressCountryCode = By
			.xpath("//*[@id=\"edit-add-form\"]/div[2]/div[2]/div/div/div/div/div[3]");

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
			//.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytolltemplateportlet\"]/div//a[text()='View More']");
				.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytollupsportlet\"]/div//a[text()='View More']");
	// Add Accounts
	public static final By addAccount = By.linkText("ADD ACCOUNT");
	public static final By addAccountCarrier = By.xpath("//*[@id=\"addAccountForm\"]//*//label/a/i");
	public static final By addAccountNumber = By
			.xpath("//*[@id=\"addAccountForm\"]//*//div/input[@name=\"AccountCode\"]");
	public static final By addAccountAccessType = By
			.xpath("//*[@id=\"addAccountForm\"]//*//div[@data-placeholder=\"Select Access Type\"]/label/a/i");
	public static final By addAccountSave = By.linkText("SAVE");
	//public static final By addAccountSaveMsg = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//h2");
	public static final By addAccountSaveMsg = By.xpath("//*[@id=\"alert-box-wrapper\"]/div/div/div[1]/h3");
	public static final By addAccountSaveMsgClose = By.xpath("//*[@id=\"alert-ok-btn\"]");
	//public static final By addAccountSaveMsgClose = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//a/i");
	public static final By addAccountViewMore = By
			.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytollupsportlet\"]//*//a[text()='VIEW MORE']");
	public static final By addAccountDeleteMsg = By.xpath("//*[@id=\"confirm-box-wrapper\"]//*//p");
	public static final By addAccountDeleteContinue = By.xpath("//*[@id=\"confirm-true\"]");
	public static final By addAccountDeleteSuccessfull = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//header/h2");
	public static final By addAccountDeleteClose = By.xpath("//*[@id=\"response-poup-wrpr\"]/div[2]/div/a/i");
	public static final By addAccountCarrierSelector = By.xpath("//*[@id=\"BU-selector\"]/label/a");
	public static final By addTemplateCarrierSelector = By.xpath("//*[@id=\"BU-selector-filter\"]/label/a");

	public static By confirmPickupBtn = By.id("submit-pickup");
	public static By pickUpReferenceNumber = By
			.xpath("//*[@id=\"book-a-pickup-placeholder\"]//*//span[@class=\"reference-no\"]/span");  //*[@id="book-a-pickup-placeholder"]/div[1]/div[1]/div[1]/div[3]/span/span
	public static String pressARROW_DOWN = Keys.chord(Keys.ARROW_DOWN);
	public static String pressEnter = Keys.chord(Keys.ENTER);
	public static String pressTab = Keys.chord(Keys.TAB);
	public static String pressSpace = Keys.chord(Keys.BACK_SPACE);
	public static Actions action = new Actions(BaseWebdriver.driver);
	public static ArrayList BookAPickUpNumbers = new ArrayList();
	public static final By cutOfftimePopup = By.xpath("//*[@id=\"confirm-box-wrapper\"]//*//p");
	public static final By cutOfftimeErrorMsg = By.xpath("//*[@id=\"error-ready-time\"]");

	public static By beforeTimeErrorMsg = By.id("error-ready-time");

	// Quick Entry Mode Yes

	public static By QuickEntryModeNo = By.xpath("//*[@id=\"grid-view-selector-wrpr\"]/div[2]/label/span[2]"); 
	public static By QuickEntryModeYes = By.xpath("//*[@id=\"grid-view-selector-wrpr\"]/div[2]/label/span[2]"); 
	public static By serviceQME = By.id("gv-service-type-label");
	public static By destinationQME = By.id("gv-destination-address");
	public static By cahrgeToQME = By.xpath("//*[@id=\"gv-charge-to-selector\"]/label/input[2]");
	public static By receiverAccountQME = By.id("gv-reciever-account");

	public static By itemDescriptionQME = By.id("gv-item-description");
	public static By noOfItemsQME = By.id("gv-quantity");
	public static By palletSpaceQME = By.id("gv-pallet-space");
	public static By lengthQME = By.id("gv-length");
	public static By widthQME = By.id("gv-width");
	public static By heightQME = By.id("gv-height");
	public static By weightQME = By.id("gv-weight");
	public static By containsFoodItemsNoQME = By.id("gv-containsFoodItems-no");
	public static By containsFoodItemsYesQME = By.id("gv-containsFoodItems-yes");
	public static By containsDangerousGoodsNoQME = By.xpath("//*[@id=\"gv-dg-radios\"]/label[2]/input");
	public static By containsDangerousGoodsYesQME = By.xpath("//*[@id=\"gv-dg-radios\"]/label[1]/input");
	public static By saveAsTemplateQME = By.id("gv-save-as-template");
	public static By saveAsTemplateQMEShipment = By.id("gv-save-as-template0");
	public static By addNewLineQME = By.xpath("//*[@id=\"gv-grid-line-item\"]//*//button[@class= 'box-link black']");
	public static By UNNumberTextFieldQME = By.id("gv-unlookup");
	public static By packingGroupDropdownQME = By.xpath("//*[@id=\"gv-packaging-grp-selector\"]/label/input[2]");
	public static By packingGroupItemQME = By.xpath("//*[@id=\"gv-packaging-grp-selector\"]/div/ul/li[2]/div");
	public static By packingGroupQME = By.xpath("//*[@id=\"packaging-grp-selector-\"]/label/input[2]");
	public static By packingGroupTextFieldQME = By.xpath("//*[@id=\"gv-packaging-grp-selector\"]/label/input[2]");
	public static By dgPackagingDescriptionQME = By.id("gv-dg-pckg-description");
	public static By dgPkgQtyQME = By.id("gv-dgPkgQty");
	public static By dgQtyKgQME = By.id("gv-dgPkgWgt");
	public static By technicalNameQME = By.id("gv-technical-name");
	public static By classDivisionQME = By.id("gv-class-division");
	public static By subRiskQME = By.xpath("//*[@id=\"gv-sub-risk-selector\"]/label/input[2]");
	public static By properShippingNameQME = By.id("gv-shipping-name");
	public static By addButtonDGScreenQME = By.id("gv-add-dg-item");
	public static By closeButtonDGScreenQME = By.xpath("//*[@id=\"dg-popup-inner-wrpr\"]/a[2]/i");
	public static By messageSaveAsTemplateQME = By.xpath("//*[@id=\"alert-box-wrapper\"]/div/div/div[2]");
	public static By saveCloseButtonDGScreenQME = By.id("gv-cancel-dg-item"); 
	public static By addDgGoodsQME = By.id("gv-add-dg-item");
	// Share Bookings
	public static By share = By.id("share-template");
	public static By emailAddress1 = By.xpath("//*[@id=\"share-email\"]");
	public static By emailAddress2 = By.id("email-address-2");
	public static By emailAddress3 = By.id("email-address-3");
	public static By emailAddress4 = By.id("email-address-4");
	public static By emailAddress5 = By.id("email-address-5");
	public static By addMoreEmailButton = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"share-form-area\"]/div[1]/span"); 
	public static By shareMessageTextbox = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"share-message\"]");
	public static By shareButton = By.id("share-emails"); 
	public static By NumberOfUserMessageInShareScreen = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"share-form-body\"]/div[2]/p");  
	public static By GoT0Dashboard = By.linkText("GO TO DASHBOARD");
	
	public static By serviceSelected= By.xpath("//*[@id=\"service-type-label\"]");
	
	//View SLA
	public static By addAccountToggler = By.xpath("//*[@id=\"addAccountForm\"]//*//div[@class=\"toggle-link\"]/a");
	public static By addAccountSLAStandardAccess= By.xpath("//*[@id=\"addAccountForm\"]//*//b[1]");
	public static By addAccountSLAStandardAccessMsg= By.xpath("//*[@id=\"addAccountForm\"]/div/section/section[3]/div[1]");
	public static By addAccountSLATPAccess= By.xpath("//*[@id=\"addAccountForm\"]//*//b[2]");
	public static By addAccountSLATPAccessMsg= By.xpath("//*[@id=\"addAccountForm\"]/div/section/section[3]/div[1]");
	public static By addAccountSLAFullFinancialAccess= By.xpath("//*[@id=\"addAccountForm\"]//*//b[3]");
	public static By addAccountSLASFullFinancianAccessMsg= By.xpath("//*[@id=\"addAccountForm\"]/div/section/section[3]/div[1]");

	
	//Field level validation
	public static By addAccountNumberError = By.id("error-payer-account");
	
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
			PageBase.MaximumWaitForElementEnabled();
			//BaseWebdriver.driver.findElement(TollCarrierDropdown).click();
			PageBase.click(TollCarrierDropdown, 20);
			PageBase.click(By.xpath("//div[@id='BU-selector']/div/ul/li/div[text()='" + pTollCarrierName + "']"), 20);
			PageBase.MaximumWaitForElementEnabled();

		}

		catch (Exception ex) {
			BaseWebdriver.driver.navigate().refresh();
			PageBase.retryingFindClick(TollCarrierDropdown);
			PageBase.click(By.xpath("//div[@id='BU-selector']/div/ul/li/div[text()='" + pTollCarrierName + "']"), 20);
			PageBase.MaximumWaitForElementEnabled();

		}

	}

	public static void SelectIntermodalSpecializedCarrier(String pTollCarrierName) {

		try {
			PageBase.MaximumWaitForElementEnabled();
			action.sendKeys(BaseWebdriver.driver.findElement(TollCarrierTextField), pressTab).perform();
			PageBase.retryingFindClick(TollCarrierDropdown);
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(TollCarrierTextField).sendKeys(pTollCarrierName);
			BaseWebdriver.driver
					.findElement(By.xpath("//*[@id=\"BU-selector\"]/div/ul/li/div[text()='Intermodal & Specialised']"))
					.click();
			PageBase.MaximumWaitForElementEnabled();

		}

		catch (Exception ex) {
			BaseWebdriver.driver.navigate().refresh();
			PageBase.MaximumWaitForElementEnabled();
			// action.sendKeys(BaseWebdriver.driver.findElement(TollCarrierTextField),
			// pressTab).perform();//BaseWebdriver.driver.findElement(TollCarrierDropdown).click();
			PageBase.retryingFindClick(TollCarrierDropdown);
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(TollCarrierTextField).sendKeys(pTollCarrierName);
			BaseWebdriver.driver
					.findElement(By.xpath("//*[@id=\"BU-selector\"]/div/ul/li/div[text()='Intermodal & Specialised']"))
					.click();
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
		String TollCarrier = BaseWebdriver.driver.findElement(TollCarrierTextField).getAttribute("value")
				.replaceAll("\\s", "");

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
		//PageBase.SendKeysToNonEditableField(AccountNumberTextField, pAccountNumber, 15); 
		PageBase.ClickOn(AccountNumberDropdown, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SelectFrom(By.xpath("//*[@id=\"account-selector\"]/div/ul/li/div[text()='" + pAccountNumber + "']"),
				15);
		//*[@id="account-selector"]/div/ul/li[3]/div[1]
	} 
	
	public static void EnterAccountNumberIPEC(String pAccountNumber) {
		PageBase.MinimumWaitForElementEnabled();
		//PageBase.SendKeysToNonEditableField(AccountNumberTextField, pAccountNumber, 15); 
		PageBase.ClickOn(AccountNumberDropdown, 5);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SelectFrom(By.xpath("//*[@id=\"account-selector\"]/div/ul/li[3]/div[text()='" + pAccountNumber + "']"),
				15);
		//*[@id="account-selector"]/div/ul/li[3]/div[1]
	} 

	public static void SelectPickupLocation() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(pickupLocation, 5);

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

	public static String SelectChargeToAccount(int j) {
		//PageBase.MaximumWaitForElementEnabled();
		PageBase.click(chargeToAccount, 50);
		PageBase.FindElement(By.xpath("//*[@id=\"charge-to-selector\"]//ul/li[" + j + "]/div"));
		String chargeToAccount = PageBase.GetText(By.xpath("//*[@id=\"charge-to-selector\"]//ul/li[" + j + "]/div"), 50);
		PageBase.click(By.xpath("//*[@id=\"charge-to-selector\"]//ul/li[" + j + "]/div"), 50);
		return chargeToAccount;
	}

	public static void EnterChargeToAccount(String pChargeToAccount) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(chargeToAccount).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"charge-to-selector\"]/div/ul//div[text()='" + pChargeToAccount + "']"))
				.click();

	}

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
		assertEquals("Enter DG data in at least one line item", BaseWebdriver.driver.findElement(NOUNAddedMsgContent).getText());
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
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AccountNumberDropdown).click();
		PageBase.MinimumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(AccountNumberDropdownitem1).click();
		PageBase.MinimumWaitForElementEnabled();
	}

	public static void SelectAccountNumber2() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AccountNumberDropdown).click();
		PageBase.MinimumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(AccountNumberDropdownitem1).click();
		PageBase.MinimumWaitForElementEnabled();
	}

	public static void SelectAccountNumberUsingKeyboard() {
		PageBase.MaximumWaitForElementEnabled();
		action.sendKeys(BaseWebdriver.driver.findElement(AccountNumberDropdown), pressTab).perform();
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
		//String accountNo = BaseWebdriver.driver.findElement(accountNumber).getAttribute("value").replaceAll("[^0-9]+", "");
		String accountNo = BaseWebdriver.driver.findElement(accountNumber).getAttribute("value");
		System.out.println(accountNo);
		/*StringBuilder builder= new StringBuilder();
		for (int i=0; i<=accountNo.length(); i++)
		{
			char ch=accountNo.charAt(i);
			if(Character.isDigit(ch))
			{
				builder.append(ch);
			}
		}*/
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

	
	public static String GetCompany() {
		PageBase.MinimumWaitForElementEnabled();
		//BaseWebdriver.driver.findElement(locationDropdown).click();
		return  PageBase.GetAttributeValue(location, 5);//*[@id="location-selector"]/div[1]/div[2]  //*[@id="location-selector"]/div[1]/div[4]

	}


	public static String GetLocation(Integer i) {
		PageBase.MaximumWaitForElementEnabled();
		String vLocation = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[" + i + "]/div[2]")).getText();
		return vLocation;

	}
	
	public static String GetLocation() {
		PageBase.MaximumWaitForElementEnabled();
		String vLocation = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"location-selector\"]/div[1]/div[3]")).getText();//*[@id="location-selector"]/div[1]/div[3]
		return vLocation;

	}
	

	public static String GetLocationAddressLine2(Integer i) {
		PageBase.MaximumWaitForElementEnabled();
		String vLocationAddressLine2 = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"location-selector\"]/div[" + i + "]/div[3]")).getText();
		return vLocationAddressLine2;

	}
	
	public static String GetLocationAddressLine2() {
		PageBase.MaximumWaitForElementEnabled();
		String vLocationAddressLine2 = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"location-selector\"]/div[1]/div[4]")).getText();
		return vLocationAddressLine2;

	}


	public static String GetAddressPhoneNumber(Integer i) {
		PageBase.MaximumWaitForElementEnabled();
		String vPhoneNumber = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"location-selector\"]/div[" + i + "]/div[4]")).getText();
		return vPhoneNumber;

	}
	
	public static String GetAddressPhoneNumber() {
		PageBase.MaximumWaitForElementEnabled();
		String vPhoneNumber = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"location-selector\"]/div[1]/div[4]")).getText();
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
		 BookAPickupActions.selectReadyTime();
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
		// action.sendKeys(BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li["
		// + i + "]")),pressARROW_DOWN).perform();
		PageBase.MaximumWaitForElementEnabled();
		action.sendKeys(pressARROW_DOWN).perform();
		action.sendKeys(pressEnter).perform();
		// BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li["
		// + i + "]")).sendKeys(pressARROW_DOWN);
		// BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li["
		// + i + "]")).sendKeys(pressEnter);
		// action.keyDown(BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li["
		// + i + "]")),pressARROW_DOWN).perform();//.click();
		// action.sendKeys(BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li["
		// + i + "]")),pressEnter).perform();//.click();
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

	public static void EnterLocation(String plocation) {
		PageBase.MaximumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(location).click();
		BaseWebdriver.driver.findElement(location).clear();
		BaseWebdriver.driver.findElement(location).sendKeys(plocation);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SelectFrom(By.xpath("//*[@id=\"location-selector\" or @id=\"location-selector\"]/div/ul/li/div[text()='" + plocation + "']"), 5);
		// BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul//div[text()='\"
		// + pChargeToAccount + "']")).click();
		// BaseWebdriver.MaximumWaitForElementEnabled();//*[@id="sender-selector"]/div[2]/ul/li[2]/div[1]
		// *[@id="location-selector"]/div[2]/ul/li[2]/div[1]
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
		PageBase.MaximumWaitForElementEnabled();
		try {
						
			PageBase.retryingFindClick(
					By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[2]/div"));
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
		}

		catch (Exception ex) {
			// SelectDestinationOnReviewBookAPickup(pDestination+" ");
		}
	

	}
	
	public static void VerifyDestination(String pDestination) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		String Destination=BaseWebdriver.driver.findElement(destination).getAttribute("value");
		System.out.println("Destinations"+ Destination);
		if (pDestination.equalsIgnoreCase(Destination)==false) {
		SelectDestination(pDestination);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		}

		else {
			System.out.println("Destinations are equal");
			PageBase.MaximumWaitForElementEnabled();
		}
	}

	public static void SelectDestinationOnReviewBookAPickup(String destination) {

		boolean results = true;
		try {
			if (BaseWebdriver.driver.findElement(destinationErrorMsg).isDisplayed() == results) {
				BookAPickupActions.SelectDestination(destination);
				PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.technicalName);
				PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.technicalName);

			}
		} catch (Exception ex) {
			System.out.println(ex);

		}
	}

	public static String SelectDestination1(String pDestination, String pDestinationValue) {

		PageBase.MinimumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(destination).click();
		BaseWebdriver.driver.findElement(destination).clear();
		BaseWebdriver.driver.findElement(destination).sendKeys(pDestination);

		// action.sendKeys(BaseWebdriver.driver.findElement(TollCarrierTextField),
		// pressSpace).perform();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[2]/div"));
		String Destination = BaseWebdriver.driver.findElement(destination).getAttribute("value");
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		return Destination;
	}

	public static void SelectDestinationCountry(String pDestination, String pDestinationCountry) {

		PageBase.MinimumWaitForElementEnabled();
		PageBase.retryingFindClick(destinationCountry);
		PageBase.WaitForElement(destinationCountry, 10);
		BaseWebdriver.driver.findElement(destinationCountry).clear();
		BaseWebdriver.driver.findElement(destinationCountry).sendKeys(pDestination);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(By.xpath("//*[@id=\"destination-country-selector\"]/div/ul/li/div[text()='" + pDestination + "']"));
		
	}

	public static void EnterDestination(String pDestination) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destination);
		PageBase.WaitForElement(destination, 10);
		BaseWebdriver.driver.findElement(destination).clear();
		BaseWebdriver.driver.findElement(destination).sendKeys(pDestination);
		PageBase.retryingFindClick(By.xpath(
				"//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[text()='" + pDestination + "']"));

	}

	public static void EnterDestinationNZ(String pDestination, String pDestinationItem) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destination);
		PageBase.waitForElement(destination, 10);
		PageBase.SendKeysTo(destination, pDestination, 20);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li/div[text()='"+pDestinationItem+"']"),10);
			
	}

	public static void SelectDestinationCountry(int j) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destinationDropdown);
		PageBase.WaitForElement(destinationDropdown, 10);
		PageBase.retryingFindClick(By.xpath("//*[@id=\"destination-country-selector\"]/div/ul/li[" + j + "]/div"));

	}

	public static void SelectMode() {
		PageBase.WaitForElement(mode, 10);
		BaseWebdriver.driver.findElement(mode).click();
		PageBase.WaitForElement(mode, 10);
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
		PageBase.WaitForElement(chargeToAccount, 10);
		return SelectChargeToAccount(j);

	}

	public static void SetPayerAccountNumber(String _payerAccountNumber) {
		PageBase.WaitForElement(chargeToAccount, 50);
		PageBase.SendKeysTo(ReceiverAccount, _payerAccountNumber , 50);
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
		PageBase.SendKeysTo(itemDescriptionTextField, itemName, 10);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(itemDescriptionDropdown, 2);
	}

	public static void DescriptionOfGoods(String pDescriptionOfGoods) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(DescriptionOfGoodsTextField, pDescriptionOfGoods, 10);

	}
	
	
	public static void SelectLargestItem(int j) {

		PageBase.click(selectLargestItem, 2);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.click(By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li[" + j + "]/div"), 2);
	}

	public static void EnterQuantity(String quntity) {
		PageBase.MinimumWaitForElementEnabled();
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
				PageBase.sendText(length, 50, plength);
				PageBase.sendText(width, 50, pwidth);
				PageBase.sendText(height, 50, pheight);
				PageBase.sendText(weight, 50, pweight);
			}

		catch (Exception ex) {
			RateEnquiryActions.EnterWeight(pweight);
		}
	}

	public static void EnterLengthWidthHeight(String plength, String pwidth, String pheight) {
		PageBase.WaitForElement(length, 10);
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
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(dangerousGoodNo).click();
	}

	public static void selectDangerousGoodNewLine() {
		BaseWebdriver.driver.findElement(dangerousItemsNewLine).click();
	}

	public static void EnterTechnicalName(String pTechnicalName) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(technicalName).click();
		BaseWebdriver.driver.findElement(technicalName).clear();
		BaseWebdriver.driver.findElement(technicalName).sendKeys(pTechnicalName);
	}

	public static void ClickAdd() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(add).click();
	}

	public static void selectContainFoodItem() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(containFoodItem).click();
	}
	
	
	public static String GetErrorMsgItemDescription() {
		return PageBase.GetText(itemDescriptionErrorMsg, 5);

	}
	
	public static String GetErrorMsgNoOfItems() {
		return PageBase.GetText(NoOfItemsMsg, 5);

	}
	
	public static String GetErrorMsgLength() {
		return PageBase.GetText(LengthMsg, 5);

	}
	
	public static String GetErrorMsgWidth() {
		return PageBase.GetText(widthMsg, 5);

	}
	
	public static String GetErrorMsgHeight() {
		return PageBase.GetText(heightMsg, 5);

	}

	public static String GetErrorMsgTotalVolume() {
		return PageBase.GetText(totalVolumeMsg, 5);

	}
	
	public static String GetErrorMsgWeight() {
		return PageBase.GetText(weightMsg, 5);

	}
	
	public static String GetErrorMsgContainDG() {
		return PageBase.GetText(dgErrorMsg, 5);

	}
	
	public static void selectDispatchDate() {
		BaseWebdriver.driver.findElement(pickupDate).click();
		//BaseWebdriver.driver.findElement(pickupDateToday).click();
		BaseWebdriver.driver.findElement(pickupDateTomorrow).click();

	}
	
	public static void SelectDispatchDateTomorrow() {
		BaseWebdriver.driver.findElement(pickupDate).click();
		BaseWebdriver.driver.findElement(pickupDateTomorrow).click();

	}

	public static String ReturnPickupDate() {
		return BaseWebdriver.driver.findElement(pickupDate).getText();
	}

	public static void selectReadyTime() {
		
		ManifestActions.selectReadyTimeJS("12:00");

//		String readyTime = GetReadyTime().toString();
//		String newReadyTime = readyTime.substring(0, 2);
//		System.out.println(newReadyTime);
//		Integer readyTimeInt = Integer.parseInt(newReadyTime);
//		System.out.println(readyTimeInt);
//
//		if (readyTimeInt >= 15) {
//			BaseWebdriver.driver.findElement(availableTime).click();
//			BaseWebdriver.driver.findElement(decreaseReadyTime).click();
//			BaseWebdriver.driver.findElement(decreaseReadyTime).click();
//
//			BaseWebdriver.driver.findElement(decreaseReadyTime).click();
//			BaseWebdriver.driver.findElement(decreaseReadyTime).click();
//		}
//
//		if (readyTimeInt <= 8) {
//			BaseWebdriver.driver.findElement(availableTime).click();
//			BaseWebdriver.driver.findElement(increaseAvailableTimeHours).click();
//			BaseWebdriver.driver.findElement(increaseAvailableTimeHours).click();
//
//			BaseWebdriver.driver.findElement(increaseAvailableTimeHours).click();
//		}
		
	}

	public static void selectClosingTime() {
		BaseWebdriver.driver.findElement(closingTime).click();
		//BaseWebdriver.driver.findElement(increaseClosingTimeHours).click();

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

	public static void ClickReviewBook() 
	{
		//BaseWebdriver.driver.findElement(reviewBookBtn).click();
		PageBase.click(reviewBookBtn, 50);

	}

	public static void ConfirmReadyTimeAndConfirmPickup() {

		boolean results = true;
		try {
			if (BaseWebdriver.driver.findElement(confirmReadyTime).isDisplayed() == results) {
				BaseWebdriver.driver.findElement(confirmReadyTime).click();
			}
		} catch (Exception ex) {
			System.out.println(ex);
			

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
		// BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(20,
		// TimeUnit.SECONDS);
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
		PageBase.ClickOn(addANewLine, 10);
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
		PageBase.MaximumWaitForElementEnabled();
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
		PageBase.MediumWaitForElementEnabled();


	}

	public static void SaveAsTemplate() {

		BaseWebdriver.driver.findElement(saveAsTemplateBtn).click();

	}

	public static void EnterDangerousGoodsDetails(int j, String lookupItem, String packageDescription, String pDgPkgQty,
			String pDgQtyKg) {
		try {
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(UNNumberTextField).sendKeys(lookupItem);
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"dg-form\"]/div/div[2]/div[1]/div[1]/div/div[1]/ul/li/div")).click();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.SendKeysTo(dgPackagingDescription, packageDescription, 10);
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
		BaseWebdriver.driver.findElement(UNNumberTextField).sendKeys(lookupItem);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"dg-form\"]/div/div[2]/div[1]/div[1]/div/div[1]/ul/li/div")).click();  
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(dgPackagingDescription, packageDescription, 10);
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
	
	public static void SelectPackgingGroupString(String packagingGroup) {
		try {
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(packingGroupDropdown).click();
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver
					.findElement(By.xpath("//*[@id=\"packaging-grp-selector-\"]/div/ul/li/div[text()='" + packagingGroup + "']"))
					.click();
		} catch (Exception ex) {
			CreateShipmentActions.SelectPackgingGroupString(packagingGroup);
		}
	}
	


	public static String GetUNNumber() {
		PageBase.MediumWaitForElementEnabled();
		PageBase.MediumWaitForElementEnabled();
		return BaseWebdriver.driver.findElement(UNNumberTextField).getText().toString();

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
		String referenceNumber = PageBase.GetText(By.xpath("//*[@id=\"book-a-pickup-placeholder\"]/div[1]/div[1]/div[1]/div[3]/span"), 5);
		System.out.println("Reference Number "+ referenceNumber);
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

	public static void addAdderess(String NewAddress) {
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
		PageBase.sendText(BookAPickup_New_AddressSearch, 10, NewAddress);
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

	public static void AddAddressManuallyTDF(String pCompanyName, String pAddAdressAddressLine1,
			String pAddAdressAddressLine2, String pAddAdressAddressSuburb, String pAddAdressAddressSuburbItem,
			String pAddAdressAddressState, String pAddAdressAddressPostcode) {
		// Add Address
		PageBase.MaximumWaitForElementEnabled();
		PageBase.waitForElement(location, 10);
		PageBase.ClickOn(location, 15);
		PageBase.WaitForElement(BookAPickup_Add_Address, 5);
		PageBase.ClickOn(BookAPickup_Add_Address, 10);
		PageBase.ClickOn(AddAdressManually, 10);
		PageBase.SendKeysTo(AddAdressCompanyName, pCompanyName, 5);
		PageBase.SendKeysTo(AddAdressAddressLine1, pAddAdressAddressLine1, 5);
		PageBase.SendKeysTo(AddAdressAddressLine2, pAddAdressAddressLine2, 5);
		PageBase.SendKeysTo(AddAdressAddressState, pAddAdressAddressState, 5);
		PageBase.MediumWaitForElementEnabled();
		PageBase.SelectFrom(
				By.xpath("//*[@id=\"add-addr-state-selector\"]/div/ul/li[text()='" + pAddAdressAddressState + "']"), 5);
		PageBase.SendKeysTo(AddAdressAddressPostcode, pAddAdressAddressPostcode, 5);
		PageBase.SendKeysTo(AddAdressAddressSuburb, pAddAdressAddressSuburb, 5);
		PageBase.SelectFrom(By.xpath(
				"//*[@id=\"add-addr-suburb-wrpr\"]/div/ul/li/div[text()='" + pAddAdressAddressSuburbItem + "']"), 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(AddAdressAddressContinue);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(BookAPickup_New_Address_Name, NewCompanyName, 10);
		PageBase.SendKeysTo(BookAPickup_New_Address_Number, "0452456876", 10);
		PageBase.SendKeysTo(BookAPickup_New_Address_Email, "NNAutomationuser1@gmail.com", 10);
		PageBase.SendKeysTo(AddAdressDGContactName, "George William", 10);
		PageBase.SendKeysTo(AddAdressDGContactNumber, "610452456876", 10);

	}

	public static void UpdateSuburbPostcodeAddAddress(String pCompanyName, String pAddAdressAddressSuburb,
			String pAddAdressAddressPostcode) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.waitForElement(location, 10);
		PageBase.ClickOn(location, 15);
		PageBase.WaitForElement(BookAPickup_Add_Address, 5);
		PageBase.ClickOn(BookAPickup_Add_Address, 10);
		PageBase.ClickOn(AddAdressManually, 10);
		PageBase.SendKeysTo(AddAdressCompanyName, pCompanyName, 5);
		PageBase.SendKeysTo(AddAdressAddressSuburb, pAddAdressAddressSuburb, 30);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(AddAdressAddressPostcode, pAddAdressAddressPostcode, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void EnterPostcodeAddAddress(String pAddAdressAddressPostcode) {
		PageBase.SendKeysTo(AddAdressAddressPostcode, pAddAdressAddressPostcode, 5);
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void ClickAddAddress() {
		PageBase.ClickOn(BookAPickup_New_Address_Add, 10);
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void CloseAddAddressScreen() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(CloseAddAddressScreen, 10);

	}

	public static void CloseEditAddressScreen() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(CloseEditAddressScreen, 10);

	}

	public static void AddAddressManuallyPrioAUSInternational(String pCompanyName, String pAddAdressCountry,
			String pAddAdressAddressLine1, String pAddAdressAddressLine2, String pAddAdressAddressSuburb,
			String pAddAdressAddressPostcode, String pEmail, String pPhoneNumber, String pSelectCountry) {
		// Add Address
		PageBase.MaximumWaitForElementEnabled();
		PageBase.waitForElement(location, 10);
		PageBase.ClickOn(location, 15);
		PageBase.WaitForElement(BookAPickup_Add_Address, 5);
		PageBase.ClickOn(BookAPickup_Add_Address, 10);
		PageBase.ClickOn(AddAdressManually, 10);
		PageBase.SendKeysTo(AddAdressCompanyName, pCompanyName, 5);
		PageBase.SendKeysTo(AddAdressCountryTGXTextField, pAddAdressCountry, 5);
		PageBase.MediumWaitForElementEnabled();
		PageBase.SelectFrom(
				By.xpath("//*[@id=\"add-addr-country-selector\"]/div/ul/li[text()='" + pAddAdressCountry + "']"), 5);
		PageBase.SendKeysTo(AddAdressAddressLine1, pAddAdressAddressLine1, 5);
		PageBase.SendKeysTo(AddAdressAddressLine2, pAddAdressAddressLine2, 5);
		PageBase.SendKeysTo(AddAdressAddressPostcode, pAddAdressAddressPostcode, 5);
		PageBase.SendKeysTo(AddAdressAddressSuburb, pAddAdressAddressSuburb, 5);
		PageBase.SelectFrom(By.xpath(
				"//*[@id=\"add-addr-suburb-wrpr\"]/div[2]/ul/li[1]/div[contains(text(),'" + pAddAdressAddressSuburb + "')]"), 15);
		PageBase.SendKeysTo(AddAdressEmailTGXTextField, pEmail, 5);
		PageBase.retryingFindClick(AddAdressAddressContinue);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(BookAPickup_New_Address_Name, NewCompanyName, 10);
		PageBase.SendKeysTo(BookAPickup_New_Address_Number, pPhoneNumber, 10);
		PageBase.ClickOn(AddAddressCountryCode, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath(
				"//*[@id=\"add-add-form\"]/div[1]/div[4]/div/div/div/ul/li[2]/span[text()='" + pSelectCountry + "']"),
				10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(BookAPickup_New_Address_Email, "NNAutomationuser2@gmail.com", 10);
		PageBase.ClickOn(BookAPickup_New_Address_Add, 10);
		PageBase.MaximumWaitForElementEnabled();

	}
	
	public static void AddAddressManuallyPrioAUSDomestic(String pCompanyName, String pAddAdressCountry,
			String pAddAdressAddressLine1, String pAddAdressAddressLine2, String pAddAdressAddressSuburb,String pAddAdressAddressSuburbItem,
			String pAddAdressAddressPostcode, String pEmail, String pPhoneNumber, String pSelectCountry) {
		// Add Address
		PageBase.MaximumWaitForElementEnabled();
		PageBase.waitForElement(location, 10);
		PageBase.ClickOn(location, 15);
		PageBase.WaitForElement(BookAPickup_Add_Address, 5);
		PageBase.ClickOn(BookAPickup_Add_Address, 10);
		PageBase.ClickOn(AddAdressManually, 10);
		PageBase.SendKeysTo(AddAdressCompanyName, pCompanyName, 5);
		PageBase.SendKeysTo(AddAdressCountryTGXTextField, pAddAdressCountry, 5);
		PageBase.MediumWaitForElementEnabled();
		PageBase.SelectFrom(
				By.xpath("//*[@id=\"add-addr-country-selector\"]/div/ul/li[text()='" + pAddAdressCountry + "']"), 5);
		PageBase.SendKeysTo(AddAdressAddressLine1, pAddAdressAddressLine1, 5);
		PageBase.SendKeysTo(AddAdressAddressLine2, pAddAdressAddressLine2, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(AddAdressAddressPostcode, pAddAdressAddressPostcode, 15);
		PageBase.SelectFrom(By.xpath(
				"//*[@id=\"add-addr-postcode-wrpr\"]/div/ul/li/div[text()='" + pAddAdressAddressSuburbItem + "']"), 15);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(AddAdressEmailTGXTextField, pEmail, 5);
		PageBase.retryingFindClick(AddAdressAddressContinue);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(BookAPickup_New_Address_Name, NewCompanyName, 10);
		PageBase.SendKeysTo(BookAPickup_New_Address_Number, pPhoneNumber, 10);
		PageBase.ClickOn(AddAddressCountryCode, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath(
				"//*[@id=\"add-add-form\"]/div[1]/div[4]/div/div/div/ul/li/span[text()='" + pSelectCountry + "']"), 
				10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(BookAPickup_New_Address_Email, "NNAutomationuser2@gmail.com", 10);
		PageBase.ClickOn(BookAPickup_New_Address_Add, 10);
		PageBase.MaximumWaitForElementEnabled();

	}
	
	public static void AddAddressAustraliaManuallyPrioAUS(String pCompanyName, String pAddAdressCountry,
			String pAddAdressAddressLine1, String pAddAdressAddressLine2, String pAddAdressAddressSuburb,
			String pSuburb, String pEmail, String pPhoneNumber, String pSelectCountry) {
		// Add Address
		PageBase.MaximumWaitForElementEnabled();
		PageBase.waitForElement(location, 10);
		PageBase.ClickOn(location, 15);
		PageBase.WaitForElement(BookAPickup_Add_Address, 5);
		PageBase.ClickOn(BookAPickup_Add_Address, 10);
		PageBase.ClickOn(AddAdressManually, 10);
		PageBase.SendKeysTo(AddAdressCompanyName, pCompanyName, 5);
		PageBase.SendKeysTo(AddAdressCountryTGXTextField, pAddAdressCountry, 5);
		PageBase.MediumWaitForElementEnabled();
		PageBase.SelectFrom(
				By.xpath("//*[@id=\"add-addr-country-selector\"]/div/ul/li[text()='" + pAddAdressCountry + "']"), 5);
		PageBase.SendKeysTo(AddAdressAddressLine1, pAddAdressAddressLine1, 5);
		PageBase.SendKeysTo(AddAdressAddressLine2, pAddAdressAddressLine2, 5);
	
		PageBase.SendKeysTo(AddAdressAddressSuburb, pAddAdressAddressSuburb, 5);
		PageBase.ClickOn(By.xpath("//*[@id=\"add-addr-suburb-wrpr\"]/div/ul/li/div[text()='" + pSuburb + "']"), 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(AddAdressEmailTGXTextField, pEmail, 5);
		PageBase.retryingFindClick(AddAdressAddressContinue);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(BookAPickup_New_Address_Name, "John Smith", 10);
		PageBase.SendKeysTo(BookAPickup_New_Address_Number, pPhoneNumber, 10);
		PageBase.ClickOn(AddAddressCountryCode, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath(//*[@id="add-add-form"]/div[1]/div[4]/div/div/div/ul/li[1]/span[1]
				"//*[@id=\"add-add-form\"]/div[1]/div[4]/div/div/div/ul/li/span[text()='" + pSelectCountry + "']"),
				10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(BookAPickup_New_Address_Email, "NNAutomationuser2@gmail.com", 10);
		PageBase.ClickOn(BookAPickup_New_Address_Add, 10);
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void UpdateAddAddressManuallyPrioEmail(String pCompanyName, String pAddAdressCountry,
			String pAddAdressAddressLine1, String pAddAdressAddressLine2, String pAddAdressAddressSuburb,
			String pAddAdressAddressPostcode, String pEmail) {
		// Add Address
		PageBase.MaximumWaitForElementEnabled();
		PageBase.waitForElement(location, 10);
		PageBase.ClickOn(location, 15);
		PageBase.WaitForElement(BookAPickup_Add_Address, 5);
		PageBase.ClickOn(BookAPickup_Add_Address, 10);
		PageBase.ClickOn(AddAdressManually, 10);
		PageBase.SendKeysTo(AddAdressCompanyName, pCompanyName, 5);
		PageBase.SendKeysTo(AddAdressCountryTGXTextField, pAddAdressCountry, 5);
		PageBase.MediumWaitForElementEnabled();
		PageBase.SelectFrom(
				By.xpath("//*[@id=\"add-addr-country-selector\"]/div/ul/li[text()='" + pAddAdressCountry + "']"), 5);
		PageBase.SendKeysTo(AddAdressAddressLine1, pAddAdressAddressLine1, 5);
		PageBase.SendKeysTo(AddAdressAddressLine2, pAddAdressAddressLine2, 5);
		PageBase.SendKeysTo(AddAdressAddressPostcode, pAddAdressAddressPostcode, 5);
		PageBase.SendKeysTo(AddAdressAddressSuburb, pAddAdressAddressSuburb, 5);
		PageBase.SendKeysTo(AddAdressEmailTGXTextField, pEmail, 5);

	}

	public static void verfiyAddress() {
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Contactcs Page");
		PageBase.click(MyTollHomePageActions.myContactMenu, 10);
		Reporter.log("User Searches for New Contact added -" + NewCompanyName);
		
		
		//PageBase.sendText(SearchContactTxtFeild, 10, "Company ABC");
		
		/////
		PageBase.sendText(SearchContactTxtFeild, 10, NewCompanyName);
		/////
		PageBase.click(SearchContactButton, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		
		
		//PageBase.verifyTextExist(SearchContactCompanyLocation, "Company ABC");
		////
		PageBase.verifyTextExist(SearchContactCompanyLocation, NewCompanyName);
		////
		
		
		Reporter.log("User Clicks Edit Contact and Edits Contact Details");
		PageBase.click(SearchContactEdit, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(SearchContactEditCompanyName).click();
		BaseWebdriver.driver.findElement(SearchContactEditCompanyName).clear();
		BaseWebdriver.driver.findElement(SearchContactEditName).click();
		BaseWebdriver.driver.findElement(SearchContactEditName).clear();
		PageBase.click(SearchContactEditSave, 10);
	
		PageBase.verifyTextExist(SearchContactEditCompanyNameErrorMsg, "Enter Company Name");			//this is the text that is not matching 
		PageBase.verifyTextExist(SearchContactEditNameErrorMsg, "Enter First Name");					// and this as well
			
		PageBase.MaximumWaitForElementEnabled();
		
		
	//	PageBase.sendText(SearchContactEditCompanyName, 5, "New_Company");
	//	PageBase.sendText(SearchContactEditName, 5, "New_name");
		
		PageBase.sendText(SearchContactEditCompanyName, 5, NewCompanyName);
		PageBase.sendText(SearchContactEditName, 5, NewCompanyName);
		Reporter.log("User Saves Contact Details");

		//BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"AddressReference_edit\"]")).click();
		
		//*[@id="AddressReference_edit"]
		
		PageBase.click(SearchContactEditSave, 10);
		
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		

		PageBase.waitForElement(popUpMsg, 20);

		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(popUpMsg, "Address Successfully Updated To Addressbook");
		PageBase.click(popUpClose, 5);
		PageBase.MaximumWaitForElementEnabled_1();

	}

	public static void verfiyEditAddress(String pCompanyName, String pAddress, String pContactName, String pCountryCode,
			String pPhoneNumber, String pEmail) {
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		PageBase.click(MyTollHomePageActions.myContactMenu, 10);
		PageBase.sendText(SearchContactTxtFeild, 10, pCompanyName);
		PageBase.ClickOn(SearchContactButton, 10);
		PageBase.MaximumWaitForElementEnabled();
		assertEquals(pCompanyName, PageBase.GetText(CompanyName, 5));
		assertEquals(pAddress, PageBase.GetText(address, 5));
		assertEquals(pContactName, PageBase.GetText(ContactName, 5));
		assertEquals(pCountryCode + pPhoneNumber, PageBase.GetText(PhoneNumber, 5));
		assertEquals(pEmail, PageBase.GetText(Email, 5));

	}

	public static void DeleteBtnMyContactAddress() {

		PageBase.ClickOn(deleteButton, 5);
		PageBase.ClickOn(addAccountDeleteContinue, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(addAccountDeleteClose, 5);

	}

	public static void ClickEditSenderAddress() {

		PageBase.ClickOn(EditAddressIcon, 5);

	}

	public static void EditSenderAddressIcon(String pCompanyName, String pName, String pEmail, String pPhoneNumber,
			String pAddressLine1, String pAddressLine2) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(EditAddressCompanyName, pCompanyName, 5);
		PageBase.SendKeysTo(EditAddressName, pName, 5);
		PageBase.SendKeysTo(EditAddressEmail, pEmail, 5);
		PageBase.SendKeysTo(EditAddressPhoneNumber, pPhoneNumber, 5);
		PageBase.SendKeysTo(EditAddressAddressLine1, pAddressLine1, 5);
		PageBase.SendKeysTo(EditAddressAddressLine2, pAddressLine2, 5);
	}

	public static void SaveEditSenderAddress() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(EditAddressSaveButton, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void CloseSaveMsgEditSenderAddress() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(EditAddressCloseSaveMsg, 5);

		PageBase.MaximumWaitForElementEnabled();

	}

	public static String GetEditAddressScreenHeading() {
		return PageBase.GetText(EditAddressScreenHeading, 5);
	}

	public static String GetEditAddressFullAddressText() {
		return PageBase.GetText(EditAddressPleaseClickHereText, 5);
	}

	public static String GetEditAddressSavedMessageText() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(EditAddressSavedSuccessfullyMessage, 5);
	}

	public static void SelectQuickEntryModeNo() {
	
		/*PageBase.ClickOn(name, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		boolean results=BaseWebdriver.driver.findElement(QuickEntryModeNo).isDisplayed();
		if (results==true)
		{
			action.doubleClick(BaseWebdriver.driver.findElement(QuickEntryModeNo)).perform();
		}
		else
		{
			 action.doubleClick(BaseWebdriver.driver.findElement(QuickEntryModeYes)).perform();
			
		}*/
		
	}
	
	public static void SelectQuickEntryModeYes() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(QuickEntryModeNo, 5);

	}


	public static void EnterServiceQME(String pService) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(serviceQME, pService, 5);
		PageBase.SelectFrom(By.xpath("//*[@id=\"gv-service-type-selector\"]/div/ul/li/div[text()='" + pService + "']"),
				5);

	}

	public static void EnterDestinationQME(String pDestination, String pDestinationItem) {
		PageBase.MinimumWaitForElementEnabled();

		PageBase.SendKeysTo(destinationQME, pDestination, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(
				By.xpath("//*[@id=\"gv-grid-line-item\"]//*//div/div/ul/li/div[text()='" + pDestinationItem + "']"),10); //*[@id="gv-grid-line-item"]/td[3]/div/div/ul/li[1]/div
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
	}

	public static void SelectChargeToQME(String pChargeTo) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(cahrgeToQME, 5);
		PageBase.retryingFindClick(
				By.xpath("//*[@id=\"gv-charge-to-selector\"]/div/ul/li/div[text()='" + pChargeTo + "']"));

	}

	public static String GetChargeToAccountQME() {
		PageBase.MaximumWaitForElementEnabled();
		String chargeToAccount = BaseWebdriver.driver.findElement(cahrgeToQME).getText();
		return chargeToAccount;
	}

	public static void EnterAccountNumberChargeToQME(String pAccountNumber) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(receiverAccountQME, pAccountNumber, 5);

	}

	public static void EnterItemDesriptionQME(String pItemDescription) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(itemDescriptionQME, pItemDescription, 5);

	}

	public static void EnterNoOfItemsQME(String pNoOfItems) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(noOfItemsQME, pNoOfItems, 10);

	}

	public static void EnterPalletSpacesQME(String pEnterPalletSpaces) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(palletSpaceQME, pEnterPalletSpaces, 5);

	}

	public static void EnterLengthWidthHeightQME(String pLength, String pWidth, String pHeight, String pWeight) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(lengthQME, pLength, 5);
		PageBase.SendKeysTo(widthQME, pWidth, 5);
		PageBase.SendKeysTo(heightQME, pHeight, 5);
		PageBase.SendKeysTo(weightQME, pWeight, 5);

	}

	public static void SelectContainsFoodNoQME() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(containsFoodItemsNoQME, 5);

	}

	public static void SelectContainsFoodYesQME() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(containsFoodItemsYesQME, 5);

	}

	public static void SelectDangerousGoodsNoQME() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(containsDangerousGoodsNoQME, 5);

	}

	public static void SelectDangerousGoodsYesQME() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(containsDangerousGoodsYesQME, 5);

	}

	public static void SaveLineItemQME() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(saveAsTemplateQME, 5);

	}
	
	public static void SaveLineItemQMEShipment() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(saveAsTemplateQMEShipment, 5);

	}

	public static void addQMELineItemQME() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(addNewLineQME, 10);

	}

	public static void SelectDangerousGoodsDetailsQME(String lookupItem, String packageDescription, String pDgPkgQty,
			String pDgQtyKg) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(UNNumberTextFieldQME, lookupItem, 5);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SelectFrom(By.xpath("//*[@id=\"dg-popup-form\"]/td[1]/div/div[1]/ul/li/div"), 5); //*[@id="dg-popup-form"]/td[1]/div/div[1]/ul/li/div  2025 | MERCURY COMPOUND, SOLID, N.O.S | 6.1
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(dgPackagingDescriptionQME, packageDescription, 5);
		PageBase.SendKeysTo(dgPkgQtyQME, pDgPkgQty, 5);
		PageBase.SendKeysTo(dgQtyKgQME, pDgQtyKg, 5);

	}

	public static void SelectPackgingGroupQME(String packagingGroup) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(packingGroupDropdownQME, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SelectFrom(
				By.xpath("//*[@id=\"gv-packaging-grp-selector\"]/div/ul/li/div[text()='" + packagingGroup + "']"), 10);
		PageBase.MaximumWaitForElementEnabled();
	}

	public static void SelectPackgingGroupQMEInt(Integer packagingGroup) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(packingGroupDropdownQME, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SelectFrom(
				By.xpath("//*[@id=\"gv-packaging-grp-selector\"]/div/ul/li[text()='" + packagingGroup + "']"), 10);
		PageBase.MaximumWaitForElementEnabled(); 
	}

	public static void EnterTechnicalNameQME(String pTechnicalName) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(technicalNameQME).click();
		BaseWebdriver.driver.findElement(technicalNameQME).clear();
		BaseWebdriver.driver.findElement(technicalNameQME).sendKeys(pTechnicalName);
	}

	public static void addDGItemQME() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(addButtonDGScreenQME, 5);

	}

	public static void CloseDGScreenQME() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(closeButtonDGScreenQME, 5);

	}

	public static void SaveCloseDGScreenQME() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(saveCloseButtonDGScreenQME, 5);

	}

	public static String GetUNNumberQME() {
		PageBase.MediumWaitForElementEnabled();
		return PageBase.GetAttributeValue(UNNumberTextFieldQME, 5);

	}

	public static String GetClassDivisionQME() {

		return PageBase.GetAttributeValue(classDivisionQME, 5);

	}

	public static String GetSubRiskQME() {

		return PageBase.GetAttributeValue(subRiskQME, 5);

	}

	public static String GetPackingGroupQME() {

		return PageBase.GetAttributeValue(packingGroupTextFieldQME, 5);

	}

	public static String GetProperShippingNameQME() {

		return PageBase.GetAttributeValue(properShippingNameQME, 5);

	}

	public static String GetSavedTemplateMessage() {
		return PageBase.GetText(messageSaveAsTemplateQME, 5);

	}

	public static void ClosedSavedTemplateMessage() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(CloseAlert, 5);
	}
	
	public static String RandomItemDescription(String pItemDescription) {
		
		int Number = (int) (Math.random()*10000);
		String newNumber = String.valueOf(Number);
		String NewItemDescription = pItemDescription + newNumber;
		return NewItemDescription;
	}

	// Share Bookings

	public static void ClickShareInPickupBookedScreen() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(share, 5);
	}

	public static void EnterEmail1(String pEmail1) {
		PageBase.MaximumWaitForElementEnabled();
		 PageBase.MaximumWaitForElementEnabled();
		//action.doubleClick(BaseWebdriver.driver.findElement(MyTollHomePageActions.shareShipmentEmail)).perform();
		PageBase.SendKeysTo(MyTollHomePageActions.shareShipmentEmail, pEmail1, 5);
	}

	public static void ClickAddMoreEmailButton() {
		 PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(MyTollHomePageActions.shareShipmentEmailAdd, 5);
	}

	public static void EnterEmail2(String pEmail2) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(emailAddress2, pEmail2, 5);
	}

	public static void EnterEmail3(String pEmail3) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(emailAddress3, pEmail3, 5);
	}

	public static void EnterEmail4(String pEmail4) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(emailAddress4, pEmail4, 5);
	}

	public static void EnterEmail5(String pEmail5) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(emailAddress5, pEmail5, 5); 
	}

	public static void EnterMessage(String pMessage) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SendKeysTo(shareMessageTextbox, pMessage, 5);
	}

	public static String GetShareScreenMessage() {
		return PageBase.GetText(NumberOfUserMessageInShareScreen, 5);

	}
	
	public static void ClickShareInShareScreen() {
		PageBase.MinimumWaitForElementEnabled();

		PageBase.click(MyTollHomePageActions.shareShipmentSubmit, 20);

	//	PageBase.FindElement(MyTollHomePageActions.shareShipmentSubmit).click();
		//PageBase.ClickOn(MyTollHomePageActions.shareShipmentSubmit, 5);
		PageBase.click(By.xpath("//*[@id=\"modal-content-overlay-0\"]//*[@id=\"share-emails\"]"), 10);

	}
	
	public static void ClickMyPickupsInShareScreen() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.click(GoT0Dashboard, 20);
	}
	
	
	public static void setQEMYes() {
		try {
			WebElement QEM = BaseWebdriver.driver.findElement(BookAPickupActions.itemDescriptionTextField);
			PageBase.click(QuickEntryModeNo, 20);
			System.out.println("QEM Enabled");
		} catch (Exception ex) {
			System.out.println("QEM Already Enabled");
		}
	}

	public static void setQEMNo() {
		try {
			WebElement QEM = BaseWebdriver.driver.findElement(BookAPickupActions.itemDescriptionTextField);
			;
			System.out.println("QEM Already Not Enabled");
		} catch (Exception ex) {
			PageBase.click(QuickEntryModeNo, 20);
			System.out.println("QEM Not Enabled");
		}
	}
	
	public static void SetPayersAccountNumber(int _payersAccountNumber)
	{
		//PageBase.click(ReceiverAccount, 50);
		PageBase.sendText(ReceiverAccount, 50,  Integer.toString(_payersAccountNumber));
	}
	
	public static void ValidatePayersAccountNumber()
	{
		if(PageBase.findElement(addAccountNumberError, 50))
		{
			Assert.fail();
		}
	}
	
	
}
