package financialsStepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import FinanceActions.FinanceActions;
import GlobalActions.PageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYT_2700_ViewAndAccessMyAccountSummary_StepsDefinitions {

	@When("^User selects Search Type as below$")
	public void user_selects_Search_Type_as_below(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();

			FinanceActions.EnterSearchType(finance.get("SearchType"));

		}
	}

	@Then("^User be able to view below details$")
	public void user_be_able_to_view_below_details(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			assertEquals(FinanceActions.GetTollCarrier(), finance.get("TollCarrier"));
			assertEquals(FinanceActions.GetAccountNumber(), finance.get("AccountNumber"));
			assertEquals(FinanceActions.GetCurrent(), finance.get("Total Due"));
			assertEquals(FinanceActions.Get30Days(), finance.get("30Days"));
			assertEquals(FinanceActions.Get60Days(), finance.get("60Days"));
			assertEquals(FinanceActions.Get90Days(), finance.get("90Days"));
			assertEquals(FinanceActions.Get120Days(), finance.get("120Days"));
			assertEquals(FinanceActions.GetToatlChargeAmount().replaceAll("\\s", ""),
					finance.get("Total ChargeAmount").replaceAll("\\s", ""));

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

	@When("^User enters Search Invoice number$")
	public void user_enters_Search_Invoice_number(DataTable financeTestData) throws Throwable {
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.EnterInvoiceNumber(finance.get("Search Invoice number"));

		}

	}

	@When("^User clicks on Search$")
	public void user_clicks_on_Search() throws Throwable {
		FinanceActions.ClickSearchBtn();

	}

	@Then("^User be able to view Recent Invoice and Invoice Download$")
	public void user_be_able_to_view_Recent_Invoice_and_Invoice_Download(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetInvoiceDate(), finance.get("InvoiceDate"));
			assertEquals(FinanceActions.GetInvoiceNumber(), finance.get("InvoiceNumber"));
		    assertEquals(FinanceActions.GetChargeAmount(), finance.get("Chargeamount"));
			assertEquals(FinanceActions.GetShipmentDocuments(), finance.get("ShipmentsView"));
			assertEquals(FinanceActions.GetDownloadBtn(), finance.get("Download"));

		}
	}

	@Then("^User be able to view Recent Invoices and Invoice Download$")
	public void user_be_able_to_view_Recent_Invoices_and_Invoice_Download(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetInvoiceDate(), finance.get("InvoiceDate"));
			assertEquals(FinanceActions.GetInvoiceNumber(), finance.get("InvoiceNumber"));
			assertEquals(FinanceActions.GetChargeAmount(), finance.get("Chargeamount"));
			assertEquals(FinanceActions.GetShipmentDocuments(), finance.get("ShipmentsView"));
			assertEquals(FinanceActions.GetDownloadBtn(), finance.get("Download"));

		}

	}

	@When("^User selects Search Invoice by Date range$")
	public void user_selects_Search_Invoice_by_Date_range() throws Throwable {
		FinanceActions.SearchInvoiceDateRange();
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

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetFileName(), finance.get("FileName"));
			assertEquals(FinanceActions.GetStatus(), finance.get("Status"));
		    assertEquals(FinanceActions.GetFileSize(), finance.get("Size"));
		
		}
	}

	@Then("^User clicks on Delete$")
	public void user_clicks_on_Delete() throws Throwable {
		PageBase.MaximumWaitForElementEnabled();
		FinanceActions.CloseDownloadSuccessfulMsg();
	}
}
