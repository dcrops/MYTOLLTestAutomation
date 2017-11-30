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

import reviewYourPickupActions.ReviewYouPickupActions;

public class TollTasmaniaTest {

	public static Integer locationIndex = 4;

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		//MyTollHomePageActions.ClickMenu();
		//MyTollHomePageActions.ClickBookAPIckupMenu();
	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns" })

	public void TollTasmania_E2ETest_TID_1033_Service_Refrigeration(String TollCarrier, String ServiceRefrigeration,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String tempLow, String tempHigh, String ref, String BookNo, String vendorNum,
			String palletSpace, String destination, String specialIns) {

		// Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

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
		BookAPickupActions.EnterQuantity(NumberOfItems);
		// Select service
		BookAPickupActions.EnterService(ServiceRefrigeration);
	
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.SelectDestination(destination);
		// BookAPickupActions.ReceiverAccountNumber("1236654");
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);
	
		PageBase.Scrollbar(500, 1000);
		//BookAPickupActions.EnterDestination(destination);
		// BookAPickupActions.SelectMode(); defect

		//BookAPickupActions.EnterTempretureRefBookinNumbers(tempLow, tempHigh, ref, BookNo);
		//BookAPickupActions.EnterVendorDetails(vendorNum);
		//BookAPickupActions.EnterTimeSlot();
		BookAPickupActions.selectDangerousGood();
	
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
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

			// Verify Review Your Pickup
		// ReviewYouPickupActions.verifyReviewYourPickupScreenHeadings();
		//ReviewYouPickupActions.verifyPickupDetailsHeading();
		//ReviewYouPickupActions.verifyPickupDateTimeHeading();
		// ReviewYouPickupActions.VerifyAccountNumber("8723682S");
		// ReviewYouPickupActions.VerifyTollCarrier("Toll Tasmania");
		// ReviewYouPickupActions.VerifyCompany("19070011 Mine Project Catering");
		// ReviewYouPickupActions.verifyLocation();
		// ReviewYouPickupActions.verifyBookedby();
		// ReviewYouPickupActions.VerifyPhoneNumber();
		//ReviewYouPickupActions.VerifyPickupDate();
		// ReviewYouPickupActions.verifyReadyTime();
		// ReviewYouPickupActions.verifyClosingTime();
		//ReviewYouPickupActions.verifySpecialInstructions(specialIns);
		//ReviewYouPickupActions.verifyItemDescription();
		// ReviewYouPickupActions.verifyNumberofItems(NumberOfItems+" Items");
		// ReviewYouPickupActions.verifyLengthWidthHeight(Length+"*"+ Width+"*"+Height+"
		// CM3");
		// ReviewYouPickupActions.verifyVolume();
		// ReviewYouPickupActions.verifyWeight();

		// Confirm Pickup and Verify pickup confirmation details
		//ReviewYouPickupActions.ClickConfirmPickup();
		// ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination","DestinationItem", "specialIns" })

	public void TollTasmania_E2ETest_TID_1033_Service_Refrigeration_ConfirmDetails(String TollCarrier,
			String ServiceRefrigeration, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String DestinationItem, String specialIns) {

		// Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

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
		

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.SelectDestination1(destination,DestinationItem);
		// BookAPickupActions.ReceiverAccountNumber("1236654");

	
		PageBase.Scrollbar(500, 1000);
		// BookAPickupActions.SelectMode(); defect

		//BookAPickupActions.EnterTempretureRefBookinNumbers(tempLow, tempHigh, ref, BookNo);
		//BookAPickupActions.EnterVendorDetails(vendorNum);
		//BookAPickupActions.EnterTimeSlot();
		BookAPickupActions.selectDangerousGood();
		
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		// BookAPickupActions.selectReadyTime();

		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		BookAPickupActions.ClickReviewBook();
	
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup

	//	BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		// ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}

	@Test

	@Parameters({ "TollCarrierTollTasmania", "ServiceDGFreight", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh", "refrigerationRefNum",
			"bookInNum", "VendorNum", "palletSpace", "Destination", "lookupName", "lookupItem", "PackingGroup","packageDescription",
			"pDgPkgQty", "pDgQtyKg", "technicalName","specialIns" })

	public void TollTasmania_E2ETest_TID_1033_Service_DGFreight(String TollCarrier, String ServiceDGFreight,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String tempLow, String tempHigh, String ref, String BookNo, String vendorNum,
			String palletSpace, String destination, String lookupName, Integer lookupItem, Integer PackingGroup,String packageDescription,
			String pDgPkgQty, String pDgQtyKg, String technicalName, String specialIns) {

		// Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

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
		
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.SelectDestination(destination);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// BookAPickupActions.ReceiverAccountNumber("1236654");
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);
	
		BookAPickupActions.SelectDangerousGoods(1);
		PageBase.Scrollbar(500, 1000);
		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);

		BookAPickupActions.SelectPackgingGroup(PackingGroup);

		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.EnterTechnicalName(technicalName);

		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();

		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Verify Review Your Pickup
		/*ReviewYouPickupActions.verifyReviewYourPickupScreenHeadings();
		ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();

		ReviewYouPickupActions.VerifyTollCarrier(TollCarrier);

		// ReviewYouPickupActions.VerifyPhoneNumber();
		ReviewYouPickupActions.VerifyPickupDate();

		// ReviewYouPickupActions.verifyClosingTime();
		ReviewYouPickupActions.verifySpecialInstructions(specialIns);
		ReviewYouPickupActions.verifyItemDescription();
		ReviewYouPickupActions.verifyNumberofItems(NumberOfItems + " Items");
		ReviewYouPickupActions.verifyLengthWidthHeight(Length + "X" + Width + "X" + Height + " CM3");*/
		// ReviewYouPickupActions.verifyVolume(volume + " M3");
		// ReviewYouPickupActions.verifyWeight(Weight + " Kg");

		ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);
	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "ServiceDGFreight", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName", "lookupItem","PackingGroup",
			"packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName","specialIns" })
	public void TollTasmania_E2ETest_TID_1033_Service_DGFreight_ConfirmDetails(String TollCarrier,
			String ServiceDGFreight, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, Integer lookupItem, Integer PackingGroup,String packageDescription, String pDgPkgQty, String pDgQtyKg, String technicalName,
			String specialIns) {

		// Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

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
		BookAPickupActions.selectPickupDate();
		//String pickupDate = BookAPickupActions.ReturnPickupDate();

		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		// ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "ServiceExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void TollTasmania_E2ETest_TID_1033_Service_Express(String TollCarrier, String ServiceExpress,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String specialIns) {
		// Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
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
		BookAPickupActions.selectPickupDate();
		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		// ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "ServiceExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void TollTasmania_E2ETest_TID_1033_Service_Express_ConfirmDetails(String TollCarrier, String ServiceExpress,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String specialIns) {

		// Select TollTasmania
		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

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
		
		BookAPickupActions.selectPickupDate();
		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		// Verify Review Your Pickup
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();

		PageBase.MaximumWaitForElementEnabled();
		// ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "ServiceGeneral", "locationIndex", "ItemTemplateName", "ChargeToAccount",
			"NumberOfItems", "Length", "Width", "Height", "Weight","DGGoods","FoodItems", "palletSpace", "Destination", "Postcode",
			"VendorNum", "specialIns" })

	public void BookAPickup_TollTasmania_E2ETest_TID_1033_Service_General(String TollCarrier, String ServiceGeneral,
			Integer locationIndex, String ItemTemplateName, String ChargeToAccount, String Length, String NumberOfItems,
			String Width, String Height, String Weight,String DGGoods, String FoodItems, String palletSpace, String destination, String Postcode,
			String vendorNum, String specialIns) {

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);

		// Select TollTasmania
		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

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
		//BookAPickupActions.selectContainFoodItem();

		// Add a new item
		BookAPickupActions.AddANewLineTollTasmania(ServiceGeneral);
	
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		 BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		BookAPickupActions.ClickReviewBook();
		

		// Verify Review Your Pickup
		/*ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();
		// ReviewYouPickupActions.VerifyAccountNumber("8723682S");
		ReviewYouPickupActions.VerifyTollCarrier("Toll Tasmania");
		// ReviewYouPickupActions.VerifyCompany("19070011 Mine Project Catering");
		// ReviewYouPickupActions.verifyLocation();
		// ReviewYouPickupActions.verifyBookedby();
		// ReviewYouPickupActions.VerifyPhoneNumber();
		ReviewYouPickupActions.VerifyPickupDate();
		ReviewYouPickupActions.verifySpecialInstructions(specialIns);
		ReviewYouPickupActions.verifyItemDescription();
		// ReviewYouPickupActions.verifyNumberofItems(NumberOfItems+" Items");
		// ReviewYouPickupActions.verifyLengthWidthHeight(Length+"*"+ Width+"*"+Height+"
		// CM3");
		// ReviewYouPickupActions.verifyVolume();
		// ReviewYouPickupActions.verifyWeight();

		// Verify item details
		// ReviewYouPickupActions.VerifyItemDetails();VerifyItemDetails
		jse.executeScript("scroll(500, 800)");
		ReviewYouPickupActions.VerifyItemDetails(0,ItemTemplateName,destination,Postcode,ServiceGeneral,ChargeToAccount,NumberOfItems,palletSpace
				,Length,Width, Height,volume, Weight, DGGoods, FoodItems);
		ReviewYouPickupActions.VerifyNewItemDetails(0,ItemTemplateName,destination,Postcode,ServiceGeneral,ChargeToAccount,NumberOfItems,palletSpace
				,Length,Width, Height,volume, Weight);*/

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		// ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test

	@Parameters({ "TollCarrierTollTasmania", "ServiceGeneral", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns" })

	public void BookAPickup_TollTasmania_E2ETest_TID_1033_Service_General_ConfirmDetails(String TollCarrier,
			String ServiceGeneral, Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String palletSpace, String destination, String specialIns) {

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);

		// Select TollTasmania
		BookAPickupActions.EnterTollCarrier(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

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

		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);
		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		// ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();
	}

}
