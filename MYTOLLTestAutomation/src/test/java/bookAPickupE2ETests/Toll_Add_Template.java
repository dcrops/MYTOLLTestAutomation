package bookAPickupE2ETests;

import GlobalActions.PageBase;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class Toll_Add_Template {

	public static Integer locationIndex = 4;

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		
	}
	
	
	@Test(priority = 1)
	public void addTemplate() {
		this.add("Global");
	}

	@Test(priority = 2)
	public void addTemplate2() {
		this.add("Toll Intermodal");
	}
	
	@Test(priority = 3)
	public void addTemplate3() {
		this.add("Toll Tasmania");
	}
	
	@Test(priority = 4)
	public void addTemplate4() {
		this.add("Toll NQX | Toll Express");
	}
	
	
	private void add(String Carrier) {
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		PageBase.click(MyTollHomePageActions.templateMenu, 10);
		PageBase.click(BookAPickupActions.addTemplate, 10);
		
		//Select Carrier
		PageBase.click(BookAPickupActions.addTemplateCarrier, 10);
		PageBase.click(By.xpath("//*[@id=\"bu-dropdown-new\"]/div/ul/li/div[text()='"+Carrier+"']"), 10);
		
		//Random Template name
		int Number = (int) (Math.random()*10000);
		String newNumber = String.valueOf(Number);
		String NewTemplateName = "Test"+Carrier+newNumber;

		PageBase.sendText(BookAPickupActions.addTemplateName, 10, NewTemplateName);
		PageBase.sendText(BookAPickupActions.addTemplateQty, 10, "10");
		PageBase.sendText(BookAPickupActions.addTemplateWeight, 10, "10");
		PageBase.sendText(BookAPickupActions.addTemplateLenght, 10, "10");
		PageBase.sendText(BookAPickupActions.addTemplateWidth, 10, "10");
		PageBase.sendText(BookAPickupActions.addTemplateHeight, 10, "10");
		PageBase.click(BookAPickupActions.addTemplateSave, 10);
		PageBase.MaximumWaitForElementEnabled();
		
		//Verify Template Save Successfully
		PageBase.verifyTextExist(BookAPickupActions.addTemplateSaveMsg, "TEMPLATE SUCCESSFULLY SAVED");
		PageBase.click(BookAPickupActions.addTemplateSaveMsgClose, 10);
		PageBase.MaximumWaitForElementEnabled();
		
		
		//Verify Template Exists
		while(PageBase.waitForElement(By.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytolltemplateportlet\"]//*//p[text()='"+NewTemplateName+"']"), 1) == null) {
			PageBase.moveToElement(BookAPickupActions.addTemplateViewMore);
			PageBase.click(BookAPickupActions.addTemplateViewMore, 5);
		}
		PageBase.verifyTextExist(By.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytolltemplateportlet\"]//*//p[text()='"+NewTemplateName+"']"), NewTemplateName);
		
	}
		

	

	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();
		BaseWebdriver.driver.quit();

	}

}
