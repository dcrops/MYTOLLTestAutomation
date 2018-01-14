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
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;

public class RegistrationPage_UserProfileStore {
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
	}
	

	@Test
	public void MyProfile_UserRegistration_ErrorMsgValidation() {
		//User Triggers Error Msg Pop Up
		Reporter.log("User Triggers Error Msg Pop Up");
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
		Reporter.log("User Verifies Error Msg on Registration Page");
		PageBase.verifyTextExist(MyTollHomePageActions.firstNameErrorMsg, "Please add valid first name.");
		PageBase.verifyTextExist(MyTollHomePageActions.lastNameErrorMsg, "Please add valid last name.");
		PageBase.verifyTextExist(MyTollHomePageActions.newEmailAddressErrorMsg, "Invalid email address");
		PageBase.verifyTextExist(MyTollHomePageActions.mobileNumbeErrorMsgr, "Please enter valid mobile number.");
		PageBase.verifyTextExist(MyTollHomePageActions.newPasswordErrorMsg, "You have entered an incorrect password. please try again.");
		PageBase.verifyTextExist(MyTollHomePageActions.memerobleQuesDropdownErrorMsg, "Memorable question not selected. please try again.");
		PageBase.verifyTextExist(MyTollHomePageActions.memerobleAnsweErrorMsgr, "The memorable answer must be at least 4 characters in length. please try again.");	
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	@Test
	public void User_UnsuccesfullLogin_ErrorMsgValidation() {
		//User Verifies Error Msg on Login Page
		Reporter.log("User Verifies Error Msg on Login Page");
		PageBase.click(MyTollHomePageActions.login, 5);
		PageBase.sendText(MyTollHomePageActions.emailAddress, 5, "test@test.com");
		PageBase.sendText(MyTollHomePageActions.password, 5, "Password123");
		PageBase.click(MyTollHomePageActions.loginBtn, 5);
		PageBase.MediumWaitForElementEnabled_1();
		PageBase.verifyTextExist(MyTollHomePageActions.RegistrationErrorMsg, "Authentication failed. Please try again.");	
		Reporter.log("---------------END OF TEST---------------");
	}
	

	@Test
	public void ChangeSecurityQuestion() throws Exception {
		//User Changes Memorable Question
		Reporter.log("User Changes Memorable Question");
		MyTollHomePageActions.Login(BaseWebdriver.Username, BaseWebdriver.Password);
		PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to About Me Page");
		PageBase.click(MyTollHomePageActions.aboutMeMenu, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.changeMemorableQuestionBtn, 5);
		PageBase.click(MyTollHomePageActions.securityQuestionDropdown, 5);
		PageBase.click(By.xpath("//*[@id=\"security-quest-dropdown\"]//*//li[2]"), 5);
		PageBase.sendText(MyTollHomePageActions.securityQuestionAnswer, 5, "Test123");
		PageBase.click(MyTollHomePageActions.securityQuestionSave, 5);
		PageBase.verifyTextExist(MyTollHomePageActions.securityQuestionSaveMsgPopup, "Memorable question has been changed");
		PageBase.click(MyTollHomePageActions.securityQuestion, 5);	
		Reporter.log("---------------END OF TEST---------------");
	}
	
	
	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();

	}
}
