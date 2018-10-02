package steps.bugverification;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Map;


import global.PageBase;
import basewebdriver.BaseWebdriver;
import bookapickup.BookAPickupActions;
import createshipment.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mytollhomepage.MyTollHomePageActions;

public class MYT_6850_Add_Ship_mode	
//verify that the SHIP mode is available for the following services:
//|Refrigeration|Dangerous Goods|Express|General|DG FCL|FCL|DG Refrigerated|Dangerous Goods Express|Premium|
{
@Given("^User is Registered in MyToll and is on the Create A Shipment page$")
public void user_is_Registered_in_MyToll_and_is_on_the_Create_A_Shipment_page() throws Throwable {
	BaseWebdriver.setUp();
	MyTollHomePageActions.Login(BaseWebdriver.AdminUser, BaseWebdriver.AdminPassword);
 	PageBase.MaximumWaitForElementEnabled();
	PageBase.MaximumWaitForElementEnabled();
	MyTollHomePageActions.ClickMenu();
	CreateShipmentActions.ClickShipment();
}

@When("^user enters the following$")
public void user_enters_the_following(DataTable createshipmentSHIPservices) throws Throwable {
	PageBase.FindElement(BookAPickupActions.TollCarrierDropdown).click();
	PageBase.FindElement(BookAPickupActions.TollCarrierIntermodalSpecialized).click();
	for (Map<String, String> advSearch : createshipmentSHIPservices.asMaps(String.class, String.class)) {
		Iterator tags = advSearch.entrySet().iterator();
	    while (tags.hasNext()) {
	        Map.Entry pair = (Map.Entry)tags.next();
	     	System.out.println(pair.getValue());
	       	PageBase.MaximumWaitForElementEnabled();
	     	PageBase.FindElement(CreateShipmentActions.createShipmentServiceSelector).click();
	     	PageBase.FindElement(By.xpath("//*[@id=\"service-selector\"]/div/ul/li/div[text()='"+pair.getValue()+"']")).click();
	     	PageBase.MaximumWaitForElementEnabled();
	     	PageBase.FindElement(CreateShipmentActions.mode).click();
	     	PageBase.MaximumWaitForElementEnabled();
	     	PageBase.verifyTextExist(CreateShipmentActions.modeSelectorSHIP,"SHIP");
	    }
	}
}

@Then("^verify the result$")
public void verify_the_result() throws Throwable {
   System.out.println("SHIP mode is available for the listed services");
 
}

}