package myTollHomePageActions;

import GlobalActions.PageBase;

import static org.testng.Assert.assertEquals;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Reporter;

import baseWebdriver.BaseWebdriver;
import stationeryActions.StationeryActions;


public class MyTollHomePageActions {
	
	
	/* Login */
	
	public static By login=By.id("lnk-login");
	public static By emailAddress=By.id("_com_liferay_login_web_portlet_LoginPortlet_login"); 
	public static By passwordLable=By.className("_com_liferay_login_web_portlet_LoginPortlet_password");
	public static By password=By.id("_com_liferay_login_web_portlet_LoginPortlet_password");
	public static By loginBtn=By.id("login-btn");
	public static By Name=By.xpath("//*[@id=\"header-right-ctrls\"]/div/ul/li[1]/a[1]");
	public static By MyProfile=By.xpath("//*[@id=\"header-right-ctrls\"]/div/ul/li[1]/ul/li[1]/a"); 
	public static By RegistrationErrorMsg = By.cssSelector("div.yui3-widget-bd");
	
	
	public static By HmbugerMenu=By.xpath("//*[@id=\"nav-opner\"]/i"); 
	public static By Menulist=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[2]/a");
	public static By BookAPickup=By.id("bookaPickup");
	public static By MyDashboard=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[1]/a/p");
	public static By getRateEnquiry=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[2]/a[1]/p");
	public static By templateMenu = By.xpath("//*[@id=\"nav-dropdown\"]//*//span[text()='My templates']");
	public static By myAccountMenu = By.xpath("//*[@id=\"nav-dropdown\"]//span[text()='My accounts']");
	public static By myContactMenu = By.xpath("//*[@id=\"nav-dropdown\"]//span[text()='My contacts']");
	public static By aboutMeMenu = By.xpath("//*[@id=\"nav-dropdown\"]//span[text()='About me']");
	public static By Dashboard = By.xpath("//*[@id=\"nav-dropdown\"]//span[text()='Go to my dashboard']");
	public static By stationery = By.xpath("//*[@id=\"my-stationary\"]/p[text()='STATIONERY']");
	public static By orderMyStationery = By.xpath("//*[@id=\"my-stationary\"]/span[text()='Order stationery']"); 
	public static By myOrdersStationery = By.xpath("//*[@id=\"my-stationary\"]/span[text()='My Orders']"); 
	public static By SavedSearchTab = By.xpath("//*[@id=\"savedSearchTabAnchor\"]/span");
		
	
	//Add Template
	public static By MyTemplates=By.xpath("//a[@href='/group/guest/my-templates']"); 
	public static By AddTemplates=By.linkText("ADD TEMPLATE");
	public static By TollCarrierDropdown=By.xpath("//*[@id=\"bu-dropdown-new\"]/label/a/i");
	public static By TemplateNameTextField=By.xpath("//*[@id=\"newTemplate\"]/div/section/div[2]/div/div/input"); 
	public static By numberOfItem = By.id("addQuantity"); 
	public static By length = By.id("addLength");
	public static By width = By.id("addWidth");
	public static By height = By.id("addHeight");
	public static By weight = By.xpath("//*[@id=\"newTemplate\"]/div/section/div[3]/div[1]/div[2]/div/input");
	public static By SaveTemplate=By.id("templateSave");
	public static By CloseNewTemplate=By.xpath("//*[@id=\"response-poup-wrpr\"]/div[2]/div/a/i");
		
	// User registration  registerlink
	
	public static By register=By.name("registerlink");
	public static By firstName=By.id("_userregistrationportlet_WAR_userprofileportlet_firstName");
	public static By lastName=By.id("_userregistrationportlet_WAR_userprofileportlet_lastName");
	public static By newEmailAddress=By.id("_userregistrationportlet_WAR_userprofileportlet_emailAddress");
	public static By mobileNumber=By.id("_userregistrationportlet_WAR_userprofileportlet_mobileNum");
	public static By newPassword=By.id("_userregistrationportlet_WAR_userprofileportlet_pwd");
	public static By memerobleQuesDropdown=By.id("_userregistrationportlet_WAR_userprofileportlet_memorableQuestion");
	public static By memerobleQuesOption=By.xpath("//*[@id=\"_userregistrationportlet_WAR_userprofileportlet_memorableQuestion\"]/option[4]");
	public static By memerobleAnswer=By.id("_userregistrationportlet_WAR_userprofileportlet_answer");
	public static By recaptchalable=By.xpath("//*[@id=\"_userregistrationportlet_WAR_userprofileportlet_userRegForm\"]/div/div[1]/div[10]/div/label[1]");
	public static By robotCheckBox=By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]");
	public static By agreeTerms = By.xpath("//*[@id=\"_userregistrationportlet_WAR_userprofileportlet_userRegForm\"]/div[10]/div/label[1]");
	
	public static By firstNameErrorMsg=By.xpath("//*[@id=\"_userregistrationportlet_WAR_userprofileportlet_firstName_error\"]");
	public static By lastNameErrorMsg=By.xpath("//*[@id=\"_userregistrationportlet_WAR_userprofileportlet_lastName_error\"]");
	public static By newEmailAddressErrorMsg=By.xpath("//*[@id=\"_userregistrationportlet_WAR_userprofileportlet_emailAddress_error\"]");
	public static By mobileNumbeErrorMsgr=By.xpath("//*[@id=\"_userregistrationportlet_WAR_userprofileportlet_mobileNum_error\"]");
	public static By newPasswordErrorMsg=By.xpath("//*[@id=\"_userregistrationportlet_WAR_userprofileportlet_pwd_error\"]");
	public static By memerobleQuesDropdownErrorMsg=By.xpath("//*[@id=\"_userregistrationportlet_WAR_userprofileportlet_mm-question_error\"]");
	public static By memerobleAnsweErrorMsgr=By.xpath("//*[@id=\"_userregistrationportlet_WAR_userprofileportlet_mm-answer_error\"]");

	//Change Memeorable Password
	public static By changeMemorableQuestionBtn = By.linkText("CHANGE MEMORABLE QUESTION");
	public static By securityQuestionDropdown = By.xpath("//*[@id=\"security-quest-dropdown\"]/div[1]/a/i");
	public static By securityQuestionAnswer = By.xpath("//*[@id=\"mm-answer\"]");
	public static By securityQuestionSave = By.xpath("//*[@id=\"chg-mem-question\"]");
	public static By securityQuestionSaveMsgPopup = By.xpath("//*[@id=\"alert-box-wrapper\"]//*//div[2]");
	public static By securityQuestion = By.xpath("//*[@id=\"closeAlert\"]");
	
	//Track and Trace
	public static By trackAndTrace = By.id("quickSearch");
	public static By trackAndTraceSearch = By.id("search-shipment-btn");
	public static By trackAndTraceClose = By.xpath("//*[@id=\"clear-srch-res\"]/span");
	public static By shareShipment = By.xpath("//*[@id=\"shareShipment\"]");
	public static By shareShipmentEmail = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"share-email\"]");
	public static By shareShipmentEmailErrorMsg = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"to-email-sec\"]/div");
	public static By shareShipmentSubmit = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"share-emails\"]");
	public static By shareShipmentEmailAdd = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"share-form-area\"]/div[1]/span/span");
	public static By shareShipmentEmailMaxMsg = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"max-em-used\"]/div");
	public static By shareShipmentEmailSuccessMsg = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*/h3");
	public static By shareShipmentEmailSuccessMsg2 = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*/p");
	public static By shareShipmentEmailSuccessClose = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"close-0\"]");
 

	//AdvanceSearch
	public static By advanceSearchTab = By.xpath("//*[@id=\"advancesearchTabAnchor\"]");
	public static By advanceSearchRefNo = By.xpath("//*[@id=\"reference-number\"]");
	public static By advanceSearchRefNoExclude = By.xpath("//*[@id=\"reference-nuxxxxmber\"]");
	public static By advanceSearchSender = By.xpath("//*[@id=\"sender-name\"]");
	public static By advanceSearchSenderExclude= By.xpath("//*[@id=\"include-exclude-sender\"]");
	public static By advanceSearchReceiver= By.xpath("//*[@id=\"receiver-name\"]");
	public static By advanceSearchReceiverExclude = By.xpath("//*[@id=\"include-exclude-receiver\"]");
	public static By advanceSearchDatePeriod = By.xpath("//*[@id=\"adl_datePeriod\"]");
	public static By advanceSearchDateDropDown= By.xpath("//*[@id=\"period-selector\"]/div[1]/a/i");
	public static By advanceSearchDateRange = By.xpath("//*[@id=\"adl_dateRange\"]");
	public static By advanceSearchDateFrom = By.xpath("//*[@id=\"advsrchFromDate\"]");
	public static By advanceSearchDateTo = By.xpath("//*[@id=\"advsrchToDate\"]");
	public static By advanceSearchSenderLoc= By.xpath("//*[@id=\"sender-location-value\"]");
	public static By advanceSearchSenderLocExclude= By.xpath("//*[@id=\"include-exclude-senderLocation\"]");
	public static By advanceSearchSenderSuburb = By.xpath("//*[@id=\"suburb\"]");
	public static By advanceSearchSenderState = By.xpath("//*[@id=\"state\"]");
	public static By advanceSearchSenderPostcode = By.xpath("//*[@id=\"postCode\"]");
	public static By advanceSearchSenderCountry = By.xpath("//*[@id=\"country\"]");
	public static By advanceSearchReceiverLoc= By.xpath("//*[@id=\"receiver-location-value\"]");
	public static By advanceSearchReceiverLocExclude= By.xpath("//*[@id=\"include-exclude-receiverLocation\"]");
	public static By advanceSearchReceiverSuburb = By.xpath("//*[@id=\"suburb\"]");
	public static By advanceSearchReceiverState = By.xpath("//*[@id=\"state\"]");
	public static By advanceSearchReceiverPostcode = By.xpath("//*[@id=\"postCode\"]");
	public static By advanceSearchReceiverCountry = By.xpath("//*[@id=\"country\"]");
	public static By advanceSearchTollCarrier = By.xpath("//*[@id=\"current-ms-carrier\"]");
	public static By advanceSearchTollCarrierExclude = By.xpath("//*[@id=\"include-exclude-toll-carrier\"]");
	public static By advanceSearchServiceType = By.xpath("//*[@id=\"current-ms-service\"]");
	public static By advanceSearchServiceTypeExclude = By.xpath("//*[@id=\"include-exclude-server-type\"]");
	public static By advanceSearchMilestone = By.xpath("//*[@id=\"current-ms-milestone\"]");
	public static By advanceSearchMilestoneExclude = By.xpath("//*[@id=\"include-exclude-milestone\"]");
	public static By advanceSearchSubmit = By.xpath("//*[@id=\"get-advance-search\"]");	
	
	//Advance Search Results
	public static By TollShipmentNo = By.xpath("//*[@id=\"adv-search-result-header\"]//*[text()='Toll shipment no.']");	
	public static By References = By.xpath("//*[@id=\"adv-search-result-header\"]//*[text()='References']");	
	public static By Milestone = By.xpath("//*[@id=\"adv-search-result-header\"]//*[text()='Milestone']");	
	public static By SenderLocation = By.xpath("//*[@id=\"adv-search-result-header\"]//*[text()='Sender location']");	
	public static By DeliveryLocation =  By.xpath("//*[@id=\"adv-search-result-header\"]//*[text()='Receiver location']");	
	public static By EstimatedDelivery = By.xpath("//*[@id=\"adv-search-result-header\"]//*[text()='Estimated/Actual delivery']");	
	public static By Items =  By.xpath("//*[@id=\"adv-search-result-header\"]//*[text()='Items']");	
	public static By AdvanceSearchResultsClose =  By.xpath("//*[@id=\"advSearchRelClose\"]/span");	
	
	
	//SaveSearch
	public static By SaveSearch = By.xpath("//*[@id=\"adl_advseavedsrchBtn\"]");	
	public static By SaveSearchName = By.xpath("//*[@id=\"advSaveSearch\"]");	
	public static By SaveSearchSubmit = By.xpath("//*[@id=\"advSrchSaveBtn\"]");
	public static By SaveSearchClose = By.xpath("//*[@id=\"dashboard-features-info\"]//*//a[@class=\"tollSaveSearch-close\"]/i");	
	public static By LoadSearchDropDown = By.xpath("//*[@id=\"current-saved-search\"]");
	public static By DownloadSavedSearch=By.linkText("DOWNLOAD");
	public static By EditSaveSearch = By.xpath("//*[@id=\"edit-search-text\"]");
	public static By DeleteSaveSearchCancel = By.xpath("//*[@id=\"confirm-false\"]");
	public static By DeleteSaveSearchConfirm = By.xpath("//*[@id=\"confirm-true\"]");
	public static By ViewMoreSaveSearch = By.xpath("//*[@id=\"getMoreSavedRecord\"]");
	
	public static By SavedTabTollShipmentNo = By.xpath("//*[@id=\"savedSearchThId\"]//*[text()='Toll shipment no.']");	
	public static By SavedTabReferences = By.xpath("//*[@id=\"savedSearchThId\"]//*[text()='References']");	
	public static By SavedTabMilestone = By.xpath("//*[@id=\"savedSearchThId\"]//*[text()='Milestone']");	
	public static By SavedTabSenderLocation = By.xpath("//*[@id=\"savedSearchThId\"]//*[text()='Sender location']");	
	public static By SavedTabDeliveryLocation =  By.xpath("//*[@id=\"savedSearchThId\"]//*[text()='Receiver location']");	
	public static By SavedTabEstimatedDelivery = By.xpath("//*[@id=\"savedSearchThId\"]//*[text()='Estimated/Actual delivery']");	
	public static By SavedTabItems =  By.xpath("//*[@id=\"savedSearchThId\"]//*[text()='Items']");	
	
	//DraftShipment
	public static By SaveDraft =  By.xpath("//*[@id=\"save-draft-btn\"]");	
	public static By DraftShipmentTab =  By.xpath("//*[@id=\"draftshipmentAnchor\"]");	
	public static By DraftShipmentTabTollCarrier =  By.xpath("//*[@id=\"draftTableHead\"]/th[text()='Toll carrier']");	
	public static By DraftShipmentTabSender =  By.xpath("//*[@id=\"draftTableHead\"]/th[text()='Sender']");	
	public static By DraftShipmentTabReceiver =  By.xpath("//*[@id=\"draftTableHead\"]/th[text()='Receiver']");	
	public static By DraftShipmentTabDispatchDate =  By.xpath("//*[@id=\"draftTableHead\"]/th[text()='Dispatch date']");	
	public static By DraftShipmentGoToDashboard =  By.xpath("//*[@id=\"confirm-true\"]");	
	public static By DraftShipmentTabDeleteShipment =  By.xpath("xxxx");	

	//Returns
	public static By createReturn = By.xpath("//*[@id=\"nav-dropdown\"]//span[text()='Create a return']");
	public static By myReturn = By.xpath("//*[@id=\"nav-dropdown\"]//span[text()='My returns']");
	public static By ReturnSameAsReceiver = By.xpath("//*[@id=\"same-as-reciever-c\"]");
	public static By ReturnRAN = By.xpath("//*[@id=\"reference-1\"]");
	public static By ReturnReference = By.xpath("//*[@id=\"reference-2\"]");
	public static By ReturnReviewAndCreate = By.xpath("//*[@id=\"create-shipment-btn\"]");
	public static By ReturnReviewPageTollCarrier = By.xpath("//*[@id=\"toll-carrier\"]");
	public static By ReturnReviewPageService = By.xpath("//*[@id=\"service-text\"]");
	public static By ReturnReviewPageAccountNumber = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Account number']]/p");
	public static By ReturnReviewPageWhoPays = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Who pays']]/p");
	public static By ReturnReviewPageRAN = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='RAN']]/p");
	public static By ReturnReviewPageDate = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Earliest dispatch date']]/p/span");
	public static By ReturnReviewPageReadyTime = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Ready time']]/p/span");
	public static By ReturnReviewPageClosingTime = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Location closing time']]/p/span");
	public static By ReturnReviewPageReturnRef = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Return Reference']]/p");
	public static By ReturnReviewPageSpecialIns = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Special instructions']]/p");
	public static By ReturnReviewPageSender = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Sender company name']]/p");
	public static By ReturnReviewPageSenderLoc = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Sender location']]/p");
	public static By ReturnReviewPageReceiver = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Receiver company name']]/p");
	public static By ReturnReviewPageReceiverLoc = By.xpath("//*[@id=\"shipment-placeholder\"]//*//div[preceding-sibling::div/label[text()='Receiver location']]/p");
	public static By ReturnReviewConfirm = By.linkText("CONFIRM RETURN");
	public static By ReturnAddNewLine = By.xpath("//*[@id=\"add-line-item\"]");
	public static By ReturnDeleteLineConfirm = By.xpath("//*[@id=\"confirm-true\"]");
	
	public static By ReturnSuccessMsg = By.xpath("//*[@id=\"shipment-placeholder\"]//*//h1");
	public static By ReturnShipmentNumber = By.xpath("//*[@id=\"shipment-placeholder\"]//*//span/span[1]");
	public static By ReturnSucessfullRAN = By.xpath("//*[@id=\"shipment-placeholder\"]//*//span/span[2]");
	public static By ReturnPrint = By.xpath("//*[@id=\"returns-confimr-print\"]");
	public static By ReturnGoToMyDashboard = By.xpath("//a[text()='Go to my dashboard']");
	public static By ReturnCreateReturn = By.xpath("//a[text()='CREATE A NEW RETURN']");
	public static By ReturnGoToMyReturns = By.xpath("//a[text()='GO TO MY RETURNS']");
	
	public static By MyReturnRefNo = By.xpath("//*[@id=\"return_ref_num\"]");
	public static By MyReturnDateFrom = By.xpath("//*[@id=\"manifestFromDate\"]");
	public static By MyReturnDateTo = By.xpath("//*[@id=\"manifestToDate\"]");
	public static By MyReturnStatus = By.xpath("//*[@id=\"status-selector\"]/label/a/i");
	public static By MyReturnSearch = By.xpath("//*[@id=\"searchMyReturnsResult\"]");
	
	public static By MyReturnTollShipmentNo = By.xpath("//*[@id=\"myreturnsTableId\"]/thead/tr/th[1]");
	public static By MyReturnRAN = By.xpath("//*[@id=\"myreturnsTableId\"]/thead/tr/th[2]");
	public static By MyReturnStatusColumn = By.xpath("//*[@id=\"myreturnsTableId\"]/thead/tr/th[3]");
	public static By MyReturnTollCarrier = By.xpath("//*[@id=\"myreturnsTableId\"]/thead/tr/th[4]");
	public static By MyReturnSenderDetails = By.xpath("//*[@id=\"myreturnsTableId\"]/thead/tr/th[5]");
	public static By MyReturnReceiverDetails = By.xpath("//*[@id=\"myreturnsTableId\"]/thead/tr/th[6]");
	public static By MyReturnEarliestDispatchDate= By.xpath("//*[@id=\"myreturnsTableId\"]/thead/tr/th[7]");
	public static By MyReturnReadyTime= By.xpath("//*[@id=\"myreturnsTableId\"]/thead/tr/th[8]");
	
	
	public static void LaunchMyToll(String url)
	{
		BaseWebdriver.driver.get(url);
	}
	
	
	public static void Login(String userName, String pPassword) throws Exception
	{
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.navigate().refresh();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.retryingFindClick(login);
		
		PageBase.MaximumWaitForElementEnabled();
		try {
			Boolean results=BaseWebdriver.driver.findElement(emailAddress).isDisplayed();
			if(results=true)
			{
		BaseWebdriver.driver.findElement(emailAddress).sendKeys(userName);
		BaseWebdriver.driver.findElement(password).sendKeys(pPassword);
		BaseWebdriver.driver.findElement(loginBtn).sendKeys(Keys.ENTER);
		}
		}
		
		catch(Exception ex)
		{
			BaseWebdriver.driver.navigate().refresh();
			BaseWebdriver.setUp();
			BaseWebdriver.driver.navigate().refresh();
			PageBase.retryingFindClick(login);
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(emailAddress).sendKeys(userName);
			BaseWebdriver.driver.findElement(password).sendKeys(pPassword);
			BaseWebdriver.driver.findElement(loginBtn).sendKeys(Keys.ENTER);
		}
	}

	public static void ClickName()  
	{
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(Name).click();
		BaseWebdriver.driver.findElement(MyProfile).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(MyTemplates).click();
		PageBase.MaximumWaitForElementEnabled();
			
	}
	
	public static void ClickMyDashboard()  
	{
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(MyDashboard, 5);
		PageBase.MaximumWaitForElementEnabled();
			
	}
	
	public static void AddTemplates(String pTollCarrier, String pTemplateName, String pNumberOfItem,String pWeight, String pLength, String pWidth, String pHeight)
	{
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AddTemplates).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(TollCarrierDropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"bu-dropdown-new\"]/div/ul/li/div[text()='"+pTollCarrier+"']")).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(height).click();
		BaseWebdriver.driver.findElement(height).clear();
		BaseWebdriver.driver.findElement(height).sendKeys(pHeight);
		BaseWebdriver.driver.findElement(TemplateNameTextField).click();
		BaseWebdriver.driver.findElement(TemplateNameTextField).clear();
		String TemplateNameUnique=pTemplateName+(new Date()).getTime();
		System.out.println(TemplateNameUnique);
		BaseWebdriver.driver.findElement(TemplateNameTextField).sendKeys(TemplateNameUnique);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(numberOfItem).click();
		BaseWebdriver.driver.findElement(numberOfItem).clear();
		BaseWebdriver.driver.findElement(numberOfItem).sendKeys(pNumberOfItem);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(length).click();
		BaseWebdriver.driver.findElement(length).clear();
		BaseWebdriver.driver.findElement(length).sendKeys(pLength);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(width).click();
		BaseWebdriver.driver.findElement(width).clear();
		BaseWebdriver.driver.findElement(width).sendKeys(pWidth);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(weight).click();
		BaseWebdriver.driver.findElement(weight).clear();
		BaseWebdriver.driver.findElement(weight).sendKeys(pWeight);
		PageBase.MaximumWaitForElementEnabled();
		
		BaseWebdriver.driver.findElement(SaveTemplate).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(CloseNewTemplate).click();
	}
	
	public static void SelectTollCarrier()
	{
		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(TollCarrierDropdown, 5);
		
	}
	
	public static void ClickMenu()
	{
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		
	/*	Wait<WebDriver> wait = new FluentWait<WebDriver>(BaseWebdriver.driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);

			WebElement HmbugerMenu1 = wait.until(new Function<WebDriver, WebElement>() 
			{
			  public WebElement apply(WebDriver driver) {
			  return  driver.findElement(MyTollHomePageActions.HmbugerMenu);
			}
			});*/
			
		PageBase.WaitForElement(MyTollHomePageActions.HmbugerMenu,30);
		PageBase.ClickOn(HmbugerMenu, 5);
	}
	
	public static void ClickBookAPIckupMenu()
	{
		try {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(BookAPickup).click();
		
		}
		catch(Exception ex)
		{
			BaseWebdriver.driver.navigate().refresh();
			PageBase.retryingFindClick(BookAPickup);
		}
			
	}
	
	public static void ClickGetRateEnquiery()
	{
		PageBase.click(getRateEnquiry, 5);
	}

	public static void ClickStationery()
	{
	
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(stationery, 5);
	}
	
	public static void ClickOrderStationery()
	{
		
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(orderMyStationery, 5);
	}
	
	public static void ClickMyOrdersStationery()
	{
		
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(myOrdersStationery, 5);
	}
	
	public static String GetStationery() {
		return PageBase.GetText(stationery, 5);

	}
	
	public static String GetOrderMyStationery() {
		return PageBase.GetText(orderMyStationery, 5);

	}
	
	public static String GetMyOrdersStationery() {
		return PageBase.GetText(myOrdersStationery, 5);

	}
	
	
	public static void NewUserRegistration(String pFirstName, String pLastName, String pNewEmail, String pMobileNumber, String pNewPassword, String pMemerobleAnswer)
	{
		BaseWebdriver.driver.findElement(register).click();
		BaseWebdriver.driver.findElement(firstName).click();
		BaseWebdriver.driver.findElement(firstName).clear();
		BaseWebdriver.driver.findElement(firstName).sendKeys(pFirstName);
		BaseWebdriver.driver.findElement(lastName).click();
		BaseWebdriver.driver.findElement(lastName).clear();
		BaseWebdriver.driver.findElement(lastName).sendKeys(pLastName);
		BaseWebdriver.driver.findElement(newEmailAddress).click();
		BaseWebdriver.driver.findElement(newEmailAddress).clear();
		BaseWebdriver.driver.findElement(newEmailAddress).sendKeys(pNewEmail);
		BaseWebdriver.driver.findElement(mobileNumber).click();
		BaseWebdriver.driver.findElement(mobileNumber).clear();
		BaseWebdriver.driver.findElement(mobileNumber).sendKeys(pMobileNumber);
		BaseWebdriver.driver.findElement(newPassword).click();
		BaseWebdriver.driver.findElement(newPassword).clear();
		BaseWebdriver.driver.findElement(newPassword).sendKeys(pNewPassword);
		PageBase.MoveToElement(MyTollHomePageActions.newPassword,MyTollHomePageActions.mobileNumber);
		BaseWebdriver.driver.findElement(memerobleQuesDropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(memerobleQuesOption).click();
		PageBase.MaximumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(memerobleAnswer).click();
		BaseWebdriver.driver.findElement(memerobleAnswer).clear();
		
		BaseWebdriver.driver.findElement(memerobleAnswer).sendKeys(pMemerobleAnswer);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(robotCheckBox).click();
		BaseWebdriver.driver.findElement(recaptchalable).click();
	}
	
	public static void searchShipment(String ShipmentNo) {
		Reporter.log("User Enters Shipment Number: '" +ShipmentNo+  "' on Trace and Trace");
		PageBase.sendText(trackAndTrace, 2, ShipmentNo );
		PageBase.click(trackAndTraceSearch, 2);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"quickSearchTableResult\"]/tbody/tr/td/div/span[contains(text(),'"+ShipmentNo+"')]"), 5);
		PageBase.MaximumWaitForElementEnabled_1();
	}
	
	public static void ClickAdvanceSearchTab() {
		PageBase.click(advanceSearchTab, 5);

	}
	
	public static void VerifyAdvancedSearchNotDisplay() {
	
		try {
			Boolean results=PageBase.FindElement(advanceSearchTab).isDisplayed();
		assertEquals(results, "false");
		}
		catch(Exception ex)
		{
			assertEquals("true", "true");
		}
			
	}
	
	public static void VerifyTrackAndTraceBtnIsDisplay() {
		
		try {
			Boolean results=PageBase.FindElement(trackAndTraceSearch).isDisplayed();
		assertEquals(results, "true");
		}
		catch(Exception ex)
		{
			assertEquals("true", "fail");
		}
			
	}
	
	public static void VerifyAdvanceSearchResultsDisplayed() {
		
		
		String noResults = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"advScrhNoDataDivCon\"]")).getText();
		System.out.println(noResults);
		if ("No result found.".equals(noResults)){
			Reporter.log("FAILED: No Results Error Msg Available - NOT AS EXPECTED");
			Assert.fail("FAILED: No Results Error Msg Available - NOT AS EXPECTED");
			
		}else{
			Reporter.log("No Results Error Msg Unavailable - AS EXPECTED");
			System.out.println("No Results Error Msg Unavailable - AS EXPECTED");
		}
		
		
		String totalResults = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"advscrhTabContentdiv\"]//*//span[@class=\"total-counter advscrhTotalCounter\"]")).getText();
		System.out.println("Total Search Results =" +totalResults);
		
		PageBase.isElementPresent(By.xpath("//*[@id=\"tblAdvSerhResult\"]/tr[1]"), 5, "Search Result 1st Line");
		
		
	}
		
	

}

