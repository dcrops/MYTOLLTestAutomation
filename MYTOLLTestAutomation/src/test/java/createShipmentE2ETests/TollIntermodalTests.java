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

	@Test(priority = 4)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "DropOffDepot", "CollectionDepot",
			"DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
			"Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_DGFreight(String TollCarrier,
			String ServiceDGFreight, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo,String lookupName,
			Integer lookupItem, String packageDescription, String pDgPkgQty, String pDgQtyKg,String technicalName, Integer BillingType,
			String SpeceialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceDGFreight);
		
		//CreateShipmentActions.SelectService(ServiceDGFreight);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1); 
		
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		
		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(250, 500);
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterDGContactName(DGContactName);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
	
		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		PageBase.Scrollbar(500, 1000);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);
		
		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup("II");
		BookAPickupActions.EnterTechnicalName(technicalName);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.SelectDangerousGoods(DGNo);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 4)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "DropOffDepot", "CollectionDepot",
			"DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
			"Height", "Weight", "DGYes", "DGNo",  "lookupName", "lookupItem", "packageDescription",
			"pDgPkgQty", "pDgQtyKg","technicalName","BillingType", "SpeceialIns" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_DGFreight_ShipmentReview(String TollCarrier,
			String ServiceDGFreight, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo,String lookupName,
			Integer lookupItem, String packageDescription, String pDgPkgQty, String pDgQtyKg,String technicalName, Integer BillingType,
			String SpeceialIns) {

		//CreateShipmentActions.SelectTollCarrierItem(TollCarrierItem);
		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceDGFreight);
		//CreateShipmentActions.SelectService(ServiceDGFreight);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1); 
		
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		
		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(250, 500);
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterDGContactName(DGContactName);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
	
		PageBase.Scrollbar(500, 1000);
		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);
		
		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(lookupItem, lookupName, packageDescription, pDgPkgQty, pDgQtyKg);
		BookAPickupActions.SelectPackgingGroup("II");
		BookAPickupActions.EnterTechnicalName(technicalName);
		
		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.SelectDangerousGoods(DGNo);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
		

		//Shipment Review
					
		/*ShipmentReviewActions.VerifyDispatchDate(pDispatchDate);
		ShipmentReviewActions.VerifyAccountNumber(pAccountNumber);
		ShipmentReviewActions.VerifyTollCarrier(pTollCarrier);
		ShipmentReviewActions.VerifySenderCompanyName();
		ShipmentReviewActions.VerifyReceiverCompanyName();
		ShipmentReviewActions.VerifyReceiverLocation();
		ShipmentReviewActions.VerifyService(pService);
		ShipmentReviewActions.VerifyWhopays();
		ShipmentReviewActions.VerifyFoodPackaging(pFoodPackaging);
		ShipmentReviewActions.VerifyItemName1(pItemName1);
		ShipmentReviewActions.VerifyPalletTransactionsInformation();
		ShipmentReviewActions.VerifyItemDescription1();
		ShipmentReviewActions.VerifyNumberOfItems();
		ShipmentReviewActions.VerifyDimensions();
		ShipmentReviewActions.VerifyVolume();
		ShipmentReviewActions.VerifyWeight();
		ShipmentReviewActions.VerifyReference1();
		ShipmentReviewActions.VerifyReference2();
		ShipmentReviewActions.VerifyShipmentContainDGGoods();*/
	}


	@Test(priority = 3)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "DropOffDepot", "CollectionDepot", "DGContactName",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height",
			"Weight","DGYes", "DGNo", "BillingType", "SpeceialIns" }) 
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Express(String TollCarrier,
			String ServiceExpress, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		//CreateShipmentActions.SelectTollCarrierItem(TollCarrierItem);
		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);
		//CreateShipmentActions.SelectService(ServiceExpress);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		
		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		
		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(500, 800);
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
		

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		PageBase.Scrollbar(800, 1000);
		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.SelectDangerousGoods(DGNo);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
		
		
	}
	
	//@Test(priority = 3)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "DropOffDepot", "CollectionDepot", "DGContactName",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height",
			"Weight","DGYes", "DGNo", "BillingType", "SpeceialIns" }) 
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Express_ShipmentReview(String TollCarrier,
			String ServiceExpress, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);
		//CreateShipmentActions.SelectService(ServiceExpress);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		
		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(250, 500);
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
		PageBase.Scrollbar(500, 1000);
		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
				
		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.SelectDangerousGoods(DGNo);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
		

		//Shipment Review
					
		/*ShipmentReviewActions.VerifyDispatchDate(pDispatchDate);
		ShipmentReviewActions.VerifyAccountNumber(pAccountNumber);
		ShipmentReviewActions.VerifyTollCarrier(pTollCarrier);
		ShipmentReviewActions.VerifySenderCompanyName();
		ShipmentReviewActions.VerifyReceiverCompanyName();
		ShipmentReviewActions.VerifyReceiverLocation();
		ShipmentReviewActions.VerifyService(pService);
		ShipmentReviewActions.VerifyWhopays();
		ShipmentReviewActions.VerifyFoodPackaging(pFoodPackaging);
		ShipmentReviewActions.VerifyItemName1(pItemName1);
		ShipmentReviewActions.VerifyPalletTransactionsInformation();
		ShipmentReviewActions.VerifyItemDescription1();
		ShipmentReviewActions.VerifyNumberOfItems();
		ShipmentReviewActions.VerifyDimensions();
		ShipmentReviewActions.VerifyVolume();
		ShipmentReviewActions.VerifyWeight();
		ShipmentReviewActions.VerifyReference1();
		ShipmentReviewActions.VerifyReference2();
		ShipmentReviewActions.VerifyShipmentContainDGGoods();*/
	}

	@Test(priority = 2)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "DropOffDepot", "CollectionDepot", "DGContactName",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height",
			"Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_General(String TollCarrier,
			String ServiceGeneral, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);
		//CreateShipmentActions.SelectService(ServiceGeneral);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		
		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(250, 500);
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
		PageBase.Scrollbar(500, 1000);
		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		

		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.SelectDangerousGoods(DGNo);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 2)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceGeneral", "DropOffDepot", "CollectionDepot", "DGContactName",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height",
			"Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_General_ShipmentReview(String TollCarrier,
			String ServiceGeneral, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);
		//CreateShipmentActions.SelectService(ServiceGeneral);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		
		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(250, 500);
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
	
		PageBase.Scrollbar(500, 1000);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
	
		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		PageBase.Scrollbar(1000,1200);
		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.SelectDangerousGoods(DGNo);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
		
		//Shipment Review
		
		/*ShipmentReviewActions.VerifyDispatchDate(pDispatchDate);
		ShipmentReviewActions.VerifyAccountNumber(pAccountNumber);
		ShipmentReviewActions.VerifyTollCarrier(pTollCarrier);
		ShipmentReviewActions.VerifySenderCompanyName();
		ShipmentReviewActions.VerifyReceiverCompanyName();
		ShipmentReviewActions.VerifyReceiverLocation();
		ShipmentReviewActions.VerifyService(pService);
		ShipmentReviewActions.VerifyWhopays();
		ShipmentReviewActions.VerifyFoodPackaging(pFoodPackaging);
		ShipmentReviewActions.VerifyItemName1(pItemName1);
		ShipmentReviewActions.VerifyPalletTransactionsInformation();
		ShipmentReviewActions.VerifyItemDescription1();
		ShipmentReviewActions.VerifyNumberOfItems();
		ShipmentReviewActions.VerifyDimensions();
		ShipmentReviewActions.VerifyVolume();
		ShipmentReviewActions.VerifyWeight();
		ShipmentReviewActions.VerifyReference1();
		ShipmentReviewActions.VerifyReference2();
		ShipmentReviewActions.VerifyShipmentContainDGGoods();*/
		
	}

	
	@Test(priority = 1)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration","AccountNumber","ReceiverName", "ReceiverItem", "DropOffDepot", "CollectionDepot",
			"DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
			"Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Refrigeration(String TollCarrier,
			String ServiceRefrigeration, String AccountNumber,String ReceiverName, String ReceiverItem, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		CreateShipmentActions.EnterService(ServiceRefrigeration);
		//BookAPickupActions.EnterService(ServiceRefrigeration);
		// BookAPickupActions.SelectAccountNumber1();
		//BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(1);
		
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		PageBase.Scrollbar(250, 500);
		
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);
		//CreateShipmentActions.SelectReceiver(3);
		
		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(250, 500);
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
		
		BookAPickupActions.EnterItem(ItemTemplateName);
		PageBase.Scrollbar(500, 1000);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);
		
		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.Scrollbar(1000,1200);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	//@Test(priority = 1)
		@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration","AccountNumber","ReceiverName", "ReceiverItem", "DropOffDepot", "CollectionDepot",
				"DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
				"Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns" })
		public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Refrigeration_ShipmentReview(String TollCarrier,
				String ServiceRefrigeration,String AccountNumber, String ReceiverName, String ReceiverItem,Integer dropOffDepot, Integer collectionDepot, String DGContactName,
				String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
				String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
				String SpeceialIns) {

			BookAPickupActions.EnterTollCarrierItem(TollCarrier);

			CreateShipmentActions.EnterService(ServiceRefrigeration);
			
			BookAPickupActions.EnterAccountNumber(AccountNumber);
			CreateShipmentActions.SelectTempratureType(1);
			CreateShipmentActions.SelectWhoPays(1);
		
			// CreateShipmentActions.EnterAccountNumber("123");
			CreateShipmentActions.SelectMode(1);
			PageBase.Scrollbar(250, 500);
			
			CreateShipmentActions.SelectSender(2);
			CreateShipmentActions.EnterReceiver(ReceiverName, ReceiverItem);
			
			 CreateShipmentActions.SelectShipmentConsolidated();
			PageBase.Scrollbar(250, 500);
			CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
			CreateShipmentActions.SelectCollectionDepot(collectionDepot);
			CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);
			PageBase.Scrollbar(800, 1000);

			BookAPickupActions.EnterItem(ItemTemplateName);
			CreateShipmentActions.NumberOfItem(NumberOfItems);
			BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
			CreateShipmentActions.EnterWeight(Weight);
			
			// Shipment contain Dangerous goods=no and no food items
			BookAPickupActions.SelectDangerousGoods(DGNo);

			//CreateShipmentActions.SelectBillingType(BillingType);
			// RateEnquiryActions.SelectBillingTypeTDF(1);

			CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
			
			CreateShipmentActions.AddANewLineNZAUS();
			BookAPickupActions.SelectDangerousGoods(DGNo);

			BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
			CreateShipmentActions.ClickReviewCreateShipment();
			
			//Shipment Review
						
			/*ShipmentReviewActions.VerifyDispatchDate(pDispatchDate);
			ShipmentReviewActions.VerifyAccountNumber(pAccountNumber);
			ShipmentReviewActions.VerifyTollCarrier(pTollCarrier);
			ShipmentReviewActions.VerifySenderCompanyName();
			ShipmentReviewActions.VerifyReceiverCompanyName();
			ShipmentReviewActions.VerifyReceiverLocation();
			ShipmentReviewActions.VerifyService(pService);
			ShipmentReviewActions.VerifyWhopays();
			ShipmentReviewActions.VerifyFoodPackaging(pFoodPackaging);
			ShipmentReviewActions.VerifyItemName1(pItemName1);
			ShipmentReviewActions.VerifyPalletTransactionsInformation();
			ShipmentReviewActions.VerifyItemDescription1();
			ShipmentReviewActions.VerifyNumberOfItems();
			ShipmentReviewActions.VerifyDimensions();
			ShipmentReviewActions.VerifyVolume();
			ShipmentReviewActions.VerifyWeight();
			ShipmentReviewActions.VerifyReference1();
			ShipmentReviewActions.VerifyReference2();
			ShipmentReviewActions.VerifyShipmentContainDGGoods();*/
			
		}

}
