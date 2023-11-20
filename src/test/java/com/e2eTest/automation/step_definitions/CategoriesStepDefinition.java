package com.e2eTest.automation.step_definitions;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.page_objects.CategoriesPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoriesStepDefinition {

	private CategoriesPage categoriesPage;
	private AuthentificationPage authentificationPage;
	private CatalogPage catalogPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private SelectFromListUtils selectFromList;

	public CategoriesStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		categoriesPage = new CategoriesPage();
		catalogPage = new CatalogPage();
		configFileReader = new ConfigFileReader();
		authentificationPage = new AuthentificationPage();
		selectFromList = new SelectFromListUtils();

	}

	@Given("Je suis dans le menu Catalog")
	public void jeSuisDansLeMenuCatalog() {
		seleniumUtils.get(configFileReader.getProperties("home.recette"));
	}

	@When("Je clique sur la commande Categories")
	public void jeCliqueSurLaCommandeCategories() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(CategoriesPage.getBtnCategories());
	}

	@When("Je clique sur le bouton Add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(CategoriesPage.getBtnAddNew());
	}

	@When("Je remplis le champ Name {string}")
	public void jeRemplisLeChampName(String categoryName) {
		seleniumUtils.writeText(CategoriesPage.getName(), categoryName);
	}

	@When("Je remplis le champ Description {string}")
	public void jeRemplisLeChampDescription(String Description) {
		seleniumUtils.writeText(CategoriesPage.getDescription(), Description);
	}

	@When("Je selectionne la commande {string} dans la liste deroulante Parent Category")
	public void jeSelectionneLaCommandeDansLaListeDeroulanteParentCategory(String string) {
		Select select = new Select(CategoriesPage.getParentCategory());
		select.selectByIndex(3);
	}

	@When("Je choisis un fichier pour Upload")
	public void jeChoisisUnFichierPourUpload() {
		seleniumUtils.uploadFile("C:\\Users\\user\\Desktop\\Formation Automation Selenium\\cycling-icon-vector-23386813.jpg");
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(CategoriesPage.getUploadSuccess()));
	}

	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(CategoriesPage.getBtnSave());
	}

	@Then("Je verifie que la nouvelle categorie a ete ajoute {string}")
	public void jeVerifieQueLaNouvelleCategorieAEteAjoute(String string) {


	}

}
