package bugverification;

import java.util.Map;

import org.openqa.selenium.By;

import global.PageBase;
import bookapickup.BookAPickupActions;
import createShipment.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class MYT_8887_Shipment_International_Address_in_domestic
{
	@When("^User continue enters shipment overview details as below to create shipment$")
	public void user_continue_enters_shipment_overview_details_as_below_to_create_shipment(DataTable shipmentTestData)
			throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			 CreateShipmentActions.EnterService(shipment.get("Service"));
			BookAPickupActions.EnterAccountNumber(shipment.get("AccountNumber"));
			String s = shipment.get("Whopays");
			//System.out.println("S  " + s);
			CreateShipmentActions.SelectWhoPays(Integer.parseInt(s));
			String s2 = shipment.get("Mode");
			//System.out.println("S2  " + s2);
			CreateShipmentActions.SelectMode(Integer.parseInt(s2));
			
			//try to enter an international receiver address for Domestic service
			CreateShipmentActions.EnterSender(shipment.get("Sender"));
			PageBase.sendText(By.xpath("//*[@id=\"receiver-label\"]"), 2, shipment.get("Receiver"));
			
			PageBase.isElementNotPresent(By.xpath("//*[@id=\"receiver-selector\"]/div[2]/ul/li"), 50, "");
			
		}
	}
}
