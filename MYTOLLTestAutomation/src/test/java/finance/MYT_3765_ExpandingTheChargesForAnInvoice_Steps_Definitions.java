package financials.stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import Finance.FinanceActions;
import Global.PageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYT_3765_ExpandingTheChargesForAnInvoice_Steps_Definitions {

	@When("^User enters Invoice number for search$")
	public void user_enters_Invoice_number_for_search(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			FinanceActions.EnterInvoiceNumberIntermodalSpec(finance.get("Search Invoice number"));

		}
	}

	@Then("^User be able to view Invoice details as below$")
	public void user_be_able_to_view_Invoice_details_as_below(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetInvoiceDateInter(), finance.get("InvoiceDate"));
			assertEquals(FinanceActions.GetInvoiceNumberInter(), finance.get("InvoiceNumber"));
			assertEquals(FinanceActions.GetDueDateInter(), finance.get("DueDate"));
			assertEquals(FinanceActions.GetChargeAmountInter(), finance.get("Chargeamount"));
			assertEquals(FinanceActions.GetPaidInter(), finance.get("Paid"));
			assertEquals(FinanceActions.GetOutstandingInter(), finance.get("Outstanding"));

		}

	}

	@When("^User clicks on an invoice to view invoice details$")
	public void user_clicks_on_an_invoice_to_view_invoice_details() throws Throwable {

		FinanceActions.ClickAnInvoice();
	}

	@Then("^User be able to view Invoice details in the invoice summary screen$")
	public void user_be_able_to_view_Invoice_details_in_the_invoice_summary_screen(DataTable financeTestData)
			throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetInvoiceNumberInvoiceSummary(), finance.get("InvoiceNumber"));
			assertEquals(FinanceActions.GetTollCarrierInvoiceSummary(), finance.get("TollCarrier"));
			assertEquals(FinanceActions.GetDateInvoiceSummary(), finance.get("Date"));
			assertEquals(FinanceActions.GetChargeAmountInvoiceSummary(), finance.get("Chargeamount"));
			assertEquals(FinanceActions.GetPaidInvoiceSummary(), finance.get("Paid"));
			assertEquals(FinanceActions.GetDueDateInvoiceSummary(), finance.get("DueDate"));
			assertEquals(FinanceActions.GetOutstandingInvoiceSummary(), finance.get("Outstanding"));
			assertEquals(FinanceActions.GetAccountNumberInvoiceSummary(), finance.get("AccountNumber"));
			assertEquals(FinanceActions.GetOutstandingHeaderInvoiceSummary(), finance.get("OutstandingHeader"));
			assertEquals(FinanceActions.GetNumberOfResultsInvoiceSummary(), finance.get("NumberOfResults"));

		}
	}
	
	@Then("^User can see one of Toll Energy shipments details as below$")
	public void user_can_see_one_of_Toll_Energy_shipments_details_as_below(DataTable financeTestData) throws Throwable {
	
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			PageBase.Scrollbar(250, 500);
			assertEquals(FinanceActions.GetShipmentNoInvoiceSummary(finance.get("ShipmentNo")), finance.get("ShipmentNo"));
			assertEquals(FinanceActions.GetTypeInShipmentInvoiceSummary(finance.get("ShipmentNo")), finance.get("Type"));
			assertEquals(FinanceActions.GetChargeAmountInShipmentInvoiceSummary(finance.get("ShipmentNo")), finance.get("ChargeAmount"));
			assertEquals(FinanceActions.GetOutstandingInShipmentInvoiceSummary(finance.get("ShipmentNo")), finance.get("Outstanding"));

		}
	}

	@When("^User expands the Outstanding$")
	public void user_expands_the_Outstanding() throws Throwable {

		FinanceActions.ClickOutstandingArrowdownInvoiceSummary();
	}

	@Then("^User can see one of shipments details as below$")
	public void user_can_see_one_of_shipments_details_as_below(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			//PageBase.Scrollbar(250, 500);
			assertEquals(FinanceActions.GetShipmentNoInvoiceSummary(finance.get("ShipmentNo")), finance.get("ShipmentNo"));
			assertEquals(FinanceActions.GetTypeInShipmentInvoiceSummary(finance.get("ShipmentNo")), finance.get("Type"));
			assertEquals(FinanceActions.GetChargeAmountInShipmentInvoiceSummary(finance.get("ShipmentNo")), finance.get("ChargeAmount"));
			assertEquals(FinanceActions.GetOutstandingInShipmentInvoiceSummary(finance.get("ShipmentNo")), finance.get("Outstanding"));

		}

	}
	
	@Then("^User be able to see \"([^\"]*)\" section for following Consignment$")
	public void user_be_able_to_see_section_for_following_Consignment(String pCharges, DataTable financeTestData) throws Throwable {
		
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetChargesHeadingInvoiceSummary(finance.get("Consignment")), pCharges);

		}
	}

	@When("^User be able expands the Charges section$")
	public void user_be_able_expands_the_Charges_section() throws Throwable {

	}

	@Then("^User can view \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_can_view(String pBasicCharges, String pFreightCharges, String pFuelSurcharges, String pGST)
			throws Throwable {

		PageBase.MaximumWaitForElementEnabled();
		assertEquals(FinanceActions.GetTypeBasicChargesInvoiceSummary(), pBasicCharges);
		assertEquals(FinanceActions.GetTypeFreightChargesInvoiceSummary(), pFreightCharges);
		assertEquals(FinanceActions.GetTypeFuelSurchargesInvoiceSummary(), pFuelSurcharges);
		assertEquals(FinanceActions.GetTypeGSTInvoiceSummary(), pGST);

	}
	
	@Then("^User can view \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_can_view(String pBasicCharges, String pFreightCharges, String pGST)
			throws Throwable {

		PageBase.MaximumWaitForElementEnabled();
		assertEquals(FinanceActions.GetTypeBasicChargesInvoiceSummary(), pBasicCharges);
		assertEquals(FinanceActions.GetTypeFreightChargesInvoiceSummary(), pFreightCharges);
		assertEquals(FinanceActions.GetTypeGSTInvoiceSummary(), pGST);

	}
	
	@Then("^User can view \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_can_view(String pFreightCharges, String pGST)
			throws Throwable {

		PageBase.MaximumWaitForElementEnabled();
		assertEquals(FinanceActions.GetTypeFreightChargesInvoiceSummary(), pFreightCharges);
		assertEquals(FinanceActions.GetTypeGSTInvoiceSummary(), pGST);

	}

	@Then("^User can view Charge Type, Description, Charge amount for Basic Charges$")
	public void user_can_view_Charge_Type_Description_Charge_amount_for_Basic_Charges(DataTable financeTestData)
			throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetTypeBasicChargesInvoiceSummary(), finance.get("Charge Type"));
			assertEquals(FinanceActions.GetDescriptionBasicChargesInvoiceSummary(), finance.get("Description"));
			assertEquals(FinanceActions.GetChargesBasicChargesInvoiceSummary(), finance.get("Charge amount"));

		}
	}

	@Then("^User can view Charge Type, Description, Charge amount for Freight charges$")
	public void user_can_view_Charge_Type_Description_Charge_amount_for_Freight_charges(DataTable financeTestData)
			throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetTypeFreightChargesInvoiceSummary(), finance.get("Charge Type"));
			assertEquals(FinanceActions.GetDescriptionFreightChargesInvoiceSummary(), finance.get("Description"));
			assertEquals(FinanceActions.GetChargesFreightChargesInvoiceSummary(), finance.get("Charge amount"));

		}

	}

	@Then("^User can view Charge Type, Description, Charge amount for Fuel Surcharges$")
	public void user_can_view_Charge_Type_Description_Charge_amount_for_Fuel_Surcharges(DataTable financeTestData)
			throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetTypeFuelSurchargesInvoiceSummary(), finance.get("Charge Type"));
			assertEquals(FinanceActions.GetDescriptionFuelSurchargesInvoiceSummary(), finance.get("Description"));
			assertEquals(FinanceActions.GetChargesFuelSurchargesInvoiceSummary(), finance.get("Charge amount"));

		}

	}

	@Then("^User can view Charge Type, Description, Charge amount for GST$")
	public void user_can_view_Charge_Type_Description_Charge_amount_for_GST(DataTable financeTestData)
			throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetTypeGSTInvoiceSummary(), finance.get("Charge Type"));
			assertEquals(FinanceActions.GetDescriptionGSTInvoiceSummary(), finance.get("Description"));
			assertEquals(FinanceActions.GetChargesGSTInvoiceSummary(), finance.get("Charge amount"));

		}

	}

	@Then("^User can view GST and Total Charge$")
	public void user_can_view_GST_and_Total_Charge(DataTable financeTestData) throws Throwable {

		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetGSTValueInvoiceSummary(), finance.get("GST"));
			assertEquals(FinanceActions.GetTotalChargesInvoiceSummary(), finance.get("Total Charge"));

		}
	}

	@When("^User expands Basic Charges$")
	public void user_expands_Basic_Charges() throws Throwable {

		FinanceActions.ClickOnBasicChargesInvoiceSummary();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();

	}

	@Then("^User can see folowing fields are populated in Basic Charges$")
	public void user_can_see_folowing_fields_are_populated_in_Basic_Charges(DataTable financeTestData) throws Throwable {
	  
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetRateTypeBasicCharges(), finance.get("Rate Type"));
			assertEquals(FinanceActions.GetServiceBasicCharges(), finance.get("Service"));
			assertEquals(FinanceActions.GetModeBasicCharges(), finance.get("Mode"));
			assertEquals(FinanceActions.GetOriginBasicCharges(), finance.get("Origin"));
			assertEquals(FinanceActions.GetDestinationeBasicCharges(), finance.get("Destination"));
			assertEquals(FinanceActions.GetCommodityBasicCharges(), finance.get("Commodity"));
			assertEquals(FinanceActions.GetFullLoadBasicCharges(), finance.get("Full Load"));
			assertEquals(FinanceActions.GetMinBasicCharges(), finance.get("Min Amount (in dollars)"));
			assertEquals(FinanceActions.GetMaxBasicCharges(), finance.get("Max Amount (in dollars)"));
			PageBase.MaximumWaitForElementEnabled();
			PageBase.Scrollbar(800, 1000);
			assertEquals(FinanceActions.GetTotalBasicCharges(), finance.get("Total"));
			assertEquals(FinanceActions.GetBreakToltalChargesBasicCharges(), finance.get("Break Total Charge"));
			assertEquals(FinanceActions.GetQtyBasicCharges(), finance.get("Qty"));
			assertEquals(FinanceActions.GetRateUOMBasicCharges(), finance.get("Rate/UOM"));
			assertEquals(FinanceActions.GetUOMBasicCharges(), finance.get("UOM"));

		}
	}

	@When("^User expands Freight Charges$")
	public void user_expands_Freight_Charges() throws Throwable {
		FinanceActions.ClickOnFreightChargesInvoiceSummary();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		
	}
	
	@Then("^User can see folowing fields are populated in Freight Charges$")
	public void user_can_see_folowing_fields_are_populated_in_Freight_Charges(DataTable financeTestData) throws Throwable {
	   
		for (Map<String, String> finance : financeTestData.asMaps(String.class, String.class)) {

			PageBase.MaximumWaitForElementEnabled();
			assertEquals(FinanceActions.GetRateTypeFreightCharges(), finance.get("Rate Type"));
			assertEquals(FinanceActions.GetServiceFreightCharges(), finance.get("Service"));
			assertEquals(FinanceActions.GetModeFreightCharges(), finance.get("Mode"));
			assertEquals(FinanceActions.GetOriginFreightCharges(), finance.get("Origin"));
			assertEquals(FinanceActions.GetDestinationeFreightCharges(), finance.get("Destination"));
			assertEquals(FinanceActions.GetCommodityFreightCharges(), finance.get("Commodity"));
			assertEquals(FinanceActions.GetFullLoadFreightCharges(), finance.get("Full Load"));
			assertEquals(FinanceActions.GetMinFreightCharges(), finance.get("Min Amount (in dollars)"));
			assertEquals(FinanceActions.GetMaxFreightCharges(), finance.get("Max Amount (in dollars)"));
			PageBase.MaximumWaitForElementEnabled();
			PageBase.Scrollbar(800, 1000);
			assertEquals(FinanceActions.GetTotalFreightCharges(), finance.get("Total"));
			assertEquals(FinanceActions.GetBreakToltalChargesFreightCharges(), finance.get("Break Total Charge"));
			assertEquals(FinanceActions.GetQtyFreightCharges(), finance.get("Qty"));
			assertEquals(FinanceActions.GetRateUOMFreightCharges(), finance.get("Rate/UOM"));
			assertEquals(FinanceActions.GetUOMFreightCharges(), finance.get("UOM"));

		}
		
	}

	@When("^User expands Fuel Surcharges$")
	public void user_expands_Fuel_Surcharges() throws Throwable {

		FinanceActions.ClickOnFuelSurchargesInvoiceSummary();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
	}

	
	@Then("^User can see folowing fields are populated in Fuel Surcharges$")
	public void user_can_see_folowing_fields_are_populated_in_Fuel_Surcharges(DataTable arg1) throws Throwable {
	   
	}
}
