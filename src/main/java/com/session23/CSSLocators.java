package com.session23;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		// driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		// driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("laptop");
		driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("laptop");

	}
}
