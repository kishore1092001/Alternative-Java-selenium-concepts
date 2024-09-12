package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selecter{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-work"
			+ "space\\Selenium_Demo\\Driver2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input#email")).sendKeys("kishore");
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123456789");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button")).click();
}
}
