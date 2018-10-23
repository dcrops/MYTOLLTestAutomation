package steps.bookapickup;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import bookapickup.BookAPickupActions;
import global.PageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYT_1524_BAP_DefaultModeToQuickEntryMode_StepDefinitions {
	
	
	
	@When("^User selects switch from 'Default' mode to ' Quick Entry ' mode$")
	public void user_selects_switch_from_Default_mode_to_Quick_Entry_mode() throws Throwable {
		PageBase.MaximumWaitForElementEnabled();
		//BookAPickupActions.SelectQuickEntryModeYes();
		BookAPickupActions.setQEMYes();
	  
	}

	@Then("^User verify that Toll Carrier Account Number Sender Address Name and Phone Number have not been changed$")
	public void user_verify_that_Toll_Carrier_Account_Number_Sender_Address_Name_and_Phone_Number_have_not_been_changed(DataTable bookAPickupTestData) throws Throwable {
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			String tollCarrier=BookAPickupActions.GetTollCarrier();
			System.out.println(tollCarrier);
			String accountNo = BookAPickupActions.GetAccountNumber();
			System.out.println(accountNo);
			
			assertEquals(bookAPickup.get("TollCarrier"),tollCarrier);

			//assertEquals(bookapickup.get("AccountNumber"),accountNo);
			assertTrue(accountNo.contains(bookAPickup.get("AccountNumber")));

			
			//String company = BookAPickupActions.GetCompany(1);
			//System.out.println(company);
			//assertEquals(company,bookapickup.get("Sender"));
			
		}
				  
	}

	@Then("^User can see By default, Quick entry mode will display (\\d+) Line items$")
	public void user_can_see_By_default_Quick_entry_mode_will_display_Line_items(int bookAPickupTestData) throws Throwable {
	  
	}

	@Then("^User able to see Line item number autopopulated$")
	public void user_able_to_see_Line_item_number_autopopulated() throws Throwable {
	 
	}

	@When("^User select the Service as below$")
	public void user_select_the_Service_as_below(DataTable bookAPickupTestData) throws Throwable {
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			PageBase.MaximumWaitForElementEnabled_1();
			BookAPickupActions.EnterServiceQME(bookAPickup.get("Service"));
		}
	 
	}

	@When("^User enter following input data$")
	public void user_enter_following_input_data(DataTable bookAPickupTestData) throws Throwable {
		
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			
			String itemDescription=BookAPickupActions.RandomItemDescription(bookAPickup.get("ItemDescription"));

			BookAPickupActions.EnterItemDesriptionQME(itemDescription);

			BookAPickupActions.EnterDestinationQME(bookAPickup.get("Destination"), bookAPickup.get("Destination Item")); 

			BookAPickupActions.EnterNoOfItemsQME(bookAPickup.get("NoOfItems"));

			BookAPickupActions.EnterPalletSpacesQME(bookAPickup.get("PalletSpaces"));

			BookAPickupActions.EnterLengthWidthHeightQME(bookAPickup.get("Length"),bookAPickup.get("Width"),bookAPickup.get("Height"),bookAPickup.get("TotalWeight"));
		
		}
	 	   
	}

	@When("^User can see Charge to Account default to Sender and ability to select Receiver and Third Party$")
	public void user_can_see_Charge_to_Account_default_to_Sender_and_ability_to_select_Receiver_and_Third_Party() throws Throwable {
		
		//GetChargeToAccount();
	   
	}
	
	@When("^User can see Charge to Account default to \"([^\"]*)\" and ability to select \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_can_see_Charge_to_Account_default_to_and_ability_to_select_and(String pSender, String pReceiver, String pThirdParty) throws Throwable {
		
		//assertEquals(pSender,BookAPickupActions.GetChargeToAccountQME());
		BookAPickupActions.SelectChargeToQME(pSender);
		BookAPickupActions.SelectChargeToQME(pReceiver);
		BookAPickupActions.SelectChargeToQME(pThirdParty);
		BookAPickupActions.SelectChargeToQME(pSender);
	}

	@When("^User selects Contains food or food packaging as NO$")
	public void user_selects_Contains_food_or_food_packaging_as_NO() throws Throwable {
		
		BookAPickupActions.SelectContainsFoodNoQME();
	  
	}

	@When("^User select Dangerous Goods as Yes$")
	public void user_select_Dangerous_Goods_as_Yes() throws Throwable {
		BookAPickupActions.SelectDangerousGoodsYesQME();
	    
	}

	@When("^User enter following dangerous goods details$")
	public void user_enter_following_dangerous_goods_details(DataTable bookAPickupTestData) throws Throwable {
	   
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

		
			
			BookAPickupActions.SelectDangerousGoodsDetailsQME(bookAPickup.get("UnNumber"), bookAPickup.get("PackageDescription"),bookAPickup.get("DGPackageType"), bookAPickup.get("DGAggregateQty"));
			String s = bookAPickup.get("PackingGroup");
			System.out.println("s----" + s);
			//BookAPickupActions.SelectPackgingGroupQMEInt(Integer.parseInt(s));
			BookAPickupActions.SelectPackgingGroupQME(bookAPickup.get("PackingGroup"));
			BookAPickupActions.EnterTechnicalNameQME(bookAPickup.get("Technical Name"));
		}
	}

	@Then("^User able to see following fields are autopopulated\\.$")
	public void user_able_to_see_following_fields_are_autopopulated(DataTable bookAPickupTestData) throws Throwable {
	   
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {

			String un = BookAPickupActions.GetUNNumberQME();
			System.out.println("Un----" + un);
			String classDivision = BookAPickupActions.GetClassDivisionQME();
			System.out.println("Class----" + classDivision);
			String subRisk = BookAPickupActions.GetSubRiskQME();
			System.out.println("Subrisk----" + subRisk);
			String packingGroup = BookAPickupActions.GetPackingGroupQME();
			System.out.println("packingGroup1" + packingGroup);
			String ProperShippingName = BookAPickupActions.GetProperShippingNameQME();
			System.out.println("ProperShippingName" + ProperShippingName);
			
			assertEquals(classDivision,bookAPickup.get("Class/Div"));
			assertEquals(subRisk,bookAPickup.get("SubRisk"));
			assertEquals(packingGroup,bookAPickup.get("PackingGroup"));
			assertEquals(ProperShippingName,bookAPickup.get("Proper Shoping Name"));
						
		}
	}
	
	@When("^User Clicks on 'Add' to add Dangerous Goods$")
	public void user_Clicks_on_Add_to_add_Dangerous_Goods() throws Throwable {
		
		BookAPickupActions.addDGItemQME();
		BookAPickupActions.SaveCloseDGScreenQME();
	}
	
	@When("^User Clicks on 'Add' to Quick Entry Mode Line item$")
	public void user_Clicks_on_Add_to_Quick_Entry_Mode_Line_item() throws Throwable {
		PageBase.MediumWaitForElementEnabled();
		BookAPickupActions.addQMELineItemQME();
		PageBase.MaximumWaitForElementEnabled();

		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
	}

	@When("^User clicks on ADD NEW LINES$")
	public static void user_clicks_on_ADD_NEW_LINES() throws Throwable {
		//BookAPickupActions.addQMELineItemQME();
	}

	@When("^User selects Dangerous Goods as NO$")
	public void user_selects_Dangerous_Goods_as_NO() throws Throwable {
		BookAPickupActions.SelectDangerousGoodsNoQME();
		PageBase.MoveToElement(BookAPickupActions.weightQME, BookAPickupActions.lengthQME);
		//user_clicks_on_ADD_NEW_LINES();
	}


	@When("^User clicks on 'Save template'$")
	public void user_clicks_on_Save_template() throws Throwable {
		BookAPickupActions.SaveLineItemQME();
	}

	@Then("^Message displays as Line item Template is saved$")
	public void message_displays_as_Line_item_Template_is_saved(DataTable bookAPickupTestData) throws Throwable {
	
		for (Map<String, String> bookAPickup : bookAPickupTestData.asMaps(String.class, String.class)) {
			
			assertEquals(BookAPickupActions.GetSavedTemplateMessage(),bookAPickup.get("Message"));
			BookAPickupActions.ClosedSavedTemplateMessage();
			
		}
		
	   
	}

	@When("^User clicks on 'Save template' for Shipment$")
	public void user_clicks_on_Save_template_Shipment() throws Throwable {
		BookAPickupActions.SaveLineItemQMEShipment();
	}

}
