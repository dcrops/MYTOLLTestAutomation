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

	public static final String URL;

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


	static {

		Properties properties = new Properties();
		Properties envProperties = new Properties();

		try {
			FileInputStream config = new FileInputStream("config.properties");
			properties.load(config);

			FileInputStream envConfig = new FileInputStream(properties.getProperty("ActiveEnvironment") + ".properties");
			envProperties.load(envConfig);
		} catch (IOException e) {
			e.printStackTrace();
		}


/*		PreprodUrl = envProperties.getProperty("PreprodUrl");
		PerformenceUrl = envProperties.getProperty("PerformenceUrl");
		SitUrl = envProperties.getProperty("SitUrl");
		PSURL = envProperties.getProperty("PSURL");
		SalesForce = properties.getProperty("SalesForce");*/

		Username1 = envProperties.getProperty("Username1");
		Username2 = envProperties.getProperty("Username2");
		SitUsername1 = envProperties.getProperty("SitUsername1");
		SitUsername2 = envProperties.getProperty("SitUsername2");
		SitUsername3 = envProperties.getProperty("SitUsername3");
		SitUsername4 = envProperties.getProperty("SitUsername4");
		SitUsername5 = envProperties.getProperty("SitUsername5");
		Password = envProperties.getProperty("Password");
		AdminUser = envProperties.getProperty("AdminUser");
		AdminPassword = envProperties.getProperty("AdminPassword");

        URL = envProperties.getProperty("URL");

		System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome"));
		System.setProperty("webdriver.gecko.driver", properties.getProperty("firefox"));
		System.setProperty("webdriver.ie.driver", properties.getProperty("ie"));

	}

	@BeforeMethod
	public static void RunSetup(String browser) throws Exception {

		if (browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Source\\chromedriver_win32 (4)\\chromedriver.exe");
			BaseWebdriver.driver = new ChromeDriver();
			BaseWebdriver.driver.manage().window().maximize();
		//	MyTollHomePageActions.LaunchMyToll(PreprodUrl);
			//MyTollHomePageActions.Login(Username1, Password);
		}

		else  if (browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\Source\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			BaseWebdriver.driver = new FirefoxDriver();
			PageBase.MaximumWaitForElementEnabled();
			//MyTollHomePageActions.LaunchMyToll(PreprodUrl);
			PageBase.MaximumWaitForElementEnabled();
			//MyTollHomePageActions.Login(Username1, Password);
		}

		else if (browser.equalsIgnoreCase("ie")) {
			//System.setProperty("webdriver.ie.driver", "C:\\Source\\IEDriverServer_Win32_3.12.0\\IEDriverServer.exe");
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
		MyTollHomePageActions.LaunchMyToll(URL);

		PageBase.MaximumWaitForElementEnabled();
		BaseWebdriver.driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	}

	@BeforeMethod
	public static void setUp() throws Exception {

		//System.setProperty("webdriver.chrome.driver", "C:\\Source\\chromedriver_win32 (4)\\chromedriver.exe");
		BaseWebdriver.driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Source\\IEDriverServer_Win32_2.39.0\\IEDriverServer.exe");
		//BaseWebdriver.driver = new InternetExplorerDriver();
		MyTollHomePageActions.LaunchMyToll(URL);
//		SetUsernameAndPasswordBasedOnEnv(PSURL);

		/*PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();
		PageBase.MaximumWaitForElementEnabled();*/
		BaseWebdriver.driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}


//	public static void LaunchSalesforce() throws Exception {
//
//		MyTollHomePageActions.LaunchMyToll(SalesForce);
//
//		PageBase.MaximumWaitForElementEnabled();
//		BaseWebdriver.driver.manage().window().maximize();
//
//	}

/*	public static void SetUsernameAndPasswordBasedOnEnv(String _selectedURL)
	{
		if (_selectedURL.equalsIgnoreCase(SitUrl) || _selectedURL.equalsIgnoreCase(PreprodUrl) )
		{
			// Preprod users - Change accordingly to the Enviornments
						Username1= "SitAutomationuser@mailinator.com";
						Username2="auto_bvt_ppd@mailinator.com";
						SitUsername1="SitAutomationuser@mailinator.com";
						SitUsername2= "SitAutomationuser2@mailinator.com";
						SitUsername3="SitAutomationuser3@mailinator.com";
						SitUsername4="SitAutomationuser4@mailinator.com";
						SitUsername5="SitAutomationuser5@mailinator.com";
		}
		else if(_selectedURL.equalsIgnoreCase(PSURL))
		{
			//PS Users list
			Username1= "SitAutomationuser1_ps@mailinator.com";
			Username2="auto_bvt1_ps@mailinator.com";
			SitUsername1="SitAutomationuser1_ps@mailinator.com";
			SitUsername2= "SitAutomationuser2_ps@mailinator.com";
			SitUsername3="SitAutomationuser3_ps@mailinator.com";
			SitUsername4="SitAutomationuser4_ps@mailinator.com";
			SitUsername5="SitAutomationuser5_ps@mailinator.com";
		}
	}*/

	public static WebDriver GetDriver()
	{
		return driver;
	}


	@AfterMethod
	public static void tearDown() throws Exception {
	BaseWebdriver.driver.quit();
		//BaseWebdriver.driver.close();

	}



}
