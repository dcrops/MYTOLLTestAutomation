package bookAPickupE2ETests;

import GlobalActions.GlobalVariables;
import GlobalActions.PageBase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class TollIPECTest {

	public static Integer locationIndex = 4;

	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		// MyTollHomePageActions.ClickMenu();
		// MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	@Test(groups = { "Shakeout Testing" })
	@Parameters({ "TollCarrierTollIPEC", "ServiceRoadExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void BookAPickup_TollIPEC_E2ETest_TID_1032_Service_RoadExpress(String TollCarrier, String ServiceRoadExpress,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		// Mode(=Road)

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterService(ServiceRoadExpress);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectLargestItem(1);

		BookAPickupActions.EnterQuantity(NumberOfItems);

		BookAPickupActions.EnterWeight(Weight);

		PageBase.MaximumWaitForElementEnabled();
		// BookAPickupActions.EnterPalletSpace("6");

		// BookAPickupActions.SelectMode();
		// BookAPickupActions.SelectChargeToAccount();

		// BookAPickupActions.ReceiverAccountNumber("1236654");

		// BookAPickupActions.SelectMode();

		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.SelectDangerousGoods(2);
		// BookAPickupActions.selectContainFoodItem();

		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterReferenceNumber("123456789");
		BookAPickupActions.SelectPickupFrom(1);
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		BookAPickupActions.ClickReviewBook();

		ReviewYourPickupActions.ClickConfirmPickup();
		//BookAPickupActions.GetReferenceNumber();
	}

	@Test
	@Parameters({ "TollCarrierTollIPEC", "ServiceRoadExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void BookAPickup_TollIPEC_E2ETest_TID_1032_Service_RoadExpress_ConfirmedDetails(String TollCarrier,
			String ServiceRoadExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		// Mode(=Road)

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterService(ServiceRoadExpress);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectLargestItem(1);

		BookAPickupActions.EnterQuantity(NumberOfItems);

		BookAPickupActions.EnterWeight(Weight);
		BookAPickupActions.VerifyModeIsNotAvailable();
		PageBase.MaximumWaitForElementEnabled();

		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.SelectDangerousGoods(2);
		// BookAPickupActions.selectContainFoodItem();

		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterReferenceNumber("123456789");
		BookAPickupActions.SelectPickupFrom(1);
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();

		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username);
		//BookAPickupActions.GetReferenceNumber();
	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();

	}

}
