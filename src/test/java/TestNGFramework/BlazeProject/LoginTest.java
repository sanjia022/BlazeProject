package TestNGFramework.BlazeProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	@Test(retryAnalyzer = dataFiles.RetryAnalyzer.class)
	public static void testLogin() throws EncryptedDocumentException, IOException {
		HomePage h1 = new HomePage(driver);
		h1.clickonLoginLink();
		LoginPage s1 = new LoginPage(driver);
		s1.enterusername();
		s1.enterPassword();
		s1.clickonLoginButton();
		
		
		Assert.assertEquals(driver.getTitle(), "STORE");
		
	}

}
