package mycontacts;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.*;

import java.nio.file.FileSystems;


import org.openqa.selenium.By;
import org.testng.Assert;



import global.PageBase;
import baseWebdriver.BaseWebdriver;

public class myContactsActions 
{
	public static By UploadFile = By.id("upload-address-btn");
	public static By DownloadContacts_btn = By.xpath("//*[@id=\"manage-address-tab-placeholder\"]//a[contains(text(),'Download')]");
	public static By ManageContactsTab = By.xpath("//section[@id=\"portlet_mytolladdressbookportlet_WAR_mytollupsportlet\"]"
											+ "//a[text()='Manage contacts']");
	
	public static By FileAddress = By.id("addressFile");
	public static By UploadedFileNameHolder= By.xpath("//*[@id=\"upload-address-success-placeholder\"]//div//h3[@class='filename']");
	public static By UploadValidationMessageHolder = By.xpath("//div[@id=\"upload-address-success-placeholder\"]//div[@class='success-list-ind']/h3");
	private static String UpdateValidationMessage;
	private static String UploadedFileName;
	
	
	
	public static void UploadFile(String _fileLocation) throws AWTException, InterruptedException
	{
		String filePath;
		PageBase.click(FileAddress, 20);
		filePath = FileSystems.getDefault().getPath(_fileLocation).normalize().toAbsolutePath().toString();
			//System.out.println(filePath);
		
		PageBase.CopyToClipboard(filePath);
		PageBase.PasteFromClipboard(filePath);
		PageBase.FindElement(UploadFile).click();
	}
	
	public static void NavigateToManageContactsTab()
	{
		PageBase.FindElement(ManageContactsTab).click();
	}
	
	public static void AssertFileUpload()
	{
		UploadedFileName = PageBase.FindElement(UploadedFileNameHolder).getText();
		UpdateValidationMessage = PageBase.FindElement(UploadValidationMessageHolder).getText();
		if(UploadedFileName.equals("Contacts(3).xlsx"))
		{
			assertTrue(UpdateValidationMessage.equalsIgnoreCase("1 contact validated"), "Validation Failed for Contacts3.xlsx");
			//System.out.println("Contacts 3 passed assertion");
		}
		else if(UploadedFileName.equals("Contacts(2).xlsx"))
		{
			assertTrue(UpdateValidationMessage.equalsIgnoreCase("7789 contacts validated"), "Validation Failed for Contacts2.xlsx");
			//System.out.println("Contacts 2 passed assertion");
		}
		
		
	}
	
	public static void DownloadContacts()
	{
		PageBase.click(DownloadContacts_btn, 1);
		//VerifyFileDownloaded();
	}
	
	public static void VerifyFileDownloaded()
	{
		String home = System.getProperty("user.home");
		String downloadsPath = home+"\\Downloads";
		BaseWebdriver.driver.navigate().to(downloadsPath);
		try
		{
			Thread.sleep(3000);
			BaseWebdriver.driver.findElement(By.linkText("Contacts.xlsx"));
			Assert.assertTrue(true);
		}
		catch(Exception e)
		{
			e.getMessage();
			Assert.assertTrue(false);
		}
		
		try
		{
			File file = new File(downloadsPath+"\\Contacts.xlsx");
			file.delete();
			System.out.println("File deleted");
		}
		catch(Exception e)
		{
			e.getMessage();
			System.out.println("Contacts not deleted");
		}
		
	}
}
