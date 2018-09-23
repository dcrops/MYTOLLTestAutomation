package basewebdriver;

import global.PageBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import mytollhomepage.MyTollHomePageActions;

public class BaseWebdriver {

	public static WebDriver driver;
	public static StringBuffer verificationErrors = new StringBuffer();


	public static final String PreprodUrl;
	public static final String PerformenceUrl;
	public static final String SitUrl;
	public static final String PSURL;
	public static final String SalesForce;

	// Preprod users - Change accordingly to the Enviornments
	public static final String Username1;
	public static final String Username2;
	public static final String SitUsername1;
	public static final String SitUsername2;
	public static final String SitUsername3;
	public static final String SitUsername4;
	public static final String SitUsername5;
	

	//Passwords
	public static final String Password;
	

	//Nishant
	public static final String AdminUser;
	public static final String AdminPassword;

	public static final String Environment;

	static {

		Properties properties = new Properties();
		FileInputStream config = null;

		try {
			config = new FileInputStream("config.properties");
			properties.load(config);
		} catch (IOException e) {
			e.printStackTrace();
		}

		PreprodUrl = properties.getProperty("PreprodUrl");
		PerformenceUrl = properties.getProperty("PerformenceUrl");
		SitUrl = properties.getProperty("SitUrl");
		PSURL = properties.getProperty("PSURL");
		SalesForce = properties.getProperty("SalesForce");
		Username1 = properties.getProperty("Username1");
		Username2 = properties.getProperty("Username2");
		SitUsername1 = properties.getProperty("SitUsername1");
		SitUsername2 = properties.getProperty("SitUsername2");
		SitUsername3 = properties.getProperty("SitUsername3");
		SitUsername4 = properties.getProperty("SitUsername4");
		SitUsername5 = properties.getProperty("SitUsername5");
		Password = properties.getProperty("Password");
		AdminUser = properties.getProperty("AdminUser");
		AdminPassword = properties.getProperty("AdminPassword");

		Environment = properties.getProperty(properties.getProperty("ActiveEnvironment"));
		System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome"));

	}
	
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
		MyTollHomePageActions.LaunchMyToll(Environment);

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
	BaseWebdriver.driver.quit();
		//BaseWebdriver.driver.close();

	}



}
