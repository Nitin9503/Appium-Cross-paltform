package com.pack1.demo1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LuanchApp {
	
	static AndroidDriver driver;
	public static AndroidDriver capabilities() throws MalformedURLException {

	

	File src1 = new File(".\\src\\main\\java\\com\\practice1\\ApiDemos-debug.apk");
	
	DesiredCapabilities capabilities = new DesiredCapabilities();

	capabilities.setCapability("deviceName",
			"Rahulemulator");
	capabilities.setCapability("app",
			src1.getAbsolutePath());
	driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),
			capabilities);

	return driver;
	
	}
	
}
