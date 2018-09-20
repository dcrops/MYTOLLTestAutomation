package bugverification;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import global.PageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mytollhomepage.MyTollHomePageActions;

public class MYT_9027_return_search_message_Grammer_check
{
	@When("^User Enters Shipment Number and Searches Not Existing on My Returns$")
	public void UserEntersShipmentNumberandSearchesNotExistingOnMyReturns(DataTable myReturnTestData) throws Throwable {
	
		for (Map<String, String> rateEnquiry : myReturnTestData.asMaps(String.class,String.class))
		{
		PageBase.SendKeysTo(MyTollHomePageActions.MyReturnRefNo, rateEnquiry.get("Enter RAN or Shipment Number"), 5);
		}
		
	PageBase.click(MyTollHomePageActions.MyReturnSearch, 5);
	}
	
	@Then("^User Can See The no returns Message$")
	public void user_Can_See_The_no_returns_Message(DataTable rateEquiryTestData) throws Throwable {
		for (Map<String, String> rateEnquiry : rateEquiryTestData.asMaps(String.class,String.class))
		   {   
			PageBase.verifyTextExist(MyTollHomePageActions.MyReturnNoResultSearch, rateEnquiry.get("Disclaimer"));
		   }
	}
	
}