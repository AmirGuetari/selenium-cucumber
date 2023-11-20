package com.e2eTest.automation.step_definitions;

import org.openqa.selenium.By;

import com.e2eTest.automation.page_objects.CostumersModifyVendorPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CostumersModifyVendorStepDefinition {
	private SeleniumUtils seleniumUtils;
	private CostumersModifyVendorPage costumersModifyVendorPage;
	private Validations validations;

	public CostumersModifyVendorStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		costumersModifyVendorPage = new CostumersModifyVendorPage();
		validations = new Validations();
	}

	@When("Je clique sur le menu Custumers")
	public void jeCliqueSurLeMenuCustumers() {
		seleniumUtils.click(CostumersModifyVendorPage.getMenuCustumers());
		seleniumUtils.waitForElementToBeClickable(CostumersModifyVendorPage.getMenuCustumers());
	}

	@When("Je clique sur la commande Vendors")
	public void jeCliqueSurLaCommandeVendors() throws InterruptedException {
		Thread.sleep(5000);
		seleniumUtils.click(CostumersModifyVendorPage.getMenuVendors());
	}

	@When("Je saisie {string} dans le champ Vendor name")
	public void jeSaisieDansLeChampVendorName(String vendorName) {
		seleniumUtils.writeText(CostumersModifyVendorPage.getSearchNameField(), vendorName);
	}

	@When("Je clique sur bouton Search")
	public void jeCliqueSurBoutonSearch() {
		seleniumUtils.click(CostumersModifyVendorPage.getBtnSearchVendors());
	}

	@When("Je clique sur le bouton Edit")
	public void jeCliqueSurLeBoutonEdit() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(CostumersModifyVendorPage.getBtnEditVendors());
	}

	@When("Je vide le champ Email")
	public void jeVideLeChampEmail() {
		seleniumUtils.clearField("emailVendorsField");
	}

	@When("Je saisie un nouveau Email {string}")
	public void jeSaisieUnNouveauEmail(String vendorNewEmail) {
		seleniumUtils.writeText(CostumersModifyVendorPage.getEmailVendorsField(), vendorNewEmail);
	}

	@When("Je clique sur le bouton Save1")
	public void jeCliqueSurLeBoutonSave1() {
		seleniumUtils.click(CostumersModifyVendorPage.getBtnSave1());
	}

	@Then("Je verifie que le vendeur a ete modifie {string}")
	public void jeVerifieQueLeVendeurAEteModifie(String modifSuccess) {
		//String message1 = CostumersModifyVendorPage.getVendorModMessage().getText();
		//Assert.assertEquals(message1, modifSuccess);
		validations.isElementPresent(By.xpath("//div[@class='alert alert-success alert-dismissable']"));
	}

}
