package financialsStepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import FinanceActions.FinanceActions;
import GlobalActions.PageBase;
import bookAPickupActions.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYT_3766_ExpandingThePaymentAdjustmentForAnInvoice_StepDefinitions {

	@When("^User clicks on following Consignment$")
	public void user_clicks_on_following_Consignment(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
			FinanceActions.ClickOnConsignementInvoiceSummary(finance.get("Consignment"));
			PageBase.Scrollbar(250, 800);
		}

	}

	@When("^User expands the Payment Adjustments section$")
	public void user_expands_the_Payment_Adjustments_section(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			// PageBase.Scrollbar(300, 600);
			// FinanceActions.ClickOnFuelSurchargesInvoiceSummary();
			PageBase.MoveToElement(FinanceActions.basicChargesInvoiceSummary,
					FinanceActions.basicChargesInvoiceSummary);
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MoveToElement(FinanceActions.basicChargesInvoiceSummary,
					FinanceActions.basicChargesInvoiceSummary);

			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			//assertEquals(FinanceActions.GetPaymentAdjustments(),
			//finance.get("PaymentAdjustments"));

			FinanceActions.ClickOnPaymentAdjustments();

		}

	}

	@Then("^User can view following details$")
	public void user_can_view_following_details(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {
			assertEquals(FinanceActions.GetPaymentAdjustmentsRef1(), finance.get("Reference No1"));
			assertEquals(FinanceActions.GetPaymentAdjustmentsDate(), finance.get("Date"));
			assertEquals(FinanceActions.GetPaymentAdjustmentsAmount1(), finance.get("Amount1"));

		}
	}

}
