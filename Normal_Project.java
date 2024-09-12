package org.kis;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Normal_Project {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Selenium_"
		+ "Demo\\Driver2\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.name("email")).sendKeys("kishore");
WebElement pass = driver.findElement(By.id("pass"));
pass.sendKeys("1123455678");
driver.findElement(By.name("login")).click();
Thread.sleep(5000);
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(3000);
driver.findElement(By.name("firstname")).sendKeys("kishore");
driver.findElement(By.name("lastname")).sendKeys("killer");
driver.findElement(By.name("reg_email__")).sendKeys("6382655436");
driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("12345678");
WebElement s = driver.findElement(By.id("day"));
Select a=new Select(s);
a.selectByIndex(9);
WebElement mon = driver.findElement(By.id("month"));
Select f=new Select(mon);
f.selectByValue("9");
System.out.println(f.isMultiple());
WebElement year = driver.findElement(By.id("year"));
Select k=new Select(year);
k.selectByVisibleText("2001");
driver.findElement(By.xpath("//label[text()='Male']")).click();
driver.findElement(By.name("websubmit")).click();
//js.executeScript("alert('you created the account');");
String title = driver.getTitle();
System.out.println(title);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
driver.navigate().to("https://demo.automationtesting.in/Frames.html");
driver.switchTo().frame(0);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
driver.switchTo().frame(1);
driver.switchTo().frame(0);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
driver.findElement(By.xpath("//a[text()='Alerts']")).click();
driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//button[@onclick='alertbox()'] ")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
Thread.sleep(3000);
driver.switchTo().alert().dismiss();
driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
driver.switchTo().alert().sendKeys("Hii javaaa");
Thread.sleep(3000);
driver.switchTo().alert().accept();
driver.navigate().to("https://demoqa.com/buttons");
Actions ac=new Actions(driver);
WebElement click = driver.findElement(By.id("doubleClickBtn"));
ac.doubleClick(click).build().perform();
Thread.sleep(3000);
WebElement right = driver.findElement(By.id("rightClickBtn"));
ac.contextClick(right).build().perform();
Thread.sleep(3000);
WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
ac.click(clickme).build().perform();
driver.navigate().to("https://www.leafground.com/drag.xhtml;jsessionid=node012tp3vt1khffn"
		+ "22cqkwzcqhz5129553.node0");
WebElement drag = driver.findElement(By.xpath("//p[text()='Drag to target']"));
WebElement drop = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
ac.dragAndDrop(drag, drop).build().perform();
Thread.sleep(3000);
WebElement move = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
ac.clickAndHold(move).build().perform();
ac.moveToElement(move, 200, 0).build().perform();
//driver.get("https://amazon.in/");
//WebElement moblies = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//ac.contextClick(moblies).build().perform();
driver.get("https://www.w3schools.com/html/html_tables.asp");
List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
for(int i=0;i<table.size();i++) {
	System.out.println(table.get(i).getText());
}
Thread.sleep(5000);
for (WebElement ka : table) {
	System.out.println(ka.getText());
}
System.out.println("next syntax");
List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));
	for (WebElement p : row) {
		System.out.println(p.getText());
		}
	List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
	for (WebElement g : column) {
		System.out.println(g.getText());
	}
	List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	for (WebElement g : header) {
		System.out.println(g.getText());
	}
	WebElement particular = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]"));
	System.out.println(particular.getText());
	List<WebElement> findElements = driver.findElements(By.tagName("th"));
	for (int i = 0; i < findElements.size(); i++) {
		System.out.println(findElements.get(i).getText());
	}
	driver.get("https://amazon.in/");
	JavascriptExecutor  b=(JavascriptExecutor)driver;
	WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
	b.executeScript("arguments[0].scrollIntoView();",help);
	Thread.sleep(5000);
	b.executeScript("window.scrollBy(0,-3000);");
	Thread.sleep(5000);
	b.executeScript("window.scrollBy(0,3000);");
	driver.get("https://www.facebook.com/login/");
	WebElement email = driver.findElement(By.name("email"));
	b.executeScript("arguments[0].value='kishore'",email);
	WebElement passw = driver.findElement(By.id("pass"));
	b.executeScript("arguments[0].value='12345678'",passw);
	WebElement login = driver.findElement(By.id("loginbutton"));
	b.executeScript("arguments[0].click();",login);
	driver.get("https://demoqa.com/select-menu");
	WebElement ca = driver.findElement(By.id("cars"));
	Select ba=new Select(ca);
	ba.selectByIndex(1);
	ba.selectByValue("audi");
	ba.selectByVisibleText("Opel");
	List<WebElement> op =ba.getOptions();
	for(int i=0;i<op.size();i++) {
	System.out.println(op.get(i).getText());
 	}
	for (WebElement la : op) {
		System.out.println(la.getText());
	}
	List<WebElement> e = ba.getAllSelectedOptions();
	for (WebElement fa : e) {
		System.out.println(fa.getText());
	}
	for(int j=0;j<e.size();j++) {
		System.out.println(e.get(j).getText());
	}
	WebElement h = ba.getFirstSelectedOption();
	System.out.println(h.getText());
	driver.navigate().refresh();
	driver.get("https://amazon.in/");
	WebElement mo = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	ac.contextClick(mo).build().perform();
	Robot c=new Robot();
	c.keyPress(KeyEvent.VK_DOWN);
	c.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	c.keyPress(KeyEvent.VK_ENTER);
	c.keyRelease(KeyEvent.VK_ENTER);
	//b.executeScript("alert('sorry system is very slow better luck next time');");
	Thread.sleep(3000);
	TakesScreenshot de=(TakesScreenshot)driver;
	File l=de.getScreenshotAs(OutputType.FILE);
	File n=new File("C:\\Users\\KISHORE\\eclipse-workspace\\Selenium_Demo\\Screenshoot\\kis.png");
	FileHandler.copy(l, n);
	driver.quit();
	
}
}
