package com.session21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();

		driver.get("https://demo.opencart.com/");

		// by using locator id
		// ------------------------------------------------------Done
		// WebElement wb = driver.findElement(By.id("common-home"));
		// System.out.println("WebElement is display on page : "+wb.isDisplayed());

		// by using locator name
		// ------------------------------------------------------Done
		// WebElement wb = driver.findElement(By.name("search"));
		// wb.sendKeys("laptop");
		// System.out.println("WebElement is display on page : "+wb.isDisplayed());

		// by using className-InvalidSelectorException: Compound class names not
		// permitted -----not for specific element
		//driver.findElement(By.className("form-control form-control-lg")).sendKeys("laptop");
		// System.out.println("WebElement is display on page : ");

		// by using locator xPath
		// ------------------------------------------------------Done
		// driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("laptop");
		
		// className----for gr of element ------------------------------------------------------Done
		//System.out.println(driver.findElements(By.className("container")).size());
		
		// by using locator tagName---- NoSuchElementException: no such element: Unable
		// to locate element -----not for specific element
		// boolean b = driver.findElement(By.tagName("//div/input")).isDisplayed();
		// System.out.println(b);

		// tagName----for gr of element ------------------------------------------------------Done
		System.out.println(driver.findElements(By.tagName("li")).size());

		// by using locator linkText
		// ------------------------------------------------------Done
		// driver.findElement(By.linkText("Desktops")).click();

		// by using locator partialLinkText
		// ------------------------------------------------------Done
		// driver.findElement(By.partialLinkText("Desk")).click();


		// by using locator cssSelector

	}
}
