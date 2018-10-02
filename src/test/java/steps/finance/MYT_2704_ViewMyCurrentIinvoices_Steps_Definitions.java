package steps.finance;

import java.util.Map;

import finance.FinanceActions;
import global.PageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYT_2704_ViewMyCurrentIinvoices_Steps_Definitions {
	
	
	@Given("^User selects below Toll carrier and the account number that has full financial access$")
	public void user_selects_below_Toll_carrier_and_the_account_number_that_has_full_financial_access(DataTable financeTestData) throws Throwable {
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.EnterTollCarrier(finance.get("TollCarrier"));
			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.EnterAccountNumberWithName(finance.get("AccountNumber"));
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
		}
	}
	
	
	@When("^User enters Search Invoice number for TE$")
	public void user_enters_Search_Invoice_number_for_TE(DataTable financeTestData) throws Throwable {
	 
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.EnterInvoiceNumberIE(finance.get("Search Invoice number"));

		}
	}
	
	@When("^User clicks on Account Summary to view trial balance$")
	public void user_clicks_on_Account_Summary_to_view_trial_balance() throws Throwable {
		FinanceActions.ClickViewAccountSummary();
	}

	@Then("^User be able to see all my invoices display for the current period$")
	public void user_be_able_to_see_all_my_invoices_display_for_the_current_period(DataTable arg1) throws Throwable {
	   
	}

	@Then("^User be able to view following heading details in  Current Trial Balance screen\\.$")
	public void user_be_able_to_view_following_heading_details_in_Current_Trial_Balance_screen(DataTable arg1) throws Throwable {
	 
	}

	@Then("^User be able to see \"([^\"]*)\" and \"([^\"]*)\" for all invoices listed\\.$")
	public void user_be_able_to_see_and_for_all_invoices_listed(String arg1, String arg2) throws Throwable {
	 
	}

	@When("^User clicks on Ascending$")
	public void user_clicks_on_Ascending() throws Throwable {
	
	}

	@Then("^Current invoices should be sorted in ascending order$")
	public void current_invoices_should_be_sorted_in_ascending_order() throws Throwable {
	 
	}

	@When("^User clicks on Descending$")
	public void user_clicks_on_Descending() throws Throwable {
	   
	}

	@Then("^Current invoices should be sorted in descending order$")
	public void current_invoices_should_be_sorted_in_descending_order() throws Throwable {
	    
	}

}
