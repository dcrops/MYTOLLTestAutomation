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

public class TollIPECTests {
	
	/*@Parameters("browser")
	@BeforeMethod
	public void RunSetup(String browser) throws Exception {
		BaseWebdriver.RunSetup(browser);
		MyTollHomePageActions.Login(BaseWebdriver.CreateshipmentTollTasUsername, BaseWebdriver.CreateshipmentTollTasPassword);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}*/
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test(priority = 1)
	@Parameters({"TollCarrierTollIPEC", "ServiceRoadExpress","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","TollExtraSrviceAmount"})
	
	public void CreateShipment_TollIPEC_E2ETest_TID_920_Service_RoadExpress(
			String TollCarrier,String ServiceRoadExpress,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String TollExtraSrviceAmount
			) {


		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceRoadExpress);
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		PageBase.MaximumWaitForElementEnabled();
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		//CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		//CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(500, 800)");

		CreateShipmentActions.AddANewLineTIPEC();
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectAuthorityToLeaveYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
	}


	@Test(priority = 1)
	@Parameters({"TollCarrierTollIPEC", "ServiceRoadExpress","WhoPays","Mode", "Sender", "Receiver","QuoteNumber","DropOffDepot", "CollectionDepot", "DGContactName","SenderEmail","ReceiverEmail",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight","DGYes", "DGNo", "BillingType", "SpeceialIns", "DGItem", "LookupSearch",
			"PackageDescription","DgPkgQty" ,"DgQtyKg","TollExtraSrviceAmount"})
	
	public void CreateShipment_TollIPEC_E2ETest_TID_920_Service_RoadExpress_ShipmentReview(
			String TollCarrier,String ServiceRoadExpress,Integer WhoPays,Integer Mode,Integer Sender,Integer Receiver, String QuoteNumber,Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String SenderEmail, String ReceiverEmail,String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,	String Width, String Height, String Weight, 
			Integer DGYes, Integer DGNo, Integer BillingType,String SpeceialIns, Integer DGItem, String LookupSearch, String PackageDescription, String DgPkgQty, String DgQtyKg, String TollExtraSrviceAmount
			) {

		BookAPickupActions.EnterTollCarrierItem(TollCarrier);
		CreateShipmentActions.EnterService(ServiceRoadExpress);
			
		
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		// CreateShipmentActions.EnterAccountNumber("123");
		
		CreateShipmentActions.SelectSender(Sender);
		CreateShipmentActions.SelectReceiver(Receiver);
		PageBase.MaximumWaitForElementEnabled();
		CreateShipmentActions.SelectNotifySenderAndReceiver();
		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		//CreateShipmentActions.SelectShipmentConsolidated();
		
		CreateShipmentActions.EnterShipmentReferences(ShipmentRef1, ShipmentRef2);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		//CreateShipmentActions.ItemType(2);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		//CreateShipmentActions.SelectBillingType(BillingType);

		// Shipment contain Dangerous goods=no and no food items
		BookAPickupActions.SelectDangerousGoods(DGNo);

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		
		// RateEnquiryActions.SelectBillingTypeTDF(1);

		CreateShipmentActions.EnterSenderReference(ShipmentRef1, ShipmentRef2);
		
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineTIPEC();
		BookAPickupActions.SelectDangerousGoods(DGNo);
		CreateShipmentActions.SelectAuthorityToLeaveYes();
		CreateShipmentActions.SelectTollExtraYes();
		CreateShipmentActions.EnterTollExtraServiceAmount(TollExtraSrviceAmount);
		
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		
		CreateShipmentActions.ClickReviewCreateShipment();
		

		//Shipment Review
					
		/*ShipmentReviewActions.VerifyDispatchDate(pDispatchDate);
		ShipmentReviewActions.VerifyAccountNumber(pAccountNumber);
		ShipmentReviewActions.VerifyTollCarrier(TollCarrier);
		ShipmentReviewActions.VerifySenderCompanyName();
		ShipmentReviewActions.VerifyReceiverCompanyName();
		ShipmentReviewActions.VerifyReceiverLocation();
		ShipmentReviewActions.VerifyService(TollIPECServiceRoadExpress);
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
