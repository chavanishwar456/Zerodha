package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.parametrization;

public class LoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void Browser() {
		driver = Browser.openbrowser();
		}
	
	
	
	@Test
	public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException {
	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	String userName = parametrization.getData( "kite excel",0, 1);
	String password = parametrization.getData("kite excel",1, 1);
	zerodhaLoginPage.enterUserID(userName);
	zerodhaLoginPage.enterPassword(password);
	zerodhaLoginPage.clickOnLogin();
	}
	@Test
	public void forgotPasswordLinkTest() {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgotpassword();
	}
	@Test
	public void signupLinkTest() {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUP();
		
	}
	

	
}
