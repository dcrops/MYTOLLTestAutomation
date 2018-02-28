package bookAPickupE2ETests;

import bookAPickupActions.BookAPickupActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.GlobalVariables;
import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class IntermodalSpecializedTest {
	public static Integer locationIndex = 4;

	@Parameters("browser")
	//@BeforeMethod(alwaysRun = true)
	@BeforeMethod
	public void RunSetup(String browser) throws Exception {
		//BaseWebdriver.setUp();
		BaseWebdriver.SetUp(browser);
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	@Test 
	@Parameters({"TollCarrierIntermodalSpecialized","AccountNumberTINTER", "ServiceDangerousGoods", "ServiceExpress", "AccountNumberTollNQX",
			"ItemTemplateName2", "locationIndex", "ItemTemplateName", "ChargeToAccount", "NumberOfItems", "Length",
			"Width", "Height", "Weight", "DGGoodsYes", "DGGoodsNo", "FoodItems", "palletSpace", "Destination",
			"DestinationItem", "DestinationPostcode", "lookupName", "PackingGroup", "packageDescription", "pDgPkgQty",
			"pDgQtyKg", "DangerousGoodsDetailsHeading", "technicalName", "specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_DangerousGoods(String TollCarrierIntermodalSpecialized, String AccountNumberTINTER,
			String ServiceDangerousGoods, String ServiceExpress, String AccountNumberTollNQX, String ItemTemplateName2,
			Integer locationIndex, String ItemTemplateName, String ChargeToAccount, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String DGGoodsYes, String DGGoodsNo, String FoodItems,
			String palletSpace, String destination, String DestinationItem, String DestinationPostcode,
			String lookupName, Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg,
			String DangerousGoodsDetailsHeading, String technicalName, String specialIns) throws Exception {
		/*BaseWebdriver.SetUp(browser);
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();*/
		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrierIntermodalSpecialized);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
	
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

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
		BookAPickupActions.EnterService(ServiceDangerousGoods);
		BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		String TotalWeight = Weight + " kg";
		String chargeToAccount = BookAPickupActions.SelectChargeToAccount2(1);
		String Destination = BookAPickupActions.SelectDestination1(destination, DestinationItem);
		System.out.println(Destination);

		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// BookAPickupActions.ReceiverAccountNumber("1236654");
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);
		String Volume = volume + " m3";
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.weight);
		// Shipment contain Dangerous goods=yes and no food items
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

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

		BookAPickupActions.selectContainFoodItem();

		BookAPickupActions.selectDangerousGoodNewLine();
		BookAPickupActions.ClickAddANewLine();

		PageBase.MediumWaitForElementEnabled();
		BookAPickupActions.selectDispatchDate();
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
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		ReviewYourPickupActions.VerifyPickupDetails(tollCarrier, accountNo, company, companyLocation, name,
				userPhoneNumber, readyTime, closingTime, specialInstruction);
		ReviewYourPickupActions.VerifyItemDetails1TollNQX("0", "ITEM DETAILS", ItemTemplateName, DestinationPostcode,
				ServiceDangerousGoods, chargeToAccount, NumberOfItems, palletSpace, Length, Width, Height, Volume,
				TotalWeight, DGGoodsYes, FoodItems);

		ReviewYourPickupActions.VerifyDangerousGoodsDetails(DangerousGoodsDetailsHeading, lookupName, classDivision,
				packingGroup1, subRisk, ProperShippingName, packageDescription, pDgPkgQty, pDgQtyKg, technicalName);

		ReviewYourPickupActions.VerifyItemDetails2TollNQX("1", "ITEM DETAILS", ItemTemplateName2, DestinationPostcode,
				ServiceExpress, chargeToAccount, NumberOfItems, palletSpace, Length, Width, Height, Volume2,
				TotalWeight, DGGoodsNo, FoodItems);

		ReviewYourPickupActions.ClickConfirmPickup();
		String reference = ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
		System.out.println("Book A Pickup reference  " + reference);
	}

  /*	@Test(groups = { "Shakeout Testing" })
	@Parameters({ "TollCarrierIntermodalSpecialized","AccountNumberTINTER", "ServiceExpress", "ServiceDangerousGoods", "locationIndex",
			"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination",
			"lookupName",  "PackingGroup", "packageDescription", "pDgPkgQty",
			"pDgQtyKg", "DangerousGoodsDetailsHeading", "technicalName", "specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_Express(String TollCarrier, String AccountNumberTINTER,
			String ServiceExpress, String ServiceDangerousGoods, Integer locationIndex, String ItemTemplateName,
			String Length, String NumberOfItems, String Width, String Height, String Weight, String palletSpace,
			String destination, String lookupName, Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg,
			String DangerousGoodsDetailsHeading, String technicalName, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		PageBase.MaximumWaitForElementEnabled();
		ReviewYourPickupActions.ClickEdit();

		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDangerousGoods);
		BookAPickupActions.SelectDangerousGoods(1);
		// Enter dangerous goods details
				BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
				BookAPickupActions.SelectPackgingGroup(PackingGroup);
				BookAPickupActions.EnterTechnicalName(technicalName);
				PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.selectDispatchDate();
		// ReSubmit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		PageBase.MinimumWaitForElementEnabled();

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MinimumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);

	}
	
	//@Test (priority=-1)
	@Test(groups = { "Shakeout Testing" })
	@Parameters({ "TollCarrierIntermodalSpecialized", "AccountNumberTINTER","ServiceFCL", "ServiceDangerousGoods", "locationIndex",
			"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination",
			"lookupName",  "PackingGroup", "packageDescription", "pDgPkgQty",
			"pDgQtyKg", "DangerousGoodsDetailsHeading", "technicalName", "specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_FCL(String TollCarrier, String AccountNumberTINTER,
			String ServiceFCL, String ServiceDangerousGoods, Integer locationIndex, String ItemTemplateName,
			String Length, String NumberOfItems, String Width, String Height, String Weight, String palletSpace,
			String destination, String lookupName, Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg,
			String DangerousGoodsDetailsHeading, String technicalName, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);

		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceFCL);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		ReviewYourPickupActions.ClickEdit();

		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDangerousGoods);
		BookAPickupActions.SelectDangerousGoods(1);
		// Enter dangerous goods details
				BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
				BookAPickupActions.SelectPackgingGroup(PackingGroup);
				BookAPickupActions.EnterTechnicalName(technicalName);
				PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		// ReSubmit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		PageBase.MaximumWaitForElementEnabled();

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);

	}

	//@Test(priority=-1)
	@Test(groups = { "Shakeout Testing" })
	@Parameters({ "TollCarrierIntermodalSpecialized", "AccountNumberTINTER", "ServiceDGFCL", "ServiceExpress", "AccountNumberTollNQX",
			"ItemTemplateName2", "locationIndex", "ItemTemplateName", "ChargeToAccount", "NumberOfItems", "Length",
			"Width", "Height", "Weight", "DGGoodsYes", "DGGoodsNo", "FoodItems", "palletSpace", "Destination",
			"DestinationItem", "DestinationPostcode", "lookupName", "PackingGroup", "packageDescription", "pDgPkgQty",
			"pDgQtyKg", "DangerousGoodsDetailsHeading", "technicalName", "specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_DGFCL(String TollCarrier,String AccountNumberTINTER,
			String ServiceDGFCL, String ServiceExpress, String AccountNumberTollNQX, String ItemTemplateName2,
			Integer locationIndex, String ItemTemplateName, String ChargeToAccount, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String DGGoodsYes, String DGGoodsNo, String FoodItems,
			String palletSpace, String destination, String DestinationItem, String DestinationPostcode,
			String lookupName, Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg,
			String DangerousGoodsDetailsHeading, String technicalName, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

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
		BookAPickupActions.EnterService(ServiceDGFCL);
		BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		String TotalWeight = Weight + " kg";
		String chargeToAccount = BookAPickupActions.SelectChargeToAccount2(1);
		String Destination = BookAPickupActions.SelectDestination1(destination, DestinationItem);
		System.out.println(Destination);

		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// BookAPickupActions.ReceiverAccountNumber("1236654");
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);
		String Volume = volume + " m3";
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.weight);
		// Shipment contain Dangerous goods=yes and no food items
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

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
				NumberOfItems, palletSpace, chargeToAccount, Length, Width, Height, Weight);

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
		//BookAPickupActions.selectReadyTime();
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
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		ReviewYourPickupActions.VerifyPickupDetails(tollCarrier, accountNo, company, companyLocation, name,
				userPhoneNumber, readyTime, closingTime, specialInstruction);
		ReviewYourPickupActions.VerifyItemDetails1TollNQX("0", "ITEM DETAILS", ItemTemplateName, DestinationPostcode,
				ServiceDGFCL, chargeToAccount, NumberOfItems, palletSpace, Length, Width, Height, Volume,
				TotalWeight, DGGoodsYes, FoodItems);

		ReviewYourPickupActions.VerifyDangerousGoodsDetails(DangerousGoodsDetailsHeading, lookupName, classDivision,
				packingGroup1, subRisk, ProperShippingName, packageDescription, pDgPkgQty, pDgQtyKg, technicalName);

		ReviewYourPickupActions.VerifyItemDetails2TollNQX("1", "ITEM DETAILS", ItemTemplateName2, DestinationPostcode,
				ServiceExpress, chargeToAccount, NumberOfItems, palletSpace, Length, Width, Height, Volume2,
				TotalWeight, DGGoodsNo, FoodItems);

		ReviewYourPickupActions.ClickConfirmPickup();
		String reference = ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
		System.out.println("Book A Pickup reference  " + reference);
	}



	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "AccountNumberTINTER","ServiceGeneral", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_General(String TollCarrier, String AccountNumberTINTER,
			String ServiceGeneral, Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String palletSpace, String destination, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceGeneral);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
	}

//	@Test(priority=-1)
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "AccountNumberTINTER","ServicePremium", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_Premium(String TollCarrier,String AccountNumberTINTER,
			String ServicePremium, Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String palletSpace, String destination, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		// Mode(=Road)
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServicePremium);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
	}

	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized","AccountNumberTINTER", "ServiceRailGeneral", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_RailGeneral(String TollCarrier, String AccountNumberTINTER,
			String ServiceRailGeneral, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceRailGeneral);

		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();
		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();

		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
	}

	//@Test(priority=-1)
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized","AccountNumberTINTER", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName", "specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_Refrigeration(String TollCarrier, String AccountNumberTINTER,
			String ServiceRefrigeration, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, String packageDescription, String pDgPkgQty, String pDgQtyKg, String technicalName,
			String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

		BookAPickupActions.EnterService(ServiceRefrigeration);
		BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();
		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
	}

	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized","AccountNumberTINTER", "ServiceDGRefrigerated", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"PackingGroup", "packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName", "specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_DGRefrigerated(String TollCarrier, String AccountNumberTINTER,
			String ServiceDGRefrigerated, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg,
			String technicalName, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDGRefrigerated);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.dangerousGoodNo);
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details

		BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);

		// Enter Pickup details

		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
	}

	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized","AccountNumberTINTER", "ServiceRailDangerousGoods", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"PackingGroup", "packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName", "specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_RailDangerousGoods(String TollCarrier, String AccountNumberTINTER,
			String ServiceRailDangerousGoods, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg,
			String technicalName, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
	//	BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceRailDangerousGoods);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.weight);
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details
		BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);

		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
	}

	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized","AccountNumberTINTER", "ServiceDGExpress", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"PackingGroup", "packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName", "specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_DGExpress(String TollCarrier, String AccountNumberTINTER,
			String ServiceDGExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg,
			String technicalName, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDGExpress);
		BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		// jse.executeScript("scroll(1000, 1500)");
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.weight);
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details
		// BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging
		// description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);
		// BookAPickupActions.SelectPackingGroup();
		// Enter Pickup details
		// jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
	}

	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized","AccountNumberTINTER", "ServiceExpress", "ServiceDangerousGoods", "locationIndex",
			"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination",
			"lookupName", "PackingGroup", "packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName",
			"specialIns" })

	public void BookAPickup_IntermodalSpecialized_E2ETest_TID_295_Service_Express_Edit_ErrorMessagesValidation(
			String TollCarrier,String AccountNumberTINTER, String ServiceExpress, String ServiceDangerousGoods, Integer locationIndex,
			String ItemTemplateName, String Length, String NumberOfItems, String Width, String Height, String Weight,
			String palletSpace, String destination, String lookupName, Integer PackingGroup, String packageDescription,
			String pDgPkgQty, String pDgQtyKg, String technicalName, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);

		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
	//	BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);
		//BookAPickupActions.EnterLocation("CPA Aus");
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.VerifyModeIsNotAvailable();
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);

		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		ReviewYourPickupActions.ClickEdit();

		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDangerousGoods);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);

		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		// ReSubmit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		BookAPickupActions.NoUNAddedErrorMsgValidation();
		BookAPickupActions.EnterService(ServiceDangerousGoods);

		BookAPickupActions.SelectDangerousGoods(2);
		// ReSubmit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		BookAPickupActions.NoUNAddedErrorMsgValidation();

		BookAPickupActions.SelectDangerousGoods(1);

		// Enter dangerous goods details

		BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
		BookAPickupActions.selectDispatchDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		
		BookAPickupActions.ClickReviewBook();
		BookAPickupActions.SelectDestinationOnReviewBookAPickup(destination);
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYourPickupActions.ClickConfirmPickup();
		ReviewYourPickupActions.VerifyConfirmPickupDetails(BaseWebdriver.Username1);
		ReviewYourPickupActions.VerifyNoEditBtn();

	} */

	@AfterMethod
	public void RunTearDown() throws Exception {

	BaseWebdriver.tearDown();

	}

}
