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

public class Toll_IntermodalTest {

	
	public static Integer locationIndex=4;

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	@Test(priority = 1)

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Refrigeration() {

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		// Select Toll Intermodal
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		BookAPickupActions.EnterTollCarrierItem("Toll Intermodal");
		///bookAPickupActions.BookAPickupActions.SelectTollCarrier1(6);
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Intermodal");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Verification and enter data for Quick entry mode, service(Refrigeration),
		// Mode(=Road)
		

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15");
		//BookAPickupActions.Selectservice(4);
		BookAPickupActions.EnterService("Refrigeration");
		BookAPickupActions.EnterItem("Automation Temp1");

		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

		//BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");

		BookAPickupActions.SelectDestination("melb");

		// BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		// BookAPickupActions.SelectMode(); defect

		BookAPickupActions.EnterTempretureRefBookinNumbers("10", "20", "123", "456");
		BookAPickupActions.EnterVendorDetails("12365544");
		BookAPickupActions.EnterTimeSlot();
		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();

		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		BookAPickupActions.selectReadyTime();
		
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		
		BookAPickupActions.ClickReviewBook();
		
		PageBase.MaximumWaitForElementEnabled();
		
		// Verify Review Your Pickup
		/*
		ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();
	
		ReviewYouPickupActions.verifyTollCarrier("Toll Intermodal");
		
		ReviewYouPickupActions.verifyPhoneNumber();
		ReviewYouPickupActions.verifyPickupDate();
		// ReviewYouPickupActions.verifyReadyTime();
		// ReviewYouPickupActions.verifyClosingTime();
		ReviewYouPickupActions.verifySpecialInstructions();
		ReviewYouPickupActions.verifyItemDescription();
		ReviewYouPickupActions.verifyNumberofItems();
		ReviewYouPickupActions.verifyLengthWidthHeight();
		ReviewYouPickupActions.verifyVolume();
		ReviewYouPickupActions.verifyWeight();*/

		ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		/*ReviewYouPickupActions.VerifyConfirmPickupDetails();*/

	}

	@Test(priority = 2)

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Refrigeration_ConfirmedDetails() {

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		// Select Toll Intermodal
		PageBase
				.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(6);
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Intermodal");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		

		// Verification and enter data for Quick entry mode, service(Refrigeration),
		// Mode(=Road)
		

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.Selectservice(4);
		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");

		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");

		BookAPickupActions.SelectDestination("melb");

		BookAPickupActions.EnterTempretureRefBookinNumbers("10", "20", "123", "456");
		BookAPickupActions.EnterVendorDetails("12365544");
		BookAPickupActions.EnterTimeSlot();
		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();

		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		BookAPickupActions.selectReadyTime();
		
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();

		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup
		ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		/*ReviewYouPickupActions.VerifyConfirmPickupDetails();*/

	}

	@Test(priority = 3)

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_DGFreight() {

		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(6);
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Intermodal");
	
		BookAPickupActions.SelectLocation2(locationIndex);
	

		// Verification and enter data for Quick entry mode, service(=Refrigeration),
		// Mode(=Road)
		
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.Selectservice(1);

		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

		BookAPickupActions.SelectDestination("melb");

		BookAPickupActions.SelectModeItem(2);

		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.selectContainFoodItem();
	
		// Shipment contain Dangerous goods=yes and no food items
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(1, "1234", "Test Dg packaging description", "123", "456");
		jse.executeScript("scroll(500, 800)");
		
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();

		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Verify Review Your Pickup
	    ReviewYouPickupActions.verifyReviewYourPickupScreenHeadings();
		ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();
		
		ReviewYouPickupActions.verifyTollCarrier("Toll Intermodal");
		
		ReviewYouPickupActions.verifyPhoneNumber();
		ReviewYouPickupActions.verifyPickupDate();
	  
		ReviewYouPickupActions.verifyClosingTime();
		ReviewYouPickupActions.verifySpecialInstructions();
		ReviewYouPickupActions.verifyItemDescription();
		ReviewYouPickupActions.verifyNumberofItems();
		ReviewYouPickupActions.verifyLengthWidthHeight();
		ReviewYouPickupActions.verifyVolume();
		ReviewYouPickupActions.verifyWeight();

		ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test(priority = 4)

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_DGFreight_ConfirmedDetails() {

		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(6);
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Intermodal");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Verification and enter data for Quick entry mode, service(=Refrigeration),
		// Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.Selectservice(1);

		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		

		BookAPickupActions.SelectDestination("melb");

		BookAPickupActions.SelectModeItem(2);

		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(200, 500)");
		
		// Shipment contain Dangerous goods=yes and no food items
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(1, "1234", "Test Dg packaging description", "123", "456");
		
		//Pickup details
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();

		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup

		ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		/*ReviewYouPickupActions.VerifyConfirmPickupDetails();*/

	}

	@Test(priority = 5)

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Express() {

		// Select Toll Intermodal 

		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(6);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Intermodal");
		
		String accountNumber = BookAPickupActions.GetAccountNumber();
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Verification and enter data for Quick entry mode, service(=Express),
		// Mode(=Road)

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.Selectservice(2); // Express

		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.EnterPalletSpace("6");
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		BookAPickupActions.SelectModeItem(1);
		BookAPickupActions.SelectChargeToAccount2(1);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.service), 10);
		BookAPickupActions.SelectDestination("melb");
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");

		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Verify Review Your Pickup
		
		/*ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();
		ReviewYouPickupActions.verifyTollCarrier("Toll Intermodal");
		
		ReviewYouPickupActions.verifyPickupDate();
		ReviewYouPickupActions.verifyReadyTime();
		
		ReviewYouPickupActions.verifySpecialInstructions();
		ReviewYouPickupActions.verifyItemDescription();
		ReviewYouPickupActions.verifyNumberofItems();
		ReviewYouPickupActions.verifyLengthWidthHeight();
		ReviewYouPickupActions.verifyVolume();
		ReviewYouPickupActions.verifyWeight();*/

		ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test(priority = 6)

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Express_ConfirmedDetails() {

		// Select Toll Intermodal

		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(6);


		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Intermodal");
		//BookAPickupActions.VerifyAccountnumber1();
		String accountNumber = BookAPickupActions.GetAccountNumber();
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Verification and enter data for Quick entry mode, service(=Express),
		// Mode(=Road)

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.Selectservice(2); // Express

		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.EnterPalletSpace("6");
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		BookAPickupActions.SelectModeItem(1);
		BookAPickupActions.SelectChargeToAccount2(1);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.service), 10);
		BookAPickupActions.SelectDestination("melb");
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");

		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup
		ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test(priority = 7)

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_General() {

		// Select Toll Intermodal
		BookAPickupActions.SelectTollCarrier1(6);
		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Intermodal");
		BookAPickupActions.VerifyAccountnumber1();
		
		BookAPickupActions.SelectLocation2(locationIndex);
	
		// Verification and enter data for Quick entry mode, service(=General),
		// Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.Selectservice(3); // General

		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
	
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectDestination("melb");

		BookAPickupActions.SelectModeItem(3);

		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();

		jse.executeScript("scroll(500, 800)");

		// Add a new item
		BookAPickupActions.AddANewLine(); // defect
		BookAPickupActions.EnterVendorDetails("12365544");
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Verify Review Your Pickup

		/*ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();
		ReviewYouPickupActions.verifyTollCarrier("Toll Intermodal");
		
		ReviewYouPickupActions.verifyPhoneNumber();
		ReviewYouPickupActions.verifyPickupDate();
		ReviewYouPickupActions.verifySpecialInstructions();
		ReviewYouPickupActions.verifyItemDescription();
		ReviewYouPickupActions.verifyNumberofItems();
		ReviewYouPickupActions.verifyLengthWidthHeight();
		ReviewYouPickupActions.verifyVolume();
		ReviewYouPickupActions.verifyWeight();*/

		// Verify item details
		ReviewYouPickupActions.VerifyItemDetails();
		jse.executeScript("scroll(800, 1000)");
		ReviewYouPickupActions.VerifyNewItemDetails();

		ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test(priority = 8)

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_General_ConfirmedDetails() {

		// Select Toll Intermodal
		BookAPickupActions.SelectTollCarrier1(6);
		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Intermodal");
		BookAPickupActions.VerifyAccountnumber1();
		
		BookAPickupActions.SelectLocation2(locationIndex);
	

		// Verification and enter data for Quick entry mode, service(=General),
		// Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.Selectservice(3); // General

		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectDestination("melb");

		BookAPickupActions.SelectModeItem(3);

		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();

		jse.executeScript("scroll(500, 800)");

		// Add a new item
		BookAPickupActions.AddANewLine(); // defect
		BookAPickupActions.EnterVendorDetails("12365544");
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup

		ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();

	}

}
