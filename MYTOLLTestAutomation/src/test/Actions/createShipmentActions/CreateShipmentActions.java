package createShipmentActions;

import GlobalActions.PageBase;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import manifestActions.ManifestActions;
import myTollHomePageActions.MyTollHomePageActions;

public class CreateShipmentActions {//Nishant
	public static By createShipmentServiceSelector = By.xpath("//*[@id=\"service-label\"]");
	public static By modeSelectorSHIP = By.xpath("//*[@id=\"mode-selector\"]/div[2]/ul/li/div[text()='SHIP']");
	//Nishant
	public static By createShipmentsHeading = By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/header/div/h1");
	public static By shipments = By.id("createShipment");
	public static By dispatchDate = By.id("dispatch-date");
	public static By dispatchDateItem = By.xpath("//*[@id=\"create-shipment\"]/div[1]/div/div/div/ul/li[2]");
	public static By servicedropdown = By.xpath("//*[@id=\"service-selector\"]/label/a/i");
	public static By serviceTextfield = By.name("placeholder-service"); // *[@id="service-selector"]/label/input[2]
	public static By servicedropdownItemList = By.xpath("//*[@id=\"service-selector\"]/div/ul/li/div");
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
			.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/header/h2");
	public static By shipmentConsolidatedRadioBtn = By.name("shipmentcon");

	public static By shipmentConsolidatedArrowdown = By
			.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li[2]/div[1]/div[7]");
	public static By shipmentConsolidatedContinue = By
			.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/footer/button[1]");
	public static By shipmentConsolidatedBtn = By
			.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]//button[text()='CONSOLIDATE']");
	public static By MessageShipmentToEnetrLineItem = By
			.xpath("//*[@id=\"alert-box-wrapper\"]//h3[text()=' Shipment']");
	public static By MessageContentShipmentToEnetrLineItem = By
			.xpath("//*[@id=\"alert-box-wrapper\"]//h3[text()='Shipment']/div");
	public static By CloseMessageShipmentToEnetrLineItem = By.id("closeAlert");
	public static By dgContactName = By.id("sh-dg-contact-name");
	public static By dgContactNumber = By.id("sh-dg-contact-num");
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
	public static By itemType = By.xpath("//*[@id=\"outr-pkg-selector\"]/div[1]/input[2]"); //.xpath("//*[@id=\"billing-type-selector\"]/div[1]/a/i");//*[@id="outr-pkg-selector"]/div[1]/input[2]
	public static By itemTypeTextField = By.xpath("billing-type-description");
	public static By numberOfGarments = By.id("garmentsCount");
	public static By weight = By.id("weight");
	public static By UNNumberDropdown = By.xpath("//*[@id=\"un-code-selector\"]/label/a/i");
	public static By UNNumberTextField = By.id("dg-uncode-");
	public static By lookupBtn = By.xpath("//*[@id=\"un-code-selector\"]/div/div/div/a");
	public static By searchBtn = By.xpath("//*[@id=\"un-code-selector-\"]/div/div/div/span/i");
	public static By UNNumberItem = By.xpath("//*[@id=\"dg-form\"]/div/div[2]/div[1]/div[1]/div/div[1]/ul/li/div");
	public static By classDivision = By.id("class-division-");
	public static By packingGroup = By.xpath("//*[@id=\"packaging-grp-selector-\"]/label/input[2]");
	public static By subRisk = By.xpath("//*[@id=\"sub-risk-selector-\"]/label/input[2]");
	public static By properShippingName = By.id("shipping-name-");
	public static By packingGroupDropdown = By.xpath("//*[@id=\"packaging-grp-selector-\"]/label/a/i");
	public static By packingGroupItem = By.xpath("//*[@id=\"packaging-grp-selector-\"]/div/ul/li[2]/div");
	public static By dgPackagingDescription = By.id("packing-description-");
	public static By dgPkgQty = By.id("dg-pkg-qty-");
	public static By dgQtyKg = By.id("dg-qty-");
	public static By technicalName = By.id("technical-name-");
	public static By lineItem1Arrowdown = By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[8]/a/i");
	public static By dangerousGoodsArrowdown = By.xpath("//*[@id=\"dg-line--0\"]/div[1]/div[8]/a/i");
	public static By addNewLine = By.id("add-line-item");
	public static By addPalletYes = By.xpath("//*[@id=\"steps-3\"]/div[1]/div/div/div/label/span[2]");
	public static By typeOfExportArrowdown = By.xpath(" //*[@id=\"type-of-export-selector\"]/div[1]/a/i");
	public static By declaredValue = By.id("declared-count");
	public static By declaredValueCurrency = By.xpath("//*[@id=\"currency-selector\"]/label/input[2]");
	public static By whoPaysDutiesTaxesArrowdown = By.xpath("//*[@id=\"duty-payer-selector\"]/div[1]/a/i");
	public static By commodityCode = By.name("commodity-code");

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
	public static By deletePurchaseOrderBtn = By.xpath("//*[@id=\"po-values\"]/li/a");
	public static By tollExtraSrviceNOBtn = By.id("toll-extra-service-check");
	public static By foodPackagingNOBtn = By.xpath("//*[@id=\"steps-3\"]/div[8]/div[1]/div/label/span[2]");
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

	// Quick Entry Mode Yes
	public static By QuickEntryMode = By.xpath("//*[@id=\"quick-entry-wrapper\"]/div[2]/label/span[2]");
	public static By billingTypeQME = By.id("gv-billing-type");
	public static By enterVolumeCheckBoxQME = By.id("gv-volume-only-chkbox");
	public static By itemTypeQME = By.xpath("//*[@id=\"gv-outr-pkg-selector\"]/div[1]/input[2]");
	public static By senderReferenceQME = By.id("sender-reference");
	public static By receiverReferenceQME = By.id("reciever-reference");
	public static By PackingGroupQME = By.xpath("//*[@id=\"gv-packaging-grp-selector\"]/label/input[2]");

	// Save as a draft
	public static By saveDraft = By.id("save-draft-btn");
	public static By saveDraftSuccessfulMessage = By.xpath("//*[@id=\"confirm-box-wrapper\"]/div/div[1]/div[2]/p");
	public static By goToMyDashboardBtn = By.id("confirm-true");
	public static By goBackBtn = By.id("confirm-false");
	public static By draftShipmentTabInMyDashboard = By.xpath("//*[@id=\"draftshipmentAnchor\"]/span");
	public static By draftShipmentList = By.xpath("//*[@id=\"draftShipList\"]/tr"); // *[@id="draftShipList"]
	public static By deleteButtonDraftShipmenInMyDashboard = By
			.xpath("//*[@id=\"draftShipList\"]//td/span[@class='draftshipDel']/i");// *[@id="draft1531"]/td[5]/a
	public static By continueDeleteButtonDraftShipmenInMyDashboard = By.id("confirm-true");
	public static By completeShipmentButtonDraftShipmenInMyDashboard = By.xpath("//*[@id=\"draftShipList\"]/td[5]/a");

	public static final String SenderAddressCompanyName = "TestSender";
	public static final String SenderAddressCompanyAdd = "60 Collins Street, MELBOURNE VIC 3000";
	public static final String ReceiverAddressCompanyName = "TestReceiver";
	public static final String ReceiverAddressCompanyAdd = "60 Colliery Street, NEATH  NSW  2326";
	public static String newSenderCompanyName;
	public static String newReceiverCompanyName;

	public static void ClickShipment() {
		BaseWebdriver.driver.findElement(shipments).click();

	}

	public static void SelectDispatchDate() {
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(dispatchDate, 5);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.ClickOn(dispatchDateItem, 5);

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
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(servicedropdown).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li/div[text()='" + pService + "']"))
				.click();

	}

	public static String GetService() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetAttributeValue(serviceTextfield, 5);

	}

	public static int GetServiceItemListSize() {
		BaseWebdriver.driver.findElement(servicedropdown).click();
		List<WebElement> elements = BaseWebdriver.driver.findElements(servicedropdownItemList);
		return elements.size();
	}

	public static void GetServiceItemList(String serviceItem, int itemIndex) {
		BaseWebdriver.driver.findElement(servicedropdown).click();
		String itemList = null;
		for (int i = 1; i <= itemIndex; i++) {
			itemList = BaseWebdriver.driver
					.findElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li[" + i + "]/div")).getText();
			System.out.println("from ui" + itemList);
			assertEquals(serviceItem, itemList);
		}

	}

	public static String SelectMode(int i) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(mode).click();
		 String mode = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-selector\"]/div[2]/ul/li[" + i +"]/div")).getText();
		 BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-selector\"]/div[2]/ul/li["+ i + "]/div")).click();
		//String mode = "";
		return mode;
	}

	public static String SelectModeTasmania() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(mode).click();
		String mode = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-selector\"]/div[2]/ul/li/div"))
				.getText();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"mode-selector\"]/div[2]/ul/li/div")).click();
		return mode;
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
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(whoPaysdropdown).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"payer-selector\"]/div/ul/li[" + i + "]/div")).click();

	}

	public static void SelectSender(int i) {
		PageBase.MinimumWaitForElementEnabled_1();
		//BaseWebdriver.driver.findElement(senderdropdown).click();
		PageBase.click(senderdropdown, 5);
		PageBase.MinimumWaitForElementEnabled();
		//BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[2]/ul/li[" + i + "]/div[2]"))
		//		.click();
		PageBase.click(By.xpath("//*[@id=\"sender-selector\"]/div[2]/ul/li[" + i + "]/div[2]"), 5);
		PageBase.MinimumWaitForElementEnabled();

	}

	public static void EnterSender(String pSender) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(senderTextfield).click();
		BaseWebdriver.driver.findElement(senderTextfield).clear();
		BaseWebdriver.driver.findElement(senderTextfield).sendKeys(pSender);
		PageBase.Scrollbar(500, 800);
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[2]/ul/li/div[text()='" + pSender + "']"))
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
				.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[1]/div[3]")).getText();
		String vSenderLocationLine2 = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"sender-selector\"]/div[1]/div[4]")).getText();
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
		//BaseWebdriver.driver.findElement(receiverdropdown).click();
		PageBase.click(receiverdropdown, 5);
		//PageBase.Scrollbar(500, 800);
		//BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[2]/ul/li[" + i + "]/div[2]"))
			//	.click();
		PageBase.click(By.xpath("//*[@id=\"receiver-selector\"]/div[2]/ul/li[" + i + "]/div[2]"), 5);
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void EnterReceiver(String Receiver) {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(receiverTextfield).click();
		BaseWebdriver.driver.findElement(receiverTextfield).clear();
		BaseWebdriver.driver.findElement(receiverTextfield).sendKeys(Receiver);
		PageBase.Scrollbar(500, 800);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[2]/ul/li/div[text()='" + Receiver + "']"))
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
				.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[1]/div[3]")).getText();
		String ReceiverLocationLine2 = BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"receiver-selector\"]/div[1]/div[4]")).getText();
		System.out.println(ReceiverLocationLine1);
		System.out.println(ReceiverLocationLine2);
		String ReceiverLocation = ReceiverLocationLine1 + " " + ReceiverLocationLine2;
		return ReceiverLocation;

	}

	public static void SelectShipmentConsolidationConsolidate() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		// PageBase.MaximumWaitForElementEnabled();
		try {
			boolean results = BaseWebdriver.driver.findElement(shipmentConsolidatedMSGHeading).isDisplayed();
			System.out.println("shipmentConsolidatedMSGHeading");
			BaseWebdriver.driver.findElement(shipmentConsolidatedBtn).click();
			System.out.println("click shipmentConsolidatedBtn");
			if (results == true) {
				boolean results2 = BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn).isDisplayed();
				System.out.println("results2" + results2);
				Actions action = new Actions(BaseWebdriver.driver);
				action.doubleClick(BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn));
				action.perform();
				System.out.println("shipmentConsolidatedRadioBtn doubleclicked ");
				BaseWebdriver.driver.findElement(shipmentConsolidatedBtn).click();
				PageBase.MaximumWaitForElementEnabled();

			}
		}

		catch (Exception ex) {
			System.out.println(ex);
			SelectNotifySenderAndReceiver();
		}

	}

	public static void SelectShipmentConsolidationConsolidatePrio(String pItemTemplateName, String pBillingType,
			String pNumberOfItems, String pShipmentRef1, String pShipmentRef2, String pLength, String pWidth,
			String pHeight, String pWeight, String ItemTemplateName2, String pNumberOfItems2, String pLength2,
			String pWidth2, String pHeight2, String pWeight2, Integer DGNo, String SpeceialIns) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		try {
			boolean results = BaseWebdriver.driver.findElement(shipmentConsolidatedMSGHeading).isDisplayed();
			System.out.println("shipmentConsolidatedMSGHeading");
			BaseWebdriver.driver.findElement(shipmentConsolidatedBtn).click();
			System.out.println("click shipmentConsolidatedBtn");
			if (results == true) {
				boolean results2 = BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn).isDisplayed();
				System.out.println("results2" + results2);
				Actions action = new Actions(BaseWebdriver.driver);
				action.doubleClick(BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn));
				action.perform();
				System.out.println("shipmentConsolidatedRadioBtn doubleclicked ");
				BaseWebdriver.driver.findElement(shipmentConsolidatedBtn).click();
				PageBase.MaximumWaitForElementEnabled();

			}
		}

		catch (Exception ex) {
			System.out.println(ex);
			CreateShipmentActions.ClickReviewCreateShipment();
			MessageEnterLineItemShipmentConsolidationTollPrio(pItemTemplateName, pBillingType, pNumberOfItems,
					pShipmentRef1, pShipmentRef2, pLength, pWidth, pHeight, pWeight, ItemTemplateName2, pNumberOfItems2,
					pLength2, pWidth2, pHeight2, pWeight2, DGNo, SpeceialIns);
		}

	}

	public static void SelectShipmentConsolidationConsolidateAU() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		try {
			boolean results = BaseWebdriver.driver.findElement(shipmentConsolidatedMSGHeading).isDisplayed();
			System.out.println("shipmentConsolidatedMSGHeading");
			BaseWebdriver.driver.findElement(shipmentConsolidatedBtn).click();
			System.out.println("click shipmentConsolidatedBtn");
			if (results == true) {
				List<WebElement> eles = BaseWebdriver.driver.findElements(
						By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]//div[@class='shiment-list-box']"));// ul[@class='shipment-list']
				int listSize = eles.size();
				System.out.println("listSize" + listSize);
				PageBase.MinimumWaitForElementEnabled();
				// PageBase.MoveToElement(By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li["+listSize+"]/div[1]/div[2]/p"),
				// CreateShipmentActions.shipmentConsolidatedMSGHeading);
				boolean resultsListItem = BaseWebdriver.driver
						.findElement(By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li["
								+ listSize + "]/div[1]/div[2]/p"))
						.isDisplayed();
				System.out.println("results listelement" + resultsListItem);
				PageBase.MaximumWaitForElementEnabled();
				boolean results2 = BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn).isDisplayed();
				System.out.println("results2" + results2);
				Actions action = new Actions(BaseWebdriver.driver);
				action.doubleClick(BaseWebdriver.driver.findElement(shipmentConsolidatedRadioBtn));
				action.perform();
				System.out.println("shipmentConsolidatedRadioBtn doubleclicked ");
				BaseWebdriver.driver.findElement(shipmentConsolidatedBtn).click();
				PageBase.MaximumWaitForElementEnabled();

			}
		}

		catch (Exception ex) {
			System.out.println(ex);
			SelectNotifySenderAndReceiver();
		}

	}

	public static void SelectShipmentFromConsolidateShipmentScreen() {
		PageBase.Scrollbar(0, 250);
		System.out.println("scroll successful ");
		PageBase.MinimumWaitForElementEnabled();
		List<WebElement> eles = BaseWebdriver.driver
				.findElements(By.xpath("//*[@id=\"shipment-cons-popup-wrpr\"]//ul[@class='shipment-list']"));
		int listSize = eles.size();
		System.out.println("listSize" + listSize);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.MoveToElement(By.xpath(
				"//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li[" + listSize + "]/div[1]/div[2]/p"),
				CreateShipmentActions.shipmentConsolidatedMSGHeading);
		boolean results = BaseWebdriver.driver.findElement(By.xpath(
				"//*[@id=\"shipment-cons-popup-wrpr\"]/div/div/section/div/ul/li[" + listSize + "]/div[1]/div[2]/p"))
				.isDisplayed();
		System.out.println("results listelement" + results);
		PageBase.MaximumWaitForElementEnabled();

	}

	public static void SelectShipmentConsolidationContinue() {
		try {
			PageBase.MaximumWaitForElementEnabled();
			Boolean results = BaseWebdriver.driver.findElement(shipmentConsolidatedContinue).isDisplayed();
			if (results == true) {
				BaseWebdriver.driver.findElement(shipmentConsolidatedContinue).click();
				PageBase.MaximumWaitForElementEnabled();
				SelectNotifySenderAndReceiver();
				PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
						CreateShipmentActions.notifyReceiverCheckBox);

			}
		}

		catch (Exception ex) {
			System.out.println(ex);
			//SelectNotifySenderAndReceiver();
		}
	}
	
	public static void SelectShipmentConsolidation() {
		try {
			PageBase.MaximumWaitForElementEnabled();
			Boolean results = BaseWebdriver.driver.findElement(shipmentConsolidatedContinue).isDisplayed();
			if (results == true) {
				BaseWebdriver.driver.findElement(shipmentConsolidatedContinue).click();
				PageBase.MaximumWaitForElementEnabled(); 
			}
		}

		catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void MessageEnterLineItemShipmentConsolidation(String pItemTemplateName, String pBillingType,
			String pNumberOfItems, String pShipmentRef1, String pShipmentRef2, String pLength, String pWidth,
			String pHeight, String pWeight, String ItemTemplateName2, String pNumberOfItems2, String pLength2,
			String pWidth2, String pHeight2, String pWeight2, Integer DGNo, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder,
			String TollExtraSrviceAmount, String SpeceialIns) {
		try {
			PageBase.MaximumWaitForElementEnabled();
			Boolean results = BaseWebdriver.driver.findElement(MessageShipmentToEnetrLineItem).isDisplayed();
			System.out.println("results " + results);
			if (results == true) {

				String messageHeading = BaseWebdriver.driver.findElement(MessageShipmentToEnetrLineItem).getText()
						.toString();
				System.out.println("messageHeading " + messageHeading);
				String messageContent = BaseWebdriver.driver.findElement(MessageContentShipmentToEnetrLineItem)
						.getText().toString();
				System.out.println("messageContent " + messageContent);
				assertEquals("Shipment", messageHeading);
				assertEquals("Select at least one line item", messageContent);
				BaseWebdriver.driver.findElement(CloseMessageShipmentToEnetrLineItem).click();
				PageBase.MinimumWaitForElementEnabled();

				BookAPickupActions.EnterItem(pItemTemplateName);
				CreateShipmentActions.EnterBillingType(pBillingType);
				CreateShipmentActions.NumberOfItem(pNumberOfItems);
				CreateShipmentActions.ItemType(2);
				CreateShipmentActions.EnterSenderReference(pShipmentRef1, pShipmentRef2);
				BookAPickupActions.EnterLengthWidthHeight(pLength, pWidth, pHeight);
				CreateShipmentActions.EnterWeight(pWeight);

				PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

				CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, pBillingType, pNumberOfItems2,
						pLength2, pWidth2, pHeight2, pWeight2, pShipmentRef1, pShipmentRef2);
				BookAPickupActions.SelectDangerousGoods(DGNo);

				PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
				CreateShipmentActions.SelectPalletTransactionsYes();
				CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
						ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo,
						OtherCostomer, ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo,
						LoscamOtherExchange, LoscamOtherTransferToToll, LoscamOtherDocketNo);

				CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);

				CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

				BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
			}
		}

		catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void MessageEnterLineItemShipmentConsolidationTollPrio(String pItemTemplateName, String pBillingType,
			String pNumberOfItems, String pShipmentRef1, String pShipmentRef2, String pLength, String pWidth,
			String pHeight, String pWeight, String ItemTemplateName2, String pNumberOfItems2, String pLength2,
			String pWidth2, String pHeight2, String pWeight2, Integer DGNo, String SpeceialIns) {
		try {
			PageBase.MaximumWaitForElementEnabled();
			Actions action = new Actions(BaseWebdriver.driver);
			action.click(BaseWebdriver.driver.findElement(MessageShipmentToEnetrLineItem));
			action.perform();
			Boolean results = BaseWebdriver.driver.findElement(MessageShipmentToEnetrLineItem).isDisplayed();
			System.out.println("results " + results);
			if (results == true) {

				BaseWebdriver.driver.findElement(CloseMessageShipmentToEnetrLineItem).click();
				/*
				 * Actions action = new Actions(BaseWebdriver.driver);
				 * action.click(BaseWebdriver.driver.findElement(
				 * CloseMessageShipmentToEnetrLineItem)); action.perform(); /*String
				 * messageHeading =
				 * BaseWebdriver.driver.findElement(MessageShipmentToEnetrLineItem).getText().
				 * toString(); System.out.println("messageHeading "+messageHeading ); String
				 * messageContent =
				 * BaseWebdriver.driver.findElement(MessageContentShipmentToEnetrLineItem).
				 * getText().toString(); System.out.println("messageContent "+messageContent );
				 * assertEquals("Shipment", messageHeading);
				 * assertEquals("Select at least one line item", messageContent);
				 * BaseWebdriver.driver.findElement(CloseMessageShipmentToEnetrLineItem).click()
				 * ;
				 */
				PageBase.MinimumWaitForElementEnabled();

				BookAPickupActions.EnterItem(pItemTemplateName);
				CreateShipmentActions.EnterBillingType(pBillingType);
				CreateShipmentActions.NumberOfItem(pNumberOfItems);
				// CreateShipmentActions.ItemType(2);
				CreateShipmentActions.EnterSenderReference(pShipmentRef1, pShipmentRef2);
				BookAPickupActions.EnterLengthWidthHeight(pLength, pWidth, pHeight);
				CreateShipmentActions.EnterWeight(pWeight);

				PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

				CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, pBillingType, pNumberOfItems2,
						pLength2, pWidth2, pHeight2, pWeight2, pShipmentRef1, pShipmentRef2);
				BookAPickupActions.SelectDangerousGoods(DGNo);

				PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);

				BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
			}
		}

		catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void EnterDGContactDetails(String pDGContactName, String pDGContactNumber) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(dgContactName).click();
		String dgContactname = BaseWebdriver.driver.findElement(dgContactName).getAttribute("value");
		System.out.println("DG contact name" + dgContactname);
		if (dgContactname.equals("")
				&& (BaseWebdriver.driver.findElement(dgContactNumber).getAttribute("value").equals(""))) {
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
		// PageBase.MinimumWaitForElementEnabled();

		try {

			//BaseWebdriver.driver.findElement(notifySenderCheckBox).click();
			PageBase.click(notifySenderCheckBox, 5);

			PageBase.MinimumWaitForElementEnabled();
			//BaseWebdriver.driver.findElement(notifyReceiverCheckBox).click();
			PageBase.click(notifyReceiverCheckBox, 5);
		} catch (Exception ex) {
			PageBase.MoveToElement(CreateShipmentActions.quoteNumber, CreateShipmentActions.accountNumber);
		}

	}

	public static void EnterShipmentReferences(String pShipmentRef1, String pShipmentRef2) {
		// PageBase.MinimumWaitForElementEnabled();

//		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
//		BaseWebdriver.driver.findElement(shipmentReference1).click();
//		BaseWebdriver.driver.findElement(shipmentReference1).clear();
//		BaseWebdriver.driver.findElement(shipmentReference1).sendKeys(pShipmentRef1);
//		PageBase.MinimumWaitForElementEnabled();
//		BaseWebdriver.driver.findElement(shipmentReference2).click();
//		BaseWebdriver.driver.findElement(shipmentReference2).clear();
//		BaseWebdriver.driver.findElement(shipmentReference2).sendKeys(pShipmentRef2);
		PageBase.sendText(shipmentReference1, 5, pShipmentRef1);
		PageBase.sendText(shipmentReference2, 5, pShipmentRef2);

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
		PageBase.MinimumWaitForElementEnabled();
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
				.click(); // *[@id="drop-off-depot-selector"]/div[2]/ul/li[1]/div
		PageBase.MinimumWaitForElementEnabled();
	}

	public static void SelectCollectionDepot(int i) {
		PageBase.MaximumWaitForElementEnabled();
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
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(itemType).click();
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"outr-pkg-selector\"]/div[2]/ul/li[" + j + "]/div"))
				.click();//*[@id="outr-pkg-selector"]/div[2]/ul/li[2]/div

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

			Boolean results = BaseWebdriver.driver.findElement(billingTypedropdown).isDisplayed();
			System.out.println("Billing type displayed");
			if (results == true) {
				BaseWebdriver.driver.findElement(billingTypedropdown).click();
				BaseWebdriver.driver
						.findElement(By.xpath(
								"//*[@id=\"billing-type-selector\"]/div[2]/ul/li/div[text()='" + pBillingType + "']"))
						.click();
			}
		} catch (Exception ex) {
			System.out.println("Billing type is not displayed");

		}

	}

	public static void SelectBillingType(int i) {
		// PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(billingTypedropdown).click();
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li[" + i + "]/div"))
				.click();

	}

	public static void EnterDangerousGoodsDetails(int j, String lookupItem, String packageDescription, String pDgPkgQty,
			String pDgQtyKg) {

		PageBase.MaximumWaitForElementEnabled();
		// BaseWebdriver.driver.findElement(UNNumberDropdown).click();
		BaseWebdriver.driver.findElement(UNNumberTextField).sendKeys(lookupItem);
		// BaseWebdriver.driver.findElement(searchBtn).click();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(By.xpath(
				"//*[@id=\"dg-form\"]/div/div[2]/div[1]/div[1]/div/div[1]/ul/li/div[text()='2025 | MERCURY COMPOUND, SOLID, N.O.S | 6.1']"))
				.click();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(dgPackagingDescription).sendKeys(packageDescription);
		BaseWebdriver.driver.findElement(dgPkgQty).sendKeys(pDgPkgQty);
		BaseWebdriver.driver.findElement(dgQtyKg).sendKeys(pDgQtyKg);

	}

	public static String GetUNNumber() {
		PageBase.MinimumWaitForElementEnabled();

		// BaseWebdriver.driver.findElement(dangerousGoodsArrowdown).click();
		return BaseWebdriver.driver.findElement(UNNumberTextField).getAttribute("value").toString();

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

		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(packingGroupDropdown).click();
		BaseWebdriver.driver
				.findElement(By.xpath("//*[@id=\"packaging-grp-selector\"]/div/ul/li['" + packagingGroup + "']/div"))
				.click();

	}

	public static void SelectPackgingGroupString(String packagingGroup) {

		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(packingGroupDropdown).click();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver
				.findElement(
						By.xpath("//*[@id=\"packaging-grp-selector-\"]/div/ul/li/div[text()='" + packagingGroup + "']"))
				.click();

		// *[@id="packaging-grp-selector-"]/div/ul/li[3]/div
		// *[@id="packaging-grp-selector-"]/div/ul/li[2]
		// *[@id="packaging-grp-selector-"]/div/ul/li[2]/div

		// *[@id="packaging-grp-selector-"]/div/ul/li[2]/div
	}

	public static void EnterPackgingGroup(Integer packagingGroup) {
		// BookAPickupActions.SelectUNNumber(j,lookupItem);

		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(packingGroupDropdown).click();
		BaseWebdriver.driver
				.findElement(
						By.xpath("//*[@id=\"packaging-grp-selector-\"]/div/ul/li/div[text()='" + packagingGroup + "']"))
				.click();

	}

	public static void EnterTechnicalName(String pTechnicalName) {
		PageBase.MinimumWaitForElementEnabled();
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
		PageBase.MaximumWaitForElementEnabled();
		PageBase.Scrollbar(200, 500);
		BaseWebdriver.driver.findElement(addNewLine).click();
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.EnterItem(ItemTemplate2);
		CreateShipmentActions.EnterBillingType(BillingType);
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, BookAPickupActions.itemDescriptionDropdown);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);

	}

	public static void ClickAddANewLine() {
		BaseWebdriver.driver.findElement(addNewLine).click();
	}

	public static void AddANewLineNZAUS() {
		PageBase.Scrollbar(500, 800);
		BaseWebdriver.driver.findElement(addNewLine).click();

		BookAPickupActions.EnterItem("Automation Template2");
		CreateShipmentActions.NumberOfItem("15");
		BookAPickupActions.EnterLengthWidthHeight("200", "100", "50");
		CreateShipmentActions.EnterWeight("300");
		// CreateShipmentActions.SelectBillingType(1); if there is one billing type , it
		// is not visible.
		CreateShipmentActions.EnterSenderReference("12345", "567879");

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
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(addPalletYes).click();

	}

	public static void SelectPalletTransactionsNo() {
		PageBase.MinimumWaitForElementEnabled();
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

	public static void EnterPalletTransActionChepInformations(String pChepCustomer, String pChepExchange,
			String pChepTansferToToll, String pChepDocketNo) {
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
	}

	public static void EnterPalletTransActionLoscamInformations(String pLoscamCustomer, String pLoascamExchange,
			String pLoscamTransferToToll, String pLoscamDocketNo) {
		PageBase.MaximumWaitForElementEnabled();
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
	}

	public static void EnterPalletTransActionOtherCustomerInformations(String pOtherCostomer) {
		PageBase.MaximumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(otherCustomer).click();
		BaseWebdriver.driver.findElement(otherCustomer).clear();
		BaseWebdriver.driver.findElement(otherCustomer).sendKeys(pOtherCostomer);
	}

	public static void EnterPalletTransActionChepOtherInformations(String pChepOtherExchange,
			String pChepOtherTransferToToll, String pchepOtherDocketNo) {
		PageBase.MaximumWaitForElementEnabled();

		BaseWebdriver.driver.findElement(chepOtherExchange).click();
		BaseWebdriver.driver.findElement(chepOtherExchange).clear();
		BaseWebdriver.driver.findElement(chepOtherExchange).sendKeys(pChepOtherExchange);
		BaseWebdriver.driver.findElement(chepOtherTransfer).click();
		BaseWebdriver.driver.findElement(chepOtherTransfer).clear();
		BaseWebdriver.driver.findElement(chepOtherTransfer).sendKeys(pChepOtherTransferToToll);
		BaseWebdriver.driver.findElement(chepOtherCustomer).click();
		BaseWebdriver.driver.findElement(chepOtherCustomer).clear();
		BaseWebdriver.driver.findElement(chepOtherCustomer).sendKeys(pchepOtherDocketNo);
	}

	public static void EnterPalletTransActionLoscamOtherInformations(String pLoscamOtherExchange,
			String pLoscamOtherTransferToToll, String pLoscamOtherDocketNo) {
		PageBase.MaximumWaitForElementEnabled();

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

	public static void VerifyDocketNoNotMandatoryInLocamOther(String pChepCustomer, String pChepExchange,
			String pChepTansferToToll, String pChepDocketNo, String pLoscamCustomer, String pLoascamExchange,
			String pLoscamTransferToToll, String pLoscamDocketNo, String pOtherCostomer, String pChepOtherExchange,
			String pChepOtherTransferToToll, String pchepOtherDocketNo, String pLoscamOtherExchange,
			String pLoscamOtherTransferToToll, String LoscamOtherDocketNo) {
		PageBase.MinimumWaitForElementEnabled();
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
		PageBase.sendTextandSubmit(loscamOtherDocket, 5, LoscamOtherDocketNo);

	}

	public static void EnterPurchaseOrder(String pPurchaseOrder) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(purchaseorderTextField).click();
		BaseWebdriver.driver.findElement(purchaseorderTextField).clear();
		BaseWebdriver.driver.findElement(purchaseorderTextField).sendKeys(pPurchaseOrder);
		BaseWebdriver.driver.findElement(addPurchaseOrderBtn).click();
	}

	public static void DeletePurchaseOrder(String pPurchaseOrder) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(purchaseorderTextField).click();
		BaseWebdriver.driver.findElement(purchaseorderTextField).clear();
		BaseWebdriver.driver.findElement(purchaseorderTextField).sendKeys(pPurchaseOrder);
		BaseWebdriver.driver.findElement(addPurchaseOrderBtn).click();
		BaseWebdriver.driver.findElement(deletePurchaseOrderBtn).click();
	}

	public static void SelectAuthorityToLeaveYes() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(authorityToLeaveNoBtn).click();

	}

	public static void SelectFoodPackagingYes() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(foodPackagingNOBtn).click();

	}

	public static void SelectTollExtraYes() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(tollExtraSrviceNOBtn).click();

	}

	public static void EnterTollExtraServiceAmount(String pTollExtraSrviceAmount) {
		PageBase.MinimumWaitForElementEnabled();
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

	public static void TypeOfExport(String pTypeOfExport) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(typeOfExportArrowdown).click();
		BaseWebdriver.driver
				.findElement(By
						.xpath("//*[@id=\"type-of-export-selector\"]/div[2]/ul/li/div[text()='" + pTypeOfExport + "']"))
				.click();

	}

	public static void DeclaredValue(String pDeclaredValue) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(declaredValue).click();
		BaseWebdriver.driver.findElement(declaredValue).clear();
		BaseWebdriver.driver.findElement(declaredValue).sendKeys(pDeclaredValue);

	}

	public static void DeclaredValueCurrency(String pDeclaredValueCurrency) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(declaredValueCurrency).click();
		BaseWebdriver.driver.findElement(declaredValueCurrency).clear();
		BaseWebdriver.driver
				.findElement(By
						.xpath("//*[@id=\"currency-selector\"]/div/ul/li/div[text()='" + pDeclaredValueCurrency + "']"))
				.click();

	}

	public static void WhoPaysDutiesTaxes(String pWhoPaysDutiesTaxes) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(whoPaysDutiesTaxesArrowdown).click();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(By.xpath("//*[@id=\"duty-payer-selector\"]/div[2]/ul/li/div[text()='"+ pWhoPaysDutiesTaxes +"']"), 5);
//		BaseWebdriver.driver
//				.findElement(By.xpath(
//						"//*[@id=\"duty-payer-selector\"]/div[2]/ul/li/div[text()='"+ pWhoPaysDutiesTaxes +"']"))
//				.click();

	}

	public static void HarmonisedCommodityCode(String pCommodityCode) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(commodityCode).click();
		BaseWebdriver.driver.findElement(commodityCode).clear();
		BaseWebdriver.driver.findElement(commodityCode).sendKeys(pCommodityCode);

	}

	public static void ClickReviewCreateShipment() {

		//PageBase.MoveToElement(BookAPickupActions.specialInstructions, BookAPickupActions.specialInstructions);
		//BaseWebdriver.driver.findElement(reviewCreateShipmentBtn).click();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(reviewCreateShipmentBtn, 5);
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
			boolean results = true;
			results = BaseWebdriver.driver.findElement(ManifestActions.AddToManifestTtile).isDisplayed();
			if (results == true) {
				ManifestActions
						.AddToExistingManifestSubmittingCreateshipment("newManifest123" + (new Date()).getTime());
				// ManifestActions.MoveToManifestAndCreateNewManifest("newManifest123");

			}
		}

		catch (Exception ex) {
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
		boolean resultsNotifySenderCheckBox = BaseWebdriver.driver.findElement(notifySenderCheckBox).isSelected();
		System.out.println("resultsNotifySenderCheckBox" + resultsNotifySenderCheckBox);

		if (resultsNotifySenderCheckBox == false) {
			PageBase.MinimumWaitForElementEnabled();
			//BaseWebdriver.driver.findElement(notifySenderCheckBox).click();
			PageBase.click(notifySenderCheckBox, 5);
			System.out.println("resultsNotifySenderCheckBox clicked");
			PageBase.MinimumWaitForElementEnabled();

		} else {

			PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.ReceiverAddress_Dropdown);

		}
		try {
			BaseWebdriver.driver.findElement(senderEmail).click();
			BaseWebdriver.driver.findElement(senderEmail).clear();
			BaseWebdriver.driver.findElement(senderEmail).sendKeys(pSenderEmail);
		} catch (Exception ex) {
			CreateShipmentActions.SelectNotifySenderAndReceiver();
			CreateShipmentActions.SelectNotifySenderAndReceiver();
			BaseWebdriver.driver.findElement(senderEmail).click();
			BaseWebdriver.driver.findElement(senderEmail).clear();
			BaseWebdriver.driver.findElement(senderEmail).sendKeys(pSenderEmail);
		}
	}

	public static void EnterReceiverEmail(String pReceiverEmail) {

		PageBase.MinimumWaitForElementEnabled();
		boolean resultsReceiverCheckBox = BaseWebdriver.driver.findElement(notifyReceiverCheckBox).isSelected();
		System.out.println("resultsReceiverCheckBox" + resultsReceiverCheckBox);
		PageBase.MinimumWaitForElementEnabled();
		if (resultsReceiverCheckBox == true) {
			PageBase.MinimumWaitForElementEnabled();
			BaseWebdriver.driver.findElement(receiverEmail).click();
			BaseWebdriver.driver.findElement(receiverEmail).clear();
			BaseWebdriver.driver.findElement(receiverEmail).sendKeys(pReceiverEmail);
			PageBase.MinimumWaitForElementEnabled();
		} else {
			PageBase.MinimumWaitForElementEnabled();
			//BaseWebdriver.driver.findElement(notifyReceiverCheckBox).click();
			PageBase.click(notifyReceiverCheckBox, 5);
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
		
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
	}

	public static void verifyNoOfItemsLengthWidthHeightVolumeWeight(String NumberOfItems, String plength, String pwidth,
			String pheight, String pweight) {
		Reporter.log("User Verifies Dimension - NumberOfItems:" + NumberOfItems + ", Length:" + plength + ", Width:"
				+ pwidth + ", Height:" + pheight + ", Weight:" + pweight);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExistAttribute(numberOfItem, NumberOfItems);
		PageBase.verifyTextExistAttribute(BookAPickupActions.length, plength);
		PageBase.verifyTextExistAttribute(BookAPickupActions.width, pwidth);
		PageBase.verifyTextExistAttribute(BookAPickupActions.height, pheight);
		PageBase.verifyTextExistAttribute(weight, pweight);
	}

	public static void verifySenderAddress() {
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Contactcs Page");
		PageBase.click(MyTollHomePageActions.myContactMenu, 10);
		Alert alert = BaseWebdriver.driver.switchTo().alert();
		alert.accept();
		Reporter.log("User Searches for New Contact added -" + newSenderCompanyName);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.sendText(BookAPickupActions.SearchContactTxtFeild, 10, newSenderCompanyName);
		PageBase.click(BookAPickupActions.SearchContactButton, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.SearchContactCompanyLocation, newSenderCompanyName);
		System.out.println("line 1563");
		Reporter.log("User Clicks Edit Contact and Edits Contact Details");
		System.out.println("line 1565");
		PageBase.click(BookAPickupActions.SearchContactEdit, 10);
		System.out.println("line 1567");
		PageBase.MaximumWaitForElementEnabled_1();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditCompanyName).click();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditCompanyName).clear();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditName).click();
		BaseWebdriver.driver.findElement(BookAPickupActions.SearchContactEditName).clear();
		System.out.println("line 1574");
		PageBase.click(BookAPickupActions.SearchContactEditSave, 10);
		System.out.println("line 1575");
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled();
		System.out.println("line 1578");
		System.out.println("line 1580");
		//PageBase.verifyTextExist(BookAPickupActions.SearchContactEditCompanyNameErrorMsg, "Enter Company Name");
		//PageBase.verifyTextExist(BookAPickupActions.SearchContactEditNameErrorMsg, "Enter First Name");
		PageBase.sendText(BookAPickupActions.SearchContactEditCompanyName, 5, newSenderCompanyName);
		PageBase.sendText(BookAPickupActions.SearchContactEditName, 5, newSenderCompanyName);
		Reporter.log("User Saves Contact Details");
		PageBase.click(BookAPickupActions.SearchContactEditSave, 10);
		System.out.println("line 1587");
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(BookAPickupActions.popUpMsg, 10);
		//PageBase.verifyTextExist(BookAPickupActions.popUpMsg, "Address Successfully Updated To Addressbook");
		PageBase.click(BookAPickupActions.popUpClose, 5);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled();
	}

	public static void verifyReceiverAddress() {
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to My Contactcs Page");
		PageBase.click(MyTollHomePageActions.myContactMenu, 10); 
		Reporter.log("User Searches for New Contact added -" + newReceiverCompanyName);
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
	//	PageBase.verifyTextExist(BookAPickupActions.SearchContactEditCompanyNameErrorMsg, "Enter Company Name");
	//	PageBase.verifyTextExist(BookAPickupActions.SearchContactEditNameErrorMsg, "Enter First Name");
		PageBase.sendText(BookAPickupActions.SearchContactEditCompanyName, 5, newReceiverCompanyName);
		PageBase.sendText(BookAPickupActions.SearchContactEditName, 5, newReceiverCompanyName);
		Reporter.log("User Saves Contact Details");
		PageBase.click(BookAPickupActions.SearchContactEditSave, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(BookAPickupActions.popUpMsg, 10);
	//	PageBase.verifyTextExist(BookAPickupActions.popUpMsg, "Address Successfully Updated To Addressbook");
		PageBase.click(BookAPickupActions.popUpClose, 5);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled();
	}

	// QuickEntryMode

	public static void ClickQuickEntryMode() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(QuickEntryMode, 5);

	}

	public static void ItemTypeQME(String pItemType) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(itemTypeQME, 5);
		PageBase.ClickOn(By.xpath("//*[@id=\"gv-outr-pkg-selector\"]/div[2]/ul/li/div[text()='" + pItemType + "']"),
				10);
	}

	public static void EnterSenderRef(String pSenderRef) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(senderReferenceQME, pSenderRef, 10);

	}

	public static void EnterReceiverRef(String pSenderRef) {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(receiverReferenceQME, pSenderRef, 10);

	}

	public static void SelectDangerousGoodsDetailsQME(String lookupItem, String packageDescription, String pDgPkgQty,
			String pDgQtyKg) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(BookAPickupActions.UNNumberTextFieldQME, lookupItem, 5);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.SelectFrom(By.xpath("//*[@id=\"dg-popup-form\"]/td[1]/div/div[1]/ul/li/div"), 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SendKeysTo(BookAPickupActions.dgPackagingDescriptionQME, packageDescription, 5);
		PageBase.SendKeysTo(BookAPickupActions.dgPkgQtyQME, pDgPkgQty, 5);
		PageBase.SendKeysTo(BookAPickupActions.dgQtyKgQME, pDgQtyKg, 5);

	}

	public static void SelectPackgingGroupQME(String packagingGroup) {

		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(PackingGroupQME, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.SelectFrom(
				By.xpath("//*[@id=\"gv-packaging-grp-selector\"]/div/ul/li/div[text()='" + packagingGroup + "']"), 10);
		PageBase.MaximumWaitForElementEnabled();
	}

	// Draft Shipment
	public static void ClickSaveDraft() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(saveDraft, 5);

	}

	public static String GetSaveDraftButtonName() {
		return PageBase.GetText(saveDraft, 5);

	}

	public static String GetSaveDraftSuccessfulMessage() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(saveDraftSuccessfulMessage, 5);

	}

	public static void ClickGoToMyDashboardBtn() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(goToMyDashboardBtn, 5);

	}

	public static void ClickGoBackBtn() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(goBackBtn, 5);

	}

	public static void ClickDraftShipmentTabInMyDashboard() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(draftShipmentTabInMyDashboard, 5);

	}

	public static String GetDraftShipmentTabNameInMyDashboard() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(draftShipmentTabInMyDashboard, 5);

	}

	public static String GetDraftShipmentTollCarrierInMyDashboard() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(By.xpath("//*[@id=\"draftShipList\"]/tr/td[1]"), 5); // *[@id="draft1525"]/td[1]/text()

	}

	public static String GetDraftShipmentSenderInMyDashboard() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(By.xpath("//*[@id=\"draftShipList\"]/tr/td[2]"), 5); // *[@id="draft1525"]/td[1]/text()

	}

	public static String GetDraftShipmentReceiverInMyDashboard() {
		PageBase.MaximumWaitForElementEnabled();
		return PageBase.GetText(By.xpath("//*[@id=\"draftShipList\"]/tr/td[3]"), 5); // *[@id="draft1525"]/td[1]/text()

	}

	public static void DeleteExistingDraftShipments() {
		ClickDraftShipmentTabInMyDashboard();
		PageBase.MaximumWaitForElementEnabled();
		List<WebElement> list = BaseWebdriver.driver.findElements(draftShipmentList);
		System.out.println("Number of draft shipments   " + list.size());
		if (list.size() > 0) {

			for (int i = 1; i <= list.size(); i++) {

				PageBase.ClickOn(deleteButtonDraftShipmenInMyDashboard, 5);
				PageBase.MaximumWaitForElementEnabled();
				PageBase.ClickOn(continueDeleteButtonDraftShipmenInMyDashboard, 5);
				PageBase.MaximumWaitForElementEnabled();
			}
		}
	}

	public static void ClickOnDraftShipmenInMyDashboard() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.ClickOn(By.xpath("//*[@id=\"draftShipList\"]/tr/td[1]"), 5);

	}

	public static void VerifyDraftShipmentHasRemovedFromMyDashboard() {
		PageBase.MaximumWaitForElementEnabled();
		try {
			PageBase.GetText(By.xpath("//*[@id=\"draftShipList\"]/tr/td[1]"), 5);
			assertEquals("123", "1234");
		} catch (Exception ex) {
			System.out.println("Draft Shipment has been removed");
		}

	}

	public static void setQEMYes() {
		try {
			WebElement QEM = BaseWebdriver.driver.findElement(BookAPickupActions.itemDescriptionTextField);
			PageBase.click(By.cssSelector("span.switch-label"), 2);
			System.out.println("QEM Enabled");
		} catch (Exception ex) {
			System.out.println("QEM Already Enabled");
		}
	}

	public static void setQEMNo() {
		try {
			WebElement QEM = BaseWebdriver.driver.findElement(BookAPickupActions.itemDescriptionTextField);
			;
			System.out.println("QEM Already Not Enabled");
		} catch (Exception ex) {
			PageBase.click(By.cssSelector("span.switch-label"), 2);
			System.out.println("QEM Not Enabled");
		}
	}

}
