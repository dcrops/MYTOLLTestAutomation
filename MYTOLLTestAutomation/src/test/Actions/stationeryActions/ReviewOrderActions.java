package stationeryActions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;

public class ReviewOrderActions {

	// Review Order overview
	public static By tollCarrier = By.xpath(
			"//*[@id=\"review-order-step1\"]//div[@class='review-order__form-group']/label[text()='Toll carrier']/following::div/p");
	public static By accountNumber = By.xpath(
			"//*[@id=\"review-order-step1\"]//div[@class='review-order__form-group']/label[text()='Account number ']/following::div/p");
	public static By ContactName = By.xpath(
			"//*[@id=\"review-order-step1\"]//div[@class='review-order__form-group']/label[text()='Contact name']/following::div/p");
	public static By ContactNumber = By.xpath(
			"//*[@id=\"review-order-step1\"]//div[@class='review-order__form-group']/label[text()='Contact number']/following::div/p");

	// Delivery Details  
	public static By deliverycontactName = By.xpath(
			"//*[@id=\"review-order-step1\"]//div[2]//div[@class='review-order__form-group']/label[text()='Contact name']/following::div/p");
	public static By deliveryphoneNumber = By.xpath(
			"//*[@id=\"review-order-step1\"]//div[2]//div[@class='review-order__form-group']/label[text()='Phone number']/following::div/p");
	public static By deliveryCompanyName = By.xpath(
			"//*[@id=\"review-order-step1\"]//div[2]//div[@class='review-order__form-group clear']/label[text()='Company name']/following::div/p");
	public static By address = By.xpath(
			"//*[@id=\"review-order-step1\"]//div[2]//div[@class='review-order__form-group clear']/label[text()='Address']/following::div/p");
	public static By deliveryCustomerReference = By.xpath(
			"//*[@id=\"review-order-step1\"]//div[2]//div[@class='review-order__form-group clear']/label[text()='Customer reference']/following::div/p");
	public static By deliveryInstructions = By.xpath(
			"//*[@id=\"review-order-step1\"]//div[2]//div[@class='review-order__form-group clear']/label[text()='Delivery instructions']/following::div/p");

	// Line item 1 details
	public static By productNameLineItem1 = By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[3]/div[2]/div/div/p");
	public static By quantityLineItem1 = By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[3]/div[3]/div/div/p");
	public static By unitPriceLineItem1 = By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[3]/div[4]/div/div/p");
	public static By totalLineItem1 = By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[3]/div[5]/div/div/p");
	public static By LineItem1arrowdown = By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[2]/a/i");
	public static By preprintFromAddress = By.xpath("//*[@id=\"line-item-0\"]/div[2]/div/div/div[2]/div[2]");

	// Line item 2 details
	public static By productNameLineItem2 = By.xpath("//*[@id=\"line-item-1\"]/div[1]/div[3]/div[2]/div/div/p");
	public static By quantityLineItem2 = By.xpath("//*[@id=\"line-item-1\"]/div[1]/div[3]/div[3]/div/div/p");
	public static By unitPriceLineItem2 = By.xpath("//*[@id=\"line-item-1\"]/div[1]/div[3]/div[4]/div/div/p");
	public static By totalLineItem2 = By.xpath("//*[@id=\"line-item-1\"]/div[1]/div[3]/div[5]/div/div/p");
	
	// Line item 3 details
	public static By productNameLineItem3 = By.xpath("//*[@id=\"line-item-2\"]/div[1]/div[3]/div[2]/div/div/p");
	public static By quantityLineItem3 = By.xpath("//*[@id=\"line-item-2\"]/div[1]/div[3]/div[3]/div/div/p");
	public static By unitPriceLineItem3 = By.xpath("//*[@id=\"line-item-2\"]/div[1]/div[3]/div[4]/div/div/p");
	public static By totalLineItem3 = By.xpath("//*[@id=\"line-item-2\"]/div[1]/div[3]/div[5]/div/div/p");

	//GST Message, Total surcharge, Total Charge
	public static By GSTMEssage = By.xpath(
			"//*[@id=\"review-order-step1\"]/div[2]/div[2]/div[1]");  //*[@id="order-detail-step1"]/div[2]/div[2]/div[1]
	public static By TotalSurcharge = By.xpath(
			"//*[@id=\"review-order-step1\"]/div[2]/div[2]/div[2]/div/div/div[1]/div/p");
	
	public static By TotalCharge = By.xpath(
			"//*[@id=\"review-order-step1\"]/div[2]/div[2]/div[2]/div/div/div[2]/div/p");
	
	//Confirm order, Edit Delivery details, Edit
	public static By confirmOrder = By.id("confirmOrderbtn");
	public static By editDeliveryDetails = By.xpath("//*[@id=\"editDelivery-popup-btn\"]/span");
	public static By edit = By.id("edit-btn-review-order");
	
	//Order submited page
	public static By orderNumber = By.id("createdOrderNO");
	public static By createdOn = By.id("displayDate");
	public static By backToDashBoardbtn = By.id("backToDashBoardbtn");
	public static By newOrderbtn = By.id("newOrderbtn");
	public static By myOrderbtn = By.id("myStationerybtn");
	public static By print = By.xpath("//*[@id=\"confirm-order-placeholder\"]/div[1]/div/div[3]/span/i");
	
	//Order screen
	public static By orderItem1 = By.xpath("//*[@id=\"myOrders_stationery\"]/div/div/div[2]/table/tbody/tr[1]/td[1]");
	public static By orderScreenHeading = By.xpath("//*[@id=\"portlet_myorders_WAR_mytollstationaryportlet\"]/div/div/div/div[1]/header/div[1]/h1");
	
	
	public static void VerifyReviewOrder(String pReviewOrder, String pAccountNumber, String pContactName,
			String pContactNumber) {

		assertEquals( PageBase.GetText(tollCarrier, 5),pReviewOrder);
		assertEquals( PageBase.GetText(accountNumber, 5),pAccountNumber);
		assertEquals( PageBase.GetText(ContactName, 5),pContactName);
		assertEquals( PageBase.GetText(ContactNumber, 5),pContactNumber);
		
	}

	public static void VerifyDeliveryDetails(String pDeliverycontactName, String pDeliveryphoneNumber,
			String pDeliveryCompanyName, String pAddress, String pDeliveryCustomerReference,
			String pDeliveryInstructions) {

		assertEquals(PageBase.GetText(deliverycontactName, 5),pDeliverycontactName);
		assertEquals( PageBase.GetText(deliveryphoneNumber, 5),pDeliveryphoneNumber);
		assertEquals( PageBase.GetText(deliveryCompanyName, 5),pDeliveryCompanyName);
		assertEquals( PageBase.GetText(address, 5),pAddress);
		assertEquals( PageBase.GetText(deliveryCustomerReference, 5),pDeliveryCustomerReference);
		assertEquals( PageBase.GetText(deliveryInstructions, 5),pDeliveryInstructions);
	}
	
	public static void VerifyLineItem1details(String pProductNameLineItem1, String pQuantityLineItem1, String pUnitPriceLineItem1,
			String pTotalLineItem1, String pPreprintFromAddress) {

		assertEquals( PageBase.GetText(productNameLineItem1, 5),pProductNameLineItem1);
		assertEquals( PageBase.GetText(quantityLineItem1, 5),pQuantityLineItem1);
		assertEquals( PageBase.GetText(unitPriceLineItem1, 5),pUnitPriceLineItem1);
		assertEquals( PageBase.GetText(totalLineItem1, 5),pTotalLineItem1);
		//PageBase.ClickOn(LineItem1arrowdown, 5);
		//assertEquals( PageBase.GetText(preprintFromAddress, 5),pPreprintFromAddress);
		
	}
	
	public static void VerifyLineItem2details(String pProductNameLineItem2, String pQuantityLineItem2, String pUnitPriceLineItem2,
			String pTotalLineItem2) {

		assertEquals( PageBase.GetText(productNameLineItem2, 5),pProductNameLineItem2);
		assertEquals( PageBase.GetText(quantityLineItem2, 5),pQuantityLineItem2);
		assertEquals( PageBase.GetText(unitPriceLineItem2, 5),pUnitPriceLineItem2);
		assertEquals( PageBase.GetText(totalLineItem2, 5),pTotalLineItem2);
				
	}
	
	public static void VerifyLineItem3details(String pProductNameLineItem2, String pQuantityLineItem2, String pUnitPriceLineItem2,
			String pTotalLineItem2) {

		assertEquals( PageBase.GetText(productNameLineItem3, 5),pProductNameLineItem2);
		assertEquals( PageBase.GetText(quantityLineItem3, 5),pQuantityLineItem2);
		assertEquals( PageBase.GetText(unitPriceLineItem3, 5),pUnitPriceLineItem2);
		assertEquals( PageBase.GetText(totalLineItem3, 5),pTotalLineItem2);
				
	}
	
	public static void VerifyGSTMSG(String pGSTMsg) {

		assertEquals( PageBase.GetText(GSTMEssage, 5).replaceAll("\\s", ""),pGSTMsg.replaceAll("\\s", ""));
					
	}
	
	public static void VerifyTotals(String pTotalSurcharges,String pTotalchages) {

		assertEquals( PageBase.GetText(TotalSurcharge, 5).replaceAll("\\s", ""),pTotalSurcharges.replaceAll("\\s", ""));
		assertEquals( PageBase.GetText(TotalCharge, 5).replaceAll("\\s", ""),pTotalchages.replaceAll("\\s", ""));
		
	}
	
	public static void ConfirmOrder() {

		PageBase.ClickOn(confirmOrder, 5);
		PageBase.MaximumWaitForElementEnabled();
	}

	public static void ClickEditDeliveryDetails() {

		PageBase.ClickOn(editDeliveryDetails, 5);
		PageBase.MaximumWaitForElementEnabled();
	}
	
	public static void ClickEdit() {

		PageBase.ClickOn(edit, 5);
		PageBase.MaximumWaitForElementEnabled();
	}
	
	public static void VerifyOrderNumber() {
		PageBase.LongWaitForElementEnabled();
		PageBase.LongWaitForElementEnabled();
		
		try {
			
		String OrderNumber=PageBase.GetText(orderNumber, 5);
		if(orderNumber.equals(null)){
			System.out.println("OrderNumber: "+ OrderNumber);
			assertEquals("1234", "123");
		}
		}
		
		catch(Exception ex)
		{
			String OrderNumber=PageBase.GetText(orderNumber, 5);
			System.out.println("OrderNumber: "+ OrderNumber);
		}
					
	}
	
	public static void VerifyCreatedOn() {
		try {
		String OrderNumber=PageBase.GetText(createdOn, 5);
		if(orderNumber.equals(null)){
			System.out.println("OrderNumber: "+ OrderNumber);
			assertEquals("1234", "123");
		}
		}
		
		catch(Exception ex)
		{
			String OrderNumber=PageBase.GetText(createdOn, 5);
			System.out.println("OrderNumber: "+ OrderNumber);
		}
					
	}
	
	public static void VerifyBackToDashboard() {
		assertEquals( PageBase.GetText(backToDashBoardbtn, 5),"BACK TO DASHBOARD");
					
	}
	
	public static void VerifyCreateANewOrder() {
		assertEquals( PageBase.GetText(newOrderbtn, 5),"CREATE A NEW ORDER");
					
	}
	
	public static void VerifyMYOrders() {
		assertEquals( PageBase.GetText(myOrderbtn, 5), "MY ORDERS");
					
	}
	
	public static void ClickPrint() {
		
		//PageBase.ClickOn(print, 5);
		//BaseWebdriver.driver.close();
		//PageBase.MaximumWaitForElementEnabled();
	}
	
	public static void ClickMyorder() {

		PageBase.ClickOn(myOrderbtn, 5);
		PageBase.MaximumWaitForElementEnabled();
	}
	
	
	public static void ClickOrderItem() {
		PageBase.LongWaitForElementEnabled();
		PageBase.ClickOn(orderItem1, 5);
		PageBase.MaximumWaitForElementEnabled();
	}
	
	public static void VerifyMYOrdersScreenHeading() {
		assertEquals( PageBase.GetText(orderScreenHeading, 5), "MY ORDERS");
					
	}
	
	
}
