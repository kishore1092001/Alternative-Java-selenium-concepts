package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Seleniu"
			+ " m_Demo\\Driver2\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://amazon.in/");
	a.manage().window().maximize();
	JavascriptExecutor  b=(JavascriptExecutor)a;
	WebElement help = a.findElement(By.xpath("//a[text()='Help']"));
	b.executeScript("arguments[0].scrollIntoView();",help);
	Thread.sleep(5000);
	b.executeScript("window.scrollBy(0,-3000);");
	Thread.sleep(5000);
	b.executeScript("window.scrollBy(0,3000);");
}
}
