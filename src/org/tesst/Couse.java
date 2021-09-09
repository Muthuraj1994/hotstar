package org.tesst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Couse {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muthu raja\\AutomationTesting\\ProjectX\\Driver\\chromedriver.exe" );

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_Cj0KCQjwm9yJBhDTARIsABKIcGYYr0t7hnn7_R2xsw2Oc9Jj9GdzEc-WAfw7_zyoMldlhxvyDzNMprQaAg-KEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQjwm9yJBhDTARIsABKIcGYYr0t7hnn7_R2xsw2Oc9Jj9GdzEc-WAfw7_zyoMldlhxvyDzNMprQaAg-KEALw_wcB");
		
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("iphone 11");
		
		WebElement btnclick = driver.findElement(By.id("nav-search-submit-button"));
		
		btnclick.click();
		
		WebElement btnclick1 = driver.findElement(By.xpath("//span[text()='Internal Memory']/parent::div/following-sibling::ul/child::li[@id='p_n_feature_eight_browse-bin/8561115031']"));
		
		
		btnclick1.click();
		
		
		
	}

}
