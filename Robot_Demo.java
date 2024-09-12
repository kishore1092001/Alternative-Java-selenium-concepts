package org.kis;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
public class Robot_Demo {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\ec"
			+ "lipse-workspace\\Selenium_Demo\\Driver2\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://amazon.in/");
	a.manage().window().maximize();
	Actions b=new Actions(a);
	WebElement moblies = a.findElement(By.xpath("//a[text()='Mobiles']"));
	b.contextClick(moblies).build().perform();
	Robot c=new Robot();
	c.keyPress(KeyEvent.VK_DOWN);
	c.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	c.keyPress(KeyEvent.VK_DOWN);
	c.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	c.keyPress(KeyEvent.VK_ENTER);
	c.keyRelease(KeyEvent.VK_ENTER);
//	TakesScreenshot d=(TakesScreenshot)a;
//	File s=d.getScreenshotAs(OutputType.FILE);
//	File n=new File("C:\\Users\\KISHORE\\eclipse-workspace\\Selenium_Demo\\Screenshoot\\amg.png");
//	FileHandler.copy(s, n);
}
}