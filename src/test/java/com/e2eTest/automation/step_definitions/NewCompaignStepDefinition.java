package com.e2eTest.automation.step_definitions;

import org.openqa.selenium.support.ui.Select;

import com.e2eTest.automation.page_objects.NewCompaignPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewCompaignStepDefinition {
	private NewCompaignPage newCompaignPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;

	public NewCompaignStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		newCompaignPage = new NewCompaignPage();
		validations = new Validations();
	}

	@When("Je clique sur le menu Promotions")
	public void jeCliqueSurLeMenuPromotions() {
		seleniumUtils.click(NewCompaignPage.getMenuPromotions());
	}
	@When("Je clique sur la commande Compaigns")
	public void jeCliqueSurLaCommandeCompaigns() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(NewCompaignPage.getMenuCompaigns());
	}
	@When("Je clique sur le bouton Add new4")
	public void jeCliqueSurLeBoutonAddNew4() {
		seleniumUtils.click(NewCompaignPage.getBtnAddNew4());
	}
	@When("Je saisis le nom de la compagne {string}")
	public void jeSaisisLeNomDeLaCompagne(String CompaignName) {
		seleniumUtils.writeText(NewCompaignPage.getCompaignName(), CompaignName);
	}
	@When("Je saisis le sujet de la compagne {string}")
	public void jeSaisisLeSujetDeLaCompagne(String CompaignSubject) {
		seleniumUtils.writeText(NewCompaignPage.getCompaignSubject(), CompaignSubject);
	}
	@When("Je remplis la description de la compagne {string}")
	public void jeRemplisLaDescriptionDeLaCompagne(String Description) {
		seleniumUtils.writeText(NewCompaignPage.getCompaignDescription(), Description);
	}
	@When("Je saisis la date d envoi de la compagne {string}")
	public void jeSaisisLaDateDEnvoiDeLaCompagne(String date) {
		seleniumUtils.writeText(NewCompaignPage.getCompaignSendingDate(), date);
	}
	@When("Je choisis la boutique {string}")
	public void jeChoisisLaBoutique(String string) {
		Select select = new Select(NewCompaignPage.getCompaignStore());
		select.selectByValue("2");
	}
	@When("Je clique sur le bouton Save4")
	public void jeCliqueSurLeBoutonSave4() {
		seleniumUtils.click(NewCompaignPage.getBtnSave4());
	}
	@Then("Je verifie que la nouvelle compagne a ete ajoute")
	public void jeVerifieQueLaNouvelleCompagneAEteAjoute() {
		validations.equals(NewCompaignPage.getMessageNewCompaign());
	}




}
