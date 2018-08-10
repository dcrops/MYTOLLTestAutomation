package stationeryActions;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.Page;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import junit.framework.AssertionFailedError;

public class StationeryActions {
	
	
	public static By allCategoriesDropdown = By.xpath("//*[@id=\"main-cont\"]/div[1]/span[1]/i");
	
	// Preprint Details on the product
	public static By increaseProductQty = By.xpath("//*[@id=\"main-cont\"]/div[2]/div[2]/div/div/div/button[2]/span");
	public static By decreaseProductQty = By.xpath("//*[@id=\"main-cont\"]/div[2]/div[2]/div/div/div/button[1]/span");
	public static By productQty = By.xpath("//*[@id=\"main-cont\"]/div[2]/div[2]/div/div/div/input");  
	public static By addPreprintDetails= By.xpath("//*[@id=\"addPrePrintLink_1\"]/span");  
	public static By preprintFromCheckbox1= By.xpath("//*[@id=\"preprint-from-modal-lbl-wrpr\"]/span");  
	public static By preprintToCheckbox1= By.xpath("//*[@id=\"preprint-to-modal-lbl-wrpr\"]/span"); 
	public static By preprintFromTextfield= By.xpath("//*[@id=\"preprint-modal-from-address-selector-1\"]/label/input[2]");  
	public static By preprintToTextfield= By.xpath("//*[@id=\"preprint-modal-to-address-selector-1\"]/label/input[2]");
	public static By preprintFromContactName= By.id("contact-name-preprint-modal-from-1");  
	public static By preprintToContactName= By.id("contact-name-preprint-modal-to-1"); 
	public static By addDetailsBtn= By.name("addDetailsBtn");  
	public static By productNameInTheList= By.xpath("//*[@id=\"main-cont\"]/div[2]/div[2]/div/div/h4"); 
	public static By addToCartProduct1= By.xpath("//*[@id=\"main-cont\"]/div[2]/div[2]/div/div/p[3]/button");
	public static By addToCartProduct2= By.xpath("//*[@id=\"main-cont\"]/div[2]/div[3]/div/div/p[3]/button"); 
	public static By addToCart= By.xpath("//*[@id=\"main-cont\"]/div[2]/div[4]/div/div/p[3]/button"); 
	public static By items= By.xpath("//*[@id=\"main-cont\"]/div[1]/span[2]"); //cart locator
	public static By productName1InTheCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div/div[1]"); 
	public static By productName2InTheCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div[2]/div[1]"); 
	public static By productName3InTheCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div[3]/div[1]");
	public static By product1QtyIntheCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div[1]/div[1]/span[1]");
	public static By preprintProduct1= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div[1]/div[1]/span[2]");  
	public static By totalItemsInTheCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[3]/span");  
	public static By preprintInTheCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div/div[2]/span[1]/i");  

	// Preprint Details inside the cart
	public static By increaseProductQtyInsideTheCart = By.xpath("//*[@id=\"product-detail-container\"]/div/div[2]/div/div[3]/button[2]/span");
	public static By decreaseProductQtyInsideTheCart = By.xpath("//*[@id=\"product-detail-container\"]/div/div[2]/div/div[3]/button[1]/span");
	public static By productQtyInsideTheCart = By.xpath("//*[@id=\"product-detail-container\"]/div/div[2]/div/div[3]/input");  
	public static By preprintFromCheckbox1InsideTheCart= By.xpath("//*[@id=\"preprint-from-modal-lbl-wrpr\"]/span");  
	public static By preprintToCheckbox1InsideTheCart= By.id("preprint-from-modal-checkbox-1"); 
	public static By preprintFromTextfieldInsideTheCart= By.xpath("//*[@id=\"preprint-modal-from-address-selector-1\"]/label/input[2]");  
	public static By preprintToTextfieldInsideTheCart= By.xpath("//*[@id=\"preprint-modal-to-address-selector-1\"]/label/input[2]");
	public static By preprintFromContactNameInsideTheCart= By.id("contact-name-preprint-modal-from-1");  
	public static By preprintToContactNameInsideTheCart= By.id("contact-name-preprint-modal-to-1"); 
	public static By addDetailsBtnInsideTheCart= By.id("addPreprintDetailsBtn");  
	public static By successMessageUpdatingPreprint= By.xpath("//*[@id=\"alert-box-wrapper\"]/div/div/div[2]"); 
	public static By backToList= By.id("alert-ok-btn"); 
	public static By removeProduct2= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div[2]/div[2]/span[2]/i"); 
	public static By proceedToCart= By.xpath("//*[@id=\"stationery-step1\"]/div//button[@class='btn-order-cart']"); //proceed to order 
	
	//Profile details page
	public static By profileDetailsPageHeading= By.xpath("//*[@id=\"add-addr-step2\"]/header/h2"); 
	public static By profileDetailsStatement= By.xpath("//*[@id=\"add-addr-step2\"]/header/p"); 
	public static By tollCarrier= By.xpath("//*[@id=\"profileDetailForm\"]/div/div[1]/div/input"); 
	public static By accountNumber= By.xpath("//*[@id=\"account-number-selector\"]/label/input[2]"); 
	public static By contact_name= By.id("contact_name");
	public static By contact_number= By.id("phone"); 
	public static By deliveryAddressTextfield= By.name("placeholder-location"); //Address under delivery details
	public static By deliveryContactNameTextfield= By.name("AddrContactName"); 
	public static By notifyCheckbox= By.id("notify-me-checkbox"); 
	public static By notifyEmail= By.id("AddrNotifyEmail"); 
	public static By customerReferenceNumber= By.id("custom-ref-num"); 
	public static By deliveryInstructionTextField= By.id("SpecialInstruction");
	public static By reviewOrdersBtn= By.id("reviewOrderBtn"); 
	public static By closeProfileDetailsPage = By.xpath("//*[@id=\"add-addr-step2\"]/a[@class='profileDetail-popup-close close-ico']");
	
	
	//Add Address Details
	public static By addAddressBtnUnderDeliveryDetails = By.xpath("//div[@id=\"location-selector\"]//div[@class='add-new-elem']");
	public static By companyNamePlaceHolder = By.id("profile-modal-add-addr-mnly-company");
	public static By namePlaceHolder = By.id("profile-modal-add-addr-mnly-name");
	public static By emailAddressPlaceHolder = By.id("profile-modal-add-addr-mnly-email");
	public static By phoneNumberPlaceHolder = By.id("profile-modal-add-addr-mnly-phone");
	public static By addressLine1PlaceHolder = By.id("profile-modal-add-addr-mnly-addr1");
	public static By addressLine2Placeholder = By.id("profile-modal-add-addr-mnly-addr2");
	public static By countryPlaceHolder = By.id("profile-modal-add-addr-mnly-country");
	public static By suburbPlaceHolder = By.id("profile-modal-add-addr-mnly-suburb");
	public static By statePlaceHolder = By.id("profile-modal-add-addr-mnly-state");
	public static By postCodePlaceHolder = By.id("profile-modal-add-addr-mnly-postcode");
	
	
	//Add New Address Page
	public static By AddNewAddressPage = By.id("add-addr-aut-step1");
	public static By AddNewAddressPage_CompanyNamePlaceHolder = By.id("profile-modal-company-sugg");
	public static By AddNewAddressPage_AddressPlaceHolder = By.id("profile-modal-sugg-input");
	public static By AddNewAddressPage_unableFindAddress = By.xpath("//*[@id=\"add-add-form\"]/div/p[@class='unable-find pull-right']");
	public static By AddNewAddressPage_addAddressManually = By.id("add-address-manually-link-profile-modal");
	public static By AddNewAddressPage_addAddressBtn = By.id("profile-modal-add-addr-mnly-btn");
	public static By AddNewAddressPage_StatePlaceHolder_VIC = By.xpath("//*[@id=\"profile-modal-add-addr-mnly-state-selector\"]/div//li[text()='VIC']");
	
	
	//Order Details Page
	public static By OrderStationaryPage = By.xpath("//*[@id=\"portlet_mytollstationaryportlet_WAR_mytollstationaryportlet\"]/div//h1[contains(text(),'ORDER STATIONERY')]");
	
	//My Orders page
	public static By MyOrdersPage = By.xpath("//*[@id=\"portlet_myorders_WAR_mytollstationaryportlet\"]/div//h1[contains(text(),'MY ORDERS')]");
	public static By MyOrders = By.xpath("//*[@id=\"myOrders_stationery\"]/div//table/tbody/tr");
	public static List<WebElement> MyOrdersList;
	
	//MyOrders Order Summary Page
	public static By OrderSummaryPage = By.xpath("//*[@id=\"portlet_myorders_WAR_mytollstationaryportlet\"]/div//h1[contains(text(),'ORDER SUMMARY')]");
	public static By OrderNumber = By.xpath("//*[@id=\"order-detail-step1\"]//p[contains(text(),'20413606')]");
	public static By AccountNumber = By.xpath("//*[@id=\"order-detail-step1\"]//p[contains(text(),'200BHY NATIONAL PRIORITY FOC')]");
	public static By PrintBtn = By.id("orderPrint");
	
			
		
	public static void SelectProductCategory(String product) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(allCategoriesDropdown, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"stationery-step1\"]/div[2]/ul/li[text()='" + product + "']"), 10);
		
	}
	
	public static void IncreaseProductQty() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(increaseProductQty, 5);
	
	}
	
	public static void DecreaseProductQty() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(decreaseProductQty, 5);
		
	}
	
	public static String GetProductQty() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(productQty, 5);
		
	}
	
	public static void ClickAddPreprintDetails() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(addPreprintDetails, 5);
		PageBase.MaximumWaitForElementEnabled();
	}
	
	public static void ClickPreprintFrom() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(preprintFromCheckbox1, 5);
		
		
	}
	
	public static void ClickPreprintTo() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(preprintToCheckbox1, 5);
		
	}
	
	public static void ClickAddDetails() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(addDetailsBtn, 5);
				
	}
	
	public static void EnterPreprintFromDetails(String pPreprintFrom, String pPreprintFromContactName) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintFromTextfield, pPreprintFrom, 5);
		PageBase.ClickOn(By.xpath("//*[@id=\"preprint-modal-from-address-selector-1\"]/div[2]/ul/li/div[text()='" + pPreprintFrom + "']"), 10); 
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintFromContactName, pPreprintFromContactName, 5);
	
	
	}
	
	public static void EnterPreprintToDetails(String pPreprintTo, String pPreprintToContactName) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintToTextfield, pPreprintTo, 5);
		PageBase.ClickOn(By.xpath("//*[@id=\"preprint-modal-to-address-selector-1\"]/div[2]/ul/li/div[text()='" + pPreprintTo + "']"), 10);  
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintToContactName, pPreprintToContactName, 10);
		
	
	}  
	
	public static void ClickAddToCart(String pProductName) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"main-cont\"]//*//div/h4[text()='"+pProductName+"']//following::P[3]/button"), 5);
	
	}

	public static void ClickAddToCartProduct2() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(addToCartProduct2, 5);
		
	}
	
	public static void ClickItems() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(items, 5);
		
	}
	
	public static String GetNoOfItems() {
		PageBase.LongWaitForElementEnabled();
		return PageBase.GetText(items, 10);
		
	}
	
	public static String GetproductName() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(productNameInTheList, 5);
		
	}
	
	public static String GetproductName1FromTheCart(String pProductName) {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(productName1InTheCart, 5);
		
	}
	
	public static String GetproductName2FromTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(productName2InTheCart,5);
		
	}
	
	public static String GetproductName3FromTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(productName3InTheCart,5);
		
	}
	
	public static String GetproductQtyFromTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(product1QtyIntheCart, 5);
		
	}
	
	public static String GetTotalItemsFromCart() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(totalItemsInTheCart, 5);
		
	}
	
	public static void ClickPreprintInTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(preprintInTheCart, 5);
		
	}

	
	public static void IncreaseProductQtyInsideTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(increaseProductQtyInsideTheCart, 5);
	
	}
	
	public static void DecreaseProductQtyInsideTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(decreaseProductQtyInsideTheCart, 5);
		
	}
	
	public static String GetProductQtyInsideTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(productQtyInsideTheCart, 5);
		
	}
	
	public static void EnterPreprintFromDetailsInsideTheCart(String pPreprintFrom, String pPreprintFromContactName) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintFromTextfieldInsideTheCart, pPreprintFrom, 5);
		PageBase.ClickOn(By.xpath("//*[@id=\"preprint-modal-from-address-selector-1\"]/div[2]/ul/li/div[text()='" + pPreprintFrom + "']"), 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintFromContactNameInsideTheCart, pPreprintFromContactName, 5);
	
	}
	
	public static void EnterPreprintToDetailsInsideTheCart(String pPreprintTo, String pPreprintToContactName) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintToTextfieldInsideTheCart, pPreprintTo, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"preprint-modal-to-address-selector-1\"]/div[2]/ul/li/div[text()='" + pPreprintTo + "']"), 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintToContactNameInsideTheCart, pPreprintToContactName, 5);
	
	}
	
	public static void ClickAddDetailsInsideTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(addDetailsBtnInsideTheCart, 5);
				
	}
	
	public static String GetSuccessMessageUpdatePreprint() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(successMessageUpdatingPreprint, 5); 
		
	}
	
	public static void ClickBackToListPreprintUpdate() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(backToList, 5);
		
	}
		
	public static void ClickRemoveProduct2() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(removeProduct2, 5);
		
	}
	
	public static void ClickProceedToCart() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(proceedToCart, 5);
		
	}  
	
	public static String GetProfileDetailsHeading() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(profileDetailsPageHeading, 5);
		
	} 
	
	public static String GetProfileDetailsStatement() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(profileDetailsStatement, 5);
		
	} 
	
	public static String GetTollCarrier() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(tollCarrier, 5);
		
	} 
	
	public static void EnterAccountNumber(String pAccountNumber) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(accountNumber, pAccountNumber, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"account-number-selector\"]/div/ul/li/div[text()= '"+pAccountNumber+"']"), 5);
		PageBase.MaximumWaitForElementEnabled();
		
	} 
	
	public static void EnterContactNumber(String pContactName, String pContactNumber) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(contact_name, pContactName, 5);
		PageBase.SendKeysTo(contact_number, pContactNumber, 5); 
		
	}
		
	public static void EnterDeliveryDetails(String pAddress, String pDeliveryContactName, String pNotifyEmail,String pCustomerReferenceNum, String pDeliveryInstructions) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(deliveryAddressTextfield, pAddress, 5);
		PageBase.ClickOn(By.xpath("//*[@id=\"location-selector\"]/div[2]/ul/li/div[text()='" + pAddress + "']"), 5);
		PageBase.SendKeysTo(deliveryContactNameTextfield, pDeliveryContactName, 10);
		PageBase.MaximumWaitForElementEnabled();
		//PageBase.ClickOn(notifyCheckbox, 5);
		PageBase.SendKeysTo(notifyEmail, pNotifyEmail, 5);
		PageBase.SendKeysTo(customerReferenceNumber, pCustomerReferenceNum, 5);
		PageBase.SendKeysTo(deliveryInstructionTextField, pDeliveryInstructions, 5);
		//PageBase.ClickOn(reviewOrdersBtn, 5);		
	}
	
	public static void ClickReviewOrder() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(reviewOrdersBtn, 5);
		
	}
	
	public static void AddAddressDetails(By _CompanyNameLocator, String _CompanyName, 
									By _NameLocator, String _Name,
									By _EmailLocator, String _Email,
									By _PhoneNumberLocator, String _PhoneNumber,
									By _AddressLine1Locator, String _AddressLine1,
									By _AddressLine2Locator, String _AddressLine2,
									By _SuburbLocator, String _Suburb,
									//By _StateLocator, String _State,
									By _PostcodeLocator, String _Postcode
									)
	{
		PageBase.FindElement(_CompanyNameLocator).sendKeys(_CompanyName);
		PageBase.FindElement(_NameLocator).sendKeys(_Name);
		PageBase.FindElement(_EmailLocator).sendKeys(_Email);
		PageBase.FindElement(_PhoneNumberLocator).sendKeys(_PhoneNumber);
		PageBase.FindElement(_AddressLine1Locator).sendKeys(_AddressLine1);
		PageBase.FindElement(_AddressLine2Locator).sendKeys(_AddressLine2);
		PageBase.FindElement(_SuburbLocator).sendKeys(_Suburb);
		//PageBase.FindElement(_StateLocator).sendKeys(_State);
		PageBase.FindElement(_PostcodeLocator).sendKeys(_Postcode);
		//click the dropdown here first
		PageBase.moveToElement(statePlaceHolder);
		PageBase.FindElement(statePlaceHolder).click();
		PageBase.FindElement(AddNewAddressPage_StatePlaceHolder_VIC).click();
		PageBase.FindElement(AddNewAddressPage_addAddressBtn).click();
		
	}
	
	
	
	/*public static Boolean VerifyAddressStored(String _TestCompanyName)
	{
		//Search generated list for test company details
		return VerifyAddressDetailsInTheList("",_TestCompanyName,"","","","");
	}*/
	
	
	
	public static void ClickAddressInDeliveryDetails()
	{
		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(deliveryAddressTextfield, 2);
	}

	public static void ClickAddAddressInDeliveryDetails()
	{
		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(addAddressBtnUnderDeliveryDetails, 2);
	}
	
	public static void ClickOnAddAddressManually()
	{
		PageBase.MaximumWaitForElementEnabled_1();
		//BaseWebdriver.driver.findElement(By.linkText("Add Manually")).click();
		
		PageBase.click(AddNewAddressPage_addAddressManually, 5);
	}
	
	public static Boolean VerifyAddNewPageDisplayed()
	{
		return PageBase.isElementPresent(AddNewAddressPage_CompanyNamePlaceHolder);
	}
	
	public static String GenerateRandomCompanyName(String _sampleCompanyName)
	{
		int Number = (int) (Math.random()*10000);
		String newNumber = String.valueOf(Number);
		String NewCompanyName = _sampleCompanyName+newNumber;
		return NewCompanyName;
	}
	
	public static void CloseProfileDetailsPage()
	{
		PageBase.click(closeProfileDetailsPage, 2);
	}
	
	public static Boolean VerifyIfOrdersPresent()
	{
		MyOrdersList = PageBase.FindElements(MyOrders);
		return !MyOrdersList.isEmpty();
	}
	
	public static void VerifyOrderDetails()
	{
		Assert.assertEquals((PageBase.GetText(AccountNumber, 2)),"200BHY NATIONAL PRIORITY FOC");
		Assert.assertEquals((PageBase.GetText(OrderNumber, 2)), "20413606");
	}
	
	public static void PrintOrder()
	{
		PageBase.click(PrintBtn, 2);
	}
	
	
}
