package TestNGFramework.BlazeProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataFiles.DDTExcel;

public class LoginPage {
	DDTExcel d1 = new DDTExcel();
	
	@FindBy(xpath = "//input[@id='loginusername']")
	WebElement usernameField;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[.='Log in']")
	WebElement loginButton;
	
	public void enterusername() throws EncryptedDocumentException, IOException {
		
		String username = d1.getValueFromExcel("signupCred",1,0);
		usernameField.sendKeys(username);
	}
	
	public void enterPassword() throws EncryptedDocumentException, IOException {
		String password = d1.getValueFromExcel("signupCred", 1, 1);
		passwordField.sendKeys(password);
	}
	
	public void clickonLoginButton() {
		loginButton.click();
	}
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	

}
