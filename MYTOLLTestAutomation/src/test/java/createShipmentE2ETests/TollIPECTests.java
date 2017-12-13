package createShipmentE2ETests;

import org.openqa.selenium.JavascriptExecutor;
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

public class TollIPECTests {

	/*
	 * @Parameters("browser")
	 * 
	 * @BeforeMethod public void RunSetup(String browser) throws Exception {
	 * BaseWebdriver.RunSetup(browser);
	 * MyTollHomePageActions.Login(BaseWebdriver.CreateshipmentTollTasUsername,
	 * BaseWebdriver.CreateshipmentTollTasPassword);
	 * MyTollHomePageActions.ClickMenu(); CreateShipmentActions.ClickShipment(); }
	 */

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test
	@Parameters({ "TollCarrierTollIPEC", "ServiceRoadExpress", "AccountNumberTIPEC", "WhoPays", "whoPays", "Sender",
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

	public void CreateShipment_TollIPEC_E2ETest_TID_920_Service_RoadExpress_ShipmentReview(String TollCarrier,
			String ServiceRoadExpress, String AccountNumber, Integer WhoPays, String whoPays, Integer Sender,
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
		CreateShipmentActions.EnterService(ServiceRoadExpress);

		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
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
		PageBase.MaximumWaitForElementEnabled();

		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);

		CreateShipmentActions.EnterShipmentReference1(ShipmentRef1);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);

		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);

		CreateShipmentActions.AddANewLineTIPEC(ItemTemplateName2,NumberOfItems2,Length2,Width2,Height2,Weight2,ShipmentRef1,ShipmentRef2);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectAuthorityToLeaveYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTGX(TollCarrier, AccountNumber, sender, senderLocation,
				receiver, receiverLocation, ShipmentRef1, ServiceRoadExpress, whoPays);

		String tollExtraServiceAmount = "$" + TollExtraSrviceAmount;
		ShipmentReviewActions.VerifyAdditionalInformationTollIPEC(SpeceialIns, PalletTransactionsInfoNo,
				tollExtraServiceAmount);

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
	@Parameters({ "TollCarrierTollIPEC", "ServiceFashion","AccountNumberTIPEC", "WhoPays", "whoPays", "Sender", "Receiver", "QuoteNumber",
			"DropOffDepot", "CollectionDepot", "DGContactName", "SenderEmail", "ReceiverEmail", "ShipmentRef1",
			"ShipmentRef2", "ItemTemplateName", "NumberOfGarments", "Length", "Width", "Height", "Weight", "ItemTemplateName2", "NumberOfItems2", "Length2", "Width2", "Height2", "Weight2",
			"DGYes", "DGNo", "ItemTypeGarments", "PalletTransactionsInfoNo", "PurchaseOrder", "SpeceialIns", "DGItem",
			"LookupSearch", "PackageDescription", "DgPkgQty", "DgQtyKg", "TollExtraServiceAmount",
			"LineItemName1Heading", "LineItemName2Heading", "ItemDescriptionHeading", "ItemsHeading",
			"BillingTypeHeading", "DimensionsHeading", "TotalVolumeHeading", "WeightHeading", "Reference1Heading",
			"Reference2Heading", "ShipmentContainDangerousGoodsHeading", "DangerousGoodsDetailsHeading",
			"VolumeLineItem1", "VolumeLineItem2", "ShipmentContainDangerousGoodsYes",
			"ShipmentContainDangerousGoodsNo" })

	public void CreateShipment_TollIPEC_E2ETest_TID_920_Service_Fashion(String TollCarrier,
			String ServiceFashion,String AccountNumber, Integer WhoPays, String whoPays, Integer Sender, Integer Receiver, String QuoteNumber,
			String DropOffDepot, String collectionDepot, String DGContactName, String SenderEmail, String ReceiverEmail,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfGarments, String Length,
			String Width, String Height, String Weight, String ItemTemplateName2,
			String NumberOfItems2, String Length2, String Width2, String Height2, String Weight2, Integer DGYes,
			Integer DGNo, String ItemTypeGarments, String PalletTransactionsInfoNo, String PurchaseOrder, String SpeceialIns,
			Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg,
			String TollExtraSrviceAmount, String LineItemName1Heading, String LineItemName2Heading,
			String ItemDescriptionHeading, String ItemsHeading, String BillingTypeHeading, String DimensionsHeading,
			String TotalVolumeHeading, String WeightHeading, String Reference1Heading, String Reference2Heading,
			String ShipmentContainDangerousGoodsHeading, String DangerousGoodsDetailsHeading, String VolumeLineItem1,
			String VolumeLineItem2, String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceFashion);

		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");

		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
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
		PageBase.MaximumWaitForElementEnabled();

		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);

		CreateShipmentActions.EnterShipmentReference1(ShipmentRef1);
		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference1);
		BookAPickupActions.SelectItem(1);
		//CreateShipmentActions.NumberOfItem(NumberOfItems);
		
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.ItemType(1);
		CreateShipmentActions.NumberOfGarments(NumberOfGarments);
		// CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;

		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		//jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineTIPEC(ItemTemplateName2,NumberOfItems2,Length2,Width2,Height2,Weight2,ShipmentRef1,ShipmentRef2);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		CreateShipmentActions.ItemType(1);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectAuthorityToLeaveYes();
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTGX(TollCarrier, AccountNumber, sender, senderLocation,
				receiver, receiverLocation, ShipmentRef1, ServiceFashion, whoPays);

		String tollExtraServiceAmount = "$" + TollExtraSrviceAmount;
		ShipmentReviewActions.VerifyAdditionalInformationTollIPECFashion(SpeceialIns);

		String numberOfItems = ItemsHeading + " " +NumberOfGarments;
		ShipmentReviewActions.VerifyLineItem1Headings(LineItemName1Heading, ItemTemplateName, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions = Length + "cm x " + Width + "cm x " + Height + "cm";
		String weight = Weight + "kg";
		ShipmentReviewActions.VerifyLineItem1Values(ItemTemplateName, NumberOfGarments, ItemTypeGarments, dimensions,
				VolumeLineItem1, weight, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);

		ShipmentReviewActions.VerifyLineItem2Headings(LineItemName2Heading, ItemTemplateName2, numberOfItems,
				ItemDescriptionHeading, ItemsHeading, BillingTypeHeading, DimensionsHeading, TotalVolumeHeading,
				WeightHeading, Reference1Heading, Reference2Heading, ShipmentContainDangerousGoodsHeading);
		String dimensions2 = Length2 + "cm x " + Width2 + "cm x " + Height2 + "cm";
		String weight2 = Weight2 + "kg";

		ShipmentReviewActions.VerifyLineItem2Values(ItemTemplateName2, NumberOfItems2, ItemTypeGarments, dimensions2,
				VolumeLineItem2, weight2, ShipmentRef1, ShipmentRef2, ShipmentContainDangerousGoodsNo);
	
	}
	
	@Test
	@Parameters({ "TollCarrierTollIPEC", "ServiceRoadExpress", "AccountNumberTIPEC", "WhoPays", "whoPays", "Sender",
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

	public void CreateShipment_TollIPEC_E2ETest_TID_920_Service_RoadExpress_ConsolidateShipments(String TollCarrier,
			String ServiceRoadExpress, String AccountNumber, Integer WhoPays, String whoPays, Integer Sender,
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
		CreateShipmentActions.EnterService(ServiceRoadExpress);

		BookAPickupActions.SelectAccountNumber1();
		String accountNumber = BookAPickupActions.GetAccountNumber().toString();
		System.out.println(accountNumber);
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
		CreateShipmentActions.SelectShipmentConsolidationConsolidate();;
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);		
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);

		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTGX(TollCarrier, accountNumber, sender, senderLocation,
				receiver, receiverLocation, ShipmentRef1, ServiceRoadExpress, whoPays);

		String tollExtraServiceAmount = "$" + TollExtraSrviceAmount;
		ShipmentReviewActions.VerifyAdditionalInformationTollIPEC(SpeceialIns, PalletTransactionsInfoNo,
				tollExtraServiceAmount);

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
		 //BaseWebdriver.tearDown();

	}
}
