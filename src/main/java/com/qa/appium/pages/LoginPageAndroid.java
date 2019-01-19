package com.qa.appium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
//import com.appium.qa.pages.;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPageAndroid implements  LoginPage
{
    public static WebDriver driver;
    //HomePage homePage = new HomePageAndroid(driver);
	public LoginPageAndroid(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.torenzo.torenzocafe:id/open_exist_store")
	public WebElement openExistStoreButton;

	@AndroidFindBy(id = "com.torenzo.torenzocafe:id/view_sample_store")
	public WebElement viewSampleStoreButton;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Torenzo Cafe']")
	public WebElement titleOfLoginPage;
	
	@AndroidFindBy(id="com.torenzo.torenzocafe:id/access_name")
	public WebElement editTextAccessName;
	

	@AndroidFindBy(id="com.torenzo.torenzocafe:id/access_code")
	public WebElement editTextAccessCode;

	@AndroidFindBy(id="com.torenzo.torenzocafe:id/submit_login")
	public WebElement submitLoginButton;
	

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Clock-In']")
	public WebElement titileClockIn;
	
	@AndroidFindBy(id="com.torenzo.torenzocafe:id/clock_in")
	public WebElement clockInButton;
	
	@AndroidFindBy(id="com.torenzo.torenzocafe:id/role_name")
	public WebElement roleNameButton;
	
	@AndroidFindBy(id="com.torenzo.torenzocafe:id/cancel_clockin_popup")
	public WebElement cancelClockinFromClockingWindow;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Allow']")
	public WebElement allowButtonText;
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	public WebElement permissionAllowButton;
	
	
	
	public boolean validatelaunchLink() throws InterruptedException{
     Thread.sleep(9000);		
	return openExistStoreButton.isDisplayed();

				
	}
	public void clickOnOpenExistStoreButton(){
	
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);	
	openExistStoreButton.click();
				
	}
	
	public boolean titleOfLoginPage(){
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		return titleOfLoginPage.isDisplayed();
	}
	
	public void passCreadentilas(String un, String pwd){
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		editTextAccessName.sendKeys(un);
		//editTextAccessCode.sendKeys(pwd);
		
	}
	public void clickOnSubmitLoginButton(){
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		submitLoginButton.click();
				
	}
	
	public boolean validateClockInButton()
	{
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		return clockInButton.isDisplayed();
	
	}
	
	public void clickOnClockInButton(){
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		clockInButton.click();
	}
	@Override
	public boolean validateTitileClockIn() {
		// TODO Auto-generated method stub
		return titileClockIn.isDisplayed();
	}
	@Override
	public void clickOnroleNameButton() {
		// TODO Auto-generated method stub
		roleNameButton.click();
		
	}
	@Override
	public boolean validatePermissionPopup() {
		// TODO Auto-generated method stub
		return allowButtonText.isDisplayed();
	}
	@Override
	public void clickOnPermissionPupup() {
		// TODO Auto-generated method stub
		permissionAllowButton.click();
		permissionAllowButton.click();
		//return new HomePage(driver);
	}
}
