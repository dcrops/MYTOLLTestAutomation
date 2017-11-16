package createShipmentActions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;


public class ShipmentReviewActions {
	
	
	public static By dispatchDate=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[1]/div[2]/p");
	public static By tollCarrier=By.id("toll-carrier"); 
	public static By accountNumber=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Account number']/following::div/p"); 
	public static By senderCompanyName=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Sender company name']/following::div/p"); 
	public static By senderLocation=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Sender location']/following::div/p");
	public static By receiverCompanyName=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Receiver company name']/following::div/p"); 
	public static By receiverLocation=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Receiver location']/following::div/p"); 
	public static By shipmentReference1=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Shipment reference 1']/following::div/p");  
	public static By shipmentReference2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Shipment reference 2']/following::div/p"); 
	public static By dropOffDepot=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Drop off depot']/following::div/p"); 
	public static By whoPays=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Who pays']/following::div/p");
	public static By collectionDepot=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Collection depot']/following::div/p");
	public static By mode=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Mode']/following::div/p");
	public static By service=By.id("service-text");
	
	//Additional Information
	
	public static By specialInstructions=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Special Instructions']/following::div/p");
	public static By palletTransactionsInformation=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Pallet transactions information']/following::div/p");
	public static By purchaseOrders=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Purchase orders']/following::div/p");
	public static By valueOfGoods=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Value of goods (not over $5000)']/following::div/p");
	
	// Pallet Information
	public static By chepCustomerOwn=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep']/following::div[1]/span");
	public static By chepExchange=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep']/following::div[2]/span");
	public static By chepTransfer=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep']/following::div[3]/span");
	public static By chepDocketNumber=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep']/following::div[4]/span");
	
	
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
	public static By continueBtn=By.xpath("//a[text()='continue']");//By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[2]/div[1]/a[1]");
	

	public static By AddToManifestManuallyBtn=By.id("manually-create-manifest");//By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[2]/div[1]/a[1]");

	
	public static void VerifyDispatchDate(String pDispatchDate) {
		assertEquals(pDispatchDate,BaseWebdriver.driver.findElement(dispatchDate).getText());
	}
	
	public static void VerifyAdditionalInformation(String pSpecialInstructions, String pPalletTransactionsInformation, String pPurchaseOrders,String pValueOfGoods ) {
		assertEquals(pSpecialInstructions,BaseWebdriver.driver.findElement(tollCarrier).getText());
		assertEquals(pPalletTransactionsInformation,BaseWebdriver.driver.findElement(accountNumber).getText());
		assertEquals(pPurchaseOrders, BaseWebdriver.driver.findElement(senderCompanyName).getText());
		assertEquals(pValueOfGoods, BaseWebdriver.driver.findElement(senderLocation).getText());
		
	}
	
	public static void VerifyShipmentOverview(String pTollCarrier, String pAccountNumber, String pSenderCompanyName,String pSenderLocation,String pReceiverCompanyName, String pReceiverLocation,String pShipmentRef1, String pShipmentRef2,
			String pDropOffDepot,String pService,String pWhopays, String pCollectionDepot, String pMode ) {
		assertEquals(pTollCarrier,BaseWebdriver.driver.findElement(tollCarrier).getText());
		assertEquals(pAccountNumber,BaseWebdriver.driver.findElement(accountNumber).getText());
		assertEquals(pSenderCompanyName, BaseWebdriver.driver.findElement(senderCompanyName).getText());
		assertEquals(pSenderLocation, BaseWebdriver.driver.findElement(senderLocation).getText());
		assertEquals(pReceiverCompanyName,  BaseWebdriver.driver.findElement(receiverCompanyName).getText());
		assertEquals(pReceiverLocation, BaseWebdriver.driver.findElement(receiverLocation).getText());
		assertEquals(pShipmentRef1,  BaseWebdriver.driver.findElement(shipmentReference1).getText());
		assertEquals(pShipmentRef2, BaseWebdriver.driver.findElement(shipmentReference2).getText());
		assertEquals(pDropOffDepot, BaseWebdriver.driver.findElement(dropOffDepot).getText());
		assertEquals(pService, BaseWebdriver.driver.findElement(service).getText());
		assertEquals(pWhopays, BaseWebdriver.driver.findElement(whoPays).getText());
		assertEquals( pCollectionDepot, BaseWebdriver.driver.findElement(collectionDepot).getText());
		assertEquals(pMode, BaseWebdriver.driver.findElement(mode).getText());
	}
	
	public static void VerifyTollCarrier(String pTollCarrier) {
		assertEquals(pTollCarrier,BaseWebdriver.driver.findElement(tollCarrier).getText());
	}
	
	public static void VerifyAccountNumber(String pAccountNumber) {
		assertEquals(pAccountNumber,BaseWebdriver.driver.findElement(accountNumber).getText());
	}
	
	public static void VerifySenderCompanyName(String pSenderCompanyName) {
		String scn=BaseWebdriver.driver.findElement(senderCompanyName).getText();
		assertEquals(pSenderCompanyName, BaseWebdriver.driver.findElement(senderCompanyName).getText());
	}
	
	public static void VerifySenderLocation(String pSenderLocation) {
		assertEquals(pSenderLocation, BaseWebdriver.driver.findElement(senderLocation).getText());
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
		assertEquals(pWhopays, BaseWebdriver.driver.findElement(whoPays).getText());
	}
	
	public static void VerifyPalletTransactionsInformation(String pPalletTransactionsInformation) {
		assertEquals(pPalletTransactionsInformation,  BaseWebdriver.driver.findElement(palletTransactionsInformation).getText());
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
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(continueBtn).click();
	}
	
	public static void ClickAddToManifestManually() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AddToManifestManuallyBtn).click();
	}
	
}
