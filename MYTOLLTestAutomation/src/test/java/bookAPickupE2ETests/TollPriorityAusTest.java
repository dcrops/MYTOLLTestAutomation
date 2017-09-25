package bookAPickupE2ETests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;


public class TollPriorityAusTest {
	
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
	public void BookAPickup_TollPriority_AUS_E2ETest_TID_620() {
	 
			// Select Toll NQX|Toll Express
			BookAPickupActions.SelectTollCarrier1(3);
			BookAPickupActions.SelectTollCarrier1(3);
			BookAPickupActions.SelectAccountNumber1();

			// Verification of Book A Pickup screen, Toll Carrier,Account number, name,phoneNumber
			BookAPickupActions.VerifyBookAPickupScreen();
			BookAPickupActions.VerifyTollCarrier("Toll Priority (Aus)");
			BookAPickupActions.VerifyAccountnumber1();
			//BookAPickupActions.VerifyAccountnumber("29357923A, Mich Fury");
			//BookAPickupActions.VerifyName("super superuser");
			//BookAPickupActions.EnterPhoneNumber();
			BookAPickupActions.SelectLocation2(locationIndex);
			//BookAPickupActions.verifyPhonenumber("469 215 568", "+61");
			//BookAPickupActions.VerifyLocation("19070011 Mine Project Catering");

			// Enter data for Quick entry mode, service(=DGRefrigerated), 
			JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
						
			BookAPickupActions.Selectservice(1); 
			BookAPickupActions.EnterQuantity("15");
			
			BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50","5");
			BookAPickupActions.SelectDestination("melbo");
			BookAPickupActions.SelectItemDescriptionTollPriorityAU();
			jse.executeScript("scroll(1000, 1500)");
			BookAPickupActions.SelectDangerousGoods(2);
						
			
			//Enter Pickup details
			jse.executeScript("scroll(500, 800)");
			BookAPickupActions.selectPickupDate();
			BookAPickupActions.selectReadyTime();
			BookAPickupActions.selectClosingTime();
			BookAPickupActions.EnterReferenceNumber("123456789");
			BookAPickupActions.SelectPickupFrom(1);
			BookAPickupActions.EnterSpecialInstructions("special instructions test");
			
			BookAPickupActions.ClickReviewBook();
			
			//Confirm Pickup and Verify pickup confirmation details
			ReviewYouPickupActions.ClickConfirmPickup();
			ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}
	
	@AfterMethod
	  public void RunTearDown() throws Exception
		{
			//EnvConfig.tearDown();
	
		}

}
