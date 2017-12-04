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
	@Parameters({ "TollCarrierTollIntermodal","AccountNumberTInter", "AccountAccessTypeFullFinancial"})
	public void addTemplateIntermodal(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test
	@Parameters({ "TollCarrierTollTasmania","AccountNumberTTas", "AccountAccessTypeFullFinancial"})
	public void addTemplateTasmania(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test
	@Parameters({ "TollCarrierTollNQXTollExpress","AccountNumberTNQX", "AccountAccessTypeFullFinancial"})
	public void addTemplateNQX(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test
	@Parameters({ "TollCarrierTollIPEC","AccountNumberTIPEC", "AccountAccessTypeFullFinancial"})
	public void addTemplateIPEC(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test
	@Parameters({ "TollCarrierTollPrioAU","AccountNumberTPrioAU", "AccountAccessTypeFullFinancial"})
	public void addTemplatePrioAU(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test
	@Parameters({ "TollCarrierTollPrioNZ","AccountNumberTPrioNZ", "AccountAccessTypeFullFinancial"})
	public void addTemplatePrioNZ(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}


	
	private void addAccount(String Carrier, String AccountNo, String AccessType) {
		String NewAccountNumber = AccountNo;
		//Random Account Number - for testing only
		int Number = (int) (Math.random()*10000);
		String newNumber = String.valueOf(Number);
		
		if (NewAccountNumber == "") {
		NewAccountNumber = "Toll"+newNumber;	
		}
		String totalAccounts[]= NewAccountNumber.split(",");
		
		
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Accounts Page");
		PageBase.click(MyTollHomePageActions.myAccountMenu, 20);
		
		
		//the below for loop is for adding multiple account numbers for one carrier. Provide account numbers in the format "1111,2222,333,"
		for (int i = 0; i<totalAccounts.length; i++ ) {
			Reporter.log("User Clicks Add Account");
			PageBase.moveToElement(BookAPickupActions.addAccount);
			PageBase.click(BookAPickupActions.addAccount, 10);
			PageBase.MaximumWaitForElementEnabled();
			Reporter.log("User Selects Toll Carrier - "+Carrier );
			PageBase.click(BookAPickupActions.addAccountCarrier, 10);
			PageBase.click(By.xpath("//*[@id=\"addAccountForm\"]//*//div/ul/li/div[text()='"+Carrier+"']"), 10);
			Reporter.log("User Enters Account Number -"+totalAccounts[i]);
			PageBase.sendText(BookAPickupActions.addAccountNumber, 10, totalAccounts[i]);
			Reporter.log("User Selects Access Type - "+AccessType);
			PageBase.click(BookAPickupActions.addAccountAccessType, 10);
			PageBase.click(By.xpath("//*[@id=\"addAccountForm\"]//*//ul/li/div[text()='"+AccessType+"']"), 10);
			Reporter.log("User Clicks Save");
			PageBase.click(BookAPickupActions.addAccountSave, 10);
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			//Verify Template Save Successfully
			PageBase.verifyTextExist(BookAPickupActions.addAccountSaveMsg, "Account Has Been Successfully Added.");
			PageBase.click(BookAPickupActions.addAccountSaveMsgClose, 10);
			PageBase.MaximumWaitForElementEnabled();
			
			//User Filters Carriers
			PageBase.click(BookAPickupActions.addAccountCarrierSelector, 5);
			PageBase.click(By.xpath("//*[@id=\"BU-selector\"]//*//div[text()='"+Carrier+"']"),5);
			
			//Verify New Account Exists
			Reporter.log("User Verifies if New Account Exits");
			try {
				while(PageBase.waitForElement(By.xpath("//*[@id=\"portlet_mytolluserAccountportlet_WAR_mytollupsportlet\"]//*//p[contains(text(),'"+totalAccounts[i]+"')]"), 1) == null) {
					PageBase.moveToElement(BookAPickupActions.addAccountViewMore);
					PageBase.click(BookAPickupActions.addAccountViewMore, 5);
				}
				Reporter.log("New AccountNo : "+totalAccounts[i]+ " Exists");
				System.out.println("New AccountNo : "+totalAccounts[i]+ " Exists");
			}
			catch (Exception e) {
				Reporter.log("FAILED: New AccountNo : "+totalAccounts[i]+ " Does Not Exists");
				Assert.fail("FAILED: New AccountNo : "+totalAccounts[i]+ " Does Not Exists");
			}
			
			//User Deletes New Account Created
			PageBase.MaximumWaitForElementEnabled();
			Reporter.log("User Deletes New Account Created");
			PageBase.click(By.xpath("//*[@id=\"portlet_mytolluserAccountportlet_WAR_mytollupsportlet\"]//*//p[contains(text(),'"+totalAccounts[i]+"')]/following::div[@class='account-list-col delete']/a"), 5);
			PageBase.MaximumWaitForElementEnabled();
			PageBase.verifyTextExist(BookAPickupActions.addAccountDeleteMsg, "YOU HAVE REQUESTED YOUR ACCOUNT TO BE DELETED.");
			PageBase.click(BookAPickupActions.addAccountDeleteContinue, 5);
			PageBase.MaximumWaitForElementEnabled();
			PageBase.verifyTextExist(BookAPickupActions.addAccountDeleteSuccessfull, "Account Has Been Successfully Deleted.");
			PageBase.click(BookAPickupActions.addAccountDeleteClose, 5);
		
		}
		
	}
	
	

	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();

	}

}
