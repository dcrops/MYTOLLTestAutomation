package createShipmentActions;


import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;


public class ShipmentReviewActions {
	
	
	
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
	
	public static By specialInstructions=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Special instructions']/following::div/p");
	public static By palletTransactionsInformation=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Pallets']/following::div/p");
	public static By purchaseOrders=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Purchase orders']/following::div/p");
	public static By valueOfGoods=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='ship-detail-list']/li//label[text()='Value of goods (not over $5000)']/following::div/p");
	
	// Pallet Information
	public static By chepCustomerOwn=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep']/following::div[1]/span");
	public static By chepExchange=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep']/following::div[2]/span");
	public static By chepTransfer=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep']/following::div[3]/span");
	public static By chepDocketNumber=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep']/following::div[4]/span");
	
	public static By LoscamCustomerOwn=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Loscam']/following::div[1]/span");
	public static By LoscamExchange=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Loscam']/following::div[2]/span");
	public static By LoscamTransfer=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Loscam']/following::div[3]/span");
	public static By LoscamDocketNumber=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Loscam']/following::div[4]/span"); 
	
	public static By OtherCustomerOwn=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Other']/following::div[1]/span");
	
	public static By ChepOtherExchange=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep other']/following::div[2]/span");
	public static By ChepOtherTransfer=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep other']/following::div[3]/span");
	public static By ChepOtherDocketNumber=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Chep other']/following::div[4]/span"); 

	public static By LoscamOtherExchange=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Loscam other']/following::div[2]/span");
	public static By LoscamOtherTransfer=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Loscam other']/following::div[3]/span");
	public static By LoscamOtherDocketNumber=By.xpath("//*[@id=\"pallet-box\"]//label[text()='Loscam other']/following::div[4]/span"); 
	
	
	//Line Item 1 Headings 
	public static By lineItemNumber=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-head']/div[@class='line-item-index']/h2");
	public static By itemDescription1=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-head']/div[@class='line-item-title']/h3");
	public static By numberOfItems=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-head']/div[@class='item-numbers']/h3");
	public static By line1Arrowdown=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li[1]/div[1]/div[3]");
	
	public static By itemDescriptionHeading=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col item-desc']/h3");
	public static By itemsHeading=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[1]//div[@class='line-item-inner']//div[@class='item-inner-col total-items']/h3");
	public static By billingTypeHeading=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col billing-type']/h3");
	public static By dimensionsHeading=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col dimensions']/h3");
	public static By totalVolumeHeading=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col total-vol']/h3");
	public static By weightHeading=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col weight']/h3");
	public static By reference1Heading=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col reference1']/h3");
	public static By reference2Heading=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col reference2']/h3");
	public static By shipmentContainDangerousGoodsHeading=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col shipment-dg']/h3");

	//Line Item 1 values
	public static By itemDescription1Value=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col item-desc']//p");
	public static By itemsValue=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col total-items']//p");
	public static By billingTypeValue=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col billing-type']//p");
	public static By numberOfGarments=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col number-of-garments']//p");
	public static By dimensionsValue=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col dimensions']//p");
	public static By totalVolumeValue=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col total-vol']//p");
	public static By weightValue=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col weight']//p");
	public static By reference1Value=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col reference1']//p");
	public static By reference2Value=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col reference2']//p");
	public static By shipmentContainDangerousGoodsValue=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='item-inner-col shipment-dg']//p");
	
	//Dangerous Goods Details validation  
	public static By dangerousGoodsHeading=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[@class='line-item-inner']//div[@class='clearfix']/h5");
	public static By dangerousGoodsArrowdown=By.xpath("//*[contains(@id,\"dg-line\")]/div[1]/div[7]/a/i");
	public static By unNumber=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[contains(@id,\"dg-line\")]//label[text()='UN number']/following::div/p");
	public static By classDivision=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[contains(@id,\"dg-line\")]//label[text()='Class / Division']/following::div/p");
	public static By packingGroup=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[contains(@id,\"dg-line\")]//label[text()='Packing group']/following::div/p");
	public static By subrisk=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[contains(@id,\"dg-line\")]//label[text()='Sub risk']/following::div/p");
	public static By properShippingName=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[contains(@id,\"dg-line\")]//label[text()='Proper shipping name ']/following::div/p");
	public static By dgPackingGroup=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[contains(@id,\"dg-line\")]//label[text()='DG packaging description']/following::div/p");
	public static By dgPKG=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[contains(@id,\"dg-line\")]//label[text()='DG pkg (qty)']/following::div/p");
	public static By dgQTY=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[contains(@id,\"dg-line\")]//label[text()='DG qty (kg or L)']/following::div/p");
	public static By technicalName=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']//div[contains(@id,\"dg-line\")]//label[text()='Technical name']/following::div/p");
	
	//*[@id="shipment-placeholder"]/div[1]/div[1]/div/div[2]/ul/li[1]/div[1]/div[1]/h2
	//Line Item 2 Headings validation  //*[@id="shipment-placeholder"]/div[1]/div[1]/div/div[2]/ul/li[2]/div[1]/div[1]/h2
	public static By lineItemNumber2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-head']/div[@class='line-item-index']/h2");
	public static By itemDescription2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-head']/div[@class='line-item-title']/h3");
	public static By numberOfItems2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-head']/div[@class='item-numbers']/h3");
	public static By line2Arrowdown=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li[2]/div[1]/div[3]");
	
	public static By itemDescriptionHeading2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col item-desc']/h3");
	public static By itemsHeading2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col total-items']/h3");
	public static By billingTypeHeading2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col billing-type']/h3");
	public static By dimensionsHeading2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col dimensions']/h3");
	public static By totalVolumeHeading2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col total-vol']/h3");
	public static By weightHeading2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col weight']/h3");
	public static By reference1Heading2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col reference1']/h3");
	public static By reference2Heading2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col reference2']/h3");
	public static By shipmentContainDangerousGoodsHeading2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col shipment-dg']/h3");
	
	//Line Item 2 values
	public static By itemDescriptionValue2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col item-desc']//p");
	public static By itemsValue2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col total-items']//p");
	public static By billingTypeValue2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col billing-type']//p");
	public static By numberOfGarments2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col number-of-garments']//p");
	public static By dimensionsValue2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col dimensions']//p");
	public static By totalVolumeValue2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col total-vol']//p");
	public static By weightValue2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col weight']//p");
	public static By reference1Value2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col reference1']//p");
	public static By reference2Value2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col reference2']//p");
	public static By shipmentContainDangerousGoodsValue2=By.xpath("//*[@id=\"shipment-placeholder\"]//ul[@class='line-item-list']/li[2]//div[@class='line-item-inner']//div[@class='item-inner-col shipment-dg']//p");

	public static By dimensions=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[4]/p");
	public static By volume=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[5]/p");
	public static By weight=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[6]/p");
	public static By reference1=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[7]/p");
	public static By reference2=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[8]/p");
	public static By ShipmentContainDGGoods=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[9]/p");
	public static By continueBtn=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[2]/div[1]/span[1]/a"); 


	public static By AddToManifestManuallyBtn=By.id("manually-create-manifest");

	
	public static void VerifyDispatchDate(String pDispatchDate) {
		//assertEquals(pDispatchDate,BaseWebdriver.driver.findElement(dispatchDate).getText());
	}
	
	// Shipment additional information verification
	public static void VerifyAdditionalInformation(String pSpecialInstructions, String pPalletTransactionsInformation, String pPurchaseOrders,String pValueOfGoods ) {
		assertEquals(pSpecialInstructions,BaseWebdriver.driver.findElement(specialInstructions).getText());
		assertEquals(pPalletTransactionsInformation,BaseWebdriver.driver.findElement(palletTransactionsInformation).getText());
		assertEquals(pPurchaseOrders, BaseWebdriver.driver.findElement(purchaseOrders).getText().replaceAll(" ,", ""));
		//assertEquals(pValueOfGoods, BaseWebdriver.driver.findElement(valueOfGoods).getText());
		
	}
	
	public static void VerifyAdditionalInformationTollIPEC(String pSpecialInstructions, String pPalletTransactionsInformation, String pValueOfGoods ) {
		assertEquals(pSpecialInstructions,BaseWebdriver.driver.findElement(specialInstructions).getText());
		assertEquals(pPalletTransactionsInformation,BaseWebdriver.driver.findElement(palletTransactionsInformation).getText());
		assertEquals(pValueOfGoods, BaseWebdriver.driver.findElement(valueOfGoods).getText());
		
	}
	
	public static void VerifyAdditionalInformationTollIPECFashion(String pSpecialInstructions) {
		assertEquals(pSpecialInstructions,BaseWebdriver.driver.findElement(specialInstructions).getText());
		
	}
	
	public static void VerifyAdditionalInformationTollPrioAU(String pSpecialInstructions, String pPalletTransactionsInformation) {
		assertEquals(pSpecialInstructions,BaseWebdriver.driver.findElement(specialInstructions).getText());
		assertEquals(pPalletTransactionsInformation,BaseWebdriver.driver.findElement(palletTransactionsInformation).getText());
		
	}
	
	
	public static void VerifyAdditionalInformationForDangerousGoods(String pSpecialInstructions, String pPalletTransactionsInformation, String pPurchaseOrders ) {
		assertEquals(pSpecialInstructions,BaseWebdriver.driver.findElement(specialInstructions).getText());
		assertEquals(pPalletTransactionsInformation,BaseWebdriver.driver.findElement(palletTransactionsInformation).getText());
		assertEquals(pPurchaseOrders.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(purchaseOrders).getText().replaceAll(" ,", ""));
	
		
	}
	
	
	public static void VerifyAdditionalInformationForTollMining(String pSpecialInstructions, String pPurchaseOrders ) {
		assertEquals(pSpecialInstructions,BaseWebdriver.driver.findElement(specialInstructions).getText());
		assertEquals(pPurchaseOrders.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(purchaseOrders).getText().replaceAll(" ,", ""));
	
		
	}
	
	// Shipment overview verification
	public static void VerifyShipmentOverview(String pTollCarrier, String pAccountNumber, String pSenderCompanyName,String pSenderLocation,String pReceiverCompanyName, String pReceiverLocation,String pShipmentRef1, String pShipmentRef2,
			String pDropOffDepot,String pService,String pWhopays, String pCollectionDepot, String pMode ) {
		 PageBase.MaximumWaitForElementEnabled();
		assertEquals(pTollCarrier.replaceAll("\\s", ""),BaseWebdriver.driver.findElement(tollCarrier).getText().replaceAll("\\s", ""));
		assertEquals(pAccountNumber.replaceAll("\\s", ""),BaseWebdriver.driver.findElement(accountNumber).getText().replaceAll("\\s", ""));
		assertEquals(pSenderCompanyName.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(senderCompanyName).getText().replaceAll("\\s", ""));
		//assertEquals(pSenderLocation.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(senderLocation).getText().replaceAll("\\s", ""));
		assertEquals(pReceiverCompanyName.replaceAll("\\s", ""),  BaseWebdriver.driver.findElement(receiverCompanyName).getText().replaceAll("\\s", ""));
		assertEquals(pReceiverLocation.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(receiverLocation).getText().replaceAll("\\s", ""));
		//assertEquals(pShipmentRef1.replaceAll("\\s", ""),  BaseWebdriver.driver.findElement(shipmentReference1).getText().replaceAll("\\s", ""));
		//assertEquals(pShipmentRef2.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(shipmentReference2).getText().replaceAll("\\s", ""));
		assertEquals(pDropOffDepot.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(dropOffDepot).getText().replaceAll("\\s", ""));
		assertEquals(pService.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(service).getText().replaceAll("\\s", ""));
		assertEquals(pWhopays.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(whoPays).getText().replaceAll("\\s", ""));
		assertEquals( pCollectionDepot.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(collectionDepot).getText().replaceAll("\\s", ""));
		assertEquals(pMode.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(mode).getText().replaceAll("\\s", ""));
	}
	
	public static void VerifyShipmentOverviewTollTasmania(String pTollCarrier, String pAccountNumber, String pSenderCompanyName,String pSenderLocation,String pReceiverCompanyName, String pReceiverLocation,String pShipmentRef1, String pShipmentRef2,
			String pService,String pWhopays, String pCollectionDepot, String pMode ) {
		 PageBase.MaximumWaitForElementEnabled();
		assertEquals(pTollCarrier.replaceAll("\\s", ""),BaseWebdriver.driver.findElement(tollCarrier).getText().replaceAll("\\s", ""));
		assertEquals(pAccountNumber.replaceAll("\\s", ""),BaseWebdriver.driver.findElement(accountNumber).getText().replaceAll("\\s", ""));
		assertEquals(pSenderCompanyName.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(senderCompanyName).getText().replaceAll("\\s", "").replaceAll("\\s", ""));
		assertEquals(pSenderLocation.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(senderLocation).getText().replaceAll("\\s", ""));
		assertEquals(pReceiverCompanyName.replaceAll("\\s", ""),  BaseWebdriver.driver.findElement(receiverCompanyName).getText().replaceAll("\\s", ""));
		assertEquals(pReceiverLocation.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(receiverLocation).getText().replaceAll("\\s", ""));
		assertEquals(pShipmentRef1.replaceAll("\\s", ""),  BaseWebdriver.driver.findElement(shipmentReference1).getText().replaceAll("\\s", ""));
		assertEquals(pShipmentRef2.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(shipmentReference2).getText().replaceAll("\\s", ""));
		assertEquals(pService.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(service).getText().replaceAll("\\s", ""));
		assertEquals(pWhopays.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(whoPays).getText().replaceAll("\\s", ""));
		assertEquals( pCollectionDepot.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(collectionDepot).getText().replaceAll("\\s", ""));
		//assertEquals(pMode.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(mode).getText().replaceAll("\\s", ""));
	}
	
	public static void VerifyShipmentOverviewTGX(String pTollCarrier, String pAccountNumber, String pSenderCompanyName,String pSenderLocation,String pReceiverCompanyName, String pReceiverLocation,String pShipmentRef1,
			String pService,String pWhopays) {
		 PageBase.MaximumWaitForElementEnabled();
		 PageBase.MaximumWaitForElementEnabled();
		 PageBase.MaximumWaitForElementEnabled();
		assertEquals(pTollCarrier.replaceAll("\\s", ""),BaseWebdriver.driver.findElement(tollCarrier).getText().replaceAll("\\s", ""));
		//assertTrue(BaseWebdriver.driver.findElement(accountNumber).getText().replaceAll("\\s", "").contains(pAccountNumber.replaceAll("\\s", "")));

		//assertEquals(pAccountNumber.replaceAll("\\s", ""),BaseWebdriver.driver.findElement(accountNumber).getText().replaceAll("\\s", ""));
		assertEquals(pSenderCompanyName.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(senderCompanyName).getText().replaceAll("\\s", ""));
		assertEquals(pSenderLocation.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(senderLocation).getText().replaceAll("\\s", ""));
		assertEquals(pReceiverCompanyName.replaceAll("\\s", ""),  BaseWebdriver.driver.findElement(receiverCompanyName).getText().replaceAll("\\s", ""));
		assertEquals(pReceiverLocation.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(receiverLocation).getText().replaceAll("\\s", ""));
		assertEquals(pShipmentRef1.replaceAll("\\s", ""),  BaseWebdriver.driver.findElement(shipmentReference1).getText().replaceAll("\\s", ""));
		assertEquals(pService.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(service).getText().replaceAll("\\s", ""));
		assertEquals(pWhopays.replaceAll("\\s", ""), BaseWebdriver.driver.findElement(whoPays).getText().replaceAll("\\s", ""));
		
	}
	
	
	
	//Pallet information verification
	public static void VerifyPalletTransactionsInformations(String pChepCustomerOwn, String pChepExchange, String pChepTransfer,String pChepDocketNumber,String pLoscamCustomerOwn, String pLoscamExchange,String pLoscamTransfer, String pLoscamDocketNumber,
			String pOtherCustomerOwn,String pChepOtherExchange,String pChepOtherTransfer, String pChepOtherDocketNumber,String pLoscamOtherExchange, String pLoscamOtherTransfer , String pLoscamOtherDocketNumber) {
		assertEquals(pChepCustomerOwn,BaseWebdriver.driver.findElement(chepCustomerOwn).getText());
		assertEquals(pChepExchange,BaseWebdriver.driver.findElement(chepExchange).getText());
		assertEquals(pChepTransfer, BaseWebdriver.driver.findElement(chepTransfer).getText());
		assertEquals(pChepDocketNumber, BaseWebdriver.driver.findElement(chepDocketNumber).getText());
		assertEquals(pLoscamCustomerOwn,  BaseWebdriver.driver.findElement(LoscamCustomerOwn).getText());
		assertEquals(pLoscamExchange, BaseWebdriver.driver.findElement(LoscamExchange).getText());
		assertEquals(pLoscamTransfer,  BaseWebdriver.driver.findElement(LoscamTransfer).getText());
		assertEquals(pLoscamDocketNumber, BaseWebdriver.driver.findElement(LoscamDocketNumber).getText());
		assertEquals(pOtherCustomerOwn, BaseWebdriver.driver.findElement(OtherCustomerOwn).getText());
		assertEquals(pChepOtherExchange, BaseWebdriver.driver.findElement(ChepOtherExchange).getText());
		assertEquals(pChepOtherTransfer, BaseWebdriver.driver.findElement(ChepOtherTransfer).getText());
		assertEquals(pChepOtherDocketNumber, BaseWebdriver.driver.findElement(ChepOtherDocketNumber).getText());
		assertEquals(pLoscamOtherExchange, BaseWebdriver.driver.findElement(LoscamOtherExchange).getText());
		assertEquals(pLoscamOtherTransfer, BaseWebdriver.driver.findElement(LoscamOtherTransfer).getText());
		assertEquals(pLoscamOtherDocketNumber, BaseWebdriver.driver.findElement(LoscamOtherDocketNumber).getText());
	}
	
	// Line item1 Headings verification
	public static void VerifyLineItem1Headings(String pLineItemHeading, String pItemDescription1, String pNumberOfItems,String pItemDescriptionHeading, String pItemsHeading, String pBillingTypeHeading, 
			String pDimensionsHeading, String pTotalVolumeHeading, String pWeightHeading, String pReference1Heading, String pReference2Heading, String pShipmentContainDangerousGoodsHeading) {
		assertEquals(pLineItemHeading,BaseWebdriver.driver.findElement(lineItemNumber).getText());
		assertEquals(pItemDescription1,BaseWebdriver.driver.findElement(itemDescription1).getText());
		assertEquals(pNumberOfItems, BaseWebdriver.driver.findElement(numberOfItems).getText());
		 BaseWebdriver.driver.findElement(line1Arrowdown).click();
		 PageBase.MaximumWaitForElementEnabled();
		assertEquals(pItemDescriptionHeading, BaseWebdriver.driver.findElement(itemDescriptionHeading).getText());
		assertEquals(pItemsHeading,BaseWebdriver.driver.findElement(itemsHeading).getText());
		assertEquals(pBillingTypeHeading,BaseWebdriver.driver.findElement(billingTypeHeading).getText());
		assertEquals(pDimensionsHeading, BaseWebdriver.driver.findElement(dimensionsHeading).getText());
		assertEquals(pTotalVolumeHeading, BaseWebdriver.driver.findElement(totalVolumeHeading).getText());
		assertEquals(pWeightHeading,BaseWebdriver.driver.findElement(weightHeading).getText());
		assertEquals(pReference1Heading, BaseWebdriver.driver.findElement(reference1Heading).getText());
		assertEquals(pReference2Heading, BaseWebdriver.driver.findElement(reference2Heading).getText());
		assertEquals(pShipmentContainDangerousGoodsHeading, BaseWebdriver.driver.findElement(shipmentContainDangerousGoodsHeading).getText());
	}
	
	// Line item1 Values verification
		public static void VerifyLineItem1Values(String pItemDescription1Value, String pItemsValue,String pBillingTypeValue, String pDimensionsValue, String pTotalVolumeValue, 
				  String pWeightValue, String pReference1Value, String pReference2Value, String pShipmentContainDangerousGoodsValue) {
			assertEquals(pItemDescription1Value,BaseWebdriver.driver.findElement(itemDescription1Value).getText());
			assertEquals(pItemsValue, BaseWebdriver.driver.findElement(itemsValue).getText());
			//assertEquals(pBillingTypeValue, BaseWebdriver.driver.findElement(billingTypeValue).getText());
			assertEquals(pDimensionsValue,BaseWebdriver.driver.findElement(dimensionsValue).getText());
			assertEquals(pTotalVolumeValue, BaseWebdriver.driver.findElement(totalVolumeValue).getText());
			assertEquals(pWeightValue,BaseWebdriver.driver.findElement(weightValue).getText());
			assertEquals(pReference1Value, BaseWebdriver.driver.findElement(reference1Value).getText());
			assertEquals(pReference2Value, BaseWebdriver.driver.findElement(reference2Value).getText());
			assertEquals(pShipmentContainDangerousGoodsValue, BaseWebdriver.driver.findElement(shipmentContainDangerousGoodsValue).getText());
		}
		public static void VerifyNumberofGarmentsLineItem1(String pNumberofGarments) {
			
			assertEquals(pNumberofGarments, BaseWebdriver.driver.findElement(numberOfGarments).getText());
		}
		
		public static void VerifyDangerousGoodsDetails(String pDangerousGoodsHeading, String pUNnumber, String pClassDivision,String pPackingGroup, String pSubrisk, String pProperShippingName, 
				String pDgPackingGroup, String pDgPKG, String pDgQTY, String pTechnicalName ) {
			//assertEquals(pDangerousGoodsHeading,BaseWebdriver.driver.findElement(dangerousGoodsHeading).getText());
			BaseWebdriver.driver.findElement(dangerousGoodsArrowdown).click();
			 PageBase.MediumWaitForElementEnabled();
			assertEquals(pUNnumber, BaseWebdriver.driver.findElement(unNumber).getText());
			assertEquals(pClassDivision,BaseWebdriver.driver.findElement(classDivision).getText());
			assertEquals(pPackingGroup, BaseWebdriver.driver.findElement(packingGroup).getText());
			assertEquals(pSubrisk,BaseWebdriver.driver.findElement(subrisk).getText());
			assertEquals(pProperShippingName, BaseWebdriver.driver.findElement(properShippingName).getText());
			assertEquals(pDgPackingGroup, BaseWebdriver.driver.findElement(dgPackingGroup).getText());
			assertEquals(pDgPKG, BaseWebdriver.driver.findElement(dgPKG).getText());
			assertEquals(pDgQTY, BaseWebdriver.driver.findElement(dgQTY).getText());
			assertEquals(pTechnicalName, BaseWebdriver.driver.findElement(technicalName).getText());
		}
		
		// Line item2 Headings verification
		public static void VerifyLineItem2Headings(String pLineItemHeading, String pItemDescription1, String pNumberOfItems,String pItemDescriptionHeading, String pItemsHeading, String pBillingTypeHeading, 
			String pDimensionsHeading, String pTotalVolumeHeading, String pWeightHeading, String pReference1Heading, String pReference2Heading, String pShipmentContainDangerousGoodsHeading) {
			assertEquals(pLineItemHeading,BaseWebdriver.driver.findElement(lineItemNumber2).getText());
			assertEquals(pItemDescription1,BaseWebdriver.driver.findElement(itemDescription2).getText());
			assertEquals(pNumberOfItems, BaseWebdriver.driver.findElement(numberOfItems2).getText());
			BaseWebdriver.driver.findElement(line2Arrowdown).click();
			PageBase.MediumWaitForElementEnabled();
			assertEquals(pItemDescriptionHeading, BaseWebdriver.driver.findElement(itemDescriptionHeading2).getText());
			assertEquals(pItemsHeading,BaseWebdriver.driver.findElement(itemsHeading2).getText());
			assertEquals(pBillingTypeHeading,BaseWebdriver.driver.findElement(billingTypeHeading2).getText());
			assertEquals(pDimensionsHeading, BaseWebdriver.driver.findElement(dimensionsHeading2).getText());
			assertEquals(pTotalVolumeHeading, BaseWebdriver.driver.findElement(totalVolumeHeading2).getText());
			assertEquals(pWeightHeading,BaseWebdriver.driver.findElement(weightHeading2).getText());
			assertEquals(pReference1Heading, BaseWebdriver.driver.findElement(reference1Heading2).getText());
			assertEquals(pReference2Heading, BaseWebdriver.driver.findElement(reference2Heading2).getText());
			assertEquals(pShipmentContainDangerousGoodsHeading, BaseWebdriver.driver.findElement(shipmentContainDangerousGoodsHeading2).getText());
		}
		
		
		// Line item2 Values verification
		public static void VerifyLineItem2Values(String pItemDescription1Value, String pItemsValue,String pBillingTypeValue, String pDimensionsValue, String pTotalVolumeValue, 
			 String pWeightValue, String pReference1Value, String pReference2Value, String pShipmentContainDangerousGoodsValue) {
			assertEquals(pItemDescription1Value,BaseWebdriver.driver.findElement(itemDescriptionValue2).getText());
			assertEquals(pItemsValue, BaseWebdriver.driver.findElement(itemsValue2).getText());
			//assertEquals(pBillingTypeValue, BaseWebdriver.driver.findElement(billingTypeValue).getText());
			assertEquals(pDimensionsValue,BaseWebdriver.driver.findElement(dimensionsValue2).getText());
			assertEquals(pTotalVolumeValue, BaseWebdriver.driver.findElement(totalVolumeValue2).getText());
			assertEquals(pWeightValue,BaseWebdriver.driver.findElement(weightValue2).getText());
			assertEquals(pReference1Value, BaseWebdriver.driver.findElement(reference1Value2).getText());
			assertEquals(pReference2Value, BaseWebdriver.driver.findElement(reference2Value2).getText());
			assertEquals(pShipmentContainDangerousGoodsValue, BaseWebdriver.driver.findElement(shipmentContainDangerousGoodsValue2).getText());
				}
		
		public static void VerifyNumberofGarmentsLineItem2(String pNumberofGarments) {
			
			assertEquals(pNumberofGarments, BaseWebdriver.driver.findElement(numberOfGarments2).getText());
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
		assertEquals(pItemName1,  BaseWebdriver.driver.findElement(itemDescription1).getText());
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
		//BaseWebdriver.driver.findElement(continueBtn).click();
		PageBase.click(continueBtn, 20);
		PageBase.MaximumWaitForElementEnabled();
	}
	
	public static void ClickAddToManifestManually() {
		PageBase.MaximumWaitForElementEnabled();
		//BaseWebdriver.driver.findElement(AddToManifestManuallyBtn).click();
		PageBase.click(AddToManifestManuallyBtn, 20);
	}
	
}
