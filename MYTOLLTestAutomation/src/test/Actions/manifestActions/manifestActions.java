package manifestActions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import baseWebdriver.BaseWebdriver;

public class manifestActions {
	
	public static By status= By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[1]/ul/li[2]/div[2]/p");
	public static By dispatchDate=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[1]/ul/li[1]/div[3]/h3");
	public static By senderLocation=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[1]/ul/li[2]/div[4]/p");
	public static By tollCarrier=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[1]/ul/li[2]/div[5]/p");
	public static By receiver=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[3]/p");
	public static By receiverLocation=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[4]/p");
	public static By service=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[5]/p");
	public static By NoOfItems=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[6]/p");
	public static By weight=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[7]/p");
	public static By volume=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[4]/p");
	public static By openArrowdown=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[1]/div[10]/p/i");
	public static By ItemTemplate=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[2]/p");
	public static By NoOfItemsLine1=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[4]/p");
	public static By TotalWeight=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[5]/p");
	public static By misc=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[8]/p");
	public static By LWH=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[6]/p");
	public static By TotalVolume=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[7]/p");
	public static By reference1=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[9]/p");
	public static By reference2=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/ul/li[2]/div/div[10]/p");

	public static By lables=By.id("line-label-name");
	public static By shipments=By.id("line-ship-name"); 
	public static By move=By.xpath("//*[@id=\"portlet_shipmentportlet_WAR_mytollshipmentportlet10SNAPSHOT\"]/div/div/div/div/div[1]/div[2]/ul/li[2]/div[2]/div/ul/li[3]/a/i");
	
	
	public static void VerifyManifestDetails(String pStatus,String pDispatchDate,String pSenderLocation, String pTollCarrier, String pReceiver, String pReceiverLocation,
			String pService, String pNoOfItems, String pWeight,String pOpenArrowdown, String pItemTemplate, String pNoOfItemsLine1, String pTotalWeight, String pMisc, String pLWH,
			String pTotalVolume, String pReference1, String pReference2 ) {
		
		assertEquals(pStatus,BaseWebdriver.driver.findElement(status).getText());
		assertEquals(pDispatchDate,BaseWebdriver.driver.findElement(dispatchDate).getText());
		assertEquals(pSenderLocation,BaseWebdriver.driver.findElement(senderLocation).getText());
		assertEquals(pTollCarrier,BaseWebdriver.driver.findElement(tollCarrier).getText());
		assertEquals(pReceiver,BaseWebdriver.driver.findElement(receiver).getText());
		assertEquals(pReceiverLocation,BaseWebdriver.driver.findElement(receiverLocation).getText());
		assertEquals(pService,BaseWebdriver.driver.findElement(service).getText());
		assertEquals(pNoOfItems,BaseWebdriver.driver.findElement(NoOfItems).getText());
		assertEquals(pWeight,BaseWebdriver.driver.findElement(weight).getText());
		assertEquals(pOpenArrowdown,BaseWebdriver.driver.findElement(openArrowdown).getText());
		assertEquals(pItemTemplate,BaseWebdriver.driver.findElement(ItemTemplate).getText());
		assertEquals(pNoOfItemsLine1,BaseWebdriver.driver.findElement(NoOfItemsLine1).getText());
		assertEquals(pTotalWeight,BaseWebdriver.driver.findElement(TotalWeight).getText());
		assertEquals(pMisc,BaseWebdriver.driver.findElement(misc).getText());
		assertEquals(pLWH,BaseWebdriver.driver.findElement(LWH).getText());
		assertEquals(pTotalVolume,BaseWebdriver.driver.findElement(TotalVolume).getText());
		assertEquals(pReference1,BaseWebdriver.driver.findElement(reference1).getText());
		assertEquals(pReference2,BaseWebdriver.driver.findElement(reference2).getText());
				
	}
}
