package reviewYourPickupActions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import baseWebdriver.BaseWebdriver;
import bookAPickupActions.BookAPickupActions;

public class ReviewYouPickupActions {
	
	
	public static By reviewYourPickupHeading=By.xpath("//*[@id=\"book-a-pickup-placeholder\"]/div/header/div/h1"); 
	public static By pickupDetailsHeading=By.cssSelector("h5.review-box-label");
	public static By pickupDateTimeHeading=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div[2]/div/h5");
	public static By accountNumber=By.cssSelector("p.pickup-summary__form-control-static");
	public static By tollCarrier=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div/div/div[2]/div/p");
	public static By company=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div/div/div[3]/div/p");
	public static By location=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div/div/div[4]/div/p");
	public static By userName=By.xpath("//div[@id='book-a-pickup-placeholder']/div/div/div/div/div[5]/div/p"); 
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
	
	//Item details validation
	public static By itemArrowDownItem1=By.xpath("//*[@id=\"line-item-0\"]/div[1]/div[7]/a/i"); 
	public static By destination=By.xpath("//div[@id='line-item-0']/div[2]/div/div/div[2]/div/p");
	public static By itemDescription=By.xpath("//*[@id=\"line-item-0\"]/div[2]/div/div[1]/div[1]/div/p");
	public static By lenghthHeightWeight=By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div/div/p");
	public static By volume=By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div[2]/div/p");
	public static By weight=By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div[3]/div/p");
	public static By dangerousGood=By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div[4]/div/p");
	public static By foodItems=By.xpath("//div[@id='line-item-0']/div[2]/div/div[2]/div[5]/div/p");
	public static By tempLow=By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div/div/p");
	public static By tempHigh=By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div[2]/div/p");
	public static By refNumber=By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div[3]/div/p");
	public static By bookInNumbers=By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div/div[4]/div/p");
	public static By technicalName=By.xpath("//*[@id=\"dg-line-00\"]/div[2]/div[2]/div[4]/div/p");
	
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
	
	public static void ClickItemArrowdown(int itemIineNumber) {
		BaseWebdriver.driver.findElement(By.xpath("//*[@id='line-item-"+itemIineNumber+"']/div[1]/div[7]/a/i")).click();
	}
	
	public static String VerifyItemDescription(int lineNumber) {
		return BaseWebdriver.driver.findElement(By.xpath("//*[@id='line-item-"+lineNumber+"']/div[2]/div/div[1]/div[1]/div/p")).getText();
		
		
	}
	
	public static String VerifyService(int lineNumber) {
		return BaseWebdriver.driver.findElement(By.xpath("//div[@id='line-item-"+lineNumber+"']/div[2]/div/div/div[3]/div/p")).getText();
		
	}
	
	public static String VerifyChargeToAccount(int lineNumber, String pChargeToAccount) {
		return BaseWebdriver.driver.findElement(By.xpath("//div[@id='line-item-"+lineNumber+"']/div[2]/div/div[1]/div[label(text()='"+pChargeToAccount+"')]/div/p")).getText();
		
	}//*[@id="line-item-0"]/div[2]/div/div[1]/div[5]/label
	//*[@id="line-item-0"]/div[2]/div/div[1]/div[5]/div/p
	
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
		assertEquals("BOOK A PICKUP",BaseWebdriver.driver.findElement(reviewYourPickupHeading).getText());
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
	
	public static void verifyReadyTime(String pReadyTime) {
		assertEquals(pReadyTime, BaseWebdriver.driver.findElement(readyTime).getText());
	}
	
	public static void verifyClosingTime(String pClosingTime) {
		assertEquals(pClosingTime, BaseWebdriver.driver.findElement(closingTime).getText());
	}
	
	public static void verifySpecialInstructions(String pSpecialIns) {
		assertEquals(pSpecialIns, BaseWebdriver.driver.findElement(specialInstructions).getText());
	}
	
	public static void verifyItemDescription() {
		//assertEquals("Industrial Paint",BaseWebdriver.driver.findElement(itemDescription).getText());
	}
	
	public static void verifyNumberofItems(String pNumberOfItems) {
		assertEquals(pNumberOfItems,  BaseWebdriver.driver.findElement(numberofItems).getText());
	}
	
	public static void verifyLengthWidthHeight(String pLengthWidthHeight) {
		assertEquals(pLengthWidthHeight,  BaseWebdriver.driver.findElement(lengthWidthHeight).getText()); 
	}
	
	public static void verifyVolume(String pVolume) {
		assertEquals(pVolume, BaseWebdriver.driver.findElement(volume1).getText()); 
	}
	
	public static void verifyWeight(String pWeight) {
		assertEquals(pWeight,  BaseWebdriver.driver.findElement(weight1).getText()); 
	}
	
	public static void VerifyItemDetails1(String lineNumber, String pItemName, String pDestination, String pPostCode, String Service, String chargeToAccount,String noOfItems, String palletSpace, 
			String length,  String width,String height, String pVolume, String pWeight, String pDangerousGoods, String pFoodItems ) {
		BaseWebdriver.driver.findElement(itemArrowDownItem1).click();
		assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription).getText()); 
	    assertEquals(pDestination+","+ pPostCode, BaseWebdriver.driver.findElement(destination).getText());
	    assertEquals(Service, VerifyService(0));
	    assertEquals(chargeToAccount, VerifyChargeToAccount(0,chargeToAccount));
	    assertEquals(noOfItems, VerifyNumberofItems(0));
	    assertEquals(palletSpace, VerifyPalletSpace(0));
	    assertEquals("L: "+length+"cm W: "+width+"cm H: "+height+"cm", BaseWebdriver.driver.findElement(lenghthHeightWeight).getText());
	    assertEquals(pVolume, BaseWebdriver.driver.findElement(volume).getText());
	    assertEquals(pWeight, BaseWebdriver.driver.findElement(weight).getText());
	    assertEquals(pDangerousGoods, VerifyDangerousItems(0));
	    assertEquals(pFoodItems, VerifyFoodItem(0));
	} 
	
	public static void VerifyItemDetails(int itemLineNumber, String pItemName, String pDestination, String pPostCode, String Service, String chargeToAccount,String noOfItems, String palletSpace, 
			String length,  String width,String height, String pVolume, String pWeight, String pDangerousGoods, String pFoodItems ) {
		
		//BaseWebdriver.driver.findElement(itemArrowDownItem1).click();
		
		ReviewYouPickupActions.ClickItemArrowdown(itemLineNumber);
		assertEquals(pItemName, VerifyItemDescription(itemLineNumber));
		//assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription).getText()); 
	    assertEquals(pDestination+", "+ pPostCode, BaseWebdriver.driver.findElement(destination).getText());
	    assertEquals(Service, VerifyService(itemLineNumber));
	    assertEquals(chargeToAccount, VerifyChargeToAccount(itemLineNumber,"Charge to"));
	    assertEquals(noOfItems, VerifyNumberofItems(itemLineNumber));
	    assertEquals(palletSpace, VerifyPalletSpace(itemLineNumber));
	    assertEquals("L: "+length+"cm W: "+width+"cm H: "+height+"cm", BaseWebdriver.driver.findElement(lenghthHeightWeight).getText());
	    assertEquals(pVolume, BaseWebdriver.driver.findElement(volume).getText());
	    assertEquals(pWeight+" kgs", BaseWebdriver.driver.findElement(weight).getText());
	    assertEquals(pDangerousGoods, VerifyDangerousItems(0));
	    assertEquals(pFoodItems, VerifyFoodItem(0));
	    
	    
	} 
	
	public static void VerifyNewItemDetails(int itemLineNumber,String pItemName, String pDestination, String pPostCode, String Service, String chargeToAccount,String noOfItems, String palletSpace, 
			String length,  String width,String height, String pVolume, String pWeight ) {
		
		ReviewYouPickupActions.ClickItemArrowdown(itemLineNumber);
		//BaseWebdriver.driver.findElement(By.cssSelector("#line-item-1 > div.item-header.clearfix > div.edit-wrpr > a.edit > i.ico-arrow-down-green")).click();
		//assertEquals(pItemName, BaseWebdriver.driver.findElement(itemDescription).getText());
		assertEquals(pItemName, VerifyItemDescription(itemLineNumber));
		
	    assertEquals(pDestination+ ", "+ pPostCode, BaseWebdriver.driver.findElement(destination).getText());
	    assertEquals(Service, VerifyService(1));
	    assertEquals(chargeToAccount, VerifyChargeToAccount(itemLineNumber,chargeToAccount));
	    assertEquals(noOfItems,VerifyNumberofItems(itemLineNumber));
	    assertEquals(palletSpace, VerifyPalletSpace(itemLineNumber));
	    assertEquals("L: "+length+"cm W: "+width+"cm H: "+height+"cm", BaseWebdriver.driver.findElement(lenghthHeightWeight).getText());
	    assertEquals(pVolume, BaseWebdriver.driver.findElement(volume).getText());
	    assertEquals(pWeight+" kgs", BaseWebdriver.driver.findElement(weight).getText());
	    assertEquals("No", VerifyDangerousItems(itemLineNumber));
	    assertEquals("No", VerifyFoodItem(itemLineNumber));
	    
	}
	
	public static void VerifyRefrigerationDetails(String pTempLow, String pTempHigh, String pRefNumber, String pBookInNumbers  ) { 
	assertEquals(pTempLow, BaseWebdriver.driver.findElement(tempLow).getText());
	    assertEquals(pTempHigh, BaseWebdriver.driver.findElement(tempHigh).getText());
	    assertEquals(pRefNumber, BaseWebdriver.driver.findElement(refNumber).getText());
	    assertEquals(pBookInNumbers, BaseWebdriver.driver.findElement(bookInNumbers).getText());
	    ////assertEquals("Tomorrow, Tuesday, 15 August 2017", driver.findElement(By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div[2]/div/div/p")).getText());
	  //  assertEquals("Wednesday, 16 August 2017", driver.findElement(By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div[2]/div[2]/div/p")).getText());
	    //assertEquals("16:00", driver.findElement(By.xpath("//div[@id='line-item-1']/div[2]/div[2]/div[2]/div[3]/div/p")).getText());
	} 
	
	public static void VerifyDangerousGoodsDetails(String pTechnicalName ) { 
		assertEquals(pTechnicalName, BaseWebdriver.driver.findElement(tempLow).getText());
		  
		} 
	
	public static void ClickConfirmPickup()
	{
		BaseWebdriver.driver.findElement(confirmPickupBtn).click();
	}

	public static void ClickEdit()
	{
		BaseWebdriver.driver.findElement(EditBtn).click();
	}

	public static void VerifyConfirmPickupDetails(String userName) {
		// assertEquals("PICKUP Submitted", BaseWebdriver.driver.findElement(pickupConfirmed).getText());
		 assertEquals("Pickup booked", BaseWebdriver.driver.findElement(pickupSubmitted).getText());
		 assertEquals("Picked up", BaseWebdriver.driver.findElement(pickedupLable).getText());
		 assertEquals("In transit", BaseWebdriver.driver.findElement(intransit).getText());
		 assertEquals("Out for delivery", BaseWebdriver.driver.findElement(outForDeliveryLable).getText());
		 assertEquals("Delivered", BaseWebdriver.driver.findElement(deliveredLable).getText());
		// assertEquals("We have sent you an email confirming your pickup booking to:superuser@gmail.com" 
		 //		, BaseWebdriver.driver.findElement(emailLable).getText());
		 assertEquals(userName, BaseWebdriver.driver.findElement(emailAddress).getText());

	}
}
