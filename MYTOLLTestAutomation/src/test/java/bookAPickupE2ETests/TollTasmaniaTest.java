package bookAPickupE2ETests;

import GlobalActions.PageBase;
import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;

import reviewYourPickupActions.ReviewYouPickupActions;

public class TollTasmaniaTest {
	
	public static Integer locationIndex=4;
	
	
	
	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}
	
	@Test(priority=1) 
	public void TollTasmania_E2ETest_TID_1033_Service_Refrigeration() {

		//Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown),10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		
		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(5);
		
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
		
		//Verification of Book A Pickup screen, Toll Carrier, Account number, name, phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Tasmania");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		//Verification and enter data for Quick entry mode, service(Refrigeration), Mode(=Road)
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15"); 
		BookAPickupActions.Selectservice(4); 
	 
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.SelectDestination("melb");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		BookAPickupActions.EnterItem("Automation Temp1");
		//BookAPickupActions.SelectMode(); 
			
		jse.executeScript("scroll(200, 500)");
	
		BookAPickupActions.selectDangerousGood();
	
		
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate=BookAPickupActions.ReturnPickupDate( );
		System.out.println("pickupDate" +pickupDate);
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();
		
		//Verify Review Your Pickup
		//ReviewYouPickupActions.verifyReviewYourPickupScreenHeadings();
		ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();
		ReviewYouPickupActions.VerifyAccountNumber("8723682S");
		ReviewYouPickupActions.VerifyTollCarrier("Toll Tasmania");
		ReviewYouPickupActions.VerifyCompany("19070011 Mine Project Catering");
		//ReviewYouPickupActions.verifyLocation();
		//ReviewYouPickupActions.verifyBookedby();
		//ReviewYouPickupActions.VerifyPhoneNumber();
		ReviewYouPickupActions.VerifyPickupDate();
		//ReviewYouPickupActions.verifyReadyTime();
		//ReviewYouPickupActions.verifyClosingTime();
		ReviewYouPickupActions.verifySpecialInstructions();
		ReviewYouPickupActions.verifyItemDescription();
		ReviewYouPickupActions.verifyNumberofItems();
		ReviewYouPickupActions.verifyLengthWidthHeight();
		ReviewYouPickupActions.verifyVolume();
		ReviewYouPickupActions.verifyWeight();
		
		//Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}
	
	@Test(priority=2)
	public void TollTasmania_E2ETest_TID_1033_Service_Refrigeration_ConfirmDetails() {

		//Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown),10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		
		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(5);
		
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
		
		//Verification of Book A Pickup screen, Toll Carrier, Account number, name, phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Tasmania");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		//Verification and enter data for Quick entry mode, service(Refrigeration), Mode(=Road)
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15"); 
		BookAPickupActions.Selectservice(4); 
	
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.SelectDestination("melb");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//BookAPickupActions.ReceiverAccountNumber("1236654");
		
		
		//BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		BookAPickupActions.EnterItem("Automation Temp1");
		
		//BookAPickupActions.SelectMode(); 
			
		jse.executeScript("scroll(200, 500)");
		
		BookAPickupActions.selectDangerousGood();
		//BookAPickupActions.selectContainFoodItem();
			
		
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate=BookAPickupActions.ReturnPickupDate( );
		System.out.println("pickupDate" +pickupDate);
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();
				
		//Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}
	
	@Test(priority=3)
	public void TollTasmania_E2ETest_TID_1033_Service_DGFreight()
	{
		
		//Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown),10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(5);
		
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
		
		//Verification of Book A Pickup screen, Toll Carrier, Account number, name, phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Tasmania");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		//Verification and enter data for Quick entry mode, service(DGFreight), Mode(=Road)
		//BookAPickupActions.VerifyQuickMode();
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15"); 
		BookAPickupActions.Selectservice(1); 
	
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//BookAPickupActions.ReceiverAccountNumber("1236654");
		
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		BookAPickupActions.SelectDestination("melb");
		
		BookAPickupActions.EnterItem("Automation Temp1");
		//BookAPickupActions.SelectMode(); 
			
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.SelectDangerousGoods(1);
		//BookAPickupActions.selectContainFoodItem();
			
		// Enter dangerous goods details
		//BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails("1234", "Test Dg packaging description", "123", "456");
		
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate=BookAPickupActions.ReturnPickupDate( );
		System.out.println("pickupDate" +pickupDate);
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();
		
		//Verify Review Your Pickup
	
		//ReviewYouPickupActions.verifyReviewYourPickupScreenHeadings();
		ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();
		ReviewYouPickupActions.VerifyAccountNumber("8723682S");
		ReviewYouPickupActions.VerifyTollCarrier("Toll Tasmania");
		ReviewYouPickupActions.VerifyCompany("19070011 Mine Project Catering");
		
		//ReviewYouPickupActions.VerifyPhoneNumber();
		ReviewYouPickupActions.VerifyPickupDate();
		//ReviewYouPickupActions.verifyReadyTime();
		//ReviewYouPickupActions.verifyClosingTime();
		ReviewYouPickupActions.verifySpecialInstructions();
		ReviewYouPickupActions.verifyItemDescription();
		ReviewYouPickupActions.verifyNumberofItems();
		ReviewYouPickupActions.verifyLengthWidthHeight();
		ReviewYouPickupActions.verifyVolume();
		ReviewYouPickupActions.verifyWeight();
		
		//Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}
	
	@Test(priority=4)
	public void TollTasmania_E2ETest_TID_1033_Service_DGFreight_ConfirmDetails()
	{
		
		//Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown),10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(5);
		
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
		
		//Verification of Book A Pickup screen, Toll Carrier, Account number, name, phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Tasmania");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		//Verification and enter data for Quick entry mode, service(DGFreight), Mode(=Road)
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15"); 
		BookAPickupActions.Selectservice(1); 
	
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//BookAPickupActions.ReceiverAccountNumber("1236654");
		
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		BookAPickupActions.SelectDestination("melb");
		
		BookAPickupActions.EnterItem("Automation Temp1");
		//BookAPickupActions.SelectMode(); 
			
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.SelectDangerousGoods(1);
		//BookAPickupActions.selectContainFoodItem();
			
		// Enter dangerous goods details
		//BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails("1234", "Test Dg packaging description", "123", "456");

		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate=BookAPickupActions.ReturnPickupDate( );
		System.out.println("pickupDate" +pickupDate);
		//BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();
				
		//Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}
	
	@Test(priority=5)
	public void TollTasmania_E2ETest_TID_1033_Service_Express()
	{
		
			
		//Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown),10);
		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(5);
		
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
		
		//Verification of Book A Pickup screen, Toll Carrier, Account number, name, phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Tasmania");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		//Verification and enter data for Quick entry mode, service(=Express), Mode(=Road)
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.Selectservice(2); //Express
		BookAPickupActions.EnterQuantity("15"); 
		BookAPickupActions.EnterPalletSpace("6");
		
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//BookAPickupActions.SelectMode(); 
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		BookAPickupActions.SelectDestination("melbo");
		BookAPickupActions.SelectChargeToAccount2(1);
				
		//BookAPickupActions.ReceiverAccountNumber("1236654");
		
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		BookAPickupActions.EnterItem("Automation Temp1");
		
		//BookAPickupActions.SelectMode(); 
			
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.selectDangerousGood();
		//BookAPickupActions.selectContainFoodItem();
			
		
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();
				
		//Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
		
	}
	
	
	@Test(priority=6)
	public void TollTasmania_E2ETest_TID_1033_Service_Express_ConfirmDetails()
	{
		
			
		//Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown),10);
		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(5);
	
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
		
		//Verification of Book A Pickup screen, Toll Carrier, Account number, name, phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Tasmania");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		//Verification and enter data for Quick entry mode, service(=Express), Mode(=Road)
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.Selectservice(2); //Express
		BookAPickupActions.EnterQuantity("15"); 
		BookAPickupActions.EnterPalletSpace("6");
		
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//BookAPickupActions.SelectMode(); 
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		BookAPickupActions.SelectDestination("melbo");
		BookAPickupActions.SelectChargeToAccount2(1);
				
		//BookAPickupActions.ReceiverAccountNumber("1236654");
		
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		BookAPickupActions.EnterItem("Automation Temp1");
					
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.selectDangerousGood();
		//BookAPickupActions.selectContainFoodItem();
			
		
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();
		
		//Verify Review Your Pickup
		//ReviewYouPickupActions.verifyReviewYourPickupScreenHeadings();
		ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();
		ReviewYouPickupActions.VerifyAccountNumber("8723682S");
		ReviewYouPickupActions.VerifyTollCarrier("Toll Tasmania");
		ReviewYouPickupActions.VerifyCompany("18070011 ESS Clermont Coal Mine Project Catering");
		//ReviewYouPickupActions.verifyLocation();
		//ReviewYouPickupActions.verifyBookedby();
		//ReviewYouPickupActions.VerifyPhoneNumber();
		ReviewYouPickupActions.VerifyPickupDate();
		//ReviewYouPickupActions.verifyReadyTime();
		//ReviewYouPickupActions.verifyClosingTime();
		ReviewYouPickupActions.verifySpecialInstructions();
		ReviewYouPickupActions.verifyItemDescription();
		ReviewYouPickupActions.verifyNumberofItems();
		ReviewYouPickupActions.verifyLengthWidthHeight();
		ReviewYouPickupActions.verifyVolume();
		ReviewYouPickupActions.verifyWeight();
		
		//Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
		
	}
	
		
	@Test(priority=7)
	public void BookAPickup_TollTasmania_E2ETest_TID_1033_Service_General()
	{
		
		
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown),10);
		
		//Select TollTasmania
		BookAPickupActions.SelectTollCarrier1(5);
		
		BookAPickupActions.SelectAccountNumber1();
		
		//Verification of Book A Pickup screen, Toll Carrier, Account number, name, phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Tasmania");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		//Verification and enter data for Quick entry mode, service(=General), Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15"); 
		BookAPickupActions.Selectservice(3); //General
		
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		//BookAPickupActions.ReceiverAccountNumber("1236654");
		BookAPickupActions.SelectDestination("melbo");
		
		BookAPickupActions.EnterItem("Automation Temp1");
		
		//BookAPickupActions.SelectMode(); 
			
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.selectDangerousGood();
		//BookAPickupActions.selectContainFoodItem();
			
		
		
		//Add a new item
		BookAPickupActions.AddANewLine();
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate=BookAPickupActions.ReturnPickupDate( );
		System.out.println("pickupDate" +pickupDate);
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();
		
		//Verify Review Your Pickup
		ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();
		ReviewYouPickupActions.VerifyAccountNumber("8723682S");
		ReviewYouPickupActions.VerifyTollCarrier("Toll Tasmania");
		ReviewYouPickupActions.VerifyCompany("19070011 Mine Project Catering");
		//ReviewYouPickupActions.verifyLocation();
		//ReviewYouPickupActions.verifyBookedby();
		//ReviewYouPickupActions.VerifyPhoneNumber();
		ReviewYouPickupActions.VerifyPickupDate();
		ReviewYouPickupActions.verifySpecialInstructions();
		ReviewYouPickupActions.verifyItemDescription();
		ReviewYouPickupActions.verifyNumberofItems();
		ReviewYouPickupActions.verifyLengthWidthHeight();
		ReviewYouPickupActions.verifyVolume();
		ReviewYouPickupActions.verifyWeight();
		
		//Verify item details
		ReviewYouPickupActions.VerifyItemDetails();
		jse.executeScript("scroll(500, 800)");
		ReviewYouPickupActions.VerifyNewItemDetails();
		
		//Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
		
	}
	
	@Test(priority=8)
	public void BookAPickup_TollTasmania_E2ETest_TID_1033_Service_General_ConfirmDetails()
	{
		
		
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown),10);
		
		//Select TollTasmania
		BookAPickupActions.SelectTollCarrier1(5);
		
		BookAPickupActions.SelectAccountNumber1();
		
		//Verification of Book A Pickup screen, Toll Carrier, Account number, name, phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll Tasmania");
	
		BookAPickupActions.SelectLocation2(locationIndex);
		
		//Verification and enter data for Quick entry mode, service(=General), Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity("15"); 
		BookAPickupActions.Selectservice(3); //General
		
		BookAPickupActions.EnterPalletSpace("6");
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50", "5");
		BookAPickupActions.SelectChargeToAccount2(1);
		//BookAPickupActions.ReceiverAccountNumber("1236654");
		BookAPickupActions.SelectDestination("melbo");
	
		BookAPickupActions.EnterItem("Automation Temp1");
		
		//BookAPickupActions.SelectMode(); 
			
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.selectDangerousGood();
		//BookAPickupActions.selectContainFoodItem();
			
	
		//Add a new item
		BookAPickupActions.AddANewLine();
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate=BookAPickupActions.ReturnPickupDate( );
		System.out.println("pickupDate" +pickupDate);
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();
	
		
		//Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
		
	}

	@AfterMethod
	  public void RunTearDown() throws Exception
		{
		// BaseWebdriver.tearDown();
	
		}

}
