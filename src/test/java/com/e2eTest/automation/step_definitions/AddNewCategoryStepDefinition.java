package com.e2eTest.automation.step_definitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTest.automation.page_objects.AddNewCategoryPage;
import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewCategoryStepDefinition {

	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;
	private AddNewCategoryPage addNewCategoryPage;

	public AddNewCategoryStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		authentificationPage = new AuthentificationPage();
		addNewCategoryPage = new AddNewCategoryPage();
	}

	@When("Je clique sur le menu Categories")
	public void jeCliqueSurLeMenuCategories() {
		seleniumUtils.waitForElementToBeClickable(AddNewCategoryPage.getMenuCategories());
		seleniumUtils.click(AddNewCategoryPage.getMenuCategories());
	}

	@When("Je clique sur le bouton Add new5")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(AddNewCategoryPage.getBtnAddNew());
	}

	@When("Je saisis un nom {string}")
	public void jeSaisisUnNom(String name) {
		seleniumUtils.writeText(AddNewCategoryPage.getName(), name);
	}

	@When("Je saisis une description {string}")
	public void jeSaisisUneDescription(String NewDescription) throws InterruptedException {
		seleniumUtils.waitForElementToBeClickable(By.id("Description_ifr"));
		seleniumUtils.click(AddNewCategoryPage.getChampDescription());
		Thread.sleep(3000);
		seleniumUtils.writeText(AddNewCategoryPage.getChampDescription(), NewDescription);

	}

	@When("Je selectionne une parent category Books {string}")
	public void jeSelectionneUneParentCategoryBooks(String parentCategoryIndex) {
		Select select = new Select(AddNewCategoryPage.getParentCategory());
		select.selectByIndex(15);
	}

	@When("Je charge un fichier {string}")
	public void jeChargeUnFichier(String filePath) {
		seleniumUtils.writeText(AddNewCategoryPage.getBtnUploadFile(), filePath);
	}

	@When("Je verifie que le fichier a bien ete charge")
	public void jeVerifieQueLeFichierABienEteCharge() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AddNewCategoryPage.getUploadSuccess()));
	}

	@When("Je clique sur le bouton Save5")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(AddNewCategoryPage.getBtnSave());
	}

	@Then("Je verifie que la nouvelle categorie a ete ajoutee {string}")
	public void jeVerifieQueLaNouvelleCategorieAEteAjoutee(String text) {
		String message = AddNewCategoryPage.getAlertSuccess().getText();
		Assert.assertTrue(message.contains(text));
	}

}