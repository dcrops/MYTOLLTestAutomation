package GenericTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;

import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class GenericTests {
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickName();
		/*MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();*/

	}
	

	@Test(priority = 1)
	@Parameters({ "TollCarrierTollPrioNZ", "ItemTemplateName","NumberOfItems", "Length", "Width", "Height", "Weight" })
	public void MyProfile_AddTemplates(String TollCarrier,String ItemTemplateName, String NumberOfItems, String Weight,String Length, String Width, String Height) {

		for (int i=1; i<=1000; i++) {
		MyTollHomePageActions.AddTemplates(TollCarrier,ItemTemplateName,NumberOfItems,Weight,Length,Width,Height);
		}
	}
}
