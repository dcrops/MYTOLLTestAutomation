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


public class TollTasmaniaTests {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.CreateshipmentTollTasUsername, BaseWebdriver.CreateshipmentTollTasPassword);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test(priority = 1)
	@Parameters({ "TollCarrierTollTasmania", "ServiceDGFreight","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollTasmania_E2ETest_TID_920_Service_DGFreight(
			String TollCarrier,String ServiceDGFreight,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,
			String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceDGFreight);
		//CreateShipmentActions.SelectService(ServiceDGFreight);
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(QuoteNumber);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(250, 500);
		
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		CreateShipmentActions.SelectShipmentConsolidated();
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		//CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(DGItem, LookupSearch, PackageDescription,DgPkgQty, DgQtyKg);
				
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 2)
	@Parameters({ "TollCarrierTollTasmania", "ServiceExpress","WhoPays","Mode","QuoteNumber", "Sender", "Receiver","DropOffDepot", "CollectionDepot", "DGQuoteNumber","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", 
			"LookupSearch","PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo",
			"OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollTasmania_E2ETest_TID_920_Service_Express(
			String TollCarrier,String ServiceExpress,Integer WhoPays,Integer Mode, String QuoteNumber,Integer Sender,Integer Receiver, Integer dropOffDepot, Integer collectionDepot, String DGQuoteNumber,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,String ChepTansferToToll,
			String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(DGQuoteNumber);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(250, 500);

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		//CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(DGItem, LookupSearch, PackageDescription,DgPkgQty, DgQtyKg);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 3)
	@Parameters({ "TollCarrierTollTasmania", "ServiceGeneral","WhoPays","Mode","QuoteNumber", "Sender", "Receiver","DropOffDepot", "CollectionDepot", "DGQuoteNumber","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem",
			"LookupSearch","PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange",
			"LoscamTransferToToll", "LoscamDocketNo","OtherCostomer", "ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll",
			"LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollTasmania_E2ETest_TID_920_Service_General(
			String TollCarrier,String ServiceGeneral,Integer WhoPays,Integer Mode, String QuoteNumber,Integer Sender,Integer Receiver, Integer dropOffDepot, Integer collectionDepot, String DGQuoteNumber,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String ChepCustomer, String ChepExchange,String ChepTansferToToll,
			String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,String ChepOtherExchange,String ChepOtherTransferToToll,
			String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGeneral);
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(DGQuoteNumber);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		

		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(250, 500);
		
		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
	
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		//CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(DGItem, LookupSearch, PackageDescription,DgPkgQty, DgQtyKg);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);
		
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}
	
	@Test(priority = 4)
	@Parameters({ "TollCarrierTollTasmania", "ServiceRefrigeration","WhoPays","Mode","QuoteNumber", "Sender", "Receiver","DropOffDepot", "CollectionDepot", "DGQuoteNumber","DGContactName","SenderEmail","ReceiverEmail",
		"DGContactNumber","ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
		"PackageDescription","DgPkgQty" ,"DgQtyKg","ChepCustomer", "ChepExchange","ChepTansferToToll","ChepDocketNo","LoscamCustomer","LoascamExchange","LoscamTransferToToll", "LoscamDocketNo","OtherCostomer", 
		"ChepOtherExchange", "ChepOtherTransferToToll", "chepOtherDocketNo","LoscamOtherExchange", "LoscamOtherTransferToToll", "LoscamOtherDocketNo", "PurchaseOrder", "TollExtraSrviceAmount"})
	
	public void CreateShipment_TollTasmania_E2ETest_TID_920_Service_Refrigeration(
			String TollCarrier,String ServiceRefrigeration,Integer WhoPays,Integer Mode, String QuoteNumber,Integer Sender,Integer Receiver, Integer dropOffDepot, Integer collectionDepot, String DGQuoteNumber,
			String DGContactName,String DGContactNumber,String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,String 
			Width, String Height,String Weight, Integer DGYes,Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg,
			String ChepCustomer, String ChepExchange,String ChepTansferToToll,String ChepDocketNo, String LoscamCustomer,String LoascamExchange,String LoscamTransferToToll, String LoscamDocketNo, String OtherCostomer,
			String ChepOtherExchange,String ChepOtherTransferToToll,String chepOtherDocketNo,String LoscamOtherExchange, String LoscamOtherTransferToToll, String LoscamOtherDocketNo, String PurchaseOrder, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceRefrigeration);
		
		// BookAPickupActions.SelectAccountNumber1();
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectTempratureType(1);
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.EnterQuoteNumber(DGQuoteNumber);
		// CreateShipmentActions.EnterAccountNumber("123");
		CreateShipmentActions.SelectMode(Mode);
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);

		 CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.Scrollbar(250, 500);
		
		// CreateShipmentActions.SelectShipmentConsolidated();

		CreateShipmentActions.SelectDropOffDepot(dropOffDepot);
		CreateShipmentActions.SelectCollectionDepot(collectionDepot);
		
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		//CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGYes);

		// Enter dangerous goods details
		BookAPickupActions.EnterDangerousGoodsDetails(DGItem, LookupSearch, PackageDescription,DgPkgQty, DgQtyKg);
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		CreateShipmentActions.AddANewLineNZAUS();
		CreateShipmentActions.ItemType(2);
		BookAPickupActions.SelectDangerousGoods(DGNo);

		CreateShipmentActions.SelectPalletTransactionsYes();
		
		CreateShipmentActions.EnterPalletTransActionInformations(ChepCustomer,ChepExchange,ChepTansferToToll,ChepDocketNo,LoscamCustomer,LoascamExchange,LoscamTransferToToll,LoscamDocketNo,
				OtherCostomer,ChepOtherExchange, ChepOtherTransferToToll, chepOtherDocketNo, LoscamOtherExchange,LoscamOtherTransferToToll, LoscamOtherDocketNo);
		
		CreateShipmentActions.EnterPurchaseOrder(PurchaseOrder);
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraSrviceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}

}
