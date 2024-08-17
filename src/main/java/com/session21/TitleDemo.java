package com.session21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Test Case 1 :
//Launch different browser
//Open URL "https://www.opencart.com/"
//Validate Title should be "Your Store"
//Close browser
public class TitleDemo {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		String expTitle = "Your Store";
		String actuTitle = driver.getTitle();
		if (actuTitle.equals(expTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		driver.quit();
	}
}
