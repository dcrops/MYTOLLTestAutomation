
package bookAPickupE2ETests;

import GlobalActions.PageBase;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import manifestActions.ManifestActions;

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
import reviewYourPickupActions.ReviewYourPickupActions;

public class Toll_Add_Template {

	public static Integer locationIndex = 4;
	public static String NewTemplateName;
	
	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername4, BaseWebdriver.Password);
		
	}
	
	@Test(groups = { "Shakeout Testing" })
	@Parameters({"TollCarrierTollIPEC", "ServiceRoadExpress","NumberOfItems","Length", "Width", "Height", "Weight", "OriginSuburb","OriginPostCode", "DesSuburb", "DesPostCode"})
	public void addTemplateIPEC(String Carrier, String Service, String NumberOfItems, String Length, String Width,String Height, String Weight, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		this.addTemplate(Carrier, NumberOfItems, Length, Width, Height, Weight);
		this.checkRateEnquiry(Carrier, Service, NumberOfItems, Length, Width, Height, Weight, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
		this.checkCreateShipmentPage(Carrier, Service, NumberOfItems, Length, Width, Height, Weight);
		this.deleteTemplate(Carrier);
	}

	
	@Test
	@Parameters({"TollCarrierTollTasmania", "ServiceGeneral","NumberOfItems","Length", "Width", "Height", "Weight", "OriginSuburb","OriginPostCode", "TTDesSuburb", "TTDesPostCode"})
	public void addTemplateTTAS(String Carrier, String Service, String NumberOfItems, String Length, String Width,String Height, String Weight, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		this.addTemplate(Carrier, NumberOfItems, Length, Width, Height, Weight);
		this.checkRateEnquiry(Carrier, Service, NumberOfItems, Length, Width, Height, Weight, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
		this.checkCreateShipmentPage(Carrier, Service, NumberOfItems, Length, Width, Height, Weight);
		this.deleteTemplate(Carrier);
	}
	
	
	@Test(groups = { "Shakeout Testing" })
	@Parameters({"TollIntermodalSpecialised", "ServiceGeneral","NumberOfItems","Length", "Width", "Height", "Weight", "OriginSuburb","OriginPostCode", "DesSuburb", "DesPostCode"})
	public void addTemplateTollIntermodalSpecialised(String Carrier, String Service, String NumberOfItems, String Length, String Width,String Height, String Weight, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		this.addTemplate(Carrier, NumberOfItems, Length, Width, Height, Weight);
		this.checkRateEnquiry(Carrier, Service, NumberOfItems, Length, Width, Height, Weight, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
		this.checkCreateShipmentPage(Carrier, Service, NumberOfItems, Length, Width, Height, Weight);
		this.deleteTemplate(Carrier);
	}
	
	
	@Test(groups = { "Shakeout Testing" })
	@Parameters({"TollCarrierTollPrioAU", "ServiceParcelsOffPeak","NumberOfItems","Length", "Width", "Height", "Weight", "OriginSuburb","OriginPostCode", "DesSuburb", "DesPostCode"})
	public void addTemplatePrioAus(String Carrier, String Service, String NumberOfItems, String Length, String Width,String Height, String Weight, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		this.addTemplate(Carrier, NumberOfItems, Length, Width, Height, Weight);
		this.checkRateEnquiry(Carrier, Service, NumberOfItems, Length, Width, Height, Weight, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
		this.checkCreateShipmentPage(Carrier, Service, NumberOfItems, Length, Width, Height, Weight);
		this.deleteTemplate(Carrier);
	}
	
	
	@Test
	@Parameters({"TollCarrierTollPrioNZ", "ServiceParcelsOffPeak","NumberOfItems","Length", "Width", "Height", "Weight", "TNZOriginSuburb","TNZOriginPostCode", "TNZDesSuburb", "TNZDesPostCode"})
	public void addTemplatePrioNZ(String Carrier, String Service, String NumberOfItems, String Length, String Width,String Height, String Weight, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		this.addTemplate(Carrier, NumberOfItems, Length, Width, Height, Weight);
		this.checkRateEnquiry(Carrier, Service, NumberOfItems, Length, Width, Height, Weight, OriginSuburb, OriginPostCode, DesSuburb, DesPostCode);
		this.checkCreateShipmentPage(Carrier, Service, NumberOfItems, Length, Width, Height, Weight);
		this.deleteTemplate(Carrier);
	}
 	
	
	
	//.......TEMPLATE METHODS BELOW..................................................................///
	
	//Method to Add Template
	private void addTemplate(String Carrier, String NumberOfItems, String Length, String Width,String Height, String Weight) {
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Templates Page");
		PageBase.click(MyTollHomePageActions.templateMenu, 10);
		Reporter.log("User Clicks Add Template");
		PageBase.click(BookAPickupActions.addTemplate, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		
		//Select Carrier
		Reporter.log("User Selectors Toll Carrier");
		PageBase.click(BookAPickupActions.addTemplateCarrier, 10);
		PageBase.click(By.xpath("//*[@id=\"bu-dropdown-new\"]/div/ul/li/div[contains(text(),'"+Carrier+"')]"), 10);
		
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
		PageBase.MaximumWaitForElementEnabled_1();
		
		//Verify Template Save Successfully
		PageBase.verifyTextExist(BookAPickupActions.addTemplateSaveMsg, "TEMPLATE SUCCESSFULLY SAVED");
		PageBase.click(BookAPickupActions.addTemplateSaveMsgClose, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		
		//User Filters Carriers
		PageBase.click(BookAPickupActions.addTemplateCarrierSelector, 5);
		PageBase.click(By.xpath("//*[@id=\"grid-carrier-dropdown\"]//*//div[contains(text(),'"+Carrier+"')]"),5);
		
		//Verify Template Exists
		Reporter.log("User Verifies if New Template Exits");  
		try {
			PageBase.MaximumWaitForElementEnabled(); 
			while(PageBase.waitForElement(By.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytollupsportlet\"]//*//p[text()='"+NewTemplateName+"']"), 1) == null) {
				
				PageBase.moveToElement(BookAPickupActions.addTemplateViewMore);
				
				PageBase.click(BookAPickupActions.addTemplateViewMore, 5);
				
			}
			PageBase.verifyTextExist(By.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytollupsportlet\"]//*//p[text()='"+NewTemplateName+"']"), NewTemplateName);
			Reporter.log("New Template : "+NewTemplateName+ " Exists");
			System.out.println("New Template : "+NewTemplateName+ " Exists");
		}
		catch (Exception e) {
			Reporter.log("FAILED: New Template : "+NewTemplateName+ " Does Not Exists");
			Assert.fail("FAILED: New Template : "+NewTemplateName+ " Does Not Exists");
		}
		

		
	}
	
	
	//...............................................................................................///	
	
	
	//Method to Verify if Template Exists on Rate Enquiry
	private void checkRateEnquiry(String Carrier, String Service,String NumberOfItems, String Length, String Width,String Height, String Weight, String OriginSuburb,String OriginPostCode, String DesSuburb, String DesPostCode) {
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to Rate Enquiry Page to Verify Template");
		MyTollHomePageActions.ClickGetRateEnquiery();
		RateEnquiryActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterService(Service);
		BookAPickupActions.SelectAccountNumber1();
		RateEnquiryActions.SelectOrigin(OriginSuburb, OriginPostCode);
		RateEnquiryActions.SelecDestination(DesSuburb, DesPostCode);
		
		//User Enters Template Details and verifies line item
		RateEnquiryActions.EnterItem(NewTemplateName);
		PageBase.click(By.xpath("//*[@id=\"freight-type-selector\"]//*//div[text()='"+NewTemplateName+"']"), 5);
		RateEnquiryActions.verifyNoOfItemsLengthWidthHeightVolumeWeight(NumberOfItems, Length, Width, Height, Weight);
		
	}

	
	//...............................................................................................///	
	
	
	//Method to Verify if Template Exists on Create Shipment
	private void checkCreateShipmentPage (String Carrier, String Service, String NumberOfItems, String Length, String Width,String Height, String Weight) {	
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to Create Shipment Page to Verify Template"); 
		CreateShipmentActions.ClickShipment();
		//BookAPickupActions.EnterTollCarrier(Carrier);
		RateEnquiryActions.EnterTollCarrier(Carrier);
		CreateShipmentActions.EnterService(Service);
		CreateShipmentActions.SelectWhoPays(1);
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(1);
		ManifestActions.SelectShipmentConsolidated();
		
		//User Enters Template Details and verifies line item
		RateEnquiryActions.EnterItem(NewTemplateName);
		PageBase.click(By.xpath("//*[@id=\"freight-type-selector\"]//*//div[text()='"+NewTemplateName+"']"), 5);
		CreateShipmentActions.verifyNoOfItemsLengthWidthHeightVolumeWeight(NumberOfItems, Length, Width, Height, Weight);
		
		BookAPickupActions.SelectDangerousGoods(2);
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	
	//...............................................................................................///	
	
	//Method to Delete the new template created
	private void deleteTemplate(String Carrier) {
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Templates Page back again to Delete the new Template");
		PageBase.click(MyTollHomePageActions.templateMenu, 10);
		
		//User Filters Carriers
		PageBase.click(BookAPickupActions.addTemplateCarrierSelector, 5);
		PageBase.click(By.xpath("//*[@id=\"grid-carrier-dropdown\"]//*//div[contains(text(),'"+Carrier+"')]"),5);
		
		try {
			while(PageBase.waitForElement(By.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytollupsportlet\"]//*//p[text()='"+NewTemplateName+"']"), 1) == null) {
				PageBase.moveToElement(BookAPickupActions.addTemplateViewMore);
				PageBase.click(BookAPickupActions.addTemplateViewMore, 5);
			}
		}
		catch (Exception e) {
			Reporter.log("FAILED: New Template : "+NewTemplateName+ " Does Not Exists");
			Assert.fail("FAILED: New Template : "+NewTemplateName+ " Does Not Exists");
		}

		//User Deletes New Account Created
		PageBase.MaximumWaitForElementEnabled();
		Reporter.log("User Deletes New Template Template");
		PageBase.click(By.xpath("//*[@id=\"portlet_mytolltemplateportlet_WAR_mytollupsportlet\"]//*//p[text()='"+NewTemplateName+"']/following::div[@class='template-col delete']/a"), 5);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.addAccountDeleteMsg, "Are you sure you want to delete template?");
		PageBase.click(BookAPickupActions.addAccountDeleteContinue, 5);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.addAccountDeleteSuccessfull, "Template Successfully Deleted");
		PageBase.click(BookAPickupActions.addAccountDeleteClose, 5);
	}

	

	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();
	}

}

