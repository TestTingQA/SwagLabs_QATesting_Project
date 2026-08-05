package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	WebDriver driver;
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void ScrollProduct()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}
	
	//Locators:
	By ADDtoCartbtn=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By remove=By.id("remove-test.allthethings()-t-shirt-(red)");
	By CartCount=By.className("shopping_cart_badge");
	By SortDrop=By.className("product_sort_container");
	
	
	public void AddtoCart()
	{
		driver.findElement(ADDtoCartbtn).click();
	}
	
     public String CartCount()
    {
	return driver.findElement(CartCount).getText();
	 
    }
   public void Removebtn()
   {
	 driver.findElement(remove).click();
    }
   
   public boolean isCartDisplayed()
   {
	   return driver.findElements(CartCount).size()>0; //Since all items removed using findelement throws No Such Exception So use findelements
   }
 
   public void SortBy()
   {
	  
	   driver.findElement(SortDrop).click();
	   Select sel=new Select(driver.findElement(SortDrop));
	   List<WebElement>d_value=sel.getOptions();
	   
	   for(WebElement option:d_value)
	   {
		   System.out.println("DropDown Values:"+option.getText());
		   if(option.getText().equals("Name (Z to A)"))
		   {
			   option.click();
			   System.out.println("Page Sorted Out successfully");
			   break; 
			   }
	   }
	   
	   
   }
   
   
   
   
   
   
}
