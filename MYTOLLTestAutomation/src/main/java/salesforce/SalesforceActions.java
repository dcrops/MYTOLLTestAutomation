package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import global.PageBase;
import baseWebdriver.BaseWebdriver;

public class SalesforceActions {
	
	public static By userName = By.id("username");
	public static By password = By.id("password");
	public static By loginBtn = By.id("Login");
	public static By location = By.xpath("//*[@id=\"oneHeader\"]/div[3]/div/div[1]/div[2]/a/span"); 
	public static By searchTextField = By.xpath("//*[@id=\"436:0\"]"); 
	public static By bookings=By.xpath("//*[@id=\"brandBand_1\"]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[4]/div[1]/div/div[1]/h2/a");
	public static By bookingReference=By.xpath("//*[@id=\"brandBand_1\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div/table/tbody/tr/th/span/a"); 
	
	public static void LoginSalesforce(String username, String pPassword)
	{
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();//*[@id="3855:0"]/div/div/table/tbody/tr/th/span/a  //*[@id="3855:0"]/div/div/table/tbody/tr/th/span/a
		PageBase.SendKeysTo(userName, username, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(password, pPassword, 10);//*[@id="brandBand_1"]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div/table/tbody/tr/th/span/a
		PageBase.retryingFindClick(loginBtn);
		PageBase.MaximumWaitForElementEnabled();
		
	}
	
	public static void searchPickup(String pickupReference) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(searchTextField, pickupReference, 10);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(searchTextField).sendKeys(Keys.ENTER);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
	}

	public static void ClickLocation() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(location, 5);
	}
	
	public static void ClickSearchResultsNumber() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(bookings, 5);
		PageBase.MaximumWaitForElementEnabled();
	//	BaseWebdriver.driver.findElement(bookings).sendKeys(Keys.TAB);
	//	PageBase.ClickOn(bookingReference, 5);
		//BaseWebdriver.driver.findElement(bookingReference).sendKeys(Keys.TAB);
		//BaseWebdriver.driver.findElement(bookingReference).sendKeys(Keys.TAB);
		
	}
	
	/*public static String GetSearchResultsNumber() {
		return PageBase.GetText(searchResultsNumber, 10);
		
	}*/
}
