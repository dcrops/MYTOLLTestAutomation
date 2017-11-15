package bookAPickupE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class TollPriorityNZTest {

	public static Integer locationIndex = 1;

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}

	@Test(priority = 3)
	@Parameters({ "TollCarrierTollPrioNZ", "ServiceGlobalExpressDocuments", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "reference", "DestinationCountry",
			"specialIns" })

	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_Service_GlobalExpressDocuments(String TollCarrier, String ServiceGlobalExpressDocuments,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String reference, String destination, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		PageBase.Scrollbar(250, 500);
		// Enter data for Quick entry mode, service(=GlobalExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		PageBase.MoveToElement(BookAPickupActions.name, BookAPickupActions.location);
		BookAPickupActions.EnterService(ServiceGlobalExpressDocuments);

		// Enter data for Quick entry mode, service(=DGRefrigerated),

		BookAPickupActions.SelectDestinationCountry(destination);

		BookAPickupActions.SelectItemDescription();
		// BookAPickupActions.Selectservice(2);
		BookAPickupActions.EnterQuantity(NumberOfItems);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		
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

	}

	@Test(priority = 2)
	@Parameters({ "TollCarrierTollPrioNZ", "ServiceGlobalExpressDocuments", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "reference", "DestinationCountry",
			"specialIns" })

	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_VerifyDetails(String TollCarrier,
			String ServiceGlobalExpressDocuments, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String reference,
			String destination, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Enter data for Quick entry mode, service(=GlobalExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		PageBase.Scrollbar(250, 500);
		
		BookAPickupActions.EnterService(ServiceGlobalExpressDocuments);

		// Enter data for Quick entry mode, service
		BookAPickupActions.SelectDestinationCountry(destination);
		
		BookAPickupActions.EnterQuantity(NumberOfItems);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		BookAPickupActions.SelectItemDescription();
		jse.executeScript("scroll(100, 500)");
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

	}

	@Test(priority = 1)
	@Parameters({ "TollCarrierTollPrioNZ", "ServiceParcelsOffPeak", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "reference","DestinationNZ", "DestinationNZItem",
			"specialIns" })

	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_Service_ParcelsOffPeak(String TollCarrier,
			String ServiceParcelsOffPeak, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String reference,
			String destination,String destinationItem, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		PageBase.Scrollbar(250, 500);
		// Enter data for Quick entry mode, service(=GlobalExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		BookAPickupActions.EnterService(ServiceParcelsOffPeak);
		// BookAPickupActions.Selectservice(12);
		
		BookAPickupActions.SelectItemDescription();
		BookAPickupActions.EnterDestinationNZ(destination,destinationItem);//,destination);
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		BookAPickupActions.EnterQuantity(NumberOfItems);
		jse.executeScript("scroll(100, 500)");
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

	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		 BaseWebdriver.tearDown();
	}
}
