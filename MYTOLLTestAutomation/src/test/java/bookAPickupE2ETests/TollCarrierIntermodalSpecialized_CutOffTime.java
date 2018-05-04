package bookAPickupE2ETests;

import GlobalActions.PageBase;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;
import manifestActions.ManifestActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;


public class TollCarrierIntermodalSpecialized_CutOffTime {

	public static Integer locationIndex = 4;


	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	
	//ACT ZONE CUT OFF TIME CHECK
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceGeneral", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXACTAddress1" })
	public void TNQX_CutOffTime_ACT_01(String TollCarrier,
			String ServiceGeneral, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String ACTAddress1) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(ACTAddress1);
		
		BookAPickupActions.EnterService(ServiceGeneral);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		//PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("14:15");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		}
	
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceExpress", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXACTAddress2" })
	public void TNQX_CutOffTime_ACT_02(String TollCarrier,
			String ServiceExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String ACTAddress2) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(ACTAddress2);
		
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("14:45");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		}
	
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceFCL", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXACTAddress1" })
	public void TNQX_CutOffTime_ACT_03(String TollCarrier,
			String ServiceFCL, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String ACTAddress1) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(ACTAddress1);
		
		BookAPickupActions.EnterService(ServiceFCL);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("23:00");
		ManifestActions.selectClosingTimeJS("23:45");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		//PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		PageBase.isElementNotPresent(BookAPickupActions.cutOfftimePopup, 3 , "Cut Off Time Error Msg");
		}
	
	
	//NSW ZONE CUT OFF TIME CHECK
	
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceDGExpress", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "palletSpace", "Destination", "lookupName",
			"PackingGroup", "packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName", "specialIns", "TNQXNSWAddress1" })
	public void TNQX_CutOffTime_NSW_01(String TollCarrier,
			String ServiceDGExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String palletSpace, String destination,
			String lookupName, Integer PackingGroup, String packageDescription, String pDgPkgQty, String pDgQtyKg,
			String technicalName, String specialIns, String NSWAddress1) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(NSWAddress1);
		
		BookAPickupActions.EnterService(ServiceDGExpress);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(1);
		BookAPickupActions.selectContainFoodItem();
		
		BookAPickupActions.SelectDangerousGoodsDetails(lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("14:15");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		}
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceGeneral", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXNSWAddress2" })
	public void TNQX_CutOffTime_NSW_02(String TollCarrier,
			String ServiceGeneral, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String NSWAddress2) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(NSWAddress2);
		
		BookAPickupActions.EnterService(ServiceGeneral);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		//PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("14:45");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		}
	
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceFCL", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXNSWAddress2" })
	public void TNQX_CutOffTime_NSW_03(String TollCarrier,
			String ServiceFCL, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String NSWAddress2) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(NSWAddress2);
		
		BookAPickupActions.EnterService(ServiceFCL);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("23:00");
		ManifestActions.selectClosingTimeJS("23:45");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		//PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		PageBase.isElementNotPresent(BookAPickupActions.cutOfftimePopup, 3 , "Cut Off Time Error Msg");
		}
	
	
	
	//SA ZONE CUT OFF TIME CHECK
	
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceExpress", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXSAAddress1" })
	public void TNQX_CutOffTime_SA_01(String TollCarrier,
			String ServiceExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String SAAddress1) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(SAAddress1);
		
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("15:15");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		}
	
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceFCL", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXSAAddress2" })
	public void TNQX_CutOffTime_SA_02(String TollCarrier,
			String ServiceFCL, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String SAAddress2) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(SAAddress2);
		
		BookAPickupActions.EnterService(ServiceFCL);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("23:00");
		ManifestActions.selectClosingTimeJS("23:45");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		//PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		PageBase.isElementNotPresent(BookAPickupActions.cutOfftimePopup, 3 , "Cut Off Time Error Msg");
		}
	

	
	//VIC ZONE CUT OFF TIME CHECK

	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceRefrigeration", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXVICAddress1" })
	public void TNQX_CutOffTime_VIC_01(String TollCarrier,
			String ServiceRefrigeration, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String VICAddress1) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(VICAddress1);
		
		BookAPickupActions.EnterService(ServiceRefrigeration);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("14:15");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		}
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceExpress", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXVICAddress2" })
	public void TNQX_CutOffTime_VIC_02(String TollCarrier,
			String ServiceExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String VICAddress2) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(VICAddress2);
		
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("14:45");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		}
	
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceFCL", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXVICAddress3" })
	public void TNQX_CutOffTime_VIC_03(String TollCarrier,
			String ServiceFCL, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String VICAddress3) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(VICAddress3);
		
		BookAPickupActions.EnterService(ServiceFCL);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("23:00");
		ManifestActions.selectClosingTimeJS("23:45");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		//PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		PageBase.isElementNotPresent(BookAPickupActions.cutOfftimePopup, 3 , "Cut Off Time Error Msg");
		}
	
	

	//WA ZONE CUT OFF TIME CHECK
	

	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceExpress", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXWAAddress1" })
	public void TNQX_CutOffTime_WA_01(String TollCarrier,
			String ServiceExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String WAAddress1) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(WAAddress1);
		
		BookAPickupActions.EnterService(ServiceExpress);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("10:15");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		}
	
	
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceFCL", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns", "TNQXWAAddress2" })
	public void TNQX_CutOffTime_WA_02(String TollCarrier,
			String ServiceFCL, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns, String WAAddress2) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(WAAddress2);
		
		BookAPickupActions.EnterService(ServiceFCL);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);
		BookAPickupActions.SelectChargeToAccount2(1);

		PageBase.MoveToElement(BookAPickupActions.weight, BookAPickupActions.service);
		BookAPickupActions.SelectDangerousGoods(2);
		BookAPickupActions.selectContainFoodItem();

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("23:00");
		ManifestActions.selectClosingTimeJS("23:45");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		//PageBase.verifyTextExist(BookAPickupActions.cutOfftimePopup, "Ready time entered by you is outside of business hours of selected carrier. Do you want to continue with same ready time ?");
		PageBase.isElementNotPresent(BookAPickupActions.cutOfftimePopup, 3 , "Cut Off Time Error Msg");
		}
	
	
	
	
	

	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();

	}

}
