package bookAPickupE2ETests;

import GlobalActions.PageBase;
import GlobalActions.GlobalVariables;

import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class Toll_IntermodalTest {


	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		//MyTollHomePageActions.ClickName();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	//	MyTollHomePageActions.ClickMenu();
	//	MyTollHomePageActions.ClickBookAPIckupMenu();

	}
	

	/*@Test(priority = 1)
	@Parameters({ "TollCarrierTollPrioNZ", "ItemTemplateName","NumberOfItems", "Length", "Width", "Height", "Weight" })
	public void AddTemplates(String TollCarrier,String ItemTemplateName, String NumberOfItems, String Weight,String Length, String Width, String Height) {

		for (int i=1; i<=1000; i++) {
		//MyTollHomePageActions.AddTemplates(TollCarrier,ItemTemplateName,NumberOfItems,Weight,Length,Width,Height);
		}
	}*/

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "DestinationItem","specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Refrigeration(String TollCarrier,
			String ServiceRefrigeration, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination,String DestinationItem, String specialIns) {

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		// Select Toll Intermodal
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));
		BaseWebdriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		BookAPickupActions.EnterTollCarrier(TollCarrier);

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
		//BookAPickupActions.SelectDestination(destination);
		//BookAPickupActions.EnterDestination(destination);


		BookAPickupActions.SelectDestination1(destination,DestinationItem);
		// BookAPickupActions.SelectMode(); defect

		BookAPickupActions.EnterTempretureRefBookinNumbers(tempLow, tempHigh, ref, BookNo);
		BookAPickupActions.EnterVendorDetails(vendorNum);
		BookAPickupActions.EnterTimeSlot();
		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();

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

	/*	ReviewYouPickupActions.VerifyAccountNumber(accno);
		ReviewYouPickupActions.VerifyTollCarrier(TollCarrier);
		ReviewYouPickupActions.VerifyCompany(company);
		// ReviewYouPickupActions.VerifyLocation(location);
		// ReviewYouPickupActions.VerifyBookedby(name); defect
		// ReviewYouPickupActions.VerifyPhoneNumber(phoneNumber); defect

		ReviewYouPickupActions.verifyReadyTime(pickupTime);
		ReviewYouPickupActions.verifyClosingTime(closingTime);
		ReviewYouPickupActions.verifySpecialInstructions(specialIns);

		ReviewYouPickupActions.verifyLengthWidthHeight(Length + "x " + Width + "x " + Height + " CM3");
		ReviewYouPickupActions.verifyVolume(volume + " M3");
		ReviewYouPickupActions.verifyWeight(Weight + " Kg");*/

		// Verify Review Your Pickup
		/*
		 * ReviewYouPickupActions.verifyNumberofItems(NumberOfItems+" Items");
		 * 
		 * ReviewYouPickupActions.verifyPickupDetailsHeading();
		 * ReviewYouPickupActions.verifyPickupDateTimeHeading();
		 * 
		 * ReviewYouPickupActions.verifyTollCarrier("Toll Intermodal");
		 * 
		 * ReviewYouPickupActions.verifyPhoneNumber();
		 * ReviewYouPickupActions.verifyPickupDate(); //
		 * ReviewYouPickupActions.verifyReadyTime(); //
		 * ReviewYouPickupActions.verifyClosingTime();
		 * ReviewYouPickupActions.verifySpecialInstructions();
		 * ReviewYouPickupActions.verifyItemDescription();
		 * ReviewYouPickupActions.verifyNumberofItems();
		 * ReviewYouPickupActions.verifyLengthWidthHeight();
		 * ReviewYouPickupActions.verifyVolume(); ReviewYouPickupActions.verifyWeight();
		 */

	
		/* ReviewYouPickupActions.VerifyConfirmPickupDetails(); */

	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "DestinationItem","specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Refrigeration_ConfirmedDetails(String TollCarrier,
			String ServiceRefrigeration, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination,String DestinationItem, String specialIns) {

		PageBase.waitForElement(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown), 10);
		// Select Toll Intermodal
		PageBase.ElementToBeClickableWait(BaseWebdriver.driver.findElement(BookAPickupActions.TollCarrierDropdown));

		BookAPickupActions.EnterTollCarrier(TollCarrier);

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

		//BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.SelectDestination1(destination,DestinationItem);
		// BookAPickupActions.SelectMode(); defect

		BookAPickupActions.EnterTempretureRefBookinNumbers(tempLow, tempHigh, ref, BookNo);
		BookAPickupActions.EnterVendorDetails(vendorNum);
		BookAPickupActions.EnterTimeSlot();
		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();

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
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		//ReviewYouPickupActions.ClickConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		/* ReviewYouPickupActions.VerifyConfirmPickupDetails(); */
		//ReviewYouPickupActions.VerifyRefrigerationDetails();

	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh", "refrigerationRefNum",
			"bookInNum", "VendorNum", "palletSpace", "Destination", "DestinationItem","lookupName", "lookupItem","PackingGroup", "packageDescription",
			"pDgPkgQty", "pDgQtyKg","technicalName", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_DGFreight(String TollCarrier,
			String ServiceDGFreight, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String DestinationItem,String lookupName,
			Integer lookupItem,Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg,String technicalName, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();

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
		BookAPickupActions.SelectModeItem(2);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
		//BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectDestination1(destination,DestinationItem);
		BaseWebdriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// BookAPickupActions.ReceiverAccountNumber("1236654");
		String volume = BookAPickupActions.GetVoulme().toString();
		System.out.println(volume);


		// Shipment contain Dangerous goods=yes and no food items
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();
		PageBase.Scrollbar(250, 500);
		
		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.Scrollbar(500, 1200);
		
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();

		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup
	/*	BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		// Verify Review Your Pickup
		ReviewYouPickupActions.verifyReviewYourPickupScreenHeadings();
		ReviewYouPickupActions.verifyPickupDetailsHeading();
		ReviewYouPickupActions.verifyPickupDateTimeHeading();

		ReviewYouPickupActions.VerifyTollCarrier(TollCarrier);

		// ReviewYouPickupActions.VerifyPhoneNumber();
		ReviewYouPickupActions.VerifyPickupDate();

		// ReviewYouPickupActions.verifyClosingTime();
		ReviewYouPickupActions.verifySpecialInstructions(specialIns);
		ReviewYouPickupActions.verifyItemDescription();
		ReviewYouPickupActions.verifyNumberofItems(NumberOfItems + " Items");
		ReviewYouPickupActions.verifyLengthWidthHeight(Length + " x " + Width + " x " + Height + " CM3");
		//ReviewYouPickupActions.verifyVolume(volume + " M3");
		//ReviewYouPickupActions.verifyWeight(Weight + " Kg");*/

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);

	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination","DestinationItem", "lookupName", "lookupItem","PackingGroup",
			"packageDescription", "pDgPkgQty", "pDgQtyKg","technicalName", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_DGFreight_ConfirmedDetails(String TollCarrier,
			String ServiceDGFreight, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,String DestinationItem,
			String lookupName, Integer lookupItem, Integer PackingGroup,String packageDescription, String pDgPkgQty, String pDgQtyKg, String technicalName,
			String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		BookAPickupActions.SelectAccountNumber1();

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
		//BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectDestination1(destination,DestinationItem);
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
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();

		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		/* ReviewYouPickupActions.VerifyConfirmPickupDetails(); */

	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination","DestinationItem", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Express(String TollCarrier, String ServiceExpress,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination,String DestinationItem, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

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
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.SelectModeItem(1);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		//BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectDestination1(destination,DestinationItem);
		BookAPickupActions.SelectModeItem(2);

		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Verify Review Your Pickup

		/*
		 * ReviewYouPickupActions.verifyPickupDetailsHeading();
		 * ReviewYouPickupActions.verifyPickupDateTimeHeading();
		 * ReviewYouPickupActions.verifyTollCarrier("Toll Intermodal");
		 * 
		 * ReviewYouPickupActions.verifyPickupDate();
		 * ReviewYouPickupActions.verifyReadyTime();
		 * 
		 * ReviewYouPickupActions.verifySpecialInstructions();
		 * ReviewYouPickupActions.verifyItemDescription();
		 * ReviewYouPickupActions.verifyNumberofItems();
		 * ReviewYouPickupActions.verifyLengthWidthHeight();
		 * ReviewYouPickupActions.verifyVolume(); ReviewYouPickupActions.verifyWeight();
		 */

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		// ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "DestinationItem","specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_Express_ConfirmedDetails(String TollCarrier,
			String ServiceExpress, Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String palletSpace, String destination,String DestinationItem, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

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

		BookAPickupActions.SelectDestination1(destination,DestinationItem);

		BookAPickupActions.SelectModeItem(2);

		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();
		jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		// BookAPickupActions.selectReadyTime();
		// BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		//ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "locationIndex", "ItemTemplateName","ChargeToAccount", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination","DestinationItem","Postcode", "VendorNum", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_General_ConfirmedDetails(String TollCarrier, String ServiceGeneral,
			Integer locationIndex, String ItemTemplateName,String ChargeToAccount, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination,String DestinationItem,String Postcode, String vendorNum, String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

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
		//BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.SelectDestination1(destination,DestinationItem);
		BookAPickupActions.SelectModeItem(1);

		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();
		PageBase.Scrollbar(250, 500);
		
		jse.executeScript("scroll(500, 800)");

		// Add a new item
		BookAPickupActions.AddANewLine(destination,DestinationItem); // defect
		
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);

		BookAPickupActions.selectPickupDate();
		
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		//jse.executeScript("scroll(1000, 1500)");
		
		BookAPickupActions.ClickReviewBook();

		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup
		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		// Verify Review Your Pickup

		/*
		 * ReviewYouPickupActions.verifyPickupDetailsHeading();
		 * ReviewYouPickupActions.verifyPickupDateTimeHeading();
		 * ReviewYouPickupActions.verifyTollCarrier("Toll Intermodal");
		 * 
		 * ReviewYouPickupActions.verifyPhoneNumber();
		 * ReviewYouPickupActions.verifyPickupDate();
		 * ReviewYouPickupActions.verifySpecialInstructions();
		 * ReviewYouPickupActions.verifyItemDescription();
		 * ReviewYouPickupActions.verifyNumberofItems();
		 * ReviewYouPickupActions.verifyLengthWidthHeight();
		 * ReviewYouPickupActions.verifyVolume(); ReviewYouPickupActions.verifyWeight();
		 */

		// Verify item details
		/*ReviewYouPickupActions.VerifyItemDetails(0,ItemTemplateName,destination,Postcode,ServiceGeneral,ChargeToAccount,NumberOfItems,palletSpace
				,Length,Width, Height,volume, Weight, "No", "No");
		
		ReviewYouPickupActions.VerifyNewItemDetails(1,ItemTemplateName,destination,Postcode,ServiceGeneral,ChargeToAccount,NumberOfItems,palletSpace
				,Length,Width, Height,volume, Weight);

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		// ReviewYouPickupActions.VerifyConfirmPickupDetails();*/

	}

	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination","DestinationItem", "VendorNum", "specialIns" })

	public void BookAPickup_TollIntermodal_E2ETest_TID_618_Service_General(String TollCarrier,
			String ServiceGeneral, Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems,
			String Width, String Height, String Weight, String palletSpace, String destination, String DestinationItem, String vendorNum,
			String specialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

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

		//BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.SelectDestination1(destination,DestinationItem);
		BookAPickupActions.SelectModeItem(2);

		BookAPickupActions.selectDangerousGood();
		BookAPickupActions.selectContainFoodItem();
		
		// Add a new item
		BookAPickupActions.AddANewLine(destination,DestinationItem); 
		BookAPickupActions.SelectModeItem(2);
		BookAPickupActions.selectPickupDate();
		String pickupDate = BookAPickupActions.ReturnPickupDate();
		System.out.println("pickupDate" + pickupDate);

		BookAPickupActions.EnterSpecialInstructions(specialIns);

		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirmed Pickup

		BookAPickupActions.ConfirmReadyTimeAndConfirmPickup();
		PageBase.MaximumWaitForElementEnabled();
		// ReviewYouPickupActions.VerifyConfirmPickupDetails();

	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		 BaseWebdriver.tearDown();

	}

}
