package org.kis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_methods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
			+ "\\Selenium_Demo\\Driver\\chromedriver.exe" );
	WebDriver a=new ChromeDriver();
	a.get("https://www.facebook.com/\r\n");
	a.manage().window().maximize();
	a.navigate().to("https://www.amazon.in/");
	a.navigate().back();
	a.navigate().forward();
	Thread.sleep(5000);
	a.navigate().refresh();
}
}
