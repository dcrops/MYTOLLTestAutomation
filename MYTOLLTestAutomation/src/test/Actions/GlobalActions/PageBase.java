package GlobalActions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
			Thread.sleep(3000);

		}

		catch (Exception ex) {
			System.out.println(ex);

		}
	}

	public static void MediumWaitForElementEnabled() {
		try {
			Thread.sleep(1500);

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

}
