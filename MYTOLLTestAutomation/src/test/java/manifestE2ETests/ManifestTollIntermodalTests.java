package manifestE2ETests;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import myTollHomePageActions.MyTollHomePageActions;
import manifestActions.ManifestActions;
import createShipmentActions.ShipmentReviewActions;

public class ManifestTollIntermodalTests {
	
	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	
	@Test(priority = 1)
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
		
		PageBase.MoveToElement( CreateShipmentActions.accountNumber,CreateShipmentActions.quoteNumber);

		CreateShipmentActions.SelectSender(1);
		CreateShipmentActions.SelectReceiver(1);

		
		CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox, CreateShipmentActions.notifySenderCheckBox);

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

		
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();
		
		//ManifestActions.VerifyManifestDetails(StatusInprogress,location,TollCarrier,ChargeToAccount,);
		
		
		
	}
	
	@Test(priority = 2)
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
		CreateShipmentActions.SelectReceiver(1);

		

		CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox, CreateShipmentActions.notifySenderCheckBox);

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
		
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

		String RandomManifestName=ManifestActions.RandomManifestName(ManifestName);
		ManifestActions.AcceptAddToManifestToForAnExistingManifestSubmittingCreateshipment(RandomManifestName);
		ShipmentReviewActions.ClickAddToManifestManually();
		String NewManifestName=ManifestActions.RandomManifestName(ManifestName);
		ManifestActions.MoveToManifestAndCreateNewManifest(NewManifestName);
		
		
		
	}
	
	@Test(priority = 1)
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
		CreateShipmentActions.SelectReceiver(1);

		

		CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox, CreateShipmentActions.notifySenderCheckBox);

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
		ManifestActions.AcceptAddToManifestToForAnExistingManifestSubmittingCreateshipment(RandomManifestName);
	
	
		String manifestName=ManifestActions.GetManifestNameFromManifestReviewPage();
		System.out.println("Manifest name =  "+ manifestName);
		String manifestNameHading=ManifestActions.GetManifestNameFromManifestReviewPage().substring(11,34);
		
		System.out.println("Manifest name =  "+ manifestNameHading);	
		manifestNameFromAddToManifest.equalsIgnoreCase( manifestNameHading);
		assertEquals(manifestNameFromAddToManifest.equalsIgnoreCase( manifestNameHading), true);
		
	}
	
	@Test(priority = 3)
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
		CreateShipmentActions.SelectReceiver(1);

		

		CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox, CreateShipmentActions.notifySenderCheckBox);

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
		
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

		String RandomManifestName=ManifestActions.RandomManifestName(ManifestName);
		ManifestActions.AcceptAddToManifestCreatingNewManifestSubmittingCreateshipment(RandomManifestName);
		
		String manifestName=ManifestActions.GetManifestNameFromManifestReviewPage();
		System.out.println("Manifest name =  "+ manifestName);

		String manifestNameHading=ManifestActions.GetManifestNameFromManifestReviewPage().substring(11,34);
		
		System.out.println("Manifest name =  "+ manifestNameHading);	
		RandomManifestName.equalsIgnoreCase( manifestNameHading);
		assertEquals(RandomManifestName.equalsIgnoreCase( manifestNameHading), true);
		
		
	}

	@Test(priority = 4)
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
		CreateShipmentActions.SelectReceiver(1);

		
		CreateShipmentActions.SelectShipmentConsolidated();
		PageBase.MoveToElement(CreateShipmentActions.notifyReceiverCheckBox, CreateShipmentActions.notifySenderCheckBox);

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
		
		BookAPickupActions.SelectDangerousGoods(DGNo);
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		PageBase.MoveToElement(CreateShipmentActions.addPalletYes, CreateShipmentActions.tollExtraSrviceNOBtn);
		CreateShipmentActions.SelectPalletTransactionsYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraServiceAmount);
		CreateShipmentActions.ClickReviewCreateShipment();

		String RandomManifestName=ManifestActions.RandomManifestName(ManifestName);
		ManifestActions.AcceptAddToManifestSystemGeneratedManifestSubmittingCreateshipment(RandomManifestName);
		ManifestActions.ClickAddNewShipmentBtn();
		String pageHeading=CreateShipmentActions.GetCreateShipmentHeading();
		System.out.println("pageHeading =  "+ pageHeading);	
		
		assertEquals(pageHeading, "CREATE SHIPMENT");
		String tollCarrier=BookAPickupActions.GetSelectedTollCarrierName();
		assertEquals(tollCarrier, TollCarrier);
	}

}
