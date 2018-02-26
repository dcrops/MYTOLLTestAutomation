package advanceSearchStepDefinitions;

import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
	
	@Then("^User Clicks Search and results are displayed$")
	public void UserCliksSearchAndVerifiesResults() throws Throwable {

		PageBase.click(MyTollHomePageActions.advanceSearchSubmit, 10);
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.MediumWaitForElementEnabled_1();
		
		//Verify details later when system functionality works
		
		
	}
	
	//====================================================================================================================================================================
	//Receiver Field 
	
	@When("^User inputs search criteria in the Receiver feild$")
	public void UserInputsSearchCriteriaforReceiver(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchReceiver, 10, advSearch.get("Receiver"));
		}
	}
	
	@And("^User Adds Multiple Tags in Receiver feild$")
	public void UserAddsNewTagsInReceiverfeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Adds Tag - "+(String) pair.getValue());
				System.out.println("User Adds Tag - "+(String) pair.getValue());
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchReceiver, 10, (String) pair.getValue());
		    }
		}
	}
	
	@And("^Receiver Tag is Visible in search feild$")
	public void ReceiverTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
				System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
		        PageBase.isElementPresent(By.xpath("//*[@id=\"receiver-name-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
		    }
		}
	}
	
	
	@Then("^User Deletes Tags in Receiver feild and Verify if the Tags are Deleted$")
	public void UserDeletesTagsInReceiverFeildAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        PageBase.click(By.xpath("//*[@id=\"receiver-name-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
		        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
				System.out.println("User Deletes Tag - "+(String) pair.getValue());
		        //PageBase.isElementNotPresent(By.xpath("//*[@id=\"receiver-name-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
		    }
		}
	}
	
	@And("^User Exlcudes search Tags in Receiver feild$")
	public void UserExlcudesSearchTagsinReceiverFeild() throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		WebElement element = BaseWebdriver.driver.findElement(MyTollHomePageActions.advanceSearchReceiverExclude);
		jse.executeScript("arguments[0].click();", element);
		//PageBase.click(MyTollHomePageActions.advanceSearchReceiverExclude, 10);
	}
	
	//====================================================================================================================================================================
	//Sender Field 
	
	@When("^User inputs search criteria in the Sender feild$")
	public void UserInputsSearchCriteriaforSender(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSender, 10, advSearch.get("Sender"));
		}
	}
	
	@And("^User Adds Multiple Tags in Sender feild$")
	public void UserAddsNewTagsInSenderfeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Adds Tag - "+(String) pair.getValue());
				System.out.println("User Adds Tag - "+(String) pair.getValue());
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSender, 10, (String) pair.getValue());
		    }
		}
	}
	
	@And("^Sender Tag is Visible in search feild$")
	public void SenderTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
				System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
		        PageBase.isElementPresent(By.xpath("//*[@id=\"sender-name-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
		    }
		}
	}
	
	
	@Then("^User Deletes Tags in Sender feild and Verify if the Tags are Deleted$")
	public void UserDeletesTagsInSenderFeildAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        PageBase.click(By.xpath("//*[@id=\"sender-name-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
		        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
				System.out.println("User Deletes Tag - "+(String) pair.getValue());
		        //PageBase.isElementNotPresent(By.xpath("//*[@id=\"sender-name-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
		    }
		}
	}
	
	@And("^User Exlcudes search Tags in Sender feild$")
	public void UserExlcudesSearchTagsinSenderFeild() throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		WebElement element = BaseWebdriver.driver.findElement(MyTollHomePageActions.advanceSearchSenderExclude);
		jse.executeScript("arguments[0].click();", element);
		//PageBase.click(MyTollHomePageActions.advanceSearchSenderExclude, 10);
	}	
	
	
	//====================================================================================================================================================================
	//Sender Location Field
	@When("^User inputs search criteria in the Sender Location feilds$")
	public void UserInputsSearchCriteriaforSenderLocationFeilds(DataTable advanceSearchTestData) throws Throwable {
		PageBase.click(MyTollHomePageActions.advanceSearchSenderLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSenderSuburb, 10, advSearch.get("Suburb"));
			PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSenderState, 10, advSearch.get("State"));
			PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSenderPostcode, 10, advSearch.get("Postcode"));
			PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSenderCountry, 10, advSearch.get("Country"));
		}
	}

	@And("^User Adds Multiple Tags in Sender Surburb Location feilds$")
	public void UserAddsNewTagsInSenderSurburbLocationFeilds(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchSenderLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Adds Tag - "+(String) pair.getValue());
				System.out.println("User Adds Tag - "+(String) pair.getValue());
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSenderSuburb, 10, (String) pair.getValue());
		    }
		}
	}
	
	@Then("^Sender Surburb Location Tag is Visible in search feild$")
	public void SenderSurburbLocationTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
				System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
		        PageBase.isElementPresent(By.xpath("//*[@id=\"suburb-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
		    }
		}
	}
	
	@And("^User Deletes Tags in Sender Surburb Location and Verify if the Tags are Deleted$")
	public void UserDeletesTagsInSenderSurburbLocationAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchSenderLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        PageBase.click(By.xpath("//*[@id=\"suburb-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
		        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
				System.out.println("User Deletes Tag - "+(String) pair.getValue());
		        //PageBase.isElementNotPresent(By.xpath("//*[@id=\"suburb-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
		    }
		}
	}
	
	@And("^User Adds Multiple Tags in Sender State Location feilds$")
	public void UserAddsNewTagsInSenderStateLocationFeilds(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchSenderLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Adds Tag - "+(String) pair.getValue());
				System.out.println("User Adds Tag - "+(String) pair.getValue());
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSenderState, 10, (String) pair.getValue());
		    }
		}
	}
	
	@Then("^Sender State Location Tag is Visible in search feild$")
	public void SenderStateLocationTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
				System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
		        PageBase.isElementPresent(By.xpath("//*[@id=\"state-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
		    }
		}
	}
	
	@And("^User Deletes Tags in Sender State Location and Verify if the Tags are Deleted$")
	public void UserDeletesTagsInSenderStateLocationAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchSenderLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        PageBase.click(By.xpath("//*[@id=\"state-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
		        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
				System.out.println("User Deletes Tag - "+(String) pair.getValue());
		        //PageBase.isElementNotPresent(By.xpath("//*[@id=\"state-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
		    }
		}
	}
	
	
	@And("^User Adds Multiple Tags in Sender Postcode Location feilds$")
	public void UserAddsNewTagsInSenderPostcodeLocationFeilds(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchSenderLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Adds Tag - "+(String) pair.getValue());
				System.out.println("User Adds Tag - "+(String) pair.getValue());
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSenderPostcode, 10, (String) pair.getValue());
		    }
		}
	}
	
	@Then("^Sender Postcode Location Tag is Visible in search feild$")
	public void SenderPostcodeLocationTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
				System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
		        PageBase.isElementPresent(By.xpath("//*[@id=\"postCode-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
		    }
		}
	}
	
	@And("^User Deletes Tags in Sender Postcode Location and Verify if the Tags are Deleted$")
	public void UserDeletesTagsInSenderPostcodeLocationAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchSenderLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        PageBase.click(By.xpath("//*[@id=\"postCode-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
		        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
				System.out.println("User Deletes Tag - "+(String) pair.getValue());
		       // PageBase.isElementNotPresent(By.xpath("//*[@id=\"postCode-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
		    }
		}
	}
	
	@And("^User Adds Multiple Tags in Sender Country Location feilds$")
	public void UserAddsNewTagsInSenderCountryLocationFeilds(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchSenderLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Adds Tag - "+(String) pair.getValue());
				System.out.println("User Adds Tag - "+(String) pair.getValue());
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchSenderCountry, 10, (String) pair.getValue());
		    }
		}
	}
	
	@Then("^Sender Country Location Tag is Visible in search feild$")
	public void SenderCountryLocationTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
				System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
		        PageBase.isElementPresent(By.xpath("//*[@id=\"country-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
		    }
		}
	}
	
	@And("^User Deletes Tags in Sender Country Location and Verify if the Tags are Deleted$")
	public void UserDeletesTagsInSenderCountryLocationAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchSenderLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        PageBase.click(By.xpath("//*[@id=\"country-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
		        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
				System.out.println("User Deletes Tag - "+(String) pair.getValue());
		        //PageBase.isElementNotPresent(By.xpath("//*[@id=\"country-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
		    }
		}
	}
	
	@And("^User Exlcudes search Tags in Sender Location Feild$")
	public void UserExlcudesSearchTagsinSenderLocationFeild() throws Throwable {
		
		PageBase.MinimumWaitForElementEnabled_1();
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		WebElement element = BaseWebdriver.driver.findElement(MyTollHomePageActions.advanceSearchSenderLocExclude);
		jse.executeScript("arguments[0].click();", element);
		//PageBase.click(MyTollHomePageActions.advanceSearchSenderLocExclude, 10);
	}
	
	
	//====================================================================================================================================================================
	//Receiver Location Field
	@When("^User inputs search criteria in the Receiver Location feilds$")
	public void UserInputsSearchCriteriaforReceiverLocationFeilds(DataTable advanceSearchTestData) throws Throwable {
		PageBase.click(MyTollHomePageActions.advanceSearchReceiverLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchReceiverSuburb, 10, advSearch.get("Suburb"));
			PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchReceiverState, 10, advSearch.get("State"));
			PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchReceiverPostcode, 10, advSearch.get("Postcode"));
			PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchReceiverCountry, 10, advSearch.get("Country"));
		}
	}

	@And("^User Adds Multiple Tags in Receiver Surburb Location feilds$")
	public void UserAddsNewTagsInReceiverSurburbLocationFeilds(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchReceiverLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Adds Tag - "+(String) pair.getValue());
				System.out.println("User Adds Tag - "+(String) pair.getValue());
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchReceiverSuburb, 10, (String) pair.getValue());
		    }
		}
	}
	
	@Then("^Receiver Surburb Location Tag is Visible in search feild$")
	public void ReceiverSurburbLocationTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
				System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
		        PageBase.isElementPresent(By.xpath("//*[@id=\"suburb-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
		    }
		}
	}
	
	@And("^User Deletes Tags in Receiver Surburb Location and Verify if the Tags are Deleted$")
	public void UserDeletesTagsInReceiverSurburbLocationAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchReceiverLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        PageBase.click(By.xpath("//*[@id=\"suburb-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
		        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
				System.out.println("User Deletes Tag - "+(String) pair.getValue());
		        //PageBase.isElementNotPresent(By.xpath("//*[@id=\"suburb-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
		    }
		}
	}
	
	@And("^User Adds Multiple Tags in Receiver State Location feilds$")
	public void UserAddsNewTagsInReceiverStateLocationFeilds(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchReceiverLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Adds Tag - "+(String) pair.getValue());
				System.out.println("User Adds Tag - "+(String) pair.getValue());
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchReceiverState, 10, (String) pair.getValue());
		    }
		}
	}
	
	@Then("^Receiver State Location Tag is Visible in search feild$")
	public void ReceiverStateLocationTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
				System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
		        PageBase.isElementPresent(By.xpath("//*[@id=\"state-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
		    }
		}
	}
	
	@And("^User Deletes Tags in Receiver State Location and Verify if the Tags are Deleted$")
	public void UserDeletesTagsInReceiverStateLocationAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchReceiverLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        PageBase.click(By.xpath("//*[@id=\"state-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
		        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
				System.out.println("User Deletes Tag - "+(String) pair.getValue());
		        //PageBase.isElementNotPresent(By.xpath("//*[@id=\"state-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
		    }
		}
	}
	
	
	@And("^User Adds Multiple Tags in Receiver Postcode Location feilds$")
	public void UserAddsNewTagsInReceiverPostcodeLocationFeilds(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchReceiverLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Adds Tag - "+(String) pair.getValue());
				System.out.println("User Adds Tag - "+(String) pair.getValue());
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchReceiverPostcode, 10, (String) pair.getValue());
		    }
		}
	}
	
	@Then("^Receiver Postcode Location Tag is Visible in search feild$")
	public void ReceiverPostcodeLocationTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
				System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
		        PageBase.isElementPresent(By.xpath("//*[@id=\"postCode-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
		    }
		}
	}
	
	@And("^User Deletes Tags in Receiver Postcode Location and Verify if the Tags are Deleted$")
	public void UserDeletesTagsInReceiverPostcodeLocationAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchReceiverLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        PageBase.click(By.xpath("//*[@id=\"postCode-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
		        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
				System.out.println("User Deletes Tag - "+(String) pair.getValue());
		       // PageBase.isElementNotPresent(By.xpath("//*[@id=\"postCode-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
		    }
		}
	}
	
	@And("^User Adds Multiple Tags in Receiver Country Location feilds$")
	public void UserAddsNewTagsInReceiverCountryLocationFeilds(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchReceiverLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Adds Tag - "+(String) pair.getValue());
				System.out.println("User Adds Tag - "+(String) pair.getValue());
		        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchReceiverCountry, 10, (String) pair.getValue());
		    }
		}
	}
	
	@Then("^Receiver Country Location Tag is Visible in search feild$")
	public void ReceiverCountryLocationTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
				System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
		        PageBase.isElementPresent(By.xpath("//*[@id=\"country-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
		    }
		}
	}
	
	@And("^User Deletes Tags in Receiver Country Location and Verify if the Tags are Deleted$")
	public void UserDeletesTagsInReceiverCountryLocationAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {
		PageBase.MinimumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.advanceSearchReceiverLoc, 10);
		PageBase.MinimumWaitForElementEnabled_1();
		for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
			Iterator tags = advSearch.entrySet().iterator();
		    while (tags.hasNext()) {
		        Map.Entry pair = (Map.Entry)tags.next();
		        PageBase.click(By.xpath("//*[@id=\"country-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
		        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
				System.out.println("User Deletes Tag - "+(String) pair.getValue());
		        //PageBase.isElementNotPresent(By.xpath("//*[@id=\"country-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
		    }
		}
	}
	
	@And("^User Exlcudes search Tags in Receiver Location Feild$")
	public void UserExlcudesSearchTagsinReceiverLocationFeild() throws Throwable {
		
		PageBase.MinimumWaitForElementEnabled_1();
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		WebElement element = BaseWebdriver.driver.findElement(MyTollHomePageActions.advanceSearchReceiverLocExclude);
		jse.executeScript("arguments[0].click();", element);
		//PageBase.click(MyTollHomePageActions.advanceSearchReceiverLocExclude, 10);
	}
	
	
	
	//====================================================================================================================================================================
		//ReferenceNo Field 
		
		@When("^User inputs search criteria in the Reference Number feild$")
		public void UserInputsSearchCriteriaforReferenceNumber(DataTable advanceSearchTestData) throws Throwable {

			for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
				PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchRefNo, 10, advSearch.get("RefNo"));
			}
		}
		
		@And("^User Adds Multiple Tags in Reference Number feild$")
		public void UserAddsNewTagsInReferenceNumberfeild(DataTable advanceSearchTestData) throws Throwable {

			for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
				Iterator tags = advSearch.entrySet().iterator();
			    while (tags.hasNext()) {
			        Map.Entry pair = (Map.Entry)tags.next();
			        Reporter.log("User Adds Tag - "+(String) pair.getValue());
					System.out.println("User Adds Tag - "+(String) pair.getValue());
			        PageBase.sendTextandSubmit(MyTollHomePageActions.advanceSearchRefNo, 10, (String) pair.getValue());
			    }
			}
		}
		
		@And("^Reference Number Tag is Visible in search feild$")
		public void ReferenceNumberTagIsVisibleInSearchFeild(DataTable advanceSearchTestData) throws Throwable {

			for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
				Iterator tags = advSearch.entrySet().iterator();
			    while (tags.hasNext()) {
			        Map.Entry pair = (Map.Entry)tags.next();
			        Reporter.log("User Verifies if Tag Exits - "+(String) pair.getValue());
					System.out.println("User Verifies if Tag Exits "+(String) pair.getValue());
			        PageBase.isElementPresent(By.xpath("//*[@id=\"reference-number-list\"]/li/span[text()='"+(String) pair.getValue()+"']"), 2, (String) pair.getValue());
			    }
			}
		}
		
		
		@Then("^User Deletes Tags in Reference Number feild and Verify if the Tags are Deleted$")
		public void UserDeletesTagsInReferenceNumberFeildAndVerifyIfTheTagsAreDeleted(DataTable advanceSearchTestData) throws Throwable {

			for (Map<String, String> advSearch : advanceSearchTestData.asMaps(String.class, String.class)) {
				Iterator tags = advSearch.entrySet().iterator();
			    while (tags.hasNext()) {
			        Map.Entry pair = (Map.Entry)tags.next();
			        PageBase.click(By.xpath("//*[@id=\"reference-number-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1);
			        Reporter.log("User Deletes Tag - "+(String) pair.getValue());
					System.out.println("User Deletes Tag - "+(String) pair.getValue());
			        //PageBase.isElementNotPresent(By.xpath("//*[@id=\"reference-number-list\"]/li/span[text()='"+(String) pair.getValue()+"']//preceding-sibling::span"), 1,(String) pair.getValue() );
			    }
			}
		}
	

}
