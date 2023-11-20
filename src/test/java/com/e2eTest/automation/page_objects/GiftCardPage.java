package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class GiftCardPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Sales']")
	private static WebElement menuSales;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Gift cards']")
	private static WebElement menuGiftCards;

	@FindBy(how = How.ID, using = "RecipientName")
	private static WebElement recipientNameField;

	@FindBy(how = How.ID, using = "search-giftcards")
	private static WebElement btnSearchGiftCards;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default']")
	private static WebElement btnEditRecipient;

	@FindBy(how = How.ID, using = "IsGiftCardActivated")
	private static WebElement caseActivationGiftCards;

	@FindBy(how = How.ID, using = "generateCouponCode")
	private static WebElement btnCodeGeneration;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSaveGiftCards;

	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement messageGiftCardSuccess;


	public GiftCardPage() {
		super(Setup.getDriver());
	}

		public static WebElement getMenuSales() {
			return menuSales;
	}
		public static WebElement getMenuGiftCards() {
			return menuGiftCards;

	}
		public static WebElement getRecipientNameField() {
			return recipientNameField;
		}
		public static WebElement getBtnSearchGiftCards() {
			return btnSearchGiftCards;
		}

		public static WebElement getBtnEditRecipient() {
			return btnEditRecipient;
		}

		public static WebElement getCaseActivationGiftCArds() {
			return caseActivationGiftCards;
		}
		public static WebElement getBtnCodeGeneration() {
			return btnCodeGeneration;
		}

		public static WebElement getBtnSAveGiftCards() {
			return btnSaveGiftCards;
		}
		public static WebElement getMessageGiftCardsSuccess() {
			return messageGiftCardSuccess;
		}
}
