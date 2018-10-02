package utils;
import com.csvreader.CsvReader;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import static com.jayway.restassured.RestAssured.proxy;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadCsvFile {
	
	final static Logger logger = Logger.getLogger("");
	
	@BeforeMethod
	public void setup()
	{
		proxy("10.68.3.12", 8080);
		logger.info("=============================================================");
		logger.info("FAILED CUT OFF TIMES");
		logger.info("=============================================================");
	}

	@Test
	public static void CSVReader() throws JSONException, Exception {
        try {

            CsvReader testcases = new CsvReader("src\\test\\Testdata\\cutofftime.csv");

            testcases.readHeaders();
            //get total numbers of header column
           int numberOfHeaders=testcases.getHeaderCount();
            //print header column
            for(int i=0;i<numberOfHeaders;i++)
            {
                System.out.print(testcases.getHeader(i)+",  ");
            }
            
           logger.info("CarrierCode - ServiceCode - Country - State -  PostCode - CutOffTime - Suburb - FAILURE REASON");
           while (testcases.readRecord())
            {
                String CarrierCode = testcases.get("carrier_code");
                String ServiceCode = testcases.get("service_code");
                String Country = testcases.get("country_code");
                String State = testcases.get("state");
                String PostCode = testcases.get("postcode");
                String CutOffTime = testcases.get("cut_off_time");
                String Suburb = testcases.get("locality");
                 // output file content
                System.out.println(CarrierCode +",   " + ServiceCode +",    " + Country +",  " + State +",    " + PostCode +",   " + CutOffTime+",   "+Suburb);
                ReadCsvFile.CuttOffTimeAPI(CarrierCode, ServiceCode, Country, State, PostCode, Suburb, CutOffTime);
            }

            testcases.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
	
	
	 private static void CuttOffTimeAPI(String CarrierCode, String ServiceCode, String Country, String State, String PostCode, String Suburb, String CutOffTime )  throws JSONException,InterruptedException {
		 	//Cutt Off Time API Test
			RestAssured.baseURI ="https://au-ppd-ecs-seleniumtests.api-elb.internal.mytoll.com";
			RequestSpecification Response = RestAssured.given();
			Response.header("Content-Type", "application/json");
			Response.header("x-mytoll-identity", "3103d4bb-5acd-4130-b1da-6617e9da2d33");
			Response GetCuttOffTime = Response.get("dispatch/pickup/v1/pickups/cutofftime?CarrierCode="+CarrierCode+"&ServiceCode="+ServiceCode+"&PostCode="+PostCode+"&State="+State+"&Suburb="+Suburb+"&Country="+Country);
			
			String getCutOffTimeResponse = GetCuttOffTime.asString();
			System.out.println(getCutOffTimeResponse);
			
			//Assertion
			int statusCode = GetCuttOffTime.getStatusCode();
			try {
				Assert.assertEquals(statusCode, 200);
				String result = GetCuttOffTime.asString();
				System.out.println(result);
				
				//Retreive EnquiryID 
				JSONObject jsonObj = new JSONObject(GetCuttOffTime.body().asString());
				String RetreivedCuttOffTime = jsonObj.getString("CutOffTime");
				System.out.println(RetreivedCuttOffTime);
				Assert.assertEquals(RetreivedCuttOffTime, CutOffTime);
				}
			catch (Throwable e) {
				logger.error(CarrierCode +",           " + ServiceCode +",         " + Country +",     " + State +",     " + PostCode +",      " + CutOffTime+",      "+Suburb+",  "+e.getMessage());
			}
			
		}
	 
	 @AfterMethod
	public void Complete() {
		 logger.info("---------------END OF TEST---------------");

	}
	
	
}