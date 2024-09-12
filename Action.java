package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspac"
		+ "e\\Selenium_Demo\\Driver2\\chromedriver.exe");
WebDriver a=new ChromeDriver();
a.get("https://demoqa.com/buttons");
a.manage().window().maximize();
Actions ac=new Actions(a);
WebElement doubleclick = a.findElement(By.id("doubleClickBtn"));
ac.doubleClick(doubleclick).build().perform();
Thread.sleep(3000);
WebElement rightclick = a.findElement(By.id("rightClickBtn"));
ac.contextClick(rightclick).build().perform();
Thread.sleep(3000);
WebElement click = a.findElement(By.xpath("//button[text()='Click Me']"));
ac.click(click).build().perform();
a.navigate().to("https://www.leafground.com/drag.xhtml");
a.manage().window().maximize();
WebElement drag = a.findElement(By.xpath("//p[text()='Drag to target']"));
WebElement drop = a.findElement(By.xpath("//span[text()='Droppable Target']"));
Thread.sleep(3000);
ac.dragAndDrop(drag, drop).build().perform();
WebElement move = a.findElement(By.xpath("//span[text()='Drag me around']"));
ac.clickAndHold(move).build().perform();
ac.moveToElement(move,300, 0).build().perform();
}
}
