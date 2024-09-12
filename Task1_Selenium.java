package org.kis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KISHORE\\eclipse-workspace"
				+ "\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.flipkart.com/");
		a.manage().window().maximize();
		a.navigate().to("https://www.facebook.com/\r\n");
		String title = a.getTitle();
		System.out.println(title);
		String currentUrl = a.getCurrentUrl();
		System.out.println(currentUrl);
		a.navigate().to("https://www.amazon.in/");
		a.navigate().back();
		Thread.sleep(5000);
		a.navigate().forward();
		String title2 = a.getTitle();
		System.out.println(title2);
		String currentUrl2 = a.getCurrentUrl();
		System.out.println(currentUrl2);
		
	}

}
