package GlobalActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import baseWebdriver.BaseWebdriver;

public class PageBase {

	public static boolean retryingFindClick(By by) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				BaseWebdriver.driver.findElement(by).click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
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

	public static WebElement waitForElement(WebElement element, int secsToWait) {
		return (new WebDriverWait(BaseWebdriver.driver, secsToWait)).until(ExpectedConditions.visibilityOf(element));
	}

	public static boolean sendKeysToElement(WebElement elementToWaitFor, int secsToWait, String keysToSend) {
		try {
			WebElement element = waitForElement(elementToWaitFor, secsToWait);
			element.sendKeys(keysToSend);
		} catch (TimeoutException ex) {
			logElementNotFound(ex);
			return false;
		}

		return true;
	}

	// When an element is not found sets two levels of logging and sets found =
	// false
	private static void logElementNotFound(TimeoutException ex) {
		System.out.print("Element was not returned in a timely manner");

	}

	public static boolean findElement(WebElement element, int secsToWait) {
		try {
			waitForElement(element, secsToWait);
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

	public static void ElementToBeClickableWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BaseWebdriver.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void MaximumWaitForElementEnabled() {
		try {
			Thread.sleep(1000);

		}

		catch (Exception ex) {
			System.out.println(ex);

		}
	}

	public static void MediumWaitForElementEnabled() {
		try {
			Thread.sleep(1000);

		}

		catch (Exception ex) {
			System.out.println(ex);

		}
	}

	public static void MinimumWaitForElementEnabled() {
		try {
			Thread.sleep(500);

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

	

	public static WebElement waitForElement(By locator, int waitSeconds) {
		WebElement we = null;
		try {
			we = (WebElement) (new WebDriverWait(BaseWebdriver.driver, waitSeconds))
				.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (TimeoutException e) {
			System.out.println("xpath not found: " + locator +"<br>");
			Reporter.log("xpath not found: " + locator +"<br>");
			return null;
		}
		return we;
	}
	
	
	public static void sendText(By locator, int secsToWait, String keysToSend) {
		try {
			WebElement element = waitForElement(locator,secsToWait);
			element.clear();
			element.sendKeys(keysToSend);
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
	
	public static void verifyTextExist(By locator, String expectedText){
		try {
			String getText = BaseWebdriver.driver.findElement(locator).getText();
			
			if (getText.equals(expectedText)){
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

	public static void moveToElement(By locator){
		try {
			WebElement element = BaseWebdriver.driver.findElement(locator);
			((JavascriptExecutor) BaseWebdriver.driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
		}
		catch (Exception e) {
			System.out.println("element with: " + locator.toString() + " not found");
			Reporter.log("element with: " + locator.toString() + " not found" +"<br>");
			Assert.fail("element with: " + locator.toString() + " not found" +"<br>");
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
	
	public static WebElement click(By locator, int waitSeconds) {
		WebDriverWait wait = new WebDriverWait(BaseWebdriver.driver, waitSeconds);
		WebElement we = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		if (we == null) {
			//logger.warn("elemet with: " + locator.toString() + " not found");
			Reporter.log("element with: " + locator.toString() + " not found" +"<br>");
			Assert.fail("element with: " + locator.toString() + " not found" +"<br>");
			//return null;
		}
		we.click();
		return we;
	}

	
}
