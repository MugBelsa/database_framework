package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.DatabasePage;
import page.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		
		initializeDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		
	}
	
	@Test
	public void loginTest() throws Throwable {
		
		loginPage.enterUsername(DatabasePage.getData("username"));
		loginPage.enterPassword(DatabasePage.getData("password"));
		loginPage.clickSignIn();
		
		
		loginPage.takeScreenshotAtEndOfTest(driver);
		
	}
	
	
}
