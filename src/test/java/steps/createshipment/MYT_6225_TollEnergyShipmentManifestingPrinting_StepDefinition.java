package steps.createshipment;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import createshipment.CreateShipmentActions;
import createshipment.ShipmentReviewActions;
import global.PageBase;
import bookapickup.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manifest.ManifestActions;

public class MYT_6225_TollEnergyShipmentManifestingPrinting_StepDefinition {

	@When("^User continue enters shipment overview details as below to create a shipment$")
	public void user_continue_enters_shipment_overview_details_as_below_to_create_a_shipment(DataTable shipmentTestData)
			throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			 CreateShipmentActions.EnterService(shipment.get("Service"));
			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
			String s = shipment.get("Whopays");
			System.out.println("S  " + s);
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			String s2 = shipment.get("Mode");
			System.out.println("S2  " + s2);
			CreateShipmentActions.SelectMode(Integer.parseInt(s2));
			CreateShipmentActions.EnterSender(shipment.get("Sender"));
			CreateShipmentActions.EnterReceiver(shipment.get("Receiver"));
			CreateShipmentActions.SelectShipmentConsolidationContinue();
			CreateShipmentActions.EnterDGContactDetails(shipment.get("DGContactName"), shipment.get("DGContactNumber"));
			/*PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
					CreateShipmentActions.notifyReceiverCheckBox);*/
			// CreateShipmentActions.EnterSenderEmail(SenderEmail);
			CreateShipmentActions.EnterReceiverEmail(shipment.get("ReceiverEmail"));
			CreateShipmentActions.EnterDropOffDepot(shipment.get("DropOffDepot"));
			CreateShipmentActions.EnterCollectionDepot(shipment.get("CollectionDepot"));

			PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
			CreateShipmentActions.EnterShipmentReferences(shipment.get("ShipmentRef1"), shipment.get("ShipmentRef2"));
			PageBase.MaximumWaitForElementEnabled();
		}

	}
	
	@When("^User continue entering shipment overview details as below to create a shipment$")
	public void user_continue_entering_shipment_overview_details_as_below_to_create_a_shipment(DataTable shipmentTestData) throws Throwable {
	  
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			 CreateShipmentActions.EnterService(shipment.get("Service"));
			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
			String s = shipment.get("Whopays");
			System.out.println("S  " + s);
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			//String s2 = shipment.get("Mode");
			//System.out.println("S2  " + s2);
			//CreateShipmentActions.SelectMode(Integer.parseInt(s2));
			//PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.mode);
			CreateShipmentActions.EnterSender(shipment.get("Sender"));
			CreateShipmentActions.EnterReceiver(shipment.get("Receiver"));
			CreateShipmentActions.SelectShipmentConsolidationContinue();

			/*PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
					CreateShipmentActions.notifyReceiverCheckBox);*/
			// CreateShipmentActions.EnterSenderEmail(SenderEmail);
			CreateShipmentActions.EnterReceiverEmail(shipment.get("ReceiverEmail"));
			CreateShipmentActions.EnterCollectionDepot(shipment.get("CollectionDepot"));

			PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
			CreateShipmentActions.EnterShipmentReferences(shipment.get("ShipmentRef1"), shipment.get("ShipmentRef2"));
			PageBase.MaximumWaitForElementEnabled();
		}
	}

	@When("^User enters following dangerous goods details$")
	public void user_enters_following_dangerous_goods_details(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			CreateShipmentActions.EnterDangerousGoodsDetails(1, shipment.get("UnNumber"),
					shipment.get("PackageDescription"), shipment.get("DGPackageType"), shipment.get("DGAggregateQty"));
			BookAPickupActions.SelectPackgingGroupString(shipment.get("PackingGroup"));
			BookAPickupActions.EnterTechnicalName(shipment.get("Technical Name"));
		}

	}

	@Then("^User be able to see following fields are autopopulated\\.$")
	public void user_be_able_to_see_following_fields_are_autopopulated(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			String un = CreateShipmentActions.GetUNNumber();
			System.out.println("Un----" + un);
			String classDivision = BookAPickupActions.GetClassDivision();
			System.out.println("Class----" + classDivision);
			String subRisk = BookAPickupActions.GetSubRisk();
			System.out.println("Subrisk----" + subRisk);
			String packingGroup = BookAPickupActions.GetPackingGroup();
			System.out.println("packingGroup1" + packingGroup);
			String ProperShippingName = BookAPickupActions.GetProperShippingName();
			System.out.println("ProperShippingName" + ProperShippingName);

			assertEquals(classDivision, shipment.get("Class/Div"));
			assertEquals(subRisk, shipment.get("SubRisk"));
			assertEquals(packingGroup, shipment.get("PackingGroup"));
			assertEquals(ProperShippingName, shipment.get("Proper Shoping Name"));

		}
	}

	@When("^User clicks on 'ADD' to add dangerous goods details$")
	public void user_clicks_on_ADD_to_add_dangerous_goods_details() throws Throwable {
		PageBase.MaximumWaitForElementEnabled();
		BookAPickupActions.ClickAdd();
	}

	@When("^User enters additional information for shipment as below$")
	public void user_enters_additional_information_for_shipment_as_below(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MoveToElement(BookAPickupActions.specialInstructions,
					CreateShipmentActions.purchaseorderTextField);
			CreateShipmentActions.EnterPurchaseOrder(shipment.get("PurchaseOrder"));

			BookAPickupActions.EnterSpecialInstructions(shipment.get("SpecialInstructions"));
		}

	}

	@When("^User enters chep pallet information as below$")
	public void user_enters_chep_pallet_information_as_below(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			CreateShipmentActions.SelectPalletTransactionsYes();
			CreateShipmentActions.EnterPalletTransActionChepInformations(shipment.get("ChepCustomerOwn"),
					shipment.get("ChepExchange"), shipment.get("ChepTransfer"), shipment.get("ChepDocketNo"));
		}

	}

	@When("^User enters Loscam pallet information as below$")
	public void user_enters_Loscam_pallet_information_as_below(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			CreateShipmentActions.EnterPalletTransActionLoscamInformations(shipment.get("LoscamCustomerOwn"),
					shipment.get("LoscamExchange"), shipment.get("LoscamTransfer"), shipment.get("LoscamDocketNo"));
		}
	}

	@When("^User enters Other pallet information as below$")
	public void user_enters_Other_pallet_information_as_below(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			CreateShipmentActions.EnterPalletTransActionOtherCustomerInformations(shipment.get("OtherCustomerOwn"));
		}
	}

	@When("^User enters Chep other pallet information as below$")
	public void user_enters_Chep_other_pallet_information_as_below(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			CreateShipmentActions.EnterPalletTransActionChepOtherInformations(shipment.get("ChepOtherExchange"),
					shipment.get("ChepOtherTransfer"), shipment.get("ChepOtherDocketNo"));
		}
	}

	@When("^User enters Loscam other information as below$")
	public void user_enters_Loscam_other_information_as_below(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			CreateShipmentActions.EnterPalletTransActionLoscamOtherInformations(shipment.get("LoscamOtherExchange"),
					shipment.get("LoscamOtherTransfer"), shipment.get("LoscamOtherDocketNo"));
		}
	}

	@Then("^User clicks on 'Create Shipment' and User navigates to Shipment Review page and see Overview details as below\\.$")
	public void user_clicks_on_Create_Shipment_and_User_navigates_to_Shipment_Review_page_and_see_Overview_details_as_below(
			DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			String mode = CreateShipmentActions.SelectMode(1);
			PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.mode);
			String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s", "");
			System.out.println(sender);
			String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
			System.out.println(senderLocation);
			String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
			System.out.println(receiver);

			String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
			System.out.println(receiverLocation);

			CreateShipmentActions.ClickReviewCreateShipment();
			PageBase.MaximumWaitForElementEnabled();
			ShipmentReviewActions.VerifyShipmentOverview(shipment.get("TollCarrier"), shipment.get("AccountNumber"),
					sender, senderLocation, receiver, receiverLocation, shipment.get("ShipmentRef1"),
					shipment.get("ShipmentRef2"), shipment.get("DropOffDepot"), shipment.get("Service"),
					shipment.get("Whopays"), shipment.get("CollectionDepot"), shipment.get("Mode"));
		}
	}

	@Then("^User clicks on 'Create Shipment' and User navigates to Shipment Review page and see Toll Tasmania Overview details as below\\.$")
	public void user_clicks_on_Create_Shipment_and_User_navigates_to_Shipment_Review_page_and_see_Toll_Tasmania_Overview_details_as_below(DataTable shipmentTestData) throws Throwable {
	   
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			PageBase.MaximumWaitForElementEnabled();
			//String mode = CreateShipmentActions.SelectMode(1);
			//PageBase.MoveToElement(CreateShipmentActions.accountNumber, CreateShipmentActions.mode);
			String sender = CreateShipmentActions.GetSenderCompanyName().toString().replaceAll("\\s", "");
			System.out.println(sender);
			String senderLocation = CreateShipmentActions.GetSenderLocation().toString();
			System.out.println(senderLocation);
			String receiver = CreateShipmentActions.GetRecieverCompanyName().toString();
			System.out.println(receiver);

			String receiverLocation = CreateShipmentActions.GetReceiverLocation().toString();
			System.out.println(receiverLocation);

			CreateShipmentActions.ClickReviewCreateShipment();
			PageBase.MaximumWaitForElementEnabled();
			ShipmentReviewActions.VerifyShipmentOverviewTollTasmania(shipment.get("TollCarrier"), shipment.get("AccountNumber"),
					sender, senderLocation, receiver, receiverLocation, shipment.get("ShipmentRef1"),
					shipment.get("ShipmentRef2"), shipment.get("Service"),
					shipment.get("Whopays"), shipment.get("CollectionDepot"), shipment.get("Mode"));
		}
	}

	@Then("^User can see pallet information as below in Shipment Review page$")
	public void user_can_see_pallet_information_as_below_in_Shipment_Review_page(DataTable shipmentTestData)
			throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

		
			ShipmentReviewActions.VerifyPalletTransactionsInformations(shipment.get("ChepCustomerOwn"),
					shipment.get("ChepExchange"), shipment.get("ChepTransfer"), shipment.get("ChepDocketNo"),
					shipment.get("LoscamCustomerOwn"), shipment.get("LoscamExchange"), shipment.get("LoscamTransfer"),
					shipment.get("LoscamDocketNo"), shipment.get("OtherCustomerOwn"), shipment.get("ChepOtherExchange"),
					shipment.get("ChepOtherTransfer"), shipment.get("ChepOtherDocketNo"),
					shipment.get("LoscamOtherExchange"), shipment.get("LoscamOtherTransfer"),
					shipment.get("LoscamOtherDocketNo"));
		}

	}

	@Then("^User can see additional information as below in Shipment Review page$")
	public void user_can_see_additional_information_as_below_in_Shipment_Review_page(DataTable shipmentTestData)
			throws Throwable {
					
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

		
			ShipmentReviewActions.VerifyAdditionalInformationForDangerousGoods(shipment.get("SpecialInstructions"),
					shipment.get("PalletInfo"), shipment.get("PurchaseOrders"));

		}
	}

	@Then("^User can see Loscam pallet information as below in Shipment Review page$")
	public void user_can_see_Loscam_pallet_information_as_below_in_Shipment_Review_page(DataTable arg1)
			throws Throwable {

	}

	@Then("^User can see Other pallet information as below in Shipment Review page$")
	public void user_can_see_Other_pallet_information_as_below_in_Shipment_Review_page(DataTable arg1)
			throws Throwable {

	}

	@Then("^User be able to see Chep other pallet information as below in Shipment Review page$")
	public void user_be_able_to_see_Chep_other_pallet_information_as_below_in_Shipment_Review_page(DataTable arg1)
			throws Throwable {

	}

	@Then("^User can see Loscam other information as below$")
	public void user_can_see_Loscam_other_information_as_below(DataTable arg1) throws Throwable {

	}

	@Then("^User be able to see line item headings as below$")
	public void user_be_able_to_see_line_item_headings_as_below(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			String numberOfItems = shipment.get("ItemsHeading") + " " + shipment.get("NumberOfItems");
			ShipmentReviewActions.VerifyLineItem1Headings(shipment.get("LineItemName1Heading"),
					shipment.get("ItemTemplateName"), numberOfItems, shipment.get("ItemDescriptionHeading"),
					shipment.get("ItemsHeading"), shipment.get("BillingTypeHeading"), shipment.get("DimensionsHeading"),
					shipment.get("TotalVolumeHeading"), shipment.get("WeightHeading"),
					shipment.get("Reference1Heading"), shipment.get("Reference2Heading"),
					shipment.get("ShipmentContainDangerousGoodsHeading"));

		}

	}

	@Then("^User can see Line Item(\\d+) details as below$")
	public void user_can_see_Line_Item_details_as_below(int arg1, DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			
			String dimensions = shipment.get("Length") + "cm x " + shipment.get("Width") + "cm x "
					+ shipment.get("Height") + "cm";
			String weight = shipment.get("TotalWeight") + "kg";
			ShipmentReviewActions.VerifyLineItem1Values(shipment.get("Item description"), shipment.get("NumberOfItems"),
					shipment.get("Billing Type"), dimensions, shipment.get("TotalCubicVolume"), weight,
					shipment.get("Reference1"), shipment.get("Reference2"),
					shipment.get("ShipmentContainDangerousGoods"));

		}

	}
	
	@Then("^User can see dangerous good details in shipment review page as below$")
	public void user_can_see_dangerous_good_details_in_shipment_review_page_as_below(DataTable shipmentTestData) throws Throwable {
	  
	for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

		//PageBase.Scrollbar(500, 1000);

		ShipmentReviewActions.VerifyDangerousGoodsDetails(shipment.get("DangerousGoodsDetailsHeading"), shipment.get("UnNumber"),
				shipment.get("Class/Div"), shipment.get("PackingGroup"), shipment.get("SubRisk"), shipment.get("Proper Shipping Name"),
				shipment.get("PackageDescription"), shipment.get("DGPackageType"),
				shipment.get("DGAggregateQty"), shipment.get("Technical Name"));
		
		}
	}

@Then("^User be able to see second line item headings as below$")
public void user_be_able_to_see_second_line_item_headings_as_below(DataTable shipmentTestData) throws Throwable {
    
	for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

		PageBase.Scrollbar(500, 1000);
				
		String numberOfItems = shipment.get("ItemsHeading") + " " + shipment.get("NumberOfItems");
		ShipmentReviewActions.VerifyLineItem2Headings(shipment.get("LineItemName2Heading"),
				shipment.get("ItemTemplateName"), numberOfItems, shipment.get("ItemDescriptionHeading"),
				shipment.get("ItemsHeading"), shipment.get("BillingTypeHeading"), shipment.get("DimensionsHeading"),
				shipment.get("TotalVolumeHeading"), shipment.get("WeightHeading"),
				shipment.get("Reference1Heading"), shipment.get("Reference2Heading"),
				shipment.get("ShipmentContainDangerousGoodsHeading"));
				
		}
	
}

	@Then("^User can see second Line Item details as below$")
	public void user_can_see_second_Line_Item_details_as_below(DataTable shipmentTestData) throws Throwable {
	 
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {


			String dimensions2 = shipment.get("Length") + "cm x " + shipment.get("Width") + "cm x " + shipment.get("Height") + "cm";
			String weight2 = shipment.get("TotalWeight") + "kg";


			ShipmentReviewActions.VerifyLineItem2Values(shipment.get("Item description"), shipment.get("NumberOfItems"),
					shipment.get("Billing Type"), dimensions2, shipment.get("TotalCubicVolume"), weight2,
					shipment.get("SenderReference"), shipment.get("ReceiverReference"),
					shipment.get("ShipmentContainDangerousGoods"));
			
		}
	}

	
	@When("^User clicks on 'Add To Manifest Manually'$")
	public void user_clicks_on_Add_To_Manifest_Manually(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			String RandomManifestName = ManifestActions.RandomManifestName(shipment.get("ManifestName"));
			System.out.println("RandomManifestName=  " + RandomManifestName);
			ManifestActions.AcceptAddToManifestToForAnExistingManifestSubmittingCreateshipment(RandomManifestName);
			// ManifestActions.ClickAddToManifestManually();
			String NewManifestName = ManifestActions.RandomManifestName(shipment.get("ManifestName"));
			System.out.println(" NewManifestName=  " + NewManifestName);

		}

	}

	@Then("^User can add shipment to Manifest successfully\\.$")
	public void user_can_add_shipment_to_Manifest_successfully()
		{
			ManifestActions.ClickAddToManifestManually();
            ManifestActions.ClickAddManifest();
		}

	@When("^User clicks on Print$")
	public void user_clicks_on_Print() throws Throwable {

	}

	@Then("^User can print manifest successfully\\.$")
	public void user_can_print_manifest_successfully() throws Throwable {
		ManifestActions.submitandPrintManifest();
	}

	@When("^User selects Dangerous Goods as No$")
	public void user_selects_Dangerous_Goods_as_No() throws Throwable {
		BookAPickupActions.SelectDangerousGoodsNoQME();
	}

}
