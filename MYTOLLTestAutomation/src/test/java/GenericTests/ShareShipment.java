package GenericTests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class ShareShipment {
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
	}
	

	@Test
	@Parameters({"ShipmentNo","EmailAddress1","EmailAddress2","EmailAddress3","EmailAddress4","EmailAddress5"})
	public void AuntenticatedUser_ShareShipment_Maximum(String ShipmentNo, String EmailAddress1, String EmailAddress2, String EmailAddress3, String EmailAddress4, String EmailAddress5 ) {
		MyTollHomePageActions.searchShipment(ShipmentNo);
		Reporter.log("User Clicks Share Shipment");
		PageBase.click(MyTollHomePageActions.shareShipment, 2);
		PageBase.MaximumWaitForElementEnabled_1();
		Reporter.log("User Enters 5 Shipment Numbers");
		PageBase.sendText(MyTollHomePageActions.shareShipmentEmail, 5, EmailAddress1);
		PageBase.click(MyTollHomePageActions.shareShipmentEmailAdd, 5);
		PageBase.sendText(MyTollHomePageActions.shareShipmentEmail, 5, EmailAddress2);
		PageBase.click(MyTollHomePageActions.shareShipmentEmailAdd, 5);
		PageBase.sendText(MyTollHomePageActions.shareShipmentEmail, 5, EmailAddress3);
		PageBase.click(MyTollHomePageActions.shareShipmentEmailAdd, 5);
		PageBase.sendText(MyTollHomePageActions.shareShipmentEmail, 5, EmailAddress4);
		PageBase.click(MyTollHomePageActions.shareShipmentEmailAdd, 5);
		PageBase.sendText(MyTollHomePageActions.shareShipmentEmail, 5, EmailAddress5);
		PageBase.click(MyTollHomePageActions.shareShipmentEmailAdd, 5);
		PageBase.verifyTextExist(MyTollHomePageActions.shareShipmentEmailMaxMsg, "You've reached the maximum number of 5 people to share with");
		
		PageBase.click(MyTollHomePageActions.shareShipmentSubmit, 2);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(MyTollHomePageActions.shareShipmentEmailSuccessMsg, "You have shared this shipment");
		PageBase.verifyTextExist(MyTollHomePageActions.shareShipmentEmailSuccessMsg2, "We have sent an email with a link to this shipment which will display public information.");
		PageBase.click(MyTollHomePageActions.shareShipmentEmailSuccessClose, 2);
		PageBase.MinimumWaitForElementEnabled_1();

	}
	
	@Test
	@Parameters({"ShipmentNo","EmailAddress1"})
	public void AuntenticatedUser_ShareShipment_NegativeSenario(String ShipmentNo, String EmailAddress1) {
		MyTollHomePageActions.searchShipment(ShipmentNo);
		Reporter.log("User Clicks Share Shipment");
		PageBase.click(MyTollHomePageActions.shareShipment, 2);
		PageBase.MaximumWaitForElementEnabled_1();
		Reporter.log("User Submits with Blnk Email Address");
		PageBase.click(MyTollHomePageActions.shareShipmentSubmit, 2);
		PageBase.verifyTextExist(MyTollHomePageActions.shareShipmentEmailErrorMsg, "Invalid email address");
		PageBase.MinimumWaitForElementEnabled_1();
		Reporter.log("User Enters Shipment Numbers");
		PageBase.sendText(MyTollHomePageActions.shareShipmentEmail, 5, EmailAddress1);
		PageBase.click(MyTollHomePageActions.shareShipmentEmailAdd, 5);
		Reporter.log("User Removes Shipment Numbers");
		PageBase.click(By.xpath("//*[@id=\"to-email-wrapper\"]//*//span[text()='"+EmailAddress1+"']/following-sibling::a/i"), 5);
		PageBase.MinimumWaitForElementEnabled_1();
		Reporter.log("User Enters Invalid Email Address");
		PageBase.sendText(MyTollHomePageActions.shareShipmentEmail, 5, "TEstInvalidEmail@@@@.c.c.c.c");
		PageBase.click(MyTollHomePageActions.shareShipmentSubmit, 2);
		PageBase.verifyTextExist(MyTollHomePageActions.shareShipmentEmailErrorMsg, "Invalid email address");
	}
	

	
	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();

	}
}
