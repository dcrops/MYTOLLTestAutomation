package createShipmentActions;

import GlobalActions.PageBase;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

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
	public static By receiverdropdown = By.xpath("//*[@id=\"receiver-selector\"]/label/a/i"); //*[@id="shipment-cons-popup-wrpr"]/div/div/header/h2
	public static By shipmentConsolidatedMSGHeading=By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/header/h2");
	public static By shipmentConsolidatedRadioBtn = By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li[2]/div[1]/div[1]/label");
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
	
	// Add Address
	public static final By SenderAddress_Dropdown = By.xpath("//*[@id=\"sender-selector\"]/label/a/i");
	public static final By SenderAddress_Location_Selected= By.xpath("//*[@id=\"sender-selector\"]/label/input[@name=\"placeholder-location\"]");
	public static final By SenderAddress_Add_Address= By.xpath("//*[@id=\"sender-selector\"]//*//div[@class=\"add-new-elem\"]");
	public static final By New_AddressCompanName= By.id("add-adrr-company-aut");
	public static final By New_AddressSearch= By.id("address-srch");
	public static final By New_AddressSearch_Select= By.xpath("//*[@id=\"address-srch-wrpr\"]/div/ul/li[1]/div");
	public static final By New_AddressSearch_Contine= By.id("addr-continue-autmatic");
	public static final By New_Address_Name = By.id("add-addr-name");
	public static final By New_Address_Number = By.id("add-addr-phone");
	public static final By New_Address_Email = By.id("add-addr-email");
	public static final By New_Address_DGName = By.id("add-addr-dg-contact-name");
	public static final By New_Address_DGNumber = By.id("add-addr-dg-contact-phone");
	public static final By New_Address_Add = By.id("add-address-btn-final");
	public static final By ReceiverAddress_Dropdown = By.xpath("//*[@id=\"receiver-selector\"]/label/a/i");
	public static final By ReceiverAddress_Location_Selected= By.xpath("//*[@id=\"receiver-selector\"]/label/input[@name=\"placeholder-location\"]");
	public static final By ReceiverAddress_Add_Address= By.xpath("//*[@id=\"receiver-selector\"]//*//div[@class=\"add-new-elem\"]");
	
	public static final String SenderAddressCompanyName = "TestSender";
	public static final String SenderAddressCompanyAdd = "60 Collins Street, MELBOURNE VIC 3000";
	public static final String ReceiverAddressCompanyName = "TestReceiver";
	public static final String ReceiverAddressCompanyAdd = "60 Colliery Street, NEATH  NSW  2326";
	
	
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
	
	public static void EnterService(String pService) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(servicedropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li/div[text()='"+pService+"']")).click();

	}

	public static void SelectMode(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(mode).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-selector\"]/div[2]/ul/li[" + i + "]/div")).click();

	}
	
	public static void ClickContinueAccountChangeMsg() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(acceptAccountChangeMSG).click();
			
	}

	public static void SelectTempratureType(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(TempretureTypeDropdown).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"refrigeration-type-selector\"]/div[2]/ul/li[" + i + "]/div")).click();

	}

	public static void SelectWhoPays(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(whoPaysdropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"payer-selector\"]/div/ul/li[" + i + "]/div")).click();

	}

	public static void SelectSender(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(senderdropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[2]/ul/li[" + i + "]/div[2]"))
				.click();

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
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[2]/ul/li[" + i + "]/div[2]"))
				.click();
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
		PageBase.MaximumWaitForElementEnabled();
		
		BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn).click();
		BaseWebdriver.driver.findElement(consolidatedBtn).click();

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
		BaseWebdriver.driver.findElement(shipmentReference1).click();
		BaseWebdriver.driver.findElement(shipmentReference1).clear();
		BaseWebdriver.driver.findElement(shipmentReference1).sendKeys(pShipmentRef1);
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(shipmentReference2).click();
		BaseWebdriver.driver.findElement(shipmentReference2).clear();
		BaseWebdriver.driver.findElement(shipmentReference2).sendKeys(pShipmentRef2);
	}

	public static void SelectDropOffDepot(int i) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(dropoffDepotdropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"drop-off-depot-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click();

	}

	public static void SelectCollectionDepot(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(collectionDepotdropdown).click();
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

	public static void SelectBillingType(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingTypedropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click();

	}

	public static void AddANewLineNZAUS() {

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250);");
		BaseWebdriver.driver.findElement(addNewLine).click();

		BookAPickupActions.EnterItem("Automation Temp2");
		CreateShipmentActions.NumberOfItem("15");
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		CreateShipmentActions.EnterWeight("20");
		//CreateShipmentActions.SelectBillingType(1); if there is one billing type , it is not visible.
		CreateShipmentActions.EnterSenderReference("1234", "5678");

	}
	
	public static void AddANewLineTIPEC() {

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250);");
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
	
	public static void addSenderAdderess(){
		PageBase.waitForElement(senderdropdown, 10);
		PageBase.click(senderdropdown, 10);
		
		
		PageBase.waitForElement(SenderAddress_Add_Address, 10);
		PageBase.click(SenderAddress_Add_Address, 10);
		
		int Number = (int) (Math.random()*10000);
		String newNumber = String.valueOf(Number);
		String NewCompanyName = SenderAddressCompanyName+newNumber;
		PageBase.sendText(New_AddressCompanName, 10, NewCompanyName );
		PageBase.click(New_AddressSearch, 10);
		PageBase.sendText(New_AddressSearch, 10, SenderAddressCompanyAdd);
		PageBase.click(New_AddressSearch_Select, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(New_AddressSearch_Contine, 10);
		PageBase.sendText(New_Address_Name, 10, NewCompanyName);
		PageBase.sendText(New_Address_Number, 10, "0452456876");
		PageBase.sendText(New_Address_Email, 10, "Test@test.com");
		//Verify if DG fields exists
		Boolean DG = PageBase.isElementPresent(New_Address_DGName);
		if (DG == true) {
			PageBase.sendText(New_Address_DGName, 10, "Test	");
			PageBase.sendText(New_Address_DGNumber, 10, "0452567879");
		}
		PageBase.click(New_Address_Add, 10);
		PageBase.MaximumWaitForElementEnabled();
		//Verify Address is Selected
		PageBase.verifyTextExistAttribute(SenderAddress_Location_Selected, NewCompanyName);
		
		String Address = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[1]/div[2]")).getText();
			if (Address.contains(Address)) {
				System.out.println("New Sender Address Exists in Location Feild AS EXPECTED");
			} else {
				System.out.println("FAILED: New Sender Address DOEN NOT Exists in Location Feild");
				Reporter.log("FAILED: New Sender Address DOEN NOT Exists in Location Feild");
				Assert.fail("FAILED: New Sender Address DOEN NOT Exists in Location Feild");
			}
	}
	
	public static void addReceiverAdderess(){
		PageBase.waitForElement(receiverdropdown, 10);
		PageBase.click(receiverdropdown, 10);
		PageBase.waitForElement(ReceiverAddress_Add_Address, 10);
		PageBase.click(ReceiverAddress_Add_Address, 10);
		
		int Number = (int) (Math.random()*10000);
		String newNumber = String.valueOf(Number);
		String NewCompanyName = ReceiverAddressCompanyName+newNumber;
		PageBase.sendText(New_AddressCompanName, 10, NewCompanyName );
		PageBase.click(New_AddressSearch, 10);
		PageBase.sendText(New_AddressSearch, 10, ReceiverAddressCompanyAdd);
		PageBase.click(New_AddressSearch_Select, 10);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(New_AddressSearch_Contine, 10);
		PageBase.sendText(New_Address_Name, 10, NewCompanyName);
		PageBase.sendText(New_Address_Number, 10, "0452456876");
		PageBase.sendText(New_Address_Email, 10, "Test@test.com");
		//Verify if DG fields exists
		Boolean DG = PageBase.isElementPresent(New_Address_DGName);
		if (DG == true) {
			PageBase.sendText(New_Address_DGName, 10, "Test	");
			PageBase.sendText(New_Address_DGNumber, 10, "0452567879");
		}
		PageBase.click(New_Address_Add, 10);
		PageBase.MaximumWaitForElementEnabled();
		//Verify Address is Selected
		PageBase.verifyTextExistAttribute(ReceiverAddress_Location_Selected, NewCompanyName);
		
		String Address = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[1]/div[2]")).getText();
			if (Address.contains(Address)) {
				System.out.println("New Receiver Address Exists in Location Feild AS EXPECTED");
			} else {
				System.out.println("FAILED: New Receiver Address DOEN NOT Exists in Location Feild");
				Reporter.log("FAILED: New Receiver Address DOEN NOT Exists in Location Feild");
				Assert.fail("FAILED: New Receiver Address DOEN NOT Exists in Location Feild");
			}
	}
	
	

}
