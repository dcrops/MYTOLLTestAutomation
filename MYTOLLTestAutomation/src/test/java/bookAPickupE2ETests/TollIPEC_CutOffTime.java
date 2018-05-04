package bookAPickupE2ETests;

import GlobalActions.PageBase;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import bookAPickupActions.BookAPickupActions;
import manifestActions.ManifestActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseWebdriver.BaseWebdriver;
import myTollHomePageActions.MyTollHomePageActions;
import reviewYourPickupActions.ReviewYourPickupActions;


public class TollIPEC_CutOffTime {

	public static Integer locationIndex = 4;


	
	
	

	@BeforeMethod
	public void RunSetup() throws Exception {
		BaseWebdriver.setUp();
		MyTollHomePageActions.Login(BaseWebdriver.Username2, BaseWebdriver.Password);
		MyTollHomePageActions.ClickMenu();
		MyTollHomePageActions.ClickBookAPIckupMenu();

	}

	
	//ACT ZONE CUT OFF TIME CHECK
	
	@Test
	@Parameters({ "TollCarrierTollIPEC", "ServicePriority", "locationIndex", "ItemTemplateName", "NumberOfItems",
		"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns",  "IPECACTAddress1" })
	public void IPEC_CutOffTime_ACT_01(String TollCarrier, String ServicePriority,
			Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
			String Height, String Weight, String palletSpace, String destination, String specialIns, String ACTAddress1) {

		BookAPickupActions.EnterTollCarrier(TollCarrier);
		//Select Account
		BookAPickupActions.SelectAccountNumber1();
		PageBase.MaximumWaitForElementEnabled();
		
		//Add Address
		BookAPickupActions.addAdderess(ACTAddress1);
		
		BookAPickupActions.EnterService(ServicePriority);
		BookAPickupActions.SelectDestination(destination);
		BookAPickupActions.SelectLargestItem(1);

		BookAPickupActions.EnterQuantity(NumberOfItems);

		BookAPickupActions.EnterWeight(Weight);
		BookAPickupActions.SelectDangerousGoods(2);

		// Enter Pickup details
		BookAPickupActions.selectDispatchDate();
		//User Enters time after Cut off	
		ManifestActions.selectReadyTimeJS("15:15");
		Reporter.log("User Clicks Review Book Up");
		BookAPickupActions.ClickReviewBook();
		PageBase.MaximumWaitForElementEnabled_1();
		PageBase.verifyTextExist(BookAPickupActions.cutOfftimeErrorMsg, "Current carrier does not allow pickup after 1500");
		}
	
	
	//NSW ZONE CUT OFF TIME CHECK
	
		@Test
		@Parameters({ "TollCarrierTollIPEC", "ServiceRoadExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns", "IPECNSWAddress1" })
		public void IPEC_CutOffTime_NSW_01(String TollCarrier, String ServiceRoadExpress,
				Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
				String Height, String Weight, String palletSpace, String destination, String specialIns, String NSWAddress1) {

			BookAPickupActions.EnterTollCarrier(TollCarrier);
			//Select Account
			BookAPickupActions.SelectAccountNumber1();
			PageBase.MaximumWaitForElementEnabled();
			
			//Add Address
			BookAPickupActions.addAdderess(NSWAddress1);
			
			BookAPickupActions.EnterService(ServiceRoadExpress);
			BookAPickupActions.SelectDestination(destination);
			BookAPickupActions.SelectLargestItem(1);

			BookAPickupActions.EnterQuantity(NumberOfItems);

			BookAPickupActions.EnterWeight(Weight);
			BookAPickupActions.SelectDangerousGoods(2);

			// Enter Pickup details
			BookAPickupActions.selectDispatchDate();
			//User Enters time after Cut off	
			ManifestActions.selectReadyTimeJS("15:15");
			Reporter.log("User Clicks Review Book Up");
			BookAPickupActions.ClickReviewBook();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExist(BookAPickupActions.cutOfftimeErrorMsg, "Current carrier does not allow pickup after 1500");
			}
		
		
		//NT ZONE CUT OFF TIME CHECK
		
		@Test
		@Parameters({ "TollCarrierTollIPEC", "ServicePriority", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns", "IPECNTAddress1" })
		public void IPEC_CutOffTime_NT_01(String TollCarrier, String ServicePriority,
				Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
				String Height, String Weight, String palletSpace, String destination, String specialIns, String NTAddress1) {

			BookAPickupActions.EnterTollCarrier(TollCarrier);
			//Select Account
			BookAPickupActions.SelectAccountNumber1();
			PageBase.MaximumWaitForElementEnabled();
			
			//Add Address
			BookAPickupActions.addAdderess(NTAddress1);
			
			BookAPickupActions.EnterService(ServicePriority);
			BookAPickupActions.SelectDestination(destination);
			BookAPickupActions.SelectLargestItem(1);

			BookAPickupActions.EnterQuantity(NumberOfItems);

			BookAPickupActions.EnterWeight(Weight);
			BookAPickupActions.SelectDangerousGoods(2);

			// Enter Pickup details
			BookAPickupActions.selectDispatchDate();
			//User Enters time after Cut off	
			ManifestActions.selectReadyTimeJS("15:15");
			Reporter.log("User Clicks Review Book Up");
			BookAPickupActions.ClickReviewBook();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExist(BookAPickupActions.cutOfftimeErrorMsg, "Current carrier does not allow pickup after 1500");
			}
		
		
		//QLD ZONE CUT OFF TIME CHECK
		
		@Test
		@Parameters({ "TollCarrierTollIPEC", "ServiceRoadExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns", "IPECQLDAddress1" })
		public void IPEC_CutOffTime_QLD_01(String TollCarrier, String ServiceRoadExpress,
				Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
				String Height, String Weight, String palletSpace, String destination, String specialIns, String QLDAddress1) {

			BookAPickupActions.EnterTollCarrier(TollCarrier);
			//Select Account
			BookAPickupActions.SelectAccountNumber1();
			PageBase.MaximumWaitForElementEnabled();
			
			//Add Address
			BookAPickupActions.addAdderess(QLDAddress1);
			
			BookAPickupActions.EnterService(ServiceRoadExpress);
			BookAPickupActions.SelectDestination(destination);
			BookAPickupActions.SelectLargestItem(1);

			BookAPickupActions.EnterQuantity(NumberOfItems);

			BookAPickupActions.EnterWeight(Weight);
			BookAPickupActions.SelectDangerousGoods(2);

			// Enter Pickup details
			BookAPickupActions.selectDispatchDate();
			//User Enters time after Cut off	
			ManifestActions.selectReadyTimeJS("15:15");
			Reporter.log("User Clicks Review Book Up");
			BookAPickupActions.ClickReviewBook();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExist(BookAPickupActions.cutOfftimeErrorMsg, "Current carrier does not allow pickup after 1500");
			}
		
		
		//SA ZONE CUT OFF TIME CHECK
		
		@Test
		@Parameters({ "TollCarrierTollIPEC", "ServicePriority", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns", "IPECSAAddress1" })
		public void IPEC_CutOffTime_SA_01(String TollCarrier, String ServicePriority,
				Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
				String Height, String Weight, String palletSpace, String destination, String specialIns, String SAAddress1) {

			BookAPickupActions.EnterTollCarrier(TollCarrier);
			//Select Account
			BookAPickupActions.SelectAccountNumber1();
			PageBase.MaximumWaitForElementEnabled();
			
			//Add Address
			BookAPickupActions.addAdderess(SAAddress1);
			
			BookAPickupActions.EnterService(ServicePriority);
			BookAPickupActions.SelectDestination(destination);
			BookAPickupActions.SelectLargestItem(1);

			BookAPickupActions.EnterQuantity(NumberOfItems);

			BookAPickupActions.EnterWeight(Weight);
			BookAPickupActions.SelectDangerousGoods(2);

			// Enter Pickup details
			BookAPickupActions.selectDispatchDate();
			//User Enters time after Cut off	
			ManifestActions.selectReadyTimeJS("15:15");
			Reporter.log("User Clicks Review Book Up");
			BookAPickupActions.ClickReviewBook();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExist(BookAPickupActions.cutOfftimeErrorMsg, "Current carrier does not allow pickup after 1500");
			}
		
		
		//TAS ZONE CUT OFF TIME CHECK
		
		@Test
		@Parameters({ "TollCarrierTollIPEC", "ServiceRoadExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns", "IPECTASAddress1" })
		public void IPEC_CutOffTime_TAS_01(String TollCarrier, String ServiceRoadExpress,
				Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
				String Height, String Weight, String palletSpace, String destination, String specialIns, String TASAddress1) {

			BookAPickupActions.EnterTollCarrier(TollCarrier);
			//Select Account
			BookAPickupActions.SelectAccountNumber1();
			PageBase.MaximumWaitForElementEnabled();
			
			//Add Address
			BookAPickupActions.addAdderess(TASAddress1);
			
			BookAPickupActions.EnterService(ServiceRoadExpress);
			BookAPickupActions.SelectDestination(destination);
			BookAPickupActions.SelectLargestItem(1);

			BookAPickupActions.EnterQuantity(NumberOfItems);

			BookAPickupActions.EnterWeight(Weight);
			BookAPickupActions.SelectDangerousGoods(2);

			// Enter Pickup details
			BookAPickupActions.selectDispatchDate();
			//User Enters time after Cut off	
			ManifestActions.selectReadyTimeJS("15:15");
			Reporter.log("User Clicks Review Book Up");
			BookAPickupActions.ClickReviewBook();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExist(BookAPickupActions.cutOfftimeErrorMsg, "Current carrier does not allow pickup after 1500");
			}
		
		
		//VIC ZONE CUT OFF TIME CHECK
		
		@Test
		@Parameters({ "TollCarrierTollIPEC", "ServicePriority", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns", "IPECVICAddress1" })
		public void IPEC_CutOffTime_VIC_01(String TollCarrier, String ServicePriority,
				Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
				String Height, String Weight, String palletSpace, String destination, String specialIns, String VICAddress1) {

			BookAPickupActions.EnterTollCarrier(TollCarrier);
			//Select Account
			BookAPickupActions.SelectAccountNumber1();
			PageBase.MaximumWaitForElementEnabled();
			
			//Add Address
			BookAPickupActions.addAdderess(VICAddress1);
			
			BookAPickupActions.EnterService(ServicePriority);
			BookAPickupActions.SelectDestination(destination);
			BookAPickupActions.SelectLargestItem(1);

			BookAPickupActions.EnterQuantity(NumberOfItems);

			BookAPickupActions.EnterWeight(Weight);
			BookAPickupActions.SelectDangerousGoods(2);

			// Enter Pickup details
			BookAPickupActions.selectDispatchDate();
			//User Enters time after Cut off	
			ManifestActions.selectReadyTimeJS("15:15");
			Reporter.log("User Clicks Review Book Up");
			BookAPickupActions.ClickReviewBook();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExist(BookAPickupActions.cutOfftimeErrorMsg, "Current carrier does not allow pickup after 1500");
			}
		
		
		//WA ZONE CUT OFF TIME CHECK
		
		@Test
		@Parameters({ "TollCarrierTollIPEC", "ServiceRoadExpress", "locationIndex", "ItemTemplateName", "NumberOfItems",
			"Length", "Width", "Height", "Weight", "palletSpace", "Destination", "specialIns", "IPECWAAddress1"})
		public void IPEC_CutOffTime_WA_01(String TollCarrier, String ServiceRoadExpress,
				Integer locationIndex, String ItemTemplateName, String Length, String NumberOfItems, String Width,
				String Height, String Weight, String palletSpace, String destination, String specialIns, String WAAddress1) {

			BookAPickupActions.EnterTollCarrier(TollCarrier);
			//Select Account
			BookAPickupActions.SelectAccountNumber1();
			PageBase.MaximumWaitForElementEnabled();
			
			//Add Address
			BookAPickupActions.addAdderess(WAAddress1);
			
			BookAPickupActions.EnterService(ServiceRoadExpress);
			BookAPickupActions.SelectDestination(destination);
			BookAPickupActions.SelectLargestItem(1);

			BookAPickupActions.EnterQuantity(NumberOfItems);

			BookAPickupActions.EnterWeight(Weight);
			BookAPickupActions.SelectDangerousGoods(2);

			// Enter Pickup details
			BookAPickupActions.selectDispatchDate();
			//User Enters time after Cut off	
			ManifestActions.selectReadyTimeJS("15:15");
			Reporter.log("User Clicks Review Book Up");
			BookAPickupActions.ClickReviewBook();
			PageBase.MaximumWaitForElementEnabled_1();
			PageBase.verifyTextExist(BookAPickupActions.cutOfftimeErrorMsg, "Current carrier does not allow pickup after 1500");
			}

	
	
	
	

	@AfterMethod
	public void RunTearDown() throws Exception {
		BaseWebdriver.tearDown();
	}

}
