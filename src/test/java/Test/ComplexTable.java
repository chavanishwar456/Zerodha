package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.TableBrowser;

public class ComplexTable {
	public static void main(String[] args) {
		
	
		WebDriver driver = TableBrowser.openbrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> column = driver.findElements(By.xpath("//table//thead//tr//th"));
		int columnsize = column.size();
		System.out.println(columnsize);

		double max=0;
		double min=0;
	List<WebElement> currentprice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
	for(int i=0;i<currentprice.size();i++) {
		WebElement price = currentprice.get(i);
		String currentprices = price.getText();
		double highervalue = Double.parseDouble(currentprices);
	if(max<highervalue) {
		max=highervalue;
	}
	System.out.println(max);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	for(int k=0;k<currentprice.size();k++) {
		WebElement E = currentprice.get(k);
		 String sun = E.getText();
		double lower =  Double.parseDouble(sun);
		if(lower<min) {
			min=lower;
		}
		System.out.println(min);
	}



		
		
	}

}
