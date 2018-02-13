package createShipmentE2ETests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import createShipmentActions.ShipmentReviewActions;
import myTollHomePageActions.MyTollHomePageActions;

public class IntermodalSpecializedTests {

	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		PageBase.MediumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	//@Test(priority = 2)
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceGeneral", "AccountNumberTNQX", "WhoPays", "whoPays",
			"ModeInt", "ModeRoad", "Sender", "Receiver", "QuoteNumber", "dropOffDepot", "DropOffDepot",
			"CollectionDepot", "DGContactName","DGContactNumber", "SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2",
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

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_General(String TollCarrier,
			String ServiceGeneral, String AccountNumber, Integer WhoPays, String whoPays, Integer ModeInt,
			String ModeRoad, Integer Sender, Integer Receiver, String QuoteNumber, String dropOffDepot,
			String DropOffDepot, String CollectionDepot, String DGContactName,String DGContactNumber, String SenderEmail, String ReceiverEmail,
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

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		CreateShipmentActions.EnterService(ServiceGeneral);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();
		
		PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
				CreateShipmentActions.notifyReceiverCheckBox);
		//CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);

		CreateShipmentActions.EnterDropOffDepot(DropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);

		
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
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
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceGeneral, whoPays, CollectionDepot,
				mode);

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

	//@Test(priority = 5)
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceExpress", "AccountNumberTNQX", "WhoPays", "whoPays",
			"ModeInt", "ModeRoad", "Sender", "Receiver", "QuoteNumber", "DropOffDepot", "DropOffDepot",
			"CollectionDepot", "DGContactName", "DGContactNumber","SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2",
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

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_Express(String TollCarrier,
			String ServiceExpress, String AccountNumber, Integer WhoPays, String whoPays, Integer ModeInt,
			String ModeRoad, Integer Sender, Integer Receiver, String QuoteNumber, String dropOffDepot,
			String DropOffDepot, String collectionDepot, String DGContactName, String DGContactNumber, String SenderEmail, String ReceiverEmail,
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

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();

		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
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
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceExpress, whoPays, collectionDepot,
				mode);

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

	//@Test(priority = 3)
	@Test(groups = { "Shakeout Testing" })
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServicePremium", "AccountNumberTNQX", "WhoPays", "whoPays",
			"ModeInt", "ModeRoad", "Sender", "Receiver", "QuoteNumber", "DropOffDepot", "DropOffDepot",
			"CollectionDepot", "DGContactName","DGContactNumber", "SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2",
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

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_Premium(String TollCarrier,
			String TollNQXServicePremium, String AccountNumber, Integer WhoPays, String whoPays, Integer ModeInt,
			String ModeRoad, Integer Sender, Integer Receiver, String QuoteNumber, String dropOffDepot,
			String DropOffDepot, String collectionDepot, String DGContactName,String DGContactNumber, String SenderEmail, String ReceiverEmail,
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

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		CreateShipmentActions.EnterService(TollNQXServicePremium);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();

		//CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
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
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, TollNQXServicePremium, whoPays,
				collectionDepot, mode);

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

	//@Test(priority = 4)
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceRefrigeration", "AccountNumberTNQX", "WhoPays", "whoPays",
			"ModeInt", "ModeRoad", "Sender", "Receiver", "QuoteNumber", "dropOffDepot", "DropOffDepot",
			"CollectionDepot", "DGContactName","DGContactNumber", "SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2",
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

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_Refrigeration(String TollCarrier,
			String ServiceRefrigeration, String AccountNumber, Integer WhoPays, String whoPays, Integer ModeInt,
			String ModeRoad, Integer Sender, Integer Receiver, String QuoteNumber, String dropOffDepot,
			String DropOffDepot, String CollectionDepot, String DGContactName,String DGContactNumber, String SenderEmail, String ReceiverEmail,
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

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();

		CreateShipmentActions.EnterService(ServiceRefrigeration);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();
		// PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
		// CreateShipmentActions.notifyReceiverCheckBox);
		//CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		CreateShipmentActions.EnterDropOffDepot(DropOffDepot);
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
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceRefrigeration, whoPays,
				CollectionDepot, mode);

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
	
	@Test(priority=-1)
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceFCL", "AccountNumberTNQX", "WhoPays", "whoPays",
			"ModeInt", "ModeRoad", "Sender", "Receiver", "QuoteNumber", "dropOffDepot", "DropOffDepot",
			"CollectionDepot", "DGContactName","DGContactNumber", "SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2",
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

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_FCL(String TollCarrier,
			String ServiceFCL, String AccountNumber, Integer WhoPays, String whoPays, Integer ModeInt,
			String ModeRoad, Integer Sender, Integer Receiver, String QuoteNumber, String dropOffDepot,
			String DropOffDepot, String CollectionDepot, String DGContactName,String DGContactNumber, String SenderEmail, String ReceiverEmail,
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

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();

		CreateShipmentActions.EnterService(ServiceFCL);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();
		// PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
		// CreateShipmentActions.notifyReceiverCheckBox);
		//CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		CreateShipmentActions.EnterDropOffDepot(DropOffDepot);
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
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceFCL, whoPays,
				CollectionDepot, mode);

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


	//@Test(priority = 1)
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceDangerousGoods", "AccountNumberTNQX","WhoPays", "whoPays", "ModeInt",
			"ModeRoad", "ReceiverName", "ReceiverItem", "Sender", "Receiver", "QuoteNumber", "DropOffDepot",
			"CollectionDepot", "dropOffDepot", "collectionDepot", "DGContactName", "DGContactNumber", "SenderEmail",
			"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes",
			"PackingGroup", "DGNo", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty", "pDgQtyKg",
			"PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
			"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
			"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "technicalName", "BillingType",
			"SpeceialIns", "TollExtraServiceAmount", "LineItemName1Heading", "LineItemName2Heading",
			"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
			"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
			"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
			"ShipmentContainDangerousGoodsNo" })

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_DangerousGoods(String TollCarrier,
			String ServiceDangerousGoods, String AccountNumber, Integer WhoPays, String whoPays, Integer ModeInt,
			String ModeRoad, String ReceiverName, String ReceiverItem, Integer Sender, Integer Receiver,
			String QuoteNumber, String DropOffDepot, String CollectionDepot, String dropOffDepot,
			String collectionDepot, String DGContactName, String DGContactNumber, String SenderEmail,
			String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer PackingGroup, Integer DGNo, String lookupName, Integer lookupItem, String packageDescription,
			String pDgPkgQty, String pDgQtyKg, String PalletTransactionsInfo, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String technicalName,
			String BillingType, String SpeceialIns, String TollExtraServiceAmount, String LineItemName1Heading,
			String LineItemName2Heading, String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading,
			String DimensionsHeading, String TotalVolumeHeading, String WeightHeading, String Reference1Heading,
			String Reference2Heading, String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading,
			String VolumeLineItem1, String VolumeLineItem2, String ShipmentContainDangerousGoodsYes,
			String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		CreateShipmentActions.EnterService(ServiceDangerousGoods);

		BookAPickupActions.EnterAccountNumber(AccountNumber);

		CreateShipmentActions.SelectWhoPays(WhoPays);

		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();

		PageBase.MinimumWaitForElementEnabled();
		// PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
		// CreateShipmentActions.notifyReceiverCheckBox);
		//CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);

		CreateShipmentActions.EnterDropOffDepot(DropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);

		CreateShipmentActions.EnterDGContactDetails(DGContactName, DGContactNumber);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);

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
		//CreateShipmentActions.SelectFoodPackagingYes();
		//CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceDangerousGoods, whoPays,
				CollectionDepot, mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		ShipmentReviewActions.VerifyAdditionalInformationForDangerousGoods(SpeceialIns, PalletTransactionsInfo, PurchaseOrder);

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

	//@Test(priority = 4)
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceDGExpress", "AccountNumberTNQX", "WhoPays", "whoPays", "ModeInt",
		"ModeRoad", "ReceiverName", "ReceiverItem", "Sender", "Receiver", "QuoteNumber", "DropOffDepot",
		"CollectionDepot", "dropOffDepot", "collectionDepot", "DGContactName", "DGContactNumber", "SenderEmail",
		"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2", "NumberOfItems",
		"Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes",
		"PackingGroup", "DGNo", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty", "pDgQtyKg",
		"PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
		"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
		"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
		"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "technicalName", "BillingType",
		"SpeceialIns", "TollExtraServiceAmount", "LineItemName1Heading", "LineItemName2Heading",
		"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
		"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
		"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo"})

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_DGExpress(String TollCarrier,
			String ServiceDGExpress, String AccountNumber, Integer WhoPays, String whoPays, Integer ModeInt,
			String ModeRoad, String ReceiverName, String ReceiverItem, Integer Sender, Integer Receiver,
			String QuoteNumber, String DropOffDepot, String CollectionDepot, String dropOffDepot,
			String collectionDepot, String DGContactName, String DGContactNumber, String SenderEmail,
			String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer PackingGroup, Integer DGNo, String lookupName, Integer lookupItem, String packageDescription,
			String pDgPkgQty, String pDgQtyKg, String PalletTransactionsInfo, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String technicalName,
			String BillingType, String SpeceialIns, String TollExtraServiceAmount, String LineItemName1Heading,
			String LineItemName2Heading, String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading,
			String DimensionsHeading, String TotalVolumeHeading, String WeightHeading, String Reference1Heading,
			String Reference2Heading, String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading,
			String VolumeLineItem1, String VolumeLineItem2, String ShipmentContainDangerousGoodsYes,
			String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		CreateShipmentActions.EnterService(ServiceDGExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);


		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.quoteNumber,CreateShipmentActions.accountNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.MinimumWaitForElementEnabled();
		// PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
		// CreateShipmentActions.notifyReceiverCheckBox);
		//CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);

		CreateShipmentActions.EnterDropOffDepot(DropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);

		CreateShipmentActions.EnterDGContactDetails(DGContactName, DGContactNumber);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
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
		//CreateShipmentActions.SelectFoodPackagingYes();
		//CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceDGExpress, whoPays,
				CollectionDepot, mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		ShipmentReviewActions.VerifyAdditionalInformationForDangerousGoods(SpeceialIns, PalletTransactionsInfo, PurchaseOrder);

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

	//@Test(priority = 3)
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceDGRefrigerated", "AccountNumberTNQX", "WhoPays", "whoPays", "ModeInt",
		"ModeRoad", "ReceiverName", "ReceiverItem", "Sender", "Receiver", "QuoteNumber", "DropOffDepot",
		"CollectionDepot", "dropOffDepot", "collectionDepot", "DGContactName", "DGContactNumber", "SenderEmail",
		"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2", "NumberOfItems",
		"Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes",
		"PackingGroup", "DGNo", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty", "pDgQtyKg",
		"PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
		"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
		"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
		"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "technicalName", "BillingType",
		"SpeceialIns", "TollExtraServiceAmount", "LineItemName1Heading", "LineItemName2Heading",
		"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
		"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
		"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo"})

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_DGRefrigerated(String TollCarrier,
			String ServiceDGRefrigerated, String AccountNumber, Integer WhoPays, String whoPays, Integer ModeInt,
			String ModeRoad, String ReceiverName, String ReceiverItem, Integer Sender, Integer Receiver,
			String QuoteNumber, String DropOffDepot, String CollectionDepot, String dropOffDepot,
			String collectionDepot, String DGContactName, String DGContactNumber, String SenderEmail,
			String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer PackingGroup, Integer DGNo, String lookupName, Integer lookupItem, String packageDescription,
			String pDgPkgQty, String pDgQtyKg, String PalletTransactionsInfo, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String technicalName,
			String BillingType, String SpeceialIns, String TollExtraServiceAmount, String LineItemName1Heading,
			String LineItemName2Heading, String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading,
			String DimensionsHeading, String TotalVolumeHeading, String WeightHeading, String Reference1Heading,
			String Reference2Heading, String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading,
			String VolumeLineItem1, String VolumeLineItem2, String ShipmentContainDangerousGoodsYes,
			String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		CreateShipmentActions.EnterService(ServiceDGRefrigerated);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.MinimumWaitForElementEnabled();
		// PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
		// CreateShipmentActions.notifyReceiverCheckBox);
		PageBase.MaximumWaitForElementEnabled();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		CreateShipmentActions.EnterDropOffDepot(DropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);
		CreateShipmentActions.EnterDGContactDetails(DGContactName, DGContactNumber);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
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

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceDGRefrigerated, whoPays,
				CollectionDepot, mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		ShipmentReviewActions.VerifyAdditionalInformationForDangerousGoods(SpeceialIns, PalletTransactionsInfo, PurchaseOrder);

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

	//@Test(priority = 1)
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceRailGeneral", "AccountNumberTNQX","WhoPays", "whoPays",
		"ModeInt", "Mode", "Sender", "Receiver", "QuoteNumber", "DropOffDepot", "DropOffDepot",
		"CollectionDepot", "DGContactName","DGContactNumber", "SenderEmail", "ReceiverEmail", "ShipmentRef1", "ShipmentRef2",
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

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_RailGeneral(String TollCarrier,
			String ServiceRailGeneral, String AccountNumber,Integer WhoPays, String whoPays, Integer ModeInt,
			String Mode, Integer Sender, Integer Receiver, String QuoteNumber, String dropOffDepot,
			String DropOffDepot, String CollectionDepot, String DGContactName, String DGContactNumber,String SenderEmail, String ReceiverEmail,
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
		
		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		CreateShipmentActions.EnterService(ServiceRailGeneral);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString();
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString().replaceAll("\\s","");
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();

		PageBase.MediumWaitForElementEnabled();

		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		CreateShipmentActions.EnterDropOffDepot(DropOffDepot);
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

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceRailGeneral, whoPays,
				CollectionDepot, Mode);

		String tollExtraServiceAmount = "$" + TollExtraSrviceAmount;
		ShipmentReviewActions.VerifyAdditionalInformationForDangerousGoods(SpeceialIns, PalletTransactionsInfo, PurchaseOrder);

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

	//@Test(priority = 1)
	@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceRailDangerousGoods", "AccountNumberTNQX", "WhoPays", "whoPays","Mode", "ModeInt",
		"ModeRoad", "ReceiverName", "ReceiverItem", "Sender", "Receiver", "QuoteNumber", "DropOffDepot",
		"CollectionDepot", "dropOffDepot", "collectionDepot", "DGContactName", "DGContactNumber", "SenderEmail",
		"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2", "NumberOfItems",
		"Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes",
		"PackingGroup", "DGNo", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty", "pDgQtyKg",
		"PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
		"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
		"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
		"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "technicalName", "BillingType",
		"SpeceialIns", "TollExtraServiceAmount", "LineItemName1Heading", "LineItemName2Heading",
		"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
		"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
		"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo" })

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_RailDangerousGoods(String TollCarrier,
			String ServiceRailDangerousGoods, String AccountNumber,  Integer WhoPays, String whoPays, String Mode,Integer ModeInt,
			String ModeRoad, String ReceiverName, String ReceiverItem, Integer Sender, Integer Receiver,
			String QuoteNumber, String DropOffDepot, String CollectionDepot, String dropOffDepot,
			String collectionDepot, String DGContactName, String DGContactNumber, String SenderEmail,
			String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer PackingGroup, Integer DGNo, String lookupName, Integer lookupItem, String packageDescription,
			String pDgPkgQty, String pDgQtyKg, String PalletTransactionsInfo, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String technicalName,
			String BillingType, String SpeceialIns, String TollExtraServiceAmount, String LineItemName1Heading,
			String LineItemName2Heading, String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading,
			String DimensionsHeading, String TotalVolumeHeading, String WeightHeading, String Reference1Heading,
			String Reference2Heading, String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading,
			String VolumeLineItem1, String VolumeLineItem2, String ShipmentContainDangerousGoodsYes,
			String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		CreateShipmentActions.EnterService(ServiceRailDangerousGoods);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.MinimumWaitForElementEnabled();
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);

		CreateShipmentActions.EnterDropOffDepot(DropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);
		CreateShipmentActions.EnterDGContactDetails(DGContactName, DGContactNumber);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

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

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceRailDangerousGoods, whoPays,
				CollectionDepot, mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		ShipmentReviewActions.VerifyAdditionalInformationForDangerousGoods(SpeceialIns, PalletTransactionsInfo, PurchaseOrder);

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
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceDGFCL", "AccountNumberTNQX", "WhoPays", "whoPays","Mode", "ModeInt",
		"ModeRoad", "ReceiverName", "ReceiverItem", "Sender", "Receiver", "QuoteNumber", "DropOffDepot",
		"CollectionDepot", "dropOffDepot", "collectionDepot", "DGContactName", "DGContactNumber", "SenderEmail",
		"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2", "NumberOfItems",
		"Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes",
		"PackingGroup", "DGNo", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty", "pDgQtyKg",
		"PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
		"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
		"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
		"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "technicalName", "BillingType",
		"SpeceialIns", "TollExtraServiceAmount", "LineItemName1Heading", "LineItemName2Heading",
		"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
		"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
		"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo" })

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_DGFCL(String TollCarrier,
			String ServiceDGFCL, String AccountNumber,  Integer WhoPays, String whoPays, String Mode,Integer ModeInt,
			String ModeRoad, String ReceiverName, String ReceiverItem, Integer Sender, Integer Receiver,
			String QuoteNumber, String DropOffDepot, String CollectionDepot, String dropOffDepot,
			String collectionDepot, String DGContactName, String DGContactNumber, String SenderEmail,
			String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer PackingGroup, Integer DGNo, String lookupName, Integer lookupItem, String packageDescription,
			String pDgPkgQty, String pDgQtyKg, String PalletTransactionsInfo, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String technicalName,
			String BillingType, String SpeceialIns, String TollExtraServiceAmount, String LineItemName1Heading,
			String LineItemName2Heading, String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading,
			String DimensionsHeading, String TotalVolumeHeading, String WeightHeading, String Reference1Heading,
			String Reference2Heading, String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading,
			String VolumeLineItem1, String VolumeLineItem2, String ShipmentContainDangerousGoodsYes,
			String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		CreateShipmentActions.EnterService(ServiceDGFCL);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.MinimumWaitForElementEnabled();
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);

		CreateShipmentActions.EnterDropOffDepot(DropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);
		CreateShipmentActions.EnterDGContactDetails(DGContactName, DGContactNumber);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);

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

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceDGFCL, whoPays,
				CollectionDepot, mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		ShipmentReviewActions.VerifyAdditionalInformationForDangerousGoods(SpeceialIns, PalletTransactionsInfo, PurchaseOrder);

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
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServicePremium", "AccountNumberTNQX", "WhoPays", "whoPays",
			"ModeInt", "ModeRoad", "Sender", "Receiver", "QuoteNumber", "DropOffDepot", "DropOffDepot",
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

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_Service_Z_Premium_ConsolidateShipments(String TollCarrier,
			String TollNQXServicePremium, String AccountNumber, Integer WhoPays, String whoPays, Integer ModeInt,
			String ModeRoad, Integer Sender, Integer Receiver, String QuoteNumber, String dropOffDepot,
			String DropOffDepot, String collectionDepot, String DGContactName, String SenderEmail, String ReceiverEmail,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, String ItemTemplateName2, String NumberOfItems2, String Length2,
			String Width2, String Height2, String Weight2, Integer DGYes, Integer DGNo, String BillingType,
			String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty,
			String DgQtyKg, String ChepCustomer, String ChepExchange, String ChepTansferToToll, String ChepDocketNo,
			String LoscamCustomer, String LoascamExchange, String LoscamTransferToToll, String LoscamDocketNo,
			String OtherCostomer, String ChepOtherExchange, String ChepOtherTransferToToll, String chepOtherDocketNo,
			String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo,
			String PalletTransactionsInfoNo, String PurchaseOrder, String TollExtraSrviceAmount,
			String LineItemName1Heading, String LineItemName2Heading, String ItemDescriptionHeading,
			String ItemsHeading, String BillingTypeHeading, String DimensionsHeading, String TotalVolumeHeading,
			String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		CreateShipmentActions.EnterService(TollNQXServicePremium);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		String mode=CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationConsolidate(); 
	
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, TollNQXServicePremium, whoPays,
				collectionDepot, mode);

		String tollExtraServiceAmount = "$" + TollExtraSrviceAmount;
		ShipmentReviewActions.VerifyAdditionalInformation(SpeceialIns, PalletTransactionsInfoNo, PurchaseOrder,
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
	
	//@Test
	@Parameters({ "TollCarrierIntermodalSpecialized", "ServiceDGExpress", "AccountNumberTNQX", "WhoPays", "whoPays","Mode", "ModeInt",
		"ModeRoad", "ReceiverName", "ReceiverItem", "Sender", "Receiver", "QuoteNumber", "DropOffDepot",
		"CollectionDepot", "dropOffDepot", "collectionDepot", "DGContactName", "DGContactNumber", "SenderEmail",
		"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2", "NumberOfItems",
		"Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes",
		"PackingGroup", "DGNo", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty", "pDgQtyKg",
		"PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
		"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
		"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
		"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "technicalName", "BillingType",
		"SpeceialIns", "TollExtraServiceAmount", "LineItemName1Heading", "LineItemName2Heading",
		"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
		"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
		"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo" })

	public void CreateShipment_IntermodalSpecialized_E2ETest_TID_920_ErrorMessagesValidation(String TollCarrier,
			String ServiceDGExpress, String AccountNumber,  Integer WhoPays, String whoPays, String Mode,Integer ModeInt,
			String ModeRoad, String ReceiverName, String ReceiverItem, Integer Sender, Integer Receiver,
			String QuoteNumber, String DropOffDepot, String CollectionDepot, String dropOffDepot,
			String collectionDepot, String DGContactName, String DGContactNumber, String SenderEmail,
			String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer PackingGroup, Integer DGNo, String lookupName, Integer lookupItem, String packageDescription,
			String pDgPkgQty, String pDgQtyKg, String PalletTransactionsInfo, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll, String ChepDocketNo, String LoscamCustomer, String LoascamExchange,
			String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange,
			String ChepOtherTransferToToll, String chepOtherDocketNo, String LoscamOtherExchange,
			String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String technicalName,
			String BillingType, String SpeceialIns, String TollExtraServiceAmount, String LineItemName1Heading,
			String LineItemName2Heading, String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading,
			String DimensionsHeading, String TotalVolumeHeading, String WeightHeading, String Reference1Heading,
			String Reference2Heading, String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading,
			String VolumeLineItem1, String VolumeLineItem2, String ShipmentContainDangerousGoodsYes,
			String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.SelectIntermodalSpecializedCarrier(TollCarrier);
		String tollCarrier=BookAPickupActions.GetTollCarrier();
		System.out.println(tollCarrier);
		CreateShipmentActions.EnterService(ServiceDGExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);

		CreateShipmentActions.SelectMode(ModeInt);
		PageBase.MoveToElement(CreateShipmentActions.quoteNumber,CreateShipmentActions.accountNumber );
		CreateShipmentActions.SelectSender(Sender);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.MinimumWaitForElementEnabled();
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);

		CreateShipmentActions.EnterDropOffDepot(DropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(CollectionDepot);
		CreateShipmentActions.EnterDGContactDetails(DGContactName, DGContactNumber);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
		
		CreateShipmentActions.ClickReviewCreateShipment();
		BookAPickupActions.VerifyShipmentMsg();
		
	
		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);
		BookAPickupActions.SelectDangerousGoods(2);
		// ReSubmit Book a pickup details
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled();

		BookAPickupActions.NoUNAddedErrorMsgValidation();

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

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.VerifyDocketNoNotMandatoryInLocamOther(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll);

		CreateShipmentActions.DeletePurchaseOrder(PurchaseOrder);
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverview(tollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceDGExpress, whoPays,
				CollectionDepot, Mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		ShipmentReviewActions.VerifyAdditionalInformationForDangerousGoods(SpeceialIns, PalletTransactionsInfo, PurchaseOrder);

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
	
	

	
	@AfterMethod
	public void RunTearDown() throws Exception {
		 //BaseWebdriver.tearDown();

	}

}
