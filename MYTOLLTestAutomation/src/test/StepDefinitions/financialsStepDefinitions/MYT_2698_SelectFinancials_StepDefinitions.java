package financialsStepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import FinanceActions.FinanceActions;
import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;

public class MYT_2698_SelectFinancials_StepDefinitions {

	

	@When("^User selects Financials or Accounts summary$")
	public void user_selects_Financials_or_Accounts_summary() throws Throwable {
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		FinanceActions.ClickFinance();
		
	}

	
	@Then("^User be able to see My Invoice details$")
	public void user_be_able_to_see_My_Invoice_details(DataTable financeTestData) throws Throwable {
	 
		
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
				
			assertEquals(finance.get("ScreenHeading"), FinanceActions.GetMyInvoicesHeading());
			
		}
		 
		
	}
	
	@Then("^User must see the Accounts Summary screen displaying$")
	public void user_must_see_the_Accounts_Summary_screen_displaying(DataTable financeTestData) throws Throwable {
	  
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
			
			assertEquals(finance.get("TollCarrierLabel"), FinanceActions.GetTollCarrierHeading());
			assertEquals(finance.get("AccountNumberLabel"), FinanceActions.GetAccountNumberLabelHeading());
			assertEquals(finance.get("SerachTypeLabel"), FinanceActions.GetSearchTypeLabelLabelHeading());
			
		}
	}
}
