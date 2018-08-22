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
		
		PageBase.MinimumWaitForElementEnabled();
		PageBase.click(MyTollHomePageActions.existingTollYes, 5);
		
		PageBase.verifyTextExist(MyTollHomePageActions.tollOnlineUsernameText, "Toll Online Username");
		PageBase.verifyTextExist(MyTollHomePageActions.tollOnlinepasswordText, "Toll Online password");
		
		PageBase.click(MyTollHomePageActions.tollOnlineUsernameBox, 2);
		PageBase.click(MyTollHomePageActions.tollOnlinePasswordBox, 2);
		
		PageBase.MaximumWaitForElementEnabled();
		
		PageBase.click(MyTollHomePageActions.existingTollNo, 5);
		
		
		PageBase.click(MyTollHomePageActions.firstName, 10);
		PageBase.click(MyTollHomePageActions.lastName, 10);
		PageBase.click(MyTollHomePageActions.newEmailAddress, 10);
		
		PageBase.click(MyTollHomePageActions.confirmEmailAddress, 10);		//added to MyTollHomePageActions
		
		PageBase.click(MyTollHomePageActions.newPassword, 10);
		PageBase.click(MyTollHomePageActions.memerobleQuesDropdown, 10);
		PageBase.click(MyTollHomePageActions.memerobleAnswer, 10);
		PageBase.click(MyTollHomePageActions.newPassword, 10);
		
		PageBase.isElementNotPresent(MyTollHomePageActions.mobileNumber, 5, "Mobile Number");
		
		//User Verifies Error Msg
		// MYT-7259 - Provide email address twice
		//
		
		Reporter.log("User Verifies Error Msg on Registration Page");
		PageBase.verifyTextExist(MyTollHomePageActions.firstNameErrorMsg, "Please add valid first name.");
		PageBase.verifyTextExist(MyTollHomePageActions.lastNameErrorMsg, "Please add valid last name.");
		PageBase.verifyTextExist(MyTollHomePageActions.newEmailAddressErrorMsg, "Please provide email address");
		PageBase.verifyTextExist(MyTollHomePageActions.confirmEmailAddressErrorMsg, "Please confirm email.");
		PageBase.verifyTextExist(MyTollHomePageActions.ProvidepasswordErrorMsg, "Please provide password.");
		PageBase.verifyTextExist(MyTollHomePageActions.memerobleQuesDropdownErrorMsg, "Memorable question not selected. please try again.");
		PageBase.verifyTextExist(MyTollHomePageActions.memerobleAnsweErrorMsgr, "The memorable answer must be at least 4 characters in length. Please try again.");	
		Reporter.log("---------------END OF TEST---------------");
	}
	
	////checking the specifications of the password and not changing it from the changepassword button in about me section
	@Test
	public void EnteringSecuritypassword() throws Exception {
		//User Changes Memorable Question
		Reporter.log("User checks the password and memorable question specifications shile registering");
		
		PageBase.click(MyTollHomePageActions.register, 10);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.click(MyTollHomePageActions.existingTollNo, 5);
		
		
		PageBase.sendText(MyTollHomePageActions.firstName, 10, "test");
		PageBase.sendText(MyTollHomePageActions.lastName, 10, "ing");
		PageBase.sendText(MyTollHomePageActions.newEmailAddress, 10, "Test520@mailinator.com");
		PageBase.sendText(MyTollHomePageActions.confirmEmailAddress, 10, "Test520@mailinator.com");
		
		//PageBase.click(MyTollHomePageActions.newPassword, 10);
		//PageBase.click(MyTollHomePageActions.memerobleQuesDropdown, 10);
	//	PageBase.click(MyTollHomePageActions.memerobleAnswer, 10);
		//PageBase.click(MyTollHomePageActions.newPassword, 10);
				
		
		//verify that the password doesn't contain the email address
		PageBase.sendText(MyTollHomePageActions.newPassword, 2, "Test520@");
		PageBase.sendText(MyTollHomePageActions.confirmPassword, 2, "Test520@");
		PageBase.verifyTextExist(MyTollHomePageActions.ProvidepasswordErrorMsg,
				"You have entered an incorrect password. Please try again.");
		
		
		//verify that the password has to be at least 4 characters
		PageBase.FindElement(MyTollHomePageActions.newPassword).clear();
		PageBase.FindElement(MyTollHomePageActions.confirmPassword).clear();
		PageBase.sendText(MyTollHomePageActions.newPassword, 2, "Tol");
		PageBase.sendText(MyTollHomePageActions.confirmPassword, 2, "Tol");
		PageBase.verifyTextExist(MyTollHomePageActions.ProvidepasswordErrorMsg,
				"You have entered an incorrect password. Please try again.");
		
		
		//verify that the password must have an upper-case Character
		PageBase.FindElement(MyTollHomePageActions.newPassword).clear();
		PageBase.FindElement(MyTollHomePageActions.confirmPassword).clear();
		PageBase.sendText(MyTollHomePageActions.newPassword, 2, "toll@12345");
		PageBase.sendText(MyTollHomePageActions.confirmPassword, 2, "toll@12345");
		PageBase.verifyTextExist(MyTollHomePageActions.ProvidepasswordErrorMsg,
				"You have entered an incorrect password. Please try again.");
		
		
		//verify that the password must have lower-case Character
		PageBase.FindElement(MyTollHomePageActions.newPassword).clear();
		PageBase.FindElement(MyTollHomePageActions.confirmPassword).clear();
		PageBase.sendText(MyTollHomePageActions.newPassword, 2, "TOLL@12345");
		PageBase.sendText(MyTollHomePageActions.confirmPassword, 2, "TOLL@12345");
		PageBase.verifyTextExist(MyTollHomePageActions.ProvidepasswordErrorMsg,
				"You have entered an incorrect password. Please try again.");
		
		
		
		//verify that the password and confirm password are same
		PageBase.FindElement(MyTollHomePageActions.newPassword).clear();
		PageBase.FindElement(MyTollHomePageActions.confirmPassword).clear();
		PageBase.sendText(MyTollHomePageActions.newPassword, 2, "Toll@12345");
		PageBase.sendText(MyTollHomePageActions.confirmPassword, 2, "Toll@1245");
		PageBase.click(MyTollHomePageActions.newPassword, 2);
		PageBase.verifyTextExist(MyTollHomePageActions.confirmationPasswordError,
				"Confirmation password does not match. Please try again.");


	//confirm the memorable question's answer specifications//

		PageBase.click(MyTollHomePageActions.memerobleQuesDropdown, 10);
		PageBase.click(MyTollHomePageActions.memerobleQuesOption, 10);
		//verify that the answer should be minimum 4 characters
		PageBase.sendText(MyTollHomePageActions.memerobleAnswer, 2, "123");
		PageBase.click(MyTollHomePageActions.newPassword, 2);
		PageBase.verifyTextExist(MyTollHomePageActions.memerobleAnswererror,
				"The memorable answer must be at least 4 characters in length. Please try again.");
	
		//verify that the answer dows not contain a part from email address
		PageBase.FindElement(MyTollHomePageActions.memerobleAnswer).clear();
		PageBase.sendText(MyTollHomePageActions.memerobleAnswer, 2, "Test520@mailinator.com");
		PageBase.click(MyTollHomePageActions.newPassword, 2);
		PageBase.verifyTextExist(MyTollHomePageActions.memerobleAnswererror,
				"The security question answer is too weak, answer must not be part of the question");
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
		System.out.println("End of test 1");
	}
		
	////checking the specifications of the security question and changing it
	@Test
	public void ChangeSecurityQuestion() throws Exception {
		//User Changes Memorable Question
		Reporter.log("User Changes Memorable Question");
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		//PageBase.click(MyTollHomePageActions.login, 5);
		PageBase.MaximumWaitForElementEnabled();
		//PageBase.moveToElement(MyTollHomePageActions.HmbugerMenu);
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to About Me Page");
		PageBase.click(MyTollHomePageActions.aboutMeMenu, 10);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(MyTollHomePageActions.changeMemorableQuestionBtn, 5);
		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(MyTollHomePageActions.securityQuestionDropdown, 5);
		PageBase.click(MyTollHomePageActions.securityQuestionDropdownoptions, 5);
		
		PageBase.sendText(MyTollHomePageActions.securityQuestionAnswer, 5, BaseWebdriver.Username2);
		PageBase.verifyTextExist(MyTollHomePageActions.securityQuestionErrorMsg,
				"The security question answer is too weak, answer must not be part of the question");
		PageBase.MaximumWaitForElementEnabled();
		PageBase.sendText(MyTollHomePageActions.securityQuestionAnswer, 5, "123");
		PageBase.verifyTextExist(MyTollHomePageActions.securityQuestionErrorMsg,
				"The memorable answer must be at least 4 characters in length. please try again.");
		PageBase.MaximumWaitForElementEnabled();
		PageBase.sendText(MyTollHomePageActions.securityQuestionAnswer, 5, "Test123");
		PageBase.click(MyTollHomePageActions.securityQuestionSave, 5);
		PageBase.verifyTextExist(MyTollHomePageActions.securityQuestionSaveMsgPopup, "Memorable question has been changed");
		PageBase.click(MyTollHomePageActions.securityQuestion, 5);	
		

		
		Reporter.log("---------------END OF TEST---------------");
	}

	////checking the specifications of the password and not changing it from the change_password button in about me section
	@Test
	public void ChangeSecuritypassword() throws Exception {
		//User Changes Memorable Question
		Reporter.log("User checks the password specifications");
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		PageBase.MaximumWaitForElementEnabled();
		MyTollHomePageActions.ClickMenu();
		Reporter.log("User Navigates to About Me Page");
		PageBase.click(MyTollHomePageActions.aboutMeMenu, 10);
		PageBase.MaximumWaitForElementEnabled_1();
			
		
		
		//verify that the password has a special character
		PageBase.click(MyTollHomePageActions.changePasswordButton, 5);
		PageBase.sendText(MyTollHomePageActions.changePasswordOldPasswordTextbox, 2, BaseWebdriver.Password);
		PageBase.sendText(MyTollHomePageActions.changePasswordNewPasswordTextbox, 2, "Toll1234");
		PageBase.sendText(MyTollHomePageActions.changePasswordConfirmPasswordTextbox, 2, "Toll1234");
		PageBase.verifyTextExist(MyTollHomePageActions.changePasswordErrorMsg,
				"You have entered an invalid password. please try again.");
				
		//verify that the password has to be at least 4 characters
		PageBase.sendText(MyTollHomePageActions.changePasswordNewPasswordTextbox, 2, "Tol");
		PageBase.sendText(MyTollHomePageActions.changePasswordConfirmPasswordTextbox, 2, "Tol");
		PageBase.verifyTextExist(MyTollHomePageActions.changePasswordErrorMsg,
				"You have entered an invalid password. please try again.");
		
		//verify that the password must have an upper-case Character
		PageBase.sendText(MyTollHomePageActions.changePasswordNewPasswordTextbox, 2, "toll@12345");
		PageBase.sendText(MyTollHomePageActions.changePasswordConfirmPasswordTextbox, 2, "toll@12345");
		PageBase.verifyTextExist(MyTollHomePageActions.changePasswordErrorMsg,
				"You have entered an invalid password. please try again.");
		
		//verify that the password must have a lower-case Character
		PageBase.sendText(MyTollHomePageActions.changePasswordNewPasswordTextbox, 2, "TOLL@12345");
		PageBase.sendText(MyTollHomePageActions.changePasswordConfirmPasswordTextbox, 2, "TOLL@12345");
		PageBase.verifyTextExist(MyTollHomePageActions.changePasswordErrorMsg,
				"You have entered an invalid password. please try again.");
		
		//verify that the password must not contains parts of the email address
				PageBase.sendText(MyTollHomePageActions.changePasswordNewPasswordTextbox, 2, "auto_bvt_ppd");
				PageBase.sendText(MyTollHomePageActions.changePasswordConfirmPasswordTextbox, 2, "auto_bvt_ppd");
				PageBase.verifyTextExist(MyTollHomePageActions.changePasswordErrorMsg,
						"You have entered an invalid password. please try again.");			
		
		//verify that the new password and the confirm password are same
		PageBase.sendText(MyTollHomePageActions.changePasswordNewPasswordTextbox, 2, "Tol");
		PageBase.sendText(MyTollHomePageActions.changePasswordConfirmPasswordTextbox, 2, "Tok");
		PageBase.click(MyTollHomePageActions.changePasswordOldPasswordTextbox, 2);
		PageBase.verifyTextExist(MyTollHomePageActions.changePasswordErrorMsg,
				"You have entered an invalid password. please try again.");
		PageBase.verifyTextExist(MyTollHomePageActions.changePasswordErrorMsg2,
				"Confirmation password does not match. please try again.");
		
	}
	
	@AfterMethod
	public void RunTearDown() throws Exception {
	//	BaseWebdriver.tearDown();

	}
}
