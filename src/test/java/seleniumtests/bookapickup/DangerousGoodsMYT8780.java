package seleniumtests.bookapickup;

import bookapickup.BookAPickupActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import global.PageBase;
import basewebdriver.BaseWebdriver;
import mytollhomepage.MyTollHomePageActions;
import reviewyourpickup.ReviewYourPickupActions;

public class DangerousGoodsMYT8780 {
	public static Integer locationIndex = 4;

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	//@BeforeMethod
	public void RunSetup(String browser) throws Exception {
		BaseWebdriver.setUp();
		//BaseWebdriver.SetUp(browser);
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	@Test(groups = { "E2E" })
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

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrierIntermodalSpecialized);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);

		BookAPickupActions.EnterAccountNumber(AccountNumberTINTER);
		String accountNo = BookAPickupActions.GetAccountNumber();
		System.out.println(accountNo);
		BookAPickupActions.VerifyBookAPickupScreen();
		//BookAPickupActions.VerifyTollCarrier(TollCarrier);

		BookAPickupActions.SelectLocation2(locationIndex);
		String company = BookAPickupActions.GetCompany();
		System.out.println(company);
		String location = BookAPickupActions.GetLocation();
		System.out.println(location);
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
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.setQEMNo();
		BookAPickupActions.EnterQuantity(NumberOfItems);
		BookAPickupActions.EnterService(ServiceDangerousGoods);
		BookAPickupActions.SelectDestination(destination);

		BookAPickupActions.EnterItem(ItemTemplateName);
		BookAPickupActions.SelectChargeToAccount2(1);
		BookAPickupActions.EnterPalletSpace(palletSpace);
		BookAPickupActions.EnterLengthWidthHeightVolumeWeight(Length, Width, Height, Weight);

		String TotalWeight = Weight + " kg";
		String chargeToAccount = BookAPickupActions.SelectChargeToAccount2(1);
		String Destination = BookAPickupActions.SelectDestination1(destination, DestinationItem);
		System.out.println(Destination);

		BookAPickupActions.selectContainFoodItem();

		BookAPickupActions.selectDangerousGoodYes();


		BookAPickupActions.EnterDangerousGoodsDetails( 1,"1950", "third", "forth", "fifth");
		PageBase.click(BookAPickupActions.subRisk, 50);
		PageBase.verifyTextExist(By.xpath("//*[@id=\"sub-risk-selector-\"]//li[1]"),"6.1");
		PageBase.verifyTextExist(By.xpath("//*[@id=\"sub-risk-selector-\"]//li[2]"),"8");
		PageBase.verifyTextExist(By.xpath("//*[@id=\"sub-risk-selector-\"]//li[3]"),"NA");
	}

	@AfterMethod(alwaysRun = true)
	public void RunTearDown() throws Exception {

		//BaseWebdriver.tearDown();

	}
}
