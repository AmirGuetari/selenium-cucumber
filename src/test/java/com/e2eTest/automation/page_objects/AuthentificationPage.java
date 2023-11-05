package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AuthentificationPage extends BasePage {
	
	/* Retrieve web element */
	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;
	// ou je peux utilisé
	//@FindBy(id = "Email")
	//private static WebElement email;
	
	/* Retrieve web element */
	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;
	
	
// de preference le constructeur doit etre aprés les élements
	public AuthentificationPage() {
		super(Setup.getDriver());
		
		
	}
	
	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}

}
	
	
	
	


