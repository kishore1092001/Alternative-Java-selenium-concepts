package org.kis;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KISHORE\\eclipse-workspac"
				+ "e\\Selenium_Demo\\Driver2\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://demoqa.com/select-menu");
		a.manage().window().maximize();
		WebElement c = a.findElement(By.id("cars"));
		Select b=new Select(c);
		b.selectByIndex(1);
		b.selectByValue("audi");
		b.selectByVisibleText("Opel");
		List<WebElement> op =b.getOptions();
		for(int i=0;i<op.size();i++) {
    	System.out.println(op.get(i).getText());
			
     	}
		for (WebElement l : op) {
			System.out.println(l.getText());
		}
		List<WebElement> e = b.getAllSelectedOptions();
		for (WebElement f : e) {
			System.out.println(f.getText());
		}
		for(int j=0;j<e.size();j++) {
			System.out.println(e.get(j).getText());
		}
		WebElement h = b.getFirstSelectedOption();
		System.out.println(h.getText());
		System.out.println(b.isMultiple());
}
}