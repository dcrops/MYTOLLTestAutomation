package FinanceActions;

import org.openqa.selenium.By;

import GlobalActions.PageBase;
import baseWebdriver.BaseWebdriver;

public class FinanceActions {
	
	public static By FinanceMegaMenu = By.xpath("//*[@id=\"my-finance\"]/p");
	
	
	public static void ClickFinance() {
		PageBase.ClickOn(FinanceMegaMenu, 5);

	}
	
	
	
	
	

}

