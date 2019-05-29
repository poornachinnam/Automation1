package com.TestingWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config2{
	String srcpath = System.getProperty("user.dir");
	//String path= System.getProperty("user.dir\\drivers\\chromedriver.exe");
	String set=System.setProperty("webdriver.chrome.driver",srcpath+"\\drivers\\chromedriver.exe");
	public WebDriver driver= new ChromeDriver(); 
		
}