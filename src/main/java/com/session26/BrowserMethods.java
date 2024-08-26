package com.session26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Test Case == BrowserMethods
// quit();
// close();

public class BrowserMethods {

	public static void browserMethods() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		Thread.sleep(5000);
		// driver.quit();
		driver.close();

	}

	public static void main(String[] args) throws Exception {
		browserMethods();
	}
}
