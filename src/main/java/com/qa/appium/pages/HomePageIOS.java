package com.qa.appium.pages;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class HomePageIOS implements HomePage{

	
	 public HomePageIOS(AppiumDriver driver) {
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
}
