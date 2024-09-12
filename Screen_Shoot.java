package org.kis;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shoot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclips"
			+ "e-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://www.facebook.com");
	a.manage().window().maximize();
	TakesScreenshot screen=(TakesScreenshot)a;
	File b=screen.getScreenshotAs(OutputType.FILE);
	File c=new File("C:\\Users\\KISHORE\\eclipse-workspace\\Selenium_Demo\\Screenshoot\\face.png");
	FileHandler.copy(b, c);
}
}
