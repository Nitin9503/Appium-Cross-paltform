package com.pack1.demo1;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;




import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;


public class LongPressAction extends LuanchApp{
	

	public static void main (String args[]) throws MalformedURLException{
		
		driver = LongPressAction.capabilities();
		
		TouchAction action =  new TouchAction(driver);	
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement elelemtn = driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
		action.tap(tapOptions().withElement(element(elelemtn))).perform();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		
		WebElement elements =	driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
	
		
	
		action.longPress(longPressOptions().withElement(element(elements)).withDuration(ofSeconds(2))).release().perform();
		
		
	}
	

}

/*  we can use this method throught the project
public void longpressMethod(WebElement element){
	TouchAction action =  new TouchAction(driver);
	action.longPress(longPressOptions().withElement(element(element)).withDuration(ofSeconds(2))).release().perform();
}*/
