package com.qa.appium.pages;

public interface HomePage {
	
	String titleOfhomePage() throws InterruptedException;
	void clickAllCategoryItemButton() throws InterruptedException;
	void clickUserDetailsButton();
	void ClickOrderListLayoutButton();
	String getTextFromOrderTotal();
	 void clickOnOrderTotalUpsideButton();
	 void clickNewOrderCreateBtn();
}
