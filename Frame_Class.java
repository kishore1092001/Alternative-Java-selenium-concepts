package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Class {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
			+ "\\Selenium_Demo\\Driver2\\chromedriver.exe");
			WebDriver a=new ChromeDriver();
	a.get("https://demo.automationtesting.in/Frames.html");
	a.manage().window().maximize();
	a.switchTo().frame("SingleFrame");
	WebElement b = a.findElement(By.xpath("//input[@type='text']"));
	b.sendKeys("selenium");
	//WebElement b = a.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	//a.switchTo().frame(b);
	//a.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
	a.switchTo().defaultContent();
    Thread.sleep(5000);
	a.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	a.switchTo().frame(1);
	a.switchTo().frame(0);
	a.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
	a.switchTo().parentFrame();
	
}
}
