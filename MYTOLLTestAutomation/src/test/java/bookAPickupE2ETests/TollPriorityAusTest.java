package bookAPickupE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.GlobalVariables;
import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import manifestActions.ManifestActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class TollPriorityAusTest {

	

	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}

	
	@Test(groups = { "Shakeout Testing" })
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "locationIndex",
			"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGGoodsNo", "palletSpace", "reference",
			"Destination", "DestinationItem","DestinationPostcode", "specialIns" })

	public void BookAPickup_TollPriority_AUS_E2ETest_TID_620_Service_ServiceParcelsOffPeak(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, Integer locationIndex,
			String ItemTemplateName, String Length, String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo,
			String palletSpace, String reference, String destination, String DestinationItem,String DestinationPostcode, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		
		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
		
		String accountNumber= BookAPickupActions.GetAccountNumber();
		System.out.println(accountNumber);
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

		String userPhoneNumber = countryCode + "-" + phoneNumberModified;
		System.out.println(userPhoneNumber);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceParcelsOffPeak);
		BookAPickupActions.VerifyModeIsNotAvailable();
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		String TotalWeight = Weight + " kg";
		BookAPickupActions.SelectDestination1(destination, DestinationItem);

		// BookAPickupActions.SelectItemDescriptionTollPriorityAU();
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.SelectItemDescriptionTollPriorityAU();

		// Enter Pickup details
		jse.executeScript("scroll(500, 800)");
		PageBase.MediumWaitForElementEnabled();
		BookAPickupActions.selectDispatchDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println(pickupDate);
		BookAPickupActions.selectReadyTime();
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
		/*BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		ReviewYourPickupActions.VerifyPickupDetails(TollCarrier, accountNumber, company, companyLocation, name,
				userPhoneNumber, readyTime, closingTime, specialInstruction);
		ReviewYourPickupActions.VerifyItemDetails1TollPrioAU("0", "ITEM DETAILS","Box / Carton", DestinationPostcode,
				ServiceParcelsOffPeak,  NumberOfItems,  Length, Width, Height,
				TotalWeight, DGGoodsNo);

		// Confirm Pickup and Verify pickup confirmation details
		 ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username); */
		
	}
	
	@Test(priority=-1)
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "locationIndex",
		"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGGoodsNo", "palletSpace", "reference",
		"Destination", "DestinationItem","DestinationPostcode", "specialIns", "VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_VIC(String TollCarrier,
		String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, Integer locationIndex,
		String ItemTemplateName, String Length, String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo,
		String palletSpace, String reference, String destination, String DestinationItem,String DestinationPostcode, String specialIns, String VICAddress1) {

	BookAPickupActions.EnterTollCarrier(TollCarrier);
	
	bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
	
	//Add Address
	BookAPickupActions.AddAddressManually("AccessHQ","ABC","CDE", "Melbourne","3000, MELBOURNE, VIC, AU", "VIC", "3000");

	JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
	jse.executeScript("scroll(0, 250)");
	BookAPickupActions.EnterQuantity(NumberOfItems);
	BookAPickupActions.EnterService(ServiceParcelsOffPeak);
	BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
	BookAPickupActions.SelectDestination1(destination, DestinationItem);

	// BookAPickupActions.SelectItemDescriptionTollPriorityAU();
	jse.executeScript("scroll(1000, 1500)");
	BookAPickupActions.SelectDangerousGoods(2);
	BookAPickupActions.SelectItemDescriptionTollPriorityAU();

	// Enter Pickup details
	jse.executeScript("scroll(500, 800)");
	PageBase.MediumWaitForElementEnabled();
	BookAPickupActions.selectDispatchDate();
	ManifestActions.selectReadyTimeJS("07:00");
	BookAPickupActions.ClickReviewBook();
	PageBase.MaximumWaitForElementEnabled();
	PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be before 08:00");
	ManifestActions.selectReadyTimeJS("19:15");
	BookAPickupActions.ClickReviewBook();
	PageBase.MaximumWaitForElementEnabled();
	PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Current carrier does not allow pickup after 1900");
	
	
}
	
	@Test(priority=-2)
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "locationIndex",
		"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGGoodsNo", "palletSpace", "reference",
		"Destination", "DestinationItem","DestinationPostcode", "specialIns", "VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_ACT(String TollCarrier,
		String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, Integer locationIndex,
		String ItemTemplateName, String Length, String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo,
		String palletSpace, String reference, String destination, String DestinationItem,String DestinationPostcode, String specialIns, String VICAddress1) {

	BookAPickupActions.EnterTollCarrier(TollCarrier);
	
	bookAPickupActions.BookAPickupActions.SelectAccountNumber1();
	
	//Add Address
	BookAPickupActions.AddAddressManually("AccessHQ","ABC","CDE","BARTON", "2600, BARTON, ACT, AU", "ACT", "2600");

	JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
	jse.executeScript("scroll(0, 250)");
	BookAPickupActions.EnterQuantity(NumberOfItems);
	BookAPickupActions.EnterService(ServiceParcelsOffPeak);
	BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
	BookAPickupActions.SelectDestination1(destination, DestinationItem);

	// BookAPickupActions.SelectItemDescriptionTollPriorityAU();
	jse.executeScript("scroll(1000, 1500)");
	BookAPickupActions.SelectDangerousGoods(2);
	BookAPickupActions.SelectItemDescriptionTollPriorityAU();

	// Enter Pickup details
	jse.executeScript("scroll(500, 800)");
	PageBase.MediumWaitForElementEnabled();
	BookAPickupActions.selectDispatchDate();
	ManifestActions.selectReadyTimeJS("07:00");
	BookAPickupActions.ClickReviewBook();
	PageBase.MaximumWaitForElementEnabled();
	PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be before 08:00");
	ManifestActions.selectReadyTimeJS("18:15");
	BookAPickupActions.ClickReviewBook();
	PageBase.MaximumWaitForElementEnabled();
	PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be after closing time");
	ManifestActions.selectReadyTimeJS("15:15");
	BookAPickupActions.ClickReviewBook();
	PageBase.MaximumWaitForElementEnabled();
	PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Current carrier does not allow pickup after 1500");
	
}


	@AfterMethod
	public void RunTearDown() throws Exception {
		//BaseWebdriver.tearDown();
	}

}
