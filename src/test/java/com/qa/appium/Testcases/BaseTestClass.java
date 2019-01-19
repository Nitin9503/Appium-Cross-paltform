package com.qa.appium.Testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import appiumSupport.AppiumBaseClass;
import appiumSupport.AppiumController;

import com.qa.appium.pages.HomePage;
import com.qa.appium.pages.HomePageAndroid;
import com.qa.appium.pages.HomePageIOS;
import com.qa.appium.pages.LoginPage;
import com.qa.appium.pages.LoginPageAndroid;
import com.qa.appium.pages.LoginPageIOS;

public class BaseTestClass extends AppiumBaseClass{

    LoginPage loginPage;
	HomePage homePage;

	@BeforeSuite
	public void setUp() throws Exception {
		AppiumController.instance.start();
		switch (AppiumController.executionOS) {
		case ANDROID:
			// case ANDROID_BROWSERSTACK:
			loginPage = new LoginPageAndroid(driver());
			homePage = new HomePageAndroid(driver());
			break;
		case IOS:
			// case IOS_BROWSERSTACK:
			loginPage = new LoginPageIOS(driver());
			homePage = new HomePageIOS(driver());
			break;
		}
		
	}
    @BeforeTest
    public void loginApp() throws Exception {
        //login validate url
	   loginPage.validatelaunchLink();

        //Verify click on open existing store link
	   loginPage.clickOnOpenExistStoreButton();

        //verify login page title
	   loginPage.titleOfLoginPage();

        //Verify that correct page is displayed
	   loginPage.passCreadentilas("torenzocafe", "1234");
	   
	 //Verify click on login button
	   loginPage.clickOnSubmitLoginButton();
	   Thread.sleep(2000);
	 //Verify clockin button
	   loginPage.validateClockInButton();
	   
	 //Verify that correct page is displayed
	   loginPage.clickOnClockInButton();
	   
	   loginPage.validateTitileClockIn();
	   
	   loginPage.clickOnroleNameButton();
	   
	   loginPage.validatePermissionPopup();
	   
	   loginPage.clickOnPermissionPupup();
    }

	@AfterSuite
	public void tearDown() {
		AppiumController.instance.stop();
	}
}
