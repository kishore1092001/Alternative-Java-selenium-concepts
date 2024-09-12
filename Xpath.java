package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KISHORE\\eclipse-workspace"
				+ "\\Selenium_Demo\\Driver2\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.facebook.com/");
		a.manage().window().maximize();
		WebElement b = a.findElement(By.xpath("//input[contains(@placeholder,'Email ')]"));
	b.sendKeys("kishore");
	//	a.get("https://www.amazon.in/");
	//	a.manage().window().maximize();
//		a.findElement(By.xpath("//a[text()='Mobiles']")).click();
	}

}
