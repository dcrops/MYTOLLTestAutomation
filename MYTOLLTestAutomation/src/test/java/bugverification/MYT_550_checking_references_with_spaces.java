package bugverification;

import java.util.Map;

import global.PageBase;
import basewebdriver.BaseWebdriver;
import bookapickup.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mytollhomepage.MyTollHomePageActions;

public class MYT_550_checking_references_with_spaces
{
	@Given("^User is Registered in MyToll and is on Dashboard$")
	public void user_is_Registered_in_MyToll_and_is_on_Dashboard() throws Throwable {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
	 	PageBase.MaximumWaitForElementEnabled();
	}

	@When("^user searches for following reference number$")
	public void user_searches_for_following_reference_number(DataTable searchReferenceData) throws Throwable {
		for (Map<String, String> searchReference : searchReferenceData.asMaps(String.class, String.class)) {
			
			BaseWebdriver.driver.findElement(BookAPickupActions.searchNumberReference)
			.sendKeys(searchReference.get("Enter shipment number or references"));
		PageBase.click(BookAPickupActions.searchShipmentButton, 2);
		PageBase.MaximumWaitForElementEnabled();
			}
	}

	@Then("^user is able to see the following shipment number$")
	public void user_is_able_to_see_the_following_shipment_number(DataTable searchReferenceData) throws Throwable {
			
		
		for (Map<String, String> searchReference : searchReferenceData.asMaps(String.class, String.class)) {
			
			PageBase.verifyTextExist(BookAPickupActions.searchResultMsg, "1 shipment matches "+searchReference.get("Enter shipment number or references")+" in our systems");
			PageBase.verifyTextExist(BookAPickupActions.searchNumberReferenceName,
			searchReference.get("Enter shipment number or references"));
			PageBase.MaximumWaitForElementEnabled();
			
			}
	}
}



