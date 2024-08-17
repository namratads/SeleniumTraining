package com.session23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorsDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// by using cssSelector---- tag#id
		// ------------------------------------------Done
		// driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("t-shirt");
		// driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("t-shirt");

		// by using cssSelector----- tag.classname
		// ------------------------------------------Done
		// System.out.println(driver.findElement(By.cssSelector("div.layoutToolbarPadding")).isDisplayed());
		// System.out.println(driver.findElement(By.cssSelector(".layoutToolbarPadding")).isDisplayed());

		// by using cssSelector----- tag[attribute="value"]
		// ------------------------------------------Done
		// driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("laptop");
		// driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("laptop");

		// by using cssSelector----- tag.classname[attribute="value"]
		// ------------------------------------------Done
		// driver.findElement(By.cssSelector("input.nav-input[autocomplete=\"off\"]")).sendKeys("laptop");
		// driver.findElement(By.cssSelector(".nav-input[autocomplete=\"off\"]")).sendKeys("laptop");
	}
}
