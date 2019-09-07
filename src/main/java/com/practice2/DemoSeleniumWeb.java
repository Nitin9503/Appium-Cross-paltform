package com.practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DemoSeleniumWeb {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
	

		DemoSeleniumWeb ds = new DemoSeleniumWeb();
		ds.launch();
	}
	
	public void launch(){
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https:\\www.facebook.com");
	
	}

}
