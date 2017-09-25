package bookAPickupE2ETests;

import GlobalActions.PageBase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class TollIPECTest {
	
	public static Integer locationIndex=4;
	
	@BeforeMethod
	public void RunSetup() throws Exception
			{
				BaseWebdriver.setUp();
				MyTollHomePageActions.Login(BaseWebdriver.Username , BaseWebdriver.Password);
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickBookAPIckupMenu();
				MyTollHomePageActions.ClickMenu();
				MyTollHomePageActions.ClickBookAPIckupMenu();
		
			}
	
	@Test
	public void BookAPickup_TollIPEC_E2ETest_TID_1032_Service_RoadExpress()
	{
		 
			
		//Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown),10);
		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(1);
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
		
		//Verification of Book A Pickup screen, Toll Carrier, Account number, name, phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll IPEC");
	
		BookAPickupActions.SelectLocation2(locationIndex);
		//BookAPickupActions.SelectLocation1("AACCMMI");
		//BookAPickupActions.verifyPhonenumber("469 215 568","+61");
		//BookAPickupActions.VerifyLocation("19070011 Mine Project Catering");
		
		//Verification and enter data for Quick entry mode, service(=Express), Mode(=Road)
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.Selectservice(1); 
		BookAPickupActions.SelectLargestItem(1);
		
		BookAPickupActions.EnterQuantity("15");

		BookAPickupActions.EnterWeight("50");
		BookAPickupActions.SelectDestination("melb");
		PageBase.MaximumWaitForElementEnabled();
		//BookAPickupActions.EnterPalletSpace("6");
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//BookAPickupActions.SelectMode(); 
		//BookAPickupActions.SelectChargeToAccount();
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//BookAPickupActions.ReceiverAccountNumber("1236654");
		
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		//BookAPickupActions.SelectMode(); 
			
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.SelectDangerousGoods(2);
		//BookAPickupActions.selectContainFoodItem();
			
		
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterReferenceNumber("123456789");
		BookAPickupActions.SelectPickupFrom(1);
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();
		
		ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
		//Verify Review Your Pickup
		//ReviewYouPickupActions.verifyReviewYourPickupScreenHeadings();
		ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();
		//ReviewYouPickupActions.verifyAccountNumber("123456");
		ReviewYouPickupActions.verifyTollCarrier("Toll IPEC");
	
		
		//ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
		
	}
	
	@Test
	public void BookAPickup_TollIPEC_E2ETest_TID_1032_Service_RoadExpress_ConfirmedDetails()
	{
		
			
		//Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown),10);
		bookAPickupActions.BookAPickupActions.SelectTollCarrier1(1);
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
		
		//Verification of Book A Pickup screen, Toll Carrier, Account number, name, phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier("Toll IPEC");
		
		BookAPickupActions.SelectLocation2(locationIndex);
		
		//Verification and enter data for Quick entry mode, service(=Express), Mode(=Road)
		
		JavascriptExecutor jse = (JavascriptExecutor)BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.Selectservice(1); 
		BookAPickupActions.SelectLargestItem(1);
		
		BookAPickupActions.EnterQuantity("15");

		BookAPickupActions.EnterWeight("50");
		BookAPickupActions.SelectDestination("melb");
		PageBase.MaximumWaitForElementEnabled();
		//BookAPickupActions.EnterPalletSpace("6");
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//BookAPickupActions.SelectMode(); 
		//BookAPickupActions.SelectChargeToAccount();
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//BookAPickupActions.ReceiverAccountNumber("1236654");
		
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		//BookAPickupActions.SelectMode(); 
			
		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.SelectDangerousGoods(2);
		//BookAPickupActions.selectContainFoodItem();
			
		
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterReferenceNumber("123456789");
		BookAPickupActions.SelectPickupFrom(1);
		BookAPickupActions.EnterSpecialInstructions("special instructions test");
		BookAPickupActions.ClickReviewBook();
		
		//Confirmed Pickup		
		//ReviewYouPickupActions.ClickConfirmPickup();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();
		
	}
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
			//EnvConfig.tearDown();
	
		}

}
