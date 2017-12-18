package GenericTests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class ShareShipment {
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
	}
	

	@Test
	@Parameters({"ShipmentNo"})
	public void UserShareShipment(String ShipmentNo) {
		String handle1= BaseWebdriver.driver.getWindowHandle();
		System.out.println(handle1);
		PageBase.sendText(MyTollHomePageActions.trackAndTrace, 2, ShipmentNo );
		PageBase.click(MyTollHomePageActions.trackAndTraceSearch, 2);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"quickSearchTableResult\"]/tbody/tr/td/div/span[contains(text(),'"+ShipmentNo+"')]"), 5);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.shareShipment, 2);
		PageBase.MaximumWaitForElementEnabled_1();
		//PageBase.sendText(MyTollHomePageActions.shareShipmentEmail, 5, "s@s.com");
		
		//BaseWebdriver.driver.findElement(MyTollHomePageActions.shareShipmentEmail).sendKeys("s@s.com");
		//BaseWebdriver.driver.findElement(MyTollHomePageActions.shareShipmentEmail).submit();;
		
		
//		WebElement element = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"share-submit\"]"));
//		Actions action = new Actions(BaseWebdriver.driver);
//		 
//        action.moveToElement(element);
//        action.
        
		// for (String handle : BaseWebdriver.driver.getWindowHandles()) {
		
		BaseWebdriver.driver.switchTo().frame(0);
		String handle= BaseWebdriver.driver.getWindowHandle();
		System.out.println(handle);
		//BaseWebdriver.driver.switchTo().frame(1);
		BaseWebdriver.driver.switchTo().activeElement();
		BaseWebdriver.driver.findElement(MyTollHomePageActions.shareShipmentSubmit).click();
		
		
		
		//WebElement element = BaseWebdriver.driver.findElement(By.xpath("//*[@class=\"modal-content-overlay\"]"));
		//String handle= BaseWebdriver.driver.getWindowHandle();
		//System.out.println(handle);
		//PageBase.sendText(By.xpath("//body//div[@id=\"modal-content-overlay-0\"]/div[1]/div[2]/div[1]/div[2]/div[@id=\"share-form-area\"]/div[5]/button[1]"), 2, "sss@ss.com");
		
		PageBase.click(MyTollHomePageActions.shareShipmentSubmit, 2);
		
		//*[@id="shareShipment"]/i[1]
		//String a = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"quickSearchTableResult\"]/tbody/tr[3]/td[1]/div/span[2]")).getText();
		//System.out.println(a);
		
		//*[@id="quickSearchTableResult"]/tbody/tr[3]/td[1]/div/span[2]
	}

	
	
	@AfterMethod
	public void RunTearDown() throws Exception {
//		/BaseWebdriver.tearDown();

	}
}
