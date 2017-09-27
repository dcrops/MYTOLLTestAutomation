package reviewYourPickupActions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;

public class ReviewYouPickupActions {
	
	
	public static By reviewYourPickupHeading=By.xpath("//@[id='book-a-pickup-placeholder']/div/div/h1/i");//By.cssSelector("h1");
	public static By pickupDetailsHeading=By.cssSelector("h5.review-box-label");
	public static By pickupDateTimeHeading=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div[2]/div/h5");
	public static By accountNumber=By.cssSelector("p.pickup-summary__form-control-static");
	public static By tollCarrier=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div/div/div[2]/div/p");
	public static By company=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div/div/div[3]/div/p");
	public static By location=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div/div/div[4]/div/p");
	public static By userName=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div/div/div[5]/div/p"); //*[@id="book-a-pickup-placeholder"]/div/div[1]/div[1]/div/div[6]/div/p
	public static By phoneNumber=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div/div/div[6]/div/p");
	public static By pickupDate=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div[2]/div/div/div/p");
	public static By readyTime=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div[2]/div/div[2]/div/p");
	public static By closingTime=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div[2]/div/div[3]/div/p");
	public static By specialInstructions=By.cssSelector("div.pickup-summary__form-group.clear > div.col-md-6.col-sm-6 > p.pickup-summary__form-control-static");
	public static By itemDescription1=By.cssSelector("div.item.hide-open");
	public static By numberofItems=By.cssSelector("div.quantity.hide-open");
	public static By lengthWidthHeight=By.cssSelector("div.dimensions.hide-open");
	public static By volume1=By.cssSelector("div.volume.hide-open");
	public static By weight1=By.cssSelector("div.weight.hide-open");
	
	public static By itemArrowDown=By.cssSelector("i.ico-arrow-down-green");
	public static By destination=By.xpath("//div[@id='line-item-0']/div[2]/div/div/div[2]/div/p");
	public static By itemDescription=By.xpath("//*[@id='line-item-0']/div[1]/div[2]/text()");//.cssSelector("div.col-md-6.border-right > div.pickup-summary__form-group > div.col-md-6.col-sm-6 > p.pickup-summary__form-control-static");
	public static By lenghthHeightWeight=By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div/div/p");
	public static By volume=By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div[2]/div/p");
	public static By weight=By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div[3]/div/p");
	public static By dangerousGood=By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div[4]/div/p");
	public static By foodItems=By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div[5]/div/p");
	public static By tempLow=By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div/div/p");
	public static By tempHigh=By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div[2]/div/p");
	public static By refNumber=By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div[3]/div/p");
	public static By bookInNumbers=By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div[4]/div/p");
	
	public static By confirmPickupBtn=By.id("submit-pickup");
	public static By pickupConfirmed=By.xpath("//*[@id=\"book-a-pickup-placeholder\"]/div[1]/div[1]/div[1]/h1");
	public static By emailLable=By.xpath("//*[@id=\"book-a-pickup-placeholder\"]/div[1]/div[1]/div[2]/h4");
	public static By pickupSubmitted=By.xpath("//*[@id=\"pickup-trails\"]/div[1]/span");
	public static By pickedupLable=By.xpath("//*[@id=\"pickup-trails\"]/div[2]/span[2]");
	public static By intransit=By.xpath("//*[@id=\"pickup-trails\"]/div[3]/span[2]");
	public static By outForDeliveryLable=By.xpath("//*[@id=\"pickup-trails\"]/div[4]/span[2]");
	public static By deliveredLable=By.xpath("//*[@id=\"pickup-trails\"]/div[5]/span[2]");
	public static By emailAddress=By.xpath("//*[@id=\"book-a-pickup-placeholder\"]/div[1]/div[1]/div[2]/h4/a");
	
	public static By EditBtn= By.id("edit-pickup");
	
	public static String VerifyService(int lineNumber) {
		return BaseWebdriver.driver.findElement(By.xpath("//div[@id='line-item-"+lineNumber+"']/div[2]/div/div/div[3]/div/p")).getText();
		
	}
	
	public static String VerifyChargeToAccount(int lineNumber) {
		return BaseWebdriver.driver.findElement(By.xpath("//div[@id='line-item-"+lineNumber+"']/div[2]/div/div/div[4]/div/p")).getText();
		
	}
	
	public static String VerifyNumberofItems(int lineNumber) {
		return BaseWebdriver.driver.findElement(By.xpath("//div[@id='line-item-"+lineNumber+"']/div[2]/div/div/div[5]/div/p")).getText();
		
	}
	
	public static String VerifyPalletSpace(int lineNumber) {
		return BaseWebdriver.driver.findElement(By.xpath("//div[@id='line-item-"+lineNumber+"']/div[2]/div/div/div[6]/div/p")).getText();
		
	}
	
	public static String VerifyDangerousItems(int lineNumber) {
		return BaseWebdriver.driver.findElement(By.xpath("//div[@id='line-item-"+lineNumber+"']/div[2]/div/div[2]/div[4]/div/p")).getText();
		
	}
	
	public static String VerifyFoodItem(int lineNumber) {
		return BaseWebdriver.driver.findElement(By.xpath("//div[@id='line-item-"+lineNumber+"']/div[2]/div/div[2]/div[5]/div/p")).getText();
		
	}
	
	public static void verifyReviewYourPickupScreenHeadings() {
		assertEquals("REVIEW YOUR PICKUP",BaseWebdriver.driver.findElement(reviewYourPickupHeading).getText());
	}
	
	public static void verifyPickupDetailsHeading() {
		assertEquals("PICKUP DETAILS",BaseWebdriver.driver.findElement(pickupDetailsHeading).getText());
	}
	
	public static void verifyPickupDateTimeHeading() {
		assertEquals("PICKUP DATE & TIME", BaseWebdriver.driver.findElement(pickupDateTimeHeading).getText());
	}
	
	public static void VerifyAccountNumber(String pAccountNumber) {
		assertEquals(pAccountNumber,BaseWebdriver.driver.findElement(accountNumber).getText());
	}
	
	public static void VerifyTollCarrier(String pTollCarrier) {
		assertEquals(pTollCarrier,BaseWebdriver.driver.findElement(tollCarrier).getText());
	}
	
	public static void VerifyCompany(String pCompany) {
		assertEquals(pCompany,BaseWebdriver.driver.findElement(company).getText());
	}
	
	public static void VerifyLocation(String pLocation) {
		assertEquals(pLocation, BaseWebdriver.driver.findElement(location).getText());
	}
	
	public static void VerifyBookedby(String pBookedBy) {
		assertEquals(pBookedBy,  BaseWebdriver.driver.findElement(userName).getText());
	}
	
	public static void VerifyPhoneNumber(String pPhoneNumber) {
		assertEquals(pPhoneNumber, BaseWebdriver.driver.findElement(phoneNumber).getText());
	}
	
	
	public static void VerifyPickupDate() {
		//assertEquals("15-08-2017", BaseWebdriver.driver.findElement(pickupDate).getText());
	}
	
	public static void verifyReadyTime() {
		assertEquals(BookAPickupActions.ReadyTime(), BaseWebdriver.driver.findElement(readyTime).getText());
	}
	
	public static void verifyClosingTime() {
		assertEquals(BookAPickupActions.ClosingTime(), BaseWebdriver.driver.findElement(closingTime).getText());
	}
	
	public static void verifySpecialInstructions() {
		assertEquals("special instructions test", BaseWebdriver.driver.findElement(specialInstructions).getText());
	}
	
	public static void verifyItemDescription() {
		//assertEquals("Industrial Paint",BaseWebdriver.driver.findElement(itemDescription).getText());
	}
	
	public static void verifyNumberofItems() {
		assertEquals("4 Items",  BaseWebdriver.driver.findElement(numberofItems).getText());
	}
	
	public static void verifyLengthWidthHeight() {
		assertEquals("200X150X140 CM3",  BaseWebdriver.driver.findElement(lengthWidthHeight).getText());
	}
	
	public static void verifyVolume() {
		assertEquals("11.80 M3", BaseWebdriver.driver.findElement(volume1).getText());
	}
	
	public static void verifyWeight() {
		assertEquals("50 Kg",  BaseWebdriver.driver.findElement(weight1).getText());
	}
	
	public static void VerifyItemDetails() {
		BaseWebdriver.driver.findElement(itemArrowDown).click();
		assertEquals("Industrial Paint", BaseWebdriver.driver.findElement(itemDescription).getText());
	    assertEquals("Melbourne, 3173", BaseWebdriver.driver.findElement(destination).getText());
	    assertEquals("General", VerifyService(0));
	    assertEquals("Receiver - 1236654", VerifyChargeToAccount(0));
	    assertEquals("4", VerifyNumberofItems(0));
	    assertEquals("2", VerifyPalletSpace(0));
	    assertEquals("L: 200cm W: 150cm H: 140cm", BaseWebdriver.driver.findElement(lenghthHeightWeight).getText());
	    assertEquals("11.80", BaseWebdriver.driver.findElement(volume).getText());
	    assertEquals("50 kgs", BaseWebdriver.driver.findElement(weight).getText());
	    assertEquals("No", VerifyDangerousItems(0));
	    assertEquals("No", VerifyFoodItem(0));
	} 
	
	public static void VerifyNewItemDetails() {
		
		BaseWebdriver.driver.findElement(By.cssSelector("#line-item-1 > div.item-header.clearfix > div.edit-wrpr > a.edit > i.ico-arrow-down-green")).click();
		assertEquals("Industrial Paint", BaseWebdriver.driver.findElement(itemDescription).getText());
	    assertEquals("Melbourne, 3173", BaseWebdriver.driver.findElement(destination).getText());
	    assertEquals("Refrigeration", VerifyService(1));
	    assertEquals("Receiver - 1236654", VerifyChargeToAccount(1));
	    assertEquals("4", VerifyNumberofItems(1));
	    assertEquals("2", VerifyPalletSpace(1));
	    assertEquals("L: 200cm W: 150cm H: 140cm", BaseWebdriver.driver.findElement(lenghthHeightWeight).getText());
	    assertEquals("11.80", BaseWebdriver.driver.findElement(volume).getText());
	    assertEquals("50 kgs", BaseWebdriver.driver.findElement(weight).getText());
	    assertEquals("No", VerifyDangerousItems(1));
	    assertEquals("No", VerifyFoodItem(1));
	    assertEquals("10", BaseWebdriver.driver.findElement(tempLow).getText());
	    assertEquals("20", BaseWebdriver.driver.findElement(tempHigh).getText());
	    assertEquals("123", BaseWebdriver.driver.findElement(refNumber).getText());
	    assertEquals("456", BaseWebdriver.driver.findElement(bookInNumbers).getText());
	    ////assertEquals("Tomorrow, Tuesday, 15 August 2017", driver.findElement(By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div[2]/div/div/p")).getText());
	  //  assertEquals("Wednesday, 16 August 2017", driver.findElement(By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div[2]/div[2]/div/p")).getText());
	    //assertEquals("16:00", driver.findElement(By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div[2]/div[3]/div/p")).getText());
	} 
	
	public static void ClickConfirmPickup()
	{
		BaseWebdriver.driver.findElement(confirmPickupBtn).click();
	}

	public static void ClickEdit()
	{
		BaseWebdriver.driver.findElement(EditBtn).click();
	}

	public static void VerifyConfirmPickupDetails() {
		// assertEquals("PICKUP Submitted", BaseWebdriver.driver.findElement(pickupConfirmed).getText());
		 assertEquals("Pickup Submitted", BaseWebdriver.driver.findElement(pickupSubmitted).getText());
		 assertEquals("Pickedup", BaseWebdriver.driver.findElement(pickedupLable).getText());
		 assertEquals("Intransit", BaseWebdriver.driver.findElement(intransit).getText());
		 assertEquals("Out for Delivery", BaseWebdriver.driver.findElement(outForDeliveryLable).getText());
		 assertEquals("Delivered", BaseWebdriver.driver.findElement(deliveredLable).getText());
		// assertEquals("We have sent you an email confirming your pickup booking to:superuser@gmail.com" 
		 //		, BaseWebdriver.driver.findElement(emailLable).getText());
		 assertEquals("allbus001@toll.com", BaseWebdriver.driver.findElement(emailAddress).getText());

	}
}
