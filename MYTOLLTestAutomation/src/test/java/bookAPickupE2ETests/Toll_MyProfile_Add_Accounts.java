package bookAPickupE2ETests;

import GlobalActions.PageBase;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;

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

import com.sun.jna.StringArray;

import baseWebdriver.BaseWebdriver;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class Toll_MyProfile_Add_Accounts {



	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		
	}
	
	
	@Test
	@Parameters({ "TollCarrierTollIntermodal","AccountNumber1", "AccountAccessTypeFullFinancial"})
	public void addTemplateIntermodal(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test
	@Parameters({ "TollCarrierTollTasmania","AccountNumber1", "AccountAccessTypeFullFinancial"})
	public void addTemplateTasmania(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test
	@Parameters({ "TollCarrierTollNQXTollExpress","AccountNumber1", "AccountAccessTypeFullFinancial"})
	public void addTemplateNQX(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test
	@Parameters({ "TollCarrierTollIPEC","AccountNumber1", "AccountAccessTypeFullFinancial"})
	public void addTemplateIPEC(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test
	@Parameters({ "TollCarrierTollPrioAU","AccountNumber1", "AccountAccessTypeFullFinancial"})
	public void addTemplatePrioAU(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test
	@Parameters({ "TollCarrierTollPrioNZ","AccountNumber1", "AccountAccessTypeFullFinancial"})
	public void addTemplatePrioNZ(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}


	
	private void addAccount(String Carrier, String AccountNo, String AccessType) {
		String NewAccountNumber = AccountNo;
		//Random Account Number - for testing only
		int Number = (int) (Math.random()*10000);
		String newNumber = String.valueOf(Number);
		
		if (NewAccountNumber == "") {
		NewAccountNumber = "Test"+newNumber;	
		}
		String totalAccounts[]= NewAccountNumber.split(",");
		
		
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		PageBase.click(MyTollHomePageActions.myAccountMenu, 20);
		
		
		//the below for loop is for adding multiple account numbers for one carrier. Provide account numbers in the format "1111,2222,333,"
		for (int i = 0; i<totalAccounts.length; i++ ) {
			PageBase.moveToElement(BookAPickupActions.addAccount);
			PageBase.click(BookAPickupActions.addAccount, 10);
			PageBase.MaximumWaitForElementEnabled();
			PageBase.click(BookAPickupActions.addAccountCarrier, 10);
			PageBase.click(By.xpath("//*[@id=\"addAccountForm\"]//*//div/ul/li/div[text()='"+Carrier+"']"), 10);
			PageBase.sendText(BookAPickupActions.addAccountNumber, 10, totalAccounts[i]);
			PageBase.click(BookAPickupActions.addAccountAccessType, 10);
			PageBase.click(By.xpath("//*[@id=\"addAccountForm\"]//*//ul/li/div[text()='"+AccessType+"']"), 10);
			PageBase.click(BookAPickupActions.addAccountSave, 10);
			PageBase.MaximumWaitForElementEnabled();
			
			//Verify Template Save Successfully
			PageBase.verifyTextExist(BookAPickupActions.addAccountSaveMsg, "Account Has Been Successfully Added.");
			PageBase.click(BookAPickupActions.addAccountSaveMsgClose, 10);
			PageBase.MaximumWaitForElementEnabled();
			
			//Verify New Account Exists
			try {
				while(PageBase.waitForElement(By.xpath("//*[@id=\"portlet_mytolluserAccountportlet_WAR_mytollupsportlet\"]//*//p[contains(text(),'"+totalAccounts[i]+"')]"), 1) == null) {
					PageBase.moveToElement(BookAPickupActions.addAccountViewMore);
					PageBase.click(BookAPickupActions.addAccountViewMore, 5);
				}
				Reporter.log("AccountNo : "+totalAccounts[i]+ " Exists");
				System.out.println("AccountNo : "+totalAccounts[i]+ " Exists");
			}
			catch (Exception e) {
				Reporter.log("FAILED: AccountNo : "+totalAccounts[i]+ " Does Not Exists");
				Assert.fail("FAILED: AccountNo : "+totalAccounts[i]+ " Does Not Exists");
			}
		
		}
		
	}
	
	

	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();
		//BaseWebdriver.driver.quit();

	}

}
