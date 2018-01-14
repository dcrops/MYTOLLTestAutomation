package myTollHomePageActions;

import GlobalActions.PageBase;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;

import baseWebdriver.BaseWebdriver;


public class MyTollHomePageActions {
	
	
	/* Login */
	
	public static By login=By.id("lnk-login");
	public static By emailAddress=By.id("_com_liferay_login_web_portlet_LoginPortlet_login");
	public static By passwordLable=By.className("_com_liferay_login_web_portlet_LoginPortlet_password");
	public static By password=By.id("_com_liferay_login_web_portlet_LoginPortlet_password");
	public static By loginBtn=By.id("login-btn");
	public static By Name=By.xpath("//*[@id=\"header-right-ctrls\"]/div/ul/li[1]/a[1]");
	public static By MyProfile=By.xpath("//*[@id=\"header-right-ctrls\"]/div/ul/li[1]/ul/li[1]/a"); //.linkText("/group/guest/ups-home-page");
	public static By RegistrationErrorMsg = By.cssSelector("div.yui3-widget-bd");
	
	
	public static By HmbugerMenu=By.xpath("//*[@id=\"nav-opner\"]/i"); 
	public static By Menulist=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[2]/a");
	public static By BookAPickup=By.id("bookaPickup");
	public static By getRateEnquiry=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[2]/a[1]/p");
	public static By templateMenu = By.xpath("//*[@id=\"nav-dropdown\"]//*//span[text()='My templates']");
	public static By myAccountMenu = By.xpath("//*[@id=\"nav-dropdown\"]//span[text()='My accounts']");//*[@id="nav-dropdown"]/ul/li[5]/a/span[2] , //*[@id=\"nav-dropdown\"]//*//span[text()='My Accounts']
	public static By myContactMenu = By.xpath("//*[@id=\"nav-dropdown\"]//span[text()='My contacts']");
	public static By aboutMeMenu = By.xpath("//*[@id=\"nav-dropdown\"]//span[text()='About me']");
	
	//Add Template
	public static By MyTemplates=By.xpath("//a[@href='/group/guest/my-templates']"); //"/group/guest/my-templates");
	public static By AddTemplates=By.linkText("ADD TEMPLATE");
	public static By TollCarrierDropdown=By.xpath("//*[@id=\"bu-dropdown-new\"]/label/a/i");
	public static By TemplateNameTextField=By.xpath("//*[@id=\"newTemplate\"]/div/section/div[2]/div/div/input"); 
	public static By numberOfItem = By.id("addQuantity"); 
	public static By length = By.id("addLength");
	public static By width = By.id("addWidth");
	public static By height = By.id("addHeight");
	public static By weight = By.xpath("//*[@id=\"newTemplate\"]/div/section/div[3]/div[1]/div[2]/div/input"); //.name("templateTotalWight");
	public static By SaveTemplate=By.id("templateSave");//*[@id="response-poup-wrpr"]/div[2]/div/a/i
	public static By CloseNewTemplate=By.xpath("//*[@id=\"response-poup-wrpr\"]/div[2]/div/a/i");
	//*[@id="_userregistrationportlet_WAR_userprofileportlet_userRegForm"]/div[10]/div/label[1]
	
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
	public static By robotCheckBox=By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]"); //*[@id="recaptcha-anchor"]/div[5]
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
	public static By shareShipmentSubmit = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"share-submit\"]");
	public static By shareShipmentEmailAdd = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"share-form-area\"]/div[1]/span/span");
	public static By shareShipmentEmailMaxMsg = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"max-em-used\"]/div");
	public static By shareShipmentEmailSuccessMsg = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*/h3");
	public static By shareShipmentEmailSuccessMsg2 = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*/p");
	public static By shareShipmentEmailSuccessClose = By.xpath("//body//div[@id=\"modal-content-box-0\"]//*[@id=\"close-0\"]");
 

	
	
	public static void LaunchMyToll(String url)
	{
		//cesapaus003.toll.com.au:8080 
		//http://cesapaus003.toll.com.au:8080/group/guest/bookapickup
		BaseWebdriver.driver.get(url);
	}
	
	
	public static void Login(String userName, String pPassword) throws Exception
	{
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.navigate().refresh();
		PageBase.retryingFindClick(login);
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
			BaseWebdriver.tearDown();
			BaseWebdriver.setUp();
			BaseWebdriver.driver.navigate().refresh();
			PageBase.retryingFindClick(login);
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
	
	public static void AddTemplates(String pTollCarrier, String pTemplateName, String pNumberOfItem,String pWeight, String pLength, String pWidth, String pHeight)
	{
		PageBase.MaximumWaitForElementEnabled();
		//BaseWebdriver.driver.findElement(MyProfile).click();
		
	
		BaseWebdriver.driver.findElement(AddTemplates).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(TollCarrierDropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"bu-dropdown-new\"]/div/ul/li/div[text()='"+pTollCarrier+"']")).click();//*[@id="bu-dropdown-new"]/div/ul/li[2]/div
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
		//BaseWebdriver.driver.findElement(TollCarrierDropdown).click();
		PageBase.click(TollCarrierDropdown, 5);
		
	}
	
	public static void ClickMenu()
	{
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		//BaseWebdriver.driver.findElement(HmbugerMenu).click();
		PageBase.click(HmbugerMenu, 5);
		//BaseWebdriver.driver.findElement(Menulist).click();
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
		//BaseWebdriver.driver.findElement(getRateEnquiry).click();
		PageBase.click(getRateEnquiry, 5);
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
	
	

}

