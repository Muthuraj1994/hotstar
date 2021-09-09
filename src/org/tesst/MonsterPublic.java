package org.tesst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonsterPublic {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muthu raja\\AutomationTesting\\ProjectX\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/32058/eng-vs-ind-4th-test-india-tour-of-england-2021");
		
		List<WebElement> strikerate = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/child::div/following-sibling::div/following-sibling::div/following-sibling::div/child::div/following-sibling::div)[6]"));
	
		for (int i = 0; i <strikerate.size(); i++) {
			WebElement rate = strikerate.get(i);
			String text = rate.getText();
			System.out.println(text);
			
		}
		
	}

	}


