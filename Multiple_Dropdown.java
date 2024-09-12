package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KISHORE\\eclipse-workspace"
				+ "\\Selenium_Demo\\Driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://demoqa.com/select-menu");
		a.manage().window().maximize();
		WebElement b = a.findElement(By.id("oldSelectMenu"));
		Select c=new Select(b);
		c.selectByValue("2");
		boolean mul = c.isMultiple();
		System.out.println(mul);
		WebElement d = a.findElement(By.name("cars"));
		Select e=new Select(d);
		e.selectByIndex(0);
		e.selectByValue("saab");
		e.deselectByValue("saab");
		System.out.println(e.isMultiple());
	
}
}
