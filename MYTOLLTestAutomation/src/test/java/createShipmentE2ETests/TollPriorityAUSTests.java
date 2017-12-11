package createShipmentE2ETests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;
import createShipmentActions.CreateShipmentActions;
import createShipmentActions.ShipmentReviewActions;

public class TollPriorityAUSTests {

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceParcelsOffPeak", "SenderEmail", "ReceiverEmail", "ItemTemplateName",
			"NumberOfItems", "Length", "Width", "Height", "Weight", "ShipmentRef1", "ShipmentRef2", "SpeceialIns" })
	public void CreateShipment_TollPriorityAUS_E2ETest_TID_920_Service_ParcelsOffPeak(String TollCarrier,
			String ServiceParcelsOffPeak, String SenderEmail, String ReceiverEmail, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String ShipmentRef1,
			String ShipmentRef2, String SpeceialIns) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceParcelsOffPeak);
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		// CreateShipmentActions.EnterReceiver("Test", "Test174");

		CreateShipmentActions.SelectShipmentConsolidationContinue();
		CreateShipmentActions.SelectNotifySenderAndReceiver();

		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		CreateShipmentActions.EnterShipmentReference1(ShipmentRef1);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);

		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		BookAPickupActions.selectDangerousGood();

		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll(0, 250)");

		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.selectDangerousGood();

		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceGlobalExpressDocuments", "SenderEmail", "ReceiverEmail",
			"ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight", "ShipmentRef1", "ShipmentRef2",
			"SpeceialIns" })
	public void CreateShipment_TollPriorityAUS_E2ETest_TID_920_Service_GlobalExpressDocuments(String TollCarrier,
			String ServiceGlobalExpressDocuments, String SenderEmail, String ReceiverEmail, String ItemTemplateName,
			String NumberOfItems, String Length, String Width, String Height, String Weight, String ShipmentRef1,
			String ShipmentRef2, String SpeceialIns) {

		// CreateShipmentActions.SelectTollCarrierItem(TollCarrier);
		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGlobalExpressDocuments);
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(1);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);

		CreateShipmentActions.SelectShipmentConsolidationContinue();
		CreateShipmentActions.SelectNotifySenderAndReceiver();

		CreateShipmentActions.EnterSenderEmail(SenderEmail);
		CreateShipmentActions.EnterReceiverEmail(ReceiverEmail);
		CreateShipmentActions.EnterShipmentReference1(ShipmentRef1);

		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);

		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		PageBase.Scrollbar(500, 800);
		BookAPickupActions.selectDangerousGood();
		PageBase.Scrollbar(1200, 1500);
		CreateShipmentActions.AddANewLineNZAUS();
		BookAPickupActions.selectDangerousGood();
		PageBase.Scrollbar(800, 1000);
		BookAPickupActions.EnterSpecialInstructions(SpeceialIns);
		CreateShipmentActions.ClickReviewCreateShipment();
	}

	@Test
	@Parameters({ "TollCarrierTollPrioAU", "ServiceGlobalExpressDocuments", "SenderEmail",
			"ReceiverEmail", "whoPays", "ItemTemplateName", "NumberOfItems", "Length", "Width", "Height", "Weight",
			"ShipmentRef1", "ShipmentRef2", "SpeceialIns" })
	public void CreateShipment_TollPriorityAUS_E2ETest_TID_920_Service_GlobalExpressDocuments_ShipmentConsolidation(
			String TollCarrier, String ServiceGlobalExpressDocuments,  String SenderEmail,
			String ReceiverEmail, String whoPays,String ItemTemplateName, String NumberOfItems, String Length, String Width,
			String Height, String Weight, String ShipmentRef1, String ShipmentRef2, String SpeceialIns) {

		// CreateShipmentActions.SelectTollCarrierItem(TollCarrier);
		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGlobalExpressDocuments);
		BookAPickupActions.SelectAccountNumber1();
		String AccountNumber = BookAPickupActions.GetAccountNumber().toString();
		System.out.println(AccountNumber);
		CreateShipmentActions.SelectWhoPays(1);
		CreateShipmentActions.SelectSender(2);
		CreateShipmentActions.SelectReceiver(3);
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s", "");
		System.out.println(sender);
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println(senderLocation);

		// CreateShipmentActions.SelectReceiver(2);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
		System.out.println(receiver);

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println(receiverLocation);
		CreateShipmentActions.SelectShipmentConsolidationConsolidate();
		PageBase.MoveToElement(CreateShipmentActions.senderReference, CreateShipmentActions.receiverReference);
		CreateShipmentActions.ClickReviewCreateShipment();

		// Shipment Review
		ShipmentReviewActions.VerifyShipmentOverviewTGX(TollCarrier, AccountNumber, sender, senderLocation, receiver,
				receiverLocation, ShipmentRef1, ServiceGlobalExpressDocuments, whoPays);

	}

	@AfterMethod
	public void RunTearDown() throws Exception {
		// BaseWebdriver.tearDown();

	}

}
