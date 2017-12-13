package GenericTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;

import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYouPickupActions;

public class RegistrationPage_ErrorMsgValidation {
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		
	}
	

	@Test
	
	public void MyProfile_UserRegistration() {
		//User Triggers Error Msg Pop Up
		PageBase.click(MyTollHomePageActions.register, 10);
		PageBase.click(MyTollHomePageActions.firstName, 10);
		PageBase.click(MyTollHomePageActions.lastName, 10);
		PageBase.click(MyTollHomePageActions.newEmailAddress, 10);
		PageBase.click(MyTollHomePageActions.mobileNumber, 10);
		PageBase.click(MyTollHomePageActions.newPassword, 10);
		PageBase.click(MyTollHomePageActions.memerobleQuesDropdown, 10);
		PageBase.click(MyTollHomePageActions.memerobleQuesDropdown, 10);
		PageBase.click(MyTollHomePageActions.memerobleAnswer, 10);
		PageBase.click(MyTollHomePageActions.agreeTerms, 10);
		
		//User Verifies Error Msg
		PageBase.verifyTextExist(MyTollHomePageActions.firstNameErrorMsg, "Please add valid first name.");
		PageBase.verifyTextExist(MyTollHomePageActions.lastNameErrorMsg, "Please add valid last name.");
		PageBase.verifyTextExist(MyTollHomePageActions.newEmailAddressErrorMsg, "Invalid email address");
		PageBase.verifyTextExist(MyTollHomePageActions.mobileNumbeErrorMsgr, "Please enter valid mobile number.");
		PageBase.verifyTextExist(MyTollHomePageActions.newPasswordErrorMsg, "You have entered an incorrect password. please try again.");
		PageBase.verifyTextExist(MyTollHomePageActions.memerobleQuesDropdownErrorMsg, "Memorable question not selected. please try again.");
		PageBase.verifyTextExist(MyTollHomePageActions.memerobleAnsweErrorMsgr, "The memorable answer must be at least 4 characters in length. please try again.");
		
	}
	
	
	@AfterMethod
	public void RunTearDown() throws Exception {
		 //BaseWebdriver.tearDown();

	}
}
