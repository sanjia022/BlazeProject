package TestNGFramework.BlazeProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseClass {
	
	@Test(retryAnalyzer = dataFiles.RetryAnalyzer.class)
	public void testContactus() {
		HomePage h1 = new HomePage(driver);
		h1.clickonContactLink();;
		ContactUsPage c1 = new ContactUsPage(driver);
		c1.setEmail();
		c1.setName();
		c1.clickonSendButton();
		c1.handleAlert(driver);
		addImplicitWait();
		
		Assert.assertTrue(h1.contactLink.isDisplayed());
	}

}
