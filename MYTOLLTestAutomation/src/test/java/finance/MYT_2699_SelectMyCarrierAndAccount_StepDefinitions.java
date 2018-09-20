package financials.stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import Finance.FinanceActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class MYT_2699_SelectMyCarrierAndAccount_StepDefinitions {
	
	
	


	@Then("^The screen needs to display the name of the Carrier and the Account Number\\.$")
	public void the_screen_needs_to_display_the_name_of_the_Carrier_and_the_Account_Number(DataTable financeTestData) throws Throwable {
	  
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
			
			assertEquals(finance.get("TollCarrier"), FinanceActions.GetTollCarrier());
			//assertEquals(finance.get("AccountNumber"), Finance.GetAccountNumber());
			assertTrue(FinanceActions.GetAccountNumber().contains(finance.get("AccountNumber")));
		}
		
	}

}
