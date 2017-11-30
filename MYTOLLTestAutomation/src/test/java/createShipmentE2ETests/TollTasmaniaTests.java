package createShipmentE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import createShipmentActions.ShipmentReviewActions;
import myTollHomePageActions.MyTollHomePageActions;

public class TollTasmaniaTests {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "ServiceDGFreight", "AccountNumberTTas", "whoPays", "Mode", "Sender",
			"Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber",
			"SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2", "Width2", "Height2",
			"Weight2", "DGYes", "PackingGroup", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty",
			"pDgQtyKg", "technicalName", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
			"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
			"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount",
			"LineItemName1Heading", "LineItemName2Heading", "ItemDescriptionHeading", "ItemsHeading",
			"BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading", "WeightHeading", "Reference1Heading",
			"Reference2Heading", "ShipmentContainDangerousGoodsHeading", "DangerousGoodsDetailsHeading",
			"VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
			"ShipmentContainDangerousGoodsNo" })

	public void CreateShipment_TollTasmania_E2ETest_TID_920_Service_DGFreight(String TollCarrier,
			String ServiceDGFreight, String AccountNumber, String whoPays, String Mode, Integer Sender,
			Integer Receiver, String QuoteNumber, String DropOffDepot, String CollectionDepot, String DGContactName,
			String DGContactNumber, String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2,
			String ItemTemplateName, String ItemTemplateName2, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String NumberOfItems2, String Length2, String Width2, String Height2,
			String Weight2, Integer DGYes, Integer PackingGroup, String lookupName, Integer lookupItem,
			String packageDescription, String pDgPkgQty, String pDgQtyKg, String technicalName, Integer DGNo,
			String BillingType, String SpeceialIns, Integer DGItem, String LookupSearch, String PalletTransactionsInfo,
			String ChepCustomer, String ChepExchange, String ChepTansferToToll, String ChepDocketNo,
			String LoscamCustomer, String LoascamExchange, String LoscamTransferToToll, String LoscamDocketNo,
			String OtherCostomer, String ChepOtherExchange, String ChepOtherTransferToToll, String chepOtherDocketNo,
			String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo,
			String PurchaseOrder, String TollExtraSrviceAmount, String LineItemName1Heading,
			String LineItemName2Heading, String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading,
			String DimensionsHeading, String TotalVolumeHeading, String WeightHeading, String Reference1Heading,
			String Reference2Heading, String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading,
			String VolumeLineItem1, String VolumeLineItem2, String ShipmentContainDangerousGoodsYes,
			String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceDGFreight);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		CreateShipmentActions.SelectShipmentConsolidated();
		String sender = CreateShipmentActions.GetSenderCompanyName().toString();
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(2);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		PageBase.Scrollbar(250, 500);

		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);

		CreateShipmentActions.EnterDGContactDetails(DGContactName, DGContactNumber);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.EnterBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		BookAPickupActions.EnterTechnicalName(technicalName);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
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
		// CreateShipmentActions.AddANewLineNZAUS();
		// CreateShipmentActions.EnterBillingType(BillingType);
		// CreateShipmentActions.ItemType(2);
		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTollTasmania(TollCarrier, AccountNumber, sender, senderLocation,
				receiver, receiverLocation, ShipmentRef1, ShipmentRef2, ServiceDGFreight, whoPays, CollectionDepot,
				"ROAD");

		String tollExtraServiceAmount = "$" + TollExtraSrviceAmount;
		ShipmentReviewActions.VerifyAdditionalInformation(SpeceialIns, PalletTransactionsInfo, PurchaseOrder,
				tollExtraServiceAmount);

		ShipmentReviewActions.VerifyPalletTransactionsInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);
		String numberOfItems = ItemsHeading + " " + NumberOfItems;
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

	@Test
	@Parameters({ "TollCarrierTollTasmania", "ServiceExpress", "AccountNumberTTas", "whoPays", "Mode", "Sender",
			"Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber",
			"SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2", "Width2", "Height2",
			"Weight2", "DGYes", "PackingGroup", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty",
			"pDgQtyKg", "technicalName", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
			"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
			"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount",
			"LineItemName1Heading", "LineItemName2Heading", "ItemDescriptionHeading", "ItemsHeading",
			"BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading", "WeightHeading", "Reference1Heading",
			"Reference2Heading", "ShipmentContainDangerousGoodsHeading", "DangerousGoodsDetailsHeading",
			"VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
			"ShipmentContainDangerousGoodsNo" })

	public void CreateShipment_TollTasmania_E2ETest_TID_920_Service_Express(String TollCarrier, String ServiceExpress,
			String AccountNumber, String whoPays, String Mode, Integer Sender, Integer Receiver, String QuoteNumber,
			String DropOffDepot, String CollectionDepot, String DGContactName, String DGContactNumber,
			String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer PackingGroup, String lookupName, Integer lookupItem, String packageDescription, String pDgPkgQty,
			String pDgQtyKg, String technicalName, Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem,
			String LookupSearch, String PalletTransactionsInfo, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder,
			String TollExtraSrviceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		CreateShipmentActions.SelectShipmentConsolidated();
		String sender = CreateShipmentActions.GetSenderCompanyName().toString();
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(2);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		PageBase.Scrollbar(250, 500);

		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);

	
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTollTasmania(TollCarrier, AccountNumber, sender, senderLocation,
				receiver, receiverLocation, ShipmentRef1, ShipmentRef2, ServiceExpress, whoPays, CollectionDepot,
				"ROAD");

		String tollExtraServiceAmount = "$" + TollExtraSrviceAmount;
		ShipmentReviewActions.VerifyAdditionalInformation(SpeceialIns, PalletTransactionsInfo, PurchaseOrder,
				tollExtraServiceAmount);

		ShipmentReviewActions.VerifyPalletTransactionsInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);
		String numberOfItems = ItemsHeading + " " + NumberOfItems;
		ShipmentReviewActions.VerifyLineItem1Headings(LineItemName1Heading, ItemTemplateName, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions = Length + "cm x " + Width + "cm x " + Height + "cm";
		String weight = Weight + "kg";
		ShipmentReviewActions.VerifyLineItem1Values(ItemTemplateName, NumberOfItems, BillingType, dimensions,
				VolumeLineItem1, weight, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);

		ShipmentReviewActions.VerifyLineItem2Headings(LineItemName2Heading, ItemTemplateName2, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions2 = Length2 + "cm x " + Width2 + "cm x " + Height2 + "cm";
		String weight2 = Weight2 + "kg";

		ShipmentReviewActions.VerifyLineItem2Values(ItemTemplateName2, NumberOfItems2, BillingType, dimensions2,
				VolumeLineItem2, weight2, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "ServiceGeneral", "AccountNumberTTas", "whoPays", "Mode", "Sender",
			"Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber",
			"SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2", "Width2", "Height2",
			"Weight2", "DGYes", "PackingGroup", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty",
			"pDgQtyKg", "technicalName", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
			"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
			"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraServiceAmount",
			"LineItemName1Heading", "LineItemName2Heading", "ItemDescriptionHeading", "ItemsHeading",
			"BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading", "WeightHeading", "Reference1Heading",
			"Reference2Heading", "ShipmentContainDangerousGoodsHeading", "DangerousGoodsDetailsHeading",
			"VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
			"ShipmentContainDangerousGoodsNo" })

	public void CreateShipment_TollTasmania_E2ETest_TID_920_Service_General(String TollCarrier, String ServiceGeneral,
			String AccountNumber, String whoPays, String Mode, Integer Sender, Integer Receiver, String QuoteNumber,
			String DropOffDepot, String CollectionDepot, String DGContactName, String DGContactNumber,
			String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer PackingGroup, String lookupName, Integer lookupItem, String packageDescription, String pDgPkgQty,
			String pDgQtyKg, String technicalName, Integer DGNo, String BillingType, String SpeceialIns, Integer DGItem,
			String LookupSearch, String PalletTransactionsInfo, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder,
			String TollExtraSrviceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		CreateShipmentActions.SelectShipmentConsolidated();
		String sender = CreateShipmentActions.GetSenderCompanyName().toString();
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(2);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		PageBase.Scrollbar(250, 500);

		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);

	
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);

		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTollTasmania(TollCarrier, AccountNumber, sender, senderLocation,
				receiver, receiverLocation, ShipmentRef1, ShipmentRef2, ServiceGeneral, whoPays, CollectionDepot,
				"ROAD");

		String tollExtraServiceAmount = "$" + TollExtraSrviceAmount;
		ShipmentReviewActions.VerifyAdditionalInformation(SpeceialIns, PalletTransactionsInfo, PurchaseOrder,
				tollExtraServiceAmount);

		ShipmentReviewActions.VerifyPalletTransactionsInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);
		String numberOfItems = ItemsHeading + " " + NumberOfItems;
		ShipmentReviewActions.VerifyLineItem1Headings(LineItemName1Heading, ItemTemplateName, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions = Length + "cm x " + Width + "cm x " + Height + "cm";
		String weight = Weight + "kg";
		ShipmentReviewActions.VerifyLineItem1Values(ItemTemplateName, NumberOfItems, BillingType, dimensions,
				VolumeLineItem1, weight, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);

		ShipmentReviewActions.VerifyLineItem2Headings(LineItemName2Heading, ItemTemplateName2, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions2 = Length2 + "cm x " + Width2 + "cm x " + Height2 + "cm";
		String weight2 = Weight2 + "kg";

		ShipmentReviewActions.VerifyLineItem2Values(ItemTemplateName2, NumberOfItems2, BillingType, dimensions2,
				VolumeLineItem2, weight2, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
	}

	@Test
	@Parameters({ "TollCarrierTollTasmania", "ServiceRefrigeration", "AccountNumberTTas", "WhoPays", "whoPays",
		"ModeInt", "ModeRoad", "Sender", "Receiver", "QuoteNumber", "dropOffDepot", "DropOffDepot",
		"CollectionDepot", "DGContactName", "SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2",
		"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "ItemTemplateName2",
		"NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns",
		"DGItem", "LookupSearch", "PackageDescription", "DgPkgQty", "DgQtyKg", "ChepCustomer", "ChepExchange",
		"ChepTansferToToll", "ChepDocketNo", "LoscamCustomer", "LoascamExchange", "LoscamTransferToToll",
		"LoscamDocketNo", "OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo",
		"LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PalletTransactionsInfo",
		"PurchaseOrder", "TollExtraServiceAmount", "LineItemName1Heading", "LineItemName2Heading",
		"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
		"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
		"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo" })

	public void CreateShipment_TollTasmania_E2ETest_TID_920_Service_Refrigeration(String TollCarrier,
			String ServiceRefrigeration, String AccountNumber, Integer WhoPays, String whoPays, Integer ModeInt,
			String ModeRoad, Integer Sender, Integer Receiver, String QuoteNumber, String dropOffDepot,
			String DropOffDepot, String CollectionDepot, String DGContactName, String SenderEmail, String ReceiverEmail,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, String ItemTemplateName2, String NumberOfItems2, String Length2,
			String Width2, String Height2, String Weight2, Integer DGYes, Integer DGNo, String BillingType,
			String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty,
			String DgQtyKg, String ChepCustomer, String ChepExchange, String ChepTansferToToll, String ChepDocketNo,
			String LoscamCustomer, String LoascamExchange, String LoscamTransferToToll, String LoscamDocketNo,
			String OtherCostomer, String ChepOtherExchange, String ChepOtherTransferToToll, String chepOtherDocketNo,
			String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo,
			String PalletTransactionsInfo, String PurchaseOrder, String TollExtraSrviceAmount,
			String LineItemName1Heading, String LineItemName2Heading, String ItemDescriptionHeading,
			String ItemsHeading, String BillingTypeHeading, String DimensionsHeading, String TotalVolumeHeading,
			String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceRefrigeration);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString();
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidated();
		
		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		BookAPickupActions.SelectDangerousGoods(DGNo);
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
		
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTollTasmania(TollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2,  ServiceRefrigeration, whoPays,
				CollectionDepot, ModeRoad);

		String tollExtraServiceAmount = "$" + TollExtraSrviceAmount;
		ShipmentReviewActions.VerifyAdditionalInformation(SpeceialIns, PalletTransactionsInfo, PurchaseOrder,
				tollExtraServiceAmount);

		ShipmentReviewActions.VerifyPalletTransactionsInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);
		String numberOfItems = ItemsHeading + " " + NumberOfItems;
		ShipmentReviewActions.VerifyLineItem1Headings(LineItemName1Heading, ItemTemplateName, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions = Length + "cm x " + Width + "cm x " + Height + "cm";
		String weight = Weight + "kg";
		ShipmentReviewActions.VerifyLineItem1Values(ItemTemplateName, NumberOfItems, BillingType, dimensions,
				VolumeLineItem1, weight, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);

		ShipmentReviewActions.VerifyLineItem2Headings(LineItemName2Heading, ItemTemplateName2, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions2 = Length2 + "cm x " + Width2 + "cm x " + Height2 + "cm";
		String weight2 = Weight2 + "kg";

		ShipmentReviewActions.VerifyLineItem2Values(ItemTemplateName2, NumberOfItems2, BillingType, dimensions2,
				VolumeLineItem2, weight2, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
	}

}
