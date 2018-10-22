package seleniumtests.generictests;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basewebdriver.BaseWebdriver;
import mytollhomepage.MyTollHomePageActions;
import mycontacts.myContactsActions;


public class ContactsUpload 
{
	//Relative paths for Contacts workbook. Contacts(2) has 7789 contacts and Contacts(3) has 1 contact stored in them
	String ContactsBook2 = "src\\test\\Testdata\\Contacts(2).xlsx";
	String ContactsBook3 = "src\\test\\Testdata\\Contacts(3).xlsx";
	
	@BeforeMethod
public void beforeMethod() throws Exception
{
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.SitUsername3, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickMyContacts();	
}
  @Test
public void UploadContactsFile() throws AWTException, InterruptedException
{
	  myContactsActions.NavigateToManageContactsTab();
	  myContactsActions.UploadFile(ContactsBook2);//pass the file URL here.
	  myContactsActions.AssertFileUpload();
	  
	  //Reset Contact to 1 file
	  myContactsActions.UploadFile(ContactsBook3);//pass the file URL here.
	  myContactsActions.AssertFileUpload();
	  
}
  
  @Test
  public void DownloadContactsFile()
  {
	  myContactsActions.NavigateToManageContactsTab();
	  myContactsActions.DownloadContacts();
  }
  

  @AfterMethod
public void afterMethod() throws Exception 
  {
	  BaseWebdriver.tearDown();
  }

}
