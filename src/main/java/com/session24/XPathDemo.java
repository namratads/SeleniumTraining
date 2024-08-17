package com.session24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

//------- XPath with Single Attribute ------------------------------------------Done
		// driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("shirts");

//-------XPath with Multiple Attribute ------------------------------------------Done
		// driver.findElement(By.xpath("//input[@type=\"text\"][@id=\"twotabsearchtextbox\"]")).sendKeys("shoe");

// -------XPath with 'and' operator ------------------------------------------Done
		// driver.findElement(By.xpath("//input[@type=\"text\" and @id=\"twotabsearchtextbox\"]")).sendKeys("shoe");

//-------XPath with 'or' operator ------------------------------------------Done
		// driver.findElement(By.xpath("//input[@type=\"txt\" or @id=\"twotabsearchtextbox\"]")).sendKeys("shoe");
		// driver.findElement(By.xpath("//input[@type=\"text\" or
		// @id=\"twotabsarchtextbox\"]")).sendKeys("shoe");

//-------XPath with inner text -- text() ------------------------------------------Done
		// String text =
		// driver.findElement(By.xpath("//span[text()='Returns']")).getText();
		// System.out.println(text);
		// driver.findElement(By.xpath("//span[text()='Returns']")).click();

//------can we write contains(), if there is not available any inner text ------------------------------------------Done
		// boolean status =
		// driver.findElement(By.xpath("//div[contains(text(),'')]/a[3]/span[2]")).isDisplayed();
		boolean status = driver.findElement(By.xpath("//div[contains(.,'')]/a[3]/span[2]")).isDisplayed();
		System.out.println(status);

//-------XPath with contains(); ------------------------------------------Done
		// driver.findElement(By.xpath("//input[contains(@type,\"ex\")]")).sendKeys("kurtis");

//-------XPath with start-with(); ------------------------------------------Done
		// driver.findElement(By.xpath("//input[starts-with(@type,\"t\")]")).sendKeys("kurtis");

//-------chained X-Path ------------------------------------------Done
		// String text =
		// driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[1]")).getText();
		// System.out.println(text);
		// driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[1]")).click();

	}
}
