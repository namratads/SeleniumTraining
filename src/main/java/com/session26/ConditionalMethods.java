package com.session26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Test Case == ConditionalMethods
// isDisplayed();
// isEnabled();
// isSelected();

public class ConditionalMethods {
	public static void isDisplayed() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		boolean statusOfLogo = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		System.out.println("Status Of Logo : " + statusOfLogo);
	}

	public static void isEnabled() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		boolean enableLogo = driver.findElement(By.xpath("//div[@id=\"nav-logo\"]")).isEnabled();
		System.out.println("enable  to click Logo : " + enableLogo);

		boolean enableSearchBar = driver.findElement(By.xpath("//input[@type=\"text\"]")).isEnabled();
		System.out.println("enable searchbar to acept the text : " + enableSearchBar);
	}

	public static void isSelected() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("shirt for men");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		boolean statusListOfBrands = driver.findElement(By.id("filter-p_123")).isDisplayed();
		System.out.println("List Of Brands is displayed :" + statusListOfBrands);

		System.out.println("Status of before any brans select...");
		System.out.println("Any brand selected status : " + driver.findElement(By.id("filter-p_123")).isSelected());

		driver.quit();
	}

	public static void main(String[] args) {
		isSelected();
	}
}
