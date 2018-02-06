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
	public static String ACTAddress1 = "Hackett House, 19 Hackett Place, HACKETT  ACT  2602";
	public static String ACTAddress2 = "1 Wreck Bay Road, JERVIS BAY  OT  2540";
	
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceGeneral", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns" })
	public void TNQX_CutOffTime_ACT_01(String TollCarrier,
			String ServiceGeneral, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns) {

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
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns" })
	public void TNQX_CutOffTime_ACT_02(String TollCarrier,
			String ServiceExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns) {

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
	
	

	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();
		//BaseWebdriver.driver.quit();

	}

}
