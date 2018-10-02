package steps.finance;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import finance.FinanceActions;
import org.testng.Assert;

public class MYT_2699_SelectMyCarrierAndAccount_StepDefinitions {
	
	
	


	@Then("^The screen needs to display the name of the Carrier and the Account Number\\.$")
	public void the_screen_needs_to_display_the_name_of_the_Carrier_and_the_Account_Number(DataTable financeTestData) throws Throwable {
	  
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
			
			Assert.assertEquals(finance.get("TollCarrier"), FinanceActions.GetTollCarrier());
			//assertEquals(finance.get("AccountNumber"), finance.GetAccountNumber());
			assertTrue(FinanceActions.GetAccountNumber().contains(finance.get("AccountNumber")));
		}
		
	}

}
