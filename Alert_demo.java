package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KISHORE\\eclipse-workspace"
			+ "\\Selenium_Demo\\Driver2\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://demoqa.com/alerts");
	a.manage().window().maximize();
	a.findElement(By.id("alertButton")).click();
	Thread.sleep(5000);
	a.switchTo().alert().accept();
	a.findElement(By.id("confirmButton")).click();
	Thread.sleep(5000);
	a.switchTo().alert().dismiss();
	a.findElement(By.id("promtButton")).click();
	a.switchTo().alert().sendKeys("kishore");
	Thread.sleep(5000);
	a.switchTo().alert().accept();
}
}
