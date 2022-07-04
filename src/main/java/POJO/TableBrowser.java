package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableBrowser {
	public static WebDriver openbrowser(String url) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	
}
}
