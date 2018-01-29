package bookAPickupE2ETests;

import GlobalActions.PageBase;
import GlobalActions.GlobalVariables;

import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import createShipmentActions.ShipmentReviewActions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class Toll_IntermodalTest {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "DestinationItem",
			"specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Refrigeration(String TollCarrier,
			String ServiceRefrigeration, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String DestinationItem,
			String specialIns) {

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		// Select Toll Intermodal
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();

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
		// Mode(=Road)

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

		// Select service
		BookAPickupActions.EnterService(ServiceRefrigeration);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		// BookAPickupActions.ReceiverAccountNumber("1236654");
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);
		// BookAPickupActions.SelectDestination(destination);
		// BookAPickupActions.EnterDestination(destination);

		BookAPickupActions.SelectDestination1(destination, DestinationItem);
		// BookAPickupActions.SelectMode(); defect

		BookAPickupActions.EnterTempretureRefBookinNumbers(tempLow, tempHigh, ref, BookNo);
		BookAPickupActions.EnterVendorDetails(vendorNum);
		BookAPickupActions.EnterTimeSlot();
		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();

		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectDispatchDate();
		// BookAPickupActions.selectReadyTime();

		String pickupTime = BookAPickupActions.GetReadyTime().toString();
		System.out.println(pickupTime);

		// BookAPickupActions.selectClosingTime();

		String closingTime = BookAPickupActions.GetClosingTime().toString();
		System.out.println(closingTime);

		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();

		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();

		

	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "DestinationItem",
			"specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Refrigeration_ConfirmedDetails(String TollCarrier,
			String ServiceRefrigeration, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String DestinationItem,
			String specialIns) {

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		// Select Toll Intermodal
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(Refrigeration),
		// Mode(=Road)

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		// Select service
		BookAPickupActions.EnterService(ServiceRefrigeration);

		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterItem(ItemTemplateName);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

		// BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.SelectDestination1(destination, DestinationItem);
		// BookAPickupActions.SelectMode(); defect

		BookAPickupActions.EnterTempretureRefBookinNumbers(tempLow, tempHigh, ref, BookNo);
		BookAPickupActions.EnterVendorDetails(vendorNum);
		BookAPickupActions.EnterTimeSlot();
		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();

		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectDispatchDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		// BookAPickupActions.selectReadyTime();

		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();

		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		// ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		/* ReviewYouPickupActions.VerifyConfirmPickupDetails(); */
		// ReviewYouPickupActions.VerifyRefrigerationDetails();

	}
@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "ServiceExpress", "AccountNumberTINTER",
			"locationIndex", "ItemTemplateName", "ItemTemplateName2", "Mode", "ChargeToAccount", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh", "refrigerationRefNum",
			"bookInNum", "VendorNum", "palletSpace", "Destination", "DestinationItem", "DestinationPostcode",
			"lookupName", "lookupItem", "PackingGroup", "packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName",
			"DGYes", "DGGoodsYes", "DGGoodsNo", "DangerousGoodsDetailsHeading", "FoodItems", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_DGFreight_ConfirmDetails(String TollCarrier,
			String ServiceDGFreight, String ServiceExpress, String AccountNumberTINTER, Integer locationIndex,
			String ItemTemplateName, String ItemTemplateName2, Integer Mode, String ChargeToAccount, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String DestinationItem,
			String DestinationPostcode, String lookupName, Integer lookupItem, Integer PackingGroup,
			String packageDescription, String pDgPkgQty, String pDgQtyKg, String technicalName, Integer DGYes,
			String DGGoodsYes, String DGGoodsNo, String DangerousGoodsDetailsHeading, String FoodItems,
			String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();
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
		// Verification and enter data for Quick entry mode, service(=DG Freight),
		// Mode(=Road)
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
		String mode = BookAPickupActions.SelectModeItem(Mode);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		String TotalWeight = Weight + " kg";
		// BookAPickupActions.EnterChargeToAccount(ChargeToAccount);
		String chargeToAccount = BookAPickupActions.SelectChargeToAccount2(1);
		// BookAPickupActions.SelectDestination(destination);
		String Destination = BookAPickupActions.SelectDestination1(destination, DestinationItem);
		System.out.println(Destination);

		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// BookAPickupActions.ReceiverAccountNumber("1236654");
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);
		String Volume = volume + " m3";
		// Shipment contain Dangerous goods=yes and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);
		BookAPickupActions.selectContainFoodItem();
		PageBase.Scrollbar(250, 500);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.Scrollbar(500, 1200);

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
		BookAPickupActions.AddANewLine(destination, DestinationItem, ServiceExpress, ItemTemplateName2, NumberOfItems,
				palletSpace, ChargeToAccount, Length, Width, Height, Weight);

		String volume2 = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume2);
		String Volume2 = volume2 + " m3";

		BookAPickupActions.selectContainFoodItem();

		BookAPickupActions.selectDangerousGoodNewLine();
		BookAPickupActions.ClickAddANewLine();

		PageBase.MediumWaitForElementEnabled();

		BookAPickupActions.selectDispatchDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println(pickupDate);

		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		String readyTime = BookAPickupActions.GetReadyTime();
		System.out.println(readyTime);
		String closingTime = BookAPickupActions.GetClosingTime();
		System.out.println(closingTime);
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		String specialInstruction = BookAPickupActions.GetSpecialIns();
		System.out.println(specialInstruction);
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		ReviewYourPickupActions.VerifyPickupDetails(TollCarrier, AccountNumberTINTER, company, companyLocation, name,
				userPhoneNumber, readyTime, closingTime, specialInstruction);
		ReviewYourPickupActions.VerifyItemDetails1("0", "ITEM DETAILS", ItemTemplateName, DestinationPostcode,
				ServiceDGFreight, mode, chargeToAccount, NumberOfItems, palletSpace, Length, Width, Height, Volume,
				TotalWeight, DGGoodsYes, FoodItems);

		ReviewYourPickupActions.VerifyDangerousGoodsDetails(DangerousGoodsDetailsHeading, lookupName, classDivision,
				packingGroup1, subRisk, ProperShippingName, packageDescription, pDgPkgQty, pDgQtyKg, technicalName);

		ReviewYourPickupActions.VerifyItemDetails2("1", "ITEM DETAILS", ItemTemplateName2, DestinationPostcode,
				ServiceExpress, mode, chargeToAccount, NumberOfItems, palletSpace, Length, Width, Height, Volume2,
				TotalWeight, DGGoodsNo, FoodItems);

		ReviewYourPickupActions.ClickConfirmPickup();
		String reference = ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username);
		System.out.println("Book A Pickup reference  " + reference);

	}

	
	
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "DestinationItem", "lookupName",
			"lookupItem", "PackingGroup", "packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName",
			"specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_DGFreight(String TollCarrier,
			String ServiceDGFreight, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String DestinationItem, String lookupName, Integer lookupItem, Integer PackingGroup,
			String packageDescription, String pDgPkgQty, String pDgQtyKg, String technicalName, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();

		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=DG Freight),
		// Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDGFreight);
		// BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectDestination1(destination, DestinationItem);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.SelectModeItem(2);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		// BookAPickupActions.SelectItem(2);
		// BookAPickupActions.EnterItem(ItemTemplateName);
		jse.executeScript("scroll(200, 500)");

		// Shipment contain Dangerous goods=yes and no food items
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();
		PageBase.Scrollbar(250, 500);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		// Pickup details
		PageBase.Scrollbar(500, 1200);
		BookAPickupActions.selectDispatchDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();

		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username);
	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "DestinationItem", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Express(String TollCarrier, String ServiceExpress,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String DestinationItem,
			String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.SelectModeItem(1);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		// BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectDestination1(destination, DestinationItem);
		BookAPickupActions.SelectModeItem(2);

		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectDispatchDate();
		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username);

	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "DestinationItem", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Express_ConfirmedDetails(String TollCarrier,
			String ServiceExpress, Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String palletSpace, String destination, String DestinationItem,
			String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		// Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.SelectModeItem(1);
		BookAPickupActions.EnterQuantity(NumberOfItems);

		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		BookAPickupActions.SelectDestination1(destination, DestinationItem);

		BookAPickupActions.SelectModeItem(2);

		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectDispatchDate();
		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username);

	}
 @Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "ServiceExpress", "locationIndex", "ItemTemplateName",
			"ItemTemplateName2", "ChargeToAccount", "NumberOfItems", "Length", "Width", "Height", "Weight",
			"palletSpace", "Destination", "DestinationItem", "Postcode", "VendorNum", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_General_ConfirmedDetails(String TollCarrier,
			String ServiceGeneral, String ServiceExpress, Integer locationIndex, String ItemTemplateName,
			String ItemTemplateName2, String ChargeToAccount, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String DestinationItem,
			String Postcode, String vendorNum, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterService(ServiceGeneral);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.SelectModeItem(1);

		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);

		BookAPickupActions.EnterChargeToAccount(ChargeToAccount);
		// BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.SelectDestination1(destination, DestinationItem);
		BookAPickupActions.SelectModeItem(1);

		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();
		PageBase.Scrollbar(250, 500);

		jse.executeScript("scroll(500, 800)");
		
		BookAPickupActions.AddANewLine(destination, DestinationItem, ServiceExpress, ItemTemplateName2, NumberOfItems,
				palletSpace, ChargeToAccount, Length, Width, Height, Weight);

		String volume2 = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume2);

		BookAPickupActions.selectContainFoodItem();

		BookAPickupActions.selectDangerousGoodNewLine();
		//BookAPickupActions.ClickAddANewLine();

		PageBase.MediumWaitForElementEnabled();
		
		BookAPickupActions.selectDispatchDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);

		BookAPickupActions.EnterSpecialInstructions(specialIns);
		
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username);

	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "ServiceExpress", "ItemTemplateName2", "locationIndex",
			"ItemTemplateName", "NumberOfItems", "ChargeToAccount", "Length", "Width", "Height", "Weight",
			"palletSpace", "Destination", "DestinationItem", "VendorNum", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_General(String TollCarrier, String ServiceGeneral,
			String ServiceExpress, String ItemTemplateName2, Integer locationIndex, String ItemTemplateName,
			String Length, String NumberOfItems, String ChargeToAccount, String Width, String Height, String Weight,
			String palletSpace, String destination, String DestinationItem, String vendorNum, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterService(ServiceGeneral);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.SelectModeItem(1);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		// BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.SelectDestination1(destination, DestinationItem);
		BookAPickupActions.SelectModeItem(2);

		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();

		// Add a new item
		BookAPickupActions.AddANewLine(destination, DestinationItem, ServiceExpress, ItemTemplateName2, NumberOfItems,
				palletSpace, ChargeToAccount, Length, Width, Height, Weight);

		String volume2 = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume2);

		BookAPickupActions.selectContainFoodItem();

		BookAPickupActions.selectDangerousGoodNewLine();

		PageBase.MediumWaitForElementEnabled();

		BookAPickupActions.SelectModeItem(2);
		BookAPickupActions.selectDispatchDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);

		BookAPickupActions.EnterSpecialInstructions(specialIns);

		// Submit Book a pickup details
				BookAPickupActions.ClickReviewBook();
				BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
				PageBase.MaximumWaitForElementEnabled();

				// Confirm Pickup and Verify pickup confirmation details
				ReviewYourPickupActions.ClickConfirmPickup();
				ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username);
	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "ServiceExpress", "locationIndex", "ItemTemplateName",
			"ItemTemplateName2", "ChargeToAccount", "NumberOfItems", "Length", "Width", "Height", "Weight",
			"palletSpace", "Destination", "DestinationItem", "Postcode", "VendorNum", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_General_AddLineItemMaximum99(String TollCarrier,
			String ServiceGeneral, String ServiceExpress, Integer locationIndex, String ItemTemplateName,
			String ItemTemplateName2, String ChargeToAccount, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String DestinationItem,
			String Postcode, String vendorNum, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterService(ServiceGeneral);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.SelectModeItem(1);

		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);

		BookAPickupActions.EnterChargeToAccount(ChargeToAccount);
		// BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.SelectDestination1(destination, DestinationItem);
		BookAPickupActions.SelectModeItem(1);

		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();
		PageBase.Scrollbar(250, 500);

		jse.executeScript("scroll(500, 800)");

		for (int i = 1; i < 99; i++) {

			// Add a new item
			PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.AddANewLine(destination, DestinationItem, ServiceExpress, ItemTemplateName2,
					NumberOfItems, palletSpace, ChargeToAccount, Length, Width, Height, Weight);

			BookAPickupActions.selectContainFoodItem();

			BookAPickupActions.selectDangerousGoodNewLine();
			BookAPickupActions.ClickAddANewLine();

			PageBase.MediumWaitForElementEnabled();

			System.out.println("NUMBER OF LINE ITEMS ====" + i);
		}

		BookAPickupActions.selectDispatchDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);

		BookAPickupActions.selectDispatchDate();

		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();

		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();

	}

	@AfterMethod
	public void RunTearDown() throws Exception {
	BaseWebdriver.tearDown();

	}

}
