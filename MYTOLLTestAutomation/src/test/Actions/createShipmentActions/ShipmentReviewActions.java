package createShipmentActions;


import org.openqa.selenium.By;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;

public class ShipmentReviewActions {
	
	
	public static By dispatchDate=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[1]/div[2]/p");
	public static By tollCarrier=By.id("toll-carrier"); ////*[@id="toll-carrier"]
	public static By accountNumber=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[3]/div[2]/p");
	
	public static By senderCompanyName=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[4]/div[2]/p");
	public static By receiverCompanyName=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[6]/div[2]/p");
	public static By receiverLocation=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/ul/li[7]/div[2]/p");
	
	public static By service=By.id("service-text");
	public static By Whopays=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div/ul/li[2]/div[2]/p");
	
	//Additional Information
	public static By FoodPackaging=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/ul/li[3]/div[2]/p");
	public static By PalletTransactionsInformation=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/ul/li[4]/div[2]/p");
	
	//Line Item 
	
	public static By itemName1=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[1]/div[2]/h3");
	public static By itemDescription1=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[1]/p");
	public static By numberOfItems=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[2]/p");
	public static By dimensions=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[4]/p");
	public static By volume=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[5]/p");
	public static By weight=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[6]/p");
	public static By reference1=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[7]/p");
	public static By reference2=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[8]/p");
	public static By ShipmentContainDGGoods=By.xpath("//*[@id=\"shipment-placeholder\"]/div[1]/div[1]/div/div[2]/ul/li/div[2]/div[2]/div[9]/p");
	
}
