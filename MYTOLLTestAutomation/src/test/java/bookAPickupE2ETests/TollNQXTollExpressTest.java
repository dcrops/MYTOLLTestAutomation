package bookAPickupE2ETests;

import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class TollNQXTollExpressTest {
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
	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_DangerousGoods() {

		// Select Toll NQX|Toll Express
		BookAPickupActions.SelectTollCarrier1(2); 
		
		BookAPickupActions.SelectAccountNumber1();
		
		
		// Verification of Book A Pickup screen, Toll Carrier,Account number,
		// name,phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll NQX | Toll Express");
		
		BookAPickupActions.SelectLocation2(locationIndex);
	
		
		// Enter data for Quick entry mode, service(=DGExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(500, 1200)");
		BookAPickupActions.EnterService("Dangerous Goods");
		
		// BookAPickupActions.SelectMode();
		BookAPickupActions.SelectChargeToAccount2(1);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

		BookAPickupActions.EnterQuantity("15");

		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.SelectDestination("melb");
		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(1000, 1500)");

		// Shipment contain Dangerous goods=yes and no food items
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details
		//BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails("1234", "Test Dg packaging description", "123", "456");
		// Enter Pickup details
		jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test(priority = 2)
	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_Express() {

		// Select Toll NQX|Toll Express
		BookAPickupActions.SelectTollCarrier1(2);
		
		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier,Account number,
		// name,phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll NQX | Toll Express");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Enter data for Quick entry mode, service(=DGExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(500, 1200)");

		BookAPickupActions.EnterService("Express");
		// BookAPickupActions.SelectMode();
		BookAPickupActions.SelectChargeToAccount2(1);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

		BookAPickupActions.EnterQuantity("15");

		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.SelectDestination("melb");
		
		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test(priority = 3)
	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_General() {

		// Select Toll NQX|Toll Express
		BookAPickupActions.SelectTollCarrier1(2);
		
		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier,Account number,
		// name,phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll NQX | Toll Express");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Enter data for Quick entry mode, service(=DGExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(500, 1200)");

		BookAPickupActions.EnterService("General");
		
		// BookAPickupActions.SelectMode();
		BookAPickupActions.SelectChargeToAccount2(1);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.EnterPalletSpace("6");
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectDestination("melb");
		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}

	@Test(priority = 4)
	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_Premium() {

		// Select Toll NQX|Toll Express
		BookAPickupActions.SelectTollCarrier1(2);
		
		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier,Account number,
		// name,phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll NQX | Toll Express");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Enter data for Quick entry mode, service(=DGExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(500, 1200)");

		BookAPickupActions.EnterService("Premium");
		
		// BookAPickupActions.SelectMode();
		BookAPickupActions.SelectChargeToAccount2(1);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.EnterPalletSpace("6");
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectDestination("melb");
		BookAPickupActions.EnterItem("Automation Temp1");
		// BookAPickupActions.SelectItem(2);
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}

	@Test(priority = 5)
	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_RailGeneral() {

		// Select Toll NQX|Toll Express
		BookAPickupActions.SelectTollCarrier1(2);
		
		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier,Account number,
		// name,phoneNumber

		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll NQX | Toll Express");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Enter data for Quick entry mode, service(=DGExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(500, 1200)");

		BookAPickupActions.EnterService("Rail General");
		
		// BookAPickupActions.SelectMode();
		BookAPickupActions.SelectChargeToAccount2(1);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.EnterPalletSpace("6");
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectDestination("melb");
		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		
		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}

	@Test(priority = 6)
	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_Refrigeration() {

		// Select Toll NQX|Toll Express
		BookAPickupActions.SelectTollCarrier1(2);
		
		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier,Account number,
		// name,phoneNumber

		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll NQX | Toll Express");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Enter data for Quick entry mode, service(=DGExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(500, 1200)");

		BookAPickupActions.EnterService("Refrigeration");
		
		BookAPickupActions.SelectChargeToAccount2(1);

		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.EnterPalletSpace("6");
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectDestination("melb");
		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		
		PageBase.MaximumWaitForElementEnabled();
		PageBase.AcceptAlert();
		ReviewYouPickupActions.ClickEdit();
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.SelectDangerousGoodsDetails("1234", "Test Dg packaging description", "123", "456");

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test(priority = 7)
	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_DGRefrigerated() {

		// Select Toll NQX|Toll Express
		BookAPickupActions.SelectTollCarrier1(2);
		
		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier,Account number,
		// name,phoneNumber

		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll NQX | Toll Express");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Enter data for Quick entry mode, service(=DGExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(500, 1200)");

		BookAPickupActions.EnterService("DG Refrigerated");
		
		BookAPickupActions.SelectChargeToAccount2(1);
		
		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.EnterPalletSpace("6");
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectDestination("melb");
		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details
		//BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails("1234", "Test Dg packaging description", "123", "456");
		// Enter Pickup details
		jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test(priority = 8)
	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_RailDangerousGoods() {

		// Select Toll NQX|Toll Express
		BookAPickupActions.SelectTollCarrier1(2);
	
		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier,Account number,
		// name,phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll NQX | Toll Express");
		
		BookAPickupActions.SelectLocation2(locationIndex);
	
		// Enter data for Quick entry mode, service(=DGExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(500, 1200)");

		BookAPickupActions.EnterService("Rail Dangerous Goods");
		
		BookAPickupActions.SelectChargeToAccount2(1);
		
		BookAPickupActions.EnterQuantity("15");

		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.SelectDestination("melb");
		// BookAPickupActions.SelectItem(2);
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();
		
		// Enter dangerous goods details
		//BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails("1234", "Test Dg packaging description", "123", "456");

		// Enter Pickup details
		jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test(priority = 9)
	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_DGExpress() {

		// Select Toll NQX|Toll Express
		BookAPickupActions.SelectTollCarrier1(2);
		
		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier,Account number,
		// name,phoneNumber

		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll NQX | Toll Express");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		// Enter data for Quick entry mode, service(=DGExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(500, 1200)");

		BookAPickupActions.EnterService("DG Express");
		
		BookAPickupActions.SelectChargeToAccount2(1);
		
		BookAPickupActions.EnterQuantity("15");
		BookAPickupActions.EnterPalletSpace("6");
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200", "100", "50", "5");
		BookAPickupActions.SelectDestination("melb");
		BookAPickupActions.EnterItem("Automation Temp1");
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();
		
		// Enter dangerous goods details
		//BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails("1234", "Test Dg packaging description", "123", "456");

		// Enter Pickup details
		jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@AfterMethod
	public void RunTearDown() throws Exception {

		// BaseWebdriver.tearDown();

	}

}
