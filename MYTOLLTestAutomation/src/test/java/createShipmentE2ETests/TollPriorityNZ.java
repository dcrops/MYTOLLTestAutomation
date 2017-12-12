package createShipmentE2ETests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import createShipmentActions.ShipmentReviewActions;
import myTollHomePageActions.MyTollHomePageActions;
import baseWebdriver.BaseWebdriver;

public class TollPriorityNZ {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test
	@Parameters({ "TollCarrierTollPrioNZ", "ServiceGlobalExpressDocuments", "WhoPays", "whoPays", "Sender", "Receiver",
			"QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "SenderEmail", "ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight",
			"ItemTemplateName2", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2", "DGYes", "DGNo",
			"BillingTypeAllFreight", "PalletTransactionsInfoNo", "PurchaseOrder", "SpeceialIns", "DGItem",
			"LookupSearch", "PackageDescription", "DgPkgQty", "DgQtyKg", "TollExtraServiceAmount",
			"LineItemName1Heading", "LineItemName2Heading", "ItemDescriptionHeading", "ItemsHeading",
			"BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading", "WeightHeading", "Reference1Heading",
			"Reference2Heading", "ShipmentContainDangerousGoodsHeading", "DangerousGoodsDetailsHeading",
			"VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
			"ShipmentContainDangerousGoodsNo" })
	public void CreateShipment_TollPriorityNZ_E2ETest_TID_921_Service_GlobalExpressDocuments(String TollCarrier,
			String ServiceGlobalExpressDocuments, Integer WhoPays, String whoPays, Integer Sender, Integer Receiver,
			String QuoteNumber, String DropOffDepot, String CollectionDepot, String DGContactName, String SenderEmail,
			String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String ItemTemplateName2,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String PalletTransactionsInfoNo, String PurchaseOrder, String SpeceialIns,
			Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg,
			String TollExtraSrviceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		// CreateShipmentActions.SelectTollCarrierItem(TollCarrier);
		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGlobalExpressDocuments);

		String AccountNumber = BookAPickupActions.GetAccountNumber().toString();
		System.out.println(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		CreateShipmentActions.SelectShipmentConsolidationContinue();
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s", "");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		// CreateShipmentActions.SelectReceiver(2);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		CreateShipmentActions.EnterShipmentReference1(ShipmentRef1);
		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.selectDangerousGood();
		PageBase.Scrollbar(1200, 1500);
		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.selectDangerousGood();
		PageBase.Scrollbar(800, 1000);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
		
		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTGX(TollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ServiceGlobalExpressDocuments, whoPays);
		ShipmentReviewActions.VerifyAdditionalInformationTollPrioAU(SpeceialIns, PalletTransactionsInfoNo);
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
	@Parameters({ "TollCarrierTollPrioNZ", "ServiceParcelsOffPeak", "WhoPays", "whoPays", "Sender",
		"Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "SenderEmail",
		"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
		"Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2",
		"DGYes", "DGNo", "BillingTypeAllFreight", "PalletTransactionsInfoNo", "PurchaseOrder", "SpeceialIns", "DGItem",
		"LookupSearch", "PackageDescription", "DgPkgQty", "DgQtyKg", "TollExtraServiceAmount",
		"LineItemName1Heading", "LineItemName2Heading", "ItemDescriptionHeading", "ItemsHeading",
		"BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading", "WeightHeading", "Reference1Heading",
		"Reference2Heading", "ShipmentContainDangerousGoodsHeading", "DangerousGoodsDetailsHeading",
		"VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo" })
	public void CreateShipment_TollPriorityNZ_E2ETest_TID_921_Service_ParcelsOffPeak(String TollCarrier,
			String ServiceParcelsOffPeak, Integer WhoPays, String whoPays, Integer Sender,
			Integer Receiver, String QuoteNumber, String DropOffDepot, String CollectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String ItemTemplateName2,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String PalletTransactionsInfoNo, String PurchaseOrder, String SpeceialIns,
			Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg,
			String TollExtraSrviceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceParcelsOffPeak);
		BookAPickupActions.SelectAccountNumber1();
		String AccountNumber = BookAPickupActions.GetAccountNumber().toString();
		System.out.println(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		// CreateShipmentActions.EnterReceiver("Test", "Test174");

		CreateShipmentActions.SelectShipmentConsolidationContinue();
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s","");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);

		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		CreateShipmentActions.EnterShipmentReference1(ShipmentRef1);
		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.selectDangerousGood();

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS(1000, 1500, ItemTemplateName2, BillingType, NumberOfItems2, Length2,
				Width2, Height2, Weight2, ShipmentRef1, ShipmentRef2);
		BookAPickupActions.selectDangerousGood();

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
		
		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTGX(TollCarrier, AccountNumber, sender, senderLocation,
				receiver, receiverLocation, ShipmentRef1,ServiceParcelsOffPeak, whoPays);

		ShipmentReviewActions.VerifyAdditionalInformationTollPrioAU(SpeceialIns, PalletTransactionsInfoNo);

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
	@Parameters({ "TollCarrierTollPrioNZ", "ServiceGlobalExpressDocuments","WhoPays", "whoPays", "Sender",
		"Receiver", "QuoteNumber", "DropOffDepot", "CollectionDepot", "DGContactName", "SenderEmail",
		"ReceiverEmail", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
		"Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2",
		"DGYes", "DGNo", "BillingTypeAllFreight", "PalletTransactionsInfoNo", "PurchaseOrder", "SpeceialIns", "DGItem",
		"LookupSearch", "PackageDescription", "DgPkgQty", "DgQtyKg", "TollExtraServiceAmount",
		"LineItemName1Heading", "LineItemName2Heading", "ItemDescriptionHeading", "ItemsHeading",
		"BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading", "WeightHeading", "Reference1Heading",
		"Reference2Heading", "ShipmentContainDangerousGoodsHeading", "DangerousGoodsDetailsHeading",
		"VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
		"ShipmentContainDangerousGoodsNo"  })
	public void CreateShipment_TollPriorityNZ_E2ETest_TID_921_Service_GlobalExpressDocumentsShipmentConsolidation(
			String TollCarrier, String ServiceGlobalExpressDocuments, Integer WhoPays, String whoPays, Integer Sender,
			Integer Receiver, String QuoteNumber, String DropOffDepot, String CollectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String ItemTemplateName2,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String BillingType, String PalletTransactionsInfoNo, String PurchaseOrder, String SpeceialIns,
			Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg,
			String TollExtraSrviceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		// CreateShipmentActions.SelectTollCarrierItem(TollCarrier);
		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGlobalExpressDocuments);
		BookAPickupActions.SelectAccountNumber1();
		String AccountNumber = BookAPickupActions.GetAccountNumber().toString();
		System.out.println(AccountNumber);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s", "");
		//String Sender.ccontainText(Sender);
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		// CreateShipmentActions.SelectReceiver(2);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationConsolidate();
		/*CreateShipmentActions.SelectShipmentConsolidationConsolidatePrio(ItemTemplateName,BillingType,NumberOfItems,ShipmentRef1, ShipmentRef2,
				Length,Width,Height, Weight,ItemTemplateName2, NumberOfItems2,Length2,
				Width2, Height2, Weight2, DGNo,  SpeceialIns);*/
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTGX(TollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ServiceGlobalExpressDocuments, whoPays);
		ShipmentReviewActions.VerifyAdditionalInformationTollPrioAU(SpeceialIns, PalletTransactionsInfoNo);
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
	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();

	}
}
