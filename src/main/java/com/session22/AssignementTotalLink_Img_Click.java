package com.session22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignement 1 :
//Launch Chrome browser
//Open URL "https://www.demoblaze.com/index.html"
//Total no. of Links
//Total no. of Images
//Click on ahy product link using linkText/partialLinkText

public class AssignementTotalLink_Img_Click {

	public static void main(String[] args) {
		
		//Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Open URL "https://www.demoblaze.com/index.html"
		driver.get("https://www.demoblaze.com/index.html");
		
		//Total no. of Links
		System.out.println("Total no. of Links : "+driver.findElements(By.tagName("link")).size());
		
		//Total no. of Images
		System.out.println("Total no. of Images : "+driver.findElements(By.tagName("img")).size());
		
		//Click on ahy product link using linkText/partialLinkText
		//driver.findElement(By.linkText("CATEGORIES")).click();
		driver.findElement(By.partialLinkText("CATE")).click();
	}
}
