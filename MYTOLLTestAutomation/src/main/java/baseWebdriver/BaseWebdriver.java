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
	public static String SitUrl= "https://www-ppd.mytoll.com/"; 
	public static String PSURL = "https://ps.mytoll.com/";
	public static String SalesForce= "https://test.salesforce.com/"; 

	// Preprod users
	public static String Username1= "SitAutomationuser@mailinator.com"; //"SitAutomationuser@yahoo.com"; 
	
	//BU Admin users
	public static String Username2="auto_bvt_ppd@mailinator.com";// "auto_bvt_ps@mailinator.com"; 
	public static String Username2_new = "auto_bvt_ps@mailinator.com";
	public static String SitUsername1="SitAutomationuser@mailinator.com"; //"SitAutomationuser@yahoo.com"; 
	public static String PSUsername = "auto_bvt_ps@mailinator.com";
	
	
	//Platform admin user
	public static String SitUsername2= "SitAutomationuser2@mailinator.com"; //"SitAutomationuser2@yahoo.com"; 

	//Sit Normal users
	public static String SitUsername3="SitAutomationuser3@mailinator.com"; //"SitAutomationuser3@yahoo.com"; 
	public static String SitUsername4="SitAutomationuser4@mailinator.com"; //"SitAutomationuser4@yahoo.com"; 		
	//Performance Test Env user
	public static String PerformenceUsername1="perftest@toll.com";
	
	//Passwords
	public static String Password="Toll@12345"; 
	public static String Password_new = "Toll@123";
	public static String PerformancePassword="Victoria@123"; 
	public static String SalesforcePassword="tolTOL987(*&$";
	public static String PSPassword = "Toll@123";
	
	//Salesforce 
	public static String SalesforceUser="nadiki.perera@tollgroup.com.tollperf";
	
	
	@BeforeMethod
	public static void RunSetup(String browser) throws Exception {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Source\\chromedriver_win32 (4)\\chromedriver.exe");
			BaseWebdriver.driver = new ChromeDriver();
			BaseWebdriver.driver.manage().window().maximize();
		//	MyTollHomePageActions.LaunchMyToll(PreprodUrl);
			//MyTollHomePageActions.Login(Username1, Password);
		}

		else  if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Source\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			BaseWebdriver.driver = new FirefoxDriver();
			PageBase.MaximumWaitForElementEnabled();
			//MyTollHomePageActions.LaunchMyToll(PreprodUrl);
			PageBase.MaximumWaitForElementEnabled();
			//MyTollHomePageActions.Login(Username1, Password);
		}

		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Source\\IEDriverServer_Win32_3.12.0\\IEDriverServer.exe");
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
		BaseWebdriver.driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}

	@BeforeMethod
	public static void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Source\\chromedriver_win32 (4)\\chromedriver.exe");
		BaseWebdriver.driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Source\\IEDriverServer_Win32_2.39.0\\IEDriverServer.exe");
		//BaseWebdriver.driver = new InternetExplorerDriver();
		MyTollHomePageActions.LaunchMyToll(SitUrl);

		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public static void LaunchSalesforce() throws Exception {
		
		MyTollHomePageActions.LaunchMyToll(SalesForce);

		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.manage().window().maximize();
		
	}
	

	@AfterMethod
	public static void tearDown() throws Exception {
	//BaseWebdriver.driver.quit();
		BaseWebdriver.driver.close();

	}



}
