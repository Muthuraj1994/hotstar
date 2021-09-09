package org.tesst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleCollection {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muthu raja\\AutomationTesting\\ProjectX\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement searchbtn = driver.findElement(By.xpath("//*[@type='text']"));
		
		searchbtn.sendKeys("bikes");
		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@jsname='erkvQe']/child::li"));
		
		for (WebElement allbike : all) {
			
			String text = allbike.getText();
			System.out.println(text);
			
		}
		
		}
		
		
		
			
		}
		
		
		
		
		
		
		
		
	


