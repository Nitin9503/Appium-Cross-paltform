package com.qa.appium.Testcases;

import org.testng.annotations.Test;

public class HomeTest extends BaseTestClass {

	@Test
	public void VerifyHomePage() throws InterruptedException {

		homePage.clickAllCategoryItemButton();
		//homePage.clickUserDetailsButton();
		//homePage.ClickOrderListLayoutButton();
		//homePage.getTextFromOrderTotal();
		//homePage.clickOnOrderTotalUpsideButton();
		homePage.clickNewOrderCreateBtn();
	}
}