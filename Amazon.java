package com.TestingWebsites;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

class Dummy{
	
}
public class Amazon {
	String s=System.setProperty("webdriver.gecko.driver", "C:\\AUTOMATION_PRACTICE\\SeleniumTesting\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	@Test
	public void m1() {
		System.setProperty("webdriver.gecko.driver", "C:\\AUTOMATION_PRACTICE\\SeleniumTesting\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://WWW.Flipkart.com");
		
	}
	@Test
	public void m2() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.wait(300);
		
		
		
	}
	@AfterTest
	void closesession() {
		driver.close();
	}
	
}
