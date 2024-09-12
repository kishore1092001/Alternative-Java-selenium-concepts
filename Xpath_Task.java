package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Task {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KISHORE\\eclipse-workspace"
				+ "\\Selenium_Demo\\Driver\\chromedriver.exe");
	WebDriver a= new ChromeDriver();
	a.get("https://www.facebook.com/");
	a.manage().window().maximize();
	a.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
	Thread.sleep(5000);
	a.findElement(By.name("firstname")).sendKeys("kishore");
	a.findElement(By.name("lastname")).sendKeys("killer");
	a.findElement(By.name("reg_email__")).sendKeys("6383456780");
	a.findElement(By.name("reg_passwd__")).sendKeys("12345678k");
	WebElement b = a.findElement(By.name("birthday_day"));
	Select c=new Select(b);
	c.selectByIndex(9);
	System.out.println(c.isMultiple());
	WebElement  e = a.findElement(By.id("month"));
	Select d=new Select(e);
	d.selectByValue("9");
	boolean n = d.isMultiple();
	System.out.println(n);
	WebElement h = a.findElement(By.id("year"));
	Select f=new Select(h);
	f.selectByVisibleText("2001");
	a.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	a.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
}
}
