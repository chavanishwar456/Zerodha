package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.TableBrowser;

public class Table2 {
	public static void main(String[] args) {
		WebDriver driver = TableBrowser.openbrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> column = driver.findElements(By.xpath("//table//thead//tr//th"));
		int columnsize = column.size();
		System.out.println(columnsize);
	




}
}
