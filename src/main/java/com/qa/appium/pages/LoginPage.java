package com.qa.appium.pages;

//import com.torenzo.qa.pages.HomePage;

public interface LoginPage   {
   
	
	boolean validatelaunchLink() throws Exception;
	void clickOnOpenExistStoreButton();
	boolean titleOfLoginPage();
	void passCreadentilas(String un, String pwd);
	void clickOnSubmitLoginButton();
	boolean validateClockInButton();
	void clickOnClockInButton();
	boolean validateTitileClockIn();
	void clickOnroleNameButton();
	boolean validatePermissionPopup();
	void clickOnPermissionPupup();
	
}
