package GlobalActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Reporter;

import baseWebdriver.BaseWebdriver;

public class PageBase 
{
	public static Robot robot;
	
	public static boolean retryingFindClick(By by) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				//BaseWebdriver.driver.findElement(by).click();
				click(by, 50);
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}
	
	public static WebElement FindElement(By ObjectLocater) 
	{
		WebDriverWait wait = new WebDriverWait(BaseWebdriver.driver, 50);
		WebElement we = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(ObjectLocater));
		if (we == null) {
			//logger.warn("elemet with: " + locator.toString() + " not found");
			Reporter.log("element with: " + ObjectLocater.toString() + " not found" +"<br>");
			Assert.fail("element with: " + ObjectLocater.toString() + " not found" +"<br>");
			//return null;
		}
	//	PageBase.moveToElement(ObjectLocater);
		//we.click();
		return we;
		
	}
	
	public static WebElement FindElement(WebElement _element) 
	{
		WebDriverWait wait = new WebDriverWait(BaseWebdriver.driver, 50);
		WebElement we = (WebElement) wait.until(ExpectedConditions.visibilityOf(_element));
		if (we == null) {
			//logger.warn("elemet with: " + locator.toString() + " not found");
			Reporter.log("element with: " + _element.toString() + " not found" +"<br>");
			Assert.fail("element with: " + _element.toString() + " not found" +"<br>");
			//return null;
		}
		//PageBase.moveToElement(_element);
		//we.click();
		return we;
		
	}
	
	
	public static WebElement WaitForElement(By ObjectLocater, int secsToWait) 
	{
		if(secsToWait<=20)
		{
			secsToWait= 50;
		}
		//WebElement element=BaseWebdriver.driver.findElement(ObjectLocater);
		//WebElement element= FindElement(ObjectLocater);
		return (new WebDriverWait(BaseWebdriver.driver, secsToWait)).until(ExpectedConditions.visibilityOfElementLocated(ObjectLocater)); //.visibilityOfElementLocated(ObjectLocater)); //.presenceOfElementLocated(ObjectLocater));//.visibilityOf());
	}

	public static boolean SendKeysTo(By ObjectLocater, String keysToSend,int secsToWait) {
		try {
			PageBase.moveToElement(ObjectLocater);
			WebElement element = WaitForElement(ObjectLocater, secsToWait);
			element.click();
			element.clear();
			element.sendKeys(keysToSend);
		} catch (TimeoutException ex) {
			logElementNotFound(ex);
			return false;
		}

		return true;
	}
	
	public static boolean SendKeysToNonEditableField(By ObjectLocater, String keysToSend,int secsToWait) {
		try {
			WebElement element = WaitForElement(ObjectLocater, secsToWait);
			element.click();
			element.clear();
			element.sendKeys(keysToSend);
		} catch (TimeoutException ex) {
			logElementNotFound(ex);
			return false;
		}

		return true;
	}

	public static boolean SelectFrom(By drodownListItem,int secsToWait) {
		
		try {
			WebElement element = WaitForElement(drodownListItem, secsToWait);
			element.click();
			
		} catch (TimeoutException ex) {
			logElementNotFound(ex);
			return false;
		}

		return true;
	}
	
	public static boolean ClickOn(By ObjectLocater, int secsToWait) {
		try {
			PageBase.moveToElement(ObjectLocater);
			WebElement element = WaitForElement(ObjectLocater, secsToWait);
			element.click();
		} catch (TimeoutException ex) {
			logElementNotFound(ex);
			return false;
		}

		return true;
	}
	
	public static String GetText(By ObjectLocater, int secsToWait) {
		
		WebElement element = WaitForElement(ObjectLocater, secsToWait);
		
		return element.getText();
		}
	
	public static String GetAttributeValue(By ObjectLocater, int secsToWait) {
		
		WebElement element = WaitForElement(ObjectLocater, secsToWait);
		
		return element.getAttribute("value");
		}
	// When an element is not found sets two levels of logging and sets found =
	// false
	private static void logElementNotFound(TimeoutException ex) {
		System.out.print("TimeoutException ex"+ ex);

	}

	public static boolean findElement(By ObjectLocater, int secsToWait) {
		try {
			WaitForElement(ObjectLocater, secsToWait);
		} catch (TimeoutException ex) {
			logElementNotFound(ex);
			return false;
		}
		return true;
	}

	public static Boolean isElementPresent(By element) {
		Boolean elementFound;
		try {
			BaseWebdriver.driver.findElement(element);
			elementFound = true;
			return true;
		} catch (Exception ex) {
			return false;
		}
		// return true;
	}

	public static Boolean IsDisplayed(WebElement element) {
		Boolean result;
		try {
			result = element.isDisplayed();
		} catch (Exception ex) {
			result = false;
			System.out.println("\nElement was not displayed:  " + element + " " + ex.toString());
		}
		// Log the Action
		return result;
	}
	//Nishant
	public static Boolean IsDisplayed(By locator) {
		Boolean result;
		try {
			result = findElement(locator, 2);
//			result = element.isDisplayed();
		} catch (Exception ex) {
			result = false;
			System.out.println("\n locator isDisplayed method did not work  " /* + result + " " + ex.toString()*/);
		}
		// Log the Action
		return result;
	}
	
	public static void ElementToBeClickableWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BaseWebdriver.driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void LongWaitForElementEnabled() {
		try {
			Thread.sleep(5000);
			

		}

		catch (Exception ex) {
			System.out.println(ex);

		}
	}

	public static void MaximumWaitForElementEnabled() {
		try {
			Thread.sleep(1500);
			

		}

		catch (Exception ex) {
			System.out.println(ex);

		}
	}

	public static void MediumWaitForElementEnabled() {
		try {
			
			Thread.sleep(400);

		}

		catch (Exception ex) {
			System.out.println(ex);

		}
	}

	public static void MinimumWaitForElementEnabled() {
		try {
			Thread.sleep(300);

		}

		catch (Exception ex) {
			System.out.println(ex);

		}
	}
	
	public static void AcceptAlert() {
	 new WebDriverWait(BaseWebdriver.driver,
			 10).until(ExpectedConditions.alertIsPresent());
		 BaseWebdriver.driver.switchTo().alert().accept();
	}
	
	public static void Scrollbar(Integer coord1, Integer coord2) {
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		jse.executeScript("scroll("+coord1+", "+coord2+")");
		}
	
	public static void MoveToElement(By path1,By path2) {
		JavascriptExecutor jse = (JavascriptExecutor) BaseWebdriver.driver;
		try {
		WebElement element =BaseWebdriver.driver.findElement(path1);
		jse.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		}
		
		catch(Exception ex)
		{
			WebElement element =BaseWebdriver.driver.findElement(path2);
			jse.executeScript("arguments[0].scrollIntoView();", element);
			element.click();
		}
		
	}
	
	public static WebElement waitForElement(By locator, int waitSeconds) {
		WebElement we = null;
		try {
			we = (WebElement) (new WebDriverWait(BaseWebdriver.driver, waitSeconds))
				.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (TimeoutException e) {
			System.out.println("xpath not found: " + locator);
			//Reporter.log("xpath not found: " + locator);
			return null;
		}
		return we;
	}
	
	public static WebElement waitForElementToBeVisible(By locator, int waitSeconds) {
		WebElement we = null;
		try {
			we = (WebElement) (new WebDriverWait(BaseWebdriver.driver, waitSeconds))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (TimeoutException e) {
			System.out.println("xpath not found: " + locator);
			//Reporter.log("xpath not found: " + locator);
			return null;
		}
		return we;
	}
	
	
	public static WebElement click(By locator, int waitSeconds) 
	{
		if(waitSeconds<=20)
		{
			waitSeconds= 50;
		}
		PageBase.moveToElement(locator);
		WebDriverWait wait = new WebDriverWait(BaseWebdriver.driver, waitSeconds);
		WebElement we = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(locator));
		if (we == null) {
			//logger.warn("elemet with: " + locator.toString() + " not found");
			Reporter.log("element with: " + locator.toString() + " not found" +"<br>");
			Assert.fail("element with: " + locator.toString() + " not found" +"<br>");
			//return null;
		}
		
		we.click();
		return we;
	}
	
	
	public static WebElement clear(By locator, int waitSeconds) 
	{
		WebElement we = click(locator, waitSeconds);
		we.clear();
		return we;
	}
	
	
	
	public static WebElement click(WebElement _element, int waitSeconds) 
	{
		if(waitSeconds<=20)
		{
			waitSeconds= 50;
		}
		WebDriverWait wait = new WebDriverWait(BaseWebdriver.driver, waitSeconds);
		WebElement we = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(_element));
		if (we == null) {
			//logger.warn("elemet with: " + locator.toString() + " not found");
			Reporter.log("element with: " + _element.toString() + " not found" +"<br>");
			Assert.fail("element with: " + _element.toString() + " not found" +"<br>");
			//return null;
		}
		PageBase.moveToElement(_element);
		we.click();
		return we;
	}
	
	

	
	public static void sendText(By locator, int secsToWait, String keysToSend) {
		try {
			if(secsToWait<=20)
			{
				secsToWait = 50;
			}
			PageBase.moveToElement(locator);
			WebElement element = waitForElement(locator,secsToWait);
			element.clear();
			element.sendKeys(keysToSend);
		} catch (Exception e) {
			Reporter.log("element with: " + locator.toString() + " not found" +"<br>");
			Assert.fail("element with: " + locator.toString() + " not found" +"<br>");
		}
	}
	
	public static void sendTextandSubmit(By locator, int secsToWait, String keysToSend) {
		try {
			PageBase.moveToElement(locator);
			WebElement element = waitForElement(locator,secsToWait);
			element.clear();
			element.sendKeys(keysToSend);
			element.sendKeys(Keys.RETURN);
		} catch (Exception e) {
			Reporter.log("element with: " + locator.toString() + " not found" +"<br>");
			Assert.fail("element with: " + locator.toString() + " not found" +"<br>");
		}
	}
	
	public static void verifyTextExistAttribute(By locator, String expectedText){
		String getText = BaseWebdriver.driver.findElement(locator).getAttribute("value");
		
		if (getText.equals(expectedText)){
			Reporter.log("Expected Text : "+expectedText+ " Matched the Text on Screen :" +getText);
			System.out.println("Expected Text : "+expectedText+ " Matched the Text on Screen :" +getText);
		}else{
			Reporter.log("FAILED: Expected Text : "+expectedText+ " DOES NOT Match the Text on Screen :" +getText);
			Assert.fail("FAILED: Expected Text : "+expectedText+ " DOES NOT Match the Text on Screen :" +getText);
		}
		
	}
	
	public static void verifyTextExistAttributeContains(By locator, String expectedText){
		String getText = BaseWebdriver.driver.findElement(locator).getAttribute("value");
		
		if (getText.contains(expectedText)){
			Reporter.log("Expected Text : "+expectedText+ " Contains within the Text on Screen :" +getText);
			System.out.println("Expected Text : "+expectedText+ " Contains within the Text on Screen :" +getText);
		}else{
			Reporter.log("FAILED: Expected Text : "+expectedText+ " DOES NOT Contains within the Text on Screen :" +getText);
			Assert.fail("FAILED: Expected Text : "+expectedText+ " DOES NOT Contains within the Text on Screen :" +getText);
		}
		
	}
	
	public static void moveToElement(By locator){
		try {
			//WebElement element = BaseWebdriver.driver.findElement(locator);
			WebElement element = FindElement(locator);
			((JavascriptExecutor) BaseWebdriver.driver).executeScript("arguments[0].scrollIntoView(true);", element);
			
			Thread.sleep(500);
		}
		catch (Exception e) {
			System.out.println("element with: " + locator.toString() + " not found");
			Reporter.log("element with: " + locator.toString() + " not found" +"<br>");
			Assert.fail("element with: " + locator.toString() + " not found" +"<br>");
		}
	}
	
	public static void moveToElement(WebElement _element){
		try {
			//WebElement element = BaseWebdriver.driver.findElement(locator);
			WebElement element = FindElement(_element);
			((JavascriptExecutor) BaseWebdriver.driver).executeScript("arguments[0].scrollIntoView(true);", element);
			
			Thread.sleep(500);
		}
		catch (Exception e) {
			System.out.println("element with: " + _element.toString() + " not found");
			Reporter.log("element with: " + _element.toString() + " not found" +"<br>");
			Assert.fail("element with: " + _element.toString() + " not found" +"<br>");
		}
	}
	
	public static void selectDropdown(By locator, String option){
		try{
			BaseWebdriver.driver.findElement(locator).sendKeys(option);
		Reporter.log("Selected Value: "+option + " under Locator: " +locator+"<br>");
		}
		catch (Exception e){
			Reporter.log("FAILED: Dropdown Menu Could not find the Value: "+option + " under Locator: " +locator+"<br>");
			Assert.fail("FAILED: Dropdown Menu Could not find the Value: "+option + " under Index: " +locator);
		}
	}
	

	public static void verifyTextExist(By locator, String expectedText){
		try {
			//String getText = BaseWebdriver.driver.findElement(locator).getText();
			String getText= PageBase.GetText(locator, 10);
			System.out.println(getText);
		 
			if (getText.equalsIgnoreCase(expectedText)){
				Reporter.log("Expected Text : "+expectedText+ " Matched the Text on Screen :" +getText);
				System.out.println("Expected Text : "+expectedText+ " Matched the Text on Screen :" +getText);
			}else{
				Reporter.log("FAILED: Expected Text : "+expectedText+ " DOES NOT Match the Text on Screen :" +getText);
				Assert.fail("FAILED: Expected Text : "+expectedText+ " DOES NOT Match the Text on Screen :" +getText);
			}
		}
		catch(Exception e) {
			Reporter.log("xpath not found: " + locator+"<br>");
			Assert.fail("xpath not found: " + locator+"<br>");
			
		}
		
	}
	
	public static boolean verifyTextExistsBoolean(By locator, String expectedText){
		try {
			//String getText = BaseWebdriver.driver.findElement(locator).getText();
				String getText= PageBase.GetText(locator, 10);
				System.out.println(getText);
			 
				if (getText.equalsIgnoreCase(expectedText)){
					Reporter.log("Expected Text : "+expectedText+ " Matched the Text on Screen :" +getText);
					System.out.println("Expected Text : "+expectedText+ " Matched the Text on Screen :" +getText);
					return true;
				}else{
					Reporter.log("FAILED: Expected Text : "+expectedText+ " DOES NOT Match the Text on Screen :" +getText);
					//Assert.fail("FAILED: Expected Text : "+expectedText+ " DOES NOT Match the Text on Screen :" +getText);
					return false; 
				}
				
			}
		catch(Exception e) 
		{
			Reporter.log("xpath not found: " + locator+"<br>");
			return false;
		}
		
		 
	}
	
	
	
	
	
	
	
	public static void verifyTextSubString(By locator, String expectedText){
		try {
			//String getText = BaseWebdriver.driver.findElement(locator).getText().replace("\n", "");
			String getText = PageBase.FindElement(locator).getText().replace("\n", "");
			if (getText.contains(expectedText)){
				Reporter.log("Expected Text : "+expectedText+ " Matched the Text on Screen : " +getText);
				System.out.println("Expected Text : "+expectedText+ " Matched the Text on Screen : " +getText);
			}else{
				Reporter.log("FAILED: Expected Text : "+expectedText+ " DOES NOT Match the Text on Screen : " +getText);
				Assert.fail("FAILED: Expected Text : "+expectedText+ " DOES NOT Match the Text on Screen : " +getText);
			}
		}
		catch(Exception e) {
			Reporter.log("xpath not found: " + locator+"<br>");
			Assert.fail("xpath not found: " + locator+"<br>");
			
		}
		
	}

	
	public static void waitForPageLoadingEnd (By locator, int seconds, String pageName) {
		boolean loadingExists = BaseWebdriver.driver.findElement(locator).isDisplayed();
		
		try {
			for (int i = 1; i <= seconds; i++){
				if (loadingExists == false) {
					Reporter.log(pageName+ " - Page Load Completed");
					break;
				}
				else if(i == seconds){
					Reporter.log("FAILED - "+pageName+ " Page is Not loaded completely after '"+ seconds+"' Seconds");
					Assert.fail("FAILED - "+pageName+ " Page is Not loaded completely after '"+ seconds+"' Seconds");
				}
				else {
					Thread.sleep(1000);
				}
			}
		}	
				
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public static void isElementPresent (By locator, int seconds, String itemDescription) {
		boolean isElementPresent = BaseWebdriver.driver.findElement(locator).isDisplayed();
		PageBase.moveToElement(locator);
		
		if (isElementPresent == true) {
			Reporter.log("Element : "+itemDescription+ " Exists on Screen");
			System.out.println("Element : "+itemDescription+ " Exists on Screen");
		}
		else {
			Reporter.log("FAILED: Element : "+itemDescription+ " Does not exist on Screen");
			Assert.fail("FAILED: Element : "+itemDescription+ " Does not exist on Screen");
		}
		
		
	}
	
	public static void isElementNotPresent (By locator, int seconds, String itemDescription) {
		try {
			boolean isElementPresent = PageBase.FindElement(locator).isDisplayed();
		
		if (isElementPresent == true) {
			Reporter.log("FAILED: Element : "+itemDescription+ " Exits on Screen");
			Assert.fail("FAILED: Element : "+itemDescription+ " Exits on Screen");	
			}
		}
		catch(Exception e) {
				Reporter.log("Element : "+itemDescription+ " DOES NOT Exits on Screen");
				System.out.println("Element : "+itemDescription+ " DOES NOT Exits on Screen");
		}		
	}
	
	public static void MaximumWaitForElementEnabled_1() {
		try {
			Thread.sleep(1500);

		}

		catch (Exception ex) {
			System.out.println(ex);

		}
	}

	public static void MediumWaitForElementEnabled_1() {
		try {
			
			Thread.sleep(1000);

		}

		catch (Exception ex) {
			System.out.println(ex);

		}
	}

	public static void MinimumWaitForElementEnabled_1() {
		try {
			Thread.sleep(500);

		}

		catch (Exception ex) {
			System.out.println(ex);

		}
	}
	
	public static WebElement isElementUnavailable(By locator, int waitSeconds, String itemDescription) {
		try{
			WebDriverWait wait = new WebDriverWait(BaseWebdriver.driver, waitSeconds);
			WebElement we = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			we.click();
			Reporter.log("FAILED: Element : "+itemDescription+ " Exits on Screen");
			Assert.fail("FAILED: Element : "+itemDescription+ " Exits on Screen");	
		}
		catch (Exception ex) {
			Reporter.log("Element : "+itemDescription+ " DOES NOT Exits on Screen");
			System.out.println("Element : "+itemDescription+ " DOES NOT Exits on Screen");

		}
		return null;
	}

	public static void verifyDateReformated(By locator, String expectedText){
		try {
			String getText = BaseWebdriver.driver.findElement(locator).getText();
			String getTextNew;
			
			if (getText.length() == 10) {
				getTextNew="0"+getText;
			}
			else {
				getTextNew=getText;
			}
		 
			if (getTextNew.equalsIgnoreCase(expectedText)){
				Reporter.log("Expected Text : "+expectedText+ " Matched the Text on Screen :" +getTextNew);
				System.out.println("Expected Text : "+expectedText+ " Matched the Text on Screen :" +getTextNew);
			}else{
				Reporter.log("FAILED: Expected Text : "+expectedText+ " DOES NOT Match the Text on Screen :" +getTextNew);
				Assert.fail("FAILED: Expected Text : "+expectedText+ " DOES NOT Match the Text on Screen :" +getTextNew);
			}
		}
		catch(Exception e) {
			Reporter.log("xpath not found: " + locator+"<br>");
			Assert.fail("xpath not found: " + locator+"<br>");
			
		}
	}
	
	public static void verifyTextExistContains(By locator, String expectedText){
		try {
			String getText = BaseWebdriver.driver.findElement(locator).getText();
		 
			if (getText.contains(expectedText)){
				Reporter.log("Expected Text : "+expectedText+ " Contains within the Text on Screen :" +getText);
				System.out.println("Expected Text : "+expectedText+ " Contains within the Text on Screen :" +getText);
			}else{
				Reporter.log("FAILED: Expected Text : "+expectedText+ " DOES NOT Contains within the Text on Screen :" +getText);
				Assert.fail("FAILED: Expected Text : "+expectedText+ " DOES NOT Contains within the Text on Screen :" +getText);
			}
		}
		catch(Exception e) {
			Reporter.log("xpath not found: " + locator+"<br>");
			Assert.fail("xpath not found: " + locator+"<br>");
			
		}
		
	}

	public static void CopyToClipboard(String _copyString)
	{
		StringSelection ss = new StringSelection(_copyString);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	}
	public static void PasteFromClipboard(String _copyString) throws AWTException, InterruptedException
	{
		ImplementKeyPress(KeyEvent.VK_CONTROL);
		ImplementKeyPress(KeyEvent.VK_V);
		ImplementKeyRelease(KeyEvent.VK_V);
		ImplementKeyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1500);
		ImplementKeyPress(KeyEvent.VK_ENTER);
		ImplementKeyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1500);
	}
	
	public static void InitializeRobotClass() throws AWTException
	{
		if(java.util.Objects.equals(robot, null))
		{
			robot = new Robot();
		}
		
	}

	public static void ImplementKeyPress(int _vk) throws AWTException 
	{
		InitializeRobotClass();
		robot.keyPress(_vk);
	}
	
	public static void ImplementKeyRelease(int vk) throws AWTException
	{
		InitializeRobotClass();
		robot.keyRelease(vk);
	}
	
	
	private static Select identifyDropdown(By _dropdownlocator) 
	{
		PageBase.moveToElement(_dropdownlocator);
		Select dropdown = new Select(PageBase.FindElement(_dropdownlocator));
		return dropdown;
	}
	
	public static void IdentifyELementInDropdownByIndex(By _dropdownlocator, int elementIndex)
	{
		Select dropdown = identifyDropdown(_dropdownlocator);
		dropdown.selectByIndex(elementIndex);
		
	}
	
	public static void IdentifyELementInDropdownByValue(By _dropdownlocator, String elementValue)
	{
		Select dropdown = identifyDropdown(_dropdownlocator);
		dropdown.selectByValue(elementValue);
	}
	
	public static void IdentifyELementInDropdownByVisibleText(By _dropdownlocator, String VisibleText)
	{
		Select dropdown = identifyDropdown(_dropdownlocator);
		dropdown.selectByValue(VisibleText);
		
	}
	
	public static void ProvideCompanyNameToVerify(By dropdownlocator, String _testCompanyName)
	{
		//Type in test company name on Address in Profile Details
		PageBase.FindElement(dropdownlocator).sendKeys(_testCompanyName);
	}
	public static Boolean VerifyAddressDetailsInTheList(By _dropdownLocator,
													String _ListElementID, 
													String _companyName,
													String _name,
													String _address, 
													String _suburb, 
													String _phone)
		{
			String companyName, name, address, suburb, phone;
			Boolean AddressExists = false;
			//Type in test company name on Address in Profile Details
			ProvideCompanyNameToVerify(_dropdownLocator,_companyName);
			
			//get the xpath for the company name
			try 
			{
			//get the xpath for the company name
			String companyname_xpath = "//*[@id=\""+_ListElementID+"\"]//div[contains(text(),'"+_companyName+"')]";
			companyName = PageBase.FindElement(By.xpath(companyname_xpath)).getText();
			System.out.println("companyname_xpath is :" + companyname_xpath);
			System.out.println("company is :" + companyName);
			
			//get the xpath for the name
			//name = PageBase.FindElement(By.xpath("//*[@id=\""+_ListElementID+"\"]//div[contains(text(),'"+_name+"')]")).getText();
			//System.out.println(name);
			
			//get the xpath for the company address
			String address_xpath = "//*[@id=\""+_ListElementID+"\"]//div[contains(text(),'"+_address+"')]";
			address = PageBase.FindElement(By.xpath(address_xpath)).getText(); 
			System.out.println("address_xpath is :" + address_xpath);
			System.out.println("address is: "+ address);
			
			//get the xpath for the company suburb
			String suburb_xpath = "//*[@id=\""+_ListElementID+"\"]//div[contains(text(),'"+_suburb+"')]";
			suburb = PageBase.FindElement(By.xpath(suburb_xpath)).getText();
			System.out.println("suburb_xpath is :" + suburb_xpath);
			System.out.println("suburb is :" +suburb);
			
			//get the xpath for the company phone
			String phone_xpath = "//*[@id=\""+_ListElementID+"\"]//div[contains(text(),'"+_phone+"')]";
			phone = PageBase.FindElement(By.xpath(phone_xpath)).getText();
			System.out.println("phone_xpath is :" + phone_xpath);
			System.out.println("phone is : "+ phone);
			
			if(companyName == _companyName && 
				//name == _name &&
				address == _address &&
				suburb == _suburb &&
				phone == _phone)
			{
				AddressExists = true;
				Assert.assertTrue(AddressExists);
			}
			else
				Assert.assertTrue(false);
			
			
			
			} catch (Exception ex) 
			{
				Reporter.log("Verify Address Details In the List failed with : " + ex.getMessage());
				Assert.fail("Element not found" + ex.getMessage());
			}
			return AddressExists; 
			
		}
	
	public static List<WebElement> FindElements(By _locator)
	{
		List<WebElement> Elements = null;
		WebDriverWait wait = new WebDriverWait(BaseWebdriver.driver, 50);
				
		try {
			//Elements = BaseWebdriver.driver.findElements(_locator);
			Elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(_locator));
			return Elements;
		} catch (TimeoutException ex) 
		{
			logElementNotFound(ex);
			return Elements;
		}
		
	}
	
	public static void ClickElementFromTheList(List<WebElement> _elementsList, int _itemRank)
	{
		for(int i = 0; i< _elementsList.size(); i++)
		{
			if(i == _itemRank)
			{
				//_elementsList.get(i).click();
				click(_elementsList.get(i), 50);
				
				
			}
		}
	}

}
