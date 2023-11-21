package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class NewCompaignPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Promotions']")
	private static WebElement menuPromotions;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Campaigns']")
	private static WebElement menuCompaigns;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNew4;

	@FindBy(how = How.ID, using = "Name")
	private static WebElement compaignName;

	@FindBy(how = How.ID, using = "Subject")
	private static WebElement compaignSubject;

	@FindBy(how = How.ID, using = "Body")
	private static WebElement compaignDsecription;

	@FindBy(how = How.ID, using = "DontSendBeforeDate")
	private static WebElement compaignSendingDate;

	@FindBy(how = How.ID, using = "StoreId")
	private static WebElement compaignStore;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave4;

	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement messageNewCompaign;

	public NewCompaignPage() {
		super(Setup.getDriver());
	}

	public static WebElement getMenuPromotions() {
		return menuPromotions;
}
	public static WebElement getMenuCompaigns() {
		return menuCompaigns;
}
	public static WebElement getBtnAddNew4() {
		return btnAddNew4;
}
	public static WebElement getCompaignName() {
		return compaignName;

}
	public static WebElement getCompaignSubject() {
		return compaignSubject;
}
	public static WebElement getCompaignDescription() {
		return compaignDsecription;
}
	public static WebElement getCompaignSendingDate() {
		return compaignSendingDate;
}
	public static WebElement getCompaignStore() {
		return compaignStore;
}
	public static WebElement getBtnSave4() {
		return btnSave4;
}

	public static WebElement getMessageNewCompaign() {
		return messageNewCompaign;
}





}
