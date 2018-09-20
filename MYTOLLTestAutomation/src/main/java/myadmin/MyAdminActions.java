package myadmin;

import org.openqa.selenium.By;

import global.PageBase;

public class MyAdminActions 
{
	public static By Username = By.id("username");
	public static By TollCarrier = By.id("businessUnit");
	public static By SettingType = By.id("setting-dropdown");
	
	
	public static void VerifyUserSettingsPageLoaded()
	{
		PageBase.click(TollCarrier, 10);
	}
}
