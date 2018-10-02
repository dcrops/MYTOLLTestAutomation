package seleniumtests.createshipment;

import global.PageBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basewebdriver.BaseWebdriver;
import bookapickup.BookAPickupActions;
import createshipment.CreateShipmentActions;
import mytollhomepage.MyTollHomePageActions;
import createshipment.ShipmentReviewActions;

public class TollIntermodalTests {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	//@Test(priority = 7)
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "AccountNumberTINTER", "whoPays", "Mode","Sender", "Receiver",
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
			String ServiceDGFreight, String AccountNumber, String whoPays, String Mode, Integer Sender, Integer Receiver, String ReceiverName,
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

	//@Test(priority = 8)
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "AccountNumberTINTER","Sender", "Receiver", "SenderName", "SenderItem",
			"ReceiverName", "ReceiverItem", "DropOffDepot", "CollectionDepot", "BillingType", "DGContactName","DGContactNumber",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "ItemTemplateName2", "NumberOfItems", "Length", "Width",
			"NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "Height", "Weight", "DGYes", "PackingGroup",
			"DGNo", "DGoodsNo", "lookupName", "lookupItem", "packageDescription", "pDgPkgQty", "pDgQtyKg",
			"technicalName", "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_DGFreight(String TollCarrier,
			String ServiceDGFreight, String AccountNumber, Integer Sender, Integer Receiver, String SenderName, String SenderItem, String ReceiverName,
			String ReceiverItem, String dropOffDepot, String collectionDepot, String BillingType, String DGContactName,String DGContactNumber,
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
		
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(Sender);
		
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);
		

		CreateShipmentActions.SelectShipmentConsolidationContinue();
		
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterDGContactDetails(DGContactName, DGContactNumber);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, BookAPickupActions.dangerousGoodNo);
		
		BookAPickupActions.SelectDangerousGoods(DGYes);
		
		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup(PackingGroup);
		CreateShipmentActions.EnterTechnicalName(technicalName);
		BookAPickupActions.ClickAdd();
		//PageBase.MoveToElement(CreateShipmentActions.addNewLine, CreateShipmentActions.UNNumberDropdown);

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

	//@Test(priority = 1)
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTINTER","whoPays","Mode","Sender", "Receiver", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot","dropOffDepot", "collectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
			"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns","PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
			"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
			"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder","TollExtraServiceAmount","LineItemName1Heading", "LineItemName2Heading",
			"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
			"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
			"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
			"ShipmentContainDangerousGoodsNo"  })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Express_ShipmentReview(String TollCarrier, String ServiceExpress,
			String AccountNumber, String whoPays,String Mode, Integer Sender, Integer Receiver,String ReceiverName, String ReceiverItem,String DropOffDepot, String CollectionDepot, Integer dropOffDepot, Integer collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns,String PalletTransactionsInfo,String ChepCustomer, String ChepExchange, String ChepTansferToToll,
			String ChepDocketNo, String LoscamCustomer, String LoascamExchange, String LoscamTransferToToll,
			String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange, String ChepOtherTransferToToll,
			String chepOtherDocketNo, String LoscamOtherExchange, String LoscamOtherTransferToToll,
			String LoscamOtherDocketNo, String PurchaseOrder,  String TollExtraServiceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		
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
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox,
				CreateShipmentActions.notifySenderCheckBox);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
	
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

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
		
		// Shipment Review-VerifyOverview
		ShipmentReviewActions.VerifyShipmentOverview(TollCarrier, AccountNumber, sender, senderLocation, receiver,
						receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceExpress, whoPays, CollectionDepot,
						Mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		
		// Shipment Review-VerifyAdditionalInformation
		ShipmentReviewActions.VerifyAdditionalInformation(SpeceialIns, PalletTransactionsInfo, PurchaseOrder,
						tollExtraServiceAmount);
		
		// Shipment Review-VerifyPalletTransactionsInformations
		ShipmentReviewActions.VerifyPalletTransactionsInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
						ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
						ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
						LoscamOtherTransferToToll, LoscamOtherDocketNo);
		String numberOfItems = ItemsHeading+" " + NumberOfItems;
		
		// Shipment Review-VerifyLineItem1Headings
		ShipmentReviewActions.VerifyLineItem1Headings(LineItemName1Heading, ItemTemplateName, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions = Length + "cm x " + Width + "cm x " + Height + "cm";
		String weight = Weight + "kg";
		
		// Shipment Review-VerifyLineItem1Values
		ShipmentReviewActions.VerifyLineItem1Values(ItemTemplateName, NumberOfItems, BillingType, dimensions,
				VolumeLineItem1, weight, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
		
		// Shipment Review-VerifyLineItem2Headings
		ShipmentReviewActions.VerifyLineItem2Headings(LineItemName2Heading, ItemTemplateName2, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions2 = Length2 + "cm x " + Width2 + "cm x " + Height2 + "cm";
		String weight2 = Weight2 + "kg";

		// Shipment Review-VerifyLineItem2Values
		ShipmentReviewActions.VerifyLineItem2Values(ItemTemplateName2, NumberOfItems2, BillingType, dimensions2,
				VolumeLineItem2, weight2, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
		

	}

	//@Test(priority = 2)
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTINTER","Sender", "Receiver", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
			"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Express(String TollCarrier,
			String ServiceExpress, String AccountNumber, Integer Sender, Integer Receiver, String ReceiverName, String ReceiverItem, String dropOffDepot,
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
		
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		
		CreateShipmentActions.SelectShipmentConsolidationContinue();
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
		CreateShipmentActions.CloseManifestScreenGoToShipmentView();

	}

	//@Test(priority = -4)
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "AccountNumberTINTER","Sender", "Receiver", "ReceiverName", "ReceiverItem",
			"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
			"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
			"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
			"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
			"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
			"LoscamOtherTransferToToll", "LoscamOtherDocketNo",  "SpeceialIns", "TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_General(String TollCarrier, String ServiceGeneral,
			String AccountNumber, Integer Sender, Integer Receiver, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType,String ChepCustomer, String ChepExchange, String ChepTansferToToll,
			String ChepDocketNo, String LoscamCustomer, String LoascamExchange, String LoscamTransferToToll,
			String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange, String ChepOtherTransferToToll,
			String chepOtherDocketNo, String LoscamOtherExchange, String LoscamOtherTransferToToll,
			String LoscamOtherDocketNo, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
	
		PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		CreateShipmentActions.SelectShipmentConsolidationContinue();
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
		
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.ClickAddANewLine();

		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		//CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	//@Test(priority = 4)
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "AccountNumberTINTER","whoPays","Mode", "Sender", "Receiver","ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot","dropOffDepot", "collectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
		"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns","PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
		"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
		"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
		"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder","TollExtraServiceAmount","LineItemName1Heading", "LineItemName2Heading",
		"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
		"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
		"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo"  })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_General_ShipmentReview(String TollCarrier,
			String ServiceGeneral, String AccountNumber, String whoPays,String Mode, Integer Sender, Integer Receiver,String ReceiverName, String ReceiverItem,String DropOffDepot, String CollectionDepot, Integer dropOffDepot, Integer collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns,String PalletTransactionsInfo,String ChepCustomer, String ChepExchange, String ChepTansferToToll,
			String ChepDocketNo, String LoscamCustomer, String LoascamExchange, String LoscamTransferToToll,
			String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange, String ChepOtherTransferToToll,
			String chepOtherDocketNo, String LoscamOtherExchange, String LoscamOtherTransferToToll,
			String LoscamOtherDocketNo, String PurchaseOrder,  String TollExtraServiceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);
	
		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);

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
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

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
		
		// Shipment Review-VerifyOverview
		ShipmentReviewActions.VerifyShipmentOverview(TollCarrier, AccountNumber, sender, senderLocation, receiver,
						receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceGeneral, whoPays, CollectionDepot,
						Mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		
		// Shipment Review-VerifyAdditionalInformation
		ShipmentReviewActions.VerifyAdditionalInformation(SpeceialIns, PalletTransactionsInfo, PurchaseOrder,
						tollExtraServiceAmount);
		
		// Shipment Review-VerifyPalletTransactionsInformations
		ShipmentReviewActions.VerifyPalletTransactionsInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
						ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
						ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
						LoscamOtherTransferToToll, LoscamOtherDocketNo);
		String numberOfItems = ItemsHeading+" " + NumberOfItems;
		
		// Shipment Review-VerifyLineItem1Headings
		ShipmentReviewActions.VerifyLineItem1Headings(LineItemName1Heading, ItemTemplateName, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions = Length + "cm x " + Width + "cm x " + Height + "cm";
		String weight = Weight + "kg";
		
		// Shipment Review-VerifyLineItem1Values
		ShipmentReviewActions.VerifyLineItem1Values(ItemTemplateName, NumberOfItems, BillingType, dimensions,
				VolumeLineItem1, weight, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
		
		// Shipment Review-VerifyLineItem2Headings
		ShipmentReviewActions.VerifyLineItem2Headings(LineItemName2Heading, ItemTemplateName2, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions2 = Length2 + "cm x " + Width2 + "cm x " + Height2 + "cm";
		String weight2 = Weight2 + "kg";

		// Shipment Review-VerifyLineItem2Values
		ShipmentReviewActions.VerifyLineItem2Values(ItemTemplateName2, NumberOfItems2, BillingType, dimensions2,
				VolumeLineItem2, weight2, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
		

	}

	//@Test(priority = 5)
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "AccountNumberTINTER","Sender", "Receiver", "ReceiverName",
			"ReceiverItem", "DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2",
			"ItemTemplateName", "ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight",
			"NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns",
			"TollExtraServiceAmount" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Refrigeration(String TollCarrier,
			String ServiceRefrigeration, String AccountNumber, Integer Sender, Integer Receiver, String ReceiverName, String ReceiverItem,
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

		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		CreateShipmentActions.SelectShipmentConsolidationContinue();
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

	//@Test(priority = 6)
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "AccountNumberTINTER","whoPays","Mode","Sender", "Receiver", "ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot","dropOffDepot", "collectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
		"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns","PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
		"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
		"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
		"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder","TollExtraServiceAmount","LineItemName1Heading", "LineItemName2Heading",
		"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
		"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
		"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo"   })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Refrigeration_ShipmentReview(String TollCarrier,
			String ServiceRefrigeration, String AccountNumber, String whoPays,String Mode, Integer Sender, Integer Receiver,String ReceiverName, String ReceiverItem,String DropOffDepot, String CollectionDepot, Integer dropOffDepot, Integer collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns,String PalletTransactionsInfo,String ChepCustomer, String ChepExchange, String ChepTansferToToll,
			String ChepDocketNo, String LoscamCustomer, String LoascamExchange, String LoscamTransferToToll,
			String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange, String ChepOtherTransferToToll,
			String chepOtherDocketNo, String LoscamOtherExchange, String LoscamOtherTransferToToll,
			String LoscamOtherDocketNo, String PurchaseOrder,  String TollExtraServiceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);

		CreateShipmentActions.EnterService(ServiceRefrigeration);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		String tempretureType=CreateShipmentActions.GetTempratureType();
		System.out.println(tempretureType);
		String tempretureFrom=CreateShipmentActions.GetTempratureFrom();
		System.out.println(tempretureFrom);
		String tempretureTo=CreateShipmentActions.GetTempratureTo();
		System.out.println(tempretureTo);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);

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
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		PageBase.MoveToElement(CreateShipmentActions.numberOfItem, BookAPickupActions.weight);

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
		
		// Shipment Review-VerifyOverview
		ShipmentReviewActions.VerifyShipmentOverview(TollCarrier, AccountNumber, sender, senderLocation, receiver,
						receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceRefrigeration, whoPays, CollectionDepot,
						Mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		
		// Shipment Review-VerifyAdditionalInformation
		ShipmentReviewActions.VerifyAdditionalInformation(SpeceialIns, PalletTransactionsInfo, PurchaseOrder,
						tollExtraServiceAmount);
		
		// Shipment Review-VerifyPalletTransactionsInformations
		ShipmentReviewActions.VerifyPalletTransactionsInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
						ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
						ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
						LoscamOtherTransferToToll, LoscamOtherDocketNo);
		String numberOfItems = ItemsHeading+" " + NumberOfItems;
		
		// Shipment Review-VerifyLineItem1Headings
		ShipmentReviewActions.VerifyLineItem1Headings(LineItemName1Heading, ItemTemplateName, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions = Length + "cm x " + Width + "cm x " + Height + "cm";
		String weight = Weight + "kg";
		
		// Shipment Review-VerifyLineItem1Values
		ShipmentReviewActions.VerifyLineItem1Values(ItemTemplateName, NumberOfItems, BillingType, dimensions,
				VolumeLineItem1, weight, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
		
		// Shipment Review-VerifyLineItem2Headings
		ShipmentReviewActions.VerifyLineItem2Headings(LineItemName2Heading, ItemTemplateName2, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions2 = Length2 + "cm x " + Width2 + "cm x " + Height2 + "cm";
		String weight2 = Weight2 + "kg";

		// Shipment Review-VerifyLineItem2Values
		ShipmentReviewActions.VerifyLineItem2Values(ItemTemplateName2, NumberOfItems2, BillingType, dimensions2,
				VolumeLineItem2, weight2, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
	}
	

	//@Test(priority = 4)
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "AccountNumberTINTER","whoPays","Mode","Sender", "Receiver", "ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot","dropOffDepot", "collectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"ItemTemplateName2", "NumberOfItems", "Length", "Width", "Height", "Weight", "NumberOfItems2", "Length2",
		"Width2", "Height2", "Weight2", "DGYes", "DGNo", "BillingType", "SpeceialIns","PalletTransactionsInfo", "ChepCustomer", "ChepExchange", "ChepTansferToToll", "ChepDocketNo",
		"LoscamCustomer", "LoascamExchange", "LoscamTransferToToll", "LoscamDocketNo", "OtherCostomer",
		"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo", "LoscamOtherExchange",
		"LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder","TollExtraServiceAmount","LineItemName1Heading", "LineItemName2Heading",
		"ItemDescriptionHeading", "ItemsHeading", "BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading",
		"WeightHeading", "Reference1Heading", "Reference2Heading", "ShipmentContainDangerousGoodsHeading",
		"DangerousGoodsDetailsHeading", "VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo"  })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Z_General_ConsolidateShipments(String TollCarrier,
			String ServiceGeneral, String AccountNumber, String whoPays,String Mode, Integer Sender, Integer Receiver,String ReceiverName, String ReceiverItem,String DropOffDepot, String CollectionDepot, Integer dropOffDepot, Integer collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String ItemTemplateName2, String NumberOfItems, String Length, String Width, String Height, String Weight,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns,String PalletTransactionsInfo,String ChepCustomer, String ChepExchange, String ChepTansferToToll,
			String ChepDocketNo, String LoscamCustomer, String LoascamExchange, String LoscamTransferToToll,
			String LoscamDocketNo, String OtherCostomer, String ChepOtherExchange, String ChepOtherTransferToToll,
			String chepOtherDocketNo, String LoscamOtherExchange, String LoscamOtherTransferToToll,
			String LoscamOtherDocketNo, String PurchaseOrder,  String TollExtraServiceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);
	
		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		String mode=CreateShipmentActions.SelectMode(1);

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
		
		CreateShipmentActions.SelectPalletTransactionsYes();

		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
				ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
				ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
				LoscamOtherTransferToToll, LoscamOtherDocketNo);
		CreateShipmentActions.ClickReviewCreateShipment();
		//CreateShipmentActions.MessageEnterLineItemShipmentConsolidation(ItemTemplateName,);
		// Shipment Review-VerifyOverview
		ShipmentReviewActions.VerifyShipmentOverview(TollCarrier, AccountNumber, sender, senderLocation, receiver,
						receiverLocation, ShipmentRef1, ShipmentRef2, DropOffDepot, ServiceGeneral, whoPays, CollectionDepot,
						mode);

		String tollExtraServiceAmount = "$" + TollExtraServiceAmount;
		
		// Shipment Review-VerifyAdditionalInformation
		ShipmentReviewActions.VerifyAdditionalInformation(SpeceialIns, PalletTransactionsInfo, PurchaseOrder,
						tollExtraServiceAmount);
		
		// Shipment Review-VerifyPalletTransactionsInformations
		ShipmentReviewActions.VerifyPalletTransactionsInformations(ChepCustomer, ChepExchange, ChepTansferToToll,
						ChepDocketNo, LoscamCustomer, LoascamExchange, LoscamTransferToToll, LoscamDocketNo, OtherCostomer,
						ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,
						LoscamOtherTransferToToll, LoscamOtherDocketNo);
		String numberOfItems = ItemsHeading+" " + NumberOfItems;
		
		// Shipment Review-VerifyLineItem1Headings
		ShipmentReviewActions.VerifyLineItem1Headings(LineItemName1Heading, ItemTemplateName, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions = Length + "cm x " + Width + "cm x " + Height + "cm";
		String weight = Weight + "kg";
		
		// Shipment Review-VerifyLineItem1Values
		ShipmentReviewActions.VerifyLineItem1Values(ItemTemplateName, NumberOfItems, BillingType, dimensions,
				VolumeLineItem1, weight, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
		
		// Shipment Review-VerifyLineItem2Headings
		ShipmentReviewActions.VerifyLineItem2Headings(LineItemName2Heading, ItemTemplateName2, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions2 = Length2 + "cm x " + Width2 + "cm x " + Height2 + "cm";
		String weight2 = Weight2 + "kg";

		// Shipment Review-VerifyLineItem2Values
		ShipmentReviewActions.VerifyLineItem2Values(ItemTemplateName2, NumberOfItems2, BillingType, dimensions2,
				VolumeLineItem2, weight2, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
		

	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		 BaseWebdriver.tearDown();

	}

}
