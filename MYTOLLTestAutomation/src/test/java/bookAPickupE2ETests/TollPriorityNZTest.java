package bookAPickupE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.GlobalVariables;
import GlobalActions.PageBase;
import SalesforceActions.SalesforceActions;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class TollPriorityNZTest {

	public static Integer locationIndex = 1;

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
	@Parameters({ "TollCarrierTollPrioNZ", "AccountNumberTollPrioNZ", "ServiceGlobalExpressDocuments", "locationIndex","ReceiverTGX",
			"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "reference",
			"DestinationCountry", "specialIns" })

	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_Service_GlobalExpressDocuments(String TollCarrier,
			String AccountNumberTollPrioNZ, String ServiceGlobalExpressDocuments, Integer locationIndex, String Receiver,
			String ItemTemplateName, String Length, String NumberOfItems, String Width, String Height, String Weight,
			String palletSpace, String reference, String destination, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTollPrioNZ);

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		// BookAPickupActions.SelectLocation2(locationIndex);
		BookAPickupActions.EnterLocation(Receiver);
		PageBase.Scrollbar(250, 500);
		// Enter data for Quick entry mode, service(=GlobalExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		PageBase.MoveToElement(BookAPickupActions.name, BookAPickupActions.location);
		BookAPickupActions.EnterService(ServiceGlobalExpressDocuments);

		// Enter data for Quick entry mode, service(=DGRefrigerated),

		BookAPickupActions.SelectDestinationCountry(destination, destination);

		PageBase.MaximumWaitForElementEnabled();

		BookAPickupActions.SelectItemDescription();
		// BookAPickupActions.Selectservice(2);
		BookAPickupActions.EnterQuantity(NumberOfItems);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		BookAPickupActions.SelectDangerousGoods(2);

		// Enter Pickup details
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.SelectDispatchDateTomorrow();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterReferenceNumber(reference);
		BookAPickupActions.SelectPickupFrom(1);
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		ReviewYourPickupActions.ClickConfirmPickup();
		// BookAPickupActions.GetReferenceNumber() ;
	}

	@Test(groups = { "E2E" })
	@Parameters({ "TollCarrierTollPrioNZ", "AccountNumberTollPrioNZ", "ServiceGlobalExpressDocuments", "locationIndex","ReceiverTGX",
			"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "reference",
			"DestinationCountry", "specialIns" })

	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_VerifyDetails(String TollCarrier,
			String AccountNumberTollPrioNZ, String ServiceGlobalExpressDocuments, Integer locationIndex,String Receiver,
			String ItemTemplateName, String Length, String NumberOfItems, String Width, String Height, String Weight,
			String palletSpace, String reference, String destination, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTollPrioNZ);

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.EnterLocation(Receiver);

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
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.SelectDispatchDateTomorrow();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterReferenceNumber(reference);
		BookAPickupActions.SelectPickupFrom(1);
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		ReviewYourPickupActions.ClickConfirmPickup();
		// BookAPickupActions.GetReferenceNumber() ;

	}

	//@Test(priority=-7)
	@Test(groups = { "E2E" })
	@Parameters({ "TollCarrierTollPrioNZ", "ServiceParcelsOffPeak", "AccountNumberTollPrioNZ", "locationIndex","ReceiverTGX",
			"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo", "palletSpace",
			"reference", "DestinationNZ", "DestinationNZPostcode", "DestinationNZItem", "specialIns" })

	public void BookAPickup_TollPriority_NZ_E2ETest_TID_619_Service_ParcelsOffPeak_SalesforceVerification(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioNZ, Integer locationIndex,String Receiver,
			String ItemTemplateName, String Length, String NumberOfItems, String Width, String Height, String Weight,
			String DGGoodsNo, String palletSpace, String reference, String destination, String DestinationNZPostcode,
			String destinationItem, String specialIns) throws Exception {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTollPrioNZ);

		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.EnterLocation(Receiver);

		String company = BookAPickupActions.GetCompany();
		System.out.println(company);
		String location = BookAPickupActions.GetLocation();
		System.out.println(location);
		String locationLine2 = BookAPickupActions.GetLocationAddressLine2();
		System.out.println(locationLine2);
		String addressPhoneNumber = BookAPickupActions.GetAddressPhoneNumber();
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

		String userPhoneNumber = countryCode.replaceAll("[-+.^:,]", "")
				+ phoneNumberModified.replaceAll("[-+.^:,]", "");
		System.out.println(userPhoneNumber);

		PageBase.Scrollbar(250, 500);
		// Enter data for Quick entry mode, service(=GlobalExpress),
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;

		BookAPickupActions.EnterService(ServiceParcelsOffPeak);
		BookAPickupActions.VerifyModeIsNotAvailable();

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
		BookAPickupActions.SelectDispatchDateTomorrow();
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

		ReviewYourPickupActions.VerifyPickupDetailsTollPrioNZ(TollCarrier, accountNo, Receiver, companyLocation,
				name, userPhoneNumber, readyTime, closingTime, specialInstruction);
		ReviewYourPickupActions.VerifyItemDetails1TollPrioNZ("0", "ITEM DETAILS", "Skid", DestinationNZPostcode,
				ServiceParcelsOffPeak, NumberOfItems, Length, Width, Height, TotalWeight, DGGoodsNo);

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
		String reference1=BookAPickupActions.GetReferenceNumber();
		int lengthRefrence=reference1.length();
		String ReferenceNumber=reference1.substring(18, lengthRefrence);
		System.out.println("Book A Pickup reference  " + reference1);
		System.out.println("ReferenceNumber " + ReferenceNumber);
		BaseWebdriver.LaunchSalesforce();
		SalesforceActions.LoginSalesforce(BaseWebdriver.SalesforceUser,BaseWebdriver.SalesforcePassword);
		SalesforceActions.ClickLocation();
		SalesforceActions.searchPickup(ReferenceNumber);
		SalesforceActions.searchPickup(ReferenceNumber);
		SalesforceActions.ClickSearchResultsNumber();
		

	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();
	}
}
