package FinanceActions;

import org.openqa.selenium.By;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;

public class FinanceActions {

	public static By FinanceMegaMenu = By.xpath("//*[@id=\"my-finance\"]/p");
	public static By MyInvoicesHeading = By.xpath(
			"//*[@id=\"portlet_mytollfinancialsportlet_WAR_mytollfinancialsportlet\"]/div/div/div/div[1]/header/div/h1");
	public static By TollCarrierLabel = By.xpath("//*[@id=\"finance-step1\"]/div[1]/div[1]/label");
	public static By accountNumberLabel = By.xpath("//*[@id=\"finance-step1\"]/div[1]/div[2]/label");
	public static By searchTypeLabel = By.xpath("//*[@id=\"finance-step1\"]/div[2]/div[1]/label");
	public static By accountAccessMessage = By.xpath("//*[@id=\"outage-box-wrapper\"]/div/div[1]/div[2]/p[1]");
	public static By accountAccessType = By.xpath(
			"//*[@id=\"portlet_mytolluserAccountportlet_WAR_mytollupsportlet\"]/div/div/div/div[1]/div[1]/div[4]/ul/li[2]/div[1]/div[3]/p");
	public static By tollCarrierTextField = By.id("toll_carrier");
	public static By tollCarrierItem = By.xpath("//*[@id=\"toll-carrier-selector\"]/div[2]/ul/li[4]/div");
	public static By accountNumberTextField = By.id("account_num");
	public static By searchTypeTextField = By.id("search_type");
	public static By totalChargeAmount = By.xpath("//*[@id=\"aging-tab-wrapper\"]/ul[@class='nav nav-tabs aging']/li/a[@class='days outstandingText']"); 
	public static By current = By
			.xpath("//*[@id=\"aging-tab-wrapper\"]/ul/li/a[@class='days agingDays']/span[text()='Current']");
	public static By Label30Days = By
			.xpath("//*[@id=\"aging-tab-wrapper\"]/ul/li/a[@class='days agingDays']/span[text()='30 days']");
	public static By Label60Days = By
			.xpath("//*[@id=\"aging-tab-wrapper\"]/ul/li/a[@class='days agingDays']/span[text()='60 days']");
	public static By Label90Days = By
			.xpath("//*[@id=\"aging-tab-wrapper\"]/ul/li/a[@class='days agingDays']/span[text()='90 days']");
	public static By Label120Days = By
			.xpath("//*[@id=\"aging-tab-wrapper\"]/ul/li/a[@class='days agingDays']/span[text()='120 days +']");

	public static void ClickFinance() {
		PageBase.ClickOn(FinanceMegaMenu, 5);

	}  

	public static String GetMyInvoicesHeading() {
		return PageBase.GetText(MyInvoicesHeading, 5);

	}

	public static String GetTollCarrierHeading() {
		return PageBase.GetText(TollCarrierLabel, 5);

	}

	public static String GetTollCarrier() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(tollCarrierTextField, 5);

	}

	public static String GetAccountNumberLabelHeading() {
		return PageBase.GetText(accountNumberLabel, 5);

	}

	public static String GetAccountNumber() {

		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(accountNumberTextField, 5);

	}

	public static String GetSearchTypeLabelLabelHeading() {
		return PageBase.GetText(searchTypeLabel, 5);

	}

	public static String GetAccountAccessMessage() {
		return PageBase.GetText(accountAccessMessage, 5);

	}

	public static String GetAccountAccessType() {
		return PageBase.GetText(accountAccessType, 5);

	}

	public static void EnterTollCarrier(String pTollCarrierName) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(tollCarrierTextField, pTollCarrierName, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(
				By.xpath("//*[@id=\"toll-carrier-selector\"]/div[2]/ul/li/div[text()='" + pTollCarrierName + "']"), 10);
	}

	public static void EnterAccountNumber(String pAccountNumber) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(accountNumberTextField, pAccountNumber, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(
				By.xpath(
						"//*[@id=\"account-number-selector\"]/div[2]/ul/li/div[text()='" + pAccountNumber + " " + "']"),
				10);

	}

	public static void EnterSearchType(String pSearchType) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(searchTypeTextField, pSearchType, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"search-type-selector\"]/div[2]/ul/li/div[text()='" + pSearchType + "']"),
				10);
	}

	public static String GetToatlChargeAmount() {
		return PageBase.GetText(totalChargeAmount, 5).replaceAll("//s", "");

	}

	public static String GetCurrent() {
		return PageBase.GetText(current, 5);

	}

	public static String Get30Days() {
		return PageBase.GetText(Label30Days, 5);

	}

	public static String Get60Days() {
		return PageBase.GetText(Label60Days, 5);

	}

	public static String Get90Days() {
		return PageBase.GetText(Label90Days, 5);

	}

	public static String Get120Days() {
		return PageBase.GetText(Label120Days, 5);

	}

}
