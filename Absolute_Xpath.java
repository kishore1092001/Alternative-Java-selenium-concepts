package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
		+ "\\Selenium_Demo\\Driver2\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.xpath("/html/body/div/header/div/div[5]/div[2]/div/div/a[2]")).click();
}
}
