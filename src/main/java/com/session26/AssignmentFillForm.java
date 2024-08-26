package com.session26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Assignment no : 1
// practice all webdriver methods
// https://testautomationpractice.blogspot.com/
public class AssignmentFillForm {

	public static void chromeBrowser() throws InterruptedException {
		WebDriver driver = new ChromeDriver();// ---------Launch application on chrome
		driver.manage().window().maximize();// ---------maximize the window
		driver.get("https://testautomationpractice.blogspot.com/");// --------application url

		// --------check application logo
		boolean logo = driver.findElement(By.xpath("//h1[@class=\"title\"]")).isDisplayed();
		System.out.println("Logo on page is display : " + logo);

		driver.findElement(By.id("name")).sendKeys("namo");
		driver.findElement(By.id("email")).sendKeys("namratashinde4137@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8788302603");
		driver.findElement(By.id("textarea")).sendKeys("jath,Sangli in maharashtra 411030");

		System.out.println("Before select any gender......");
		System.out.println("male selected status : " + driver.findElement(By.id("male")).isSelected());
		System.out.println("female selected status : " + driver.findElement(By.id("female")).isSelected());

		driver.findElement(By.id("male")).click();
		System.out.println("After select male gender......");
		System.out.println("male selected status : " + driver.findElement(By.id("male")).isSelected());
		System.out.println("female selected status : " + driver.findElement(By.id("female")).isSelected());

		driver.findElement(By.id("female")).click();
		System.out.println("After select female gender......");
		System.out.println("male selected status : " + driver.findElement(By.id("male")).isSelected());
		System.out.println("female selected status : " + driver.findElement(By.id("female")).isSelected());

		System.out.println("Before any day select......");
		boolean dayStatus = driver.findElement(By.xpath("//input[@type=\"checkbox\"]/parent::div")).isSelected();
		System.out.println("day select status : " + dayStatus);
		List<WebElement> days = driver.findElements(By.xpath("//input[@type=\"checkbox\"]/parent::div"));
		String day1 = "Saturday";
		String day2 = "Sunday";
		for (WebElement day : days) {
			if (day.getText().equals(day1) || day.getText().equals(day2)) {
				day.click();
			}
		}

		System.out.println("Before any country selected......");
		boolean countryStatus = driver.findElement(By.id("country")).isSelected();
		System.out.println("country selected staus : " + countryStatus);

		List<WebElement> listOfCountry = driver.findElements(By.xpath("//select[@class=\"form-control\"]/option"));
		for (WebElement webElement : listOfCountry) {
			if (webElement.getText().equals("India")) {
				webElement.click();
			}
		}

		List<WebElement> listOfColors = driver.findElements(By.xpath("//select[@id=\"colors\"]/option"));
		for (WebElement color : listOfColors) {
			if (color.getText().equals("Yellow")) {
				color.click();
			}
		}

		driver.findElement(By.id("datepicker")).click();
		int count = 3;
		while (count != 0) {
			driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			count--;
		}
		driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr[3]/td[2]")).click();
		// driver.quit();

	}
	public static void firefoxBrowser() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();// ---------Launch application on mozilla
		driver.manage().window().maximize();// ---------maximize the window
		driver.get("https://testautomationpractice.blogspot.com/");// --------application url

		// --------check application logo
		boolean logo = driver.findElement(By.xpath("//h1[@class=\"title\"]")).isDisplayed();
		System.out.println("Logo on page is display : " + logo);

		driver.findElement(By.id("name")).sendKeys("namo");
		driver.findElement(By.id("email")).sendKeys("namratashinde4137@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8788302603");
		driver.findElement(By.id("textarea")).sendKeys("jath,Sangli in maharashtra 411030");

		System.out.println("Before select any gender......");
		System.out.println("male selected status : " + driver.findElement(By.id("male")).isSelected());
		System.out.println("female selected status : " + driver.findElement(By.id("female")).isSelected());

		driver.findElement(By.id("male")).click();
		System.out.println("After select male gender......");
		System.out.println("male selected status : " + driver.findElement(By.id("male")).isSelected());
		System.out.println("female selected status : " + driver.findElement(By.id("female")).isSelected());

		driver.findElement(By.id("female")).click();
		System.out.println("After select female gender......");
		System.out.println("male selected status : " + driver.findElement(By.id("male")).isSelected());
		System.out.println("female selected status : " + driver.findElement(By.id("female")).isSelected());

		System.out.println("Before any day select......");
		boolean dayStatus = driver.findElement(By.xpath("//input[@type=\"checkbox\"]/parent::div")).isSelected();
		System.out.println("day select status : " + dayStatus);
		List<WebElement> days = driver.findElements(By.xpath("//input[@type=\"checkbox\"]/parent::div"));
		String day1 = "Saturday";
		String day2 = "Sunday";
		for (WebElement day : days) {
			if (day.getText().equals(day1) || day.getText().equals(day2)) {
				day.click();
			}
		}

		System.out.println("Before any country selected......");
		boolean countryStatus = driver.findElement(By.id("country")).isSelected();
		System.out.println("country selected staus : " + countryStatus);

		List<WebElement> listOfCountry = driver.findElements(By.xpath("//select[@class=\"form-control\"]/option"));
		for (WebElement webElement : listOfCountry) {
			if (webElement.getText().equals("India")) {
				webElement.click();
			}
		}

		List<WebElement> listOfColors = driver.findElements(By.xpath("//select[@id=\"colors\"]/option"));
		for (WebElement color : listOfColors) {
			if (color.getText().equals("Yellow")) {
				color.click();
			}
		}

		driver.findElement(By.id("datepicker")).click();
		int count = 3;
		while (count != 0) {
			driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			count--;
		}
		driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr[3]/td[2]")).click();
		// driver.quit();

	}
	public static void edgeBrowser() throws InterruptedException {
		WebDriver driver = new EdgeDriver();// ---------Launch application on IE
		driver.manage().window().maximize();// ---------maximize the window
		driver.get("https://testautomationpractice.blogspot.com/");// --------application url

		// --------check application logo
		boolean logo = driver.findElement(By.xpath("//h1[@class=\"title\"]")).isDisplayed();
		System.out.println("Logo on page is display : " + logo);

		driver.findElement(By.id("name")).sendKeys("namo");
		driver.findElement(By.id("email")).sendKeys("namratashinde4137@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8788302603");
		driver.findElement(By.id("textarea")).sendKeys("jath,Sangli in maharashtra 411030");

		System.out.println("Before select any gender......");
		System.out.println("male selected status : " + driver.findElement(By.id("male")).isSelected());
		System.out.println("female selected status : " + driver.findElement(By.id("female")).isSelected());

		driver.findElement(By.id("male")).click();
		System.out.println("After select male gender......");
		System.out.println("male selected status : " + driver.findElement(By.id("male")).isSelected());
		System.out.println("female selected status : " + driver.findElement(By.id("female")).isSelected());

		driver.findElement(By.id("female")).click();
		System.out.println("After select female gender......");
		System.out.println("male selected status : " + driver.findElement(By.id("male")).isSelected());
		System.out.println("female selected status : " + driver.findElement(By.id("female")).isSelected());

		System.out.println("Before any day select......");
		boolean dayStatus = driver.findElement(By.xpath("//input[@type=\"checkbox\"]/parent::div")).isSelected();
		System.out.println("day select status : " + dayStatus);
		List<WebElement> days = driver.findElements(By.xpath("//input[@type=\"checkbox\"]/parent::div"));
		String day1 = "Saturday";
		String day2 = "Sunday";
		for (WebElement day : days) {
			if (day.getText().equals(day1) || day.getText().equals(day2)) {
				day.click();
			}
		}

		System.out.println("Before any country selected......");
		boolean countryStatus = driver.findElement(By.id("country")).isSelected();
		System.out.println("country selected staus : " + countryStatus);

		List<WebElement> listOfCountry = driver.findElements(By.xpath("//select[@class=\"form-control\"]/option"));
		for (WebElement webElement : listOfCountry) {
			if (webElement.getText().equals("India")) {
				webElement.click();
			}
		}

		List<WebElement> listOfColors = driver.findElements(By.xpath("//select[@id=\"colors\"]/option"));
		for (WebElement color : listOfColors) {
			if (color.getText().equals("Yellow")) {
				color.click();
			}
		}

		driver.findElement(By.id("datepicker")).click();
		int count = 3;
		while (count != 0) {
			driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			count--;
		}
		driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr[3]/td[2]")).click();
		// driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
//		chromeBrowser();
//		firefoxBrowser();
		edgeBrowser();
	}
}
