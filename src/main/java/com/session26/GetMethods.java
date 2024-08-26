package com.session26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//  Test Case 1
//  get methods ==> we can access this methods through webdriver instance
//  get("url") ==> open url in multiple browser.
//  getTitle() ==> return the title of page 
//  getCurrentUrl() ==> return url of current page
//  getPageSource() ==> return source code of page
//  getWindowHandle() ==> returns ID of single browser window
//  getWindowHandles() ==> returns ID's of multiple browser windows
//  close the browser
public class GetMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	//	WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver2 = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
 
		System.out.println("PageSource : "+driver.getPageSource());
		System.out.println("Title :"+driver.getTitle());
		System.out.println("URL : "+driver.getCurrentUrl());
		
        System.out.println("WindowID : "+driver.getWindowHandle());
        driver.get("https://www.myntra.com/myntra-fashion-store");
        System.out.println("Window ID's : "+driver.getWindowHandles());
		
		driver.quit();
	}

}
