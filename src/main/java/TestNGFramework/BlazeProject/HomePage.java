package TestNGFramework.BlazeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath = "//a[@id ='signin2']")
	WebElement signupLink;
	
	
	@FindBy(xpath = "//a[@id='login2']")
	WebElement loginLink;
	
	@FindBy(xpath = "//a[.='Contact']")
	WebElement contactLink;
	
	
	public void clickonSignupLink() {
		signupLink.click();
	}
	
	public void clickonLoginLink() {
		loginLink.click();
	}
	
	public void clickonContactLink() {
		contactLink.click();
		
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
