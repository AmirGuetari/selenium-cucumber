package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;

	public AuthentificationStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		authentificationPage = new AuthentificationPage();
		configFileReader = new ConfigFileReader();
	}

	@Given("Je me connecte sur l application nopeCommerce")
	public void jeMeConnecteSurlApplicationNopeCommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.recette"));

	}

	@When("Je saisie l email {string}")
	public void jeSaisieLEmail(String email) {
		seleniumUtils.writeText(AuthentificationPage.getEmail(), email);

	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		seleniumUtils.writeText(AuthentificationPage.getPassword(), password);

	}

	@When("Je clique sur le bouton LOGIN")
	public void jeCliqueSurLeBoutonLOGIN() {
		seleniumUtils.click(AuthentificationPage.getBtnLogin());

	}

	@Then("Je me redirige vers la page Home")
	public void jeMeRedirigeVersLaPageHome() {

	}

}
