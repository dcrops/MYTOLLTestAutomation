package createShipmentE2ETests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import myTollHomePageActions.MyTollHomePageActions;

public class TollNQXTollExpressTests {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test(priority = 1)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceGeneral", "AccountNumberTNQX", "WhoPays", "Mode", "Sender",
			"Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "SenderEmail",
			"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
			"Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2",
			"DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch", "PackageDescription", "DgPkgQty",
			"DgQtyKg", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo", "LoscamCustomer",
			"LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer", "ChepOtherExchange",
			"ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange", "LoscamOtherTransferToToll",
			"LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount" })

	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_General(String TollCarrierItem,
			String ServiceGeneral, String AccountNumber, Integer WhoPays, Integer Mode, Integer Sender,
			Integer Receiver, String QuoteNumber, String dropOffDepot, String collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String ItemTemplateName2,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem, String LookupSearch,
			String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder,
			String TollExtraSrviceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrierItem);

		CreateShipmentActions.EnterService(ServiceGeneral);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		// CreateShipmentActions.SelectShipmentConsolidated();
		CreateShipmentActions.SelectShipmentConsolidated();

		// CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		// CreateShipmentActions.SelectShipmentConsolidated();
		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
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
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 2)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceExpress", "AccountNumberTNQX", "WhoPays", "Mode", "Sender",
			"Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "SenderEmail",
			"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
			"Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2",
			"DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch", "PackageDescription", "DgPkgQty",
			"DgQtyKg", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo", "LoscamCustomer",
			"LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer", "ChepOtherExchange",
			"ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange", "LoscamOtherTransferToToll",
			"LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount" })

	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_Express(String TollCarrierItem,
			String ServiceExpress, String AccountNumber, Integer WhoPays, Integer Mode, Integer Sender,
			Integer Receiver, String QuoteNumber, String dropOffDepot, String collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String ItemTemplateName2,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem, String LookupSearch,
			String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder,
			String TollExtraSrviceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrierItem);

		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectMode(Mode);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidated();

		// CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		// CreateShipmentActions.SelectShipmentConsolidated();
		// CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		// CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
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
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 3)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServicePremium", "AccountNumberTNQX", "WhoPays", "Mode", "Sender",
			"Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "SenderEmail",
			"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
			"Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2",
			"DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch", "PackageDescription", "DgPkgQty",
			"DgQtyKg", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo", "LoscamCustomer",
			"LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer", "ChepOtherExchange",
			"ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange", "LoscamOtherTransferToToll",
			"LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount" })

	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_Premium(String TollCarrierItem,
			String TollNQXServicePremium, String AccountNumber, Integer WhoPays, Integer Mode, Integer Sender,
			Integer Receiver, String QuoteNumber, String dropOffDepot, String collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String ItemTemplateName2,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem, String LookupSearch,
			String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder,
			String TollExtraSrviceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrierItem);
		CreateShipmentActions.EnterService(TollNQXServicePremium);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidated();
		// PageBase.Scrollbar(250, 500);

		// CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		// CreateShipmentActions.SelectShipmentConsolidated();
		// CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		// CreateShipmentActions.SelectCollectionDepot(collectionDepot);
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
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 4)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceRefrigeration", "AccountNumberTNQX", "WhoPays", "Mode",
			"Sender", "Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "SenderEmail",
			"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
			"Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2",
			"DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch", "PackageDescription", "DgPkgQty",
			"DgQtyKg", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo", "LoscamCustomer",
			"LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer", "ChepOtherExchange",
			"ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange", "LoscamOtherTransferToToll",
			"LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount" })

	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_Refrigeration(String TollCarrierItem,
			String ServiceRefrigeration, String AccountNumber, Integer WhoPays, Integer Mode, Integer Sender,
			Integer Receiver, String QuoteNumber, String dropOffDepot, String collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String ItemTemplateName2,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem, String LookupSearch,
			String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder,
			String TollExtraSrviceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrierItem);

		CreateShipmentActions.EnterService(ServiceRefrigeration);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidated();
		// PageBase.Scrollbar(250, 500);

		// CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		// CreateShipmentActions.SelectShipmentConsolidated();
		// CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		// CreateShipmentActions.SelectCollectionDepot(collectionDepot);
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
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.ItemType(2);

		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 5)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceDangerousGoods", "AccountNumberTNQX", "WhoPays", "Mode",
			"Sender", "Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber",
			"SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2",
			"Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription", "DgPkgQty", "DgQtyKg", "ChepCustomer", "ChepExchange", "ChepTansferToToll",
			"ChepDocketNo", "LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount" })

	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_DangerousGoods(String TollCarrierItem,
			String ServiceDangerousGoods, String AccountNumber, Integer WhoPays, Integer Mode, Integer Sender,
			Integer Receiver, String QuoteNumber, String dropOffDepot, String collectionDepot, String DGContactName,
			String DGContactNumber, String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String ItemTemplateName2, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem,
			String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer,
			String ChepExchange, String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer,
			String LoascamExchange, String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,
			String ChepOtherExchange, String ChepOtherTransferToToll, String chepOtherDocketNo,
			String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo,
			String PurchaseOrder, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrierItem);

		CreateShipmentActions.EnterService(ServiceDangerousGoods);
		// CreateShipmentActions.ClickContinueAccountChangeMsg();

		BookAPickupActions.EnterAccountNumber(AccountNumber);

		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidated();
		// PageBase.Scrollbar(250, 500);
		// CreateShipmentActions.VerifyDGContactName(DGContactName);
		// CreateShipmentActions.VerifyDGContactNumber(DGContactNumber);

		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		// CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		// CreateShipmentActions.SelectShipmentConsolidated();
		// CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		// CreateShipmentActions.SelectCollectionDepot(collectionDepot);
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
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 6)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceDGExpress", "AccountNumberTNQX", "WhoPays", "Mode", "Sender",
			"Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber",
			"SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2",
			"Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription", "DgPkgQty", "DgQtyKg", "ChepCustomer", "ChepExchange", "ChepTansferToToll",
			"ChepDocketNo", "LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount" })

	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_DGExpress(String TollCarrierItem,
			String ServiceDGExpress, String AccountNumber, Integer WhoPays, Integer Mode, Integer Sender,
			Integer Receiver, String QuoteNumber, String dropOffDepot, String collectionDepot, String DGContactName,
			String DGContactNumber, String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String ItemTemplateName2, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem,
			String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer,
			String ChepExchange, String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer,
			String LoascamExchange, String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,
			String ChepOtherExchange, String ChepOtherTransferToToll, String chepOtherDocketNo,
			String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo,
			String PurchaseOrder, String TollExtraSrviceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrierItem);

		CreateShipmentActions.EnterService(ServiceDGExpress);
		// CreateShipmentActions.ClickContinueAccountChangeMsg();

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidated();
		// PageBase.Scrollbar(250, 500);
		// CreateShipmentActions.VerifyDGContactName(DGContactName);
		// CreateShipmentActions.VerifyDGContactNumber(DGContactNumber);

		// CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		// CreateShipmentActions.SelectShipmentConsolidated();
		// CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		// CreateShipmentActions.SelectCollectionDepot(collectionDepot);
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
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 7)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceDGRefrigerated", "AccountNumberTNQX", "WhoPays", "Mode",
			"Sender", "Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber",
			"SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2",
			"Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription", "DgPkgQty", "DgQtyKg", "ChepCustomer", "ChepExchange", "ChepTansferToToll",
			"ChepDocketNo", "LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount" })

	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_DGRefrigerated(String TollCarrierItem,
			String ServiceDGRefrigerated, String AccountNumber, Integer WhoPays, Integer Mode, Integer Sender,
			Integer Receiver, String QuoteNumber, String dropOffDepot, String collectionDepot, String DGContactName,
			String DGContactNumber, String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String ItemTemplateName2, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem,
			String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer,
			String ChepExchange, String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer,
			String LoascamExchange, String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,
			String ChepOtherExchange, String ChepOtherTransferToToll, String chepOtherDocketNo,
			String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo,
			String PurchaseOrder, String TollExtraSrviceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrierItem);

		CreateShipmentActions.EnterService(ServiceDGRefrigerated);
		// CreateShipmentActions.ClickContinueAccountChangeMsg();

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidated();
		// PageBase.Scrollbar(250, 500);
		PageBase.MaximumWaitForElementEnabled();
		// CreateShipmentActions.VerifyDGContactName(DGContactName);
		// CreateShipmentActions.VerifyDGContactNumber(DGContactNumber);

		// CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		// CreateShipmentActions.SelectShipmentConsolidated();
		// CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		// CreateShipmentActions.SelectCollectionDepot(collectionDepot);
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
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 8)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceRailGeneral", "AccountNumberTNQX", "WhoPays", "Mode",
			"Sender", "Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber",
			"SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2",
			"Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription", "DgPkgQty", "DgQtyKg", "ChepCustomer", "ChepExchange", "ChepTansferToToll",
			"ChepDocketNo", "LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount" })

	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_RailGeneral(String TollCarrierItem,
			String ServiceRailGeneral, String AccountNumber, Integer WhoPays, Integer Mode, Integer Sender,
			Integer Receiver, String QuoteNumber, String dropOffDepot, String collectionDepot, String DGContactName,
			String DGContactNumber, String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String ItemTemplateName2, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem,
			String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer,
			String ChepExchange, String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer,
			String LoascamExchange, String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,
			String ChepOtherExchange, String ChepOtherTransferToToll, String chepOtherDocketNo,
			String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo,
			String PurchaseOrder, String TollExtraSrviceAmount) {
		BookAPickupActions.EnterTollCarrier(TollCarrierItem);

		CreateShipmentActions.EnterService(ServiceRailGeneral);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);

		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidated();
		// PageBase.Scrollbar(250, 500);
		PageBase.MediumWaitForElementEnabled();

		// CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);

		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		// CreateShipmentActions.SelectShipmentConsolidated();
		// CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		// CreateShipmentActions.SelectCollectionDepot(collectionDepot);
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
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.ItemType(2);

		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.addPalletNo, CreateShipmentActions.senderReference);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 9)
	@Parameters({ "TollCarrierTollNQXTollExpress", "ServiceRailDangerousGoods", "AccountNumberTNQX", "WhoPays", "Mode",
			"Sender", "Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber",
			"SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2",
			"Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription", "DgPkgQty", "DgQtyKg", "ChepCustomer", "ChepExchange", "ChepTansferToToll",
			"ChepDocketNo", "LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount" })

	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_RailDangerousGoods(String TollCarrierItem,
			String ServiceRailDangerousGoods, String AccountNumber, Integer WhoPays, Integer Mode, Integer Sender,
			Integer Receiver, String QuoteNumber, String dropOffDepot, String collectionDepot, String DGContactName,
			String DGContactNumber, String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String ItemTemplateName2, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem,
			String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer,
			String ChepExchange, String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer,
			String LoascamExchange, String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,
			String ChepOtherExchange, String ChepOtherTransferToToll, String chepOtherDocketNo,
			String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo,
			String PurchaseOrder, String TollExtraSrviceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrierItem);

		CreateShipmentActions.EnterService(ServiceRailDangerousGoods);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		// CreateShipmentActions.EnterDGContactName(DGContactName);

		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidated();
		// PageBase.Scrollbar(250, 500);
		// CreateShipmentActions.VerifyDGContactName(DGContactName);
		// CreateShipmentActions.VerifyDGContactNumber(DGContactNumber);

		// CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		// CreateShipmentActions.SelectShipmentConsolidated();
		// CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		// CreateShipmentActions.SelectCollectionDepot(collectionDepot);
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
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		// BookAPickupActions.SelectDangerousGoods(DGNo);
		// PageBase.Scrollbar(800, 1000);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.addPalletNo, CreateShipmentActions.senderReference);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();
	}

}
