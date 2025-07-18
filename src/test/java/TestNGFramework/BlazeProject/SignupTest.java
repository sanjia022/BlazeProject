package TestNGFramework.BlazeProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.annotations.Test;

public class SignupTest extends BaseClass {

	@Test
	public void testSignup() throws EncryptedDocumentException, IOException {
		HomePage h1 = new HomePage(driver);
		h1.clickonSignupLink();
		SignupPage s1 = new SignupPage(driver);
		s1.enterusername();
		s1.enterPassword();
		s1.clickonSignupButton();

	}
}