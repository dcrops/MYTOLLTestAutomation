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
	@Parameters({ "TollCarrierTollPrioAU", "ServiceGlobalExpressDocuments", "locationIndex", "ItemTemplateName", "NumberOfItems",
		"Length", "Width", "Height", "Weight", "palletSpace","reference", "DestinationNZ", "specialIns" })
	
	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619(String TollCarrier, String ServiceGlobalExpressDocuments,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace,String reference, String destination, String specialIns) {
	
		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		
			// Enter data for Quick entry mode, service(=GlobalExpress), 
			JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
			BookAPickupActions.EnterService(ServiceGlobalExpressDocuments);	
		
			// Enter data for Quick entry mode, service(=DGRefrigerated), 
			
			BookAPickupActions.SelectDestination(destination);			
			//BookAPickupActions.Selectservice(2); 
			BookAPickupActions.EnterQuantity(NumberOfItems);
			
			BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
			
			BookAPickupActions.SelectItemDescription();
			jse.executeScript("scroll(1000, 1500)");
			BookAPickupActions.SelectDangerousGoods(2);
			
			
			//Enter Pickup details
			jse.executeScript("scroll(500, 800)");
			BookAPickupActions.selectPickupDate();
			BookAPickupActions.selectReadyTime();
			BookAPickupActions.selectClosingTime();
			BookAPickupActions.EnterReferenceNumber(reference);
			BookAPickupActions.SelectPickupFrom(1);
			BookAPickupActions.EnterSpecialInstructions(specialIns);
			
			BookAPickupActions.ClickReviewBook();

	}
	
	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceGlobalExpressDocuments", "locationIndex", "ItemTemplateName", "NumberOfItems",
		"Length", "Width", "Height", "Weight", "palletSpace","reference", "DestinationNZ", "specialIns" })
	
	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_VerifyDetails(String TollCarrier, String ServiceGlobalExpressDocuments,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace,String reference, String destination, String specialIns) {
	
		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		
			// Enter data for Quick entry mode, service(=GlobalExpress), 
			JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
			BookAPickupActions.EnterService(ServiceGlobalExpressDocuments);	
		
			// Enter data for Quick entry mode, service(=DGRefrigerated), 
			
			BookAPickupActions.SelectDestination(destination);			
			//BookAPickupActions.Selectservice(2); 
			BookAPickupActions.EnterQuantity(NumberOfItems);
			
			BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
			
			BookAPickupActions.SelectItemDescription();
			jse.executeScript("scroll(1000, 1500)");
			BookAPickupActions.SelectDangerousGoods(2);
			
			
			//Enter Pickup details
			jse.executeScript("scroll(500, 800)");
			BookAPickupActions.selectPickupDate();
			BookAPickupActions.selectReadyTime();
			BookAPickupActions.selectClosingTime();
			BookAPickupActions.EnterReferenceNumber(reference);
			BookAPickupActions.SelectPickupFrom(1);
			BookAPickupActions.EnterSpecialInstructions(specialIns);
			
			BookAPickupActions.ClickReviewBook();
						

	}
	
	@Test(priority = 1)
	@Parameters({ "TollCarrierTollPrioAU", "ServiceGlobalExpressDocuments", "locationIndex", "ItemTemplateName", "NumberOfItems",
		"Length", "Width", "Height", "Weight", "palletSpace","reference", "Destination", "specialIns" })
	
	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_Service_GlobalExpress(String TollCarrier, String ServiceGlobalExpressDocuments,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace,String reference, String destination, String specialIns) {
	
		
		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		
			// Enter data for Quick entry mode, service(=GlobalExpress), 
			JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
			BookAPickupActions.EnterService(ServiceGlobalExpressDocuments);	
			//BookAPickupActions.Selectservice(12); 
			BookAPickupActions.SelectDestinationCountry(12);
			
			
			BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
			
			BookAPickupActions.SelectItemDescription();
			jse.executeScript("scroll(1000, 1500)");
			BookAPickupActions.SelectDangerousGoods(2);
						
			
			//Enter Pickup details
			jse.executeScript("scroll(500, 800)");
			BookAPickupActions.selectPickupDate();
			BookAPickupActions.selectReadyTime();
			BookAPickupActions.selectClosingTime();
			BookAPickupActions.EnterReferenceNumber(reference);
			BookAPickupActions.SelectPickupFrom(1);
			BookAPickupActions.EnterSpecialInstructions(specialIns);
			
			BookAPickupActions.ClickReviewBook();
			
			

	}

	@AfterMethod
	  public void RunTearDown() throws Exception
		{
			//EnvConfig.tearDown();
	
		}
}
