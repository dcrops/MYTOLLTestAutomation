package apiTestData;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class apiBody {

	public static String RateEnquiryBody = "{\r\n\r\n\t\r\n\t\t\"EnquiryType\": \"RE\",\r\n\t\t\"ShipmentDetail\": {\r\n\t\t\t\"FromShipment\": \"false\"\r\n\t\t},\r\n\t\t\"Requestor\": {\r\n\t\t\t\"Name\": \"Automation Tester\",\r\n\t\t\t\"Phone\": \"61-424579833\",\r\n\t\t\t\"Email\": \"auto_bvt_ppd@mailinator.com\"\r\n\t\t},\r\n\t\t\"TollCarrier\": {\r\n\t\t\t\"TollCarrierCode\": \"IPEC\",\r\n\t\t\t\"TollCarrierName\": \"Toll IPEC\"\r\n\t\t},\r\n\t\t\"AccountCode\": \"2230899\",\r\n\t\t\"CustomerCode\": 0,\r\n\t\t\"TESRequired\": false,\r\n\t\t\"TESAmount\": null,\r\n\t\t\"DispatchDate\": \"2018-07-04\",\r\n\t\t\"SubAccountId\": \"\",\r\n\t\t\"EnquiryOriginAddress\": {\r\n\t\t\t\"AddressId\": 6403599,\r\n\t\t\t\"AddressLine1\": \"10 Line road\",\r\n\t\t\t\"AddressLine2\": \"\",\r\n\t\t\t\"Suburb\": \"MELBOURNE\",\r\n\t\t\t\"Postcode\": \"3000\",\r\n\t\t\t\"State\": \"VIC\",\r\n\t\t\t\"Country\": \"AU\",\r\n\t\t\t\"AddressType\": \"S\",\r\n\t\t\t\"Name\": \"Testundefined\",\r\n\t\t\t\"Phone\": \"61-452452765\",\r\n\t\t\t\"Email\": \"test@tes.com\",\r\n\t\t\t\"CompanyName\": \"AAElect\"\r\n\t\t},\r\n\t\t\"EnquiryDestinationAddress\": {\r\n\t\t\t\"AddressId\": 6403538,\r\n\t\t\t\"AddressLine1\": \"1 Roaod\",\r\n\t\t\t\"AddressLine2\": \"\",\r\n\t\t\t\"Suburb\": \"SYDNEY\",\r\n\t\t\t\"Postcode\": \"2000\",\r\n\t\t\t\"State\": \"NSW\",\r\n\t\t\t\"Country\": \"AU\",\r\n\t\t\t\"AddressType\": \"R\",\r\n\t\t\t\"Name\": \"AAAAundefined\",\r\n\t\t\t\"Phone\": \"61-452452765\",\r\n\t\t\t\"Email\": \"Test@Tes.com\",\r\n\t\t\t\"CompanyName\": \"AAAA\"\r\n\t\t},\r\n\t\t\"ServiceCode\": \"X\",\r\n\t\t\"ServiceName\": \"Road Express\",\r\n\t\t\"TransportMode\": \"\",\r\n\t\t\"Items\": [{\r\n\t\t\t\"FIDTTemplateId\": \"456\",\r\n\t\t\t\"ItemDescription\": \"Test\",\r\n\t\t\t\"DetailedDescription\": \"\",\r\n\t\t\t\"CommodityDescription\": \"ALL FREIGHT\",\r\n\t\t\t\"ItemCount\": \"10\",\r\n\t\t\t\"TotalWeight\": \"10\",\r\n\t\t\t\"TotalWeightUom\": \"kg\",\r\n\t\t\t\"CommodityCode\": \"Z\",\r\n\t\t\t\"Pallet\": \"\",\r\n\t\t\t\"MiscUnitCount\": \"\",\r\n\t\t\t\"Dimensions\": {\r\n\t\t\t\t\"Length\": \"10\",\r\n\t\t\t\t\"Width\": \"10\",\r\n\t\t\t\t\"Height\": \"10\",\r\n\t\t\t\t\"LWHUom\": \"cm3\",\r\n\t\t\t\t\"TotalCubicVolume\": \"0.010\",\r\n\t\t\t\t\"TotalVolumeUom\": \"m3\"\r\n\t\t\t}\r\n\t\t}],\r\n\t\t\"EnquiryDate\": \"2018-07-04\"\r\n\t\r\n}";
	
	
	
	public static String rateEnquiry(String CarrieName, String lenght) throws JSONException {
	JSONObject jsonObj = new JSONObject(RateEnquiryBody);
	jsonObj.getJSONObject("TollCarrier").put("TollCarrierCode", CarrieName);
	
	//Array
	JSONArray jarray = jsonObj.getJSONArray("Items");
	jarray.getJSONObject(0).getJSONObject("Dimensions").put("Length", lenght);

	String jsonString = jsonObj.toString();
	//System.out.println(jsonString);
	return jsonString;
	}

	
	
	
	
}
