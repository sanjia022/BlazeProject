package TestNGFramework.BlazeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	
	
	
	@FindBy(xpath = "//input[@id='recipient-email']")
	WebElement emailAddressField;
	
	
	@FindBy(xpath = "//input[@id='recipient-name']")
	WebElement recipientNameField;
	
	@FindBy(xpath = "//textarea[@id='message-text']")
	WebElement messageArea;
	
	@FindBy(xpath = "//button[.='Send message']")
	WebElement sendButton;
	
	
	public void setEmail() {
		emailAddressField.sendKeys("joe.smith@gmail.com");
	}
	
	public void setName() {
		recipientNameField.sendKeys("Joe Smith");;
	}
	
	public void clickonSendButton() {
		sendButton.click();
	}
	public void handleAlert(WebDriver driver) {
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
	}
	
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
