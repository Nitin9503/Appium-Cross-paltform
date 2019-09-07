package com.practice1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import org.apache.tools.ant.taskdefs.WaitFor.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;

public class Demo1 {

	AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException,InterruptedException {
		Demo1 de = new Demo1();
		de.launch();
		de.login();
		
		de.touchActionClassMethod();
	 // de.launchAnotherApp();
	//	de.keys();
		
	//	de.netWork();

		/*de.scrollupOnsetting();
		Thread.sleep(2000);
		de.settingLogin();
		Thread.sleep(1000);
		de.scrollUpmethod();

		de.login();
		Thread.sleep(2000);
		de.swipeOnTorenzoAdminSetting();
		de.swipeOnWindow();

		de.editOrderScroll();
		Thread.sleep(2000);
		de.scrollUpmethod(); //
		de.lockDevice();

		de.openKeyboard();
		de.touchActions();
*/
	}

	public void launch() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Emulator");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0");
		caps.setCapability("udid", "192.168.208.101:5555");
		// caps.setCapability("orientation", "LANDSCAPE");
		// caps.setCapability("app",
		// "C:\\Users\\nikhil.sonawane\\Downloads\\farmrise_latest.apk");
		// caps.setCapability("appPackage", "com.climate.farmrise");
		// caps.setCapability("appActivity",
		// "com.climate.farmrise.language.view.LanguageActivity");

		caps.setCapability("appPackage", "com.torenzo.torenzocafe");
		caps.setCapability("appActivity","com.torenzo.torenzopos.StartScreenActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		/*
		 * caps.setCapability("appPackage", "com.android.settings");
		 * caps.setCapability("appActivity", "com.android.settings.Settings");
		 * driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
		 * caps);
		 */
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void lockDevice() throws InterruptedException {
		Thread.sleep(3000);
		driver.lockDevice();
		Thread.sleep(3000);
		System.out.println("verify =====>" + driver.isLocked());
		Thread.sleep(3000);
		driver.unlockDevice();
		driver.getKeyboard();
	}

	
	public void touchActionClassMethod(){
		
		
		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='All Items']"));
		
		TouchAction action  = new TouchAction(driver);
	
		action.tap(element).perform();
	
		
		
		
		
		
		
		


		
		
		
		

	}
	public void openKeyboard() throws InterruptedException {

		/*
		 * Thread.sleep(3000); driver.getKeyboard(); Thread.sleep(3000);
		 * System.out.println("verify =====>" +driver.isKeyboardShown());
		 * Thread.sleep(3000); driver.hideKeyboard();
		 * System.out.println("verify =====>" +driver.getDeviceTime());
		 * Thread.sleep(3000); driver.openNotifications();
		 */

		driver.rotate(ScreenOrientation.LANDSCAPE);

		driver.installApp("C:\\Users\\nikhil.sonawane\\Downloads\\farmrise_latest.apk");

		System.out.println("verify =====>"
				+ driver.isAppInstalled("com.climate.farmrise"));

	}

	public void login() {

		driver.findElement(By.id("open_exist_store")).click();
	
		
		driver.findElement(By.id("submit_login")).click();
		driver.findElement(By.id("clock_in")).click();
		driver.findElement(By.id("role_name")).click();
		driver.findElement(
				By.id("com.android.packageinstaller:id/permission_allow_button"))
				.click();
		driver.findElement(
				By.id("com.android.packageinstaller:id/permission_allow_button"))
				.click();

	}

	public void touchActions() {

		/*
		 * System.out.println("driver.getCapabilities();"
		 * +driver.getCapabilities()); //driver.removeApp("");
		 * System.out.println("driver.getSessionId();" +driver.getSessionId());
		 * //TouchActions action = new TouchActions(driver);
		 * System.out.println(" caps" + driver.getSessionDetails());
		 * System.out.println(" driver.getPageSource();===>" +
		 * driver.getPageSource());
		 */

		TouchActions action = new TouchActions(driver);
		action.scroll(driver.findElement(By
				.id("com.torenzo.torenzocafe:id/grid_recycler_view")), 20, 80);

		action.perform();

	}

	public void editOrderScroll() {
		System.out.println("Scrolling category view");
		Dimension size = driver.findElement(
				By.id("com.torenzo.torenzocafe:id/menus_grid_recycler_view"))
				.getSize();
		System.out.println("edit view size==>" + size);
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height / 0.20);
		int startx = size.width / 2;
		WebElement ele = (WebElement) driver.findElements(
				By.id("com.torenzo.torenzocafe:id/menus_grid_recycler_view"))
				.get(0);
		TouchAction action = new TouchAction(driver);
		action.longPress(ele).moveTo(startx, 1800).release().perform();
		System.out.println("Scrolling edit view done");

	}

	public void scrollUpmethod() {
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Show touches\"))");
	}

	public void scrollupOnsetting() {
		System.out.println("Scrolling setting view");
		Dimension size = driver.findElement(
				By.id("com.torenzo.torenzocafe:id/action_bar_root")).getSize();
		// com.android.settings:id/dashboard
		// com.torenzo.torenzocafe:id/action_bar_root
		System.out.println("setting view size==>" + size);
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;
		WebElement ele = (WebElement) driver.findElements(
				By.id("com.torenzo.torenzocafe:id/action_bar_root")).get(0);
		TouchAction action = new TouchAction(driver);
		action.longPress(ele).moveTo(startx, endy).release().perform();
		System.out.println("Scrolling edit view done");
	}

	public void swipeOnTorenzoAdminSetting() {
		System.out.println("Scrolling setting view");
		Dimension size = driver.findElement(
				By.id("com.torenzo.torenzocafe:id/action_bar_root")).getSize();
		// com.android.settings:id/dashboard
		// com.torenzo.torenzocafe:id/action_bar_root
		System.out.println("setting view size==>" + size);
		int startX = (int) (size.width * 0.05);
		int endX = (int) (size.width * 0.90);
		int conY = size.height / 2;
		WebElement ele = (WebElement) driver.findElements(
				By.id("com.torenzo.torenzocafe:id/action_bar_root")).get(0);
		TouchAction action = new TouchAction(driver);
		action.press(startX, conY).waitAction(2000).moveTo(endX, conY)
				.release().perform();
		System.out.println("Scrolling edit view done");
	}

	public void settingLogin() {
		driver.findElement(
				By.xpath("//android.widget.TextView[@text='Developer options']"))
				.click();

	}

	public void swipeOnWindow() {
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * .05);
		int endx = (int) (size.width * .90);
		int conY = (int) (size.height / 2);
		TouchAction action = new TouchAction(driver);
		action.press(startx, conY).waitAction(2000).moveTo(endx, conY)
				.release().perform();
	}

	public void launchAnotherApp() throws InterruptedException {
		driver.startActivity("com.climate.farmrise", "com.climate.farmrise.language.view.LanguageActivity");
	
	System.out.println("Activity====>"+driver.currentActivity());
	Thread.sleep(3000);
	driver.switchTo().window("handle");	
//	driver.startActivity(new Activity("com.torenzo.torenzocafe", "com.torenzo.torenzopos.StartScreenActivity"));

	
//	switchBetweenApp("com.torenzo.torenzocafe", "com.torenzo.torenzopos.StartScreenActivity");

//	driver.runAppInBackground(Duration.ofSeconds(10));
	
	System.out.println("Activity====>"+driver.currentActivity());
	
	//driver.resetApp();

       

	}
	
	
	public void pushAndPullFiles() throws IOException{
		
		driver.pushFile("device path " , new File("system path"));
	
			
	}
	
	public void keys() throws InterruptedException{
		
		
/*		MobileElement elementOne = (MobileElement) driver.findElementByAccessibilityId("SomeAccessibilityID");
		elementOne.get
		MobileElement elementTwo = (MobileElement) driver.findElementByClassName("SomeClassName");*/

		/*MobileElement element =(MobileElement) driver.findElementsByAccessibilityId("open_exist_store");
		element.click();*/		
		//driver.longPressKeyCode(AndroidKeyCode.HOME);
		
	List< WebElement> element = driver.findElementsById("open_exist_store");

	System.out.println("====================>" +element.size());
	
	
	Thread.sleep(3000);
	
	System.out.println("====================>" +element.get(0).getText());
	
	
	}
	
	public void netWork(){
		
		driver.toggleLocationServices();
	


	}
	
	public void switchBetweenApp(String appPackage, String appActivity){
		
		Activity  active =  new Activity(appPackage, appActivity);
		active.setAppWaitPackage(appPackage);
		active.setAppWaitActivity(appActivity);
		String act = null;
		
		try{
			
			((AndroidDriver) driver).startActivity(active);
			act = ((StartsActivity)driver).currentActivity();
			
			System.out.println("========>"  +act);
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
	}
public void launchApp(){
	
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("PlatformName", "Android");
	caps.setCapability("DeviceName", "motog");
	caps.setCapability("PlatformVersion", "6.0");
	caps.setCapability("udid", "2355z7");
	caps.setCapability("AppPackage", "com.com.pakage");
	caps.setCapability("AppActivity", "com.com.activity");
	
	try {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub") , caps);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
