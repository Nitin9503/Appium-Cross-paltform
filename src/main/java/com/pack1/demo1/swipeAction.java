package com.pack1.demo1;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.offset.ElementOption.element;
public class swipeAction  extends LuanchApp {

	public static void main(String[] args) throws MalformedURLException {
		driver = LongPressAction.capabilities();
		
		TouchAction action =  new TouchAction(driver);	
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
		
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		
		
		WebElement  first = 	driver.findElement(By.xpath("//*[@content-desc='15']"));
		WebElement  second = 	driver.findElement(By.xpath("//*[@content-desc='45']"));
		
	
		
		action.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
		
	}

}
