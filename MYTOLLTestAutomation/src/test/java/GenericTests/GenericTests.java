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
		
		/*MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();*/

	}
	

	/*@Test(priority = 2)
	@Parameters({ "TollCarrierTollPrioNZ", "ItemTemplateName","NumberOfItems", "Length", "Width", "Height", "Weight" })
	public void MyProfile_AddTemplates(String TollCarrier,String ItemTemplateName, String NumberOfItems, String Weight,String Length, String Width, String Height) {
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		MyTollHomePageActions.ClickName();
		for (int i=1; i<=10; i++) {
		MyTollHomePageActions.AddTemplates(TollCarrier,ItemTemplateName,NumberOfItems,Weight,Length,Width,Height);
		}
	}*/
	
	

	@Test(priority = 1)
	@Parameters({ "FirstName", "LastName","NewEmail", "MobileNumber", "Password", "MemorableAnswer"})
	public void MyProfile_UserRegistration(String FirstName,  String LastName,String NewEmail, String MobileNumber, String Password, String MemorableAnswer) {

		MyTollHomePageActions.NewUserRegistration(FirstName, LastName, NewEmail, MobileNumber, Password, MemorableAnswer);
		
	}
}
