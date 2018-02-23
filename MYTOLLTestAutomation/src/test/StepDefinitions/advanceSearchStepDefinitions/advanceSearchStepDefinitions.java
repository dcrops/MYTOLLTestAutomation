package advanceSearchStepDefinitions;

import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class advanceSearchStepDefinitions {
	
	@When("^User inputs search criteria in the Sender feild$")
	public void UserInputsSearchCriteriaforSender(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			//PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSender, 10, advSearch.get("Sender"));
		}
	}
	
	@Then("^User Clicks Search and results are displayed$")
	public void UserCliksSearchAndVerifiesResults() throws Throwable {

		//PageBase.click(MyTollHomePageActions.advanceSearchSubmit, 10);
		//Verify details later when system functionality works
		
		//*[@id="sender-name-list"]/li/span//preceding-sibling::span['Test']
	}
	
	@And("^User Adds new Tags in Sender feild$")
	public void UserAddsNewTagsInSenderfeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		       // PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSender, 10, (String) pair.getValue());
		    }
		    
		    
		    //Test
	/*	    Iterator deletetags = advSearch.entrySet().iterator();
		    while (deletetags.hasNext()) {
		        Map.Entry pair = (Map.Entry)deletetags.next();
		        PageBase.click(By.xpath("//*[@id=\"sender-name-list\"]/li/span//preceding-sibling::span['"+(String) pair.getValue()+"']"), 10);
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSender, 10, (String) pair.getValue());
		    }*/
		}
	}
	

}
