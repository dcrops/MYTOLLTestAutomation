package createShipmentE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import GlobalActions.PageBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import myTollHomePageActions.MyTollHomePageActions;
import createShipmentActions.ShipmentReviewActions;

public class TollIntermodalTests {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test(priority = 7)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "AccountNumber", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "PackingGroup", "DGNo", "DGoodsNo",
			"lookupName", "lookupItem", "packageDescription", "pDgPkgQty", "pDgQtyKg", "technicalName", "BillingType",
			"SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_DGFreight(String TollCarrier,
			String ServiceDGFreight, String AccountNumber, String ReceiverName, String ReceiverItem,
			Integer dropOffDepot, Integer collectionDepot, String DGContactName, String ShipmentRef1,
			String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, Integer DGYes, String PackingGroup, Integer DGNo, String lookupName,
			Integer lookupItem, String packageDescription, String pDgPkgQty, String pDgQtyKg, String technicalName,
			String BillingType, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceDGFreight);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);

		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

		CreateShipmentActions.SelectShipmentConsolidated();
		// PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterDGContactName(DGContactName);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.EnterBillingType(BillingType);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		// PageBase.Scrollbar(500, 1000);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		CreateShipmentActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty,
				pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(CreateShipmentActions.addNewLine, CreateShipmentActions.UNNumberDropdown);
		
		CreateShipmentActions.AddANewLineNZAUS(1000, 1500);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletNo, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 8)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "AccountNumber", "SenderName", "SenderItem",
			"ReceiverName", "ReceiverItem", "DropOffDepot", "CollectionDepot", "BillingType", "DGContactName",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight",
			"DGYes","PackingGroup", "DGNo", "DGoodsNo", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty", "pDgQtyKg",
			"technicalName", "BillingType", "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_DGFreight_ShipmentReview(String TollCarrier,
			String ServiceDGFreight, String AccountNumber, String SenderName, String SenderItem, String ReceiverName,
			String ReceiverItem, String dropOffDepot, String collectionDepot, String BillingType, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, String PackingGroup, Integer DGNo, String DGoodsNo, String lookupName,
			Integer lookupItem, String packageDescription, String pDgPkgQty, String pDgQtyKg, String technicalName,
			String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceDGFreight);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		// PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.mode);

		CreateShipmentActions.SelectSender(2);
		// CreateShipmentActions.EnterSender(SenderName, SenderItem);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString();
		System.out.println(sender);
		CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);
		CreateShipmentActions.EnterDGContactName(DGContactName);

		CreateShipmentActions.SelectShipmentConsolidated();
		// PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);
		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);
		// PageBase.Scrollbar(800, 1200);
		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		CreateShipmentActions.EnterTechnicalName(technicalName);
		PageBase.MoveToElement(CreateShipmentActions.addNewLine, CreateShipmentActions.UNNumberDropdown);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletNo, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review

		// ShipmentReviewActions.VerifyDispatchDate(pDispatchDate);

		ShipmentReviewActions.VerifyAccountNumber(AccountNumber);
		ShipmentReviewActions.VerifyTollCarrier(TollCarrier);
		ShipmentReviewActions.VerifySenderCompanyName(sender);
		ShipmentReviewActions.VerifyReceiverCompanyName(receiver);
		// ShipmentReviewActions.VerifyReceiverLocation();
		ShipmentReviewActions.VerifyService(ServiceDGFreight);
		// ShipmentReviewActions.VerifyWhopays();
		// ShipmentReviewActions.VerifyFoodPackaging(pFoodPackaging);
		ShipmentReviewActions.ClickItem1Arrowdown();
		ShipmentReviewActions.VerifyItemName1(ItemTemplateName);
		ShipmentReviewActions.VerifyPalletTransactionsInformation("Pallet Transactions information");
		// ShipmentReviewActions.VerifyItemDescription1();
		ShipmentReviewActions.VerifyNumberOfItems(NumberOfItems);
		ShipmentReviewActions.VerifyDimensions(Length + "cm *" + Width + "cm *" + Height + "cm");
		ShipmentReviewActions.VerifyVolume(Length + " m3");
		ShipmentReviewActions.VerifyWeight(Weight);
		ShipmentReviewActions.VerifyReference1(ShipmentRef1);
		ShipmentReviewActions.VerifyReference2(ShipmentRef2);
		ShipmentReviewActions.VerifyShipmentContainDGGoods(DGoodsNo);
	}

	@Test(priority = 1)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumber", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
			"TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Express(String TollCarrier, String ServiceExpress,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		// PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.whoPaysdropdown, CreateShipmentActions.accountNumber);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

		CreateShipmentActions.SelectShipmentConsolidated();
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		// BookAPickupActions.SelectDangerousGoods(DGNo);
		// PageBase.Scrollbar(800, 1000);
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletNo, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

	}

	@Test(priority = 2)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumber", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
			"TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Express_ShipmentReview(String TollCarrier,
			String ServiceExpress, String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot,
			String collectionDepot, String DGContactName, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight,
			Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);
		
		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		// PageBase.Scrollbar(250, 500);

		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

		CreateShipmentActions.SelectShipmentConsolidated();
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
		// PageBase.Scrollbar(800, 1000);
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletNo, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();
		// Shipment Review

		/*
		 * ShipmentReviewActions.VerifyDispatchDate(pDispatchDate);
		 * ShipmentReviewActions.VerifyAccountNumber(pAccountNumber);
		 * ShipmentReviewActions.VerifyTollCarrier(pTollCarrier);
		 * ShipmentReviewActions.VerifySenderCompanyName();
		 * ShipmentReviewActions.VerifyReceiverCompanyName();
		 * ShipmentReviewActions.VerifyReceiverLocation();
		 * ShipmentReviewActions.VerifyService(pService);
		 * ShipmentReviewActions.VerifyWhopays();
		 * ShipmentReviewActions.VerifyFoodPackaging(pFoodPackaging);
		 * ShipmentReviewActions.VerifyItemName1(pItemName1);
		 * ShipmentReviewActions.VerifyPalletTransactionsInformation();
		 * ShipmentReviewActions.VerifyItemDescription1();
		 * ShipmentReviewActions.VerifyNumberOfItems();
		 * ShipmentReviewActions.VerifyDimensions();
		 * ShipmentReviewActions.VerifyVolume(); ShipmentReviewActions.VerifyWeight();
		 * ShipmentReviewActions.VerifyReference1();
		 * ShipmentReviewActions.VerifyReference2();
		 * ShipmentReviewActions.VerifyShipmentContainDGGoods();
		 */
	}

	@Test(priority = 3)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "AccountNumber", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
			"TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_General(String TollCarrier, String ServiceGeneral,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		// PageBase.Scrollbar(250, 500);

		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

		CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		// PageBase.Scrollbar(800, 1000);
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletNo, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 4)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "AccountNumber", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
			"TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_General_ShipmentReview(String TollCarrier,
			String ServiceGeneral, String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot,
			String collectionDepot, String DGContactName, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight,
			Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);
		// CreateShipmentActions.SelectService(ServiceGeneral);

		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);

		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

		CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		// PageBase.Scrollbar(800, 1000);
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletNo, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review

		/*
		 * ShipmentReviewActions.VerifyDispatchDate(pDispatchDate);
		 * ShipmentReviewActions.VerifyAccountNumber(pAccountNumber);
		 * ShipmentReviewActions.VerifyTollCarrier(pTollCarrier);
		 * ShipmentReviewActions.VerifySenderCompanyName();
		 * ShipmentReviewActions.VerifyReceiverCompanyName();
		 * ShipmentReviewActions.VerifyReceiverLocation();
		 * ShipmentReviewActions.VerifyService(pService);
		 * ShipmentReviewActions.VerifyWhopays();
		 * ShipmentReviewActions.VerifyFoodPackaging(pFoodPackaging);
		 * ShipmentReviewActions.VerifyItemName1(pItemName1);
		 * ShipmentReviewActions.VerifyPalletTransactionsInformation();
		 * ShipmentReviewActions.VerifyItemDescription1();
		 * ShipmentReviewActions.VerifyNumberOfItems();
		 * ShipmentReviewActions.VerifyDimensions();
		 * ShipmentReviewActions.VerifyVolume(); ShipmentReviewActions.VerifyWeight();
		 * ShipmentReviewActions.VerifyReference1();
		 * ShipmentReviewActions.VerifyReference2();
		 * ShipmentReviewActions.VerifyShipmentContainDGGoods();
		 */

	}

	@Test(priority = 5)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "AccountNumber", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
			"TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Refrigeration(String TollCarrier,
			String ServiceRefrigeration, String AccountNumber, String ReceiverName, String ReceiverItem,
			String dropOffDepot, String collectionDepot, String DGContactName, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight,
			Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		CreateShipmentActions.EnterService(ServiceRefrigeration);
		
		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);

		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

		CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		// PageBase.Scrollbar(800, 1000);
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletNo, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 6)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "AccountNumber", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
			"TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Refrigeration_ShipmentReview(String TollCarrier,
			String ServiceRefrigeration, String AccountNumber, String ReceiverName, String ReceiverItem,
			String dropOffDepot, String collectionDepot, String DGContactName, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight,
			Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		CreateShipmentActions.EnterService(ServiceRefrigeration);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);

		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

		CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		// PageBase.Scrollbar(800, 1000);
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletNo, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	// Shipment Review

	/*
	 * ShipmentReviewActions.VerifyDispatchDate(pDispatchDate);
	 * ShipmentReviewActions.VerifyAccountNumber(pAccountNumber);
	 * ShipmentReviewActions.VerifyTollCarrier(pTollCarrier);
	 * ShipmentReviewActions.VerifySenderCompanyName();
	 * ShipmentReviewActions.VerifyReceiverCompanyName();
	 * ShipmentReviewActions.VerifyReceiverLocation();
	 * ShipmentReviewActions.VerifyService(pService);
	 * ShipmentReviewActions.VerifyWhopays();
	 * ShipmentReviewActions.VerifyFoodPackaging(pFoodPackaging);
	 * ShipmentReviewActions.VerifyItemName1(pItemName1);
	 * ShipmentReviewActions.VerifyPalletTransactionsInformation();
	 * ShipmentReviewActions.VerifyItemDescription1();
	 * ShipmentReviewActions.VerifyNumberOfItems();
	 * ShipmentReviewActions.VerifyDimensions();
	 * ShipmentReviewActions.VerifyVolume(); ShipmentReviewActions.VerifyWeight();
	 * ShipmentReviewActions.VerifyReference1();
	 * ShipmentReviewActions.VerifyReference2();
	 * ShipmentReviewActions.VerifyShipmentContainDGGoods();
	 */

}
