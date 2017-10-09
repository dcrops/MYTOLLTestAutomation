package manifestE2ETests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
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

	
	@Test(priority = 1)
	@Parameters({ "TollCarrierTollIntermodal", "ServiceExpress", "DropOffDepot", "CollectionDepot", "DGContactName",
			"ShipmentRef1", "ShipmentRef2", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height",
			"Weight","DGYes", "DGNo", "BillingType", "SpeceialIns","StatusInprogress","ChargeToAccount", }) 
	public void Manifest_TollIntermodal_E2ETest_TID_1121_Service_Express(String TollCarrier,
			String ServiceExpress, Integer dropOffDepot, Integer collectionDepot, String DGContactName,
			String ShipmentRef1, String ShipmentRef2, String ItemTemplateName, String NumberOfItems, String Length,
			String Width, String Height, String Weight, Integer DGYes, Integer DGNo, Integer BillingType,
			String SpeceialIns, String StatusInprogress) {

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
		//String sender = BookAPickupActions.GetSender(ChargeToAccount).toString();
		//System.out.println(sender);
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
		//ManifestActions.VerifyManifestDetails(StatusInprogress,location,TollCarrier,ChargeToAccount,);
		
		
		
	}

}
