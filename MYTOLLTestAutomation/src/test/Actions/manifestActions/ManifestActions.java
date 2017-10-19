package manifestActions;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.openqa.selenium.By;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;
import createShipmentActions.ShipmentReviewActions;

public class ManifestActions {

		
	public static By manifestHeading = By.xpath(
			"//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet\"]/div/div/div/div/header/div/div/h1");
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
	public static By AddManifestBtn = By.xpath("//a[@id='add-manifest']");//*[@id="manifest-cons-popup-wrpr"]/div/div/section/div/div[1]/div/div[2]/input

	// Add to manifest
	public static By AddToManifestTtile = By.xpath("//h2[text()='Add to Manifest']");
	public static By AddToExistingManifestBtn = By
			.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[2]/input");
	public static By AddToManifestRadioBtn = By
			.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[1]/ul/li[2]/div/label"); 
	public static By AddToManifestFirstManifestName = By
			.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[1]/div/div[1]/ul/li[1]/div/label"); 
	public static By NewManifestName = By.id("newManifestName");
	public static By CreateNewManifestBtn = By
			.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/section/div/div[2]/div/div[2]/input"); 
	public static By CloseAddToManifest = By
			.xpath("//*[@id=\"manifest-cons-popup-wrpr\"]/div/div/a/i");
	
	
	public static void VerifyManifestDetails(String pStatus, String pSenderLocation, String pTollCarrier,
			String pReceiver, String pReceiverLocation, String pService, String pNoOfItems, String pWeight,
			String pOpenArrowdown, String pItemTemplate, String pNoOfItemsLine1, String pTotalWeight, String pMisc,
			String pLWH, String pTotalVolume, String pReference1, String pReference2) {

		assertEquals(pStatus, BaseWebdriver.driver.findElement(status).getText());
		// assertEquals(pDispatchDate,BaseWebdriver.driver.findElement(dispatchDate).getText());
		assertEquals(pSenderLocation, BaseWebdriver.driver.findElement(senderLocation).getText());
		assertEquals(pTollCarrier, BaseWebdriver.driver.findElement(tollCarrier).getText());
		assertEquals(pReceiver, BaseWebdriver.driver.findElement(receiver).getText());
		assertEquals(pReceiverLocation, BaseWebdriver.driver.findElement(receiverLocation).getText());
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
		if (results = true) {
			AddToManifestForExistingAnManiestSubmittingCreateshipment();
			MoveToManifestAndCreateNewManifest(pNewManifestName);
			//ShipmentReviewActions.ClickContinue();


		}
		}
		
	catch (Exception ex)
		{
			ShipmentReviewActions.ClickAddToManifestManually();
		}
	}

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
	}

	public static void AddToNewManifestSystemGeneratedManifestSubmittingCreateshipment() {
		PageBase.MinimumWaitForElementEnabled();
		ManifestActions.ClickAddtoExistingManifestRadionBtn();
		PageBase.MinimumWaitForElementEnabled();
		ManifestActions.ClickAddManifest();
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
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(newRadioBtn).click();
		BaseWebdriver.driver.findElement(newManifestTextField).click();
		BaseWebdriver.driver.findElement(newManifestTextField).clear();
		BaseWebdriver.driver.findElement(newManifestTextField).sendKeys(pManifestName);
		ClickAddManifest();

	}

	public static void ClickAddManifest() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AddManifestBtn).click();

	}

	public static void ClickAddtoExistingManifest() {
		PageBase.MinimumWaitForElementEnabled();
		BaseWebdriver.driver.findElement(AddToExistingManifestBtn).click();

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

}
