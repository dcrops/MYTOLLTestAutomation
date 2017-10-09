package createShipmentActions;

import GlobalActions.PageBase;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import rateEnquiryActions.RateEnquiryActions;

public class CreateShipmentActions {

	public static By shipments = By.id("createShipment");
	public static By servicedropdown = By.xpath("//*[@id=\"service-selector\"]/label/a/i");
	public static By mode = By.xpath("//*[@id=\"mode-selector\"]/div[1]/a/i");
	public static By TempretureTypeDropdown = By.xpath("//*[@id=\"refrigeration-type-selector\"]/div[1]/a/i");
	public static By whoPaysdropdown = By.xpath("//*[@id=\"payer-selector\"]/label/a/i");
	public static By senderdropdown = By.xpath("//*[@id=\"sender-selector\"]/label/a/i");
	public static By accountNumber = By.name("account-text");
	public static By receiverdropdown = By.xpath("//*[@id=\"receiver-selector\"]/label/a/i");
	public static By receiverTextfield = By.xpath("//*[@id=\"receiver-selector\"]/label/input[2]");
	public static By shipmentConsolidatedMSGHeading=By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/header/h2"); 
	public static By shipmentConsolidatedRadioBtn = By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li[2]/div[1]/div[1]/label");
	public static By shipmentConsolidatedArrowdown = By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li[2]/div[1]/div[7]");
	public static By shipmentConsolidatedContinue = By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/footer/a[1]"); 
	public static By consolidatedBtn = By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/footer/a[2]");
	public static By dgContactName = By.xpath("//*[@id=\"dg-contact-dtls-wrpr\"]/div[1]/div/input");  
	public static By dgContactNumber= By.xpath("//*[@id=\"dg-contact-dtls-wrpr\"]/div[2]/div/input"); 
	public static By quoteNumber = By.id("quote_num");
	public static By shipmentReference1 = By.name("reference-1");
	public static By shipmentReference2 = By.name("reference-2");
	public static By dropoffDepotdropdown = By.xpath("//*[@id=\"drop-off-depot-selector\"]/div[1]/a/i");
	public static By collectionDepotdropdown = By.xpath("//*[@id=\"collection-depot-selector\"]/div[1]/a/i");
	public static By billingTypedropdown = By.xpath("//*[@id=\"billing-type-selector\"]/div[1]/a/i"); 
	public static By notifySenderCheckBox = By.id("notify-sender");
	public static By notifyReceiverCheckBox = By.id("notify-receiver");
	public static By senderEmail = By.id("sender-email");
	public static By receiverEmail = By.id("receiver-email");
	public static By senderReference = By.id("sender-reference");
	public static By receiverReference = By.id("reciever-reference");
	public static By numberOfItem = By.id("quantity"); 
	public static By itemType = By.xpath("//*[@id=\"outr-pkg-selector\"]/div[1]/a");
	public static By weight = By.id("weight");
	public static By addNewLine = By.id("add-line-item");
	public static By addPalletYes = By.id("pallet-yes");
	public static By addPalletNo = By.id("pallet-no");
	public static By chepCustomer = By.id("chepCustomer");
	public static By chepExchange = By.id("chepExchange");
	public static By chepTransfer= By.id("chepTransfer");
	public static By chepDocket = By.id("chepDocket");
	public static By loscamCustomer= By.id("loscamCustomer");
	public static By loscamExchange = By.id("loscamExchange");
	public static By loscamTransfer= By.id("loscamTransfer");
	public static By loscamDocket = By.id("loscamDocket");
	public static By otherCustomer = By.id("otherCustomer");
	public static By chepOtherExchange= By.id("chepOtherExchange");
	public static By chepOtherTransfer= By.id("chepOtherTransfer");
	public static By chepOtherCustomer= By.id("chepOtherCustomer");
	public static By loscamOtherExchange= By.id("loscamOtherExchange");
	public static By loscamOtherTransfer= By.id("loscamOtherTransfer");
	public static By loscamOtherDocket= By.id("loscamOtherCustomer");
	public static By purchaseorderTextField= By.id("purchase-order");
	public static By tollExtraSrviceNOBtn= By.xpath("//*[@id=\"steps-3\"]/div[7]/div/div/div[1]/div/label/span[2]");
	public static By foodPackagingNOBtn= By.xpath("//*[@id=\"is-food-switch\"]/div/label/span[2]");
	public static By authorityToLeaveNoBtn= By.xpath("//*[@id=\"steps-3\"]/div[5]/div/div[2]/label/span[2]");
	public static By tollExtraSrviceAmount= By.id("toll-extra-service"); 
	public static By reviewCreateShipmentBtn = By.id("create-shipment-btn");

	public static By acceptAccountChangeMSG = By.id("confirm-true");
	public static void ClickShipment() {
		BaseWebdriver.driver.findElement(shipments).click();

	}

	public static void SelectTollCarrierItem(int j) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"BU-selector\"]/label/a/i")).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"BU-selector\"]/div/ul/li[" + j + "]/div")).click();

	}

	public static void SelectService(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(servicedropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li[" + i + "]/div")).click();

	}
	
	/*public static void EnterService(String pService) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(servicedropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li[text()='\"+pService +\"']/div")).click();

	}*/
	
	
	
	public static void EnterService(String pService) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(servicedropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li/div[text()='"+pService+"']")).click();

	}

	public static void SelectMode(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(mode).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-selector\"]/div[2]/ul/li[\" + i + \"]/div")).click();

	}
	
	public static void ClickContinueAccountChangeMsg() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(acceptAccountChangeMSG).click();
			
	}

	public static void SelectTempratureType(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(TempretureTypeDropdown).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"refrigeration-type-selector\"]/div[2]/ul/li[\" + i + \"]/div")).click();

	}

	public static void SelectWhoPays(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(whoPaysdropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"payer-selector\"]/div/ul/li[\" + i + \"]/div")).click();

	}

	public static void SelectSender(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(senderdropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[2]/ul/li[\" + i + \"]/div[2]"))
				.click();
		//*[@id="sender-selector"]/div[2]/ul/li[2]/div[2]
	}

	public static String GetSender(String pSender) {
		PageBase.MaximumWaitForElementEnabled();
		String vSender=BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[2]/ul/li[\" + i + \"]/div[2]")).getText();
		//String vSender=BaseWebdriver.driver.findElement(By.xpath("By.xpath(\"//*[@id='\"sender-selector\"]/div[2]/ul/li/div[text()='"+pSender+"']")).getText();
		return vSender;
	
	}
	
	public static void EnterAccountNumber(String pAccountNumber) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(accountNumber).click();
		BaseWebdriver.driver.findElement(accountNumber).clear();
		BaseWebdriver.driver.findElement(accountNumber).sendKeys(pAccountNumber);

	}

	public static void SelectReceiver(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(receiverdropdown).click();
		PageBase.Scrollbar(500, 800);
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[2]/ul/li[\" + i + \"]/div[2]"))
				.click();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
	}

	public static void EnterReceiver(String Receiver,String pReceiver) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(receiverTextfield).click();
		BaseWebdriver.driver.findElement(receiverTextfield).clear();
		BaseWebdriver.driver.findElement(receiverTextfield).sendKeys(Receiver);
		PageBase.Scrollbar(500, 800);
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[2]/ul/li/div[text()='"+pReceiver+"']")).click();
				
		PageBase.MaximumWaitForElementEnabled();//*[@id="receiver-selector"]/div[2]/ul/li[2]/div[1]
		PageBase.MaximumWaitForElementEnabled();
	}
	
	public static void SelectShipmentConsolidatedContinue() {
		PageBase.MaximumWaitForElementEnabled();
		
		if (BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li[2]/div[1]/div[7]")).isDisplayed()==true) {
		
		BaseWebdriver.driver.findElement(shipmentConsolidatedMSGHeading).isDisplayed();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/footer/a[1]")).click();
		}
		
		
		/*String myWindowHandle = BaseWebdriver.driver.getWindowHandle();
		BaseWebdriver.driver.switchTo().window(myWindowHandle);
		// BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div")).click();
		BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn).click();
		BaseWebdriver.driver.findElement(consolidatedBtn).click();//*[@id="shipment-cons-popup-wrpr"]/div/div/footer/a[1] */

	}
	
	public static void SelectShipmentConsolidated() {
		try {
		PageBase.MaximumWaitForElementEnabled();
		Boolean results=BaseWebdriver.driver.findElement(shipmentConsolidatedContinue).isDisplayed();
		if (results=true) {
		BaseWebdriver.driver.findElement(shipmentConsolidatedContinue).click();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		}
		}
		
		catch(Exception ex) {
			System.out.println(ex);
		}
		}
		
		

	public static void EnterDGContactName(String pDGContactName) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(dgContactName).click();
		BaseWebdriver.driver.findElement(dgContactName).clear();
		BaseWebdriver.driver.findElement(dgContactName).sendKeys(pDGContactName);

	}

	public static void EnterQuoteNumber(String pQuoteNumber) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(quoteNumber).click();
		BaseWebdriver.driver.findElement(quoteNumber).clear();
		BaseWebdriver.driver.findElement(quoteNumber).sendKeys(pQuoteNumber);

	}
	
	public static void SelectNotifySenderAndReceiver() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(notifySenderCheckBox).click();
		BaseWebdriver.driver.findElement(notifyReceiverCheckBox).click();
	}

	public static void EnterShipmentReferences(String pShipmentRef1, String pShipmentRef2) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.Scrollbar(0, 800);
		try {
		BaseWebdriver.driver.findElement(shipmentReference1).click();
		BaseWebdriver.driver.findElement(shipmentReference1).clear();
		BaseWebdriver.driver.findElement(shipmentReference1).sendKeys(pShipmentRef1);
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(shipmentReference2).click();
		BaseWebdriver.driver.findElement(shipmentReference2).clear();
		BaseWebdriver.driver.findElement(shipmentReference2).sendKeys(pShipmentRef2);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}


	public static void SelectDropOffDepot(int i) {
		PageBase.MaximumWaitForElementEnabled();
		
		BaseWebdriver.driver.findElement(dropoffDepotdropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"drop-off-depot-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click();
		PageBase.MaximumWaitForElementEnabled();
	}

	public static void SelectCollectionDepot(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(collectionDepotdropdown).click();
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"collection-depot-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click();

	}

	public static void NumberOfItem(String pnumberOfItem) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(numberOfItem).click();
		BaseWebdriver.driver.findElement(numberOfItem).clear();
		BaseWebdriver.driver.findElement(numberOfItem).sendKeys(pnumberOfItem);

	}

	public static void ItemType(int j) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemType).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"outr-pkg-selector\"]/div[2]/ul/li["+j+"]/div"))
				.click();

	}

	public static void EnterWeight(String pweight) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(weight).click();
		BaseWebdriver.driver.findElement(weight).clear();
		BaseWebdriver.driver.findElement(weight).sendKeys(pweight);

	}

	public static void EnterSenderReference(String pSenderReference, String pReceiverReference) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(senderReference).click();
		BaseWebdriver.driver.findElement(senderReference).clear();
		BaseWebdriver.driver.findElement(senderReference).sendKeys(pSenderReference);
		BaseWebdriver.driver.findElement(receiverReference).click();
		BaseWebdriver.driver.findElement(receiverReference).clear();
		BaseWebdriver.driver.findElement(receiverReference).sendKeys(pReceiverReference);

	}

	public static void EnterBillingType(String pBillingType) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingTypedropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li/div[text()='"+pBillingType+"']")).click();
				

	}
	
	public static void SelectBillingType(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingTypedropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click();

	}
	
	public static void EnterTollCarrierItem(String pTollCarrierName) {//*[@id="BU-selector"]/label/a/i String pDropdownSelector, String pTollCarrierName
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id='BU-selector']/label/a/i")).click();
		BaseWebdriver.driver.findElement(By.xpath("//div[@id='BU-selector']/div/ul/li/div[text()='"+pTollCarrierName+"']")).click();

	}
	
	public static void AddANewLineNZAUS() {
		PageBase.Scrollbar(500,800);
		BaseWebdriver.driver.findElement(addNewLine).click();
		
		BookAPickupActions.EnterItem("Automation Temp2");
		CreateShipmentActions.NumberOfItem("15");
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		CreateShipmentActions.EnterWeight("20");
		//CreateShipmentActions.SelectBillingType(1); if there is one billing type , it is not visible.
		CreateShipmentActions.EnterSenderReference("1234", "5678");

	}
	
	public static void AddANewLineTIPEC() {

		PageBase.Scrollbar(500,1200);
		BaseWebdriver.driver.findElement(addNewLine).click();

		BookAPickupActions.EnterItem("Automation Temp2");
		CreateShipmentActions.NumberOfItem("15");
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		CreateShipmentActions.EnterWeight("20");
		
		CreateShipmentActions.EnterSenderReference("1234", "5678");

	}
	
	public static void SelectPalletTransactionsYes() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(addPalletYes).click();
		
	}
	
	public static void SelectPalletTransactionsNo() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(addPalletNo).click();
		
	}


	public static void EnterPalletTransActionInformations(String pChepCustomer, String pChepExchange, String pChepTansferToToll, String pChepDocketNo, 
			String pLoscamCustomer, String pLoascamExchange, String pLoscamTransferToToll, String pLoscamDocketNo, String pOtherCostomer,
			String pChepOtherExchange, String pChepOtherTransferToToll, String pchepOtherDocketNo, String pLoscamOtherExchange, String pLoscamOtherTransferToToll,
			String pLoscamOtherDocketNo) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(chepCustomer).click();
		BaseWebdriver.driver.findElement(chepCustomer).clear();
		BaseWebdriver.driver.findElement(chepCustomer).sendKeys(pChepCustomer);
		BaseWebdriver.driver.findElement(chepExchange).click();
		BaseWebdriver.driver.findElement(chepExchange).clear();
		BaseWebdriver.driver.findElement(chepExchange).sendKeys(pChepExchange);
		BaseWebdriver.driver.findElement(chepTransfer).click();
		BaseWebdriver.driver.findElement(chepTransfer).clear();
		BaseWebdriver.driver.findElement(chepTransfer).sendKeys(pChepTansferToToll);
		BaseWebdriver.driver.findElement(chepDocket).click();
		BaseWebdriver.driver.findElement(chepDocket).clear();
		BaseWebdriver.driver.findElement(chepDocket).sendKeys(pChepDocketNo);
		BaseWebdriver.driver.findElement(loscamCustomer).click();
		BaseWebdriver.driver.findElement(loscamCustomer).clear();
		BaseWebdriver.driver.findElement(loscamCustomer).sendKeys(pLoscamCustomer);
		BaseWebdriver.driver.findElement(loscamExchange).click();
		BaseWebdriver.driver.findElement(loscamExchange).clear();
		BaseWebdriver.driver.findElement(loscamExchange).sendKeys(pLoascamExchange);
		BaseWebdriver.driver.findElement(loscamTransfer).click();
		BaseWebdriver.driver.findElement(loscamTransfer).clear();
		BaseWebdriver.driver.findElement(loscamTransfer).sendKeys(pLoscamTransferToToll);
		BaseWebdriver.driver.findElement(loscamDocket).click();
		BaseWebdriver.driver.findElement(loscamDocket).clear();
		BaseWebdriver.driver.findElement(loscamDocket).sendKeys(pLoscamDocketNo);
		BaseWebdriver.driver.findElement(otherCustomer).click();
		BaseWebdriver.driver.findElement(otherCustomer).clear();
		BaseWebdriver.driver.findElement(otherCustomer).sendKeys(pOtherCostomer);
		BaseWebdriver.driver.findElement(chepOtherExchange).click();
		BaseWebdriver.driver.findElement(chepOtherExchange).clear();
		BaseWebdriver.driver.findElement(chepOtherExchange).sendKeys(pChepOtherExchange);
		BaseWebdriver.driver.findElement(chepOtherTransfer).click();
		BaseWebdriver.driver.findElement(chepOtherTransfer).clear();
		BaseWebdriver.driver.findElement(chepOtherTransfer).sendKeys(pChepOtherTransferToToll);
		BaseWebdriver.driver.findElement(chepOtherCustomer).click();
		BaseWebdriver.driver.findElement(chepOtherCustomer).clear();
		BaseWebdriver.driver.findElement(chepOtherCustomer).sendKeys(pchepOtherDocketNo);
		BaseWebdriver.driver.findElement(loscamOtherExchange).click();
		BaseWebdriver.driver.findElement(loscamOtherExchange).clear();
		BaseWebdriver.driver.findElement(loscamOtherExchange).sendKeys(pLoscamOtherExchange);
		BaseWebdriver.driver.findElement(loscamOtherTransfer).click();
		BaseWebdriver.driver.findElement(loscamOtherTransfer).clear();
		BaseWebdriver.driver.findElement(loscamOtherTransfer).sendKeys(pLoscamOtherTransferToToll);
		BaseWebdriver.driver.findElement(loscamOtherDocket).click();
		BaseWebdriver.driver.findElement(loscamOtherDocket).clear();
		BaseWebdriver.driver.findElement(loscamOtherDocket).sendKeys(pLoscamOtherDocketNo);
	
	}
	
	public static void EnterPurchaseOrder(String pPurchaseOrder) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(purchaseorderTextField).click();
		BaseWebdriver.driver.findElement(purchaseorderTextField).clear();
		BaseWebdriver.driver.findElement(purchaseorderTextField).sendKeys(pPurchaseOrder);
		
	}
	
	public static void SelectAuthorityToLeaveYes() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(authorityToLeaveNoBtn).click();
		
	}
	
	public static void SelectFoodPackagingYes() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(foodPackagingNOBtn).click();
		
	}
	
	public static void SelectTollExtraYes() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(tollExtraSrviceNOBtn).click();
		
	}
	
	public static void EnterTollExtraSrviceAmount(String pTollExtraSrviceAmount) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(tollExtraSrviceAmount).click();
		BaseWebdriver.driver.findElement(tollExtraSrviceAmount).clear();
		BaseWebdriver.driver.findElement(tollExtraSrviceAmount).sendKeys(pTollExtraSrviceAmount);
		
	}
	
	public static void ClickReviewCreateShipment() {
		BaseWebdriver.driver.findElement(reviewCreateShipmentBtn).click();

	}
	
	public static void VerifyDGContactName(String pContactName) {
		assertEquals(pContactName, BaseWebdriver.driver.findElement(dgContactName).getAttribute("value"));

	}
	
	public static void VerifyDGContactNumber(String pContactNumber) {
		assertEquals(pContactNumber, BaseWebdriver.driver.findElement(dgContactNumber).getAttribute("value"));

	}
	
	public static void EnterSenderEmail(String pSenderEmail) {
		//assertEquals(pSenderEmail, BaseWebdriver.driver.findElement(senderEmail).getAttribute("value"));
		BaseWebdriver.driver.findElement(senderEmail).sendKeys(pSenderEmail);
	}
	
	public static void EnterReceiverEmail(String pReceiverEmail) {
		//assertEquals(pReceiverEmail, BaseWebdriver.driver.findElement(receiverEmail).getAttribute("value"));
		BaseWebdriver.driver.findElement(receiverEmail).sendKeys(pReceiverEmail);
	}

}
