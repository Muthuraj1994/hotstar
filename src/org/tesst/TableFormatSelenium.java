package org.tesst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableFormatSelenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muthu raja\\AutomationTesting\\ProjectX\\Driver\\chromedriver.exe");
		
	
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		List<WebElement> allrowdata = driver.findElements(By.xpath("//table[@id='example']/child::thead/child::tr/parent::thead/following-sibling::tbody/child::tr/child::td[@data-search='Ashton Cox']/parent::tr/child::td[4]"));
		
		for (int i = 0; i <allrowdata.size(); i++) {
			
			WebElement alldata = allrowdata.get(i);
			
			String text = alldata.getText();
			System.out.println(text);
			
		}
	}

}
