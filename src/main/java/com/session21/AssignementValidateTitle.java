package com.session21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Assignement 1 :
//Launch Chrome browser
//Open URL "https://demo.nopcommerce.com/"
//Validate Title should be "nopCommerce demo store"
//Close browser
public class AssignementValidateTitle {
	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		String expTitle = "nopCommerce demo store";
		String actuTitle = driver.getTitle();
		if (actuTitle.equals(expTitle)) {
			System.out.println("Test Passed");
			System.out.println(actuTitle);
		} else {
			System.out.println("Test Failed");
			System.out.println(actuTitle);
		}
		// driver.quit();
	}
}
