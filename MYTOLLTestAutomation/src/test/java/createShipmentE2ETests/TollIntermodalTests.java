package createShipmentE2ETests;

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

	@Test(priority = 1)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "AccountNumberTINTER", "whoPays", "Mode",
			"ReceiverName", "ReceiverItem", "DropOffDepot", "CollectionDepot", "dropOffDepot", "collectionDepot",
			"DGContactName", "DGContactNumber", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2", "Width2", "Height2",
			"Weight2", "DGYes", "PackingGroup", "DGNo", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty",
			"pDgQtyKg", "PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
			"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
			"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "technicalName", "BillingType",
			"SpeceialIns", "TollExtraServiceAmount", "LineItemName1Heading", "LineItemName2Heading",
			"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
			"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
			"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
			"ShipmentContainDangerousGoodsNo" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_DGFreight_ShipmentReview(String TollCarrier,
			String ServiceDGFreight, String AccountNumber, String whoPays, String Mode, String ReceiverName,
			String ReceiverItem, String DropOffDepot, String CollectionDepot, Integer dropOffDepot,
			Integer collectionDepot, String DGContactName, String DGContactNumber, String ShipmentRef1,
			String ShipmentRef2, String ItemTemplateName, String ItemTemplateName2, String NumberOfItems, String Length,
			String Width, String Height, String Weight, String NumberOfItems2, String Length2, String Width2,
			String Height2, String Weight2, Integer DGYes, Integer PackingGroup, Integer DGNo, String lookupName,
			Integer lookupItem, String packageDescription, String pDgPkgQty, String pDgQtyKg,
			String PalletTransactionsInfo, String ChepCustomer, String ChepExchange, String ChepTansferToToll,
			String ChepDocketNo, String LoscamCustomer, String LoascamExchange, String LoscamTransferToToll,
			String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange, String ChepOtherTransferToToll,
			String chepOtherDocketNo, String LoscamOtherExchange, String LoscamOtherTransferToToll,
			String LoscamOtherDocketNo, String PurchaseOrder, String technicalName, String BillingType,
			String SpeceialIns, String TollExtraServiceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceDGFreight);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString();
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);
		// CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);
		CreateShipmentActions.SelectReceiver(2);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidated();
		// PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterDGContactDetails(DGContactName, DGContactNumber);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		// PageBase.Scrollbar(500, 1000);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);

		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		BookAPickupActions.ClickAdd();
		String un = CreateShipmentActions.GetUNNumber();
		System.out.println("Un----" + un);
		String classDivision = CreateShipmentActions.GetClassDivision();
		System.out.println("Class----" + classDivision);
		String subRisk = CreateShipmentActions.GetSubRisk();
		System.out.println("Subrisk----" + subRisk);
		String packingGroup1 = CreateShipmentActions.GetPackingGroup();
		System.out.println("packingGroup1" + packingGroup1);
		String ProperShippingName = CreateShipmentActions.GetProperShippingName();
		System.out.println("ProperShippingName" + ProperShippingName);
		// PageBase.MoveToElement(CreateShipmentActions.addNewLine,
		// CreateShipmentActions.UNNumberDropdown);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.SelectPalletTransactionsYes();

		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(TollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceDGFreight, whoPays, CollectionDepot,
				Mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		ShipmentReviewActions.VerifyAdditionalInformation(SpeceialIns, PalletTransactionsInfo, PurchaseOrder,
				tollExtraServiceAmount);

		ShipmentReviewActions.VerifyPalletTransactionsInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);
		String numberOfItems = ItemsHeading+" " + NumberOfItems;
		ShipmentReviewActions.VerifyLineItem1Headings(LineItemName1Heading, ItemTemplateName, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions = Length + "cm x " + Width + "cm x " + Height + "cm";
		String weight = Weight + "kg";
		ShipmentReviewActions.VerifyLineItem1Values(ItemTemplateName, NumberOfItems, BillingType, dimensions,
				VolumeLineItem1, weight, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsYes);
		ShipmentReviewActions.VerifyDangerousGoodsDetails(DangerousGoodsDetailsHeading, lookupName, classDivision,
				packingGroup1, subRisk, ProperShippingName, packageDescription, pDgPkgQty, pDgQtyKg, technicalName);
		ShipmentReviewActions.VerifyLineItem2Headings(LineItemName2Heading, ItemTemplateName2, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions2 = Length2 + "cm x " + Width2 + "cm x " + Height2 + "cm";
		String weight2 = Weight2 + "kg";

		ShipmentReviewActions.VerifyLineItem2Values(ItemTemplateName2, NumberOfItems2, BillingType, dimensions2,
				VolumeLineItem2, weight2, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);

	}

	@Test(priority = 8)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "AccountNumberTINTER", "SenderName", "SenderItem",
			"ReceiverName", "ReceiverItem", "DropOffDepot", "CollectionDepot", "BillingType", "DGContactName",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2", "NumberOfItems", "Length", "Width",
			"NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "Height", "Weight", "DGYes", "PackingGroup",
			"DGNo", "DGoodsNo", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty", "pDgQtyKg",
			"technicalName", "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_DGFreight(String TollCarrier,
			String ServiceDGFreight, String AccountNumber, String SenderName, String SenderItem, String ReceiverName,
			String ReceiverItem, String dropOffDepot, String collectionDepot, String BillingType, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String ItemTemplateName2,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String NumberOfItems2,
			String Length2, String Width2, String Height2, String Weight2, Integer DGYes, Integer PackingGroup,
			Integer DGNo, String DGoodsNo, String lookupName, Integer lookupItem, String packageDescription,
			String pDgPkgQty, String pDgQtyKg, String technicalName, String SpeceialIns,
			String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceDGFreight);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		// PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		// CreateShipmentActions.EnterSender(SenderName, SenderItem);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString();
		System.out.println(sender);
		CreateShipmentActions.SelectReceiver(2);

		// CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);
		// CreateShipmentActions.EnterDGContactName(DGContactName);

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
		BookAPickupActions.ClickAdd();
		PageBase.MoveToElement(CreateShipmentActions.addNewLine, CreateShipmentActions.UNNumberDropdown);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
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
		// ShipmentReviewActions.ClickItem1Arrowdown();
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

	@Test(priority = 7)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
			"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Express(String TollCarrier, String ServiceExpress,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		// PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);

		// CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

		CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox,
				CreateShipmentActions.notifySenderCheckBox);

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

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

	}

	@Test(priority = 2)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
			"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Express_ShipmentReview(String TollCarrier,
			String ServiceExpress, String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot,
			String collectionDepot, String DGContactName, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String ItemTemplateName2, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns,
			String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		// PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);

		// CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

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

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

	}

	@Test(priority = 3)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
			"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_General(String TollCarrier, String ServiceGeneral,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		// PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);

		// CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

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

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 4)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
			"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_General_ShipmentReview(String TollCarrier,
			String ServiceGeneral, String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot,
			String collectionDepot, String DGContactName, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String ItemTemplateName2, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns,
			String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);
		// CreateShipmentActions.SelectService(ServiceGeneral);

		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);

		// CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

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

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
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
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "AccountNumberTINTER", "ReceiverName",
			"ReceiverItem", "DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2",
			"ItemTemplateName", "ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight",
			"NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns",
			"TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Refrigeration(String TollCarrier,
			String ServiceRefrigeration, String AccountNumber, String ReceiverName, String ReceiverItem,
			String dropOffDepot, String collectionDepot, String DGContactName, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String ItemTemplateName2, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns,
			String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		CreateShipmentActions.EnterService(ServiceRefrigeration);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);

		// CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

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

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		PageBase.MoveToElement(CreateShipmentActions.numberOfItem, BookAPickupActions.weight);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 6)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "AccountNumberTINTER", "ReceiverName",
			"ReceiverItem", "DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2",
			"ItemTemplateName", "ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight",
			"NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns",
			"TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Refrigeration_ShipmentReview(String TollCarrier,
			String ServiceRefrigeration, String AccountNumber, String ReceiverName, String ReceiverItem,
			String dropOffDepot, String collectionDepot, String DGContactName, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String ItemTemplateName2, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer DGNo, String BillingType, String SpeceialIns,
			String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		CreateShipmentActions.EnterService(ServiceRefrigeration);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);

		// CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);

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

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		PageBase.MoveToElement(CreateShipmentActions.numberOfItem, BookAPickupActions.weight);

		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
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
