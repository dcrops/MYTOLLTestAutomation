package stationeryStepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePageActions.MyTollHomePageActions;

public class MYT_6079_StationeryOrderStationery {
	

	

	@Then("^User must be able to see an option to select Order Stationery$")
	public void user_must_be_able_to_see_an_option_to_select_Order_Stationery() throws Throwable {
		
		MyTollHomePageActions.GetStationery();
		
	}


	@Then("^User able to select Consignment Notes products and select one of those$")
	public void user_able_to_select_Consignment_Notes_products_and_select_one_of_those(DataTable arg1) throws Throwable {
	
	}

	@When("^User can increase or Decrease the Qty of a product by (\\d+)$")
	public void user_can_increase_or_Decrease_the_Qty_of_a_product_by(int arg1, DataTable arg2) throws Throwable {
	  
	}

	@When("^User be able to enter preprint detatil as below$")
	public void user_be_able_to_enter_preprint_detatil_as_below(DataTable arg1) throws Throwable {
	  
	}

	@When("^User be able to edit preprint detatil as below$")
	public void user_be_able_to_edit_preprint_detatil_as_below(DataTable arg1) throws Throwable {
	 
	}

	@When("^User ADD TO CART a Product$")
	public void user_ADD_TO_CART_a_Product(DataTable arg1) throws Throwable {
	
	}

	@Then("^User be able to see product added to the cart and the number of items in the cart increment by (\\d+)$")
	public void user_be_able_to_see_product_added_to_the_cart_and_the_number_of_items_in_the_cart_increment_by(int arg1, DataTable arg2) throws Throwable {
	 
	}

	@When("^User edit product details inside the cart$")
	public void user_edit_product_details_inside_the_cart(DataTable arg1) throws Throwable {
	  
	}

	@When("^User PROOCEED TO ORDER$")
	public void user_PROOCEED_TO_ORDER() throws Throwable {
	   
	}

	@Then("^User navigates to Enter your stationery delivery details page$")
	public void user_navigates_to_Enter_your_stationery_delivery_details_page(DataTable arg1) throws Throwable {
	 
	}

	@When("^User enter Review Order details as below$")
	public void user_enter_Review_Order_details_as_below(DataTable arg1) throws Throwable {
	  
	}



}
