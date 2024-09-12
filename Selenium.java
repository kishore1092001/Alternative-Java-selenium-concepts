package org.kis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Selenium_Demo\\Driver3\\chromedriver.exe");
		WebDriver s=new ChromeDriver();
		s.get("https://www.amazon.in/");	
		s.manage().window().maximize();
	}

}
