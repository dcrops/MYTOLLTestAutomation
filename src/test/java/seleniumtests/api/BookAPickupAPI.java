package seleniumtests.api;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import static com.jayway.restassured.RestAssured.*;



public class BookAPickupAPI {

	@BeforeMethod
public void setup()
{
	proxy("10.68.3.12", 8080);
}


 @Test
 public void bookAPickup()  throws JSONException,InterruptedException {
	 
	 	//Body
	 	String Body = "{\r\n\t\"PickupSource\": \"WEB\",\r\n\t\"PickupState\": \"S\",\r\n\t\"ManifestId\": 0,\r\n\t\"Shipments\": [],\r\n\t\"PickupTemplateId\": 0,\r\n\t\"Requestor\": {\r\n\t\t\"Name\": \"Automation Tester\",\r\n\t\t\"Phone\": \"61-424579833\",\r\n\t\t\"Email\": \"auto_bvt_ppd@mailinator.com\"\r\n\t},\r\n\t\"TollCarrier\": {\r\n\t\t\"TollCarrierCode\": \"TNQX\",\r\n\t\t\"TollCarrierName\": \"Intermodal & Specialised\"\r\n\t},\r\n\t\"AccountCode\": \"614060\",\r\n\t\"CustomerAccountId\": 0,\r\n\t\"SubAccountId\": \"\",\r\n\t\"PickupAddress\": {\r\n\t\t\"AddressId\": 6404039,\r\n\t\t\"AddressLine1\": \"60 Collins St\",\r\n\t\t\"Suburb\": \"MELBOURNE\",\r\n\t\t\"Postcode\": \"3000\",\r\n\t\t\"State\": \"VIC\",\r\n\t\t\"Country\": \"AU\",\r\n\t\t\"AddressType\": \"G\"\r\n\t},\r\n\t\"IsUserAtSameLocation\": true,\r\n\t\"PickupContact\": {\r\n\t\t\"Name\": \"Automation Tester\",\r\n\t\t\"Phone\": \"61-423452678\",\r\n\t\t\"Email\": \"auto_bvt_ppd@mailinator.com\"\r\n\t},\r\n\t\"CompanyName\": \"Auto\",\r\n\t\"ReturnJob\": true,\r\n\t\"PickupDate\": \"2018-07-23\",\r\n\t\"PickupReadyTime\": \"11:15\",\r\n\t\"SpecialInstructions\": \"\",\r\n\t\"SiteInfo\": {\r\n\t\t\"ClosingTime\": \"18:00\",\r\n\t\t\"OpeningTime\": \"06:00\",\r\n\t\t\"isDefaultOpeningTime\": true\r\n\t},\r\n\t\"isPickupTemplateAllowed\": true,\r\n\t\"Items\": [{\r\n\t\t\"ServiceCode\": \"G\",\r\n\t\t\"ServiceName\": \"General\",\r\n\t\t\"ItemType\": null,\r\n\t\t\"FIDTTemplateName\": \"TEST Intermodal3823\",\r\n\t\t\"isInternational\": false,\r\n\t\t\"ContainsRefigeratedGoods\": false,\r\n\t\t\"DisableDimensions\": false,\r\n\t\t\"itemIndex\": \"\",\r\n\t\t\"hasChargeTo\": true,\r\n\t\t\"IsUserAtSameLocation\": true,\r\n\t\t\"frieghtType\": null,\r\n\t\t\"hideDimension\": false,\r\n\t\t\"requireRefrigeration\": false,\r\n\t\t\"dangerousGoods\": false,\r\n\t\t\"defNumOfLineItems\": 5,\r\n\t\t\"mutiItemSupport\": true,\r\n\t\t\"palletSpaceDefault\": true,\r\n\t\t\"palletSpaceMandatory\": false,\r\n\t\t\"multipleAddress\": false,\r\n\t\t\"quickEntryMode\": true,\r\n\t\t\"FIDTAllowedinPickup\": true,\r\n\t\t\"foodAllowedByCarrier\": true,\r\n\t\t\"modeSelection\": false,\r\n\t\t\"DisableItemVolume\": false,\r\n\t\t\"pickupItemDescLength\": \"80\",\r\n\t\t\"InternationalPickup\": false,\r\n\t\t\"isDefaultForm\": true,\r\n\t\t\"CutOffTime\": \"14:00:00\",\r\n\t\t\"Destination\": {\r\n\t\t\t\"ShortAddress\": \"SYDNEY, 2000\",\r\n\t\t\t\"AddressId\": 2308,\r\n\t\t\t\"Suburb\": \"SYDNEY\",\r\n\t\t\t\"Postcode\": \"2000\",\r\n\t\t\t\"State\": \"NSW\",\r\n\t\t\t\"Country\": \"AU\"\r\n\t\t},\r\n\t\t\"ChargeToParty\": \"S\",\r\n\t\t\"ChargeToPartyText\": \"Sender\",\r\n\t\t\"ShowChargeToInput\": false,\r\n\t\t\"ItemDescription\": \"TEST Intermodal3823\",\r\n\t\t\"FIDTTemplateId\": \"587\",\r\n\t\t\"ItemIndex\": \"\",\r\n\t\t\"ItemCount\": \"15\",\r\n\t\t\"Dimensions\": {\r\n\t\t\t\"Length\": \"100\",\r\n\t\t\t\"TotalCubicVolume\": \"90.000\",\r\n\t\t\t\"Height\": \"300\",\r\n\t\t\t\"Width\": \"200\"\r\n\t\t},\r\n\t\t\"TotalWeight\": \"900\",\r\n\t\t\"ContainsDangerousGoods\": false,\r\n\t\t\"ContainsFood\": false\r\n\t}]\r\n}";
		//Post Msg
		RestAssured.baseURI ="https://au-ppd-ecs-seleniumtests.api-elb.internal.mytoll.com";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("x-mytoll-identity", "3103d4bb-5acd-4130-b1da-6617e9da2d33");
		request.body(Body);
		Response response = request.post("/dispatch/pickup/v1/pickups");

		//Assertion
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		String result = response.asString();
		System.out.println(result);
		 
		 //Retreive PickupID 
		 JSONObject jsonObj = new JSONObject(response.body().asString());
		 int pickupID = jsonObj.getInt("PickupId");
		 System.out.println(pickupID);
		 
		 //Get Pickup ID
		RequestSpecification Response = RestAssured.given();
		Response.header("Content-Type", "application/json");
		Response.header("x-mytoll-identity", "3103d4bb-5acd-4130-b1da-6617e9da2d33");
		Response GetPickupID = Response.get("/dispatch/pickup/v1/pickups/"+pickupID);
		String getPickupIDResponse = GetPickupID.asString();
		System.out.println(getPickupIDResponse);
		
		int statusCodeID = GetPickupID.getStatusCode();
		Assert.assertEquals(statusCodeID, 200);

		 
			
		 
	}

	}
	

 
