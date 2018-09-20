package steps.bookapickup;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import bookapickup.BookAPickupActions;
import global.PageBase;
import basewebdriver.BaseWebdriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mytollhomepage.MyTollHomePageActions;

public class BookAPIckupCommonStepsDefinitions {

	@Given("^User is Registered in MyToll and is on Book a pickup page$")
	public void user_is_Registered_in_MyToll_and_is_on_Book_a_pickup_page() throws Throwable {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername1, BaseWebdriver.Password);
		PageBase.MaximumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}

	@When("^User selects Toll Carrier as Toll Intermodal Specialised  and Account Number$")
	public void user_selects_Toll_Carrier_as_Toll_Intermodal_Specialised_and_Account_Number(
			DataTable bookAPickupTestData) throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.SelectIntermodalSpecializedCarrier(bookAPickup.get("TollCarrier"));
			BookAPickupActions.EnterAccountNumber(bookAPickup.get("AccountNumber"));
		}
	}

	@When("^User selects Toll Carrier and Account Number$")
	public void user_selects_Toll_Carrier_and_Account_Number(DataTable bookAPickupTestData) throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterTollCarrier(bookAPickup.get("TollCarrier"));
			BookAPickupActions.EnterAccountNumber(bookAPickup.get("AccountNumber"));

		}

	}

	@When("^User selects Toll Carrier as TollTasmania and select Account Number$")
	public void user_selects_Toll_Carrier_as_TollTasmania_and_select_Account_Number(DataTable bookAPickupTestData)
			throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			BookAPickupActions.EnterTollCarrier(bookAPickup.get("TollCarrier"));
		}

	}

	@When("^User add Address for the sender in TDF$")
	public void user_add_Address_for_the_sender_in_TDF(DataTable bookAPickupTestData) throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			// Add Address
			BookAPickupActions.AddAddressManuallyTDF(bookAPickup.get("CompanyName"), bookAPickup.get("AddressLine1"),
					bookAPickup.get("AddressLine2"), bookAPickup.get("Suburb"), bookAPickup.get("SuburbItem"),
					bookAPickup.get("State"), bookAPickup.get("Postcode"));
			BookAPickupActions.ClickAddAddress();

		}

	}

	@When("^User selects a existing Sender address from the Sender field$")
	public void user_selects_a_existing_Sender_address_from_the_Sender_field(DataTable bookAPickupTestData)
			throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			// Add Address
			BookAPickupActions.EnterLocation(bookAPickup.get("Sender"));
		}
	}

	@When("^User add Address for the sender in TGX$")
	public void user_add_Address_for_the_sender_in_TGX(DataTable bookAPickupTestData) throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			// Add Address Prio Aus

			BookAPickupActions.AddAddressManuallyPrioAUSInternational(bookAPickup.get("CompanyName"), bookAPickup.get("Country"),
					bookAPickup.get("AddressLine1"), bookAPickup.get("AddressLine2"), bookAPickup.get("Suburb"),
					bookAPickup.get("Postcode"), bookAPickup.get("Email"), bookAPickup.get("PhoneNumber"),
					bookAPickup.get("Phone Country"));

		}

	}

	@When("^User add Address for the sender$")
	public void user_add_Address_for_the_sender(DataTable bookAPickupTestData) throws Throwable {

		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			// Add Address Prio Aus

			BookAPickupActions.EnterLocation(bookAPickup.get("Sender"));
		}

	}

	@When("^User selects NO I am located at the pick up location option$")
	public void user_selects_NO_I_am_located_at_the_pick_up_location_option() throws Throwable {

		BookAPickupActions.SelectPickupLocation();
	}

	@When("^User be able to add Suburb with string max (\\d+) and Postcode with (\\d+) Strings for Sender Address$")
	public void user_be_able_to_add_Suburb_with_string_max_and_Postcode_with_Strings_for_Sender_Address(int suburbMax,
			int postcaodeMax, DataTable bookAPickupTestData) throws Throwable {
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			BookAPickupActions.UpdateSuburbPostcodeAddAddress(bookAPickup.get("CompanyName"), bookAPickup.get("Suburb"),bookAPickup.get("Postcode"));
			BookAPickupActions.CloseAddAddressScreen();
		}

	}

	@When("^User be able to add Suburb and Postcode for Sender Address$")
	public void user_be_able_to_add_Suburb_and_Postcode_for_Sender_Address(DataTable bookAPickupTestData) throws Throwable {
	 					
			for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
				
				BookAPickupActions.AddAddressManuallyTDF(bookAPickup.get("CompanyName"), bookAPickup.get("AddressLine1"),
						bookAPickup.get("AddressLine2"), bookAPickup.get("Suburb"), bookAPickup.get("SuburbItem"),
						bookAPickup.get("State"), bookAPickup.get("Postcode"));
				BookAPickupActions.ClickAddAddress();
				
			}
			
		
	}
	
	@When("^User be able to add ContactEmail with string max (\\d+) and characters a(\\d+)@\\. for Sender Address$")
	public void user_be_able_to_add_ContactEmail_with_string_max_and_characters_a_for_Sender_Address(int arg1, int arg2, DataTable bookAPickupTestData) throws Throwable {
	   
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			BookAPickupActions.UpdateAddAddressManuallyPrioEmail(bookAPickup.get("CompanyName"), bookAPickup.get("Country"),
					bookAPickup.get("AddressLine1"), bookAPickup.get("AddressLine2"), bookAPickup.get("Suburb"),
					bookAPickup.get("Postcode"), bookAPickup.get("Email"));
			BookAPickupActions.CloseEditAddressScreen();
		}
	}
	
	
	@When("^User enter following dangerous goods details as below$")
	public void user_enter_following_dangerous_goods_details_as_below(DataTable bookAPickupTestData) throws Throwable {
	   
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			 PageBase.MaximumWaitForElementEnabled();
			 PageBase.MaximumWaitForElementEnabled();

			
			BookAPickupActions.SelectDangerousGoods(Integer.parseInt(bookAPickup.get("DgGoods")));
		
		}
	}

	@Then("^User able to see following fields autopopulated\\.$")
	public void user_able_to_see_following_fields_autopopulated(DataTable bookAPickupTestData) throws Throwable {
	   
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			String un = BookAPickupActions.GetUNNumber();
			System.out.println("Un----" + un);
			String classDivision = BookAPickupActions.GetClassDivision();
			System.out.println("Class----" + classDivision);
			String subRisk = BookAPickupActions.GetSubRisk();
			System.out.println("Subrisk----" + subRisk);
			String packingGroup = BookAPickupActions.GetPackingGroup();
			System.out.println("packingGroup1" + packingGroup);
			String ProperShippingName = BookAPickupActions.GetProperShippingName();
			System.out.println("ProperShippingName" + ProperShippingName);
			
			assertEquals(classDivision,bookAPickup.get("Class/Div"));
			assertEquals(subRisk,bookAPickup.get("SubRisk"));
			assertEquals(packingGroup,bookAPickup.get("PackingGroup"));
			assertEquals(ProperShippingName,bookAPickup.get("Proper Shoping Name"));
						
		}
	}

	@When("^User clicks on ADD NEW LINES to add more items$")
	public void user_clicks_on_ADD_NEW_LINES_to_add_more_items() throws Throwable {
		
		BookAPickupActions.ClickAddANewLine();
		
	}
	
	@When("^User enter dangerous goods details as below$")
	public void user_enter_dangerous_goods_details_as_below(DataTable bookAPickupTestData) throws Throwable {
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
          
			 PageBase.MaximumWaitForElementEnabled();
			
			BookAPickupActions.EnterDangerousGoodsDetails(Integer.parseInt(bookAPickup.get("LookupItem")),bookAPickup.get("UnNumber"), bookAPickup.get("PackageDescription"),bookAPickup.get("DGPackageType"), bookAPickup.get("DGAggregateQty"));
			String s = bookAPickup.get("PackingGroup");
			System.out.println("s----" + s);
			//BookAPickupActions.SelectPackgingGroupQMEInt(Integer.parseInt(s));
			BookAPickupActions.SelectPackgingGroupString(bookAPickup.get("PackingGroup"));
			BookAPickupActions.EnterTechnicalName(bookAPickup.get("Technical Name"));
		//	PageBase.MoveToElement(BookAPickupActions.dgPackagingDescription, BookAPickupActions.technicalName);
		}
		
	
	}

	@When("^User enter following input data to Add Item for Prio Aus$")
	public void user_enter_following_input_data_to_Add_Item_for_Prio_Aus(DataTable bookAPickupTestData) throws Throwable {
	    
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
              
			 PageBase.MaximumWaitForElementEnabled();
			
				BookAPickupActions.EnterService(bookAPickup.get("Service"));
				BookAPickupActions.SelectDestination(bookAPickup.get("Destination"));
				BookAPickupActions.DescriptionOfGoods(bookAPickup.get("DescriptionOfGoods"));
		}
	}
	
	@When("^User selects Item Description for Prio Aus$")
	public void user_selects_Item_Description_for_Prio_Aus(DataTable bookAPickupTestData) throws Throwable {
	 
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
              
			 PageBase.MaximumWaitForElementEnabled();
			
				BookAPickupActions.SelectItemDescriptionTollPriorityAU(bookAPickup.get("Item Description"));
		
		}
	}

	@When("^User enter No of Items$")
	public void user_enter_No_of_Items(DataTable bookAPickupTestData) throws Throwable {
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
              
			 PageBase.MaximumWaitForElementEnabled();
			
			BookAPickupActions.EnterQuantity(bookAPickup.get("NoOfItems"));
		
		}
		
	}
	

}
