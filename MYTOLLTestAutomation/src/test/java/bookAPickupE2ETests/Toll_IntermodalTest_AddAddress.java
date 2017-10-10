package bookAPickupE2ETests;

import GlobalActions.PageBase;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

import GlobalActions.GlobalConstants;

public class Toll_IntermodalTest_AddAddress implements GlobalConstants {

	public static Integer locationIndex = 4;
	
	
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		//MyTollHomePageActions.ClickMenu();
		//MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	@Test(priority = 1)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Refrigeration(String TollCarrier,
			String ServiceRefrigeration, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns) {

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		// Select Toll Intermodal
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		//Select Account
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		bookAPickupActions.BookAPickupActions.addAdderess();
		
	}
	
	

	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();
		BaseWebdriver.driver.quit();

	}

}
