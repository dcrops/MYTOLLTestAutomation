package myTollHomePageActions;

import GlobalActions.PageBase;

import java.util.Date;

import org.openqa.selenium.By;
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
	
	
	public static By HmbugerMenu=By.xpath("//*[@id=\"nav-opner\"]/i"); 
	public static By Menulist=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[2]/a");
	public static By BookAPickup=By.id("bookaPickup");
	public static By getRateEnquiry=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[2]/a[1]/p");
	public static By templateMenu = By.xpath("//*[@id=\"nav-dropdown\"]//*//span[text()='My Templates']");
	public static By myAccountMenu = By.xpath("//*[@id=\"nav-dropdown\"]//span[text()='My accounts']");//*[@id="nav-dropdown"]/ul/li[5]/a/span[2] , //*[@id=\"nav-dropdown\"]//*//span[text()='My Accounts']
	
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
	

	
	public static void LaunchMyToll(String url)
	{
		//cesapaus003.toll.com.au:8080 
		//http://cesapaus003.toll.com.au:8080/group/guest/bookapickup
		BaseWebdriver.driver.get(url);
	}
	
	
	public static void Login(String userName, String pPassword)
	{
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(login).click();
		BaseWebdriver.driver.findElement(emailAddress).sendKeys(userName);
		BaseWebdriver.driver.findElement(password).sendKeys(pPassword);
		BaseWebdriver.driver.findElement(loginBtn).click();
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
		BaseWebdriver.driver.findElement(TollCarrierDropdown).click();
		
	}
	
	public static void ClickMenu()
	{
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(HmbugerMenu).click();
		//BaseWebdriver.driver.findElement(Menulist).click();
	}
	
	public static void ClickBookAPIckupMenu()
	{
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(BookAPickup).click();
		
	}
	
	public static void ClickGetRateEnquiery()
	{
		BaseWebdriver.driver.findElement(getRateEnquiry).click();
		
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

}

