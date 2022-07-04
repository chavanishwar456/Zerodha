package Test;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.BuyTata;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.parametrization;

public class PinPageTest {
WebDriver driver;
@BeforeMethod
public void launchBrowser() {
	driver = Browser.openbrowser();
}
@Test

public void loginZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	String userName= parametrization.getData("kite excel",0, 1);
	String Password = parametrization.getData("kite excel",1, 1);
	zerodhaLoginPage.enterUserID(userName);
	zerodhaLoginPage.enterPassword(Password);
	zerodhaLoginPage.clickOnLogin();
	System.out.println(userName);
	System.out.println(Password);
	Thread.sleep(5000);
	ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
	String pin = parametrization.getData("kite excel", 2, 1);
	System.out.println(pin);
	zerodhaPinPage.enterPin(pin,driver);
	zerodhaPinPage.clickOncontinue();
	Thread.sleep(5000);
	BuyTata buytata = new BuyTata(driver);
	String Sharename= parametrization.getData("kite excel",3, 1);
	buytata.EnetrShare(Sharename);
	buytata.ClickBuyon(driver);
	
	
	
		}
	}



