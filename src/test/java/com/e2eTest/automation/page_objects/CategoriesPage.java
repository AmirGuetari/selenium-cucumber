package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CategoriesPage extends BasePage {


	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement btnCatalog;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement btnCategories;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNew;

	@FindBy(how = How.XPATH, using = "//input[@id='Name']")
	private static WebElement name;

	@FindBy(how = How.XPATH, using = "//body//p")
	private static WebElement description;

	@FindBy(how = How.ID, using = "ParentCategoryId")
	private static WebElement parentCategory;

	@FindBy(how = How.XPATH, using = "//input[@title='file input']")
	private static WebElement btnUpload;

	@FindBy(how = How.XPATH, using = "//li[@class='qq-file-id-0 qq-upload-success']")
	private static WebElement uploadSuccess;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave;

	public CategoriesPage() {
		super(Setup.getDriver());

	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}

	public static WebElement getBtnCatalog() {
		return btnCatalog;
	}

	public static WebElement getBtnCategories() {
		return btnCategories;
	}

	public static WebElement getBtnAddNew() {
		return btnAddNew;
	}

	public static WebElement getName() {
		return name;
	}

	public static WebElement getDescription() {
		return description;
	}

	public static WebElement getParentCategory() {
		return parentCategory;
	}

	public static WebElement getBtnUpLoad() {
		return btnUpload;
	}
	public static WebElement getUploadSuccess() {
		return uploadSuccess;
	}

	public static WebElement getBtnSave() {
		return btnSave;
	}
}
