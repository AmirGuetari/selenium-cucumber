package com.e2eTest.automation.step_definitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogStepDefinition {

	private CatalogPage catalogPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;

	public CatalogStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
		validations = new Validations();

	}

	@When("Je clique sur le menu Catalog")
	public void jeCliqueSurLeMenuCatalog() throws InterruptedException {

		seleniumUtils.click(CatalogPage.getMenuCatalog());
	}

	@When("Je clique sur le menu Products")
	public void jeCliqueSurLeMenuProducts() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(CatalogPage.getMenuProducts()));

		//Thread.sleep(3000);
		seleniumUtils.click(CatalogPage.getMenuProducts());


	}

	@When("Je saisis le produit {string}")
	public void jeSaisisLeProduit(String champProductName) {
		seleniumUtils.writeText(CatalogPage.getChampProductName(), champProductName);
	}

	@When("je clique sur le bouton Search")
	public void jeCliqueSurLeBoutonSearch() throws InterruptedException {
		seleniumUtils.click(CatalogPage.getBtnSearch());
		Thread.sleep(1000);
	}

	@Then("le resultat de recherche affiche est {string}")
	public void leResultatDeRechercheEstAffiche(String text1) throws InterruptedException {
//		String message1 = CatalogPage.getNbrResults().getText();
//	//	Thread.sleep(3000);
//		//System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx : " + message1);
//		Assert.assertEquals(message1,text1);


		String namePC = CatalogPage.getProductName().getText();
		Assert.assertEquals(namePC, text1);



	}

}










































