package finance;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import global.PageBase;
import baseWebdriver.BaseWebdriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mytollhomepage.MyTollHomePageActions;

public class MYT_2700_ViewAndAccessMyAccountSummary_StepsDefinitions {

	

	@Then("^User be able to view below details$")
	public void user_be_able_to_view_below_details(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			assertEquals(FinanceActions.GetTollCarrier(), finance.get("TollCarrier"));
			//assertEquals(finance.GetAccountNumber(), finance.get("AccountNumber"));
			assertTrue(FinanceActions.GetAccountNumber().contains(finance.get("AccountNumber")));
			assertEquals(FinanceActions.GetCurrent(), finance.get("Total Due"));
			assertEquals(FinanceActions.Get30Days(), finance.get("30Days"));
			assertEquals(FinanceActions.Get60Days(), finance.get("60Days"));
			assertEquals(FinanceActions.Get90Days(), finance.get("90Days"));
			assertEquals(FinanceActions.Get120Days(), finance.get("120Days"));
			//assertEquals(finance.GetToatlChargeAmount().replaceAll("\\s", ""),
					//finance.get("Total ChargeAmount").replaceAll("\\s", ""));

		}

	}

	@Then("^User be able to search invoices using following deatils$")
	public void user_be_able_to_search_invoices_using_following_deatils(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetInvoiceLabel(), finance.get("InvoiceSearchHeading"));
			assertEquals(FinanceActions.GetDateRangeLabel(), finance.get("DateRangeHeading"));

		}

	}

	

	@Then("^User be able to view Recent Invoice and Invoice Download$")
	public void user_be_able_to_view_Recent_Invoice_and_Invoice_Download(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			//assertEquals(finance.GetInvoiceDatePrio(), finance.get("InvoiceDate"));
			assertEquals(FinanceActions.GetInvoiceNumberPrio(), finance.get("InvoiceNumber"));
		    //assertEquals(finance.GetChargeAmountPrio(), finance.get("Chargeamount"));
			assertEquals(FinanceActions.GetShipmentDocumentsPrio(), finance.get("ShipmentsView"));
			assertEquals(FinanceActions.GetDownloadBtn(), finance.get("Download"));

		}
	}

	@Then("^User be able to view Recent Invoices and Invoice Download$")
	public void user_be_able_to_view_Recent_Invoices_and_Invoice_Download(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetInvoiceDatePrio(), finance.get("InvoiceDate"));
			assertEquals(FinanceActions.GetInvoiceNumberPrio(), finance.get("InvoiceNumber"));
			assertEquals(FinanceActions.GetChargeAmountPrio(), finance.get("Chargeamount"));
			assertEquals(FinanceActions.GetShipmentDocumentsPrio(), finance.get("ShipmentsView"));
			assertEquals(FinanceActions.GetDownloadBtn(), finance.get("Download"));

		}

	}

	@When("^User selects Search Invoice by Date range$")
	public void user_selects_Search_Invoice_by_Date_range(DataTable financeTestData) throws Throwable {
		//finance.SearchInvoiceDateRange();
		
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.ClickDateRangeRadioBtn();
			
		 //Date From
		PageBase.MediumWaitForElementEnabled_1();
		((JavascriptExecutor)BaseWebdriver.driver).executeScript("document.getElementById('tdf_from_date').removeAttribute('readonly',0);");
        ((JavascriptExecutor)BaseWebdriver.driver).executeScript("document.getElementById('tdf_from_date').setAttribute('placeholder','"+finance.get("DateFrom")+"');");
		WebElement fromDateBox= BaseWebdriver.driver.findElement(By.id("tdf_from_date"));
		fromDateBox.clear();
		fromDateBox.sendKeys(finance.get("DateFrom"));
		
		//Date To
		PageBase.MediumWaitForElementEnabled_1();
		((JavascriptExecutor)BaseWebdriver.driver).executeScript("document.getElementById('tdf_to_date').removeAttribute('readonly',0);");
        ((JavascriptExecutor)BaseWebdriver.driver).executeScript("document.getElementById('tdf_to_date').setAttribute('placeholder','"+finance.get("DateTo")+"');"); 
		WebElement fromDateBox2= BaseWebdriver.driver.findElement(By.id("tdf_to_date"));
		fromDateBox2.clear();
		fromDateBox2.sendKeys(finance.get("DateTo"));
		}
	}

	@Then("^User be able to enter Invoice Number for download$")
	public void user_be_able_to_enter_Invoice_Number_for_download(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.EnterInvoiceNumberIPEC(finance.get("Invoice Number"));

		}
	}

	@Then("^User clicks on Download Results$")
	public void user_clicks_on_Download_Results() throws Throwable {
		FinanceActions.ClickDownloadResultsBtn();
	}
	
	@Then("^User Can see download successful message$")
	public void user_Can_see_download_successful_message(DataTable financeTestData) throws Throwable {
	  
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetDownloadSuccessfulMsg(), finance.get("Message"));
			

		}
	}

	@Then("^User be able to view Download results as follow$")
	public void user_be_able_to_view_Download_results_as_follow(DataTable financeTestData) throws Throwable {
		
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
			MyTollHomePageActions.ClickMenu();
			FinanceActions.ClickFinance();	
			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetFileNameIPEC(), finance.get("FileName"));
			assertEquals(FinanceActions.GetStatusIPEC(), finance.get("Status"));
		    assertEquals(FinanceActions.GetFileSizeIPEC(), finance.get("Size"));
		
		}
	}

	@Then("^User clicks on Delete$")
	public void user_clicks_on_Delete() throws Throwable {
		PageBase.MaximumWaitForElementEnabled();
		FinanceActions.CloseDownloadSuccessfulMsg();
	}
}
