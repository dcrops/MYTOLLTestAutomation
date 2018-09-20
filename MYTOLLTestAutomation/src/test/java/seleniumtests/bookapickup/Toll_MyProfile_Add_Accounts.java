package bookAPickup.tests;

import Global.PageBase;
import static org.junit.Assert.assertEquals;

import bookAPickup.BookAPickupActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import myTollHomePage.MyTollHomePageActions;

public class Toll_MyProfile_Add_Accounts {



	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername4, BaseWebdriver.Password);
		
	}
	
	
	@Test(groups = { "E2E"})
	@Parameters({ "TollCarrierTollTasmania","AccountNumberTTas", "AccountAccessTypeFullFinancial"})
	public void addAccountsTasmania(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test(groups = { "Shakeout Testing" , "E2E" })
	@Parameters({ "TollIntermodalSpecialised","AccountNumberTNQX", "AccountAccessTypeFullFinancial"})
	public void addAccountsNQX(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test(groups = { "Shakeout Testing", "E2E" })
	@Parameters({ "TollCarrierTollIPEC","AccountNumberTIPEC", "AccountAccessTypeFullFinancial"})
	public void addAccountsIPEC(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test(groups = { "Shakeout Testing", "E2E" })
	@Parameters({ "TollCarrierTollPrioAU","AccountNumberTPrioAU", "AccountAccessTypeFullFinancial"})
	public void addAccountsPrioAU(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}
	
	@Test(groups = { "E2E" })
	@Parameters({ "TollCarrierTollPrioNZ","AccountNumberTPrioNZ", "AccountAccessTypeFullFinancial"})
	public void addAccountsPrioNZ(String TollCarrier, String AccountNo, String AccessType ) {
		this.addAccount(TollCarrier, AccountNo,  AccessType);
	}

	
	@Test(groups = { "E2E" })
	@Parameters({ "StandardAccess","ThirdPartyAccess", "FullFinancialAccess"})
	public void viewSLA(String StandardAccess, String ThirdPartyAccess, String FullFinancialAccess ) {
		this.viewSLAMsg(StandardAccess, ThirdPartyAccess, FullFinancialAccess);
	}

	
	private void addAccount(String Carrier, String AccountNo, String AccessType) {
		String NewAccountNumber = AccountNo;
		//Random Account Number - for testing only
		int Number = (int) (Math.random()*20000);
		String newNumber = String.valueOf(Number);
		
		if (NewAccountNumber == "") {
		NewAccountNumber = "TOLL"+newNumber;	
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
			PageBase.MaximumWaitForElementEnabled_1();
			Reporter.log("User Selects Toll Carrier - "+Carrier );
			PageBase.click(BookAPickupActions.addAccountCarrier, 10);
			PageBase.click(By.xpath("//*[@id=\"addAccountForm\"]//*//div/ul/li/div[contains(text(),'"+Carrier+"')]"), 10);
			Reporter.log("User Enters Account Number -"+totalAccounts[i]);
			PageBase.sendText(BookAPickupActions.addAccountNumber, 10, totalAccounts[i]);
			Reporter.log("User Selects Access Type - "+AccessType);
			PageBase.click(BookAPickupActions.addAccountAccessType, 10);
			PageBase.click(By.xpath("//*[@id=\"addAccountForm\"]//*//ul/li/div[text()='"+AccessType+"']"), 10);
			Reporter.log("User Clicks Save");
			PageBase.click(BookAPickupActions.addAccountSave, 10);
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.MaximumWaitForElementEnabled_1();
			//Verify Template Save Successfully  [Story] MYT-8251
			PageBase.verifyTextExist(BookAPickupActions.addAccountSaveMsg, "Account approval pending");
			PageBase.click(BookAPickupActions.addAccountSaveMsgClose, 10);
			PageBase.MaximumWaitForElementEnabled_1();
			
			//User Filters Carriers
			PageBase.click(BookAPickupActions.addAccountCarrierSelector, 5);
			PageBase.click(By.xpath("//*[@id=\"BU-selector\"]//*//div[contains(text(),'"+Carrier+"')]"),5);
			
			//Verify New Account Exists
			Reporter.log("User Verifies if New Account Exits");
			try {
				while(PageBase.waitForElement(By.xpath("//*[@id=\"portlet_mytolluserAccountportlet_WAR_mytollupsportlet\"]//*//ul/li/div/div/p[contains(text(),'"+totalAccounts[i]+"')]"), 1) == null) {
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
			PageBase.MaximumWaitForElementEnabled_1();
			Reporter.log("User Deletes New Account Created");
			PageBase.click(By.xpath("//*[@id=\"portlet_mytolluserAccountportlet_WAR_mytollupsportlet\"]//*//ul/li/div/div/p[contains(text(),'"+totalAccounts[i]+"')]/following::div[@class='account-list-col delete']/a"), 5);
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExist(BookAPickupActions.addAccountDeleteMsg, "YOU HAVE REQUESTED YOUR ACCOUNT TO BE DELETED.");
			PageBase.click(BookAPickupActions.addAccountDeleteContinue, 5);
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExist(BookAPickupActions.addAccountDeleteSuccessfull, "Account Has Been Successfully Deleted.");
			PageBase.click(BookAPickupActions.addAccountDeleteClose, 5);
		
		}
		
	}
	
	private void viewSLAMsg(String StandardAccess, String ThirdPartyAccess, String FullFinancialAccess) {
		
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Accounts Page");
		PageBase.click(MyTollHomePageActions.myAccountMenu, 20);
		Reporter.log("User Clicks Add Account");
		PageBase.moveToElement(BookAPickupActions.addAccount);
		PageBase.click(BookAPickupActions.addAccount, 10);
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.click(BookAPickupActions.addAccountToggler, 10);
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.moveToElement(BookAPickupActions.addAccountSLAStandardAccess);
		PageBase.verifyTextExist(BookAPickupActions.addAccountSLAStandardAccess, "Standard Access");
		PageBase.verifyTextExistContains(BookAPickupActions.addAccountSLAStandardAccessMsg, StandardAccess);
		PageBase.verifyTextExist(BookAPickupActions.addAccountSLATPAccess, "Third Party Access");
		PageBase.verifyTextExistContains(BookAPickupActions.addAccountSLATPAccessMsg, ThirdPartyAccess);
		PageBase.verifyTextExist(BookAPickupActions.addAccountSLAFullFinancialAccess, "Full Financial Access");
		PageBase.verifyTextExistContains(BookAPickupActions.addAccountSLASFullFinancianAccessMsg, FullFinancialAccess);

		
	}
	
	

	@AfterMethod(alwaysRun = true)
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();

	}

}
