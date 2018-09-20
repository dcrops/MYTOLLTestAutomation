package bookAPickup.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Global.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickup.BookAPickupActions;
import manifest.ManifestActions;
import myTollHomePage.MyTollHomePageActions;
import reviewYourPickup.ReviewYourPickupActions;

public class TollPriorityAusTest {

	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}

	//@Test(priority=-7)
	@Test(groups = { "Shakeout Testing","E2E" })
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb1", "Suburb1Option", "Postcode1", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns" })

	public void BookAPickup_TollPriority_AUS_E2ETest_TID_620_Service_ServiceParcelsOffPeak_SalesforceVerification(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, String location, String Country,
			String AddressLine1, String AddressLine2, String Suburb1, String Suburb1Option, String Postcode1,
			String Email, String PhoneNumber, String PhoneCountry1, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo, String palletSpace,
			String reference, String destination, String DestinationItem, String DestinationPostcode,
			String specialIns) throws Exception {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTollPrioAu);

		String accountNumber = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNumber);
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		// Add Address
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE",
		// "Melbourne","3000, MELBOURNE, VIC, AU", "VIC", "3000");
		// BookAPickupActions.AddAddressAustraliaManuallyPrioAUS(location,Country,AddressLine1,AddressLine2,
		// "Melbourne","3004, MELBOURNE, VIC, AU", "NNAutomationuser1@gmail.com",
		// "412367897", "Australia");
		// BookAPickupActions.ClickAddAddress();
		// BookAPickupActions.SelectLocation2(locationIndex);

		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb1,
				Suburb1Option, Postcode1, Email, PhoneNumber, PhoneCountry1);

		String company = BookAPickupActions.GetCompany();
		System.out.println(company);
		// String location = BookAPickupActions.GetLocation(1);
		// System.out.println(location);
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
		// BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		ReviewYourPickupActions.VerifyPickupDetails(TollCarrier, AccountNumberTollPrioAu, location,
				"ABC CDE MELBOURNE VIC 3004 AU", name, userPhoneNumber, readyTime, closingTime, specialInstruction);
		ReviewYourPickupActions.VerifyItemDetails1TollPrioAU("0", "ITEM DETAILS", "Box / Carton", DestinationPostcode,
				ServiceParcelsOffPeak, NumberOfItems, Length, Width, Height, TotalWeight, DGGoodsNo);

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
		String reference1=BookAPickupActions.GetReferenceNumber();
		int lengthRefrence=reference1.length();
		String ReferenceNumber=reference1.substring(18, lengthRefrence);
		System.out.println("Book A Pickup reference  " + reference1);
		System.out.println("ReferenceNumber " + ReferenceNumber);
//		BaseWebdriver.LaunchSalesforce();
//		Salesforce.LoginSalesforce(BaseWebdriver.SalesforceUser,BaseWebdriver.SalesforcePassword);
//		Salesforce.ClickLocation();
//		Salesforce.searchPickup(ReferenceNumber);
//		Salesforce.searchPickup(ReferenceNumber);
//		Salesforce.ClickSearchResultsNumber();

	}

	@Test(priority=-1)
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb1", "Suburb1Option", "Postcode1", "Suburb2", "Suburb2Option",
			"Postcode2", "Suburb3", "Suburb3Option", "Postcode3", "Suburb4", "Suburb4Option", "Postcode4","Email", "PhoneNumber", "PhoneCountry1",
			"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo", "palletSpace",
			"reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns", "VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_VIC_3000(String TollCarrier, String ServiceParcelsOffPeak,
			String AccountNumberTollPrioAu, String location, String Country, String AddressLine1, String AddressLine2,
			String Suburb1, String Suburb1Option, String Postcode1, String Suburb2, String SuburbOption2,
			String Postcode2, String Suburb3, String SuburbOption3, String Postcode3, String Suburb4, String SuburbOption4, String Postcode4,String Email, String PhoneNumber,
			String PhoneCountry1, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String DGGoodsNo, String palletSpace, String reference, String destination,
			String DestinationItem, String DestinationPostcode, String specialIns, String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE",
		// "Melbourne","3000, MELBOURNE, VIC, AU", "VIC", "3000");
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb1,
				Suburb1Option, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.ClickAddAddress();
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
		ManifestActions.selectClosingTimeJS("20:00");
		ManifestActions.selectReadyTimeJS("19:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1900");

		// *******//BookAPickup_TollPriority_AUS_CutoffTime_VIC_BULLA_3428//********//
		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb2,
				SuburbOption2, Postcode2, Email, PhoneNumber, PhoneCountry1);
		// Enter Pickup details
		jse.executeScript("scroll(500, 800)");
		PageBase.MediumWaitForElementEnabled();
		BookAPickupActions.selectDispatchDate();
		ManifestActions.selectReadyTimeJS("07:00");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		/*
		 * PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
		 * "Ready time can not be before 08:00");
		 * ManifestActions.selectClosingTimeJS("20:00");
		 * ManifestActions.selectReadyTimeJS("19:15");
		 * BookAPickupActions.ClickReviewBook();
		 * PageBase.MaximumWaitForElementEnabled();
		 * PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
		 * "Current carrier does not allow pickup after 1900");
		 */

		// *********BookAPickup_TollPriority_AUS_CutoffTime_ACT_2600********//

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb3,
				SuburbOption3, Postcode3, Email, PhoneNumber, PhoneCountry1);

		// BookAPickupActions.SelectItemDescriptionTollPriorityAU();
		jse.executeScript("scroll(1000, 1500)");
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.SelectItemDescriptionTollPriorityAU();

		// Enter Pickup details
		jse.executeScript("scroll(500, 800)");
		PageBase.MediumWaitForElementEnabled();
		BookAPickupActions.SelectDispatchDateTomorrow();
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
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1500");
		
		//************BookAPickup_TollPriority_AUS_CutoffTime_NT_0800**************//
		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb4,
				SuburbOption4, Postcode4, Email, PhoneNumber, PhoneCountry1);
		
		// Enter Pickup details
				jse.executeScript("scroll(500, 800)");
				PageBase.MediumWaitForElementEnabled();
				BookAPickupActions.SelectDispatchDateTomorrow();
				;
				ManifestActions.selectReadyTimeJS("07:00");
				BookAPickupActions.ClickReviewBook();
				PageBase.MaximumWaitForElementEnabled();
				PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be before 08:00");
				ManifestActions.selectReadyTimeJS("18:15");
				BookAPickupActions.ClickReviewBook();
				PageBase.MaximumWaitForElementEnabled();
				PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be after closing time");
				ManifestActions.selectReadyTimeJS("16:00");
				BookAPickupActions.ClickReviewBook();
				PageBase.MaximumWaitForElementEnabled();
				PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
						"Current carrier does not allow pickup after 1545");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb2", "Suburb2Option", "Postcode2", "Suburb3", "Suburb3Option",
			"Postcode3", "Email", "PhoneNumber", "PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length",
			"Width", "Height", "Weight", "DGGoodsNo", "palletSpace", "reference", "Destination", "DestinationItem",
			"DestinationPostcode", "specialIns", "VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_VIC_BULLA_3428(String TollCarrier, String ServiceParcelsOffPeak,
			String AccountNumberTollPrioAu, String location, String Country, String AddressLine1, String AddressLine2,
			String Suburb1, String SuburbOption, String Postcode1, String Email, String PhoneNumber,
			String PhoneCountry1, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String DGGoodsNo, String palletSpace, String reference, String destination,
			String DestinationItem, String DestinationPostcode, String specialIns, String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb1,
				SuburbOption, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE",
		// "BULLA","3428, BULLA, VIC, AU", "VIC", "3428");
		// BookAPickupActions.ClickAddAddress();
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
		/*
		 * PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
		 * "Ready time can not be before 08:00");
		 * ManifestActions.selectClosingTimeJS("20:00");
		 * ManifestActions.selectReadyTimeJS("19:15");
		 * BookAPickupActions.ClickReviewBook();
		 * PageBase.MaximumWaitForElementEnabled();
		 * PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
		 * "Current carrier does not allow pickup after 1900");
		 * 
		 */

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb3", "Suburb3Option", "Postcode3", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_ACT_2600(String TollCarrier, String ServiceParcelsOffPeak,
			String AccountNumberTollPrioAu, String location, String Country, String AddressLine1, String AddressLine2,
			String Suburb1, String SuburbOption, String Postcode1, String Email, String PhoneNumber,
			String PhoneCountry1, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String DGGoodsNo, String palletSpace, String reference, String destination,
			String DestinationItem, String DestinationPostcode, String specialIns, String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb1,
				SuburbOption, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","BARTON",
		// "2600, BARTON, ACT, AU", "ACT", "2600");
		// BookAPickupActions.ClickAddAddress();
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
		BookAPickupActions.SelectDispatchDateTomorrow();
		ManifestActions.selectReadyTimeJS("07:00");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be before 08:00");
		ManifestActions.selectReadyTimeJS("18:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time should be before closing time");
		ManifestActions.selectReadyTimeJS("15:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1500");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb4", "Suburb4Option", "Postcode4", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_NT_0800(String TollCarrier, String ServiceParcelsOffPeak,
			String AccountNumberTollPrioAu, String location, String Country, String AddressLine1, String AddressLine2,
			String Suburb1, String SuburbOption, String Postcode1, String Email, String PhoneNumber,
			String PhoneCountry1, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String DGGoodsNo, String palletSpace, String reference, String destination,
			String DestinationItem, String DestinationPostcode, String specialIns, String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb1,
				SuburbOption, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","DARWIN",
		// "0800, DARWIN, NT, AU", "NT", "0800");
		// BookAPickupActions.ClickAddAddress();
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
		BookAPickupActions.SelectDispatchDateTomorrow();
		;
		ManifestActions.selectReadyTimeJS("07:00");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be before 08:00");
		ManifestActions.selectReadyTimeJS("18:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be after closing time");
		ManifestActions.selectReadyTimeJS("16:00");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1545");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb5", "Suburb5Option", "Postcode5", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_NT_HOTHAM_0822(String TollCarrier, String ServiceParcelsOffPeak,
			String AccountNumberTollPrioAu, String location, String Country, String AddressLine1, String AddressLine2,
			String Suburb1, String SuburbOption, String Postcode1, String Email, String PhoneNumber,
			String PhoneCountry1, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String DGGoodsNo, String palletSpace, String reference, String destination,
			String DestinationItem, String DestinationPostcode, String specialIns, String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb1,
				SuburbOption, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","HOTHAM",
		// "0822, HOTHAM, NT, AU", "NT", "0822");
		// BookAPickupActions.ClickAddAddress();
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
		BookAPickupActions.SelectDispatchDateTomorrow();
		ManifestActions.selectReadyTimeJS("07:00");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be before 08:00");
		ManifestActions.selectReadyTimeJS("18:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be after closing time");
		ManifestActions.selectReadyTimeJS("08:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 800");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb6", "Suburb6Option", "Postcode6", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_NSW_BUNDEMAR_2823(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, String location, String Country,
			String AddressLine1, String AddressLine2, String Suburb1, String SuburbOption, String Postcode1,
			String Email, String PhoneNumber, String PhoneCountry1, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo, String palletSpace,
			String reference, String destination, String DestinationItem, String DestinationPostcode, String specialIns,
			String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb1,
				SuburbOption, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","BUNDEMAR",
		// "2823, BUNDEMAR, NSW, AU", "NSW", "2823");
		// BookAPickupActions.ClickAddAddress();
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
		BookAPickupActions.SelectDispatchDateTomorrow();
		ManifestActions.selectReadyTimeJS("07:00");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be before 08:00");
		ManifestActions.selectReadyTimeJS("18:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time should be before closing time");
		ManifestActions.selectReadyTimeJS("09:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 900");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb7", "Suburb7Option", "Postcode7", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_QLD_BRISBANE_CITY_4000(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, String location, String Country,
			String AddressLine1, String AddressLine2, String Suburb1, String SuburbOption, String Postcode1,
			String Email, String PhoneNumber, String PhoneCountry1, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo, String palletSpace,
			String reference, String destination, String DestinationItem, String DestinationPostcode, String specialIns,
			String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2, Suburb1,
				SuburbOption, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","BRISBANE
		// CITY", "4000, BRISBANE CITY, QLD, AU", "QLD", "4000");
		// BookAPickupActions.ClickAddAddress();
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
		BookAPickupActions.SelectDispatchDateTomorrow();
		ManifestActions.selectReadyTimeJS("07:00");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be before 08:00");
		ManifestActions.selectReadyTimeJS("18:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg, "Ready time can not be after closing time");
		ManifestActions.selectClosingTimeJS("00:00");
		ManifestActions.selectReadyTimeJS("23:59");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 0015");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb8", "Suburb8Option", "Postcode8", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_QLD_SOUTH_BRISBANE_4101(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, String location, String Country,
			String AddressLine1, String AddressLine2, String Suburb1, String SuburbOption, String Postcode1,
			String Email, String PhoneNumber, String PhoneCountry1, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo, String palletSpace,
			String reference, String destination, String DestinationItem, String DestinationPostcode, String specialIns,
			String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2,
				SuburbOption, Suburb1, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","SOUTH
		// BRISBANE", "4101, SOUTH BRISBANE, QLD, AU", "QLD", "4101");
		// BookAPickupActions.ClickAddAddress();
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
		ManifestActions.selectClosingTimeJS("20:00");
		ManifestActions.selectReadyTimeJS("19:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1900");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb9", "Suburb9Option", "Postcode9", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_SA_FOUNTAIN_VALLEY_5159(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, String location, String Country,
			String AddressLine1, String AddressLine2, String Suburb1, String SuburbOption, String Postcode1,
			String Email, String PhoneNumber, String PhoneCountry1, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo, String palletSpace,
			String reference, String destination, String DestinationItem, String DestinationPostcode, String specialIns,
			String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2,
				SuburbOption, Suburb1, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","FOUNTAIN
		// VALLEY", "5159, FOUNTAIN VALLEY, SA, AU", "SA", "5159");
		// BookAPickupActions.ClickAddAddress();
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
		ManifestActions.selectReadyTimeJS("13:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1300");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb10", "Suburb10Option", "Postcode10", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_SA_CLARENDON_5157(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, String location, String Country,
			String AddressLine1, String AddressLine2, String Suburb1, String SuburbOption, String Postcode1,
			String Email, String PhoneNumber, String PhoneCountry1, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo, String palletSpace,
			String reference, String destination, String DestinationItem, String DestinationPostcode, String specialIns,
			String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2,
				SuburbOption, Suburb1, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","CLARENDON",
		// "5157, CLARENDON, SA, AU", "SA", "5157");
		// BookAPickupActions.ClickAddAddress();

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
		ManifestActions.selectReadyTimeJS("10:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1000");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb11", "Suburb11Option", "Postcode11", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_TAS_TAROONA_7053(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, String location, String Country,
			String AddressLine1, String AddressLine2, String Suburb1, String SuburbOption, String Postcode1,
			String Email, String PhoneNumber, String PhoneCountry1, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo, String palletSpace,
			String reference, String destination, String DestinationItem, String DestinationPostcode, String specialIns,
			String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2,
				SuburbOption, Suburb1, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","TAROONA",
		// "7053, TAROONA, TAS, AU", "TAS", "7053");
		// BookAPickupActions.ClickAddAddress();

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
		ManifestActions.selectClosingTimeJS("20:00");
		ManifestActions.selectReadyTimeJS("19:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1900");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb12", "Suburb12Option", "Postcode12", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_TAS_BAKERS_BEACH_7307(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, String location, String Country,
			String AddressLine1, String AddressLine2, String Suburb1, String SuburbOption, String Postcode1,
			String Email, String PhoneNumber, String PhoneCountry1, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo, String palletSpace,
			String reference, String destination, String DestinationItem, String DestinationPostcode, String specialIns,
			String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2,
				SuburbOption, Suburb1, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","BAKERS
		// BEACH", "7307, BAKERS BEACH, TAS, AU", "TAS", "7307");
		// BookAPickupActions.ClickAddAddress();

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
		ManifestActions.selectReadyTimeJS("11:45");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1130");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb13", "Suburb13Option", "Postcode13", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_WA_PERTH_6000(String TollCarrier, String ServiceParcelsOffPeak,
			String AccountNumberTollPrioAu, String location, String Country, String AddressLine1, String AddressLine2,
			String Suburb1, String SuburbOption, String Postcode1, String Email, String PhoneNumber,
			String PhoneCountry1, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String DGGoodsNo, String palletSpace, String reference, String destination,
			String DestinationItem, String DestinationPostcode, String specialIns, String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2,
				SuburbOption, Suburb1, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","PERTH",
		// "6000, PERTH, WA, AU", "WA", "6000");
		// BookAPickupActions.ClickAddAddress();

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
		ManifestActions.selectReadyTimeJS("16:15");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1600");

	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "AccountNumberTollPrioAu", "location", "Country",
			"AddressLine1", "AddressLine2", "Suburb14", "Suburb14Option", "Postcode14", "Email", "PhoneNumber",
			"PhoneCountry1", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoodsNo",
			"palletSpace", "reference", "Destination", "DestinationItem", "DestinationPostcode", "specialIns",
			"VICAddress1" })

	public void BookAPickup_TollPriority_AUS_CutoffTime_WA_MARMION_6020(String TollCarrier,
			String ServiceParcelsOffPeak, String AccountNumberTollPrioAu, String location, String Country,
			String AddressLine1, String AddressLine2, String Suburb1, String SuburbOption, String Postcode1,
			String Email, String PhoneNumber, String PhoneCountry1, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String DGGoodsNo, String palletSpace,
			String reference, String destination, String DestinationItem, String DestinationPostcode, String specialIns,
			String VICAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickup.BookAPickupActions.SelectAccountNumber1();

		// Add Address
		BookAPickupActions.AddAddressManuallyPrioAUSDomestic(location, Country, AddressLine1, AddressLine2,
				SuburbOption, Suburb1, Postcode1, Email, PhoneNumber, PhoneCountry1);
		// BookAPickupActions.AddAddressManuallyTDF("AccessHQ","ABC","CDE","MARMION",
		// "6020, MARMION, WA, AU", "WA", "6020");
		// BookAPickupActions.ClickAddAddress();

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
		ManifestActions.selectReadyTimeJS("12:45");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(BookAPickupActions.beforeTimeErrorMsg,
				"Current carrier does not allow pickup after 1230");

	}

	@AfterMethod(alwaysRun = true)
	public void RunTearDown() throws Exception {
		 BaseWebdriver.tearDown();
	}

}
