package org.kis;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KISHORE\\eclipse-workspace\\"
		+ "Selenium_Demo\\Driver2\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/html/html_tables.asp");
driver.manage().window().maximize();
List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
for(int i=0;i<table.size();i++) {
	System.out.println(table.get(i).getText());
}
Thread.sleep(5000);
for (WebElement k : table) {
	System.out.println(k.getText());
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
}

}
