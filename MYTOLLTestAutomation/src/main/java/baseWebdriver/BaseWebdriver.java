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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import myTollHomePageActions.MyTollHomePageActions;

public class BaseWebdriver {

	public static WebDriver driver;
	public static StringBuffer verificationErrors = new StringBuffer();


	public static String PreprodUrl="https://www-ppd.mytoll.com/";  
	public static String PerformenceUrl="https://mytoll-per.tollgroup.com";   
	public static String SitUrl="https://ps.mytoll.com/"; 
	
	public static String Username1="SitAutomationuser@yahoo.com"; //"NNAutomationuser1@gmail.com"; 
	public static String Username2= "auto_bvt_ps@mailinator.com"; 
	public static String SitUsername1="SitAutomationuser@yahoo.com"; //
	public static String PerformenceUsername1="perftest@toll.com";
	public static String Password="Toll@123";  
	public static String PerformancePassword="Victoria@123"; 

	
	@BeforeMethod
	public static void RunSetup(String browser) throws Exception {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Source\\chromedriver_win32 (2)\\chromedriver.exe");
			BaseWebdriver.driver = new ChromeDriver();
			BaseWebdriver.driver.manage().window().maximize();
		//	MyTollHomePageActions.LaunchMyToll(PreprodUrl);
			//MyTollHomePageActions.Login(Username1, Password);
		}

		else  if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Source\\geckodriver-v0.18.0-win32\\geckodriver.exe");
			BaseWebdriver.driver = new FirefoxDriver();
			PageBase.MaximumWaitForElementEnabled();
			//MyTollHomePageActions.LaunchMyToll(PreprodUrl);
			PageBase.MaximumWaitForElementEnabled();
			//MyTollHomePageActions.Login(Username1, Password);
		}

		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Source\\IEDriverServer_Win32_2.39.0\\IEDriverServer.exe");
			BaseWebdriver.driver = new InternetExplorerDriver();
			PageBase.MaximumWaitForElementEnabled();
			BaseWebdriver.driver.manage().window().maximize();
			//MyTollHomePageActions.LaunchMyToll(PreprodUrl);
			PageBase.MaximumWaitForElementEnabled();
			//MyTollHomePageActions.Login(Username1, Password);
			PageBase.MaximumWaitForElementEnabled();
		}

		
		//BaseWebdriver.driver.manage().window().maximize();

		/*  DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(CapabilityType.BROWSER_NAME, browser); 
		  webdriver =
		  new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);*/
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}

	@BeforeMethod
	public static void SetUp(String browser) throws Exception {
		RunSetup(browser);
		MyTollHomePageActions.LaunchMyToll(SitUrl);

		PageBase.MaximumWaitForElementEnabled();
		//BaseWebdriver.driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@BeforeMethod
	public static void setUp() throws Exception {
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "C:\\Source\\chromedriver_win32 (2)\\chromedriver.exe");
		BaseWebdriver.driver = new ChromeDriver();

		MyTollHomePageActions.LaunchMyToll(SitUrl);

		PageBase.MaximumWaitForElementEnabled();
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
