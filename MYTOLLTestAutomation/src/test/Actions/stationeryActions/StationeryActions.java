package stationeryActions;

import org.openqa.selenium.By;

import GlobalActions.PageBase;
import bookAPickupActions.BookAPickupActions;

public class StationeryActions {
	
	
	public static By allCategoriesDropdown = By.xpath("//*[@id=\"main-cont\"]/div[1]/span[1]/i");
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
	public static By addToCart= By.xpath("//*[@id=\"main-cont\"]/div[2]/div[2]/div/div/p[3]/button");
	public static By items= By.xpath("//*[@id=\"main-cont\"]/div[1]/span[2]"); 
	public static By productName1InTheCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div/div[1]");
	public static By product1QtyIntheCart= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div[1]/div[1]/span[1]");
	public static By preprintProduct1= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[2]/div[1]/div[1]/span[2]");  
	public static By totalItems= By.xpath("//*[@id=\"stationery-step1\"]/div[1]/div[3]/span/span");  

	
	
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
		PageBase.ClickOn(By.xpath("//*[@id=\"preprint-modal-from-address-selector-1\"]/div[2]/ul/li/div[text()='" + pPreprintFrom + "']"), 5);
		PageBase.SendKeysTo(preprintFromContactName, pPreprintFromContactName, 5);
	
	}
	
	public static void EnterPreprintToDetails(String pPreprintTo, String pPreprintToContactName) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(preprintToTextfield, pPreprintTo, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"preprint-modal-to-address-selector-1\"]/div[2]/ul/li/div[text()='" + pPreprintTo + "']"), 5);
		PageBase.SendKeysTo(preprintToContactName, pPreprintToContactName, 5);
	
	}  
	
	public static void ClickAddToCart() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(addToCart, 5);
		
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
	
	public static String GetproductNameFromTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(productName1InTheCart, 5);
		
	}
	
	public static String GetproductQtyFromTheCart() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(product1QtyIntheCart, 5);
		
	}
	public static String GetTotalItemsFromCart() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(totalItems, 5);
		
	}
}
