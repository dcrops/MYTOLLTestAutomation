package FinanceActions;

import org.openqa.selenium.By;

import GlobalActions.PageBase;

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
	public static By totalChargeAmount = By.xpath(
			"//*[@id=\"aging-tab-wrapper\"]/ul[@class='nav nav-tabs aging']/li/a[@class='days outstandingText']");
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
	public static By DateRangeRadioBtn = By.xpath("//*[@id=\"finance-step1\"]/div[2]/div[2]/div/label[2]/input");
	public static By InvoiceRadioBtn = By.xpath("//*[@id=\"finance-step1\"]/div[2]/div[2]/div/label[1]/input");
	public static By InvoiceLabel = By.xpath("//*[@id=\"finance-step1\"]/div[2]/div[2]/div/label[1]");
	public static By DateRangeLabel = By.xpath("//*[@id=\"finance-step1\"]/div[2]/div[2]/div/label[2]/span");
	public static By DateRangeFromTextfield = By.id("tdf_from_date");
	public static By DateRangeToTextfield = By.id("tdf_to_date");
	public static By CalenderBackBtn = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span");
	public static By DateFrom = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a");
	public static By DateTo = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a");
	public static By InvoiceNumberTextfield = By.id("search_inv_nbr");
	public static By InvoiceNumberTextfieldIntermodalSpec = By.id("search_str");
	public static By InvoiceNumberTOLLEnergyTextfield = By.id("search_str");
	public static By InvoiceNumberIPECTextfield = By.id("search_inv_nbr_ipec");
	public static By SearchBtn = By.id("search_button");
	public static By DownloadResultsBtn = By.id("download_results");
	public static By ViewAccountSummary = By.xpath("//*[@id=\"finance-step1\"]/div[3]/div[1]/div/span");

	// Prio Invoice Grid results
	public static By invoiceDate = By.xpath("//*[@id=\"myInvoice_searchResult\"]/div/div/div/table/tbody/tr/td[1]");
	public static By invoiceNumber = By.xpath("//*[@id=\"myInvoice_searchResult\"]/div/div/div/table/tbody/tr/td[2]");
	public static By chargeAmount = By.xpath("//*[@id=\"myInvoice_searchResult\"]/div/div/div/table/tbody/tr/td[3]");
	public static By shipmentDocuments = By
			.xpath("//*[@id=\"myInvoice_searchResult\"]/div/div/div/table/tbody/tr/td[4]/span/span");
	public static By downloadBtn = By.id("downloadModal");
	public static By downloadedFileName = By.xpath("//*[@id=\"fileIdIPEC_NA4271_0594.zip\"]/td[1]");
	public static By downloadedFileStatus = By.xpath("//*[@id=\"fileIdIPEC_NA4271_0594.zip\"]/td[2]");
	public static By downloadedFileSize = By.xpath("//*[@id=\"fileIdIPEC_NA4271_0594.zip\"]/td[3]");
	public static By downloadedFilesDeleteBtn = By.xpath("//*[@id=\"fileIdIPEC_NA4271_0594.zip\"]/td[3]");
	public static By downloadedSuccessfulMessage = By.xpath("//*[@id=\"alert-box-wrapper\"]/div/div/div[2]");
	public static By ClosedownloadedSuccessfulMessage = By.xpath("//*[@id=\"closeAlert\"]");

	// Intermodal specialised search results Invoice Grid
	public static By invoiceDateInter = By
			.xpath("//*[@id=\"myInvoice_searchResult\"]/div/div/div/table/tbody/tr/td[1]");
	public static By invoiceNumberInter = By
			.xpath("//*[@id=\"myInvoice_searchResult\"]/div/div/div/table/tbody/tr/td[2]");
	public static By dueDateInter = By.xpath("//*[@id=\"myInvoice_searchResult\"]/div/div/div/table/tbody/tr/td[3]");
	public static By chargeAmountInter = By
			.xpath("//*[@id=\"myInvoice_searchResult\"]/div/div/div/table/tbody/tr/td[4]");
	public static By paidInter = By.xpath("//*[@id=\"myInvoice_searchResult\"]/div/div/div/table/tbody/tr/td[5]");
	public static By outstandingInter = By
			.xpath("//*[@id=\"myInvoice_searchResult\"]/div/div/div/table/tbody/tr/td[6]");

	// Intermodal specialised Invoice summary screen
	public static By tollCarrier = By.xpath("//*[@id=\"tollCarrier\"]/span");
	public static By date = By.xpath("//*[@id=\"InvoiceSummary\"]/tbody/tr/td[1]");
	public static By chargeAmountInvoiceSummary = By.xpath("//*[@id=\"InvoiceSummary\"]/tbody/tr/td[2]");
	public static By paid = By.xpath("//*[@id=\"InvoiceSummary\"]/tbody/tr/td[3]");
	public static By dueDate = By.xpath("//*[@id=\"InvoiceSummary\"]/tbody/tr/td[4]");
	public static By outstanding = By.xpath("//*[@id=\"InvoiceSummary\"]/tbody/tr/td[5]");
	public static By accountNumber = By.xpath("//*[@id=\"accountNumber\"]/span");
	public static By invoiceNumberInvoiceSummary = By.xpath("//*[@id=\"invoiceNumber\"]");
	public static By outstandingInvoiceSummary = By.xpath("//*[@id=\"outstanding\"]/td[3]/i");
	public static By outstandingArrowdownInvoiceSummary = By.xpath("//*[@id=\"outstanding\"]/td[3]/i");
	public static By outstandingHeaderInvoiceSummary = By.xpath("//*[@id=\"outstanding\"]/td[1]");
	public static By numberOfResultsInvoiceSummary = By.xpath("//*[@id=\"outstanding\"]/td[2]/span[1]");
	public static By shipmentNumberInShipmentInvoiceSummary = By.xpath("//*[@id=\"2868873529\"]/td[1]");
	public static By typeInShipmentInvoiceSummary = By.xpath("//*[@id=\"2868873529\"]/td[2]");
	public static By chargeAmountInShipmentInvoiceSummary = By.xpath("//*[@id=\"2868873529\"]/td[3]");
	public static By outstandingInShipmentInvoiceSummary = By.xpath("//*[@id=\"2868873529\"]/td[4]");

	// Toll Energy and Marine Invoice summary screen

	public static By shipmentNumberInShipmentInvoiceSummaryTE = By.xpath("//*[@id=\"6911079821\"]/td[1]");
	public static By typeInShipmentInvoiceSummaryTE = By.xpath("//*[@id=\"6911079821\"]/td[2]");
	public static By chargeAmountInShipmentInvoiceSummaryTE = By.xpath("//*[@id=\"6911079821\"]/td[3]");
	public static By outstandingInShipmentInvoiceSummaryTE = By.xpath("//*[@id=\"6911079821\"]/td[4]");

	// CHARGES
	public static By ChargesHeadingInvoiceSummary = By.xpath("//*[@id=\"outstandingShipmentDetails2868873529\"]/td/table/tbody/tr[9]/td[1]/table/tbody/tr[4]/td");  
	public static By basicChargesInvoiceSummary = By.xpath("//*[contains(@id,'CON')]/td[1]");  //*[@id="CON1"]/td[1]
	public static By basicChargesDescriptionInvoiceSummary = By.xpath("//*[contains(@id,'CON')]/td[3]");
	public static By basicChargesChargesInvoiceSummary = By.xpath("//*[contains(@id,'CON')]/td[5]");
	public static By freightChargesInvoiceSummary = By.xpath("//*[contains(@id,'FRT') or contains(@id,'UNIT')]/td[1]");
	public static By freightRateChargesInvoiceSummary = By.xpath("//*[contains(@id,'FRT') or contains(@id,'UNIT')]/td[3]");
	public static By freightChargesChargesInvoiceSummary = By.xpath("//*[contains(@id,'FRT') or contains(@id,'UNIT')]/td[5]");
	public static By fuelSurchargesInvoiceSummary = By.xpath("//*[contains(@id,'FSC')]/td[1]");
	public static By fuelSurchargesDescriptionInvoiceSummary = By.xpath("//*[contains(@id,'FSC')]/td[3]");
	public static By fuelSurchargesChargesInvoiceSummary = By.xpath("//*[contains(@id,'FSC')]/td[5]");
	public static By gstInvoiceSummary = By.xpath("//*[contains(@id,'GST')]/td[1]");
	public static By gstsDescriptionInvoiceSummary = By.xpath("//*[contains(@id,'GST')]/td[3]");
	public static By gstChargesInvoiceSummary = By.xpath("//*[contains(@id,'GST')]/td[5]");
	public static By gstValueInvoiceSummary = By.id("GSTvalue");
	public static By totalChargesInvoiceSummary = By.id("totalCharges");

	// Basic charges
	public static By rateTypeBasicCharges = By
			.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[2]/td[1]");
	public static By serviceBasicCharges = By
			.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[2]/td[2]");
	public static By modeBasicCharges = By.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[2]/td[3]");
	public static By originBasicCharges = By
			.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[2]/td[4]");
	public static By destinationeBasicCharges = By
			.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[2]/td[5]");
	public static By commodityBasicCharges = By
			.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[2]/td[6]");
	public static By fullLoadBasicCharges = By
			.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[2]/td[7]");
	public static By minBasicCharges = By.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[2]/td[8]");
	public static By maxBasicCharges = By.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[2]/td[9]");
	public static By uomBasicCharges = By.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[4]/td[1]");
	public static By qtyBasicCharges = By.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[4]/td[2]");
	public static By rateUOMBasicCharges = By
			.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[4]/td[3]");
	public static By totalBasicCharges = By.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[4]/td[4]");
	public static By breakToltalChargesBasicCharges = By
			.xpath("//*[contains(@id,'chargeDetailsCON')]/td/table/tbody/tr[4]/td[5]");

	// Freight Charges
	public static By rateTypeFreightCharges = By
			.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[2]/td[1]");
	public static By serviceFreightCharges = By
			.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[2]/td[2]");
	public static By modeFreightCharges = By
			.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[2]/td[3]");
	public static By originFreightCharges = By
			.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[2]/td[4]");
	public static By destinationeFreightCharges = By
			.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[2]/td[5]");
	public static By commodityFreightCharges = By
			.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[2]/td[6]");
	public static By fullLoadFreightCharges = By
			.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[2]/td[7]");
	public static By minFreightCharges = By.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[2]/td[8]");
	public static By maxFreightCharges = By.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[2]/td[9]");
	public static By uomFreightCharges = By.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[4]/td[1]");
	public static By qtyFreightCharges = By.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[4]/td[2]");
	public static By rateUOMFreightCharges = By
			.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[4]/td[3]");
	public static By totalFreightCharges = By
			.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[4]/td[4]");
	public static By breakToltalChargesFreightCharges = By
			.xpath("//*[contains(@id,'chargeDetailsFRT')  or contains(@id,'chargeDetailsUNIT')]/td/table/tbody/tr[4]/td[5]");

	// Payment Adjustment
	public static By paymentAdjustments = By.xpath("//*[@class=\"outstanding-shipment-list accordion-toggle\"]/td[1]");
	public static By paymentAdjustmentsArrowdown = By.xpath("//*[@id=\"paymentAdjustments\"]/td[6]/i");
	public static By paymentAdjustmentsRef1 = By
			.xpath("//*[contains(@id,'paymentAdjustmentsDetails')]/td/table/tbody/tr[2]/td[2]");
	public static By paymentAdjustmentsDate = By
			.xpath("//*[contains(@id,'paymentAdjustmentsDetails')]/td/table/tbody/tr[2]/td[1]");
	public static By paymentAdjustmentsAmount1 = By
			.xpath("//*[contains(@id,'paymentAdjustmentsDetails')]/td/table/tbody/tr[2]/td[4]");
	public static By paymentAdjustmentsAmount2 = By
			.xpath("//*[contains(@id,'paymentAdjustmentsDetails')]/td/table/tbody/tr[3]/td[4]");

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
						"//*[@id=\"account-number-selector\"]/div[2]/ul/li[4]/div[contains(text(),'" + pAccountNumber + " " + "')]"),
				10);

	}
	//*[@id="account-number-selector"]/div[2]/ul/li[4]/div
	public static void EnterAccountNumberWithName(String pAccountNumber) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(accountNumberTextField, pAccountNumber, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(
				By.xpath("//*[@id=\"account-number-selector\"]/div[2]/ul/li/div[contains(text(),'" + pAccountNumber + "')]"), 10);

	}

	public static void EnterSearchType(String pSearchType) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(searchTypeTextField, pSearchType, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"search-type-selector\"]/div[2]/ul/li/div[text()='" + pSearchType + "']"),
				10);
	}

	public static String GetToatlChargeAmount() {
		return PageBase.GetText(totalChargeAmount, 5).replaceAll("\\s", "");

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

	public static void ClickInvoiceRadioBtn() {

		PageBase.ClickOn(InvoiceRadioBtn, 5);

	}

	public static void ClickDateRangeRadioBtn() {

		PageBase.ClickOn(DateRangeRadioBtn, 5);

	}

	public static void ClickSearchBtn() {

		PageBase.ClickOn(SearchBtn, 5);

	}

	public static void ClickDownloadResultsBtn() {

		PageBase.ClickOn(DownloadResultsBtn, 5);

	}

	public static void ClickAnInvoice() {

		PageBase.ClickOn(invoiceNumberInter, 5);

	}

	public static String GetInvoiceLabel() {
		return PageBase.GetText(InvoiceLabel, 5);

	}

	public static String GetDateRangeLabel() {
		return PageBase.GetText(DateRangeLabel, 5);

	}

	public static void EnterInvoiceNumber(String pInvoiceNumber) {
		PageBase.MaximumWaitForElementEnabled();
		ClickInvoiceRadioBtn();
		PageBase.SendKeysTo(InvoiceNumberTextfield, pInvoiceNumber, 10);
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void EnterInvoiceNumberIntermodalSpec(String pInvoiceNumber) {
		PageBase.MaximumWaitForElementEnabled();
		ClickInvoiceRadioBtn();
		PageBase.SendKeysTo(InvoiceNumberTextfieldIntermodalSpec, pInvoiceNumber, 10);
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void EnterInvoiceNumberIPEC(String pInvoiceNumber) {
		PageBase.MaximumWaitForElementEnabled();
		ClickInvoiceRadioBtn();
		PageBase.SendKeysTo(InvoiceNumberIPECTextfield, pInvoiceNumber, 10);
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void EnterInvoiceNumberIE(String pInvoiceNumber) {
		PageBase.MaximumWaitForElementEnabled();
		ClickInvoiceRadioBtn();
		PageBase.SendKeysTo(InvoiceNumberTOLLEnergyTextfield, pInvoiceNumber, 10);
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void SearchInvoiceDateRange() {
		PageBase.MaximumWaitForElementEnabled();
		ClickDateRangeRadioBtn();
		PageBase.ClickOn(DateRangeFromTextfield, 5);
		PageBase.ClickOn(CalenderBackBtn, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(DateFrom, 5);
		PageBase.ClickOn(DateRangeToTextfield, 5);
		// PageBase.ClickOn(CalenderBackBtn, 5);
		PageBase.ClickOn(DateTo, 5);
		PageBase.MaximumWaitForElementEnabled();

	}

	public static String GetInvoiceDatePrio() {
		return PageBase.GetText(invoiceDate, 5);

	}

	public static String GetInvoiceNumberPrio() {
		return PageBase.GetText(invoiceNumber, 5);

	}

	public static String GetChargeAmountPrio() {
		return PageBase.GetText(chargeAmount, 5);

	}

	public static String GetShipmentDocumentsPrio() {
		return PageBase.GetText(shipmentDocuments, 5);

	}

	public static String GetDownloadBtn() {
		return PageBase.GetText(downloadBtn, 5);

	}

	public static String GetFileNameIPEC() {
		return PageBase.GetText(downloadedFileName, 5);

	}

	public static String GetStatusIPEC() {
		return PageBase.GetText(downloadedFileStatus, 5);

	}

	public static String GetFileSizeIPEC() {
		return PageBase.GetText(downloadedFileSize, 5);

	}

	public static String GetInvoiceDateInter() {
		return PageBase.GetText(invoiceDateInter, 5);

	}

	public static String GetInvoiceNumberInter() {
		return PageBase.GetText(invoiceNumberInter, 5);

	}

	public static String GetDueDateInter() {
		return PageBase.GetText(dueDateInter, 5);

	}

	public static String GetChargeAmountInter() {
		return PageBase.GetText(chargeAmountInter, 5);

	}

	public static String GetPaidInter() {
		return PageBase.GetText(paidInter, 5);

	}

	public static String GetOutstandingInter() {
		return PageBase.GetText(outstandingInter, 5);

	}

	public static String GetDownloadSuccessfulMsg() {
		return PageBase.GetText(downloadedSuccessfulMessage, 5);

	}

	public static void CloseDownloadSuccessfulMsg() {
		PageBase.ClickOn(ClosedownloadedSuccessfulMessage, 5);

	}

	public static void ClickViewAccountSummary() {
		PageBase.ClickOn(ViewAccountSummary, 5);

	}

	// Invoice summary

	public static String GetInvoiceNumberInvoiceSummary() {
		return PageBase.GetText(invoiceNumberInvoiceSummary, 5);

	}

	public static String GetTollCarrierInvoiceSummary() {
		return PageBase.GetText(tollCarrier, 5);

	}

	public static String GetDateInvoiceSummary() {
		return PageBase.GetText(date, 5);

	}

	public static String GetChargeAmountInvoiceSummary() {
		return PageBase.GetText(chargeAmountInvoiceSummary, 5);

	}

	public static String GetPaidInvoiceSummary() {
		return PageBase.GetText(paid, 5);

	}

	public static String GetDueDateInvoiceSummary() {
		return PageBase.GetText(dueDate, 5);

	}

	public static String GetOutstandingInvoiceSummary() {
		return PageBase.GetText(outstanding, 5);

	}

	public static String GetAccountNumberInvoiceSummary() {
		return PageBase.GetText(accountNumber, 5);

	}

	public static String GetOutstandingHeaderInvoiceSummary() {
		return PageBase.GetText(outstandingHeaderInvoiceSummary, 5);

	}

	public static String GetNumberOfResultsInvoiceSummary() {
		return PageBase.GetText(numberOfResultsInvoiceSummary, 5);

	}

	public static void ClickOutstandingArrowdownInvoiceSummary() {
		PageBase.ClickOn(outstandingArrowdownInvoiceSummary, 5);

	}

	// OUTSTANDING Intermodal

	public static String GetShipmentNoInvoiceSummary() {
		return PageBase.GetText(shipmentNumberInShipmentInvoiceSummary, 5);

	}

	public static String GetTypeInShipmentInvoiceSummary() {
		return PageBase.GetText(typeInShipmentInvoiceSummary, 5);

	}

	public static String GetChargeAmountInShipmentInvoiceSummary() {
		return PageBase.GetText(chargeAmountInShipmentInvoiceSummary, 5);

	}

	public static String GetOutstandingInShipmentInvoiceSummary() {
		return PageBase.GetText(outstandingInShipmentInvoiceSummary, 5);

	}

	public static void ClickOnConsignementInvoiceSummary(String pConsignment) {
		PageBase.click(By.xpath("//*[@id=" + pConsignment + "]/td[1]"), 5);

	}
	
	// OUTSTANDING 

	public static String GetShipmentNoInvoiceSummary(String pConsignment) {
		return PageBase.GetText(By.xpath("//*[@id=" + pConsignment + "]/td[1]"), 5);

	}

	public static String GetTypeInShipmentInvoiceSummary(String pConsignment) {
		return PageBase.GetText(By.xpath("//*[@id=" + pConsignment + "]/td[2]"), 5);

	}

	public static String GetChargeAmountInShipmentInvoiceSummary(String pConsignment) {
		return PageBase.GetText(By.xpath("//*[@id=" + pConsignment + "]/td[3]"), 5);

	}

	public static String GetOutstandingInShipmentInvoiceSummary(String pConsignment) {
		return PageBase.GetText(By.xpath("//*[@id=" + pConsignment + "]/td[4]"), 5);

	}

	
	// CHARGES

	public static String GetChargesHeadingInvoiceSummary(String pConsignment) {
		return PageBase.GetText(By.xpath("//*[@id=\"outstandingShipmentDetails"+pConsignment+"\"]/td/table/tbody/tr[9]/td[1]/table/tbody/tr[4]/td"), 5);

	}//*[@id="outstandingShipmentDetails6911079821"]/td/table/tbody/tr[9]/td[1]/table/tbody/tr[4]/td
	
	public static String GetTypeBasicChargesInvoiceSummary() {
		return PageBase.GetText(basicChargesInvoiceSummary, 5);

	}

	public static String GetDescriptionBasicChargesInvoiceSummary() {
		return PageBase.GetText(basicChargesDescriptionInvoiceSummary, 5);

	}

	public static String GetChargesBasicChargesInvoiceSummary() {
		return PageBase.GetText(basicChargesChargesInvoiceSummary, 5);

	}

	public static String GetTypeFreightChargesInvoiceSummary() {
		return PageBase.GetText(freightChargesInvoiceSummary, 5);

	}

	public static String GetDescriptionFreightChargesInvoiceSummary() {
		return PageBase.GetText(freightRateChargesInvoiceSummary, 5);

	}

	public static String GetChargesFreightChargesInvoiceSummary() {
		return PageBase.GetText(freightChargesChargesInvoiceSummary, 5);

	}

	public static String GetTypeFuelSurchargesInvoiceSummary() {
		return PageBase.GetText(fuelSurchargesInvoiceSummary, 5);

	}

	public static String GetDescriptionFuelSurchargesInvoiceSummary() {
		return PageBase.GetText(fuelSurchargesDescriptionInvoiceSummary, 5);

	}

	public static String GetChargesFuelSurchargesInvoiceSummary() {
		return PageBase.GetText(fuelSurchargesChargesInvoiceSummary, 5);

	}

	public static String GetTypeGSTInvoiceSummary() {
		return PageBase.GetText(gstInvoiceSummary, 5);

	}

	public static String GetDescriptionGSTInvoiceSummary() {
		return PageBase.GetText(gstsDescriptionInvoiceSummary, 5);

	}

	public static String GetChargesGSTInvoiceSummary() {
		return PageBase.GetText(gstChargesInvoiceSummary, 5);

	}

	public static String GetGSTValueInvoiceSummary() {
		return PageBase.GetText(gstValueInvoiceSummary, 5);

	}

	public static String GetTotalChargesInvoiceSummary() {
		return PageBase.GetText(totalChargesInvoiceSummary, 5);

	}

	// Basic charges

	public static void ClickOnBasicChargesInvoiceSummary() {
		PageBase.ClickOn(basicChargesInvoiceSummary, 5);

	}

	public static String GetRateTypeBasicCharges() {
		return PageBase.GetText(rateTypeBasicCharges, 5);

	}

	public static String GetServiceBasicCharges() {
		return PageBase.GetText(serviceBasicCharges, 5);

	}

	public static String GetModeBasicCharges() {
		return PageBase.GetText(modeBasicCharges, 5);

	}

	public static String GetOriginBasicCharges() {
		return PageBase.GetText(originBasicCharges, 5);

	}

	public static String GetDestinationeBasicCharges() {
		return PageBase.GetText(destinationeBasicCharges, 5);

	}

	public static String GetCommodityBasicCharges() {
		return PageBase.GetText(commodityBasicCharges, 5);

	}

	public static String GetFullLoadBasicCharges() {
		return PageBase.GetText(fullLoadBasicCharges, 5);

	}

	public static String GetMinBasicCharges() {
		return PageBase.GetText(minBasicCharges, 5);

	}

	public static String GetMaxBasicCharges() {
		return PageBase.GetText(maxBasicCharges, 5);

	}

	public static String GetUOMBasicCharges() {
		return PageBase.GetText(uomBasicCharges, 5);

	}

	public static String GetQtyBasicCharges() {
		return PageBase.GetText(qtyBasicCharges, 5);

	}

	public static String GetRateUOMBasicCharges() {
		return PageBase.GetText(rateUOMBasicCharges, 5);

	}

	public static String GetTotalBasicCharges() {
		return PageBase.GetText(totalBasicCharges, 5);

	}

	public static String GetBreakToltalChargesBasicCharges() {
		return PageBase.GetText(breakToltalChargesBasicCharges, 5);

	}

	// Freight charges

	public static void ClickOnFreightChargesInvoiceSummary() {
		PageBase.ClickOn(freightChargesInvoiceSummary, 5);

	}

	public static String GetRateTypeFreightCharges() {
		return PageBase.GetText(rateTypeFreightCharges, 5);

	}

	public static String GetServiceFreightCharges() {
		return PageBase.GetText(serviceFreightCharges, 5);

	}

	public static String GetModeFreightCharges() {
		return PageBase.GetText(modeFreightCharges, 5);

	}

	public static String GetOriginFreightCharges() {
		return PageBase.GetText(originFreightCharges, 5);

	}

	public static String GetDestinationeFreightCharges() {
		return PageBase.GetText(destinationeFreightCharges, 5);

	}

	public static String GetCommodityFreightCharges() {
		return PageBase.GetText(commodityFreightCharges, 5);

	}

	public static String GetFullLoadFreightCharges() {
		return PageBase.GetText(fullLoadFreightCharges, 5);

	}

	public static String GetMinFreightCharges() {
		return PageBase.GetText(minFreightCharges, 5);

	}

	public static String GetMaxFreightCharges() {
		return PageBase.GetText(maxFreightCharges, 5);

	}

	public static String GetUOMFreightCharges() {
		return PageBase.GetText(uomFreightCharges, 5);

	}

	public static String GetQtyFreightCharges() {
		return PageBase.GetText(qtyFreightCharges, 5);

	}

	public static String GetRateUOMFreightCharges() {
		return PageBase.GetText(rateUOMFreightCharges, 5);

	}

	public static String GetTotalFreightCharges() {
		return PageBase.GetText(totalFreightCharges, 5);

	}

	public static String GetBreakToltalChargesFreightCharges() {
		return PageBase.GetText(breakToltalChargesFreightCharges, 5);

	}

	// Fuel Surcharges

	public static void ClickOnFuelSurchargesInvoiceSummary() {
		PageBase.ClickOn(fuelSurchargesInvoiceSummary, 5);

	}

	// Payment Adjustment

	public static String GetPaymentAdjustments() {
		return PageBase.GetText(paymentAdjustments, 15);

	}

	public static void ClickOnPaymentAdjustments() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(paymentAdjustments, 20);

	}

	public static String GetPaymentAdjustmentsRef1() {

		return PageBase.GetText(paymentAdjustmentsRef1, 5);

	}

	public static String GetPaymentAdjustmentsDate() {
		return PageBase.GetText(paymentAdjustmentsDate, 5);

	}

	public static String GetPaymentAdjustmentsAmount1() {
		return PageBase.GetText(paymentAdjustmentsAmount1, 5);

	}

	public static String GetPaymentAdjustmentsAmount2() {
		return PageBase.GetText(paymentAdjustmentsAmount2, 5);

	}
}
