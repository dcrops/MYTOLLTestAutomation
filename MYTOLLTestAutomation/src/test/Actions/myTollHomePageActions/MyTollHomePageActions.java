package myTollHomePageActions;

import GlobalActions.PageBase;
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
	
	public static By HmbugerMenu=By.xpath("//*[@id=\"nav-opner\"]/i"); 
	public static By Menulist=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[2]/a");
	public static By BookAPickup=By.id("bookaPickup");
	public static By getRateEnquiry=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[2]/a[1]/p");
	public static By MyDashboard=By.xpath("//*[@id=\"nav-dropdown\"]/ul/li[1]/a/p");
	public static By myManifest=By.id("manifestTabAnchor");
	public static By manualManifest=By.xpath("//*[@id=\"manifestHasMoreDiv\"]/button[2]");
	
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

