package stationeryStepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.junit.Assert;

import Global.PageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myTollHomePage.MyTollHomePageActions;
import stationery.OrderSummaryActions;
import stationery.ReviewOrderActions;
import stationery.StationeryActions;

public class MYT_6079_StationeryOrderStationery 
{

	@Then("^User must be able to see an option to select Order Stationery$")
	public void user_must_be_able_to_see_an_option_to_select_Order_Stationery() throws Throwable {

		MyTollHomePageActions.GetStationery();

	}

	@Then("^User able to select Consignment Notes products and select one of those$")
	public void user_able_to_select_Consignment_Notes_products_and_select_one_of_those(DataTable StationeryTestData)
			throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			MyTollHomePageActions.ClickStationery();
			StationeryActions.SelectProductCategory(stationery.get("Product"));

		}

	}

	@When("^User can increase or Decrease the Qty of a product by (\\d+)$")
	public void user_can_increase_or_Decrease_the_Qty_of_a_product_by(int arg1, DataTable StationeryTestData)
			throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {

			StationeryActions.IncreaseProductQty();
			assertEquals(StationeryActions.GetProductQty(), stationery.get("NoOfQtyIncrease"));
			StationeryActions.DecreaseProductQty();
			assertEquals(StationeryActions.GetProductQty(), stationery.get("NoOfQtyDecrease"));

		}

	}

	@When("^User be able to enter preprint detatil as below$")
	public void user_be_able_to_enter_preprint_detatil_as_below(DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {

			StationeryActions.ClickAddPreprintDetails();
			StationeryActions.ClickPreprintFrom();
			StationeryActions.ClickPreprintTo();
			StationeryActions.EnterPreprintFromDetails(stationery.get("PreprintFrom"),
					stationery.get("preprintFromContactName"));
			StationeryActions.EnterPreprintToDetails(stationery.get("PreprintTo"),
					stationery.get("preprintToContactName"));
			PageBase.MaximumWaitForElementEnabled();
			/*
			 * StationeryActions.EnterPreprintFromDetails(stationery.get("PreprintFrom"),
			 * stationery.get("preprintFromContactName"));
			 */
			PageBase.MaximumWaitForElementEnabled();
			StationeryActions.ClickAddDetails();

		}
	}

	@When("^User be able to edit preprint detatil as below$")
	public void user_be_able_to_edit_preprint_detatil_as_below(DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {

			StationeryActions.ClickAddPreprintDetails();
			StationeryActions.EnterPreprintFromDetails(stationery.get("PreprintFrom"),
					stationery.get("preprintFromContactName"));
			/*
			 * StationeryActions.EnterPreprintToDetails(stationery.get("PreprintTo"),
			 * stationery.get("preprintToContactName"));
			 */
			StationeryActions.ClickAddDetails();

		}
	}

	@When("^User ADD TO CART a Product$")
	public void user_ADD_TO_CART_a_Product(DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {

			StationeryActions.ClickAddToCart(stationery.get("Product"));
		}
	}

	@Then("^User be able to see product added to the cart and the number of items in the cart increment by (\\d+)$")
	public void user_be_able_to_see_product_added_to_the_cart_and_the_number_of_items_in_the_cart_increment_by(int arg1,
			DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {

			assertEquals(StationeryActions.GetNoOfItems(), stationery.get("NoOfItems"));
			StationeryActions.ClickItems();
			String ProductDetails = stationery.get("Product").replaceAll(" \\s ", "") + "\n"
					+ stationery.get("NoOfQty").replaceAll("\\s ", "") + "\n"
					+ stationery.get("PreprintLabel").replaceAll("\\s", "");
			assertEquals(StationeryActions.GetproductName1FromTheCart(stationery.get("Product")).replaceAll(" \n ", ""),
					ProductDetails);
			assertEquals(StationeryActions.GetTotalItemsFromCart(), stationery.get("TotalItems"));

		}

	}

	@When("^User clicks Edit preprint icon in the cart$")
	public void user_clicks_Edit_preprint_icon_in_the_cart() throws Throwable {

		StationeryActions.ClickPreprintInTheCart();
	}

	@When("^User edits preprint details inside the cart$")
	public void user_edits_preprint_details_inside_the_cart(DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {

			/*
			 * PageBase.MaximumWaitForElementEnabled();
			 * PageBase.MaximumWaitForElementEnabled();
			 * PageBase.MaximumWaitForElementEnabled();
			 * PageBase.MaximumWaitForElementEnabled();
			 */
			PageBase.WaitForElement(StationeryActions.increaseProductQtyInsideTheCart, 10);
			StationeryActions.IncreaseProductQtyInsideTheCart();
			assertEquals(StationeryActions.GetProductQtyInsideTheCart(), stationery.get("NoOfQtyIncrease"));
			StationeryActions.DecreaseProductQtyInsideTheCart();
			assertEquals(StationeryActions.GetProductQtyInsideTheCart(), stationery.get("NoOfQtyDecrease"));
			StationeryActions.EnterPreprintFromDetailsInsideTheCart(stationery.get("PreprintFrom"),
					stationery.get("PreprintFromContactName"));
			StationeryActions.EnterPreprintToDetailsInsideTheCart(stationery.get("PreprintTo"),
					stationery.get("PreprintToContactName"));
			StationeryActions.ClickAddDetailsInsideTheCart();
			assertEquals(StationeryActions.GetSuccessMessageUpdatePreprint().replaceAll(" \\s ", ""),
					stationery.get("Message"));
			StationeryActions.ClickBackToListPreprintUpdate();
		}
	}

	@When("^User ADD TO CART a second product$")
	public void user_ADD_TO_CART_a_second_product() throws Throwable {

		StationeryActions.ClickAddToCartProduct2();

	}

	@Then("^User be able to see second product added to the cart and the number of items in the cart increment by (\\d+)$")
	public void user_be_able_to_see_second_product_added_to_the_cart_and_the_number_of_items_in_the_cart_increment_by(
			int arg1, DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {

			assertEquals(StationeryActions.GetNoOfItems(), stationery.get("NoOfItems"));
			StationeryActions.ClickItems();
			PageBase.MaximumWaitForElementEnabled();
			String ProductDetails = stationery.get("Product").replaceAll(" \\s ", "") + "\n"
					+ stationery.get("NoOfQty").replaceAll("\\s ", "");
			assertEquals(StationeryActions.GetproductName2FromTheCart().replaceAll(" \n ", ""), ProductDetails);
			assertEquals(StationeryActions.GetTotalItemsFromCart(), stationery.get("TotalItems"));

		}

	}

	@When("^User removes second product from the cart$")
	public void user_removes_second_product_from_the_cart() throws Throwable {

		PageBase.MaximumWaitForElementEnabled();
		StationeryActions.ClickRemoveProduct2();

	}

	@Then("^User be able to see cart has been updated as below$")
	public void user_be_able_to_see_cart_has_been_updated_as_below(DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			assertEquals(StationeryActions.GetNoOfItems(), stationery.get("NoOfItems"));
			String ProductDetails = stationery.get("Product").replaceAll(" \\s ", "") + "\n"
					+ stationery.get("NoOfQty").replaceAll("\\s ", "") + "\n"
					+ stationery.get("PreprintLabel").replaceAll("\\s", "");
			assertEquals(StationeryActions.GetproductName1FromTheCart(stationery.get("Product")).replaceAll(" \n ", ""),
					ProductDetails);
			assertEquals(StationeryActions.GetTotalItemsFromCart(), stationery.get("TotalItems"));

		}
	}

	@Then("^User be able to see second product added to the cart again$")
	public void user_be_able_to_see_second_product_added_to_the_cart_again(DataTable StationeryTestData)
			throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			assertEquals(StationeryActions.GetNoOfItems(), stationery.get("NoOfItems"));
			String ProductDetails = stationery.get("Product").replaceAll(" \\s ", "") + "\n"
					+ stationery.get("NoOfQty").replaceAll("\\s ", "");
			assertEquals(StationeryActions.GetproductName2FromTheCart().replaceAll(" \n ", ""), ProductDetails);
			assertEquals(StationeryActions.GetTotalItemsFromCart(), stationery.get("TotalItems"));

		}

	}

	@When("^User PROOCEED TO ORDER$")
	public void user_PROOCEED_TO_ORDER() throws Throwable {
		PageBase.MaximumWaitForElementEnabled();
		StationeryActions.ClickProceedToCart();
	}

	@Then("^User navigates to Enter your stationery delivery details page$")
	public void user_navigates_to_Enter_your_stationery_delivery_details_page(DataTable StationeryTestData)
			throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();

			assertEquals(StationeryActions.GetProfileDetailsHeading(), stationery.get("PageHeading"));
			assertEquals(StationeryActions.GetProfileDetailsStatement(), stationery.get("PageDescription"));
			// assertEquals(StationeryActions.GetTollCarrier(),
			// stationery.get("TollCarrier"));

		}

	}

	@When("^User enter Review Order details as below$")
	public void user_enter_Review_Order_details_as_below(DataTable StationeryTestData) throws Throwable 
	{

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) 
		{
			PageBase.MaximumWaitForElementEnabled();

			StationeryActions.EnterAccountNumber(stationery.get("AccountNumber"));
			StationeryActions.EnterContactNumber(stationery.get("ContactName"), stationery.get("ContactNumber"));
			StationeryActions.EnterDeliveryDetails(stationery.get("DeliverAddress"),
					stationery.get("DeliveryContactName"), stationery.get("NotifybyEmail"),
					stationery.get("CustomerReference"), stationery.get("DeliveryInstructions"));

		}

	}

	@When("^User clicks Review Order$")
	public void user_clicks_Review_Order() throws Throwable {

		StationeryActions.ClickReviewOrder();

	}

	@Then("^User be able to see Overview details in the Review Page as below$")
	public void user_be_able_to_see_Overview_details_in_the_Review_Page_as_below(DataTable StationeryTestData)
			throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			ReviewOrderActions.VerifyReviewOrder(stationery.get("TollCarrier"), stationery.get("AccountNumber"),
					stationery.get("Contact name"), stationery.get("Contact number"));

		}

	}

	@Then("^User be able to see Delivery details in the Review page as below$")
	public void user_be_able_to_see_Delivery_details_in_the_Review_page_as_below(DataTable StationeryTestData)
			throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			ReviewOrderActions.VerifyDeliveryDetails(stationery.get("Contact name"), stationery.get("Phone number"),
					stationery.get("Company name"), stationery.get("Address"), stationery.get("Customer reference"),
					stationery.get("Delivery instructions"));

		}
	}

	@Then("^User be able to see first Line item details as below$")
	public void user_be_able_to_see_first_Line_item_details_as_below(DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			ReviewOrderActions.VerifyLineItem1details(stationery.get("ProductName"), stationery.get("Quantity"),
					stationery.get("UnitPrice"), stationery.get("Total"), stationery.get("PreprintFrom"));

		}
	}

	@Then("^User be able to see second Line item details as below$")
	public void user_be_able_to_see_second_Line_item_details_as_below(DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			ReviewOrderActions.VerifyLineItem2details(stationery.get("ProductName"), stationery.get("Quantity"),
					stationery.get("UnitPrice"), stationery.get("Total"));

		}

	}

	@Then("^User must see following message$")
	public void user_must_see_following_message(DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			ReviewOrderActions.VerifyGSTMSG(stationery.get("GSTMSG"));

		}

	}

	@Then("^User be able to charges in Review page as below$")
	public void user_be_able_to_charges_in_Review_page_as_below(DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			ReviewOrderActions.VerifyTotals(stationery.get("TotalSurcharges"), stationery.get("TotalCharges"));

		}
	}

	@When("^User Clicks on Confirm Order$")
	public void user_Clicks_on_Confirm_Order() throws Throwable {
		ReviewOrderActions.ConfirmOrder();
	}

	@When("^User clicks the EDIT button$")
	public void user_clicks_the_EDIT_button() throws Throwable {

		ReviewOrderActions.ClickEdit();

	}

	@When("^User clicks the Edit Delivery Details button$")
	public void user_clicks_the_Edit_Delivery_Details_button() throws Throwable {

		ReviewOrderActions.ClickEditDeliveryDetails();

	}

	@Then("^User be able to see third product added to the cart and the number of items in the cart increment by (\\d+)$")
	public void user_be_able_to_see_third_product_added_to_the_cart_and_the_number_of_items_in_the_cart_increment_by(
			int arg1, DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			assertEquals(StationeryActions.GetNoOfItems(), stationery.get("NoOfItems"));
			StationeryActions.ClickItems();
			String ProductDetails = stationery.get("Product").replaceAll(" \\s ", "") + "\n"
					+ stationery.get("NoOfQty").replaceAll("\\s ", "");
			assertEquals(StationeryActions.GetproductName3FromTheCart().replaceAll(" \n ", ""), ProductDetails);
			assertEquals(StationeryActions.GetTotalItemsFromCart(), stationery.get("TotalItems"));

		}
	}

	@Then("^User be able to see third Line item details as below$")
	public void user_be_able_to_see_third_Line_item_details_as_below(DataTable StationeryTestData) throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			ReviewOrderActions.VerifyLineItem3details(stationery.get("ProductName"), stationery.get("Quantity"),
					stationery.get("UnitPrice"), stationery.get("Total"));
		}

	}

	@When("^User Confirm Order$")
	public void user_Confirm_Order() throws Throwable {

		ReviewOrderActions.ConfirmOrder();
		PageBase.LongWaitForElementEnabled();
		PageBase.LongWaitForElementEnabled();

	}

	@Given("^User have ability to Print the order details after confirming the order$")
	public void user_have_ability_to_Print_the_order_details_after_confirming_the_order() throws Throwable {

		ReviewOrderActions.ClickPrint();
	}

	@Then("^User be able to see Order number and Order created Date$")
	public void user_be_able_to_see_Order_number_and_Order_created_Date() throws Throwable {

		ReviewOrderActions.VerifyOrderNumber();
		ReviewOrderActions.VerifyCreatedOn();
	}

	@Then("^User be able to create a new order$")
	public void user_be_able_to_create_a_new_order() throws Throwable {

		ReviewOrderActions.VerifyCreateANewOrder();

	}

	@Then("^User be able to go back to Dashboard$")
	public void user_be_able_to_go_back_to_Dashboard() throws Throwable {

		ReviewOrderActions.VerifyBackToDashboard();

	}

	@Then("^User can go to MY ORDERS$")
	public void user_can_go_to_MY_ORDERS() throws Throwable {

		ReviewOrderActions.VerifyMYOrders();

	}
	
	@When("^User Clicks on Myorders to see created ordered$")
	public void user_Clicks_on_Myorders_to_see_created_ordered() throws Throwable {

		ReviewOrderActions.ClickMyorder();
	}

	@Then("^User navigated to MYorders screen and can open the created order$")
	public void user_navigated_to_MYorders_screen_and_can_open_the_created_order(DataTable arg1) throws Throwable {
		ReviewOrderActions.VerifyMYOrdersScreenHeading();
		ReviewOrderActions.ClickOrderItem();
	}

	@Then("^User be able to see Overview details in the Order Summary Page as below$")
	public void user_be_able_to_see_Overview_details_in_the_Order_Summary_Page_as_below(DataTable StationeryTestData)
			throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			OrderSummaryActions.VerifyReviewOrder(stationery.get("TollCarrier"), stationery.get("AccountNumber"),
					stationery.get("Contact name"), stationery.get("Contact number"));

		}
	}

	@Then("^User be able to see Delivery details in the Order Summary Page as below$")
	public void user_be_able_to_see_Delivery_details_in_the_Order_Summary_Page_as_below(DataTable StationeryTestData)
			throws Throwable {

		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			OrderSummaryActions.VerifyDeliveryDetails(stationery.get("Contact name"), stationery.get("Phone number"),
					stationery.get("Company name"), stationery.get("Address"), stationery.get("Customer reference"),
					stationery.get("Delivery instructions"));

		}

	}

	@Then("^User must see following message in the Order Summary Page as below$")
	public void user_must_see_following_message_in_the_Order_Summary_Page_as_below(DataTable StationeryTestData) throws Throwable {
		
		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			OrderSummaryActions.VerifyGSTMSG(stationery.get("GSTMSG"));

		}
	}

	@Then("^User be able to charges in the Order Summary Page as below$")
	public void user_be_able_to_charges_in_the_Order_Summary_Page_as_below(DataTable StationeryTestData) throws Throwable {
		
		for (Map<String, String> stationery : StationeryTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled();
			OrderSummaryActions.VerifyTotals(stationery.get("TotalSurcharges"), stationery.get("TotalCharges"));

		}
	}

	@Then("^User have ability to Print the order details in the Order Summary Page as below$")
	public void user_have_ability_to_Print_the_order_details_in_the_Order_Summary_Page_as_below() 
	{
		
		//OrderSummaryActions.ClickPrint();
	}
	
	@When("^User clicks My Orders$")
	public void user_clicks_My_Orders() 
	{
	 MyTollHomePageActions.ClickMyOrdersStationery();  
	}

	@Then("^User must see My Orders page$")
	public void user_must_see_My_Orders_page() 
	{
		PageBase.isElementPresent(StationeryActions.MyOrdersPage, 2, "My Orders page");
	}

	@Then("^user must be able to view the orders on My Orders page$")
	public void user_must_be_able_to_view_and_sort_the_orders_on_My_Orders_page() 
	{
		Assert.assertTrue(StationeryActions.VerifyIfOrdersPresent());
	}

	@When("^User clicks on an Order that appears in the list$")
	public void user_clicks_on_an_Order_that_appears_in_the_list() 
	{
		
	    PageBase.ClickElementFromTheList(StationeryActions.MyOrdersList, 0);
	   
	}

	@Then("^User will be able to view the details of the Order$")
	public void user_will_be_able_to_view_the_details_of_the_Order() 
	{
	    StationeryActions.VerifyOrderDetails();
	   
	}

	@Then("^User must be able to print$")
	public void user_must_be_able_to_print() 
	{
	    StationeryActions.PrintOrder();
	    
	}
	
	

}
