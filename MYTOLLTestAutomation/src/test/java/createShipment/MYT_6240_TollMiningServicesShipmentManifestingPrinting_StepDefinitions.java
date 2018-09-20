package createshipment;

import java.util.Map;

import createshipment.ShipmentReviewActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class MYT_6240_TollMiningServicesShipmentManifestingPrinting_StepDefinitions {

	@Then("^User can see additional information of Toll Mining Services as below in Shipment Review page$")
	public void user_can_see_additional_information_of_Toll_Mining_Services_as_below_in_Shipment_Review_page(
			DataTable shipmentTestData) throws Throwable {

		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
			ShipmentReviewActions.VerifyAdditionalInformationForTollMining(shipment.get("SpecialInstructions"),
					shipment.get("PurchaseOrders"));
		}
	}

}
