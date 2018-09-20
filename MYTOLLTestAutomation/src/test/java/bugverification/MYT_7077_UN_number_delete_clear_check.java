package bugVerification.stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import Global.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickup.BookAPickupActions;
import createShipment.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYT_7077_UN_number_delete_clear_check
{
	/*@Given("^User is Registered in MyToll and is on Shipment page$")
	public void user_is_Registered_in_MyToll_and_is_on_Shipment_page() throws Throwable {
	    

		BaseWebdriver.setUp();
		PageBase.MaximumWaitForElementEnabled();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	     
	}*/

	/*@When("^user selects Toll Carrier as below$")
	public void user_selects_Toll_Carrier_as_below(DataTable shipmentTestData) throws Throwable {
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			
			BookAPickupActions.EnterTollCarrier(shipment.get("TollCarrier"));
			}
	}*/
//
//	@When("^User continue enters shipment overview details as below to create shipment$")
//	public void user_continue_enters_shipment_overview_details_as_below_to_create_shipment(DataTable shipmentTestData) throws Throwable {
//
//		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
//			 CreateShipmentActions.EnterService(shipment.get("Service"));
//			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
//			String s = shipment.get("Whopays");
//			System.out.println("S  " + s);
//			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
//			String s2 = shipment.get("Mode");
//			System.out.println("S2  " + s2);
//			CreateShipmentActions.SelectMode(Integer.parseInt(s2));
//			CreateShipmentActions.EnterSender(shipment.get("Sender"));
//			CreateShipmentActions.EnterReceiver(shipment.get("Receiver"));
//			CreateShipmentActions.SelectShipmentConsolidationContinue();
//			CreateShipmentActions.EnterDGContactDetails(shipment.get("DGContactName"), shipment.get("DGContactNumber"));
//			/*PageBase.MoveToElement(CreateShipmentActions.notifySenderCheckBox,
//					CreateShipmentActions.notifyReceiverCheckBox);*/
//			// CreateShipmentActions.EnterSenderEmail(SenderEmail);
//			CreateShipmentActions.EnterReceiverEmail(shipment.get("ReceiverEmail"));
//			CreateShipmentActions.EnterDropOffDepot(shipment.get("DropOffDepot"));
//			CreateShipmentActions.EnterCollectionDepot(shipment.get("CollectionDepot"));
//
//			PageBase.MoveToElement(CreateShipmentActions.shipmentReference1, CreateShipmentActions.shipmentReference2);
//			CreateShipmentActions.EnterShipmentReferences(shipment.get("ShipmentRef1"), shipment.get("ShipmentRef2"));
//			PageBase.MaximumWaitForElementEnabled();
//		}
//
//	}

/*	@When("^User enters following input data for the line item$")
	public void user_enters_following_input_data_for_the_line_item(DataTable shipmentTestData) throws Throwable {
	    

	@When("^User enters following dangerous goods detail$")
	public void user_enters_following_dangerous_goods_detail(DataTable shipmentTestData) throws Throwable {

			CreateShipmentActions.EnterSenderReference(shipment.get("SenderReference"),
					shipment.get("ReceiverReference"));

		}
	     
	}
*/


	@When("^User enters following dangerous goods detail$")
	public void user_enters_following_dangerous_goods_detail(DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {

			CreateShipmentActions.EnterDangerousGoodsDetails(1, shipment.get("UnNumber"),
					shipment.get("PackageDescription"), shipment.get("DGPackageType"), shipment.get("DGAggregateQty"));
			//BookAPickupActions.SelectPackgingGroupString(shipment.get("PackingGroup"));
			//BookAPickupActions.EnterTechnicalName(shipment.get("Technical Name"));
		}
	   
	}

	@Then("^User be able to see following field are autopopulated\\.$")
	public void user_be_able_to_see_following_field_are_autopopulated(DataTable shipmentTestData) throws Throwable {
	    
	  
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

		//	assertEquals(classDivision, shipment.get("Class/Div"));
		//	assertEquals(subRisk, shipment.get("SubRisk"));
		//	assertEquals(packingGroup, shipment.get("PackingGroup"));
		//	assertEquals(ProperShippingName, shipment.get("Proper Shoping Name"));

		}
	}
	
	@When("^User clears the UnNumber$")
	public void user_clears_the_unnumber() throws Throwable {
		BaseWebdriver.driver.findElement(CreateShipmentActions.UNNumberTextField).click();
		BaseWebdriver.driver.findElement(CreateShipmentActions.UNNumberTextField).clear();
		BaseWebdriver.driver.findElement(CreateShipmentActions.UNNumberTextField).sendKeys(" ");
		BaseWebdriver.driver.findElement(CreateShipmentActions.UNNumberTextField).clear();
		PageBase.MaximumWaitForElementEnabled();
		
		
		//PageBase.FindElement(CreateShipmentActions.dgPkgQty).click();
		//PageBase.MaximumWaitForElementEnabled();		
		//PageBase.verifyTextExist(CreateShipmentActions.dgDetailsClass, "");
		//PageBase.verifyTextExist(CreateShipmentActions.dgDetailsProperShoppingName, "");
	}

}