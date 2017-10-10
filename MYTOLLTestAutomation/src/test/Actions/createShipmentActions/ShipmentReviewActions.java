package createShipmentActions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;

public class ShipmentReviewActions {
	
	
	public static By dispatchDate=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[1]/div[2]/p");
	public static By tollCarrier=By.id("toll-carrier");
	public static By accountNumber=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[3]/div[2]/p");
	
	public static By senderCompanyName=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[4]/div[2]/p");
	public static By receiverCompanyName=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[6]/div[2]/p");
	public static By receiverLocation=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[7]/div[2]/p");
	
	public static By service=By.id("service-text");
	public static By Whopays=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div/ul/li[2]/div[2]/p");
	
	//Additional Information
	public static By FoodPackaging=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/ul/li[3]/div[2]/p");
	public static By PalletTransactionsInformation=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/ul/li[4]/div[2]/p");
	
	//Line Item 
	
	public static By itemName1=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[1]/div[2]/h3");
	public static By itemDescription1=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[1]/p");
	public static By numberOfItems=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[2]/p");
	public static By dimensions=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[4]/p");
	public static By volume=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[5]/p");
	public static By weight=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[6]/p");
	public static By reference1=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[7]/p");
	public static By reference2=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[8]/p");
	public static By ShipmentContainDGGoods=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[9]/p");
	
	// 
	
	public static By continueBtn=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[2]/div[1]/a[1]");
	
	public static void VerifyDispatchDate(String pDispatchDate) {
		assertEquals(pDispatchDate,BaseWebdriver.driver.findElement(dispatchDate).getText());
	}
	
	public static void VerifyTollCarrier(String pTollCarrier) {
		assertEquals(pTollCarrier,BaseWebdriver.driver.findElement(tollCarrier).getText());
	}
	
	public static void VerifyAccountNumber(String pAccountNumber) {
		assertEquals(pAccountNumber,BaseWebdriver.driver.findElement(accountNumber).getText());
	}
	
	public static void VerifySenderCompanyName(String pSenderCompanyName) {
		assertEquals(pSenderCompanyName, BaseWebdriver.driver.findElement(senderCompanyName).getText());
	}
	
	public static void VerifyReceiverCompanyName(String pReceiverCompanyName) {
		assertEquals(pReceiverCompanyName,  BaseWebdriver.driver.findElement(receiverCompanyName).getText());
	}
	
	public static void VerifyReceiverLocation(String pReceiverLocation) {
		assertEquals(pReceiverLocation, BaseWebdriver.driver.findElement(receiverLocation).getText());
	}
	
	public static void VerifyService(String pService) {
		assertEquals(pService, BaseWebdriver.driver.findElement(service).getText());
	}
	
	public static void VerifyWhopays(String pWhopays) {
		assertEquals(pWhopays, BaseWebdriver.driver.findElement(Whopays).getText());
	}
	
	public static void VerifyFoodPackaging(String pFoodPackaging) {
		assertEquals(pFoodPackaging, BaseWebdriver.driver.findElement(FoodPackaging).getText());
	}
	
	
	public static void VerifyPalletTransactionsInformation(String pPalletTransactionsInformation) {
		assertEquals(pPalletTransactionsInformation,  BaseWebdriver.driver.findElement(PalletTransactionsInformation).getText());
	}
	
	public static void VerifyItemName1(String pItemName1) {
		assertEquals(pItemName1,  BaseWebdriver.driver.findElement(itemName1).getText());
	}
	
	public static void VerifyItemDescription1(String pItemDescription1) {
		assertEquals(pItemDescription1, BaseWebdriver.driver.findElement(itemDescription1).getText());
	}
	
	public static void VerifyNumberOfItems(String pNumberOfItems) {
		assertEquals(pNumberOfItems,  BaseWebdriver.driver.findElement(numberOfItems).getText());
	}
	
	public static void VerifyDimensions(String pDimensions) {
		assertEquals(pDimensions, BaseWebdriver.driver.findElement(dimensions).getText());
	}
	
	public static void VerifyVolume(String pVolume) {
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume).getText());
	}
	
	
	public static void VerifyWeight(String pWeight) {
		assertEquals(pWeight,  BaseWebdriver.driver.findElement(weight).getText());
	}
	
	public static void VerifyReference1(String pReference1) {
		assertEquals(pReference1,  BaseWebdriver.driver.findElement(reference1).getText());
	}
	
	public static void VerifyReference2(String pReference2) {
		assertEquals(pReference2, BaseWebdriver.driver.findElement(reference2).getText());
	}
	
	public static void VerifyShipmentContainDGGoods(String pShipmentContainDGGoods) {
		assertEquals(pShipmentContainDGGoods,  BaseWebdriver.driver.findElement(ShipmentContainDGGoods).getText());
	}
	
	public static void ClickContinue() {
		BaseWebdriver.driver.findElement(continueBtn).click();
	}
	
}
