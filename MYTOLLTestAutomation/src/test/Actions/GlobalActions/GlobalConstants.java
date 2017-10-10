package GlobalActions;

import org.openqa.selenium.By;


public interface GlobalConstants {

// Add Address
	public static final By BookAPickup_Location_Dropdown = By.xpath("//*[@id=\"location-selector\"]/label/a/i");
	public static final By BookAPickup_Location_Selected= By.name("placeholder-location");
	public static final By BookAPickup_Add_Address= By.className("add-new-elem");
	public static final By BookAPickup_New_AddressCompanName= By.id("add-adrr-company-aut");
	public static final By BookAPickup_New_AddressSearch= By.id("address-srch");
	public static final By BookAPickup_New_AddressSearch_Select= By.xpath("//*[@id=\"address-srch-wrpr\"]/div/ul/li[1]/div");
	public static final By BookAPickup_New_AddressSearch_Contine= By.id("addr-continue-autmatic");
	public static final By BookAPickup_New_Address_Name = By.id("add-addr-name");
	public static final By BookAPickup_New_Address_Number = By.id("add-addr-phone");
	public static final By BookAPickup_New_Address_Email = By.id("add-addr-email");
	public static final By BookAPickup_New_Address_DGName = By.id("add-addr-dg-contact-name");
	public static final By BookAPickup_New_Address_DGNumber = By.id("add-addr-dg-contact-phone");
	public static final By BookAPickup_New_Address_Add = By.id("add-address-btn-final");
	public static final By BookAPickup_CompanyName = By.id("name");
	
	public static final String NewAddressCompanyName = "Test";
	public static final String NewAddressCompanyAdd = "60 Collins Street, MELBOURNE VIC 3000";
	
	
}
