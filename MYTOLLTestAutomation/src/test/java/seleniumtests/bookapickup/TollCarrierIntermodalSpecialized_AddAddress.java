package seleniumtests.bookapickup;

import global.PageBase;
import static org.junit.Assert.assertEquals;

import bookapickup.BookAPickupActions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import mytollhomepage.MyTollHomePageActions;


public class TollCarrierIntermodalSpecialized_AddAddress {

	public static Integer locationIndex = 4;
	
	@BeforeMethod(alwaysRun=true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	@Test(groups = { "Shakeout Testing", "E2E" })
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceExpress", "locationIndex", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "temperatureLow", "temperatureHigh",
			"refrigerationRefNum", "bookInNum", "VendorNum", "palletSpace", "Destination", "specialIns" })

	public void TollCarrierIntermodalSpecialized_AddAddress_1(String TollCarrier,
			String ServiceExpress, Integer locationIndex, String ItemTemplateName, String Length,
			String NumberOfItems, String Width, String Height, String Weight, String tempLow, String tempHigh,
			String ref, String BookNo, String vendorNum, String palletSpace, String destination, String specialIns) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		System.out.println("line 52");
		
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		System.out.println("line 56");
		PageBase.MaximumWaitForElementEnabled();

		//Add Address
		BookAPickupActions.addAdderess("60 Collins Street, MELBOURNE VIC 3000");
		System.out.println("line 61");
		BookAPickupActions.verfiyAddress();
		System.out.println("line 63");
	}

	
	@AfterMethod(alwaysRun = true)
	public void RunTearDown() throws Exception {
		 BaseWebdriver.tearDown();
	//	BaseWebdriver.driver.quit();

	}

}
