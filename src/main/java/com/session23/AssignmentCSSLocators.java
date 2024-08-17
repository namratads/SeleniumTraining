package com.session23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignement 1 :
//Launch Chrome browser
//Open URL "https://demo.opencart.com/"
//Try to css locators to identify elements.

public class AssignmentCSSLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");

		// tag#id ------------------------------------------Done
		// System.out.println(driver.findElement(By.cssSelector("div#logo")).isDisplayed());
		// System.out.println(driver.findElement(By.cssSelector("#logo")).isDisplayed());

		// tag.classname ------------------------------------------Done
		// driver.findElement(By.cssSelector("input.form-control ")).sendKeys("phone");
		// driver.findElement(By.cssSelector(".form-control ")).sendKeys("phone");

		// tag.classname[attribute='value']
		// ------------------------------------------Done
		// System.out.println(driver.findElement(By.cssSelector("div.carousel[id=\"carousel-banner-0\"]")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector(".carousel[id=\"carousel-banner-0\"]")).isDisplayed());
	}
}
