package com.e2eTest.automation.step_definitions;

import org.openqa.selenium.By;

import com.e2eTest.automation.page_objects.CustumersRolePage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustumersRoleStepDefinition {

	private SeleniumUtils seleniumUtils;
	private CustumersRolePage costumersRolePage;
private Validations validations;
	public CustumersRoleStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		costumersRolePage = new CustumersRolePage();
		validations = new Validations();
	}


	@When("Je clique sur la commande Custumers roles")
	public void jeCliqueSurLaCommandeCustumersRoles() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(CustumersRolePage.getMenuCustumerRoles());
	}
	@When("Je clique sur le bouton Add new1")
	public void jeCliqueSurLeBoutonAddNew1() {
		seleniumUtils.click(CustumersRolePage.getBtnAddNew1());
	}
	@When("Je saisis le nom du client {string} dans le champ Name")
	public void jeSaisisLeNomDuClientDansLeChampName(String NewCleint) {
		seleniumUtils.writeText(CustumersRolePage.getCustumerRoleName(), NewCleint);
	}
	@When("Je clique sur le bouton Choose product")
	public void jeCliqueSurLeBoutonChooseProduct() {
		seleniumUtils.click(CustumersRolePage.getBtnChooseProduct());
	}
	@When("Je me redirige vers la fenetre Choose a product")
	public void jeMeRedirigeVersLaFenetreChooseAProduct() throws InterruptedException {
		seleniumUtils.findElements(By.tagName("viewport"));
		Thread.sleep(3000);

	}
	@When("Je saisis le nom de produit {string} dans le champ Product name")
	public void jeSaisisLeNomDeProduitDansLeChampProductName(String productName) throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.writeText(CustumersRolePage.getSearchProductName(), productName);	}
	@When("Je clique sur le bouton Search")
	public void jeCliqueSurLeBoutonSearch() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(CustumersRolePage.getSearchProductName());
	}
	@When("Je clique sur le bouton Select")
	public void jeCliqueSurLeBoutonSelect() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(CustumersRolePage.getBtnSelectProduct());
	}
	@When("Je clique sur le bouton Save2")
	public void jeCliqueSurLeBoutonSave2() {
		seleniumUtils.click(CustumersRolePage.getBtnSave1());
	}
	@Then("Je verifie que le role de nouveau client a ete ajoute {string}")
	public void jeVerifieQueLeRoleDeNouveauClientAEteAjoute(String string) {
validations.isElementPresent(By.xpath("//div[@class='alert alert-success alert-dismissable']"));

	}




}
