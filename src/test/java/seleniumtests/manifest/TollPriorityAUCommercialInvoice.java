package seleniumtests.manifest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import global.PageBase;
import basewebdriver.BaseWebdriver;
import bookapickup.BookAPickupActions;
import mytollhomepage.MyTollHomePageActions;
import rateenquiry.RateEnquiryActions;
import createshipment.CreateShipmentActions;
import manifest.ManifestActions;

public class TollPriorityAUCommercialInvoice {

	@BeforeMethod(alwaysRun = true)
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	
	@Test(groups = {"E2E"})
	@Parameters({ "TollCarrierTollPrioAU", "ServiceGlobalExpressParcels","WhoPays", "Sender",
		"Receiver", "ItemTemplateName", "NumberOfItems", "Length", "Width",
		"Height", "Weight","DGYes", "DGNo", "TypeOfExport", "DeclaredValue", "DeclaredValueCurrency", "WhoPaysDutiesTaxes", "CommodityCode", "CountryOfExportAU", "DestinationNZ",
		"CommercialInvoiceDes", "PartNo", "ACHECC", "UnitValue",  "TermsofTrade"  })
	public void CreateShipment_TollPriorityAUS_CommercialInvoice_MYT1795_Service_GlobalExpressParcel(String TollCarrier,
			String ServiceGlobalExpressParcels,  Integer WhoPays, Integer Sender,
			Integer Receiver,  String ItemTemplateName, String NumberOfItems, String Length, String Width, String Height, String Weight,  
			String ShipmentContainDangerousGoodsYes, String ShipmentContainDangerousGoodsNo, 
			String TypeOfExport, String DeclaredValue, String DeclaredValueCurrency, String WhoPaysDutiesTaxes, String CommodityCode, String CountryOfExportAU, String DestinationNZ,
			String CommercialInvoiceDes, String PartNo, String ACHECC, String UnitValue, Integer TermsofTrade) {
		
		BookAPickupActions.EnterTollCarrier(TollCarrier);
		CreateShipmentActions.EnterService(ServiceGlobalExpressParcels);
		BookAPickupActions.SelectAccountNumber1();
		CreateShipmentActions.SelectWhoPays(WhoPays);
		CreateShipmentActions.SelectSender(1);
		//CreateShipmentActions.SelectReceiver(Receiver);
		RateEnquiryActions.ShipmentReceiverSelect("NZ Address");
		
		PageBase.MinimumWaitForElementEnabled_1();
		String AccountNumber = BookAPickupActions.GetAccountNumber().toString();
		System.out.println(AccountNumber);
		
		String sender = CreateShipmentActions.GetSenderCompanyName().toString().replace("\n", "");
		System.out.println("s ="+sender);
	
		String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
		System.out.println("sl ="+senderLocation);

		//CreateShipmentActions.SelectReceiver(Receiver);
		String receiver = CreateShipmentActions.GetRecieverCompanyName().toString().replace("\n", "");
		System.out.println("r ="+receiver);
	

		String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
		System.out.println("rl ="+receiverLocation);
	
		//Shipment Product Details
		ManifestActions.SelectShipmentConsolidated();
		PageBase.moveToElement(BookAPickupActions.itemDescriptionTextField);
		BookAPickupActions.EnterItem(ItemTemplateName);
		CreateShipmentActions.NumberOfItem(NumberOfItems);
		BookAPickupActions.EnterLengthWidthHeight(Length, Width, Height);
		CreateShipmentActions.EnterWeight(Weight);
		BookAPickupActions.selectDangerousGood();

		//Export Declaration
		CreateShipmentActions.TypeOfExport(TypeOfExport);
		CreateShipmentActions.DeclaredValue(DeclaredValue);
		CreateShipmentActions.DeclaredValueCurrency(DeclaredValueCurrency);
		CreateShipmentActions.WhoPaysDutiesTaxes(WhoPaysDutiesTaxes);
		CreateShipmentActions.HarmonisedCommodityCode(CommodityCode);
		
		
		//Submit Shipment and Print Manifest
		Reporter.log("User Clicks Review Shipment");
		PageBase.click(CreateShipmentActions.reviewCreateShipmentBtn,5);
		
		//Print Labels to enable commercial Invoice button
		ManifestActions.printLabelsandEnableComercialInvoice();
		
		
		
		//Verify Commercial Invoice Page Items
		ManifestActions.verifyCommercialInvoicePageItems();
		
		//BaseWebdriver.driver.get("file:///C:/Users/Sheyan%20Rizfee/Desktop/new%20test/Commercial%20Invoice%20-%20MyToll.html");

		String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		
		String[] shipmentDetails = {"813100055600",timeStamp,NumberOfItems,Weight+"kg","NZD "+DeclaredValue};
		for (int i =2; i<=shipmentDetails.length; i++) {
			PageBase.verifyTextSubString(By.xpath("//*[@id=\"commercial-invoice\"]/div[1]/div[1]/div/form/div["+i+"]/div/p"), shipmentDetails[i-1]);
		}
	
		PageBase.verifyTextExist(ManifestActions.commericalInvoiceSenderCompanyName, sender);
		//PageBase.verifyTextExist(ManifestActions.commericalInvoiceSenderAddress, senderLocation);
		PageBase.verifyTextExist(ManifestActions.commericalInvoiceCountryofExport, CountryOfExportAU);
		PageBase.verifyTextExist(ManifestActions.commericalInvoiceReceiverCompanyName, receiver);
		//PageBase.verifyTextExist(ManifestActions.commericalInvoiceReceiverAddress, receiverLocation);
		PageBase.verifyTextExist(ManifestActions.commericalInvoiceCountryofUltimateDestination, DestinationNZ);
		
		//Item Details
		ManifestActions.commercialInvoiceItemDetails(CommercialInvoiceDes, PartNo, ACHECC, NumberOfItems, Weight, UnitValue, DeclaredValue);
		
		ManifestActions.commercailInvoiceOtherDetails(TypeOfExport, TermsofTrade );
		PageBase.click(ManifestActions.commericalInvoiceSave, 5);
		
		
		//Verify Commercial Invoice Review Page Items
		PageBase.MaximumWaitForElementEnabled_1();
		ManifestActions.verifyCommercialInvoicePage(CommercialInvoiceDes, PartNo, ACHECC, NumberOfItems, Weight, UnitValue, DeclaredValue);
		
		//Print Commercial Invoice
		PageBase.click(ManifestActions.printCommericalInvoice, 10);
		PageBase.verifyTextExist(ManifestActions.commericalInvoiceErrorMsg2, "Please remember that this Commercial Invoice must be printed on to your company letterhead .");
		PageBase.isElementPresent(ManifestActions.finalPrintCommericalInvoice, 10, "Commercial Invoice Final Print Button");
		
		
	}

	
	@AfterMethod(alwaysRun = true)
	public void RunTearDown() throws Exception {
		 BaseWebdriver.tearDown();

	}

}
