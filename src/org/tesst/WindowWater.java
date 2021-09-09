package org.tesst;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowWater {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muthu raja\\AutomationTesting\\ProjectX\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement findElement = driver.findElement(By.xpath("(//*[text()='Click Here'])[1]"));
		
		findElement.click();
		
		Thread.sleep(1000);
		WebElement findElement2 = driver.findElement(By.xpath("(//*[text()='Click Here'])[1]"));
		
		findElement2.click();
		
		Thread.sleep(1000);
		WebElement findElement3 = driver.findElement(By.xpath("(//*[text()='Click Here'])[1]"));
		
		findElement3.click();
		
		Thread.sleep(1000);
		WebElement findElement4 = driver.findElement(By.xpath("(//*[text()='Click Here'])[1]"));
		
		findElement3.click();
 
		Thread.sleep(1000);
		WebElement findElement5 = driver.findElement(By.xpath("(//*[text()='Click Here'])[1]"));
		
		findElement3.click();
		String parenwindow = driver.getWindowHandle();
		
		Set<String> eachwindow = driver.getWindowHandles();
		
		for (String allwindow : eachwindow) {
			
			if (!allwindow.equals(parenwindow)) {
				
				driver.switchTo().window(parenwindow);
				
			}
			
		}
		
	}

}
