package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CustumersRolePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Customer roles']")
	private static WebElement menuCustumerRoles;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNew1;

	@FindBy(how = How.ID, using = "Name")
	private static WebElement custumerRoleName;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Choose a product']")
	private static WebElement btnChooseProduct;

	@FindBy(how = How.ID, using = "AddProductToCustomerRoleModel_AssociatedToProductId")
	private static WebElement searchProductName;

	@FindBy(how = How.ID, using = "search-products")
	private static WebElement btnsearchProducs;

	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td[1]/button[1]")
	private static WebElement btnSelectProduct;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave1;

	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement newCustumerRolemessage;

	public CustumersRolePage() {
		super(Setup.getDriver());

	}

	public static WebElement getMenuCustumerRoles() {
		return menuCustumerRoles;
	}

	public static WebElement getBtnAddNew1() {
		return btnAddNew1;
	}

	public static WebElement getCustumerRoleName() {
		return custumerRoleName;
	}

	public static WebElement getBtnChooseProduct() {
		return btnChooseProduct;
	}

	public static WebElement getSearchProductName() {
		return searchProductName;
	}

	public static WebElement getBtnsearchProducts() {
		return btnsearchProducs;
	}

	public static WebElement getBtnSelectProduct() {
		return btnSelectProduct;
	}
	public static WebElement getBtnSave1() {
		return btnSave1;
	}
	public static WebElement getCustumerRoleMessage() {
		return newCustumerRolemessage;

	}
}

