package FinanceActions;

import org.openqa.selenium.By;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;

public class FinanceActions {
	
	public static By FinanceMegaMenu = By.xpath("//*[@id=\"my-finance\"]/p"); 
	public static By MyInvoicesHeading = By.xpath("//*[@id=\"portlet_mytollfinancialsportlet_WAR_mytollfinancialsportlet\"]/div/div/div/div[1]/header/div/h1");
	public static By TollCarrierLabel = By.xpath("//*[@id=\"finance-step1\"]/div[1]/div[1]/label"); 
	public static By accountNumberLabel = By.xpath("//*[@id=\"finance-step1\"]/div[1]/div[2]/label"); 
	public static By searchTypeLabel = By.xpath("//*[@id=\"finance-step1\"]/div[2]/div[1]/label"); 
	public static By accountAccessMessage = By.xpath("//*[@id=\"outage-box-wrapper\"]/div/div[1]/div[2]/p[1]");
	public static By accountAccessType = By.xpath("//*[@id=\"portlet_mytolluserAccountportlet_WAR_mytollupsportlet\"]/div/div/div/div[1]/div[1]/div[4]/ul/li[2]/div[1]/div[3]/p"); 
	public static By tollCarrierTextField = By.id("toll_carrier"); 
	public static By tollCarrierItem = By.xpath("//*[@id=\"toll-carrier-selector\"]/div[2]/ul/li[4]/div"); 
	public static By accountNumberTextField = By.id("account_num"); 
	
	
	public static void ClickFinance() {
		PageBase.ClickOn(FinanceMegaMenu, 5);

	}
	
	public static String GetMyInvoicesHeading()
	{
		return PageBase.GetText(MyInvoicesHeading, 5);
		
	
	}
	
	public static String GetTollCarrierHeading()
	{
		return PageBase.GetText(TollCarrierLabel, 5);
		
	
	}
	
	public static String GetTollCarrier()
	{
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(tollCarrierTextField, 5);
		
	
	}
	
	public static String GetAccountNumberLabelHeading()
	{
		return PageBase.GetText(accountNumberLabel, 5);
		
	
	}
	
	public static String GetAccountNumber()
	{
		
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(accountNumberTextField, 5);
		
	
	}
	
	public static String GetSearchTypeLabelLabelHeading()
	{
		return PageBase.GetText(searchTypeLabel, 5);
		
	
	}
	
	public static String GetAccountAccessMessage()
	{
		return PageBase.GetText(accountAccessMessage, 5);
	
	
	}
	
	public static String GetAccountAccessType()
	{
		return PageBase.GetText(accountAccessType, 5);
		
	
	}
	
	public static void EnterTollCarrier(String pTollCarrierName) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(tollCarrierTextField, pTollCarrierName, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"toll-carrier-selector\"]/div[2]/ul/li/div[text()='"+pTollCarrierName+"']"), 10);
	}
	
	public static void EnterAccountNumber(String pAccountNumber) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(accountNumberTextField, pAccountNumber, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"account-number-selector\"]/div[2]/ul/li/div[text()='"+pAccountNumber+" "+"']"), 10);

	}

}

