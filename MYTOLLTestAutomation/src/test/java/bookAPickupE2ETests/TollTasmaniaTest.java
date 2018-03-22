package bookAPickupE2ETests;

import GlobalActions.GlobalVariables;
import GlobalActions.PageBase;
import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;

import reviewYourPickupActions.ReviewYourPickupActions;

public class TollTasmaniaTest {

	public static Integer locationIndex = 4;

	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}

	@Test(priority=-1)
	@Parameters({ "TollCarrierTollTasmania","AccountNumberTollTas", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns" })

	public void TollTasmania_E2ETest_TID_1033_Service_Refrigeration(String TollCarrier, String AccountNumberTollTas,String ServiceRefrigeration,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String tempLow, String tempHigh, String ref, String BookNo, String vendorNum,
			String palletSpace, String destination, String specialIns) {

		// Select TollTasmania
		PageBase.WaitForElement(BookAPickupActions.TollCarrierDropdown, 10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTollTas);

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);
		String accno = BookAPickupActions.GetAccountNumber().toString();
		System.out.println(accno);
		BookAPickupActions.SelectLocation2(locationIndex);

		String company = BookAPickupActions.GetCompany(locationIndex).toString();
		System.out.println(company);

		String location = BookAPickupActions.GetLocation(locationIndex).toString();
		System.out.println(location);

		String name = BookAPickupActions.GetName().toString();
		System.out.println(name);

		String phoneNumber = BookAPickupActions.GetPhoneNumber().toString();
		System.out.println(phoneNumber);

		String countryCode = BookAPickupActions.GetCountryCode().toString();
		System.out.println(countryCode);

		// Verification and enter data for Quick entry mode, service(Refrigeration),
		
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		// Select service
		BookAPickupActions.EnterService(ServiceRefrigeration);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.SelectDestination(destination);
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);

		PageBase.Scrollbar(500, 1000);
		BookAPickupActions.selectDangerousGood();

		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.SelectDispatchDateTomorrow();
		// BookAPickupActions.selectReadyTime();

		String pickupTime = BookAPickupActions.GetReadyTime().toString();
		System.out.println(pickupTime);

		// BookAPickupActions.selectClosingTime();

		String closingTime = BookAPickupActions.GetClosingTime().toString();
		System.out.println(closingTime);

		BookAPickupActions.EnterSpecialInstructions(specialIns);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);

	}

	@Test(groups = { "Shakeout Testing" })
	@Parameters({ "TollCarrierTollTasmania", "AccountNumberTollTas","ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "DestinationItem",
			"specialIns" })

	public void TollTasmania_E2ETest_TID_1033_Service_Refrigeration_ConfirmDetails(String TollCarrier, String AccountNumberTollTas,
			String ServiceRefrigeration, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String DestinationItem,
			String specialIns) {

		// Select TollTasmania
		PageBase.WaitForElement(BookAPickupActions.TollCarrierDropdown, 10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTollTas);
		//bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(Refrigeration),
		// Mode(=Road)

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
	
		// Select service
		BookAPickupActions.EnterService(ServiceRefrigeration);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		
		BookAPickupActions.SelectDestination1(destination, DestinationItem);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

		PageBase.Scrollbar(500, 1000);
		BookAPickupActions.selectDangerousGood();

		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.SelectDispatchDateTomorrow();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		// BookAPickupActions.selectReadyTime();

		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
	}

	@Test

	@Parameters({ "TollCarrierTollTasmania", "ServiceDGFreight", "ServiceExpress", "AccountNumberTollTas",
			"ItemTemplateName2", "locationIndex", "ItemTemplateName", "ChargeToAccount", "NumberOfItems", "Length",
			"Width", "Height", "Weight", "DGGoodsYes", "DGGoodsNo", "FoodItems", "palletSpace", "Destination",
			"DestinationItem", "DestinationPostcode", "lookupName", "PackingGroup", "packageDescription", "pDgPkgQty",
			"pDgQtyKg", "DangerousGoodsDetailsHeading", "technicalName", "specialIns" })

	public void TollTasmania_E2ETest_TID_1033_Service_DGFreight_ConfirmDetails(String TollCarrier,
			String ServiceDGFreight, String ServiceExpress, String AccountNumberTollTas, String ItemTemplateName2,
			Integer locationIndex, String ItemTemplateName, String ChargeToAccount, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String DGGoodsYes, String DGGoodsNo, String FoodItems,
			String palletSpace, String destination, String DestinationItem, String DestinationPostcode,
			String lookupName, Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg,
			String DangerousGoodsDetailsHeading, String technicalName, String specialIns) {

		// Select TollTasmania
		PageBase.WaitForElement(BookAPickupActions.TollCarrierDropdown, 10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTollTas);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
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

		String userPhoneNumber = countryCode + "-" + phoneNumberModified;
		System.out.println(userPhoneNumber);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDGFreight);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.SelectDestination(destination);
		String TotalWeight = Weight + " kg";
		String chargeToAccount = BookAPickupActions.SelectChargeToAccount2(1);
		// String Destination = BookAPickupActions.SelectDestination1(destination,
		// DestinationItem);
		// System.out.println(Destination);

		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);
		String Volume = volume + " m3";

		BookAPickupActions.SelectDangerousGoods(1);
		PageBase.Scrollbar(500, 1000);
		// Enter dangerous goods details
		BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);

		String un = BookAPickupActions.GetUNNumber();
		System.out.println("Un----" + un);
		String classDivision = BookAPickupActions.GetClassDivision();
		System.out.println("Class----" + classDivision);
		String subRisk = BookAPickupActions.GetSubRisk();
		System.out.println("Subrisk----" + subRisk);
		String packingGroup1 = BookAPickupActions.GetPackingGroup();
		System.out.println("packingGroup1" + packingGroup1);
		String ProperShippingName = BookAPickupActions.GetProperShippingName();
		System.out.println("ProperShippingName" + ProperShippingName);

		// Add a new item
		BookAPickupActions.AddANewLineTollNQX(destination, DestinationItem, ServiceExpress, ItemTemplateName2,
				NumberOfItems, palletSpace, ChargeToAccount, Length, Width, Height, Weight);

		String volume2 = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume2);
		String Volume2 = volume2 + " m3";

		BookAPickupActions.selectDangerousGoodNewLine();
		BookAPickupActions.ClickAddANewLine();

		PageBase.MediumWaitForElementEnabled();
		PageBase.MoveToElement(BookAPickupActions.weight,BookAPickupActions.length);
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

		ReviewYourPickupActions.VerifyPickupDetails(tollCarrier, accountNo, company, companyLocation, name,
				userPhoneNumber, readyTime, closingTime, specialInstruction);
		ReviewYourPickupActions.VerifyItemDetails1TollTasmania("0", "ITEM DETAILS", ItemTemplateName,
				DestinationPostcode, ServiceDGFreight, chargeToAccount, NumberOfItems, palletSpace, Length, Width,
				Height, Volume, TotalWeight, DGGoodsYes);

		ReviewYourPickupActions.VerifyDangerousGoodsDetails(DangerousGoodsDetailsHeading, lookupName, classDivision,
				packingGroup1, subRisk, ProperShippingName, packageDescription, pDgPkgQty, pDgQtyKg, technicalName);

		ReviewYourPickupActions.VerifyItemDetails2TollTasmania("1", "ITEM DETAILS", ItemTemplateName2,
				DestinationPostcode, ServiceExpress, chargeToAccount, NumberOfItems, palletSpace, Length, Width, Height,
				Volume2, TotalWeight, DGGoodsNo);

		ReviewYourPickupActions.ClickConfirmPickup();
		String reference = ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
		System.out.println("Book A Pickup reference  " + reference);
	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "AccountNumberTollTas", "ServiceDGFreight", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName", "lookupItem",
			"PackingGroup", "packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName", "specialIns" })
	public void TollTasmania_E2ETest_TID_1033_Service_DGFreight(String TollCarrier, String AccountNumberTollTas, String ServiceDGFreight,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String lookupName, Integer lookupItem,
			Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg, String technicalName,
			String specialIns) {

		// Select TollTasmania
		PageBase.WaitForElement(BookAPickupActions.TollCarrierDropdown, 10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTollTas);
		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=DG Freight),
		// Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDGFreight);
		BookAPickupActions.VerifyModeIsNotAvailable();
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.SelectDestination(destination);

		// BookAPickupActions.SelectMode();

		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.SelectDangerousGoods(1);
		PageBase.Scrollbar(500, 800);
		// Enter dangerous goods details

		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);

		// Pickup details
		PageBase.Scrollbar(800, 1000);
		PageBase.MoveToElement(BookAPickupActions.weight,BookAPickupActions.length);
		BookAPickupActions.SelectDispatchDateTomorrow();
		// String pickupDate = BookAPickupActions.ReturnPickupDate();

		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "AccountNumberTollTas","ServiceExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void TollTasmania_E2ETest_TID_1033_Service_Express(String TollCarrier, String AccountNumberTollTas,String ServiceExpress,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String specialIns) {
		// Select TollTasmania
		PageBase.WaitForElement(BookAPickupActions.TollCarrierDropdown, 10);
		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTollTas);

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		// Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		BookAPickupActions.SelectDestination(destination);

		// BookAPickupActions.ReceiverAccountNumber("1236654");

		BookAPickupActions.SelectDangerousGoods(2);
		PageBase.Scrollbar(500, 1000);
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.SelectDispatchDateTomorrow();
		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);

	}

	@Test
	@Parameters({ "TollCarrierTollTasmania","AccountNumberTollTas", "ServiceExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void TollTasmania_E2ETest_TID_1033_Service_Express_ConfirmDetails(String TollCarrier,String AccountNumberTollTas, String ServiceExpress,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String specialIns) {

		// Select TollTasmania
		PageBase.WaitForElement(BookAPickupActions.TollCarrierDropdown, 10);
		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTollTas);
		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,

		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		// Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);

		PageBase.Scrollbar(500, 1000);
		BookAPickupActions.SelectDangerousGoods(2);

		BookAPickupActions.SelectDispatchDateTomorrow();
		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);

	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "AccountNumberTollTas","ServiceGeneral", "locationIndex", "ItemTemplateName", "ChargeToAccount",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "DGGoods", "FoodItems", "palletSpace",
			"Destination", "Postcode", "VendorNum", "specialIns" })

	public void BookAPickup_TollTasmania_E2ETest_TID_1033_Service_General(String TollCarrier,String AccountNumberTollTas, String ServiceGeneral,
			Integer locationIndex, String ItemTemplateName, String ChargeToAccount, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String DGGoods, String FoodItems, String palletSpace,
			String destination, String Postcode, String vendorNum, String specialIns) {

		PageBase.WaitForElement(BookAPickupActions.TollCarrierDropdown, 10);

		// Select TollTasmania
		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTollTas);

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);
		// Verification and enter data for Quick entry mode, service(=General),

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceGeneral);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);
		// BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.EnterChargeToAccount(ChargeToAccount);
		BookAPickupActions.SelectDestination(destination);

		// BookAPickupActions.SelectMode();

		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.SelectDangerousGoods(2);
		// BookAPickupActions.selectContainFoodItem();

		// Add a new item
		BookAPickupActions.AddANewLineTollTasmania(ServiceGeneral);
		PageBase.MoveToElement(BookAPickupActions.weight,BookAPickupActions.length);
		BookAPickupActions.SelectDispatchDateTomorrow();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);

	}

	@Test

	@Parameters({ "TollCarrierTollTasmania", "AccountNumberTollTas","ServiceGeneral", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void BookAPickup_TollTasmania_E2ETest_TID_1033_Service_General_ConfirmDetails(String TollCarrier, String AccountNumberTollTas,
			String ServiceGeneral, Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String palletSpace, String destination, String specialIns) {

		PageBase.WaitForElement(BookAPickupActions.TollCarrierDropdown, 10);

		// Select TollTasmania
		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTollTas);

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,

		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		// Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceGeneral);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		BookAPickupActions.SelectDestination(destination);
		// BookAPickupActions.SelectMode();

		jse.executeScript("scroll(200, 500)");
		BookAPickupActions.SelectDangerousGoods(2);
		// BookAPickupActions.selectContainFoodItem();
		PageBase.Scrollbar(500, 1000);
		// Add a new item
		BookAPickupActions.AddANewLineTollTasmania(ServiceGeneral);

		BookAPickupActions.SelectDispatchDateTomorrow();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions,BookAPickupActions.specialInstructions);
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);

	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();
	}

}
