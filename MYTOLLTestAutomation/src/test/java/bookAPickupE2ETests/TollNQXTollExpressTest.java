package bookAPickupE2ETests;

import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.GlobalVariables;
import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class TollNQXTollExpressTest {
	public static Integer locationIndex = 4;

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	@Test(priority = 1)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceDangerousGoods", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"packageDescription","pDgPkgQty","pDgQtyKg","technicalName", "specialIns" })

	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_DangerousGoods(String TollCarrier,
			String ServiceDangerousGoods, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, String packageDescription, String pDgPkgQty,String pDgQtyKg, String technicalName, String specialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

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
		BookAPickupActions.EnterService(ServiceDangerousGoods);
		BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

	
		// BookAPickupActions.SelectItem(2);
		// BookAPickupActions.EnterItem(ItemTemplateName);
		//jse.executeScript("scroll(200, 500)");
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo,BookAPickupActions.weight);
		// Shipment contain Dangerous goods=yes and no food items
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details
		// BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging
		// description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty,pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup("II");
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);
		// Enter Pickup details
		//jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
		
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);
	}

	@Test(priority = 2)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceExpress", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"specialIns" })

	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_Express(String TollCarrier,
			String ServiceExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, String specialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

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
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);
	
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		//jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
		
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);

	}

	@Test(priority = 3)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceGeneral", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", 
			"specialIns" })

	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_General(String TollCarrier,
			String ServiceGeneral, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String specialIns) {


		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

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
		//jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
		
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);
	}

	@Test(priority = 4)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServicePremium", "locationIndex", "ItemTemplateName",
		"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", 
		"specialIns" })
	
	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_Premium(String TollCarrier,
			String ServicePremium, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String specialIns) {


		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

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
		BookAPickupActions.EnterService(ServicePremium);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		//jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
		
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();
		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);
	}

	@Test(priority = 5)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceRailGeneral", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"specialIns" })

	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_RailGeneral(String TollCarrier,
			String ServiceRailGeneral, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, String specialIns) {


		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

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
		//jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
		
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();

		// ReviewYouPickupActions.VerifyConfirmPickupDetails();
	}

	@Test(priority = 6)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"packageDescription","pDgPkgQty","pDgQtyKg","technicalName",
			"specialIns" })

	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_Refrigeration(String TollCarrier,
			String ServiceRefrigeration, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, String packageDescription, String pDgPkgQty,String pDgQtyKg,String technicalName,String specialIns) {


		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		
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
		//jse.executeScript("scroll(500, 800)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
		
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		PageBase.MaximumWaitForElementEnabled();
	
		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);
	}

	@Test(priority = 7)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceDGRefrigerated", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"packageDescription","pDgPkgQty","pDgQtyKg", "technicalName",
			"specialIns" })

	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_DGRefrigerated(String TollCarrier,
			String ServiceDGRefrigerated, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, String packageDescription, String pDgPkgQty,String pDgQtyKg, String technicalName, String specialIns) {



		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDGRefrigerated);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		
		//jse.executeScript("scroll(1000, 1500)");
		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.dangerousGoodNo);
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details
		// BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging
		// description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty,pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup("II");
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);
		//BookAPickupActions.SelectPackingGroup();
		// Enter Pickup details
		//jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
		
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);
	}

	@Test(priority = 8)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceRailDangerousGoods", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"packageDescription","pDgPkgQty","pDgQtyKg","technicalName",
			"specialIns" })

	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_RailDangerousGoods(String TollCarrier,
			String ServiceRailDangerousGoods, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, String packageDescription, String pDgPkgQty,String pDgQtyKg, String technicalName, String specialIns) {


		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceRailDangerousGoods);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		
		//jse.executeScript("scroll(1000, 1500)");
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo,BookAPickupActions.weight );
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details
		// BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging
		// description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty,pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup("II");
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);
		//BookAPickupActions.SelectPackingGroup();
		// Enter Pickup details
		//jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
		
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);
	}

	@Test(priority = 9)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceDGExpress", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"packageDescription","pDgPkgQty","pDgQtyKg","technicalName",
			"specialIns" })

	public void BookAPickup_TollNQXTollExpress_E2ETest_TID_295_Service_DGExpress(String TollCarrier,
			String ServiceDGExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, String packageDescription, String pDgPkgQty,String pDgQtyKg, String technicalName, String specialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		bookAPickupActions.BookAPickupActions.SelectAccountNumber1();

		// Verification of Book A Pickup screen, Toll Carrier, Account number, name,
		// phoneNumber
		BookAPickupActions.VerifyBookAPickupScreen();
		BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);

		// Verification and enter data for Quick entry mode, service(=Express),
		
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDGExpress);
		BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

				//jse.executeScript("scroll(1000, 1500)");
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo,BookAPickupActions.weight);
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();

		// Enter dangerous goods details
		// BookAPickupActions.EnterDangerousGoodsDetails(2, "1234", "Test Dg packaging
		// description", "123", "456");
		BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty,pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup("II");
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);
		//BookAPickupActions.SelectPackingGroup();
		// Enter Pickup details
		//jse.executeScript("scroll(1500, 1700)");
		BookAPickupActions.selectPickupDate();
		BookAPickupActions.selectReadyTime();
		BookAPickupActions.selectClosingTime();
		BookAPickupActions.EnterSpecialInstructions(specialIns);
		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.reviewBookBtn);
		
		// Submit Book a pickup details
		BookAPickupActions.ClickReviewBook();

		// Confirm Pickup and Verify pickup confirmation details
		ReviewYouPickupActions.ClickConfirmPickup();
		ReviewYouPickupActions.VerifyConfirmPickupDetails(GlobalVariables.Username);
	}

	@AfterMethod
	public void RunTearDown() throws Exception {

		 BaseWebdriver.tearDown();

	}

}
