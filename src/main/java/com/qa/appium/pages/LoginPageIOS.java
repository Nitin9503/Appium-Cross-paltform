package com.qa.appium.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPageIOS implements LoginPage {

	public LoginPageIOS(AppiumDriver driver) {
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
	@Override
	public boolean validatelaunchLink() throws Exception {
		return openExistStoreButton.isDisplayed();
		
	}

	@Override
	public void clickOnOpenExistStoreButton() {
		// TODO Auto-generated method stub
		openExistStoreButton.click();
	}

	@Override
	public boolean titleOfLoginPage() {
		// TODO Auto-generated method stub
		return titleOfLoginPage.isDisplayed();
	}

	@Override
	public void passCreadentilas(String un, String pwd) {
		// TODO Auto-generated method stub
		editTextAccessName.sendKeys(un);
		editTextAccessCode.sendKeys(pwd);
		
	}

	@Override
	public void clickOnSubmitLoginButton() {
		// TODO Auto-generated method stub
		submitLoginButton.click();
		
	}

	@Override
	public boolean validateClockInButton() {
		// TODO Auto-generated method stub
		return clockInButton.isDisplayed();
	}

	@Override
	public void clickOnClockInButton() {
		// TODO Auto-generated method stub
		clockInButton.click();
		
	}
}
