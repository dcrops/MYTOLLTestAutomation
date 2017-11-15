package bookAPickupE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.GlobalVariables;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class TollPriorityAusTest {

	public static Integer locationIndex = 4;

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "locationIndex", "ItemTemplateName", "NumberOfItems",
		"Length", "Width", "Height", "Weight", "palletSpace","reference", "Destination", "specialIns" })

	public void BookAPickup_TollPriority_AUS_E2ETest_TID_620_Service_ServiceParcelsOffPeak(String TollCarrier, String ServiceParcelsOffPeak,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace,String reference, String destination, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Road Express),
		
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceParcelsOffPeak);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		
		BookAPickupActions.SelectDestination(destination);

		//BookAPickupActions.SelectItemDescriptionTollPriorityAU();
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(2);

		// Enter Pickup details
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterReferenceNumber(reference);
		BookAPickupActions.SelectPickupFrom(1);
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);
	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		 BaseWebdriver.tearDown();
	}

}
