package manifestStepDefinitions;

import java.util.Map;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;
import rateEnquiryActions.RateEnquiryActions;

public class manifestStepDefinitions {
	
		
	@Given("^User is Registered in MyToll and is on Shipment Page$")
	public void user_is_Registered_in_MyToll_and_is_on_CreateShipment_page() throws Throwable {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		CreateShipmentActions.ClickShipment();
	}

	@When("^User Completes Module 1 in the Create Shipment Page$")
	public void userCompletesModule1ShipmentPage(DataTable shipmentTestData) throws Throwable {
		
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class,String.class))
			   {
				   
				BookAPickupActions.EnterTollCarrier(shipment.get("TollCarrier"));
				CreateShipmentActions.EnterService(shipment.get("Service"));
				CreateShipmentActions.SelectWhoPays(1);
				BookAPickupActions.SelectAccountNumber1();
				CreateShipmentActions.SelectSender(1);
				CreateShipmentActions.SelectReceiver(1);
			   }
	}
	


	

}
