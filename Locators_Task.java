package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Task {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KISHORE\\eclipse-workspace\\Selenium_Demo\\"
			+ "Driver\\chromedriver.exe");
	WebDriver a= new ChromeDriver();
	a.get("https://www.instagram.com/");
	a.manage().window().maximize();
	WebElement name = a.findElement(By.name("username"));
	name.sendKeys("kishore");
	WebElement pass = a.findElement(By.name("password"));
	pass.sendKeys("1235456789");
	a.findElement(By.xpath("//div[contains(@class,'             qF0y9          Igw0E     IwRSH    "
			+ "  eGOV_       acqo5   _4EzTm    bkEs3          ')][1]")).click();
}
}
