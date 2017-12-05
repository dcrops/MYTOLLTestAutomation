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
import rateEnquiryActions.RateEnquiryActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class Toll_Add_Template {

	public static Integer locationIndex = 4;
	public static String NewTemplateName ="ipectest124";
	
	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		
	}
	
	@Test
	@Parameters({"TollCarrierTollIPEC", "ServiceRoadExpress","NumberOfItems","Length", "Width", "Height", "Weight", "OriginSuburb","OriginPostCode", "DesSuburb", "DesPostCode"})
	public void addTemplateIPECS(String Carrier, String Service, String NumberOfItems, String Length, String Width,String Height, String Weight, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		//this.addTemplate(Carrier);
		this.checkRateEnquiry(Carrier, Service, NumberOfItems, Length, Width, Height, Weight, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
	}

/*	@Test
	public void addTemplateTSPD() {
		this.addTemplate("Toll Intermodal");
	}
	

	@Test
	public void addTemplateTTAS() {
		this.addTemplate("Toll Tasmania");
	}

	@Test
	public void addTemplateTNQX() {
		this.addTemplate("Toll NQX | Toll Express");
	}
	
	@Test
	public void addTemplatePrioAus() {
		this.addTemplate("Toll Priority (Aus)");
	}
	
	@Test
	public void addTemplatePrioNZ() {
		this.addTemplate("Toll Priority (NZ)");
	}*/
	
	
	private void addTemplate(String Carrier, String NumberOfItems, String Length, String Width,String Height, String Weight) {
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Templates Page");
		PageBase.click(MyTollHomePageActions.templateMenu, 10);
		Reporter.log("User Clicks Add Template");
		PageBase.click(BookAPickupActions.addTemplate, 10);
		PageBase.MaximumWaitForElementEnabled();
		
		//Select Carrier
		Reporter.log("User Selectors Toll Carrier");
		PageBase.click(BookAPickupActions.addTemplateCarrier, 10);
		PageBase.click(By.xpath("//*[@id=\"bu-dropdown-new\"]/div/ul/li/div[text()='"+Carrier+"']"), 10);
		
		//Random Template name
		int Number = (int) (Math.random()*10000);
		String newNumber = String.valueOf(Number);
		NewTemplateName = "Test "+Carrier+newNumber;

		Reporter.log("User Enters Template Name - "+NewTemplateName);
		PageBase.sendText(BookAPickupActions.addTemplateName, 10, NewTemplateName);
		Reporter.log("User Enters Line Items (No. of Items, Weight and Dimensions)");
		PageBase.sendText(BookAPickupActions.addTemplateQty, 10, NumberOfItems);
		PageBase.sendText(BookAPickupActions.addTemplateWeight, 10, Weight);
		PageBase.sendText(BookAPickupActions.addTemplateLenght, 10, Length);
		PageBase.sendText(BookAPickupActions.addTemplateWidth, 10, Width);
		PageBase.sendText(BookAPickupActions.addTemplateHeight, 10, Height);
		Reporter.log("User Clicks Save");
		PageBase.click(BookAPickupActions.addTemplateSave, 10);
		PageBase.MaximumWaitForElementEnabled();
		
		//Verify Template Save Successfully
		PageBase.verifyTextExist(BookAPickupActions.addTemplateSaveMsg, "TEMPLATE SUCCESSFULLY SAVED");
		PageBase.click(BookAPickupActions.addTemplateSaveMsgClose, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		
		//User Filters Carriers
		PageBase.click(BookAPickupActions.addTemplateCarrierSelector, 5);
		PageBase.click(By.xpath("//*[@id=\"grid-carrier-dropdown\"]//*//div[text()='"+Carrier+"']"),5);
		
		//Verify Template Exists
		Reporter.log("User Verifies if New Template Exits");
		try {
			while(PageBase.waitForElement(By.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytolltemplateportlet\"]//*//p[text()='"+NewTemplateName+"']"), 1) == null) {
				PageBase.moveToElement(BookAPickupActions.addTemplateViewMore);
				PageBase.click(BookAPickupActions.addTemplateViewMore, 5);
			}
			PageBase.verifyTextExist(By.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytolltemplateportlet\"]//*//p[text()='"+NewTemplateName+"']"), NewTemplateName);
			Reporter.log("New Template : "+NewTemplateName+ " Exists");
			System.out.println("New Template : "+NewTemplateName+ " Exists");
		}
		catch (Exception e) {
			Reporter.log("FAILED: New Template : "+NewTemplateName+ " Does Not Exists");
			Assert.fail("FAILED: New Template : "+NewTemplateName+ " Does Not Exists");
		}
		
//		//User Deletes New Account Created
//		PageBase.MaximumWaitForElementEnabled();
//		Reporter.log("User Deletes New Template Template");
//		PageBase.click(By.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytolltemplateportlet\"]//*//p[text()='"+NewTemplateName+"']/following::div[@class='template-col delete']/a"), 5);
//		PageBase.MaximumWaitForElementEnabled();
//		PageBase.verifyTextExist(BookAPickupActions.addAccountDeleteMsg, "Are you sure you want to delete template?");
//		PageBase.click(BookAPickupActions.addAccountDeleteContinue, 5);
//		PageBase.MaximumWaitForElementEnabled();
//		PageBase.verifyTextExist(BookAPickupActions.addAccountDeleteSuccessfull, "Template Successfully Deleted");
//		PageBase.click(BookAPickupActions.addAccountDeleteClose, 5);
		
	}
		
	
	
	private void checkRateEnquiry(String Carrier, String Service,String NumberOfItems, String Length, String Width,String Height, String Weight, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickGetRateEnquiery();
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		//RateEnquiryActions.EnterAccountNumberAndSelect(AccountNo);
		
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		RateEnquiryActions.EnterItem(NewTemplateName);
		//*[@id="freight-type-selector"]//*//div[@text='NewTemplateName']
		PageBase.click(By.xpath("//*[@id=\"freight-type-selector\"]//*//div[text()='"+NewTemplateName+"']"), 5);
		
		RateEnquiryActions.verifyLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		
	}

	

	@AfterMethod
	public void RunTearDown() throws Exception {
		 //BaseWebdriver.tearDown();
	}

}
