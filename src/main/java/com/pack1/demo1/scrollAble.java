package com.pack1.demo1;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class scrollAble extends LuanchApp {
		
		public static void main(String args[]) throws MalformedURLException{
			
			driver = LongPressAction.capabilities();
			
			TouchAction action =  new TouchAction(driver);	
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"));");
	
		
	}

}
