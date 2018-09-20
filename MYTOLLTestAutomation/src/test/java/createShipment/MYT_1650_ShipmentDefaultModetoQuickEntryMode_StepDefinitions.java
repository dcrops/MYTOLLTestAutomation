package createShipment;

import java.util.Map;

import bookapickup.BookAPickupActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYT_1650_ShipmentDefaultModetoQuickEntryMode_StepDefinitions {

	
	@When("^User selects switch from 'Default' mode to ' Quick Entry ' mode in shipment$")
	public void user_selects_switch_from_Default_mode_to_Quick_Entry_mode_in_shipment() throws Throwable {
	
		//CreateShipmentActions.ClickQuickEntryMode();
		CreateShipmentActions.setQEMYes();
	}
	
	@When("^User enters following input data for the line item in Quick Entry Mode$")
	public void user_enters_following_input_data_for_the_line_item_in_Quick_Entry_Mode(DataTable shipmentTestData)
			throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			String itemDescription = BookAPickupActions.RandomItemDescription(shipment.get("ItemDescription"));

			BookAPickupActions.EnterItemDesriptionQME(itemDescription);

			BookAPickupActions.EnterNoOfItemsQME(shipment.get("No of Items"));

			CreateShipmentActions.ItemTypeQME(shipment.get("Item Type"));

			BookAPickupActions.EnterLengthWidthHeightQME(shipment.get("Length"), shipment.get("Width"),
					shipment.get("Height"), shipment.get("TotalWeight"));
			
			CreateShipmentActions.EnterSenderRef(shipment.get("SenderReference"));
			CreateShipmentActions.EnterReceiverRef(shipment.get("ReceiverReference"));

		}
	}

	@When("^User selects Dangerous Goods as Yes$")
	public void user_selects_Dangerous_Goods_as_Yes(DataTable arg1) throws Throwable {

		BookAPickupActions.SelectDangerousGoodsYesQME();
	}
	
	@When("^User enter following dangerous goods details in shipment$")
	public void user_enter_following_dangerous_goods_details_in_shipment(DataTable shipmentTestData) throws Throwable {
	
   for (Map<String, String> bookAPickup : shipmentTestData.asMaps(String.class, String.class)) {

		
			
	        CreateShipmentActions.SelectDangerousGoodsDetailsQME(bookAPickup.get("UnNumber"), bookAPickup.get("PackageDescription"),bookAPickup.get("DGPackageType"), bookAPickup.get("DGAggregateQty"));
			String s = bookAPickup.get("PackingGroup");
			System.out.println("s----" + s);
			//BookAPickupActions.SelectPackgingGroupQMEInt(Integer.parseInt(s));
			  CreateShipmentActions.SelectPackgingGroupQME(bookAPickup.get("PackingGroup"));
			  //BookAPickupActions.addDGItemQME();
			  //CreateShipmentActions.SelectPackgingGroupQME(bookapickup.get("PackingGroup"));
			BookAPickupActions.EnterTechnicalNameQME(bookAPickup.get("Technical Name"));
		}
		
	}

	@Then("^User navigates to Shipment Overview page and see all the data entered\\.$")
	public void user_navigates_to_Shipment_Overview_page_and_see_all_the_data_entered() throws Throwable {

	}

}
