package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CostumersModifyVendorPage extends BasePage {



	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	private static WebElement menuCustumers;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Vendors']")
	private static WebElement menuVendors;

	@FindBy(how = How.ID, using = "SearchName")
	private static WebElement searchNameField;

	@FindBy(how = How.ID, using = "search-vendors")
	private static WebElement btnSearchVendors;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default']")
	private static WebElement btnEditVendors;

	@FindBy(how = How.ID, using = "Email")
	private static WebElement emailVendorsField;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave1;

	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement vendormodificationmessage;


	public CostumersModifyVendorPage() {
		super(Setup.getDriver());
	}

	public static WebElement getMenuCustumers() {
		return menuCustumers;
	}
	public static WebElement getMenuVendors() {
		return menuVendors;
	}
	public static WebElement getSearchNameField() {
		return searchNameField;
	}
	public static WebElement getBtnSearchVendors() {
		return btnSearchVendors;
	}

	public static WebElement getBtnEditVendors() {
		return btnEditVendors;
	}
	public static WebElement getEmailVendorsField() {
		return emailVendorsField;
	}
	public static WebElement getBtnSave1() {
		return btnSave1;
	}
	public static WebElement getVendorModMessage() {
		return vendormodificationmessage;
	}


}
