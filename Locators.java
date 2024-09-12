package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHO"
				+ "RE\\eclipse-workspace\\Selenium_Demo\\Driver2\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.facebook.com/");
		a.manage().window().maximize();
	    a.findElement(By.id("email")).sendKeys("kishore10@gmail.com");
		WebElement pass = a.findElement(By.name("pass"));
		pass.sendKeys("12345678");
		WebElement login = a.findElement(By.name("login"));
		login.click();
	}

}
