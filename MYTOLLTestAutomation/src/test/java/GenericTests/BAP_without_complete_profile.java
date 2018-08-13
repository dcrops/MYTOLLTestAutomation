package GenericTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class BAP_without_complete_profile {
	
//MYT-6942
//MYT-7260
	
	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername5, BaseWebdriver.Password);	//logs is using the incomplete profile
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
	}
	
	
	@Test
	public void BAPWithoutCompleteProfile() throws InterruptedException {

		PageBase.MaximumWaitForElementEnabled();

		PageBase.verifyTextExist(MyTollHomePageActions.CompleteprofileMsglocator, "Complete your profile");		//the msg on the top for completing the profile
		
		BaseWebdriver.driver.findElement(MyTollHomePageActions.CompleteprofileUpdateNowBtn).click();			
		PageBase.verifyTextExist(MyTollHomePageActions.AboutMe, "ABOUT ME");		
		PageBase.MinimumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();	
		MyTollHomePageActions.ClickMyDashboard();
		
		
		
		PageBase.MaximumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();	
		CreateShipmentActions.ClickShipment();
		
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(MyTollHomePageActions.CompleteprofileMsglocator, "Complete your profile");
				
		BaseWebdriver.driver.findElement(MyTollHomePageActions.CompleteprofileUpdateNowBtn).click();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.verifyTextExist(MyTollHomePageActions.AboutMe, "ABOUT ME");
		
		PageBase.MaximumWaitForElementEnabled();
		
		MyTollHomePageActions.ClickMenu();	
		MyTollHomePageActions.ClickMyDashboard();
		PageBase.MaximumWaitForElementEnabled();
		
		}
		
	
	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();

	}
}
