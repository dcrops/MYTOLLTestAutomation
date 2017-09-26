package bookAPickupE2ETests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class TollPriorityNZTest {
	
	public static Integer locationIndex=1;
	
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
	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619() {
	
			// Select Toll priority NZ Express
			BookAPickupActions.SelectTollCarrier1(4);
			
			BookAPickupActions.SelectAccountNumber1();

			// Verification of Book A Pickup screen, Toll Carrier,Account number, name,phoneNumber
			BookAPickupActions.VerifyBookAPickupScreen();
			BookAPickupActions.VerifyTollCarrier("Toll Priority (NZ)");
	
			BookAPickupActions.SelectLocation2(locationIndex);
		
			// Enter data for Quick entry mode, service(=DGRefrigerated), 
			JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
			BookAPickupActions.SelectDestination("Wellington");			
			BookAPickupActions.Selectservice(2); 
			BookAPickupActions.EnterQuantity("15");
			
			BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50","5");
			
			BookAPickupActions.SelectItemDescription();
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
			//ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}
	
	@Test
	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_VerifyDetails() {
	
			// Select Toll priority NZ Express
			BookAPickupActions.SelectTollCarrier1(4);
			
			BookAPickupActions.SelectAccountNumber1();

			// Verification of Book A Pickup screen, Toll Carrier,Account number, name,phoneNumber
			BookAPickupActions.VerifyBookAPickupScreen();
			BookAPickupActions.VerifyTollCarrier("Toll Priority (NZ)");
		
			BookAPickupActions.SelectLocation2(locationIndex);
		
			// Enter data for Quick entry mode, service(=DGRefrigerated), 
			JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
			BookAPickupActions.SelectDestination("Wellington");			
			BookAPickupActions.Selectservice(2); 
			BookAPickupActions.EnterQuantity("15");
			
			BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50","5");
			
			BookAPickupActions.SelectItemDescription();
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
						

	}
	
	@Test(priority = 1)
	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_Service_GlobalExpress() {
	
			// Select Toll priority NZ Express
			BookAPickupActions.SelectTollCarrier1(4);
			
			BookAPickupActions.SelectAccountNumber1();

			// Verification of Book A Pickup screen, Toll Carrier,Account number, name,phoneNumber
			BookAPickupActions.VerifyBookAPickupScreen();
			BookAPickupActions.VerifyTollCarrier("Toll Priority (NZ)");
	
			BookAPickupActions.SelectLocation2(locationIndex);
		
			// Enter data for Quick entry mode, service(=DGRefrigerated), 
			JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
				
			BookAPickupActions.Selectservice(12); 
			BookAPickupActions.SelectDestinationCountry(12);
			
			
			BookAPickupActions.EnterLengthWidthHeightVolumeWeight("200","100","50","5");
			
			BookAPickupActions.SelectItemDescription();
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
			
			

	}

	@AfterMethod
	  public void RunTearDown() throws Exception
		{
			//EnvConfig.tearDown();
	
		}
}
