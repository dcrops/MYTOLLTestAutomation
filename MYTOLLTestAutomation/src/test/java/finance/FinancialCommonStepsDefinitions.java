package commonStepsDefinitions;

import java.util.Map;

import Finance.FinanceActions;
import Global.PageBase;
import baseWebdriver.BaseWebdriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import myTollHomePage.MyTollHomePageActions;

public class FinancialCommonStepsDefinitions {
	
	@Given("^User is Registered in MyToll$")
	public void user_is_Registered_in_MyToll() throws Throwable {
	  
		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
				
	}
	
	@Given("^User is Registered in MyToll and user has full financial access$")
	public void user_is_Registered_in_MyToll_and_user_has_full_financial_access() throws Throwable {
		BaseWebdriver.setUp();
		PageBase.MaximumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		FinanceActions.ClickFinance();		
		
		
	}
	

	@When("^User selects below Toll carrier and the account that has full financial access$")
	public void user_selects_below_Toll_carrier_and_the_account_that_has_full_financial_access(DataTable financeTestData) throws Throwable {
	   
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.EnterTollCarrier(finance.get("TollCarrier"));
			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.EnterAccountNumberWithName(finance.get("AccountNumber"));
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
		}
		 
	}
	
	@When("^User selects Toll carrier and the account that has full financial access$")
	public void user_selects_Toll_carrier_and_the_account_that_has_full_financial_access(DataTable financeTestData) throws Throwable {
		
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.EnterTollCarrier(finance.get("TollCarrier"));
			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.EnterAccountNumberWithName(finance.get("AccountNumber"));
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
		}
	}
	
	@When("^User selects Search Type as below$")
	public void user_selects_Search_Type_as_below(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();

			FinanceActions.EnterSearchType(finance.get("SearchType"));

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
	
}
