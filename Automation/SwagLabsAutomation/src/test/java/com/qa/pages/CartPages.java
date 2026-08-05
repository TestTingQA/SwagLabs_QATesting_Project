package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPages {
	
	WebDriver driver;
	
	public CartPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators 
	
	By CartV=By.id("shopping_cart_container");
	By CheckoutBtn=By.id("checkout");
	By Pageva=By.xpath("//div[@class='cart_list']");
	
	
	
	public void CartButton()
	{
		driver.findElement(CartV).click();
			
		}	
	

     public String PageValida()
     {
    	 return driver.findElement(Pageva).getText();
    	 
     }
     
     
     public void Checkout()
     {
  	
      boolean check_v=driver.findElement(CheckoutBtn).isEnabled();
  	System.out.println("Is Checkout button Enabled:"+check_v);
  	driver.findElement(CheckoutBtn).click();
  	
     }
     
   
   



}


