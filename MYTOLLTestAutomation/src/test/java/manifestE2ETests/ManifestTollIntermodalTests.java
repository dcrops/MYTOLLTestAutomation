package manifestE2ETests;

import static org.testng.Assert.assertEquals;

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
import manifestActions.ManifestActions;


public class ManifestTollIntermodalTests {
	
	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	
	@Test
	@Parameters({"TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
		"TollExtraServiceAmount"}) 
	public void Manifest_TollIntermodal_E2ETest_TID_1121_Service_Express_VerifyManifestDetailsAddingManifestManually(String TollCarrier, String ServiceExpress,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		
		PageBase.MoveToElement(CreateShipmentActions.accountNumber,CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);
		String receiver=CreateShipmentActions.GetRecieverCompanyName();
		
		CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox, CreateShipmentActions.notifySenderCheckBox);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
	
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);

		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();
		
		//ManifestActions.VerifyManifestDetails(StatusInprogress,location,TollCarrier,ChargeToAccount,receiver, ServiceExpress, NumberOfItems, ItemTemplateName, Weight );
		
		
		
	}
	
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
		"TollExtraServiceAmount","ManifestName" }) 
	public void Manifest_TollIntermodal_E2ETest_TID_1121_Service_Express_AddManifestManually(String TollCarrier, String ServiceExpress,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount, String ManifestName) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		
		PageBase.MoveToElement( CreateShipmentActions.accountNumber,CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);

		

		CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox, CreateShipmentActions.notifySenderCheckBox);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);
		
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

		String RandomManifestName=ManifestActions.RandomManifestName(ManifestName);
		System.out.println("RandomManifestName=  "+  RandomManifestName);
		ManifestActions.AcceptAddToManifestToForAnExistingManifestSubmittingCreateshipment(RandomManifestName);
		//ManifestActions.ClickAddToManifestManually();
		String NewManifestName=ManifestActions.RandomManifestName(ManifestName);
		System.out.println(" NewManifestName=  "+  NewManifestName);
		ManifestActions.MoveToManifestAndCreateNewManifest(NewManifestName);
		System.out.println(" NewManifestName passed ");
		
		
		
	}
	
	@Test
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
		"TollExtraServiceAmount","ManifestName" }) 
	public void Manifest_TollIntermodal_E2ETest_TID_1121_Service_Express_AddToManifestForAnExistingManifestSubmittingCreateShipmentAndContinue(String TollCarrier, String ServiceExpress,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount, String ManifestName) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		
		PageBase.MoveToElement( CreateShipmentActions.accountNumber,CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);

		

		CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox, CreateShipmentActions.notifySenderCheckBox);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);
		
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

		
		String manifestNameFromAddToManifest=ManifestActions.GetManifestNameFromAddToManifest();
		System.out.println("Manifest name FromAddToManifest=  "+  manifestNameFromAddToManifest);
		String RandomManifestName=ManifestActions.RandomManifestName(ManifestName);

		System.out.println("RandomManifestName=  "+  RandomManifestName);
		ManifestActions.AcceptAddToManifestToForAnExistingManifestSubmittingCreateshipment(RandomManifestName);
		System.out.println("passed1 ");
		
		String manifestNameFromSaveManifest=ManifestActions.MoveToManifestAndSaveManifest(); //manifestNameFromAddToManifest
		System.out.println("manifestNameFromSaveManifest =  "+ manifestNameFromSaveManifest);
		ManifestActions.ClickAddManifest();
		String manifestName=ManifestActions.GetManifestNameFromManifestReviewPage();
		System.out.println("Manifest name =  "+ manifestName);
		String manifestNameHading=ManifestActions.GetManifestNameFromManifestReviewPage().substring(11,34);
		//System.out.println("Manifest name =  "+ manifestName);
		System.out.println("manifestNameHading =  "+ manifestNameHading);	
		manifestNameFromAddToManifest.equalsIgnoreCase(manifestName);
		assertEquals(manifestNameFromSaveManifest.equalsIgnoreCase(manifestNameHading), true);
		
	}
	
	@Test(priority=-2)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
		"TollExtraServiceAmount","ManifestName" }) 
	public void Manifest_TollIntermodal_E2ETest_TID_1121_Service_Express_AddToManifestCreateNewManifestSubmittingCreateShipmentAndContinue(String TollCarrier, String ServiceExpress,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount, String ManifestName) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		
		PageBase.MoveToElement( CreateShipmentActions.accountNumber,CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);

		

		CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox, CreateShipmentActions.notifySenderCheckBox);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
	
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);
		
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

		String RandomManifestName=ManifestActions.RandomManifestName(ManifestName);
		ManifestActions.AcceptAddToManifestCreatingNewManifestSubmittingCreateshipment(RandomManifestName);
		
		
		String RandomManifestName2=ManifestActions.RandomManifestName(ManifestName);

		System.out.println("RandomManifestName=  "+  RandomManifestName2);
		ManifestActions.AcceptAddToManifestToForAnExistingManifestSubmittingCreateshipment(RandomManifestName2);
		System.out.println("passed1 ");
		ManifestActions.MoveToManifestAndCreateNewManifest(RandomManifestName2);
		String manifestName=ManifestActions.GetManifestNameFromManifestReviewPage();
		System.out.println("Manifest name =  "+ manifestName);

		String manifestNameHading=ManifestActions.GetManifestNameFromManifestReviewPage().substring(11,34);
		
		System.out.println("Manifest name =  "+ manifestNameHading);	
		RandomManifestName.equalsIgnoreCase( manifestNameHading);
		assertEquals(RandomManifestName2.equalsIgnoreCase( manifestNameHading), true);
		
		
	}

	@Test(priority=-1)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "AccountNumberTINTER", "ReceiverName", "ReceiverItem",
		"DropOffDepot", "CollectionDepot", "DGContactName", "ShipmentRef1", "ShipmentRef2", "ItemTemplateName",
		"NumberOfItems", "Length", "Width", "Height", "Weight", "DGYes", "DGNo", "BillingType", "SpeceialIns",
		"TollExtraServiceAmount","ManifestName" }) 
	public void Manifest_TollIntermodal_E2ETest_TID_1121_Service_Express_AddToManifestBySystemGeneratedManifestSubmittingCreateShipmentAndContinue(String TollCarrier, String ServiceExpress,
			String AccountNumber, String ReceiverName, String ReceiverItem, String dropOffDepot, String collectionDepot,
			String DGContactName, String ShipmentRef1, String ShipmentRef2, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, Integer DGYes,
			Integer DGNo, String BillingType, String SpeceialIns, String TollExtraServiceAmount, String ManifestName) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceExpress);

		BookAPickupActions.EnterAccountNumber(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);

		CreateShipmentActions.SelectMode(1);
		
		PageBase.MoveToElement( CreateShipmentActions.accountNumber,CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(2);

		
		CreateShipmentActions.SelectShipmentConsolidationContinue();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox, CreateShipmentActions.notifySenderCheckBox);

		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);

		CreateShipmentActions.EnterDropOffDepot(dropOffDepot);
		CreateShipmentActions.EnterCollectionDepot(collectionDepot);
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.EnterBillingType(BillingType);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		
		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		
		PageBase.MoveToElement(BookAPickupActions.dangerousGoodNo, BookAPickupActions.itemDescriptionTextField);
		
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

		String RandomManifestName=ManifestActions.RandomManifestName(ManifestName);
		PageBase.Scrollbar(0, 250);
		//PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
		//ManifestActions.AcceptAddToManifestSystemGeneratedManifestSubmittingCreateshipment(RandomManifestName);
		String systemGeneratedManifestName=ManifestActions.AddToNewManifestSystemGeneratedManifestSubmittingCreateshipment();
		System.out.println("systemGeneratedManifestName=  "+  systemGeneratedManifestName);
		ManifestActions.ClickAddtoExistingManifest();
		ShipmentReviewActions.ClickContinue() ;	
			
		String RandomManifestName2=ManifestActions.RandomManifestName(ManifestName);

		String manifestName=ManifestActions.GetManifestNameFromManifestReviewPage();
		System.out.println("Manifest name =  "+ manifestName);

		String manifestNameHading=ManifestActions.GetManifestNameFromManifestReviewPage().substring(11,32);
		
		System.out.println("Manifest name =  "+ manifestNameHading);	
		systemGeneratedManifestName.equalsIgnoreCase( manifestNameHading);
		assertEquals(systemGeneratedManifestName.equalsIgnoreCase( manifestNameHading), true);
	}

	
	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();

	}
}
