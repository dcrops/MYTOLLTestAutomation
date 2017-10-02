package createShipmentE2ETests;

import org.openqa.selenium.JavascriptExecutor;
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
			Integer ServiceDGFreight, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		
		CreateShipmentActions.SelectService(ServiceDGFreight);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1); 
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		// new WebDriverWait(BaseWebdriver.driver,
		// 10).until(ExpectedConditions.alertIsPresent());
		// BaseWebdriver.driver.switchTo().alert().accept();
		// CreateShipmentActions.SelectShipmentConsolidated();

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.EnterDGContactName(DGContactName);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.SelectDangerousGoods(DGNo);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 4)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceDGFreight", "DropOffDepot", "CollectionDepot",
			"DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
			"Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_DGFreight_ShipmentReview(String TollCarrier,
			Integer ServiceDGFreight, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		//CreateShipmentActions.SelectTollCarrierItem(TollCarrierItem);
		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		CreateShipmentActions.SelectService(ServiceDGFreight);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1); 
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		// new WebDriverWait(BaseWebdriver.driver,
		// 10).until(ExpectedConditions.alertIsPresent());
		// BaseWebdriver.driver.switchTo().alert().accept();
		// CreateShipmentActions.SelectShipmentConsolidated();

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.EnterDGContactName(DGContactName);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

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
			Integer ServiceExpress, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		//CreateShipmentActions.SelectTollCarrierItem(TollCarrierItem);
		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		CreateShipmentActions.SelectService(ServiceExpress);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		// new WebDriverWait(BaseWebdriver.driver,
		// 10).until(ExpectedConditions.alertIsPresent());
		// BaseWebdriver.driver.switchTo().alert().accept();
		// CreateShipmentActions.SelectShipmentConsolidated();

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.SelectMode(1);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

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
			Integer ServiceExpress, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		CreateShipmentActions.SelectService(ServiceExpress);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		// new WebDriverWait(BaseWebdriver.driver,
		// 10).until(ExpectedConditions.alertIsPresent());
		// BaseWebdriver.driver.switchTo().alert().accept();
		// CreateShipmentActions.SelectShipmentConsolidated();

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.SelectMode(1);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

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
			Integer ServiceGeneral, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		CreateShipmentActions.SelectService(ServiceGeneral);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		
		// CreateShipmentActions.SelectShipmentConsolidated();

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.SelectMode(1);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

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
			Integer ServiceGeneral, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		CreateShipmentActions.SelectService(ServiceGeneral);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		
		// CreateShipmentActions.SelectShipmentConsolidated();

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.SelectMode(1);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

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
	@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "DropOffDepot", "CollectionDepot",
			"DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
			"Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns" })
	public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Refrigeration(String TollCarrier,
			Integer ServiceRefrigeration, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);

		CreateShipmentActions.SelectService(ServiceRefrigeration);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(1);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(1);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		
		// CreateShipmentActions.SelectShipmentConsolidated();

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.SelectMode(1);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		//CreateShipmentActions.SelectBillingType(BillingType);
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.SelectDangerousGoods(DGNo);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	//@Test(priority = 1)
		@Parameters({ "TollCarrierTollIntermodal", "ServiceRefrigeration", "DropOffDepot", "CollectionDepot",
				"DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width",
				"Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns" })
		public void CreateShipment_TollIntermodal_E2ETest_TID_920_Service_Refrigeration_ShipmentReview(String TollCarrier,
				Integer ServiceRefrigeration, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
				String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
				String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
				String SpeceialIns) {

			BookAPickupActions.EnterTollCarrierItem(TollCarrier);

			CreateShipmentActions.SelectService(ServiceRefrigeration);
			
			// BookAPickupActions.SelectAccountNumber1();
			BookAPickupActions.SelectAccountNumber1();
			CreateShipmentActions.SelectTempratureType(1);
			CreateShipmentActions.SelectWhoPays(1);
			// CreateShipmentActions.EnterAccountNumber("123");
			CreateShipmentActions.SelectMode(1);
			CreateShipmentActions.SelectSender(2);
			CreateShipmentActions.SelectReceiver(3);
			
			// CreateShipmentActions.SelectShipmentConsolidated();

			CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
			CreateShipmentActions.SelectCollectionDepot(collectionDepot);
			CreateShipmentActions.SelectMode(1);

			CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

			BookAPickupActions.EnterItem(ItemTemplateName);
			CreateShipmentActions.NumberOfItem(NumberOfItems);
			BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
			CreateShipmentActions.EnterWeight(Weight);

			// Shipment contain Dangerous goods=no and no food items
			BookAPickupActions.SelectDangerousGoods(DGNo);

			//CreateShipmentActions.SelectBillingType(BillingType);
			// RateEnquiryActions.SelectBillingTypeTDF(1);

			CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
			JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
			jse.executeScript("scroll(0, 250)");

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
