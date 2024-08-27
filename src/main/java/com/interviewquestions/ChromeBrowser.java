package com.interviewquestions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeBrowser {
	public static void openChromeBrowser() throws InterruptedException {

		WebDriver driver = new ChromeDriver();//How to launch Chrome Browser?
		System.out.println("Yes, successfully launch Chrome");

		driver.get("https://www.amazon.in/"); //-How to open application url?
		System.out.println("successfully open application in chrome browser");

		String titleOfApp = driver.getTitle(); //How to capture Title of Web page?
		System.out.println("Title of Application : "+titleOfApp);
		
		String urlOfApp = driver.getCurrentUrl();//How to capture Url of Web page?
		System.out.println("Url of Application : "+urlOfApp);
		
		String pageSourceOfApp = driver.getPageSource();//How to capture page source of Web page?
		System.out.println("Page source of Application : "+pageSourceOfApp);
		
		boolean logoStatus = driver.findElement(By.xpath("//div[@id=\"nav-logo\"]")).isDisplayed();//How to check webElement is display or not?
		System.out.println("Logo of Application is display on web page : "+logoStatus);
		
		boolean enableSearchBoxStatus = driver.findElement(By.xpath("//input[@type=\"text\"]")).isEnabled();//How to check webElement is enable to click or not?
		System.out.println("Search Box enable to click : "+enableSearchBoxStatus);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("shirt for men");//How to provide text to input box?
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		List<WebElement> allbrand = driver.findElements(By.xpath("//div[@id=\"brandsRefinements\"]/ul/span/span"));
		
	    for (WebElement brand : allbrand) {
			if (brand.getText().equals("Allen Solly")) {
				System.out.println("brand select status : "+brand.isSelected());
				brand.click();
				System.out.println("After select brand");
				System.out.println("brand select status : "+brand.isSelected());
			}
		}

	   
	    driver.navigate().back(); //How to navigate back?
	    driver.navigate().forward(); //How to navigate forward?
	    driver.navigate().refresh(); //How to refresh or reload page?
	    
	    driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).clear();//How to clear text from input box?
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	    System.out.println(driver.findElement(By.xpath("//label[@for=\"twotabsearchtextbox\"]")).getText());//How to capture text from input box?
	    System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Search')]")).getAttribute("for"));//How to capture value of attribute?
   
	}

	public static void addToCard() throws InterruptedException {
		WebDriver driver = new ChromeDriver();//How to launch Chrome Browser?
		System.out.println("Yes, successfully launch Chrome");

		driver.get("https://www.amazon.in/"); //-How to open application url?
		System.out.println("successfully open application in chrome browser");

		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("shirt for men");//How to provide text to input box?
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@data-image-index='7']")).click();
		
		String parentHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		handles.remove(parentHandle);
		for (String handle : handles) {
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("//*[@data-image-index='7']")).click();//.....................ERROR
			
//			String idHandle = driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
//			if (idHandle.contains("Third")) {
//				System.out.println(idHandle +" : "+handle);
//			}
		}
      //  Set<String> handle = driver.getWindowHandles();
//  String d ="https://www.amazon.in/Amazon-Brand-Symbol-Regular-SS20-SYM-FS-01_EPP-1A_White/dp/B081QJW5GG/ref=sr_1_32?crid=22E1SWRFZ5R9H&dib=eyJ2IjoiMSJ9.r9BHggwsznOZqJVGjRSRMoa-HdEiG4sQtmM15A7lvzIvWajy3450ssOvqgcf6qzZN-Y_K7Z2E_GGij5R7Vzbi1PbYN-m8QcuuLUuQaFSK1NfxaSQNkTi0N1W4W15KGxcNNlRm_JK3NO24SU9GSJACvAveqGUmGbDX4yOI1ODru7PEfAc2QjQ-pHanoRafKPfRz5kp7k4v4JF7f_uonZCoUrhsJ3mFavvZjGbu_MFzzYqzL98Pvs3WzL1lV85p9-JjcLWmjO4rAh_nou2bHD37OyIGKl0Kvmx74xwHUra3oM.30bT-bknDX-iHgqMmQWZU7PZXtx0BL2_6-GuXsTQLbg&dib_tag=se&keywords=shirt+for+men&qid=1724676207&sprefix=shirt+for+men%2Caps%2C337&sr=8-32";
//  for(String a : handle)
//  {
//	 driver.switchTo().window(a);
//	 System.out.println( driver.getCurrentUrl());
//	 
//	 if(a.equals(d))
//	 {
//		 driver.switchTo().window(a);
//		 System.out.println("its working ");
//		 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
//	 }
//  }
 
		
		
		
		
		
//	    driver.findElement(By.xpath("(//*[@type=\"button\"])[4]")).click();
	    
	//    driver.findElement(By.xpath("(//span[@class=\"a-dropdown-prompt\"])[5]")).click();
	}
	public static void main(String[] args) throws InterruptedException {

//		openChromeBrowser();
	    addToCard();
	}
}
