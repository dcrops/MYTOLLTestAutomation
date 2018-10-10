package steps.hooks;
import basewebdriver.BaseWebdriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class CucumberHooks 
{
	@Before
	public static void BeforeScenario(Scenario scenario)
	{
        System.out.println("\n");
		System.out.println("****************************SCENARIO BEGIN*********************************************");
		System.out.println(scenario.getName());
		System.out.println("***************************************************************************************");
        System.out.println("\n");
	}
	
	@After
	public static void AfterScenario()
	{
        System.out.println("\n");
		System.out.println("---------------------------------------END----------------------------------------------");
        System.out.println("\n");
		BaseWebdriver.driver.quit();
	}
	
}
