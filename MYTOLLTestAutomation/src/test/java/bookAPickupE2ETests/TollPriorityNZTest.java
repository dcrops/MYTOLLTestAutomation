package bookAPickupE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.GlobalVariables;
import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class TollPriorityNZTest {

	public static Integer locationIndex = 1;

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		// MyTollHomePageActions.ClickMenu();
		// MyTollHomePageActions.ClickBookAPIckupMenu();
	}

	@Test
	@Parameters({ "TollCarrierTollPrioNZ", "ServiceGlobalExpressDocuments", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "reference", "DestinationCountry",
			"specialIns" })

	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_Service_GlobalExpressDocuments(String TollCarrier,
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

		PageBase.Scrollbar(250, 500);
		// Enter data for Quick entry mode, service(=GlobalExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		PageBase.MoveToElement(BookAPickupActions.name, BookAPickupActions.location);
		BookAPickupActions.EnterService(ServiceGlobalExpressDocuments);

		// Enter data for Quick entry mode, service(=DGRefrigerated),

		BookAPickupActions.SelectDestinationCountry(destination, destination);

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

	@Test
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
		BookAPickupActions.SelectDestinationCountry(destination, destination);

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

	@Test(priority=-1)
	@Parameters({ "TollCarrierTollPrioNZ", "ServiceParcelsOffPeak", "AccountNumberTollPrioNZ","locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo", "palletSpace", "reference", "DestinationNZ","DestinationNZPostcode",
			"DestinationNZItem", "specialIns" })

	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_Service_ParcelsOffPeak(String TollCarrier,
			String ServiceParcelsOffPeak,String AccountNumberTollPrioNZ, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight,String DGGoodsNo, String palletSpace, String reference,
			String destination, String destinationItem,String DestinationNZPostcode, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);
		
		String company = BookAPickupActions.GetCompany(1);
		System.out.println(company);
		String location = BookAPickupActions.GetLocation(1);
		System.out.println(location);
		String locationLine2 = BookAPickupActions.GetLocationAddressLine2(1);
		System.out.println(locationLine2);
		String addressPhoneNumber = BookAPickupActions.GetAddressPhoneNumber(1);
		System.out.println(addressPhoneNumber);
		String companyLocation = location + locationLine2;
		System.out.println(location + " " + locationLine2);
		String name = BookAPickupActions.GetName();

		System.out.println("name" + name);
		String phoneNumber = BookAPickupActions.GetPhoneNumber();
		String phoneNumberModified = phoneNumber.replaceAll("\\s", "");
		System.out.println(phoneNumber);

		String countryCode = BookAPickupActions.GetCountryCode();
		System.out.println(countryCode);

		String userPhoneNumber = countryCode.replaceAll("[-+.^:,]","") + phoneNumberModified.replaceAll("[-+.^:,]","");
		System.out.println(userPhoneNumber);

		PageBase.Scrollbar(250, 500);
		// Enter data for Quick entry mode, service(=GlobalExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;

		BookAPickupActions.EnterService(ServiceParcelsOffPeak);
		// BookAPickupActions.Selectservice(12);

		BookAPickupActions.SelectItemDescription();
		BookAPickupActions.EnterDestinationNZ(destination, destinationItem);// ,destination);
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		String TotalWeight = Weight + " kg";
		BookAPickupActions.EnterQuantity(NumberOfItems);
		jse.executeScript("scroll(100, 500)");
		BookAPickupActions.SelectDangerousGoods(2);

		// Enter Pickup details
		jse.executeScript("scroll(500, 800)");
		PageBase.MediumWaitForElementEnabled();
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println(pickupDate);
		String readyTime = BookAPickupActions.GetReadyTime();
		System.out.println(readyTime);
		String closingTime = BookAPickupActions.GetClosingTime();
		System.out.println(closingTime);
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		String specialInstruction = BookAPickupActions.GetSpecialIns();
		System.out.println(specialInstruction);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		ReviewYourPickupActions.VerifyPickupDetailsTollPrioNZ(TollCarrier, AccountNumberTollPrioNZ, company, companyLocation, name,
				userPhoneNumber, readyTime, closingTime, specialInstruction);
		ReviewYourPickupActions.VerifyItemDetails1TollPrioNZ("0", "ITEM DETAILS", "Skid", DestinationNZPostcode,
				ServiceParcelsOffPeak, NumberOfItems, Length, Width, Height, TotalWeight, DGGoodsNo);

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);

	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();
	}
}
