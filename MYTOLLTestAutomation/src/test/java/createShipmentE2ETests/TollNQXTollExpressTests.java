package createShipmentE2ETests;


import org.openqa.selenium.JavascriptExecutor;
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
	@Parameters({ "TollCarrierItemTollNQXTollExpress", "TollNQXServiceGeneral","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_General(
			String TollCarrierItem,String TollNQXServiceGeneral,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrierItem);
		
		CreateShipmentActions.EnterService(TollNQXServiceGeneral);
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		//CreateShipmentActions.SelectShipmentConsolidated();
		CreateShipmentActions.SelectShipmentConsolidatedContinue();
		PageBase.MediumWaitForElementEnabled();
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		//CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		//CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test(priority = 2)
	@Parameters({ "TollCarrierItemTollNQXTollExpress", "TollNQXServiceExpress","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_Express(
			String TollCarrierItem,String TollNQXServiceExpress,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrierItem);
		
		CreateShipmentActions.EnterService(TollNQXServiceExpress);
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidatedContinue();
		PageBase.MediumWaitForElementEnabled();
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		//CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		//CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

	
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 3)
	@Parameters({"TollCarrierItemTollNQXTollExpress", "TollNQXServicePremium","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_Premium(
			String TollCarrierItem,String TollNQXServicePremium,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrierItem);
		CreateShipmentActions.EnterService(TollNQXServicePremium);
		
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidatedContinue();
		PageBase.MediumWaitForElementEnabled();
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		//CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		//CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 4)
	@Parameters({"TollCarrierItemTollNQXTollExpress", "TollNQXServiceRefrigeration","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_Refrigeration(
			String TollCarrierItem,Integer TollNQXServiceRefrigeration,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrierItem);
		
		CreateShipmentActions.SelectService(TollNQXServiceRefrigeration);
		//CreateShipmentActions.ClickContinueAccountChangeMsg();
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidatedContinue();
		PageBase.MediumWaitForElementEnabled();
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		//CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		//CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 5)
	@Parameters({"TollCarrierItemTollNQXTollExpress", "TollNQXServiceDangerousGoods","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_DangerousGoods(
			String TollCarrierItem,Integer TollNQXServiceDangerousGoods,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName, String DGContactNumber,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrierItem);
		
		CreateShipmentActions.SelectService(TollNQXServiceDangerousGoods);
		//CreateShipmentActions.ClickContinueAccountChangeMsg();
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidatedContinue();
		PageBase.MediumWaitForElementEnabled();
		CreateShipmentActions.VerifyDGContactName(DGContactName);
		CreateShipmentActions.VerifyDGContactNumber(DGContactNumber);
		
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		//CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		//CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(DGItem, LookupSearch, PackageDescription,DgPkgQty, DgQtyKg);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 6)
	@Parameters({ "TollCarrierItemTollNQXTollExpress", "TollNQXServiceDGExpress","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_DGExpress(
			String TollCarrierItem,Integer TollNQXServiceDGExpress,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName, String DGContactNumber,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrierItem);
		
		CreateShipmentActions.SelectService(TollNQXServiceDGExpress);
		//CreateShipmentActions.ClickContinueAccountChangeMsg();
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		PageBase.MediumWaitForElementEnabled();
		CreateShipmentActions.VerifyDGContactName(DGContactName);
		CreateShipmentActions.VerifyDGContactNumber(DGContactNumber);
		
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		//CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		//CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(DGItem, LookupSearch, PackageDescription,DgPkgQty, DgQtyKg);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 7)
	@Parameters({"TollCarrierItemTollNQXTollExpress", "TollNQXServiceDGRefrigeration","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_DGRefrigerated(
			String TollCarrierItem,Integer TollNQXServiceDGRefrigeration,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName, String DGContactNumber,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrierItem);
		
		CreateShipmentActions.SelectService(TollNQXServiceDGRefrigeration);
		//CreateShipmentActions.ClickContinueAccountChangeMsg();
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidatedContinue();
		PageBase.MaximumWaitForElementEnabled();
		CreateShipmentActions.VerifyDGContactName(DGContactName);
		CreateShipmentActions.VerifyDGContactNumber(DGContactNumber);
		
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		//CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		//CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(DGItem, LookupSearch, PackageDescription,DgPkgQty, DgQtyKg);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 8)
	@Parameters({ "TollCarrierItemTollNQXTollExpress", "TollNQXServiceRailGeneral","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_RailGeneral(
			String TollCarrierItem,Integer TollNQXServiceRailGeneral,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName, String DGContactNumber,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrierItem);
		
		CreateShipmentActions.SelectService(TollNQXServiceRailGeneral);
		CreateShipmentActions.ClickContinueAccountChangeMsg();
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidatedContinue();
		PageBase.MediumWaitForElementEnabled();
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		//CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		//CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(DGItem, LookupSearch, PackageDescription,DgPkgQty, DgQtyKg);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	

	@Test(priority = 9)
	@Parameters({"TollCarrierItemTollNQXTollExpress", "TollNQXServiceRailDangerousGoods","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName", "DGContactNumber","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollNQXTollEXpress_E2ETest_TID_920_Service_RailDangerousGoods(
			String TollCarrierItem,Integer TollNQXServiceRailDangerousGoods,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName, String DGContactNumber,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrierItem);
		
		CreateShipmentActions.SelectService(TollNQXServiceRailDangerousGoods);
		CreateShipmentActions.ClickContinueAccountChangeMsg();
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		CreateShipmentActions.SelectShipmentConsolidatedContinue();
		PageBase.MaximumWaitForElementEnabled();
		CreateShipmentActions.VerifyDGContactName(DGContactName);
		CreateShipmentActions.VerifyDGContactNumber(DGContactNumber);
		
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		//CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		//CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(DGItem, LookupSearch, PackageDescription,DgPkgQty, DgQtyKg);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectFoodPackagingYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	
}
