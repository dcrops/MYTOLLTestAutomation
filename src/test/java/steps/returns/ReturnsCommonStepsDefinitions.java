package steps.returns;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import global.PageBase;
import basewebdriver.BaseWebdriver;
import bookapickup.BookAPickupActions;
import createshipment.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manifest.ManifestActions;
import mytollhomepage.MyTollHomePageActions;
import rateenquiry.RateEnquiryActions;

public class ReturnsCommonStepsDefinitions {
	
	public static String Sender;
	public static String SenderLocation;
	public static String Receiver;
	public static String ReceiverLocation;
	public static String DispatchDate;
	public static String returnDateonScreen; 
	public static String MyReturnPageDispatchDate;
	public static String RetrunShipmentNumber;
	
	
	@Given("^User is Registered in MyToll and is on Create Return Page$")
	public void user_is_Registered_in_MyToll_and_is_on_Create_ReturnPage() throws Throwable {
		
		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		PageBase.click(MyTollHomePageActions.createReturn, 5);
		PageBase.MaximumWaitForElementEnabled_1();
		
	}
	
	@Given("^User is Registered in MyToll and is on My Returns Page$")
	public void user_is_Registered_in_MyToll_and_is_on_My_ReturnsPage() throws Throwable {
	    
		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		PageBase.click(MyTollHomePageActions.myReturn, 5);
		PageBase.MaximumWaitForElementEnabled_1();
		
	}

	@When("^user click Add My contact details box$")
	public void user_click_Add_My_contact_details_box() throws Throwable {

		PageBase.click(MyTollHomePageActions.myContactDetailsTextbox,50);

	}

	@When("^Enters the following contact details and clicks save$")
	public void enters_the_following_contact_details_and_clicks_save(DataTable createReturnTestData) throws Throwable {
		for (Map<String, String> createReturn : createReturnTestData.asMaps(String.class, String.class)) {
			PageBase.sendText(MyTollHomePageActions.myContactDetailsTextboxName,50, createReturn.get("Name"));
			PageBase.sendText(MyTollHomePageActions.myContactDetailsTextboxPhoneNumber,50, createReturn.get("Phone Number"));
			PageBase.sendText(MyTollHomePageActions.myContactDetailsTextboxEmail,50, createReturn.get("Phone Number"));
			PageBase.click(MyTollHomePageActions.myContactDetailsTextboxSaveButton,50);
			}
	}
	
	@Given("^User is Registered in MyToll and is on My Accounts Page$")
	public void user_is_Registered_in_MyToll_and_is_on_My_AccountsPage() throws Throwable {
	    
		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		PageBase.click(MyTollHomePageActions.myAccountMenu, 50);
		PageBase.MaximumWaitForElementEnabled_1();
		
	}


	@And("^User enters shipment overview details to Create a Return$")
	public void User_enters_shipment_overview_details_asbelow_to_get_a_Rate_within_a_Shipment_Prio(DataTable createReturnTestData)
			throws Throwable {

		for (java.util.Map<String, String> createReturn : createReturnTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterAccountNumber(createReturn.get("AccountNumber"));
			String s = createReturn.get("Whopays");
			System.out.println("S  " + s);
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			RateEnquiryActions.ShipmentSenderSelect(createReturn.get("Sender"));
			RateEnquiryActions.ShipmentReceiverSelect(createReturn.get("Receiver"));
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.sendText(MyTollHomePageActions.ReturnRAN, 5, createReturn.get("RAN"));
			PageBase.MaximumWaitForElementEnabled_1();
			
			Sender = CreateShipmentActions.GetSenderCompanyName().toString().replace("\n", "");
			SenderLocation= CreateShipmentActions.GetSenderLocation().toString();
			Receiver= CreateShipmentActions.GetRecieverCompanyName().toString().replace("\n", "");
			ReceiverLocation= CreateShipmentActions.GetReceiverLocation().toString();
			PageBase.click(MyTollHomePageActions.ReturnSameAsReceiver, 5);
		}
	}
	
	
	@When("^User Verfies Toll Carrier and select Service$")
	public void user_verifies_Toll_Carrier_and_select_Service(DataTable createReturnTestData) throws Throwable {

		for (Map<String, String> createReturn : createReturnTestData.asMaps(String.class, String.class)) {
			PageBase.verifyTextExistAttributeContains(RateEnquiryActions.shipmentCarrierName, createReturn.get("TollCarrier"));
			CreateShipmentActions.EnterService(createReturn.get("Service"));

		}
	}
	
	
	@And("^User enters following input data for the line item for Return$")
	public void user_enters_following_input_data_for_the_line_item_Prio(DataTable createReturnTestData) throws Throwable {

		for (java.util.Map<String, String> createReturn : createReturnTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			BookAPickupActions.EnterItem(createReturn.get("Item description"));
			CreateShipmentActions.NumberOfItem(createReturn.get("No of Items"));
			BookAPickupActions.EnterLengthWidthHeight(createReturn.get("Length"), createReturn.get("Width"),
					createReturn.get("Height"));
			CreateShipmentActions.EnterWeight(createReturn.get("Weight"));
			PageBase.sendText(CreateShipmentActions.senderReference, 5, createReturn.get("Reference"));

		}
	}
	
	@And("^User enters Return Reference and Special Instructions as below$")
	public void user_enters_Special_Instructions_as_below(DataTable createReturnTestData) throws Throwable {
	   
		for (Map<String, String> createReturn : createReturnTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.sendText(MyTollHomePageActions.ReturnReference, 5, createReturn.get("Reference"));
			PageBase.sendText(BookAPickupActions.specialInstructions, 5, createReturn.get("Special Instructions"));
			returnDateonScreen = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"pickup-date\"]")).getAttribute("data-val");
			DispatchDate = returnDateonScreen.replaceAll("(\\d+)-(\\d+)-(\\d+)", "$3-$2-$1");
			ManifestActions.returnSelectReadyTimeJS(createReturn.get("Ready Time"));
			ManifestActions.selectClosingTimeJS(createReturn.get("Closing Time"));
			
			//Data Formating for My Return Page
			String OLD_FORMAT = "dd-MM-yyyy";
			String NEW_FORMAT = "dd-MMM-yyyy";
			String oldDateString = returnDateonScreen;
			SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
			Date d = sdf.parse(oldDateString);
			sdf.applyPattern(NEW_FORMAT);
			MyReturnPageDispatchDate = sdf.format(d);
		}
	}
	
	@Then("^User Clicks Review and Create Return$")
	public void UserClicksReviewandCreateReturn() throws Throwable {
		PageBase.click(MyTollHomePageActions.ReturnReviewAndCreate, 5);
	}

	
	@Then("^User Verfies Return Shipment Details on Review Screen$")
	public void UserVerfiesReturnShipmentDetailsonReviewScreen(DataTable createReturnTestData) throws Throwable {
		for (Map<String, String> createReturn : createReturnTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageTollCarrier, createReturn.get("TollCarrier"));
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageService, createReturn.get("Service"));
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageAccountNumber, createReturn.get("AccountNumber"));
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageWhoPays, createReturn.get("Whopays"));
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageRAN, createReturn.get("RAN"));
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageDate, DispatchDate);
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageReadyTime, createReturn.get("Ready Time"));
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageClosingTime, createReturn.get("Closing Time"));
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageReturnRef, createReturn.get("Reference"));
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageSpecialIns, createReturn.get("Special Instructions"));
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageSender, Sender);
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageSenderLoc, SenderLocation);
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageReceiver, Receiver);
			PageBase.verifyTextSubString(MyTollHomePageActions.ReturnReviewPageReceiverLoc, ReceiverLocation);
		
		}
	}
	
	@Then("^User Clicks Confrim Return$")
	public void UserClicksConfrimReturn() throws Throwable {
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.ReturnReviewConfirm, 5);
	}
	
	@Then("^User Clicks Add New Line for Returns$")
	public void UserClicksAddNewLine() throws Throwable {
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.ReturnAddNewLine, 5);
	}
	
	@Then("^User Deletes Line Item for Returns$")
	public void UserDeletesLineItem(DataTable createReturnTestData) throws Throwable {
		for (Map<String, String> createReturn : createReturnTestData.asMaps(String.class, String.class)) {
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"line-item-"+createReturn.get("Line Index")+"\"]//*//a/i"), 5);
		PageBase.click(MyTollHomePageActions.ReturnDeleteLineConfirm, 5);
		PageBase.MediumWaitForElementEnabled_1();
		}
	}
	

	@Then("^User Retreives Return Reference Number and Verifies Confirmation Page$")
	public void UserRetreivesReturnReferenceNumberandVerifiesConfirmationPage() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(MyTollHomePageActions.ReturnPrint, 10);
		PageBase.verifyTextExist(MyTollHomePageActions.ReturnSuccessMsg, "Return submitted");
		PageBase.isElementPresent(MyTollHomePageActions.ReturnPrint, 5, "Print Button on Return Confirmation Page");
		PageBase.isElementPresent(MyTollHomePageActions.ReturnGoToMyDashboard, 5, "Go To My Dashboard buttonon Return Confirmation Page");
		PageBase.isElementPresent(MyTollHomePageActions.ReturnCreateReturn, 5, "CREATE A NEW RETURN Button on Return Confirmation Page");
		PageBase.isElementPresent(MyTollHomePageActions.ReturnGoToMyReturns, 5, "GO TO MY RETURNS Button on Return Confirmation Page");
		
		String TollShipmentNumber = BaseWebdriver.driver.findElement(MyTollHomePageActions.ReturnShipmentNumber).getText();
		System.out.println(TollShipmentNumber);
		String RANNumber = BaseWebdriver.driver.findElement(MyTollHomePageActions.ReturnSucessfullRAN).getText();
		System.out.println(RANNumber);
		RetrunShipmentNumber = TollShipmentNumber.substring(23);
		System.out.println(RetrunShipmentNumber);
	}
	
	
	
	@Then("^User Navigates to My Return Page$")
	public void UserNavigatestoMyReturnPage() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.ReturnGoToMyReturns, 10);
	}
	
	
	@When("^User Enters Shipment Number and Searches on My Returns$")
	public void UserEntersShipmentNumberandSearchesOnMyReturns(DataTable myReturnTestData) throws Throwable {
	
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.sendText(MyTollHomePageActions.MyReturnRefNo, 5, RetrunShipmentNumber);
		PageBase.click(MyTollHomePageActions.MyReturnSearch, 10);
	}
	
	@Then("^Search Results are Displayed with the Below Columns$")
	public void SearchResultsAreDisplayedWiththeBelowColumns(DataTable myReturnTestData) throws Throwable {

		for (Map<String, String> myReturn : myReturnTestData.asMaps(String.class, String.class)) {
			PageBase.isElementPresent(MyTollHomePageActions.MyReturnTollShipmentNo , 5, myReturn.get("Toll shipment no."));
			PageBase.isElementPresent(MyTollHomePageActions.MyReturnRAN, 5, myReturn.get("RAN"));
			PageBase.isElementPresent(MyTollHomePageActions.MyReturnStatusColumn, 5, myReturn.get("Status"));
			PageBase.isElementPresent(MyTollHomePageActions.MyReturnTollCarrier, 5, myReturn.get("Toll carrier"));
			PageBase.isElementPresent(MyTollHomePageActions.MyReturnSenderDetails, 5, myReturn.get("Sender details"));
			PageBase.isElementPresent(MyTollHomePageActions.MyReturnReceiverDetails, 5, myReturn.get("Receiver details"));
			PageBase.isElementPresent(MyTollHomePageActions.MyReturnEarliestDispatchDate, 5, myReturn.get("Earliest dispatch date"));
			PageBase.isElementPresent(MyTollHomePageActions.MyReturnReadyTime, 5, myReturn.get("Ready time"));
		}
	}
	
	@And("^User Verifies if Return Search Results are Displayed as Per Search Criteria$")
	public void UserVerifiesIfReturnSearchResultsAreDisplayed(DataTable myReturnTestData) throws Throwable {
		for (Map<String, String> myReturn : myReturnTestData.asMaps(String.class, String.class)) {
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.verifyTextExist(By.xpath("//*[@id=\"myreturnsDataTbody\"]/tr/td[1]"), RetrunShipmentNumber);
		PageBase.verifyTextExist(By.xpath("//*[@id=\"myreturnsDataTbody\"]/tr/td[2]"), myReturn.get("RAN"));
		PageBase.verifyTextExist(By.xpath("//*[@id=\"myreturnsDataTbody\"]/tr/td[3]"), myReturn.get("Status"));
		PageBase.verifyTextExist(By.xpath("//*[@id=\"myreturnsDataTbody\"]/tr/td[4]"), myReturn.get("Toll carrier"));
		PageBase.verifyTextSubString(By.xpath("//*[@id=\"myreturnsDataTbody\"]/tr/td[5]"), Sender);
		PageBase.verifyTextSubString(By.xpath("//*[@id=\"myreturnsDataTbody\"]/tr/td[6]"), Receiver);
		PageBase.verifyDateReformated(By.xpath("//*[@id=\"myreturnsDataTbody\"]/tr/td[7]"), MyReturnPageDispatchDate);
		PageBase.verifyTextExist(By.xpath("//*[@id=\"myreturnsDataTbody\"]/tr/td[8]"), myReturn.get("Ready time"));
		PageBase.verifyTextExist(By.xpath("//*[@id=\"data-desc\"]"), "Showing 1 - 1 of 1");
		}
		
		
	}
	
	@Then("^User Filters Search Results By Status$")
	public void UserFiltersSearchResultsByStatus(DataTable myReturnTestData) throws Throwable {
		for (Map<String, String> myReturn : myReturnTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.click(MyTollHomePageActions.MyReturnStatus, 10);
			PageBase.click(By.xpath("//*[@id=\"status-selector\"]//*//div[text()='"+myReturn.get("Status")+"']"), 5);
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.click(MyTollHomePageActions.MyReturnSearch, 10);
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.verifyTextExist(By.xpath("//*[@id=\"data-desc\"]"), "Showing 1 - 1 of 1");
			PageBase.verifyTextExist(By.xpath("//*[@id=\"myreturnsDataTbody\"]/tr/td[1]"), RetrunShipmentNumber);
		}
	}
	
	
	@Then("^User Filters Search Results By Date Range$")
	public void UserFiltersSearchResultsByDateRange(DataTable myReturnTestData) throws Throwable {
			//Set Date One year Back
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		    Date myDate = dateFormat.parse(returnDateonScreen);
		    Calendar calendar = Calendar.getInstance();
		    calendar.setTime(myDate);
		    calendar.add(Calendar.YEAR, -1);
		    Date previousDate = calendar.getTime();
		    String DateOneYearBack = dateFormat.format(previousDate);
		    
			
		  //Date From
			PageBase.MediumWaitForElementEnabled_1();
			((JavascriptExecutor)BaseWebdriver.driver).executeScript("document.getElementById('manifestFromDate').removeAttribute('readonly',0);");
	        ((JavascriptExecutor)BaseWebdriver.driver).executeScript("document.getElementById('manifestFromDate').setAttribute('placeholder','"+DateOneYearBack+"');");
			WebElement fromDateBox= BaseWebdriver.driver.findElement(MyTollHomePageActions.MyReturnDateFrom);
			fromDateBox.clear();
			fromDateBox.sendKeys(DateOneYearBack);
			
			//Date To
			PageBase.MediumWaitForElementEnabled_1();
			((JavascriptExecutor)BaseWebdriver.driver).executeScript("document.getElementById('manifestToDate').removeAttribute('readonly',0);");
	        ((JavascriptExecutor)BaseWebdriver.driver).executeScript("document.getElementById('manifestToDate').setAttribute('placeholder','"+returnDateonScreen+"');"); 
			WebElement fromDateBox2= BaseWebdriver.driver.findElement(MyTollHomePageActions.MyReturnDateTo);
			fromDateBox2.clear();
			fromDateBox2.sendKeys(returnDateonScreen);
			
			//User Clicks and Verifies if Search Results exist
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.click(MyTollHomePageActions.MyReturnSearch, 10);
			PageBase.MediumWaitForElementEnabled_1();
			PageBase.verifyTextExist(By.xpath("//*[@id=\"data-desc\"]"), "Showing 1 - 1 of 1");
			PageBase.verifyTextExist(By.xpath("//*[@id=\"myreturnsDataTbody\"]/tr/td[1]"), RetrunShipmentNumber);
		
	}
	
	
	@Then("^User Downloads the Return Results$")
	public void UserDownloadstheReturnResults() throws Throwable {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.DownloadSavedSearch, 5);
		PageBase.MaximumWaitForElementEnabled_1();;
	}
	
	@Then("^User Verifies Line Item for Returns$")
	public void UserVerifiesLineItem(DataTable myReturnTestData) throws Throwable {
		for (Map<String, String> myReturn : myReturnTestData.asMaps(String.class, String.class)) {
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(By.xpath("//*[@id=\"shipment-placeholder\"]//*//h2[text()='Line Item "+myReturn.get("Line Number")+"']"), 5);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(By.xpath("//*[@id=\"shipment-placeholder\"]//*//li[div//preceding-sibling::h2[text()='Line Item "+myReturn.get("Line Number")
								+"']]//*//div[@class='item-inner-col item-desc']/p"), myReturn.get("Item description"));
		PageBase.verifyTextExist(By.xpath("//*[@id=\"shipment-placeholder\"]//*//li[div//preceding-sibling::h2[text()='Line Item "+myReturn.get("Line Number")
								+"']]//*//div[@class='item-inner-col total-items']/p"), myReturn.get("No of Items"));
		PageBase.verifyTextExist(By.xpath("//*[@id=\"shipment-placeholder\"]//*//li[div//preceding-sibling::h2[text()='Line Item "+myReturn.get("Line Number")
								+"']]//*//div[@class='item-inner-col dimensions']/p"), myReturn.get("Length")+"cm x "+myReturn.get("Width")+"cm x "+myReturn.get("Height")+"cm");
		PageBase.verifyTextExist(By.xpath("//*[@id=\"shipment-placeholder\"]//*//li[div//preceding-sibling::h2[text()='Line Item "+myReturn.get("Line Number")
								+"']]//*//div[@class='item-inner-col weight']/p"), myReturn.get("Weight")+"kg");
		PageBase.verifyTextExist(By.xpath("//*[@id=\"shipment-placeholder\"]//*//li[div//preceding-sibling::h2[text()='Line Item "+myReturn.get("Line Number")
								+"']]//*//div[@class='item-inner-col reference1']/p"), myReturn.get("Reference"));
		PageBase.MaximumWaitForElementEnabled_1();
		}
	}
	
	
}


