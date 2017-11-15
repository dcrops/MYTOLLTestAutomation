package bookAPickupActions;

import GlobalActions.PageBase;
import createShipmentActions.CreateShipmentActions;
import reviewYourPickupActions.ReviewYouPickupActions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseWebdriver.BaseWebdriver;


public class BookAPickupActions {

	public static By TollCarrierDropdown = By.xpath("//*[@id=\"BU-selector\"]/label/a/i"); 
	public static By TollCarrierTextField = By.name("placeholder-bu"); 
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
	public static By destinationDropdown=By.xpath("//*[@id=\"destination-country-selector\"]/label/a/i");
	
	public static By destination = By.id("destination-address"); 
	public static By destinationCountry = By.xpath("//*[@id=\"destination-country-selector\"]/label/input[2]");
	public static By destinationaddress = By.cssSelector("ul.option-list > li > div");
	public static By destinationCountryItem = By.xpath("//*[@id=\"destination-country-selector\"]/div/ul/li[12]/div");
	public static By service = By.xpath("//*[@id=\"service-type-selector\"]/div[1]/a/i");
	public static By serviceItem = By.xpath("//*[@id=\"service-type-selector\"]/div[2]/ul/li[3]/div");
	public static By mode = By
			.cssSelector("#mode-type-selector > label.label-wrapper > a.toggler > i.ico-arrow-down-green");
	public static By modeItem = By.xpath("//*[@id=\"mode-type-selector\"]/div/ul/li");
	public static By chargeToAccountItem = By.xpath("//*[@id=\"charge-to-selector\"]/div/ul/li[1]/div");
	public static By chargeToAccount = By.xpath("//*[@id=\"charge-to-selector\"]/label/a/i"); 
	public static By itemDescription = By.xpath("//*[@id=\"freight-type-selector\"]/label/a/i"); 
	public static By itemDescriptionDropdown = By.xpath("//*[@id=\"freight-type-selector\"]/label/a/i"); //*[@id="freight-type-selector"]/label/a/i
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
	public static By searchBtn = By.xpath("//*[@id=\"un-code-selector-\"]/div/div/div/span/i");
	public static By UNNumberItem = By.xpath("//*[@id=\"un-code-selector-\"]/div/ul/li/div");
	public static By packingGroupDropdown = By.xpath("//*[@id=\"packaging-grp-selector-\"]/label/a/i");
	public static By packingGroupItem = By.xpath("//*[@id=\"packaging-grp-selector-\"]/div/ul/li[1]/div");
	public static By dgPackagingDescription = By.xpath("//*[@id=\"dg-form\"]/div/div[3]/div[1]/div/input");
	public static By dgPkgQty = By.xpath("//*[@id=\"dg-form\"]/div/div[3]/div[2]/div[1]/div/input");
	public static By dgQtyKg = By.xpath("//*[@id=\"dg-form\"]/div/div[3]/div[2]/div[2]/div/input");
	public static By technicalName = By.id("technical-name-");
	public static By add = By.id("add-dg-item");
	public static By saveAsTemplateBtn = By.id("save-as-template");

	public static By pickupDate = By.id("pickup-date");
	public static By pickupDateTomorrow = By.xpath("//*[@id=\"steps-3\"]/div[1]/div/div[1]/div/div/ul/li[2]");
	public static By pickupFrom = By.xpath("//*[@id=\"other-pick-location-selector\"]/label/a/i");
	public static By availableTime = By.id("available-time");
	public static By increaseAvailableTimeHours = By
			.xpath("//*[@id=\"steps-3\"]//*//i[@class=\"ico-accordian-up\"]"); 
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
	
		
	// Add Address
			public static final By BookAPickup_Location_Dropdown = By.xpath("//*[@id=\"location-selector\"]/label/a/i");
			public static final By BookAPickup_Location_Selected= By.name("placeholder-location");
			public static final By BookAPickup_Add_Address= By.className("add-new-elem");
			public static final By BookAPickup_New_AddressCompanName= By.id("add-adrr-company-aut");
			public static final By BookAPickup_New_AddressSearch= By.id("address-srch");
			public static final By BookAPickup_New_AddressSearch_Select= By.xpath("//*[@id=\"address-srch-wrpr\"]/div/ul/li[1]/div");
			public static final By BookAPickup_New_AddressSearch_Contine= By.id("addr-continue-autmatic");
			public static final By BookAPickup_New_Address_Name = By.id("add-addr-name");
			public static final By BookAPickup_New_Address_Number = By.id("add-addr-phone");
			public static final By BookAPickup_New_Address_Email = By.id("add-addr-email");
			public static final By BookAPickup_New_Address_DGName = By.id("add-addr-dg-contact-name");
			public static final By BookAPickup_New_Address_DGNumber = By.id("add-addr-dg-contact-phone");
			public static final By BookAPickup_New_Address_Add = By.id("add-address-btn-final");
			public static final By BookAPickup_CompanyName = By.id("name");
			
			public static final String NewAddressCompanyName = "Test";
			public static final String NewAddressCompanyAdd = "60 Collins Street, MELBOURNE VIC 3000";
			
			//Add Template
			public static final By addTemplate = By.linkText("ADD TEMPLATE");
			public static final By addTemplateCarrier = By.xpath("//*[@id=\"bu-dropdown-new\"]/label/a/i");
			public static final By addTemplateName = By.xpath("//*[@id=\"newTemplate\"]//*//input[@name=\"templateName\"]");
			public static final By addTemplateQty = By.id("addQuantity");
			public static final By addTemplateWeight = By.xpath("//*[@id=\"newTemplate\"]//*//input[@name=\"templateTotalWight\"]");
			public static final By addTemplateLenght = By.id("addLength");
			public static final By addTemplateWidth  = By.id("addWidth");
			public static final By addTemplateHeight = By.id("addHeight");
			public static final By addTemplateSave= By.id("templateSave");
			public static final By addTemplateSaveMsg= By.xpath("//*[@id=\"response-poup-wrpr\"]//*//h2");
			public static final By addTemplateSaveMsgClose = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//a/i");
			public static final By addTemplateViewMore = By.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytolltemplateportlet\"]//*//a[text()='View More']");
			
			//Add Accounts
			public static final By addAccount = By.linkText("ADD ACCOUNT");
			public static final By addAccountCarrier = By.xpath("//*[@id=\"addAccountForm\"]//*//label/a/i" );
			public static final By addAccountNumber = By.xpath("//*[@id=\"addAccountForm\"]//*//div/input[@name=\"AccountCode\"]");
			public static final By addAccountAccessType = By.xpath("//*[@id=\"addAccountForm\"]//*//div[@data-placeholder=\"Select Access Type\"]/label/a/i");
			public static final By addAccountSave = By.linkText("SAVE");
			public static final By addAccountSaveMsg= By.xpath("//*[@id=\"response-poup-wrpr\"]//*//h2");
			public static final By addAccountSaveMsgClose = By.xpath("//*[@id=\"response-poup-wrpr\"]//*//a/i");
			public static final By addAccountViewMore = By.xpath("//*[@id=\"portlet_mytolluserAccountportlet_WAR_mytollupsportlet\"]//*//a[text()='VIEW MORE']");
			
			public static By confirmPickupBtn=By.id("submit-pickup");
			public static By  pickUpReferenceNumber = By.xpath("//*[@id=\"book-a-pickup-placeholder\"]//*//span[@class=\"reference-no\"]/span");
			public static ArrayList BookAPickUpNumbers = new ArrayList();
			
		
	public static void EnterTollCarrier(String pTollCarrierName) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(TollCarrierDropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//div[@id='BU-selector']/div/ul/li/div[text()='"+pTollCarrierName+"']")).click();
		
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

	public static void SelectAccountNumberItem(int j) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AccountNumberDropdown).click();  
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"account-selector\"]/div/ul/li[" + j + "]+/div[2]"))
				.click();

	}
	
	public static void EnterAccountNumber(String pAccountNumber) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AccountNumberDropdown).click();  
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"account-selector\"]/div/ul/li/div[text()="+pAccountNumber+"]")).click();


	}

	public static void SelectServiceItemItem(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-type-selector\"]//a/i")).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-type-selector\"]//ul/li[" + j + "]/div")).click();
		PageBase.MinimumWaitForElementEnabled();
	}
	
	public static void EnterService(String pService ) {
		PageBase.MaximumWaitForElementEnabled();
		try {
		PageBase.MoveToElement(BookAPickupActions.accountNumber, BookAPickupActions.name);
		BaseWebdriver.driver.findElement(ServiceDropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-type-selector\"]//ul/li/div[text()='"+pService +"']")).click();
		PageBase.MinimumWaitForElementEnabled();
		}
		catch(Exception ex)
		{
			PageBase.MoveToElement(BookAPickupActions.name, BookAPickupActions.serviceItem);
			BaseWebdriver.driver.findElement(ServiceDropdown).click();
			BaseWebdriver.driver.findElement(ServiceDropdown).click();
			BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-type-selector\"]//ul/li/div[text()='"+pService +"']")).click();
			PageBase.MinimumWaitForElementEnabled();
		}
	}
	
	public static void SelectServiceItemByText(String pService) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-type-selector\"]//a/i")).click();
		BaseWebdriver.driver.findElement(By.xpath(".//*[@id=\"service-type-selector\"]/div/div/ul/li[text()='"+pService+"']")).click();
		//BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-type-selector\"]//ul/li[" + j + "]/div")).click();
		PageBase.MinimumWaitForElementEnabled();
	}

	public static void SelectModeItem(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-type-selector\"]/label/a/i")).click();  //*[@id="mode-type-selector"]/label/a/i
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-type-selector\"]/div/ul/li[" + j + "]")).click();

	}

	public static void SelectChargeToAccount(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(chargeToAccount).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"charge-to-selector\"]//ul/li[" + j + "]/div")).click();

	}
	
	public static void EnterChargeToAccount(String pChargeToAccount) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(chargeToAccount).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"charge-to-selector\"]//ul/li/div[text()='"+pChargeToAccount+"']")).click();

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
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AccountNumberDropdownitem1).click();
		PageBase.MinimumWaitForElementEnabled();
	}

	public static String GetSelectedTollCarrierName() {
		PageBase.MinimumWaitForElementEnabled();
		String tollCarrierTextField =BaseWebdriver.driver.findElement(TollCarrierTextField).getText();
		return tollCarrierTextField;
	}
	
	public static String GetAccountNumber() {
		PageBase.MinimumWaitForElementEnabled();
		String accountNo=BaseWebdriver.driver.findElement(accountNumber).getAttribute("value");
		return accountNo;
		
	}
	
	public static String GetCompany(Integer i) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(locationDropdown).click(); 
		PageBase.MinimumWaitForElementEnabled();
		String vCompany=BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li["+i+"]/div[1]")).getText();
		return vCompany;
		
	}
	
	
	public static String GetLocation(Integer i) {
		PageBase.MaximumWaitForElementEnabled();
		String vLocation=BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li["+i+"]/div[2]")).getText();
		return vLocation;
	
	}
	
	public static String GetName() {
		PageBase.MaximumWaitForElementEnabled();
		String vName=BaseWebdriver.driver.findElement(name).getAttribute("value");
		return vName;
	}
	
	public static String GetPhoneNumber() {
		PageBase.MaximumWaitForElementEnabled();
		String vName=BaseWebdriver.driver.findElement(phoneNumber).getAttribute("value");
		return vName;
	}
	
	public static String GetCountryCode() {
		PageBase.MaximumWaitForElementEnabled(); 
		String vCountryCode=BaseWebdriver.driver.findElement(countryCode).getText();
		return vCountryCode;
	}
	
	public static String GetVoulme() {
		PageBase.MaximumWaitForElementEnabled(); 
		String vVolume=BaseWebdriver.driver.findElement(volume).getAttribute("value");
		return vVolume;
	}
	
	public static String GetReadyTime() {
		PageBase.MaximumWaitForElementEnabled(); 
		String vAvailableTime=BaseWebdriver.driver.findElement(availableTime).getAttribute("value");
		return vAvailableTime; 
	}

	public static String GetClosingTime() {
		PageBase.MaximumWaitForElementEnabled(); 
		String vClosingTime=BaseWebdriver.driver.findElement(closingTime).getAttribute("value");
		return vClosingTime; 
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
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li["+i+"]")).click();

	}
	
	public static void SelectLocation1(String location) {
		PageBase.MaximumWaitForElementEnabled();
		//BaseWebdriver.driver.findElement(locationDropdown).click(); 
		// BaseWebdriver.MaximumWaitForElementEnabled();
		//BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li[1]")).click();

		//Select selectByValue = new Select(BaseWebdriver.driver.findElement(locationDropdown).click());
		//selectByValue.selectByValue(location);
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
		assertEquals(GetAccountNumber(),BaseWebdriver.driver.findElement(AccountNumberDropdownitem1).getAttribute("value"));

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

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destination);
		PageBase.waitForElement(BaseWebdriver.driver.findElement(destination), 10);
		BaseWebdriver.driver.findElement(destination).clear();
		BaseWebdriver.driver.findElement(destination).sendKeys(pDestination);
		
		PageBase.retryingFindClick(destinationaddress);
		

	} 
	
	public static void SelectDestinationCountry(String pDestination) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destinationCountry);
		PageBase.waitForElement(BaseWebdriver.driver.findElement(destinationCountry), 10);
		BaseWebdriver.driver.findElement(destinationCountry).clear();
		BaseWebdriver.driver.findElement(destinationCountry).sendKeys(pDestination);
		
		PageBase.retryingFindClick(destinationCountryItem);
		

	} 
	
	public static void EnterDestination(String pDestination) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destination);
		PageBase.waitForElement(BaseWebdriver.driver.findElement(destination), 10);
		BaseWebdriver.driver.findElement(destination).clear();
		BaseWebdriver.driver.findElement(destination).sendKeys(pDestination);
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[text()='"+pDestination+"']")).click();
		PageBase.retryingFindClick(destinationaddress);
	

	} 
	
	public static void EnterDestinationNZ(String pDestination, String pDestinationItem) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destination);
		PageBase.waitForElement(BaseWebdriver.driver.findElement(destination), 10);
		BaseWebdriver.driver.findElement(destination).clear();
		BaseWebdriver.driver.findElement(destination).sendKeys(pDestination);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[1]/div")).click();
		
		//BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"item-details-sub-form\"]/div[1]/div[2]/div/div/ul/li[text()='"+pDestinationItem+"']/div")).click();
		//PageBase.retryingFindClick(destinationaddress);
		//*[@id="item-details-sub-form"]/div[1]/div[2]/div/div/ul/li[1]/div

	} 
	public static void SelectDestinationCountry(int j) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(destinationDropdown);
		PageBase.waitForElement(BaseWebdriver.driver.findElement(destinationDropdown), 10);
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"destination-country-selector\"]/div/ul/li["+j+"]/div")).click();
		//PageBase.retryingFindClick(destinationaddress);
		

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

	public static void SelectChargeToAccount2(int j) {
		PageBase.waitForElement(BaseWebdriver.driver.findElement(chargeToAccount), 10);
		SelectChargeToAccount(j);

	}

	public static void SelectItemDescription() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemDescription).click();
		BaseWebdriver.driver.findElement(selectItemDescription).click();
	}
	
	public static void SelectItemDescriptionTollPriorityAU(String pItem) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemDescription).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li/div[text()='"+pItem+"']")).click();
	}

	public static void SelectItem(int j) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemDescription).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li[" + j + "]/div")).click();
	}
	
	public static void SelectItemDescriptionTollPriorityAU() {
		PageBase.MinimumWaitForElementEnabled();
		//BaseWebdriver.driver.findElement(itemDescription).click();
		//BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li[2]/div")).click();
		PageBase.click(itemDescription, 2);
		PageBase.click(By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li[2]/div"), 2);
	}
	
	public static void EnterItem(String itemName) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemDescriptionTextField).click();
		//BaseWebdriver.driver.findElement(itemDescription).clear();;
		BaseWebdriver.driver.findElement(itemDescriptionTextField).sendKeys(itemName);
		BaseWebdriver.driver.findElement(itemDescriptionDropdown).click();
	
	}

	public static void SelectLargestItem(int j) {

		//BaseWebdriver.driver.findElement(selectLargestItem).click();
		//BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"freight-type-selector\"]/div/ul/li[" + j + "]/div"))
		//		.click();
		
		PageBase.click(selectLargestItem, 2);
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
		BaseWebdriver.driver.findElement(weight).click();
		BaseWebdriver.driver.findElement(weight).clear();
		BaseWebdriver.driver.findElement(weight).sendKeys(pweight);
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
		
		String readyTime=GetReadyTime().toString();
		String newReadyTime=readyTime.substring(0,2);
		System.out.println(newReadyTime);
		Integer readyTimeInt=Integer.parseInt(newReadyTime);
		System.out.println(readyTimeInt);
		
		if(readyTimeInt>=15)
		{
		BaseWebdriver.driver.findElement(availableTime).click();
		BaseWebdriver.driver.findElement(decreaseReadyTime).click();
		BaseWebdriver.driver.findElement(decreaseReadyTime).click();
		}
		
		if(readyTimeInt<=8)
		{
		BaseWebdriver.driver.findElement(availableTime).click();
		 BaseWebdriver.driver.findElement(increaseAvailableTimeHours).click();
		 BaseWebdriver.driver.findElement(increaseAvailableTimeHours).click();
		}
		/*Integer i;
		for (i=1; i<=17; i++) {
		 BaseWebdriver.driver.findElement(increaseAvailableTimeHours).click();
		 
		}
	
		 BaseWebdriver.driver.findElement(increaseAvailableTimeminutes).click();
		 BaseWebdriver.driver.findElement(increaseAvailableTimeminutes).click();
		 BaseWebdriver.driver.findElement(increaseAvailableTimeminutes).click();
		 BaseWebdriver.driver.findElement(increaseAvailableTimeminutes).click();*/
		
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
		//BaseWebdriver.driver.findElement(reviewBookBtn).click();
		PageBase.click(reviewBookBtn, 2);
	}
	
	public static void ConfirmReadyTimeAndConfirmPickup() {
		
		boolean results=true;
		try {
		if (BaseWebdriver.driver.findElement(confirmReadyTime).isDisplayed()==results)
		{
		BaseWebdriver.driver.findElement(confirmReadyTime).click();
		}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			ReviewYouPickupActions.ClickConfirmPickup();
			

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

	public static void AddANewLine() {

		//JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		//jse.executeScript("scroll(0, 250);");
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BaseWebdriver.driver.findElement(addANewLine).click();
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		BookAPickupActions.Selectservice(2);
		BookAPickupActions.EnterQuantity("15");

		BookAPickupActions.EnterPalletSpace("6");

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		BookAPickupActions.SelectDestination("melbou");
		

		//jse.executeScript("scroll(200, 500);");
		
		BookAPickupActions.EnterItem("Automation Temp1");
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.selectContainFoodItem();
		
		BookAPickupActions.selectDangerousGoodNewLine();

	}

	public static void AddANewLineTollTasmania(String ServiceGeneral) {
		//PageBase.Scrollbar(800, 1000);
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		
		BaseWebdriver.driver.findElement(addANewLine).click();
		//BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//PageBase.Scrollbar(250, 800);
		BookAPickupActions.EnterItem("Automation Temp1");
		BookAPickupActions.Selectservice(2);
		BookAPickupActions.SelectDestination("melb");
		BookAPickupActions.SelectChargeToAccount2(1);
		//BookAPickupActions.EnterService(ServiceGeneral);
		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);		
		BookAPickupActions.selectDangerousGoodNewLine();
		//BookAPickupActions.selectContainFoodItem(); removed
		//PageBase.Scrollbar(800, 1200);
		
		

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
		BaseWebdriver.driver.findElement(searchBtn).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"un-code-selector-\"]/div/ul/li[" + j + "]/div")).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(dgPackagingDescription).sendKeys(packageDescription);
		BaseWebdriver.driver.findElement(dgPkgQty).sendKeys(pDgPkgQty);
		BaseWebdriver.driver.findElement(dgQtyKg).sendKeys(pDgQtyKg);
		}
		
		catch (Exception ex)
		{
			CreateShipmentActions.EnterDangerousGoodsDetails( j, lookupItem, packageDescription, pDgPkgQty, pDgQtyKg);
		}

	}
	
	public static void SelectDangerousGoodsDetails(String lookupItem, String packageDescription, String pDgPkgQty,
			String pDgQtyKg) {
		// BookAPickupActions.SelectUNNumber(j,lookupItem);

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
		// BookAPickupActions.SelectUNNumber(j,lookupItem);
		try {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(packingGroupDropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"packaging-grp-selector-\"]/div/ul/li/div[text()='"+packagingGroup+"']")).click();
		}
		catch(Exception ex)
		{
		CreateShipmentActions.SelectPackgingGroup(packagingGroup);
		}
	}
	
	public static void SelectPackgingGroup(Integer packagingGroup) {
		// BookAPickupActions.SelectUNNumber(j,lookupItem);
		try {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(packingGroupDropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"packaging-grp-selector-\"]/div/ul/li["+packagingGroup+"]/div")).click();
		}
		catch(Exception ex)
		{
		CreateShipmentActions.SelectPackgingGroup(packagingGroup);
		}
	}

	public static void ClickConfirm() {
		PageBase.MaximumWaitForElementEnabled();
		//BaseWebdriver.driver.findElement(confirmBtn).click();
		
	}
	
	public static void ConfirmPickUpandGetReferenceNo() {
		PageBase.waitForElement(confirmPickupBtn, 10);
		PageBase.click(confirmPickupBtn, 2);
		PageBase.waitForElement(pickUpReferenceNumber, 10);
		String ReferenceNumber = BaseWebdriver.driver.findElement(pickUpReferenceNumber).getText().substring(19);
		if (ReferenceNumber != null && !ReferenceNumber.contains("undefined") ) {
			System.out.println("Reference No: "+ReferenceNumber);
			BookAPickUpNumbers.add(ReferenceNumber);
		}
		else {
			System.out.println("FAILED : Book A PickUp was not submitted properly, Reference No: "+ReferenceNumber);
			Assert.fail("FAILED : Book A PickUp was not submitted properly, Reference No: "+ReferenceNumber);
		}
		
		System.out.println("Book a Pick Up Array : "+BookAPickUpNumbers);
	}
	
	
	
}
