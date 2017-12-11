package createShipmentActions;

import GlobalActions.PageBase;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import manifestActions.ManifestActions;
import myTollHomePageActions.MyTollHomePageActions;

public class CreateShipmentActions {

	public static By createShipmentsHeading = By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/header/div/h1");
	public static By shipments = By.id("createShipment");
	public static By servicedropdown = By.xpath("//*[@id=\"service-selector\"]/label/a/i");
	public static By mode = By.xpath("//*[@id=\"mode-selector\"]/div[1]/a/i");
	public static By TempretureTypeDropdown = By.xpath("//*[@id=\"refrigeration-type-selector\"]/div[1]/a/i");
	public static By TempretureTypeTextField = By.name("placeholder-refrigeration-type");
	public static By TempretureFromTextField = By.id("temp-from");
	public static By TempretureToTextField = By.id("temp-to");
	public static By whoPaysdropdown = By.xpath("//*[@id=\"payer-selector\"]/label/a/i");
	public static By senderdropdown = By.xpath("//*[@id=\"sender-selector\"]/label/a/i");
	public static By accountNumber = By.name("account-text");
	public static By receiverdropdown = By.xpath("//*[@id=\"receiver-selector\"]/label/a/i");
	public static By senderTextfield = By.name("placeholder-location");

	public static By receiverTextfield = By.xpath("//*[@id=\"receiver-selector\"]/label/input[2]");
	public static By shipmentConsolidatedMSGHeading = By
			.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/header/h2"); //By.cssSelector("[name='R001000'][id='R001000.2'][type='radio']");
	public static By shipmentConsolidatedRadioBtn = By.name("shipmentcon"); //.cssSelector("[name='shipmentcon'][id='shipitemcheck0'][type='radio']"); //.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li[2]/div[1]/div[1]/label"); //.id("shipitemcheck0");//*[@id="shipitemcheck0"] //.name("shipmentcon"); //*[@id="shipitemcheck0"]// .xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li[2]/div[1]/div[1]/label"); //.id("shipitemcheck0"); id("shipitemcheck0");
	public static By shipmentConsolidatedArrowdown = By
			.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li[2]/div[1]/div[7]");
	public static By shipmentConsolidatedContinue = By
			.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/footer/a[1]");
	public static By shipmentConsolidatedBtn = By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]//a[text()='Consolidate']"); //*[@id="shipment-cons-popup-wrpr"]/div/div/footer/a[2]
	public static By dgContactName = By.id("sh-dg-contact-name");
	public static By dgContactNumber = By.name("dg-contact-num");
	public static By quoteNumber = By.id("quote_num");
	public static By shipmentReference1 = By.name("reference-1");
	public static By shipmentReference2 = By.name("reference-2");
	public static By dropoffDepotdropdown = By.xpath("//*[@id=\"drop-off-depot-selector\"]/div[1]/a/i");
	public static By dropoffDepotTextField = By.name("placeholder-drop-off-depot");
	public static By collectionDepotdropdown = By.xpath("//*[@id=\"collection-depot-selector\"]/div[1]/a/i");
	public static By collectionDepotTextField = By.name("placeholder-collection-depot");
	public static By billingTypedropdown = By.xpath("//*[@id=\"billing-type-selector\"]/div[1]/a/i");
	public static By notifySenderCheckBox = By.id("notify-sender");
	public static By notifyReceiverCheckBox = By.id("notify-receiver");
	public static By senderEmail = By.id("sender-email");
	public static By receiverEmail = By.id("receiver-email");
	public static By senderReference = By.id("sender-reference");
	public static By receiverReference = By.id("reciever-reference");
	public static By numberOfItem = By.id("quantity");
	public static By itemType = By.xpath("//*[@id=\"outr-pkg-selector\"]/div[1]/a");
	public static By itemTypeTextField = By.xpath("//*[@id=\"billing-type-selector\"]/div[1]/input[2]");
	public static By numberOfGarments = By.id("garmentsCount");
	public static By weight = By.id("weight");
	public static By UNNumberDropdown = By.xpath("//*[@id=\"un-code-selector\"]/label/a/i");
	public static By UNNumberTextField = By.xpath("//*[@id=\"un-code-selector\"]/div/div/div/input");
	public static By lookupBtn = By.xpath("//*[@id=\"un-code-selector\"]/div/div/div/a");
	public static By searchBtn = By.xpath("//*[@id=\"un-code-selector-\"]/div/div/div/span/i");
	public static By UNNumberItem = By.xpath("//*[@id=\"un-code-selector-0\"]/label/input[2]");
	public static By classDivision = By.id("class-division-0");
	public static By packingGroup = By.xpath("//*[@id=\"packaging-grp-selector-0\"]/label/input[2]");
	public static By subRisk = By.xpath("//*[@id=\"sub-risk-selector-0\"]/label/input[2]");
	public static By properShippingName = By.id("shipping-name-0");
	public static By packingGroupDropdown = By.xpath("//*[@id=\"packaging-grp-selector\"]/label/a/i");
	public static By packingGroupItem = By.xpath("//*[@id=\"packaging-grp-selector\"]/div/ul/li[1]/div");
	public static By dgPackagingDescription = By.id("packing-description");
	public static By dgPkgQty = By.id("dg-pkg-qty");
	public static By dgQtyKg = By.id("dg-qty");
	public static By technicalName = By.id("technical-name");
	public static By lineItem1Arrowdown = By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[8]/a/i");
	public static By dangerousGoodsArrowdown = By.xpath("//*[@id=\"dg-line--0\"]/div[1]/div[8]/a/i");
	public static By addNewLine = By.id("add-line-item");;
	public static By addPalletYes = By.xpath("//*[@id=\"steps-3\"]/div[1]/div/div/div/label/span[2]"); // .xpath("//*label[text()='addPallet')]/span/span[class()='switch-handle']");//("//*[@id=\"addPallet\"]/span/span");//*label[contains(text(),
																										// Add pallet
																										// transactions?)]//[@id="addPallet"]/span/span
	public static By addPalletNo = By.id("addPallet");
	public static By chepCustomer = By.id("chepCustomer");
	public static By chepExchange = By.id("chepExchange");
	public static By chepTransfer = By.id("chepTransfer");
	public static By chepDocket = By.id("chepDocket");
	public static By loscamCustomer = By.id("loscamCustomer");
	public static By loscamExchange = By.id("loscamExchange");
	public static By loscamTransfer = By.id("loscamTransfer");
	public static By loscamDocket = By.id("loscamDocket");
	public static By otherCustomer = By.id("otherCustomer");
	public static By chepOtherExchange = By.id("chepOtherExchange");
	public static By chepOtherTransfer = By.id("chepOtherTransfer");
	public static By chepOtherCustomer = By.id("chepOtherCustomer");
	public static By loscamOtherExchange = By.id("loscamOtherExchange");
	public static By loscamOtherTransfer = By.id("loscamOtherTransfer");
	public static By loscamOtherDocket = By.id("loscamOtherCustomer");
	public static By purchaseorderTextField = By.id("purchase-order");
	public static By addPurchaseOrderBtn = By.xpath("//*[@id=\"add-po\"]/i");
	public static By tollExtraSrviceNOBtn = By.id("toll-extra-service-check");
	public static By foodPackagingNOBtn = By.xpath("//*[@id=\"steps-3\"]/div[8]/div[1]/div/label/span[2]"); // .xpath("//*[@id=\"food-items-check\"]/span/span");//*[@id="steps-3"]/div[8]/div[1]/div/label/span[2]
	public static By authorityToLeaveNoBtn = By.xpath("//*[@id=\"steps-3\"]/div[5]/div/div[2]/label/span[2]");
	public static By tollExtraSrviceAmount = By.id("toll-extra-service");
	public static By reviewCreateShipmentBtn = By.id("create-shipment-btn");

	public static By acceptAccountChangeMSG = By.id("confirm-true");

	// Add Address
	public static final By SenderAddress_Dropdown = By.xpath("//*[@id=\"sender-selector\"]/label/a/i");
	public static final By SenderAddress_Location_Selected = By
			.xpath("//*[@id=\"sender-selector\"]/label/input[@name=\"placeholder-location\"]");
	public static final By SenderAddress_Add_Address = By
			.xpath("//*[@id=\"sender-selector\"]//*//div[@class=\"add-new-elem\"]");
	public static final By New_AddressCompanName = By.id("add-adrr-company-aut");
	public static final By New_AddressSearch = By.id("address-srch");
	public static final By New_AddressSearch_Select = By.xpath("//*[@id=\"address-srch-wrpr\"]/div/ul/li[1]/div");
	public static final By New_AddressSearch_Contine = By.id("addr-continue-autmatic");
	public static final By New_Address_Name = By.id("add-addr-name");
	public static final By New_Address_Number = By.id("add-addr-phone");
	public static final By New_Address_Email = By.id("add-addr-email");
	public static final By New_Address_DGName = By.id("add-addr-dg-contact-name");
	public static final By New_Address_DGNumber = By.id("add-addr-dg-contact-phone");
	public static final By New_Address_Add = By.id("add-address-btn-final");
	public static final By ReceiverAddress_Dropdown = By.xpath("//*[@id=\"receiver-selector\"]/label/a/i");
	public static final By ReceiverAddress_Location_Selected = By
			.xpath("//*[@id=\"receiver-selector\"]/label/input[@name=\"placeholder-location\"]");
	public static final By ReceiverAddress_Add_Address = By
			.xpath("//*[@id=\"receiver-selector\"]//*//div[@class=\"add-new-elem\"]");

	public static final String SenderAddressCompanyName = "TestSender";
	public static final String SenderAddressCompanyAdd = "60 Collins Street, MELBOURNE VIC 3000";
	public static final String ReceiverAddressCompanyName = "TestReceiver";
	public static final String ReceiverAddressCompanyAdd = "60 Colliery Street, NEATH  NSW  2326";
	public static String newSenderCompanyName;
	public static String newReceiverCompanyName;

	public static void ClickShipment() {
		BaseWebdriver.driver.findElement(shipments).click();

	}

	public static void SelectTollCarrierItem(int j) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"BU-selector\"]/label/a/i")).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"BU-selector\"]/div/ul/li[" + j + "]/div")).click();

	}

	public static String GetCreateShipmentHeading() {
		PageBase.MaximumWaitForElementEnabled();
		String CreateShipmentsHeading = BaseWebdriver.driver.findElement(createShipmentsHeading).getText();
		return CreateShipmentsHeading;

	}

	public static void SelectService(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(servicedropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li[" + i + "]/div")).click();

	}

	/*
	 * public static void EnterService(String pService) {
	 * PageBase.MaximumWaitForElementEnabled();
	 * BaseWebdriver.driver.findElement(servicedropdown).click();
	 * BaseWebdriver.driver.findElement(By.
	 * xpath("//*[@id=\"service-selector\"]/div/ul/li[text()='\"+pService +\"']/div"
	 * )).click();
	 * 
	 * }
	 */

	public static void EnterService(String pService) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(servicedropdown).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li/div[text()='" + pService + "']"))
				.click();

	}

	public static void SelectMode(int i) {
		PageBase.MinimumWaitForElementEnabled_1();
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
				.findElement(By.xpath("//*[@id=\"refrigeration-type-selector\"]/div[2]/ul/li[\" + i + \"]/div"))
				.click();

	}

	public static String GetTempratureType() {
		PageBase.MaximumWaitForElementEnabled();
		return BaseWebdriver.driver.findElement(TempretureTypeTextField).getAttribute("value");

	}

	public static String GetTempratureFrom() {
		PageBase.MaximumWaitForElementEnabled();
		return BaseWebdriver.driver.findElement(TempretureFromTextField).getAttribute("value");

	}

	public static String GetTempratureTo() {
		PageBase.MaximumWaitForElementEnabled();
		return BaseWebdriver.driver.findElement(TempretureToTextField).getAttribute("value");

	}

	public static void SelectWhoPays(int i) {
		PageBase.MinimumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(whoPaysdropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"payer-selector\"]/div/ul/li[" + i + "]/div")).click();

	}

	public static void SelectSender(int i) {
		PageBase.MediumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(senderdropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[2]/ul/li[" + i + "]/div[2]"))
				.click();
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void EnterSender(String pSender, String pSenderItem) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(senderTextfield).click();
		BaseWebdriver.driver.findElement(senderTextfield).clear();
		BaseWebdriver.driver.findElement(senderTextfield).sendKeys(pSender);
		PageBase.Scrollbar(500, 800);
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[2]/ul/li/div[text()=" + pSenderItem + "]"))
				.click();
		PageBase.MaximumWaitForElementEnabled();

	}

	public static String GetSenderCompanyName() {
		PageBase.MinimumWaitForElementEnabled();

		String vSender = BaseWebdriver.driver.findElement(senderTextfield).getAttribute("value");
		return vSender;

	}

	public static String GetSenderLocation() {
		PageBase.MinimumWaitForElementEnabled();
		String vSenderLocationLine1 = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[1]/div[2]")).getText();
		String vSenderLocationLine2 = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[1]/div[3]")).getText();
		System.out.println(vSenderLocationLine1);
		System.out.println(vSenderLocationLine2);
		String SenderLocation = vSenderLocationLine1 + " " + vSenderLocationLine2;
		return SenderLocation;

	}

	public static void EnterAccountNumber(String pAccountNumber) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(accountNumber).click();
		BaseWebdriver.driver.findElement(accountNumber).clear();
		BaseWebdriver.driver.findElement(accountNumber).sendKeys(pAccountNumber);

	}

	public static void SelectReceiver(int i) {
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(receiverdropdown).click();
		PageBase.Scrollbar(500, 800);
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[2]/ul/li[" + i + "]/div[2]"))
				.click();
		PageBase.MaximumWaitForElementEnabled_1();

	}

	public static void EnterReceiver(String Receiver, String pReceiver) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(receiverTextfield).click();
		BaseWebdriver.driver.findElement(receiverTextfield).clear();
		BaseWebdriver.driver.findElement(receiverTextfield).sendKeys(Receiver);
		PageBase.Scrollbar(500, 800);
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[2]/ul/li/div[text()='" + pReceiver + "']"))
				.click();

		PageBase.MaximumWaitForElementEnabled();

	}

	public static String GetRecieverCompanyName() {
		PageBase.MinimumWaitForElementEnabled();

		String vSender = BaseWebdriver.driver.findElement(receiverTextfield).getAttribute("value");
		return vSender;

	}

	public static String GetReceiverLocation() {
		PageBase.MinimumWaitForElementEnabled();
		String ReceiverLocationLine1 = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[1]/div[2]")).getText();
		String ReceiverLocationLine2 = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[1]/div[3]")).getText();
		System.out.println(ReceiverLocationLine1);
		System.out.println(ReceiverLocationLine2);
		String ReceiverLocation = ReceiverLocationLine1 + " " + ReceiverLocationLine2;
		return ReceiverLocation;

	}

	public static void SelectShipmentConsolidationConsolidate() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
	try {
		boolean results=BaseWebdriver.driver.findElement(shipmentConsolidatedMSGHeading).isDisplayed();
		System.out.println("shipmentConsolidatedMSGHeading");
		BaseWebdriver.driver.findElement(shipmentConsolidatedBtn).click();
		System.out.println("click shipmentConsolidatedBtn");
		if (results==true) {
			boolean results2=BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn).isDisplayed();
			System.out.println("results2"+results2);
			Actions action = new Actions(BaseWebdriver.driver);
			  action.doubleClick(BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn));
			  action.perform();
			  System.out.println("shipmentConsolidatedRadioBtn doubleclicked ");
			  BaseWebdriver.driver.findElement(shipmentConsolidatedBtn).click();
			  PageBase.MaximumWaitForElementEnabled();
			SelectNotifySenderAndReceiver();
			PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
					CreateShipmentActions.notifyReceiverCheckBox);
			
		}
	}
	
	catch(Exception ex)
	{
		System.out.println(ex);
		SelectNotifySenderAndReceiver();
	}

		/*
		 * String myWindowHandle = BaseWebdriver.driver.getWindowHandle();
		 * BaseWebdriver.driver.switchTo().window(myWindowHandle); //
		 * BaseWebdriver.driver.findElement(By.xpath(
		 * "//*[@id=\"shipment-cons-popup-wrpr\"]/div/div")).click();
		 * BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn).click();
		 * BaseWebdriver.driver.findElement(consolidatedBtn).click();//*[@id=
		 * "shipment-cons-popup-wrpr"]/div/div/footer/a[1]
		 */

	}

	public static void SelectShipmentConsolidationContinue() {
		try {
			PageBase.MaximumWaitForElementEnabled();
			Boolean results = BaseWebdriver.driver.findElement(shipmentConsolidatedContinue).isDisplayed();
			if (results = true) {
				BaseWebdriver.driver.findElement(shipmentConsolidatedContinue).click();
				PageBase.MaximumWaitForElementEnabled();
				SelectNotifySenderAndReceiver();
				PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
						CreateShipmentActions.notifyReceiverCheckBox);

			}
		}

		catch (Exception ex) {
			System.out.println(ex);
			SelectNotifySenderAndReceiver();
		}
	}

	public static void EnterDGContactDetails(String pDGContactName, String pDGContactNumber) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(dgContactName).click();
		String dgContactname = BaseWebdriver.driver.findElement(dgContactName).getAttribute("value");
		System.out.println("DG contact name" + dgContactname);
		if (dgContactname.equals(null)
				&& (BaseWebdriver.driver.findElement(dgContactNumber).getAttribute("value").equals(null))) {
			System.out.println("DG contact null");
			BaseWebdriver.driver.findElement(dgContactName).sendKeys(pDGContactName);
			System.out.println("dgContactName entered");
			PageBase.MinimumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(dgContactNumber).click();
			System.out.println("dgContactNumber click");
			System.out.println("dgContactNumber null");
			BaseWebdriver.driver.findElement(dgContactNumber).sendKeys(pDGContactNumber);
			System.out.println("dgContactNumber enter");
		} else {
			PageBase.MoveToElement(CreateShipmentActions.SenderAddress_Dropdown,
					CreateShipmentActions.SenderAddress_Dropdown);
		}

	}

	public static void EnterQuoteNumber(String pQuoteNumber) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(quoteNumber).click();
		BaseWebdriver.driver.findElement(quoteNumber).clear();
		BaseWebdriver.driver.findElement(quoteNumber).sendKeys(pQuoteNumber);

	}

	public static void SelectNotifySenderAndReceiver() {
		PageBase.MinimumWaitForElementEnabled();
			
		
		try {
			
			BaseWebdriver.driver.findElement(notifySenderCheckBox).click();

			PageBase.MinimumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(notifyReceiverCheckBox).click();

		} catch (Exception ex) {
			PageBase.MoveToElement(CreateShipmentActions.quoteNumber, CreateShipmentActions.accountNumber);
		}
		

	}

	public static void EnterShipmentReferences(String pShipmentRef1, String pShipmentRef2) {
		PageBase.MinimumWaitForElementEnabled();

		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
		BaseWebdriver.driver.findElement(shipmentReference1).click();
		BaseWebdriver.driver.findElement(shipmentReference1).clear();
		BaseWebdriver.driver.findElement(shipmentReference1).sendKeys(pShipmentRef1);
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(shipmentReference2).click();
		BaseWebdriver.driver.findElement(shipmentReference2).clear();
		BaseWebdriver.driver.findElement(shipmentReference2).sendKeys(pShipmentRef2);

	}

	public static void EnterShipmentReference1(String pShipmentRef1) {
		PageBase.MinimumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(shipmentReference1).click();
		BaseWebdriver.driver.findElement(shipmentReference1).clear();
		BaseWebdriver.driver.findElement(shipmentReference1).sendKeys(pShipmentRef1);

	}

	public static void SelectDropOffDepot(int i) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.MoveToElement(CreateShipmentActions.dropoffDepotdropdown, CreateShipmentActions.notifySenderCheckBox);
		BaseWebdriver.driver.findElement(dropoffDepotdropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"drop-off-depot-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click();
		PageBase.MinimumWaitForElementEnabled();
	}

	public static void EnterDropOffDepot(String pDropOffDepot) {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference1);
		BaseWebdriver.driver.findElement(dropoffDepotTextField).click();
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver
				.findElement(By
						.xpath("//*[@id=\"drop-off-depot-selector\"]/div[2]/ul/li/div[text()='" + pDropOffDepot + "']"))
				.click();
		PageBase.MinimumWaitForElementEnabled();
	}

	public static void SelectCollectionDepot(int i) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(collectionDepotdropdown).click();
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"collection-depot-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click();

	}

	public static void EnterCollectionDepot(String pCollectionDepotdropdown) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(collectionDepotTextField).click();
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath(
				"//*[@id=\"collection-depot-selector\"]/div[2]/ul/li/div[text()='" + pCollectionDepotdropdown + "']"))
				.click();

	}

	public static void NumberOfItem(String pnumberOfItem) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(numberOfItem).click();
		BaseWebdriver.driver.findElement(numberOfItem).clear();
		BaseWebdriver.driver.findElement(numberOfItem).sendKeys(pnumberOfItem);

	}

	public static void ItemType(int j) {
		PageBase.MediumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemTypeTextField).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li[" + j + "]/div"))
				.click();

	}

	public static void NumberOfGarments(String pNumberOfGarments) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(numberOfGarments).click();
		BaseWebdriver.driver.findElement(numberOfGarments).clear();
		BaseWebdriver.driver.findElement(numberOfGarments).sendKeys(pNumberOfGarments);
	}

	public static void EnterWeight(String pweight) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(weight).click();
		BaseWebdriver.driver.findElement(weight).clear();
		BaseWebdriver.driver.findElement(weight).sendKeys(pweight);

	}

	public static void EnterSenderReference(String pSenderReference, String pReceiverReference) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(senderReference).click();
		BaseWebdriver.driver.findElement(senderReference).clear();
		BaseWebdriver.driver.findElement(senderReference).sendKeys(pSenderReference);
		BaseWebdriver.driver.findElement(receiverReference).click();
		BaseWebdriver.driver.findElement(receiverReference).clear();
		BaseWebdriver.driver.findElement(receiverReference).sendKeys(pReceiverReference);

	}

	public static void EnterBillingType(String pBillingType) {

		try {
			PageBase.MoveToElement(BookAPickupActions.itemDescriptionDropdown,
					CreateShipmentActions.shipmentReference1);
			Boolean results = BaseWebdriver.driver.findElement(billingTypedropdown).isDisplayed();
			System.out.println("Billing type displayed");
			if (results = true) {
				BaseWebdriver.driver.findElement(billingTypedropdown).click();
				PageBase.MinimumWaitForElementEnabled();
				BaseWebdriver.driver
						.findElement(By.xpath(
								"//*[@id=\"billing-type-selector\"]/div[2]/ul/li/div[text()='" + pBillingType + "']"))
						.click();
			}
		} catch (Exception ex) {
			PageBase.MoveToElement(BookAPickupActions.itemDescriptionDropdown,
					CreateShipmentActions.shipmentReference1);
		}

	}

	public static void SelectBillingType(int i) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingTypedropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click();

	}

	public static void EnterDangerousGoodsDetails(int j, String lookupItem, String packageDescription, String pDgPkgQty,
			String pDgQtyKg) {

		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(UNNumberDropdown).click();
		BaseWebdriver.driver.findElement(UNNumberTextField).sendKeys(lookupItem);
		BaseWebdriver.driver.findElement(searchBtn).click();
		PageBase.MaximumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"un-code-selector\"]/div/ul/li[" + j + "]/div")).click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(dgPackagingDescription).sendKeys(packageDescription);
		BaseWebdriver.driver.findElement(dgPkgQty).sendKeys(pDgPkgQty);
		BaseWebdriver.driver.findElement(dgQtyKg).sendKeys(pDgQtyKg);

	}

	public static String GetUNNumber() {
		PageBase.MediumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(dangerousGoodsArrowdown).click();
		return BaseWebdriver.driver.findElement(UNNumberItem).getAttribute("value").toString();

	}

	public static String GetClassDivision() {

		return BaseWebdriver.driver.findElement(classDivision).getAttribute("value").toString();

	}

	public static String GetSubRisk() {

		return BaseWebdriver.driver.findElement(subRisk).getAttribute("value").toString();

	}

	public static String GetPackingGroup() {

		return BaseWebdriver.driver.findElement(packingGroup).getAttribute("value").toString();

	}

	public static String GetProperShippingName() {

		return BaseWebdriver.driver.findElement(properShippingName).getAttribute("value").toString();

	}

	public static void SelectPackgingGroup(Integer packagingGroup) {

		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(packingGroupDropdown).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"packaging-grp-selector\"]/div/ul/li[" + packagingGroup + "]/div"))
				.click();

	}

	public static void EnterPackgingGroup(Integer packagingGroup) {
		// BookAPickupActions.SelectUNNumber(j,lookupItem);

		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(packingGroupDropdown).click();
		BaseWebdriver.driver
				.findElement(
						By.xpath("//*[@id=\"packaging-grp-selector\"]/div/ul/li/div[text()='" + packagingGroup + "']"))
				.click();

	}

	public static void EnterTechnicalName(String pTechnicalName) {
		PageBase.MaximumWaitForElementEnabled();
		try {
			BaseWebdriver.driver.findElement(technicalName).click();
			BaseWebdriver.driver.findElement(technicalName).clear();
			BaseWebdriver.driver.findElement(technicalName).sendKeys(pTechnicalName);
		} catch (Exception ex) {
			BookAPickupActions.EnterTechnicalName(pTechnicalName);
		}
	}

	public static void EnterTollCarrierItem(String pTollCarrierName) {// *[@id="BU-selector"]/label/a/i String
																		// pDropdownSelector, String pTollCarrierName
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id='BU-selector']/label/a/i")).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//div[@id='BU-selector']/div/ul/li/div[text()='" + pTollCarrierName + "']"))
				.click();

	}

	public static void AddANewLineNZAUS(Integer coord1, Integer coord2, String ItemTemplate2, String BillingType,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String ShipmentRef1,
			String ShipmentRef2) {
		// PageBase.Scrollbar(coord1,coord2);
		PageBase.Scrollbar(200, 500);
		BaseWebdriver.driver.findElement(addNewLine).click();

		// PageBase.MoveToElement(BookAPickupActions.itemDescriptionTextField,CreateShipmentActions.numberOfItem);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(BookAPickupActions.itemDescriptionTextField).click();
		BookAPickupActions.EnterItem(ItemTemplate2);
		CreateShipmentActions.EnterBillingType(BillingType);
		PageBase.MoveToElement(BookAPickupActions.itemDescriptionDropdown, CreateShipmentActions.shipmentReference1);
		// BaseWebdriver.driver.findElement(BookAPickupActions.itemDescriptionDropdown).click();
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		// CreateShipmentActions.SelectBillingType(1); if there is one billing type , it
		// is not visible.
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);

	}

	public static void AddANewLineNZAUS() {
		PageBase.Scrollbar(500, 800);
		BaseWebdriver.driver.findElement(addNewLine).click();

		BookAPickupActions.EnterItem("Automation Temp2");
		CreateShipmentActions.NumberOfItem("15");
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		CreateShipmentActions.EnterWeight("20");
		// CreateShipmentActions.SelectBillingType(1); if there is one billing type , it
		// is not visible.
		CreateShipmentActions.EnterSenderReference("1234", "5678");

	}

	public static void AddANewLineTIPEC(String ItemTemplate, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String Ref1, String Ref2) {

		PageBase.Scrollbar(500, 1200);
		BaseWebdriver.driver.findElement(addNewLine).click();

		BookAPickupActions.EnterItem(ItemTemplate);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);

		CreateShipmentActions.EnterSenderReference(Ref1, Ref2);

	}

	public static void SelectPalletTransactionsYes() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(addPalletYes).click();

	}

	public static void SelectPalletTransactionsNo() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(addPalletNo).click();

	}

	public static void EnterPalletTransActionInformations(String pChepCustomer, String pChepExchange,
			String pChepTansferToToll, String pChepDocketNo, String pLoscamCustomer, String pLoascamExchange,
			String pLoscamTransferToToll, String pLoscamDocketNo, String pOtherCostomer, String pChepOtherExchange,
			String pChepOtherTransferToToll, String pchepOtherDocketNo, String pLoscamOtherExchange,
			String pLoscamOtherTransferToToll, String pLoscamOtherDocketNo) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MoveToElement(CreateShipmentActions.chepCustomer, CreateShipmentActions.loscamCustomer);
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
		// BaseWebdriver.driver.findElement(chepOtherExchange).click();
		// BaseWebdriver.driver.findElement(chepOtherExchange).clear();
		// BaseWebdriver.driver.findElement(chepOtherExchange).sendKeys(pChepOtherExchange);
		// BaseWebdriver.driver.findElement(chepOtherTransfer).click();
		/*
		 * BaseWebdriver.driver.findElement(chepOtherTransfer).clear();
		 * BaseWebdriver.driver.findElement(chepOtherTransfer).sendKeys(
		 * pChepOtherTransferToToll);
		 * BaseWebdriver.driver.findElement(chepOtherCustomer).click();
		 * BaseWebdriver.driver.findElement(chepOtherCustomer).clear();
		 * BaseWebdriver.driver.findElement(chepOtherCustomer).sendKeys(
		 * pchepOtherDocketNo);
		 */
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
		BaseWebdriver.driver.findElement(addPurchaseOrderBtn).click();
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

	public static void EnterTollExtraServiceAmount(String pTollExtraSrviceAmount) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(tollExtraSrviceNOBtn).click();
		BaseWebdriver.driver.findElement(tollExtraSrviceAmount).click();
		BaseWebdriver.driver.findElement(tollExtraSrviceAmount).clear();
		BaseWebdriver.driver.findElement(tollExtraSrviceAmount).sendKeys(pTollExtraSrviceAmount);

	}

	public static void EnterTollExtraSrviceAmount(String pTollExtraSrviceAmount) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(tollExtraSrviceAmount).click();
		BaseWebdriver.driver.findElement(tollExtraSrviceAmount).clear();
		BaseWebdriver.driver.findElement(tollExtraSrviceAmount).sendKeys(pTollExtraSrviceAmount);

	}
	
	

	public static void ClickReviewCreateShipment() {

		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.specialInstructions);
		BaseWebdriver.driver.findElement(reviewCreateShipmentBtn).click();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		CloseManifestScreenGoToShipmentView();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		
	}
	
	public static void ClickReviewCreateShipmentAndGoToManifestScreen() {

		PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.specialInstructions);
		BaseWebdriver.driver.findElement(reviewCreateShipmentBtn).click();
		PageBase.MaximumWaitForElementEnabled();
		
		
	}
	
	public static void CloseManifestScreenGoToShipmentView() {

		PageBase.MaximumWaitForElementEnabled();
	try {
		boolean results=true;
		results=BaseWebdriver.driver.findElement(ManifestActions.AddToManifestTtile).isDisplayed();
		if (results==true)
		{
			ManifestActions.AddToExistingManifestSubmittingCreateshipment("newManifest123"+(new Date()).getTime());
		//ManifestActions.MoveToManifestAndCreateNewManifest("newManifest123");
			
		}
	}
	
	catch(Exception ex)
	{
		System.out.println(ex);
	}
		
	}
	
	

	public static void VerifyDGContactName(String pContactName) {
		assertEquals(pContactName, BaseWebdriver.driver.findElement(dgContactName).getAttribute("value"));

	}

	public static void VerifyDGContactNumber(String pContactNumber) {
		assertEquals(pContactNumber, BaseWebdriver.driver.findElement(dgContactNumber).getAttribute("value"));

	}

	public static void EnterSenderEmail(String pSenderEmail) {
		
		PageBase.MinimumWaitForElementEnabled();
		boolean resultsNotifySenderCheckBox=BaseWebdriver.driver.findElement(notifySenderCheckBox).isSelected();
		System.out.println("resultsNotifySenderCheckBox"+ resultsNotifySenderCheckBox);
		
		if (resultsNotifySenderCheckBox==false) {
			PageBase.MinimumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(notifySenderCheckBox).click();
			System.out.println("resultsNotifySenderCheckBox clicked");
			PageBase.MinimumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(senderEmail).click();
		}
		else
		{
			BaseWebdriver.driver.findElement(senderEmail).click();
		}
		
		BaseWebdriver.driver.findElement(senderEmail).clear();
		BaseWebdriver.driver.findElement(senderEmail).sendKeys(pSenderEmail);
	}

	public static void EnterReceiverEmail(String pReceiverEmail) {

		PageBase.MinimumWaitForElementEnabled();
		boolean resultsReceiverCheckBox=BaseWebdriver.driver.findElement(notifyReceiverCheckBox).isSelected();
		System.out.println("resultsReceiverCheckBox"+ resultsReceiverCheckBox);
		PageBase.MinimumWaitForElementEnabled();
		if (resultsReceiverCheckBox==true) {
			PageBase.MinimumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(receiverEmail).click();
			BaseWebdriver.driver.findElement(receiverEmail).clear();
			BaseWebdriver.driver.findElement(receiverEmail).sendKeys(pReceiverEmail);
			PageBase.MinimumWaitForElementEnabled();
		}
		else
		{
			PageBase.MinimumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(notifyReceiverCheckBox).click();
			System.out.println("resultsReceiverCheckBox  clicked");
			PageBase.MinimumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(receiverEmail).click();
			BaseWebdriver.driver.findElement(receiverEmail).clear();
			BaseWebdriver.driver.findElement(receiverEmail).sendKeys(pReceiverEmail);
		}
		
	
	}

	public static void addSenderAdderess() {
		PageBase.waitForElement(senderdropdown, 10);
		PageBase.click(senderdropdown, 10);

		PageBase.waitForElement(SenderAddress_Add_Address, 10);
		PageBase.click(SenderAddress_Add_Address, 10);

		int Number = (int) (Math.random() * 10000);
		String newNumber = String.valueOf(Number);
		newSenderCompanyName = SenderAddressCompanyName + newNumber;
		PageBase.sendText(New_AddressCompanName, 10, newSenderCompanyName);
		PageBase.click(New_AddressSearch, 10);
		PageBase.sendText(New_AddressSearch, 10, SenderAddressCompanyAdd);
		PageBase.click(New_AddressSearch_Select, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(New_AddressSearch_Contine, 10);
		PageBase.sendText(New_Address_Name, 10, newSenderCompanyName);
		PageBase.sendText(New_Address_Number, 10, "0452456876");
		PageBase.sendText(New_Address_Email, 10, "Test@test.com");
		// Verify if DG fields exists
		Boolean DG = PageBase.isElementPresent(New_Address_DGName);
		if (DG == true) {
			PageBase.sendText(New_Address_DGName, 10, "Test	");
			PageBase.sendText(New_Address_DGNumber, 10, "0452567879");
		}
		PageBase.click(New_Address_Add, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		// Verify Address is Selected
		PageBase.verifyTextExistAttribute(SenderAddress_Location_Selected, newSenderCompanyName);

		String Address = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[1]/div[2]"))
				.getText();
		if (Address.contains(Address)) {
			System.out.println("New Sender Address Exists in Location Feild AS EXPECTED");
		} else {
			System.out.println("FAILED: New Sender Address DOEN NOT Exists in Location Feild");
			Reporter.log("FAILED: New Sender Address DOEN NOT Exists in Location Feild");
			Assert.fail("FAILED: New Sender Address DOEN NOT Exists in Location Feild");
		}
	}

	public static void addReceiverAdderess() {
		PageBase.waitForElement(receiverdropdown, 10);
		PageBase.click(receiverdropdown, 10);
		PageBase.waitForElement(ReceiverAddress_Add_Address, 10);
		PageBase.click(ReceiverAddress_Add_Address, 10);

		int Number = (int) (Math.random() * 10000);
		String newNumber = String.valueOf(Number);
		newReceiverCompanyName = ReceiverAddressCompanyName + newNumber;
		PageBase.sendText(New_AddressCompanName, 10, newReceiverCompanyName);
		PageBase.click(New_AddressSearch, 10);
		PageBase.sendText(New_AddressSearch, 10, ReceiverAddressCompanyAdd);
		PageBase.click(New_AddressSearch_Select, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(New_AddressSearch_Contine, 10);
		PageBase.sendText(New_Address_Name, 10, newReceiverCompanyName);
		PageBase.sendText(New_Address_Number, 10, "0452456876");
		PageBase.sendText(New_Address_Email, 10, "Test@test.com");
		// Verify if DG fields exists
		Boolean DG = PageBase.isElementPresent(New_Address_DGName);
		if (DG == true) {
			PageBase.sendText(New_Address_DGName, 10, "Test	");
			PageBase.sendText(New_Address_DGNumber, 10, "0452567879");
		}
		PageBase.click(New_Address_Add, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		// Verify Address is Selected
		PageBase.verifyTextExistAttribute(ReceiverAddress_Location_Selected, newReceiverCompanyName);

		String Address = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[1]/div[2]"))
				.getText();
		if (Address.contains(Address)) {
			System.out.println("New Receiver Address Exists in Location Feild AS EXPECTED");
		} else {
			System.out.println("FAILED: New Receiver Address DOEN NOT Exists in Location Feild");
			Reporter.log("FAILED: New Receiver Address DOEN NOT Exists in Location Feild");
			Assert.fail("FAILED: New Receiver Address DOEN NOT Exists in Location Feild");
		}
	}
	
	public static void verifyNoOfItemsLengthWidthHeightVolumeWeight(String NumberOfItems, String plength, String pwidth, String pheight,
			String pweight) {
		Reporter.log("User Verifies Dimension - NumberOfItems:"+NumberOfItems+", Length:"+plength+", Width:"+pwidth+", Height:"+pheight+", Weight:"+pweight);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExistAttribute(numberOfItem, NumberOfItems);
		PageBase.verifyTextExistAttribute(BookAPickupActions.length, plength);
		PageBase.verifyTextExistAttribute(BookAPickupActions.width, pwidth );
		PageBase.verifyTextExistAttribute(BookAPickupActions.height, pheight);
		PageBase.verifyTextExistAttribute(weight, pweight);
	}
	
	public static void verifySenderAddress() {
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Contactcs Page");
		PageBase.click(MyTollHomePageActions.myContactMenu, 10);
		Reporter.log("User Searches for New Contact added -"+newSenderCompanyName);
		PageBase.sendText(BookAPickupActions.SearchContactTxtFeild, 10, newSenderCompanyName);
		PageBase.click(BookAPickupActions.SearchContactButton, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.SearchContactCompanyLocation, newSenderCompanyName);
		Reporter.log("User Clicks Edit Contact and Edits Contact Details");
		PageBase.click(BookAPickupActions.SearchContactEdit, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditCompanyName).click();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditCompanyName).clear();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditName).click();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditName).clear();
		PageBase.click(BookAPickupActions.SearchContactEditSave, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.SearchContactEditCompanyNameErrorMsg, "Enter Company Name");
		PageBase.verifyTextExist(BookAPickupActions.SearchContactEditNameErrorMsg, "Enter First Name");
		PageBase.sendText(BookAPickupActions.SearchContactEditCompanyName, 5, newSenderCompanyName);
		PageBase.sendText(BookAPickupActions.SearchContactEditName, 5, newSenderCompanyName);
		Reporter.log("User Saves Contact Details");
		PageBase.click(BookAPickupActions.SearchContactEditSave, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(BookAPickupActions.popUpMsg, 10);
		PageBase.verifyTextExist(BookAPickupActions.popUpMsg, "Address Successfully Updated To Addressbook");
		PageBase.click(BookAPickupActions.popUpClose, 5);
		PageBase.MaximumWaitForElementEnabled_1();
	}
	
	public static void verifyReceiverAddress() {
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Contactcs Page");
		PageBase.click(MyTollHomePageActions.myContactMenu, 10);
		Reporter.log("User Searches for New Contact added -"+newReceiverCompanyName);
		PageBase.sendText(BookAPickupActions.SearchContactTxtFeild, 10, newReceiverCompanyName);
		PageBase.click(BookAPickupActions.SearchContactButton, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.SearchContactCompanyLocation, newReceiverCompanyName);
		Reporter.log("User Clicks Edit Contact and Edits Contact Details");
		PageBase.click(BookAPickupActions.SearchContactEdit, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditCompanyName).click();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditCompanyName).clear();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditName).click();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditName).clear();
		PageBase.click(BookAPickupActions.SearchContactEditSave, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.SearchContactEditCompanyNameErrorMsg, "Enter Company Name");
		PageBase.verifyTextExist(BookAPickupActions.SearchContactEditNameErrorMsg, "Enter First Name");
		PageBase.sendText(BookAPickupActions.SearchContactEditCompanyName, 5, newReceiverCompanyName);
		PageBase.sendText(BookAPickupActions.SearchContactEditName, 5, newReceiverCompanyName);
		Reporter.log("User Saves Contact Details");
		PageBase.click(BookAPickupActions.SearchContactEditSave, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(BookAPickupActions.popUpMsg, 10);
		PageBase.verifyTextExist(BookAPickupActions.popUpMsg, "Address Successfully Updated To Addressbook");
		PageBase.click(BookAPickupActions.popUpClose, 5);
		PageBase.MaximumWaitForElementEnabled_1();
	}

}
