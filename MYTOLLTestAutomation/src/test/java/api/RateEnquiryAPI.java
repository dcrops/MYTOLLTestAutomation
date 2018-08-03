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

import apiTestData.apiBody;

import static com.jayway.restassured.RestAssured.*;



public class RateEnquiryAPI {

	@BeforeMethod
public void setup()
{
	proxy("10.68.3.12", 8080);
}


 @Test
 public void rateEnquiry()  throws JSONException,InterruptedException {
	 
	 	//Body
	 	//String Body = "{\r\n\r\n\t\r\n\t\t\"EnquiryType\": \"RE\",\r\n\t\t\"ShipmentDetail\": {\r\n\t\t\t\"FromShipment\": \"false\"\r\n\t\t},\r\n\t\t\"Requestor\": {\r\n\t\t\t\"Name\": \"Automation Tester\",\r\n\t\t\t\"Phone\": \"61-424579833\",\r\n\t\t\t\"Email\": \"auto_bvt_ppd@mailinator.com\"\r\n\t\t},\r\n\t\t\"TollCarrier\": {\r\n\t\t\t\"TollCarrierCode\": \"IPEC\",\r\n\t\t\t\"TollCarrierName\": \"Toll IPEC\"\r\n\t\t},\r\n\t\t\"AccountCode\": \"2230899\",\r\n\t\t\"CustomerCode\": 0,\r\n\t\t\"TESRequired\": false,\r\n\t\t\"TESAmount\": null,\r\n\t\t\"DispatchDate\": \"2018-07-04\",\r\n\t\t\"SubAccountId\": \"\",\r\n\t\t\"EnquiryOriginAddress\": {\r\n\t\t\t\"AddressId\": 6403599,\r\n\t\t\t\"AddressLine1\": \"10 Line road\",\r\n\t\t\t\"AddressLine2\": \"\",\r\n\t\t\t\"Suburb\": \"MELBOURNE\",\r\n\t\t\t\"Postcode\": \"3000\",\r\n\t\t\t\"State\": \"VIC\",\r\n\t\t\t\"Country\": \"AU\",\r\n\t\t\t\"AddressType\": \"S\",\r\n\t\t\t\"Name\": \"Testundefined\",\r\n\t\t\t\"Phone\": \"61-452452765\",\r\n\t\t\t\"Email\": \"test@tes.com\",\r\n\t\t\t\"CompanyName\": \"AAElect\"\r\n\t\t},\r\n\t\t\"EnquiryDestinationAddress\": {\r\n\t\t\t\"AddressId\": 6403538,\r\n\t\t\t\"AddressLine1\": \"1 Roaod\",\r\n\t\t\t\"AddressLine2\": \"\",\r\n\t\t\t\"Suburb\": \"SYDNEY\",\r\n\t\t\t\"Postcode\": \"2000\",\r\n\t\t\t\"State\": \"NSW\",\r\n\t\t\t\"Country\": \"AU\",\r\n\t\t\t\"AddressType\": \"R\",\r\n\t\t\t\"Name\": \"AAAAundefined\",\r\n\t\t\t\"Phone\": \"61-452452765\",\r\n\t\t\t\"Email\": \"Test@Tes.com\",\r\n\t\t\t\"CompanyName\": \"AAAA\"\r\n\t\t},\r\n\t\t\"ServiceCode\": \"X\",\r\n\t\t\"ServiceName\": \"Road Express\",\r\n\t\t\"TransportMode\": \"\",\r\n\t\t\"Items\": [{\r\n\t\t\t\"FIDTTemplateId\": \"456\",\r\n\t\t\t\"ItemDescription\": \"Test\",\r\n\t\t\t\"DetailedDescription\": \"\",\r\n\t\t\t\"CommodityDescription\": \"ALL FREIGHT\",\r\n\t\t\t\"ItemCount\": \"10\",\r\n\t\t\t\"TotalWeight\": \"10\",\r\n\t\t\t\"TotalWeightUom\": \"kg\",\r\n\t\t\t\"CommodityCode\": \"Z\",\r\n\t\t\t\"Pallet\": \"\",\r\n\t\t\t\"MiscUnitCount\": \"\",\r\n\t\t\t\"Dimensions\": {\r\n\t\t\t\t\"Length\": \"10\",\r\n\t\t\t\t\"Width\": \"10\",\r\n\t\t\t\t\"Height\": \"10\",\r\n\t\t\t\t\"LWHUom\": \"cm3\",\r\n\t\t\t\t\"TotalCubicVolume\": \"0.010\",\r\n\t\t\t\t\"TotalVolumeUom\": \"m3\"\r\n\t\t\t}\r\n\t\t}],\r\n\t\t\"EnquiryDate\": \"2018-07-04\"\r\n\t\r\n}";
	 	String Body = apiBody.rateEnquiry("IPEC" , "10");
	 	//Post Msg
		RestAssured.baseURI ="https://au-ppd-ecs-api-elb.internal.mytoll.com";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("x-mytoll-identity", "3103d4bb-5acd-4130-b1da-6617e9da2d33");
		request.body(Body);
		Response response = request.post("/product/enquiry/v1/ratentime");

		//Assertion
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		String result = response.asString();
		System.out.println(result);
		 
		 //Retreive EnquiryID 
		 JSONObject jsonObj = new JSONObject(response.body().asString());
		 int enquiryId = jsonObj.getInt("EnquiryId");
		 System.out.println(enquiryId);
		 
		//Get Enquiry ID
		RequestSpecification Response = RestAssured.given();
		Response.header("Content-Type", "application/json");
		Response.header("x-mytoll-identity", "3103d4bb-5acd-4130-b1da-6617e9da2d33");
		Response GetEnquiryID = Response.get("/product/enquiry/v1/ratentime/"+enquiryId+"/shipment");
		String getEnquiryIDResponse = GetEnquiryID.asString();
		System.out.println(getEnquiryIDResponse);
		
		int statusCodeID = GetEnquiryID.getStatusCode();
		Assert.assertEquals(statusCodeID, 200);

		
		
			
		 
	}

	}
	

 
