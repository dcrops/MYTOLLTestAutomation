package stationeryActions;

import org.openqa.selenium.By;

import GlobalActions.PageBase;
import bookAPickupActions.BookAPickupActions;

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
	public static By items= By.xpath("//*[@id=\"main-cont\"]/div[1]/span[2]"); 
	public static By productName1InTheCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div/div[1]"); 
	public static By productName2InTheCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div[2]/div[1]"); 
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
	public static By proceedToCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[4]/button"); 
	
	//Profile details page
	public static By profileDetailsPageHeading= By.xpath("//*[@id=\"add-addr-step2\"]/header/h2"); 
	public static By profileDetailsStatement= By.xpath("//*[@id=\"add-addr-step2\"]/header/p"); 
	public static By tollCarrier= By.xpath("//*[@id=\"profileDetailForm\"]/div/div[1]/div/input"); 
	public static By accountNumber= By.xpath("//*[@id=\"account-number-selector\"]/label/input[2]"); 
	public static By contact_name= By.id("contact_name");
	public static By contact_number= By.id("phone"); 
	public static By deliveryAddressTextfield= By.name("placeholder-location"); 
	public static By deliveryContactNameTextfield= By.name("AddrContactName"); 
	public static By notifyCheckbox= By.id("notify-me-checkbox"); 
	public static By notifyEmail= By.id("AddrNotifyEmail"); 
	public static By customerReferenceNumber= By.id("custom-ref-num"); 
	public static By deliveryInstructionTextField= By.id("SpecialInstruction");
	public static By reviewOrdersBtn= By.id("reviewOrderBtn"); 
	
		
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
		PageBase.MaximumWaitForElementEnabled();
	
	}
	
	public static void EnterPreprintToDetails(String pPreprintTo, String pPreprintToContactName) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintToTextfield, pPreprintTo, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"preprint-modal-to-address-selector-1\"]/div[2]/ul/li/div[text()='" + pPreprintTo + "']"), 10);  
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintToContactName, pPreprintToContactName, 10);
		PageBase.MaximumWaitForElementEnabled();
	
	}  
	
	public static void ClickAddToCartProduct1() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(addToCartProduct1, 5);
		
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
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(items, 10);
		
	}
	
	public static String GetproductName() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(productNameInTheList, 5);
		
	}
	
	public static String GetproductName1FromTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(productName1InTheCart, 5);
		
	}
	
	public static String GetproductName2FromTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(productName2InTheCart, 5);
		
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
		PageBase.MaximumWaitForElementEnabled();
		//PageBase.ClickOn(notifyCheckbox, 5);
		PageBase.SendKeysTo(notifyEmail, pNotifyEmail, 5);
		PageBase.SendKeysTo(customerReferenceNumber, pCustomerReferenceNum, 5);
		PageBase.SendKeysTo(deliveryInstructionTextField, pDeliveryInstructions, 5);
		PageBase.ClickOn(reviewOrdersBtn, 5);		
	}
	
	public static void ClickReviewOrder() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(reviewOrdersBtn, 5);
		
	}
	
}
