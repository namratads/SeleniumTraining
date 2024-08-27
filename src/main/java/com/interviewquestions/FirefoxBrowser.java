package com.interviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void openFirefoxBrowser() {

		WebDriver driver = new FirefoxDriver(); // -------How to launch Firefox Browser
		System.out.println("Yes, successfully launch Firefox");

		driver.get("https://www.amazon.in/");// How to open application url
		System.out.println("successfully open application in firefox browser");

		String titleOfApp = driver.getTitle(); // ------------------------------How to capture Title of Web page?
		System.out.println("Title of Application : "+titleOfApp);
		
		String urlOfApp = driver.getCurrentUrl();//-----------------------------How to capture Url of Web page?
		System.out.println("Url of Application : "+urlOfApp);
		
		String pageSourceOfApp = driver.getPageSource();//-----------------------------How to capture page source of Web page?
		System.out.println("Page source of Application : "+pageSourceOfApp);
	}

	public static void main(String[] args) {

		openFirefoxBrowser();
	}
}
