package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Valuepass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
			+ "\\Selenium_Demo\\Driver2\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://www.facebook.com/login/");
	a.manage().window().maximize();
	JavascriptExecutor b=(JavascriptExecutor)a;
	WebElement email = a.findElement(By.name("email"));
	b.executeScript("arguments[0].value='kishore'",email);
	WebElement pass = a.findElement(By.id("pass"));
	b.executeScript("arguments[0].value='12345678'",pass);
	WebElement login = a.findElement(By.id("loginbutton"));
	b.executeScript("arguments[0].click();",login);
	
}
}
