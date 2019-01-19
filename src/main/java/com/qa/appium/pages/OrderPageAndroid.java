package com.qa.appium.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appium.qa.pages.GuestPage;
import com.appium.qa.pages.HomePage;

public class OrderPageAndroid {
	
	 public static WebDriver driver;
	 HomePage homePage = new HomePage(driver);
	    //HomePage homePage = new HomePageAndroid(driver);
		public OrderPageAndroid(AppiumDriver driver) {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}


	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Guest 1']")
	public WebElement guestFirstClick;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Guest 2']")
	public WebElement guestSecondClick;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Guest 3']")
	public WebElement guestThirdClick;

	@AndroidFindBy(id = "com.torenzo.torenzocafe:id/guest_name")
	public static List<WebElement> guestName;

	@AndroidFindBy(id = "com.torenzo.torenzocafe:id/order_no")
	public WebElement orderNumberFromOrderPage;

	@AndroidFindBy(id = "com.torenzo.torenzocafe:id/add_guest_btn")
	public WebElement addGuestBtn;

	public String getTextorderNumberFromOrderPage() throws InterruptedException{
		 
		return orderNumberFromOrderPage.getText();
	}
	
public GuestPage clickOnAddGuestBtn() throws InterruptedException, IOException{
	
 addGuestBtn.click();
 return new GuestPage(driver);
}

public boolean getTextFromFirstGuest() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	return guestFirstClick.isDisplayed();
}

	public void clickOnFirstGuest() throws InterruptedException{

		guestFirstClick.click();
	}
	
	public void clickOnSecondGuest() throws InterruptedException{
	
		guestSecondClick.click();
	}
	public void clickOnThirdGuest() throws InterruptedException{

		guestThirdClick.click();
	}
	
	public static int totolGuestCount() throws InterruptedException{
		
		Thread.sleep(3000);
		System.out.println("count==" +guestName.size());
		return guestName.size();

	}
	
	public void selectGuestandAddItem() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
      	List<WebElement> guestCountFromOrder = driver.findElements(By.id("guest_name"));
		System.out.println("guestCountFromOrder = " +guestCountFromOrder.size());
		homePage.clickAllCategoryItemButton();
			for(WebElement we:guestCountFromOrder)
			{
				we.click();
			 	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				for (int i=1; i<3; i++)
				{	Thread.sleep(500);
					driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'grid_menu_layout') and @index="+i+"]")).click();
					try{
						System.out.println("searching for modifier ");
						if(driver.findElement(By.xpath("//android.widget.TextView[@text='Apply Modifiers']")).isDisplayed())
						{
							System.out.println("Modifier displayed ");
							try{
								if(driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'card_view') and @index='0']")).isDisplayed())
								{
									System.out.println("clicking on modifier ");
									driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'card_view') and @index='0']")).click();
									driver.findElement(By.id("done_item_modifier")).click();
									
								}
							     }catch(Exception e)
								{
							    	 System.out.println("Modifier is not present on modifier window hence entering custom modifier");
							    	 WebElement custom = driver.findElement(By.id("custom_modifier_add"));
									custom.sendKeys("Spicy");
									WebElement count = driver.findElement(By.id("custom_modifier_count "));
									count.sendKeys("2");
									driver.findElement(By.id("add_custom_modifier_btn")).click();
									custom.sendKeys("Extra Spicy");
									count.sendKeys("3");
									driver.findElement(By.id("add_custom_modifier_btn")).click();
									driver.findElement(By.id("done_item_modifier")).click();
									
								}
						}
						
					}catch(Exception e)
					{
						System.out.println("Modifier not available for the item");
						
						}
							
						}
				
			/*	List<WebElement>totalItemAddedToOrder = driver.findElements(By.id("com.torenzo.torenzocafe:id/guest_orderd_item_recycler_view"));
				System.out.println("total item added tp item=" +totalItemAddedToOrder.size());
				List<WebElement>swiplayput= driver.findElements(By.id("com.torenzo.torenzocafe:id/swipe_layout"));
				System.out.println("swiplayput=" +swiplayput.size());
				List<WebElement>transaction_type_img= driver.findElements(By.id("com.torenzo.torenzocafe:id/transaction_type_img"));
				System.out.println("transaction_type_img=" +transaction_type_img.size());*/
				
				
			}
		

			}



}
