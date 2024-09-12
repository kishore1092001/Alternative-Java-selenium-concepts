package org.kis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Commands {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-work"
			+ "space\\Selenium_Demo\\Driver2\\chromedriver.exe");
	WebDriver a= new ChromeDriver();
	a.get("https://www.facebook.com/\r\n");
	a.manage().window().maximize();
	System.out.println( a.getTitle());
	String currentUrl = a.getCurrentUrl();
	System.out.println(currentUrl);
//	String pageSource = a.getPageSource();
//	System.out.println(pageSource);
}
}
