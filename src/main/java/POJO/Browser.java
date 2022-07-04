package POJO;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver openbrowser() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();//class of Selenium
		//options.addArguments("--disable notifications");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		return driver;
		
	}

}
