package com.pack1.demo1;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dragdrop extends LuanchApp {
	public static void main(String args[]) throws MalformedURLException{
		
		driver = LongPressAction.capabilities();
		
		TouchAction action =  new TouchAction(driver);	
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();

		
		WebElement ele1 =  driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement ele2 =  driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));

		action.longPress(element(ele1)).moveTo(element(ele2)).release().perform();
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
	
}

}

