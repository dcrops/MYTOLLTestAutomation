package seleniumtests.bookapickup;

import global.PageBase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import bookapickup.BookAPickupActions;
import mytollhomepage.MyTollHomePageActions;
import reviewyourpickup.ReviewYourPickupActions;

public class TollIPECTest {

	public static Integer locationIndex = 4;

	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		// MyTollHomePageActions.ClickMenu();
		// MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	@Test(groups = { "Shakeout Testing","E2E" })
	@Parameters({ "TollCarrierTollIPEC","AccountNumberTIPEC", "ServiceRoadExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void BookAPickup_TollIPEC_E2ETest_TID_1032_Service_RoadExpress(String TollCarrier, String AccountNumberTIPEC, String ServiceRoadExpress,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);


		BookAPickupActions.EnterAccountNumber(AccountNumberTIPEC);

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
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterReferenceNumber("123456789");
		BookAPickupActions.SelectPickupFrom(1);
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		BookAPickupActions.ClickReviewBook();

		ReviewYourPickupActions.ClickConfirmPickup();
		//BookAPickupActions.GetReferenceNumber();
	}

	 @Test(groups = { "E2E" })
	@Parameters({ "TollCarrierTollIPEC", "AccountNumberTIPEC","ServiceRoadExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void BookAPickup_TollIPEC_E2ETest_TID_1032_Service_RoadExpress_ConfirmedDetails_SalesforceVerification(String TollCarrier, String AccountNumberTIPEC,
			String ServiceRoadExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String specialIns) throws Exception {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTIPEC);

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
		BookAPickupActions.selectDispatchDate();
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

		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
		String reference=BookAPickupActions.GetReferenceNumber();
		int lengthRefrence=reference.length();
		String ReferenceNumber=reference.substring(18, lengthRefrence);
		System.out.println("Book A Pickup reference  " + reference);
		System.out.println("ReferenceNumber " + ReferenceNumber);
//		BaseWebdriver.LaunchSalesforce();
//		salesforce.LoginSalesforce(BaseWebdriver.SalesforceUser,BaseWebdriver.SalesforcePassword);
//		salesforce.ClickLocation();
//		salesforce.searchPickup(ReferenceNumber);
//		salesforce.searchPickup(ReferenceNumber);
//		salesforce.ClickSearchResultsNumber();
		
	}

	@AfterMethod(alwaysRun = true)
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();

	}

}
