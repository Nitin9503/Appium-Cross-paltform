package com.qa.appium.Testcases;

import org.testng.annotations.Test;




public class LoginTest extends BaseTestClass{

	 
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
	


	
	
}
