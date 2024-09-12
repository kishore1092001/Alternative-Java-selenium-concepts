package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_demo {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Selenium_Demo\\Driver2\\chrom"
		+ "edriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAj"
		+ "wmJeYBhAwEiwAXlg0AQ543vXFKyi5ocoXpzJCmL8VjQOEEd9R802Q6gNjZXn7pqEdQS4GIxoCOqsQAvD_BwE");
driver.manage().window().maximize();
Actions ac= new Actions(driver);
WebElement home = driver.findElement(By.xpath("//a[text()='Home & Living']"));
ac.moveToElement(home).build().perform();
driver.findElement(By.xpath("//a[text()='Bedsheets']")).click();
}
}
