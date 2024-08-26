package com.session25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

//------XPath of self	
		String text = driver.findElement(By.xpath("//a[contains(text(),'Fashion')]")).getText();
		System.out.println("text from self : "+text);
		
//------XPath of parent
		boolean statusParent = driver.findElement(By.xpath("//a[contains(text(),'Fashion')]/parent::div")).isDisplayed();
		System.out.println("statusParent : "+statusParent);
		
//------XPath of ancestor
		boolean statusAncestor = driver.findElement(By.xpath("//a[contains(text(),'Fashion')]/ancestor::div[2]")).isDisplayed();
		System.out.println("statusAncestor : "+statusAncestor);
		
//------XPath of self-node
		driver.findElement(By.xpath("//div[@class=\"nav-search-scope nav-sprite\"]")).click();
		
//------XPath of child
		//driver.findElement(By.xpath("//div[@class=\"nav-search-scope nav-sprite\"]/child::div")).click();
		
//------XPath of descendant	
		String textDescendant = driver.findElement(By.xpath("//div[@class=\"nav-search-scope nav-sprite\"]/descendant::label")).getText();
		System.out.println("textDescendant : "+textDescendant);
		
//------XPath of following-sibling
		System.out.println("text from following-sibling : "+driver.findElement(By.xpath("//a[contains(text(),'Fashion')]/following-sibling::a[1]")).getText());
		
//------XPath of preceding-sibling	
		System.out.println("text from preceding-sibling : "+driver.findElement(By.xpath("//a[contains(text(),'Fashion')]/preceding-sibling::a[1]")).getText());
		
		
		driver.quit();
	}
}
