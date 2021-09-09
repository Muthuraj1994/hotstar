package org.tesst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Temple {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muthu raja\\AutomationTesting\\ProjectX\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/cricket-series/2697/icc-cricket-world-cup-2019/points-table");
		
		driver.manage().window().maximize();
		
		WebElement tableElement = driver.findElement(By.tagName("table"));
		
		List<WebElement> rowElement = tableElement.findElements(By.tagName("tr"));
		
		for (int i = 0; i <rowElement.size(); i++) {
			
			WebElement eachrow = rowElement.get(i);
			
			List<WebElement> headingElement = eachrow.findElements(By.tagName("th"));
			
		for (int j = 0; j <headingElement.size(); j++) {
			
			WebElement eachheading = headingElement.get(j);
			
			String text = eachheading.getText();
			System.out.println(text);
			
			
			
		}
			List<WebElement> dataElement = eachrow.findElements(By.tagName("td"));
			
			for (WebElement eachdata : dataElement) {
				
				String text = eachdata.getText();
				System.out.println(text);
				
			}
			
			
		}
	}

}
