package api;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.remote.http.JsonHttpResponseCodec;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.*;


public class APITest {

//@BeforeMethod
//public void setup()
//{
//	proxy("10.68.3.12", 8080);
//}


 @Test
 public void verifyUserDetails()  throws JSONException,InterruptedException 
 {
	 
	 //given().when().get("https://www-ppd.mytoll.com").then().statusCode(200);
	Response response = given()
     .contentType(ContentType.JSON)
     .when()
     .get(" https://au-ppd-ecs-api-elb.internal.mytoll.com/core/ups-util/v1/profile/users/LOGIN_ID?ID=auto_bvt_ppd@mailinator.com");
	 
	 String result = response.asString();
	 System.out.println(result);
	 

		JSONObject jsonObj = new JSONObject(response.body().asString());
		
		String match = jsonObj.getJSONObject("Details").getString("Gender");
		String match2 = jsonObj.getString("UserID");
		System.out.println(match2 +" " + match);
		
		Assert.assertEquals(match, "M");
		
		
		
		

	}
	

 }
