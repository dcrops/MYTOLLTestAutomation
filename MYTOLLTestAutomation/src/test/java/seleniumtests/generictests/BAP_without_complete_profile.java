package GenericTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Global.PageBase;
import baseWebdriver.BaseWebdriver;
import createShipment.CreateShipmentActions;
import myTollHomePage.MyTollHomePageActions;

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
