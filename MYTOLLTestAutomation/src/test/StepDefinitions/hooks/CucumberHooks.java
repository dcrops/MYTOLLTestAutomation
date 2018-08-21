package hooks;
import baseWebdriver.BaseWebdriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class CucumberHooks 
{
	@Before
	public static void BeforeScenario(Scenario scenario)
	{
		System.out.println("****************************SCENARIO BEGIN*********************************************");
		System.out.println(scenario.getName());
		System.out.println("***************************************************************************************");
	}
	
	@After
	public static void AfterScenario()
	{
		System.out.println("---------------------------------------END----------------------------------------------");
		BaseWebdriver.driver.quit();
	}
	
}
