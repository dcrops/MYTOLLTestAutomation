package bugVerificationStepsDefinitions;

import org.openqa.selenium.By;
import java.util.Map;


import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;



public class MYT_8628_Shipment_Document_to_see_PODs 
{
	
	@Given("^User is Registered in MyToll and is on the homepage$")
	public void user_is_Registered_in_MyToll_and_is_on_the_homepage() throws Throwable {
		
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
	}
	
	@Given("^User is Registered SitAutomationUser2 in MyToll and is on the homepage$")
	public void user_is_Registered_SitAutomationUser2_in_MyToll_and_is_on_the_homepage() throws Throwable {
		
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername2, BaseWebdriver.Password);
	}
	

	@When("^user searcher following shipment number in the search shipment$")
	public void user_searcher_following_shipment_number_in_the_search_shipment(DataTable ShipmentNoTestData) throws Throwable {
		
		for (Map < String, String>ShipmentNumberData: ShipmentNoTestData.asMaps(String.class, String.class)) {
		PageBase.sendText(MyTollHomePageActions.trackAndTrace, 2, ShipmentNumberData.get("ShipmentNumberRefererence"));
		PageBase.click(MyTollHomePageActions.trackAndTraceSearch, 2);
		PageBase.MaximumWaitForElementEnabled_1();
		}
	}

	@Then("^user is able to see the following shipment$")
	public void user_is_able_to_see_the_following_shipment(DataTable ShipmentNoTestData) throws Throwable {
		for (Map < String, String>ShipmentNumberData: ShipmentNoTestData.asMaps(String.class, String.class)) {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(MyTollHomePageActions.ShipmentSearchResulttext,"1 shipment matches 2857290153 in our systems");
		PageBase.MaximumWaitForElementEnabled_1();
		}
			
	}

	@When("^user clicks on the shipment$")
	public void user_clicks_on_the_shipment(DataTable ShipmentNoTestData) throws Throwable {
		for (Map < String, String>ShipmentNumberData: ShipmentNoTestData.asMaps(String.class, String.class)) {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.ShipmentSearchResult, 2);
		PageBase.MaximumWaitForElementEnabled();
		}
		
	}

	@Then("^the shipment opens up with Shipment Documents tab$")
	public void the_shipment_opens_up_with_Shipment_Documents_tab() throws Throwable {

		//verify text	
		PageBase.verifyTextExist(MyTollHomePageActions.ShipmentDocumentTab, "SHIPMENT DOCUMENTS");
		
	}

	@When("^user clicks on Shipment Documents$")
	public void user_clicks_on_Shipment_Documents() throws Throwable {

		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.ShipmentDocumentTab, 2);
			
		PageBase.MaximumWaitForElementEnabled_1();
		
	}

	@Then("^Proof of Delivery tab is displayed$")
	public void proof_of_Delivery_tab_is_displayed() throws Throwable {

		PageBase.verifyTextExist(MyTollHomePageActions.ProofOfDeliveryTab, "PROOF OF DELIVERY");		
	}

	@When("^user clicks on the POD document$")
	public void user_clicks_on_the_POD_document() throws Throwable {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(MyTollHomePageActions.ProofOfDeliveryDoc, 2);
		PageBase.MaximumWaitForElementEnabled();
		
	}

	@Then("^POD documentation window is displayed$")
	public void pod_documentation_window_is_displayed() throws Throwable {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(MyTollHomePageActions.ProofOfDeliveryDownloadheader, "PROOF OF DELIVERY DOCUMENTATION");

	}

	@When("^User clicks on DOWNLOAD PDF$")
	public void user_clicks_on_DOWNLOAD_PDF() throws Throwable {
		PageBase.click(MyTollHomePageActions.ProofOfDeliveryDownload, 2);
				
	}

	@Then("^the file downlaods$")
	public void the_file_downlaods() throws Throwable {

		PageBase.click(MyTollHomePageActions.ProofOfDeliveryWindow_close, 2);

	}


}
