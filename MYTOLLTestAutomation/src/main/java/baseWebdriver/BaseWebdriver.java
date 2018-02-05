package baseWebdriver;

import GlobalActions.PageBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import myTollHomePageActions.MyTollHomePageActions;

public class BaseWebdriver {

	public static WebDriver driver;
	public static StringBuffer verificationErrors = new StringBuffer();

	public static String url="https://mytoll-per.tollgroup.com";
	public static String Username="perftest@toll.com";  //"auto_bvt@mailinator.com"; 

	public static String Password="Victoria@123"; 
	
	/*public static String url="https://www-ppd.mytoll.com/";
	public static String Username="NNAutomationuser1@gmail.com";  //"auto_bvt@mailinator.com"; 

	public static String Password="Toll@123"; */
	
	//Createshipment users
	public static String CreateshipmentTollTasUsername="NNAutomationuser1@gmail.com"; 
	public static String CreateshipmentTollTasPassword="tolTOL123!@#";
	
	//*[@id="service-type-selector"]/label/a/i
	
	@BeforeMethod
	public static void RunSetup(String browser) throws Exception {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Source\\chromedriver_win32\\chromedriver.exe");
			BaseWebdriver.driver = new ChromeDriver();
			MyTollHomePageActions.LaunchMyToll(url);
			MyTollHomePageActions.Login(BaseWebdriver.CreateshipmentTollTasUsername, BaseWebdriver.CreateshipmentTollTasPassword);
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Source\\geckodriver-v0.18.0-win32\\geckodriver.exe");
			BaseWebdriver.driver = new FirefoxDriver();
			PageBase.MaximumWaitForElementEnabled();
			MyTollHomePageActions.LaunchMyToll(url);
			PageBase.MaximumWaitForElementEnabled();
			MyTollHomePageActions.Login(BaseWebdriver.CreateshipmentTollTasUsername, BaseWebdriver.CreateshipmentTollTasPassword);
		}

		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Source\\IEDriverServer_Win32_2.39.0\\IEDriverServer.exe");
			BaseWebdriver.driver = new InternetExplorerDriver();
			PageBase.MaximumWaitForElementEnabled();
			MyTollHomePageActions.LaunchMyToll(url);
			PageBase.MaximumWaitForElementEnabled();
			MyTollHomePageActions.Login(BaseWebdriver.CreateshipmentTollTasUsername, BaseWebdriver.CreateshipmentTollTasPassword);
			PageBase.MaximumWaitForElementEnabled();
		}

		
		BaseWebdriver.driver.manage().window().maximize();

		/*  DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(CapabilityType.BROWSER_NAME, browser); 
		  webdriver =
		  new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);*/
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}


	@BeforeMethod
	public static void setUp() throws Exception {
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "C:\\Source\\chromedriver_win32 (2)\\chromedriver.exe");
		BaseWebdriver.driver = new ChromeDriver();

		MyTollHomePageActions.LaunchMyToll(url);
		BaseWebdriver.driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public static void tearDown() throws Exception {
		BaseWebdriver.driver.quit();
		//driver.close();

	}



}
