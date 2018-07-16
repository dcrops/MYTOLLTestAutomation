package myContactsActions;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.nio.file.FileSystems;


import org.openqa.selenium.By;


import GlobalActions.PageBase;

public class myContactsActions 
{
	public static By UploadFile = By.id("upload-address-btn");
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
		PageBase.FindElement(FileAddress).click();
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
}
