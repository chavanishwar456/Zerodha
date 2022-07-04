package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyTata {
	@FindBy(xpath = "(//input[@type='text']")private WebElement search ;
	@FindBy(xpath = "(//span[text()='TATAPOWER']")private WebElement TataP ;
	@FindBy(xpath = "(//button[@type='button'])[1]")private WebElement Buy;
	
	
	
	public BuyTata (WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
public void EnetrShare (String Share) {
	search.click();
	search.sendKeys(Share);
	}
	public void ClickBuyon(WebDriver driver) {
		Actions action = new Actions (driver);
		action.moveToElement(TataP).perform();
		action.moveToElement(Buy);
		action.click();
		action.perform();
	}
	
	
}
