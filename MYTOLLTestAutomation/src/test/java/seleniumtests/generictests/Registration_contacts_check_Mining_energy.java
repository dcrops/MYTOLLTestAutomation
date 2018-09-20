//test for MYT-3040
package GenericTests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Global.PageBase;
import baseWebdriver.BaseWebdriver;
import myTollHomePage.MyTollHomePageActions;

public class Registration_contacts_check_Mining_energy {
	
	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
	}
	@Test
	@Parameters({"ShipmentNo","EmailAddress1","EmailAddress2","EmailAddress3","EmailAddress4","EmailAddress5"})
	public void MiningcontactCheckTest() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(MyTollHomePageActions.contactUsIcon, 2);
		PageBase.click(MyTollHomePageActions.TollMiningContactUs, 2);

		//verifying the different Toll MINING CONTACTS texts for QLD-HO Brisbane, Gladstore, etc. 		
		String [] LocationListMining = {"QLD - HO Brisbane","QLD - Gladstone","QLD - Moranbah","QLD - Dysart (Onsite)","QLD - Helidon"
				,"PNG - Morobe Province","NSW - Tomago","NSW - Dubbo","NSW - Moree","NSW - Carrington","NSW - Myambat"
				,"SA - Olympic Dam","SA - ADC Adelaide Depot (BHPB GF)","WA - HO Perth","WA - Kalgoorlie","WA - Kewdale"
				,"WA - Port Hedland"};					//this doesn't check for 'Website" as the xpath for Website is different than the other xpaths. 
		
		for (int i=0; i<LocationListMining.length; i++) {
			System.out.println(LocationListMining.length);
			PageBase.verifyTextExist(By.xpath("//*[@id=\"contact-acdn\"]//*//*//*//div[text()= '"+LocationListMining[i]+"']"), LocationListMining[i]);
		}
	
		PageBase.verifyTextExist(MyTollHomePageActions.WebsiteContactUs, "Website");
		
		String[] PhoneListMining = {"(07) 3635 4826","(07) 4836 9500","(07) 4813 7000","(07) 4958 1323","(07) 4612 9100","(07) 7199 2450","(02) 4013 2200",
				"(02) 6882 0299","(02) 6752 1300","(02) 4962 7800","(02) 65471061","(08) 8671 0336","1300 113 542","(08) 9318 2900",
				"(08) 9080 9800","(08) 9352 6600","(08) 9172 1951"};
		for (int i =0; i<PhoneListMining.length; i++)
		{
		PageBase.verifyTextExist(By.xpath("//*[@id=\"contact-acdn\"]/div[4]//*//div[2]/a[text()='"+PhoneListMining[i]+"']"), PhoneListMining[i]);			
		}
	}
	
	
		@Test
		public void EnergycontactCheckTest() {
		PageBase.MaximumWaitForElementEnabled();
		PageBase.click(MyTollHomePageActions.contactUsIcon, 2);
		PageBase.click(MyTollHomePageActions.TollEnergyContactUs, 2);
		
		String [] LocationListEnergy = {"WA - Perth National Office","WA - Dampier","WA - Forrestfield","NT - Darwin","QLD - Karawatha",
				"VIC - Dandenong","VIC - Sale","SA - Gillman","SA - RDC - Santos"};					//this doesn't check for 'Website" as the xpath for Website is different than the other xpaths. 
		
		for (int i=0; i<LocationListEnergy.length; i++) {
			System.out.println(LocationListEnergy.length);
			PageBase.verifyTextExist(By.xpath("//*[@id=\"contact-acdn\"]//*//*//*//div[text()= '"+LocationListEnergy[i]+"']"), LocationListEnergy[i]);
		}
	
		PageBase.verifyTextExist(MyTollHomePageActions.WebsiteContactUs2, "Website");
		
		String[] PhoneListEnergy = {"(08) 9346 0400","(08) 9186 8700","(08) 9210 2640","(08) 8980 3800","(07) 3089 7020","(03) 8710 1200","(03) 5144 6322",
				"(08) 7425 1100","1800 550 202"};
		
		for (int i =0; i<PhoneListEnergy.length; i++)
		{
		PageBase.verifyTextExist(By.xpath("//*[@id=\"contact-acdn\"]/div[1]/div[2]//*//*//a[text()='"+PhoneListEnergy[i]+"']"), PhoneListEnergy[i]);			
		}
	}
	
//verifying the different Toll ENERGY CONTACTS texts
	

	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();

	}
}
