package org.kis;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Windows_Handling {
public static void main(String[] args) throws AWTException{
System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Selenium_"
				+ "Demo\\Driver2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("http://www.amazon.in/");
    driver.manage().window().maximize();
    String wm = driver.getWindowHandle();
    System.out.println(wm);
    //1 st tab
    Actions a=new Actions(driver);
    WebElement click = driver.findElement(By.xpath("//a[text()='Mobiles']"));
    a.contextClick(click).build().perform();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    //2 tab
    WebElement service = driver.findElement(By.xpath("//a[text()='Customer Service']"));
    a.contextClick(service).build().perform();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Set<String> handles = driver.getWindowHandles();
    for(String w:handles) {
    	String title = driver.switchTo().window(w).getTitle();
    	System.out.println(title);
    }
    /// stay one page
   for(String w:handles) {
   	if(driver.switchTo().window(w).getTitle().equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in"));
    	break;
    }
}
}