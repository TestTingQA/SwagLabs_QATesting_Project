package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutPages 

{
 WebDriver driver;
 
	public CheckoutPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	//Locators 
	
		By Chek_Firstname=By.id("first-name");
		By Chek_Lastname=By.id("last-name");
		By Chek_Zipcode=By.id("postal-code");
		By Continue_btn=By.id("continue");
		By Personal_error=By.xpath("//div[@class='error-message-container error']");
		By Checkout_OverV=By.xpath("//div[@class='header_secondary_container']//span");
		By Payment_Info=By.xpath("//div[@data-test='payment-info-label']");
		By Shipping_Info=By.xpath("//div[@data-test='shipping-info-label']");
		By Price_tot_ItemTotal=By.xpath("//div[@data-test='subtotal-label']");
		By Price_tot_Tax=By.xpath("//div[@data-test='tax-label']");
		By Total=By.xpath("//div[@data-test='total-label']");
	    By Finish_Btn=By.id("finish");
		By Order_Complete_msg=By.id("checkout_complete_container");
		
		
		
	public void PersonalDetails(String F_name,String L_name,String Z_code)
	{
		driver.findElement(Chek_Firstname).sendKeys(F_name);
		driver.findElement(Chek_Lastname).sendKeys(L_name);
		driver.findElement(Chek_Zipcode).sendKeys(Z_code);
		driver.findElement(Continue_btn).click();
				
	}

	
	public String Checkout_error()
	{
		
		return driver.findElement(Personal_error).getText();
	}
	
	
	public String Checkout_PageInfo()
	{
		return driver.findElement(Checkout_OverV).getText();
	}
	
	public void CheckoutOverviewDetails()
	{
		
		Assert.assertTrue(driver.findElement(Payment_Info).isDisplayed(),"Payement Information is not Displayed");
		Assert.assertTrue(driver.findElement(Shipping_Info).isDisplayed(),"Shipping Information is not Displayed");
		Assert.assertTrue(driver.findElement(Price_tot_ItemTotal).isDisplayed(),"Item Total is not Displayed");
		Assert.assertTrue(driver.findElement(Price_tot_Tax).isDisplayed(),"Tax	 is not Displayed");
		Assert.assertTrue(driver.findElement(Total).isDisplayed(),"Price Total is not Displayed");
			
		
	}
	
	public void finishbtn()
	{
		driver.findElement(Finish_Btn).click();
	}
	
	public String Order_Compl_Mesg()
	{
		return driver.findElement(Order_Complete_msg).getText();
	}
	
	
	
}
