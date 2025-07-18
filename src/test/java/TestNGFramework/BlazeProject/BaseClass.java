package TestNGFramework.BlazeProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import dataFiles.ListenerLogic;

@Listeners(dataFiles.ListenerLogic.class)

public class BaseClass extends ListenerLogic {

	@BeforeMethod(alwaysRun= true)
	public void launchBrowser() {
     
      	driver = new ChromeDriver();

  		driver.get("https://www.demoblaze.com/index.html");
  		driver.manage().window().maximize();
  		
      }
		
	
   // @Parameters("browser")
//	public void launchBrowser(String browser) {
//        if(browser.equalsIgnoreCase("chrome")) {
//        	driver = new ChromeDriver();
//
//    		driver.get("https://www.demoblaze.com/index.html");
//    		driver.manage().window().maximize();
//    		
//        }
//		
//        if(browser.equalsIgnoreCase("edge")) {
//        	driver = new EdgeDriver();
//
//    		driver.get("https://www.demoblaze.com/index.html");
//    		driver.manage().window().maximize();
//    		;	
//        }
//		
//	}
	
	public static void addImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void addExplicitWait(By locator) {
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	@AfterMethod(alwaysRun= true)
	public void tearDown() {
		addImplicitWait();
		driver.quit();
	}

}
