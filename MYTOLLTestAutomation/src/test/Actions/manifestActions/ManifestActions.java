package manifestActions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;
import createShipmentActions.CreateShipmentActions;
import createShipmentActions.ShipmentReviewActions;
import rateEnquiryActions.RateEnquiryActions;

public class ManifestActions {

		
	public static By manifestHeading = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet\"]//*//header/div/div/h1");
	public static By status = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[1]/ul/li[2]/div[2]/p");
	public static By dispatchDate = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[1]/ul/li[1]/div[3]/h3");
	public static By senderLocation = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[1]/ul/li[2]/div[4]/p");
	public static By tollCarrier = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[1]/ul/li[2]/div[5]/p");
	public static By receiver = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[3]/p");
	public static By receiverLocation = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[4]/p");
	public static By service = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[5]/p");
	public static By NoOfItems = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[6]/p");
	public static By weight = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[7]/p");
	public static By volume = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[4]/p");
	public static By openArrowdown = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[10]/p/i");
	public static By ItemTemplate = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[2]/p");
	public static By NoOfItemsLine1 = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[4]/p");
	public static By TotalWeight = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[5]/p");
	public static By misc = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[8]/p");
	public static By LWH = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[6]/p");
	public static By TotalVolume = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[7]/p");
	public static By reference1 = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[9]/p");
	public static By reference2 = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[10]/p");
	public static By addNewShipmentBtn = By.xpath("//a[text()='Add New Shipment']");
	public static By lables = By.id("line-label-name");
	public static By shipments = By.id("line-ship-name");
	public static By move = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/div/ul/li[3]/a/i");

	// New manifest
	public static By newRadioBtn = By.id("new-radio");
	public static By newManifestTextField = By.id("new-manifest-name");
	public static By AddManifestBtn = By.xpath("//a[@id='add-manifest']");
	public static By CloseBtnManifestScreen = By.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/a/i");
	
	// Add to manifest
	public static By AddToManifestTtile = By.xpath("//h2[text()='Add to Manifest']");
	public static By AddToExistingManifestBtn =By.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[2]/input"); // By.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]//h3[text()='Add to existing manifest']/div[2]/button[value()='Add to Manifest']"); //div[@class='manifest-btn-wrap'and value='Add to Manifest']");
			//.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[2]/input"); 
	public static By AddToManifestRadioBtn = By
			.xpath("//*[@id=\\\"manifest-cons-popup-wrpr\\\"]/div/div/section/div/div[1]/div/div[1]/ul/li[2]/div/label");
	public static By AddToManifestFirstManifestName = By
			.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[1]/ul/li[1]/div/label"); 
	public static By NewManifestName = By.id("newManifestName");
	public static By CreateNewManifestBtn = By
			.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[2]/div/div[2]/input"); 
	public static By CloseAddToManifest = By.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/a/i");
	public static By SelectManifestTextField = By.id("saved-manifest-name");
	
	//add Manifest Manually
	public static By MyManifestTab = By.id("manifestTabAnchor");
	public static By AddManifestManuallyButton = By.xpath("//*[@id=\"manifestHasMoreDiv\"]/button[text()='+ MANUAL MANIFEST']");
	public static By ManifestViewMore = By.xpath("//*[@id=\"manifestHasMoreButton\"]");
	public static By ManualManifestName = By.id("manifest-name");
	public static By ManualManifestSave = By.id("save-manifest");
	public static By AddNewShipment = By.linkText("ADD NEW SHIPMENT");
	public static By TollCarier = By.xpath("//*[@id=\"carrier-name\"]");
	
	public static final By ContinuetoManifest = By.xpath("//*[@id=\"shipment-placeholder\"]//*//a[text()=\"continue\"]");
	
	public static ArrayList shipmentNumbers = new ArrayList();
	public static By PrintCloseManifest = By.linkText("PRINT & CLOSE MANIFEST");
	public static By ShipmentManifestTab = By.xpath("//*[@id=\"print-mani-popup\"]//*//section/ul/li/a[@title=\"Shipment\"]");
	public static By LabelTab = By.xpath("//*[@id=\"print-mani-popup\"]//*//section/ul/li/a[@title=\"Labels\"]");
	public static By ShipmentDownloadPDF = By.xpath("//*[@id=\"manifest-ship-download-btn\"]");
	public static By manifestLabelDownloadPDF = By.xpath("//*[@id=\"manifest-label-download-btn\"]");
	public static By ShipmentManifestPopupClose = By.xpath("//*[@id=\"print-mani-popup\"]/div/div/a/i");
	public static By ShipmentManifestID = By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet\"]//*//ul/li[2]/div[1]/p");
	public static By ShipmentManifestStatus = By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet\"]//*//ul/li[2]/div[2]/p");
	public static By ShipmentManifestTotalNo = By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet\"]/div/div/div/div/div[1]/div[2]/ul/li");
	public static By ShipmentNo =By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet\"]//*//ul[@class=\"shipments-list\"]/li[2]//*//a");
	public static By GoToDashboard = By.linkText("GO TO DASHBOARD");	
	public static By RePrint = By.linkText("REPRINT");
	public static By RePrintLableCheckBox = By.xpath("//*[@id=\"shipment-check\"]");
	public static By RePrintShipmentCheckBox = By.xpath("//*[@id=\"cb-header-ship\"]");
	
	
	public static void VerifyManifestDetails(String pStatus, String pSenderLocation, String pTollCarrier,
			String pReceiver, String pReceiverLocation, String pService, String pNoOfItems, String pWeight,
			String pOpenArrowdown, String pItemTemplate, String pNoOfItemsLine1, String pTotalWeight, String pMisc,
			String pLWH, String pTotalVolume, String pReference1, String pReference2) {

		assertEquals(pStatus, BaseWebdriver.driver.findElement(status).getText());
		// assertEquals(pDispatchDate,BaseWebdriver.driver.findElement(dispatchDate).getText());
		assertEquals(pSenderLocation, BaseWebdriver.driver.findElement(senderLocation).getText());
		assertEquals(pTollCarrier, BaseWebdriver.driver.findElement(tollCarrier).getText());
		assertEquals(pReceiver, BaseWebdriver.driver.findElement(receiver).getText());
		//assertEquals(pReceiverLocation, BaseWebdriver.driver.findElement(receiverLocation).getText());
		assertEquals(pService, BaseWebdriver.driver.findElement(service).getText());
		assertEquals(pNoOfItems, BaseWebdriver.driver.findElement(NoOfItems).getText());
		assertEquals(pWeight, BaseWebdriver.driver.findElement(weight).getText());
		assertEquals(pOpenArrowdown, BaseWebdriver.driver.findElement(openArrowdown).getText());
		assertEquals(pItemTemplate, BaseWebdriver.driver.findElement(ItemTemplate).getText());
		assertEquals(pNoOfItemsLine1, BaseWebdriver.driver.findElement(NoOfItemsLine1).getText());
		assertEquals(pTotalWeight, BaseWebdriver.driver.findElement(TotalWeight).getText());
		assertEquals(pMisc, BaseWebdriver.driver.findElement(misc).getText());
		assertEquals(pLWH, BaseWebdriver.driver.findElement(LWH).getText());
		assertEquals(pTotalVolume, BaseWebdriver.driver.findElement(TotalVolume).getText());
		assertEquals(pReference1, BaseWebdriver.driver.findElement(reference1).getText());
		assertEquals(pReference2, BaseWebdriver.driver.findElement(reference2).getText());

	}
	
	public static void VerifyManifestName(String pManifestName) {
		PageBase.MinimumWaitForElementEnabled();
		assertEquals(pManifestName, GetManifestNameFromManifestReviewPage().toString());
	}

	// Modules
	
	
	public static String RandomManifestName(String pManifestName) {

		String NewManifestName=pManifestName+(new Date()).getTime();
		return NewManifestName;
	}
	
	public static void AcceptAddToManifestToForAnExistingManifestSubmittingCreateshipment(String pNewManifestName) {
		PageBase.MinimumWaitForElementEnabled();
	try {
		boolean results = BaseWebdriver.driver.findElement(AddToManifestTtile).isDisplayed();
		System.out.println("AddToManifestTtile results" + results);
		if (results = true) {
			AddToManifestForExistingAnManiestSubmittingCreateshipment();

			ShipmentReviewActions.ClickAddToManifestManually();
			//ShipmentReviewActions.ClickContinue();
			ManifestActions.MoveToManifestAndCreateNewManifest(pNewManifestName);
			System.out.println(" NewManifestName passed ");
		}
	}
	catch(Exception ex)
	{
	

			ShipmentReviewActions.ClickAddToManifestManually();

			System.out.println("ClickAddToManifestManually");
			ManifestActions.MoveToManifestAndCreateNewManifest(pNewManifestName);
			System.out.println(" NewManifestName passed ");
		
		
	}
		
		
	
	}

	/*public static void AcceptAddToManifestToForAnExistingManifestSubmittingCreateshipment(String pNewManifestName) {
		PageBase.MinimumWaitForElementEnabled();
		try {
		boolean results = BaseWebdriver.driver.findElement(AddToManifestTtile).isDisplayed();
		if (results == true) {
			AddToManifestForExistingAnManiestSubmittingCreateshipment();
			//MoveToManifestAndCreateNewManifest(pNewManifestName);
			//ShipmentReviewActions.ClickContinue();


		}
		}
		
	catch (Exception ex)
		{
			ShipmentReviewActions.ClickAddToManifestManually();

			System.out.println("ClickAddToManifestManually");
		}
	}*/

	public static void AcceptAddToManifestSystemGeneratedManifestSubmittingCreateshipment(String pNewManifestName) {
		PageBase.MinimumWaitForElementEnabled();
		try {
		boolean results = BaseWebdriver.driver.findElement(AddToManifestTtile).isDisplayed();
		if (results = true) {
			AddToNewManifestSystemGeneratedManifestSubmittingCreateshipment();
			//ShipmentReviewActions.ClickContinue();


		}
		}
		
		catch (Exception ex)
		{
			ShipmentReviewActions.ClickAddToManifestManually();
			MoveToManifestAndCreateNewManifest(pNewManifestName);
		}
	}
	

	
	public static void AcceptAddToManifestCreatingNewManifestSubmittingCreateshipment(String pNewManifestName) {
		PageBase.MinimumWaitForElementEnabled();
		try {
		boolean results = BaseWebdriver.driver.findElement(AddToManifestTtile).isDisplayed();
		if (results = true) {
			AddToExistingManifestSubmittingCreateshipment(pNewManifestName);
			//ShipmentReviewActions.ClickContinue();


		}
		}
		
		catch (Exception ex)
		{
			ShipmentReviewActions.ClickAddToManifestManually();
			MoveToManifestAndCreateNewManifest(pNewManifestName);
		}
	}

	public static void AddToManifestForExistingAnManiestSubmittingCreateshipment() {
		PageBase.MinimumWaitForElementEnabled();
		ManifestActions.ClickAddtoExistingManifest(); // Checkbox already selected
		System.out.println("ClickAddtoExistingManifest ");
	}

	public static String AddToNewManifestSystemGeneratedManifestSubmittingCreateshipment() {
		PageBase.Scrollbar(0, 250);
		System.out.println("scroll successful ");
		PageBase.MinimumWaitForElementEnabled();
		List<WebElement> eles=BaseWebdriver.driver.findElements(By.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[1]/ul/li"));
		int listSize=eles.size();
		System.out.println("listSize" +listSize);
		PageBase.MinimumWaitForElementEnabled();
		PageBase.MoveToElement(By.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[1]/ul/li["+listSize+"]/div/label"), ManifestActions.AddToManifestTtile);
		boolean results=BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[1]/ul/li["+listSize+"]/div/label")).isDisplayed();
		System.out.println("results listelement" +results);
		PageBase.MaximumWaitForElementEnabled();
		String manifestnameBySys=BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[1]/ul/li["+listSize+"]/div/label")).getText();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[1]/ul/li["+listSize+"]/div/label")).click();
		return manifestnameBySys ;
		
	}

	public static void AddToExistingManifestSubmittingCreateshipment(String pNewManifestName) {
		PageBase.MinimumWaitForElementEnabled();
		ManifestActions.CreateNewManifestSubmittingCreateshipment(pNewManifestName);
		ManifestActions.ClickCreateManifestBtn();
	}

	// Individual methods
	
	public static String GetManifestNameFromAddToManifest() {
		PageBase.MaximumWaitForElementEnabled();
		return BaseWebdriver.driver.findElement(AddToManifestFirstManifestName).getText();
	}
	
	public static String GetManifestNameFromManifestReviewPage() {
		PageBase.MinimumWaitForElementEnabled();
		return BaseWebdriver.driver.findElement(manifestHeading).getText();
	}
	
	public static void CreateNewManifestFromAddToManifestMannually(String pNewManifestName) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(NewManifestName).click();
		BaseWebdriver.driver.findElement(NewManifestName).clear();
		BaseWebdriver.driver.findElement(NewManifestName).sendKeys(pNewManifestName);

	}

	
	public static void MoveToManifestAndCreateNewManifest(String pManifestName) {
		PageBase.Scrollbar(250, 500);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(newRadioBtn).click();
		BaseWebdriver.driver.findElement(newManifestTextField).click();
		BaseWebdriver.driver.findElement(newManifestTextField).clear();
		BaseWebdriver.driver.findElement(newManifestTextField).sendKeys(pManifestName);
		ClickAddManifest();
		//ClickAddtoExistingManifest();

	}
	
	public static String MoveToManifestAndSaveManifest() {
		PageBase.Scrollbar(250, 500);
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(SelectManifestTextField).click();
		BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"move-manifest-selector\"]/div[2]/ul/li[1]/div")).click();
		PageBase.MediumWaitForElementEnabled();
		return BaseWebdriver.driver.findElement(SelectManifestTextField).getAttribute("value");
		
	}
	
	

	public static void ClickAddManifest() {
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AddManifestBtn).click();

	}

	public static void ClickAddtoExistingManifest() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AddToExistingManifestBtn).click();
		System.out.println("AddToExistingManifestBtn");
	}

	public static void ClickAddtoExistingManifestRadionBtn() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AddToManifestRadioBtn).click();

	}

	public static void CreateNewManifestSubmittingCreateshipment(String pNewManifestName) {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(NewManifestName).click();
		BaseWebdriver.driver.findElement(NewManifestName).clear();
		BaseWebdriver.driver.findElement(NewManifestName).sendKeys(pNewManifestName);

	}

	public static void ClickCreateManifestBtn() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(CreateNewManifestBtn).click();

	}
	
	public static void CloseAddToManifestAndAddManifestManually() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(CloseAddToManifest).click();
		
	}
	
	public static void ClickAddNewShipmentBtn() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(addNewShipmentBtn).click();

	}
	
	public static void addManifestManually() {
		Reporter.log("User Navigates to Manifest Tab and Selects Add Manifest Manually");
		PageBase.waitForElement(MyManifestTab, 5);
		PageBase.click(MyManifestTab, 2);
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.click(AddManifestManuallyButton, 2);	
	}
	
	
	
	public static void CloseManifestScreen() {
		BaseWebdriver.driver.findElement(CloseBtnManifestScreen).click();
		
	}

	public static void submitandPrintManifest() {
		//Retiving shipment details, printing and completing
		String ManifestID = BaseWebdriver.driver.findElement(ShipmentManifestID).getText();
		System.out.println("Manifest ID : "+ManifestID);
		Reporter.log("Manifest ID : "+ManifestID);
		String CurrentStatus = BaseWebdriver.driver.findElement(ShipmentManifestStatus).getText();
		System.out.println("Current Manifest Status : "+CurrentStatus);
		Reporter.log("Current Status : "+CurrentStatus);
		
		//Get Shipment Number
		List <WebElement> shipment = BaseWebdriver.driver.findElements(ShipmentManifestTotalNo);
		int noOfShipments = shipment.size() - 2;
		System.out.println("No if Shipments in Manifest = " + noOfShipments);
		Reporter.log("No if Shipments in Manifest = " + noOfShipments);
	    String ShipmentID = BaseWebdriver.driver.findElement(ShipmentNo).getText();
	    System.out.println("Shipment ID : "+ShipmentID);
	    Reporter.log("Shipment ID : "+ShipmentID);
	    shipmentNumbers.add(ShipmentID);
	    System.out.println("Shipment Array : "+shipmentNumbers);
	    Reporter.log("Shipment Array : "+shipmentNumbers);
		
	    //Print and Close Manifest
	    Reporter.log("User Clicks Print and Close Manifest");
		PageBase.moveToElement(PrintCloseManifest);
		PageBase.click(PrintCloseManifest, 2);
		
		//Label Tab
		PageBase.waitForElement(LabelTab, 2);
		PageBase.click(LabelTab, 2);
		Reporter.log("User Select Download PDF from Label Tab");
		PageBase.click(manifestLabelDownloadPDF, 2);
		System.out.println("Downloading PDF instead of Printing, Content of PDF not CHECKED");
		
		//Shipment & Manifest Tab
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(ShipmentManifestTab, 2);
		PageBase.moveToElement(ShipmentManifestTab);
		PageBase.click(ShipmentManifestTab, 2);
		Reporter.log("User Select Download PDF from Shipment/Manifest Tab");
		PageBase.click(ShipmentDownloadPDF, 2);
		System.out.println("Downloading PDF instead of Printing, Content of PDF not CHECKED");
		
		//Close Pop Up
		PageBase.MaximumWaitForElementEnabled_1();
		Reporter.log("User Closes Popup to verify Manifest Status");
		PageBase.waitForElement(ShipmentManifestPopupClose, 2);
		PageBase.click(ShipmentManifestPopupClose, 2);
		PageBase.MaximumWaitForElementEnabled_1();
		
		//Get Current Status of Manifest
		String UpdatedStatus = BaseWebdriver.driver.findElement(ShipmentManifestStatus).getText();
		if ("Completed".equals(UpdatedStatus)) {
			System.out.println("Updated Manifest Status : "+UpdatedStatus);
			Reporter.log("Updated Manifest Status : "+UpdatedStatus);
		}
		else {
			System.out.println("FAILED : Manifest Satus was not updated. Manifest was not submitted properly");
			Reporter.log("FAILED : Manifest Satus was not updated. Manifest was not submitted properly");
			Assert.fail("FAILED : Manifest Satus was not updated. Manifest was not submitted properly");
		}
		
	}
	
	public static void manifestToBookaPickUp (String ManifestName) {
		//Move to Manifest Tab
		PageBase.waitForElement(MyManifestTab, 5);
		PageBase.click(MyManifestTab, 2);
		Reporter.log("User Searches for the Manifest -"+ManifestName);
		//Search for Manifest and Click Book A Pickup
		while(PageBase.waitForElement(By.xpath("//*[@id=\"manifestDataTbody\"]/tr/td[contains(text(),'"+ManifestName+"')]"), 1) == null) {
			PageBase.click(ManifestActions.ManifestViewMore, 5);
		}
		
		String Status = BaseWebdriver.driver.findElement(By.xpath("//*[@id=\"manifestDataTbody\"]/tr/td[contains(text(),'"+ManifestName+"')]/following::td[7]/a")).getText();
		
		if ("Book a Pickup".equals(Status)) {
			System.out.println("Manifes Status on DashBoard = '" +Status+ "' - Proceed to Book A Pick Up");	
			Reporter.log("Manifes Status on DashBoard = '" +Status+ "' - Proceed to Book A Pick Up");	
			PageBase.click(By.xpath("//*[@id=\"manifestDataTbody\"]/tr/td[contains(text(),'"+ManifestName+"')]/following::td[7]/a"), 5);
		}
		else {
			System.out.println("FAILED : Manifest Satus on Dahsboard = '"+Status+ "' Unable to proceed to Book A PickUp");
			Reporter.log("FAILED : Manifest Satus on Dahsboard = '"+Status+ "' Unable to proceed to Book A PickUp");
			Assert.fail("FAILED : Manifest Satus on Dahsboard = '"+Status+ "' Unable to proceed to Book A PickUp");
		}
	}
	
	public static void reprintManifest (String ManifestName) {
		PageBase.waitForElement(MyManifestTab, 5);
		PageBase.click(MyManifestTab, 2);
		Reporter.log("User Reprints Manifest -"+ManifestName);
		
		while(PageBase.waitForElement(By.xpath("//*[@id=\"manifestDataTbody\"]/tr/td[contains(text(),'"+ManifestName+"')]"), 1) == null) {
			PageBase.click(ManifestActions.ManifestViewMore, 5);
		}
		PageBase.click(By.xpath("//*[@id=\"manifestDataTbody\"]/tr/td[contains(text(),'"+ManifestName+"')]"), 5);
		
		PageBase.click(RePrint, 5);
		
		//Label Tab
		PageBase.waitForElement(LabelTab, 2);
		PageBase.click(LabelTab, 2);
		PageBase.click(RePrintLableCheckBox, 5);
		Reporter.log("Reprint: User Select Download PDF from Label Tab");
		PageBase.click(manifestLabelDownloadPDF, 2);
		System.out.println("Downloading PDF instead of Printing, Content of PDF not CHECKED");
		
		//Shipment & Manifest Tab
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(ShipmentManifestTab, 2);
		PageBase.moveToElement(ShipmentManifestTab);
		PageBase.click(ShipmentManifestTab, 2);
		PageBase.click(RePrintShipmentCheckBox, 5);
		Reporter.log("User Select Download PDF from Shipment/Manifest Tab");
		PageBase.click(ShipmentDownloadPDF, 2);
		System.out.println("Downloading PDF instead of Printing, Content of PDF not CHECKED");
		
		//Close Pop Up
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.waitForElement(ShipmentManifestPopupClose, 2);
		PageBase.click(ShipmentManifestPopupClose, 2);
	}
	
	
	public static void selectPickupDate() {
		Reporter.log("User Selects Pick Up Date as Tomorrow");
		PageBase.click(BookAPickupActions.pickupDate, 2);
		PageBase.click(BookAPickupActions.pickupDateTomorrow, 2);

	}
	
	public static void selectReadyTimeJS(String time) {
		Reporter.log("User Sets Ready Time as -"+time);
		((JavascriptExecutor)BaseWebdriver.driver).executeScript("document.getElementById('available-time').removeAttribute('readonly',0);");
        ((JavascriptExecutor)BaseWebdriver.driver).executeScript("document.getElementById('available-time').setAttribute('data-timepicki-time','"+time+"');");
		WebElement fromDateBox= BaseWebdriver.driver.findElement(BookAPickupActions.availableTime);
		fromDateBox.clear();
		PageBase.click(BookAPickupActions.decreaseReadyTime, 1);
		PageBase.click(BookAPickupActions.increaseAvailableTimeHours, 1);
		PageBase.verifyTextExistAttribute(BookAPickupActions.availableTime, time);	
	}
	
	public static void createManifestPopUp (String TollCarrier, int senderInder, String ManifestName) {
		RateEnquiryActions.EnterTollCarrier(TollCarrier);
		Reporter.log("User Selects Sender");
		CreateShipmentActions.SelectSender(senderInder);
		Reporter.log("User Enters ManifestName - '"+ManifestName+"'");
		PageBase.sendText(ManifestActions.ManualManifestName, 5, ManifestName);
		PageBase.click(ManifestActions.ManualManifestSave, 5);
		Reporter.log("User Saves Manifest and Proceeds");
		
	}
	
	
	public static void SelectShipmentConsolidated() {
		try {
		PageBase.MaximumWaitForElementEnabled_1();
		Boolean results=BaseWebdriver.driver.findElement(CreateShipmentActions.shipmentConsolidatedContinue).isDisplayed();
		if (results=true) {
			PageBase.click(CreateShipmentActions.shipmentConsolidatedContinue,2);
			}
		}
		
		catch(Exception ex) {
			System.out.println("No Shipments consolidate pop up msg");	
		}
		}
	
	public static void SelectBillingType(int i) {
		try {
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.click(CreateShipmentActions.billingTypedropdown,2);
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.click(By.xpath("//*[@id=\"billing-type-selector\"]/div[2]/ul/li[" + i + "]/div"),2);
		}
		catch(Exception ex){
			System.out.println("Billing Type Unavailable");	
		}

	}
	
}
