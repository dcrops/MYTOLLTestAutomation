package stationeryActions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import GlobalActions.PageBase;

public class OrderSummaryActions {

	// Order summary overview
	public static By tollCarrier = By.xpath(
			"//*[@id=\"order-detail-step1\"]//div[@class='review-order__form-group']/label[text()='Toll carrier']/following::div/p");
	public static By accountNumber = By.xpath(
			"//*[@id=\"order-detail-step1\"]//div[@class='review-order__form-group']/label[text()='Account number ']/following::div/p");
	public static By ContactName = By.xpath(
			"//*[@id=\"order-detail-step1\"]//div[@class='review-order__form-group']/label[text()='Contact name']/following::div/p");
	public static By ContactNumber = By.xpath(
			"//*[@id=\"order-detail-step1\"]//div[@class='review-order__form-group']/label[text()='Contact number']/following::div/p");

	// Delivery Details
	public static By deliverycontactName = By.xpath(
			"//*[@id=\"order-detail-step1\"]//div[2]//div[@class='review-order__form-group']/label[text()='Contact name']/following::div/p");
	public static By deliveryphoneNumber = By.xpath(
			"//*[@id=\"order-detail-step1\"]//div[2]//div[@class='review-order__form-group']/label[text()='Phone number']/following::div/p");
	public static By deliveryCompanyName = By.xpath(
			"//*[@id=\"order-detail-step1\"]//div[2]//div[@class='review-order__form-group clear']/label[text()='Company name']/following::div/p");
	public static By address = By.xpath(
			"//*[@id=\"order-detail-step1\"]//div[2]//div[@class='review-order__form-group clear']/label[text()='Address']/following::div/p");
	public static By deliveryCustomerReference = By.xpath(
			"//*[@id=\"order-detail-step1\"]//div[2]//div[@class='review-order__form-group clear']/label[text()='Customer reference']/following::div/p");
	public static By deliveryInstructions = By.xpath(
			"//*[@id=\"order-detail-step1\"]//div[2]//div[@class='review-order__form-group clear']/label[text()='Delivery instructions']/following::div/p");

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

	// GST Message, Total surcharge, Total Charge
	public static By GSTMEssage = By.xpath("//*[@id=\"order-detail-step1\"]/div[2]/div[2]/div[1]");
	public static By TotalSurcharge = By
			.xpath("//*[@id=\"order-detail-step1\"]/div[2]/div[2]/div[2]/div/div/div[1]/div/p");

	public static By TotalCharge = By
			.xpath("//*[@id=\"order-detail-step1\"]/div[2]/div[2]/div[2]/div/div/div[2]/div/p");
	public static By print = By.id("orderPrint");
	
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
	
	public static void VerifyGSTMSG(String pGSTMsg) {

		assertEquals( PageBase.GetText(GSTMEssage, 5).replaceAll("\\s", ""),pGSTMsg.replaceAll("\\s", ""));
					
	}
	
	public static void VerifyTotals(String pTotalSurcharges,String pTotalchages) {

		assertEquals( PageBase.GetText(TotalSurcharge, 5).replaceAll("\\s", ""),pTotalSurcharges.replaceAll("\\s", ""));
		assertEquals( PageBase.GetText(TotalCharge, 5).replaceAll("\\s", ""),pTotalchages.replaceAll("\\s", ""));
		
	}
	
	public static void ClickPrint() {

		PageBase.ClickOn(print, 5);
		PageBase.MaximumWaitForElementEnabled();
	}

}
