package api;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.remote.http.JsonHttpResponseCodec;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Request;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import static com.jayway.restassured.RestAssured.*;



public class CreateShipmentAPI {

	@BeforeMethod
public void setup()
{
	proxy("10.68.3.12", 8080);
}


 @Test
 public void createShipment()  throws JSONException,InterruptedException {
	 
	 	//Body
	 	String Body = "{\r\n\t\t\"shipmentLines\": [{\r\n\t\t\t\"lineItemDescription\": \"TEST Intermodal3823\",\r\n\t\t\t\"seqNo\": 1,\r\n\t\t\t\"perPallet\": false,\r\n\t\t\t\"perPalletQty\": 0,\r\n\t\t\t\"senderReference\": \"\",\r\n\t\t\t\"receiverReference\": \"\",\r\n\t\t\t\"createdByTemplate\": true,\r\n\t\t\t\"status\": \"O\",\r\n\t\t\t\"templateId\": \"\",\r\n\t\t\t\"itemCount\": 15,\r\n\t\t\t\"billingtypeDescription\": \"\",\r\n\t\t\t\"billingCode\": \"0\",\r\n\t\t\t\"containsDangerousGoods\": false,\r\n\t\t\t\"itemType\": \"Items\",\r\n\t\t\t\"miscUnitsCount\": 0,\r\n\t\t\t\"createdBy\": \"\",\r\n\t\t\t\"lastModifiedBy\": \"\",\r\n\t\t\t\"dimensions\": {\r\n\t\t\t\t\"length\": \"100\",\r\n\t\t\t\t\"width\": \"200\",\r\n\t\t\t\t\"height\": \"300\",\r\n\t\t\t\t\"lwhUom\": \"cm\",\r\n\t\t\t\t\"totalVolume\": \"90.000\",\r\n\t\t\t\t\"totalVolumeUom\": \"M3\",\r\n\t\t\t\t\"totalWeight\": \"900\",\r\n\t\t\t\t\"totalWeightUom\": \"kg\",\r\n\t\t\t\t\"totalCubicVolume\": 90,\r\n\t\t\t\t\"isVolumeOnly\": false\r\n\t\t\t},\r\n\t\t\t\"shipmentLinesDangerousGoods\": []\r\n\t\t}],\r\n\t\t\"references\": [],\r\n\t\t\"palletTransactions\": null,\r\n\t\t\"totalVolume\": 90,\r\n\t\t\"totalQuantity\": 15,\r\n\t\t\"totalWeight\": 900,\r\n\t\t\"tollCarrierCode\": \"TNQX\",\r\n\t\t\"tollCarrierName\": \"Intermodal & Specialised\",\r\n\t\t\"tempRangeFrom\": \"\",\r\n\t\t\"tempRangeTo\": \"\",\r\n\t\t\"temperatureUom\": \"DEGREE\",\r\n\t\t\"chargeTo\": \"S\",\r\n\t\t\"dispatchDate\": \"2018-07-04\",\r\n\t\t\"serviceCode\": \"G\",\r\n\t\t\"serviceName\": \"General\",\r\n\t\t\"mode\": \"ROAD\",\r\n\t\t\"accountCode\": \"614060\",\r\n\t\t\"senderAddress\": {\r\n\t\t\t\"addressId\": \"6403599\",\r\n\t\t\t\"companyName\": \"AAElect\",\r\n\t\t\t\"contactName\": \"Test\",\r\n\t\t\t\"workPhoneNumber\": \"61-452452765\",\r\n\t\t\t\"mobileNumber\": \"61-452452765\",\r\n\t\t\t\"addressLine1\": \"10 Line road\",\r\n\t\t\t\"addressLine2\": \"\",\r\n\t\t\t\"postCode\": \"3000\",\r\n\t\t\t\"suburb\": \"MELBOURNE\",\r\n\t\t\t\"state\": \"VIC\",\r\n\t\t\t\"city\": \"\",\r\n\t\t\t\"countryCode\": \"AU\",\r\n\t\t\t\"accountCode\": \"\",\r\n\t\t\t\"addressType\": \"\",\r\n\t\t\t\"dgContactName\": \"Test\",\r\n\t\t\t\"dgContactNumber\": \"452452765\",\r\n\t\t\t\"email\": \"\",\r\n\t\t\t\"addressNote\": \"\",\r\n\t\t\t\"latitude\": \"\",\r\n\t\t\t\"longitude\": \"\",\r\n\t\t\t\"dpId\": \"\",\r\n\t\t\t\"gnafPid\": \"\",\r\n\t\t\t\"avsConfidenceLevel\": \"\"\r\n\t\t},\r\n\t\t\"receiverAddress\": {\r\n\t\t\t\"addressId\": \"6403538\",\r\n\t\t\t\"companyName\": \"AAAA\",\r\n\t\t\t\"contactName\": \"AAAA\",\r\n\t\t\t\"workPhoneNumber\": \"61-452452765\",\r\n\t\t\t\"mobileNumber\": \"61-452452765\",\r\n\t\t\t\"addressLine1\": \"1 Roaod\",\r\n\t\t\t\"addressLine2\": \"\",\r\n\t\t\t\"postCode\": \"2000\",\r\n\t\t\t\"suburb\": \"SYDNEY\",\r\n\t\t\t\"state\": \"NSW\",\r\n\t\t\t\"city\": \"\",\r\n\t\t\t\"countryCode\": \"AU\",\r\n\t\t\t\"accountCode\": \"\",\r\n\t\t\t\"addressType\": \"\",\r\n\t\t\t\"dgContactName\": \"\",\r\n\t\t\t\"dgContactNumber\": \"\",\r\n\t\t\t\"email\": \"\",\r\n\t\t\t\"addressNote\": \"\",\r\n\t\t\t\"latitude\": \"\",\r\n\t\t\t\"longitude\": \"\",\r\n\t\t\t\"dpId\": \"\",\r\n\t\t\t\"gnafPid\": \"\",\r\n\t\t\t\"avsConfidenceLevel\": \"\"\r\n\t\t},\r\n\t\t\"isPalletsTransactions\": false,\r\n\t\t\"typeOfExport\": \"\",\r\n\t\t\"declaredValueCurrencyCode\": \"\",\r\n\t\t\"declaredValue\": \"\",\r\n\t\t\"harmonisedCommodityCode\": \"\",\r\n\t\t\"taxPayer\": \"\",\r\n\t\t\"extraServiceValue\": \"\",\r\n\t\t\"extraServiceCurrency\": \"\",\r\n\t\t\"specialInstructions\": \"\",\r\n\t\t\"smsNotify\": false,\r\n\t\t\"smsNotifyMobile\": \"\",\r\n\t\t\"extraServiceRequired\": false,\r\n\t\t\"containsFood\": false,\r\n\t\t\"authorityToLeave\": false,\r\n\t\t\"securityCheckRequired\": false,\r\n\t\t\"alternateDelivery\": false,\r\n\t\t\"status\": \"O\"\r\n\t}";
		
		//Post Msg
		RestAssured.baseURI ="https://au-ppd-ecs-api-elb.internal.mytoll.com";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("x-mytoll-identity", "3103d4bb-5acd-4130-b1da-6617e9da2d33");
		//request.body("{\r\n\t\t\"shipmentLines\": [{\r\n\t\t\t\"lineItemDescription\": \"TEST Intermodal3823\",\r\n\t\t\t\"seqNo\": 1,\r\n\t\t\t\"perPallet\": false,\r\n\t\t\t\"perPalletQty\": 0,\r\n\t\t\t\"senderReference\": \"\",\r\n\t\t\t\"receiverReference\": \"\",\r\n\t\t\t\"createdByTemplate\": true,\r\n\t\t\t\"status\": \"O\",\r\n\t\t\t\"templateId\": \"\",\r\n\t\t\t\"itemCount\": 15,\r\n\t\t\t\"billingtypeDescription\": \"\",\r\n\t\t\t\"billingCode\": \"0\",\r\n\t\t\t\"containsDangerousGoods\": false,\r\n\t\t\t\"itemType\": \"Items\",\r\n\t\t\t\"miscUnitsCount\": 0,\r\n\t\t\t\"createdBy\": \"\",\r\n\t\t\t\"lastModifiedBy\": \"\",\r\n\t\t\t\"dimensions\": {\r\n\t\t\t\t\"length\": \"100\",\r\n\t\t\t\t\"width\": \"200\",\r\n\t\t\t\t\"height\": \"300\",\r\n\t\t\t\t\"lwhUom\": \"cm\",\r\n\t\t\t\t\"totalVolume\": \"90.000\",\r\n\t\t\t\t\"totalVolumeUom\": \"M3\",\r\n\t\t\t\t\"totalWeight\": \"900\",\r\n\t\t\t\t\"totalWeightUom\": \"kg\",\r\n\t\t\t\t\"totalCubicVolume\": 90,\r\n\t\t\t\t\"isVolumeOnly\": false\r\n\t\t\t},\r\n\t\t\t\"shipmentLinesDangerousGoods\": []\r\n\t\t}],\r\n\t\t\"references\": [],\r\n\t\t\"palletTransactions\": null,\r\n\t\t\"totalVolume\": 90,\r\n\t\t\"totalQuantity\": 15,\r\n\t\t\"totalWeight\": 900,\r\n\t\t\"tollCarrierCode\": \"TNQX\",\r\n\t\t\"tollCarrierName\": \"Intermodal & Specialised\",\r\n\t\t\"tempRangeFrom\": \"\",\r\n\t\t\"tempRangeTo\": \"\",\r\n\t\t\"temperatureUom\": \"DEGREE\",\r\n\t\t\"chargeTo\": \"S\",\r\n\t\t\"dispatchDate\": \"2018-07-04\",\r\n\t\t\"serviceCode\": \"G\",\r\n\t\t\"serviceName\": \"General\",\r\n\t\t\"mode\": \"ROAD\",\r\n\t\t\"accountCode\": \"614060\",\r\n\t\t\"senderAddress\": {\r\n\t\t\t\"addressId\": \"6403599\",\r\n\t\t\t\"companyName\": \"AAElect\",\r\n\t\t\t\"contactName\": \"Test\",\r\n\t\t\t\"workPhoneNumber\": \"61-452452765\",\r\n\t\t\t\"mobileNumber\": \"61-452452765\",\r\n\t\t\t\"addressLine1\": \"10 Line road\",\r\n\t\t\t\"addressLine2\": \"\",\r\n\t\t\t\"postCode\": \"3000\",\r\n\t\t\t\"suburb\": \"MELBOURNE\",\r\n\t\t\t\"state\": \"VIC\",\r\n\t\t\t\"city\": \"\",\r\n\t\t\t\"countryCode\": \"AU\",\r\n\t\t\t\"accountCode\": \"\",\r\n\t\t\t\"addressType\": \"\",\r\n\t\t\t\"dgContactName\": \"Test\",\r\n\t\t\t\"dgContactNumber\": \"452452765\",\r\n\t\t\t\"email\": \"\",\r\n\t\t\t\"addressNote\": \"\",\r\n\t\t\t\"latitude\": \"\",\r\n\t\t\t\"longitude\": \"\",\r\n\t\t\t\"dpId\": \"\",\r\n\t\t\t\"gnafPid\": \"\",\r\n\t\t\t\"avsConfidenceLevel\": \"\"\r\n\t\t},\r\n\t\t\"receiverAddress\": {\r\n\t\t\t\"addressId\": \"6403538\",\r\n\t\t\t\"companyName\": \"AAAA\",\r\n\t\t\t\"contactName\": \"AAAA\",\r\n\t\t\t\"workPhoneNumber\": \"61-452452765\",\r\n\t\t\t\"mobileNumber\": \"61-452452765\",\r\n\t\t\t\"addressLine1\": \"1 Roaod\",\r\n\t\t\t\"addressLine2\": \"\",\r\n\t\t\t\"postCode\": \"2000\",\r\n\t\t\t\"suburb\": \"SYDNEY\",\r\n\t\t\t\"state\": \"NSW\",\r\n\t\t\t\"city\": \"\",\r\n\t\t\t\"countryCode\": \"AU\",\r\n\t\t\t\"accountCode\": \"\",\r\n\t\t\t\"addressType\": \"\",\r\n\t\t\t\"dgContactName\": \"\",\r\n\t\t\t\"dgContactNumber\": \"\",\r\n\t\t\t\"email\": \"\",\r\n\t\t\t\"addressNote\": \"\",\r\n\t\t\t\"latitude\": \"\",\r\n\t\t\t\"longitude\": \"\",\r\n\t\t\t\"dpId\": \"\",\r\n\t\t\t\"gnafPid\": \"\",\r\n\t\t\t\"avsConfidenceLevel\": \"\"\r\n\t\t},\r\n\t\t\"isPalletsTransactions\": false,\r\n\t\t\"typeOfExport\": \"\",\r\n\t\t\"declaredValueCurrencyCode\": \"\",\r\n\t\t\"declaredValue\": \"\",\r\n\t\t\"harmonisedCommodityCode\": \"\",\r\n\t\t\"taxPayer\": \"\",\r\n\t\t\"extraServiceValue\": \"\",\r\n\t\t\"extraServiceCurrency\": \"\",\r\n\t\t\"specialInstructions\": \"\",\r\n\t\t\"smsNotify\": false,\r\n\t\t\"smsNotifyMobile\": \"\",\r\n\t\t\"extraServiceRequired\": false,\r\n\t\t\"containsFood\": false,\r\n\t\t\"authorityToLeave\": false,\r\n\t\t\"securityCheckRequired\": false,\r\n\t\t\"alternateDelivery\": false,\r\n\t\t\"status\": \"O\"\r\n\t}");
		request.body(Body);
		Response response = request.post("/dispatch/consign/v1/shipments/");

		//Assertion
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);
		String result = response.asString();
		System.out.println(result);
		 
		 //Retreive ShipmentID 
		 JSONObject jsonObj = new JSONObject(response.body().asString());
		 int shipmentID = jsonObj.getInt("ShipmentId");
		 System.out.println(shipmentID);
		 
		 //Get Shipment ID
		RequestSpecification Response = RestAssured.given();
		Response.header("Content-Type", "application/json");
		Response.header("x-mytoll-identity", "3103d4bb-5acd-4130-b1da-6617e9da2d33");
		Response.param("shipmentId", shipmentID);
		Response.param("carrier", "TNQX");
		Response GetShipmentID = Response.get("/dispatch/consign/v1/shipments/");
		String getShipmentIDResponse = GetShipmentID.asString();
		System.out.println(getShipmentIDResponse);
		
		int statusCodeID = GetShipmentID.getStatusCode();
		Assert.assertEquals(statusCodeID, 200);
		
		JSONObject jsonObjResponse = new JSONObject(GetShipmentID.body().asString());
		int count = jsonObjResponse.getInt("count");
		Assert.assertEquals(count, 1);
		 

		 
			
		 
	}

	}
	

 
