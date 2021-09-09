package org.tesst;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muthu raja\\AutomationTesting\\ProjectX\\Driver\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|483490446458&s_kwcid=AL!1631!3!483490446458!e!!g!!makemytrip&ef_id=Cj0KCQjwm9yJBhDTARIsABKIcGZL-TXl6uG4NLHa4lQ3AaKLSLf90lzx3AmTQYNpHELceF3Wj3zIPsAaAqu_EALw_wcB:G:s&gclid=Cj0KCQjwm9yJBhDTARIsABKIcGZL-TXl6uG4NLHa4lQ3AaKLSLf90lzx3AmTQYNpHELceF3Wj3zIPsAaAqu_EALw_wcB");
		
		driver.manage().window().maximize();
		
		
		WebElement clickbtn = driver.findElement(By.xpath("//a[text()='Search']"));
		
		Thread.sleep(4000);
		
		Actions actions = new Actions(driver);
		
		actions.click().perform();
	}
}
