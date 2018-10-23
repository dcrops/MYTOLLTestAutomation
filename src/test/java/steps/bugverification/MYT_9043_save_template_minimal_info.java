package steps.bugverification;

import java.util.Map;

import org.openqa.selenium.By;

import global.PageBase;
import bookapickup.BookAPickupActions;
import createshipment.CreateShipmentActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MYT_9043_save_template_minimal_info
{
	@When("^user clicks save template$")
	public void user_clicks_save_template() throws Throwable {
	
		PageBase.click(BookAPickupActions.saveAsTemplateBtn, 50);
	   
	}

	@Then("^template is saved$")
	public void template_is_saved() throws Throwable {
		
	   PageBase.verifyTextExist(BookAPickupActions.NOUNAddedMsgContent, "Template is saved successfully");
	   PageBase.MinimumWaitForElementEnabled();
	   PageBase.click(BookAPickupActions.CloseAlert, 50);
	   
	}

	@When("^user updates the remaining data$")
	public void user_updates_the_remaining_data(DataTable arg1) throws Throwable {
	   BookAPickupActions.EnterLengthWidthHeight("12", "34", "56");
	   
	   
	}
	
	@When("^user clicks on update template$")
	public void user_clicks_on_update_template() throws Throwable {
			PageBase.click(BookAPickupActions.updateTemplateBtn, 50);
	}

	@Then("^template is updated$")
	public void template_is_updated() throws Throwable {
		   PageBase.verifyTextExist(BookAPickupActions.NOUNAddedMsgContent, "Template is updated successfully");
		   PageBase.MinimumWaitForElementEnabled();
		   PageBase.click(BookAPickupActions.CloseAlert, 50);
	}

	@When("^user clicks on 'clear' template$")
	public void user_clicks_on_clear_template() throws Throwable {
		PageBase.click(BookAPickupActions.clearTemplateBtn, 50);
		PageBase.click(BookAPickupActions.confirmBtn, 50);
			   
	}

	@Then("^all the template description fields go empty$")
	public void all_the_template_description_fields_go_empty() throws Throwable {
	PageBase.verifyTextExist(BookAPickupActions.enterQuantity, "");
	    
	}

	@When("^user enters the template name in the Item Description$")
	public void user_enters_the_template_name_in_the_Item_Description(DataTable shipmentTestData) throws Throwable {
		
		for (Map<String, String> shipment : shipmentTestData.asMaps(String.class, String.class)) {
		PageBase.sendText(BookAPickupActions.itemDescriptionTextField, 50, shipment.get("Item description"));
		PageBase.click(By.xpath("//*[@id=\"freight-type-selector\"]//div[contains(text(),'"+shipment.get("Item description")+"')]"), 50);
		}
	}

	@Then("^the remaining fields are autopopulated$")
	public void the_remaining_fields_are_autopopulated() throws Throwable {
		PageBase.click(CreateShipmentActions.senderReference, 50);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExistAttribute(BookAPickupActions.length, "12");
//	    PageBase.verifyTextExist(BookAPickupActions.length, "12");
//	    PageBase.verifyTextExist(BookAPickupActions.width, "34");
//	    PageBase.verifyTextExist(BookAPickupActions.height, "56");
	}

	@When("^User clicks on delete template$")
	public void user_clicks_on_delete_template() throws Throwable {
	    PageBase.click(BookAPickupActions.deleteTemplateBtn, 50);
	    PageBase.click(BookAPickupActions.confirmBtn, 50);
	}

	@Then("^the template is deleted$")
	public void the_template_is_deleted() throws Throwable {
		
		PageBase.verifyTextExist(BookAPickupActions.NOUNAddedMsgContent, "Template has been deleted successfully.");
		
	    
	}
}
