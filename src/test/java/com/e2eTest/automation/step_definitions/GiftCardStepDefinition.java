package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.GiftCardPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCardStepDefinition {
	private GiftCardPage giftCardsPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;

	public GiftCardStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		giftCardsPage = new GiftCardPage();
		validations = new Validations();
	}


	@When("Je clique sur le menu Sales")
	public void jeCliqueSurLeMenuSales() {
		seleniumUtils.click(GiftCardPage.getMenuSales());
	}
	@When("Je clique sur le menu Gift cards")
	public void jeCliqueSurLeMenuGiftCards() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(GiftCardPage.getMenuGiftCards());

	}
	@When("Je saisie le nom du client {string}")
	public void jeSaisieLeNomDuClient(String recipientNAme) {
		seleniumUtils.writeText(GiftCardPage.getRecipientNameField(), recipientNAme);
	}
	@When("Je clique sur le bouton Search3")
	public void jeCliqueSurLeBoutonSearch3() {
	  seleniumUtils.click(GiftCardPage.getBtnSearchGiftCards());
	}
	@When("Je clique sur le bouton Edit3")
	public void jeCliqueSurLeBoutonEdit3() {
		seleniumUtils.click(GiftCardPage.getBtnEditRecipient());
	}
	@When("Je coche la case pour activer la carte")
	public void jeCocheLaCasePourActiverLaCarte() {
		seleniumUtils.click(GiftCardPage.getCaseActivationGiftCArds());
	}
	@When("Je clique sur bouton Generate code")
	public void jeCliqueSurBoutonGenerateCode() {
		seleniumUtils.click(GiftCardPage.getBtnCodeGeneration());
	}
	@When("Je clique sur bouton Save")
	public void jeCliqueSurBoutonSave() {
		seleniumUtils.click(GiftCardPage.getBtnSAveGiftCards());
	}
	@Then("Je verifie que la carte a ete activer")
	public void jeVerifieQueLaCarteAEteActiver() {
	  validations.equals(GiftCardPage.getMessageGiftCardsSuccess());
	}







}
