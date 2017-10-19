package myTollHomePageActions;

import GlobalActions.PageBase;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

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
	public static By MyDashboard=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[1]/a/p");
	public static By myManifest=By.id("manifestTabAnchor");
	public static By manualManifest=By.xpath("//*[@id=\"manifestHasMoreDiv\"]/button[2]");
	
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
		BaseWebdriver.driver.findElement(HmbugerMenu).click();
		//BaseWebdriver.driver.findElement(Menulist).click();
	}
	
	public static void ClickBookAPIckupMenu()
	{
		BaseWebdriver.driver.findElement(BookAPickup).click();
		
	}
	
	public static void ClickGetRateEnquiery()
	{
		BaseWebdriver.driver.findElement(getRateEnquiry).click();
		
	}
	public static void ClickMyDashboard()
	{
		BaseWebdriver.driver.findElement(MyDashboard).click();
		
	}
		
	public static void ClickMyManifest()
	{
		BaseWebdriver.driver.findElement(myManifest).click();
		
	}
	
	public static boolean ClickManualManifest()
	{
		
		try {
		Boolean results=false;
		while (results=true)
	   {
		results =BaseWebdriver.driver.findElement(myManifest).isDisplayed();
		if (results=false)
		{
			PageBase.Scrollbar(250, 500);
			results =BaseWebdriver.driver.findElement(myManifest).isDisplayed();
		}
		}
		//return results;
		
		}
				
		catch (Exception ex)
		{
			
		}
		return false;
		
		
	}
}

