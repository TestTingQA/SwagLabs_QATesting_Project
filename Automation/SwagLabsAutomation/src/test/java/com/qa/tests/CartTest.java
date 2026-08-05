package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.CartPages;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductPage;

public class CartTest extends BaseTest
{
 @Test
	public void Cartmodule()
	{
		
		LoginPage lp=new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		ProductPage pg=new ProductPage(driver);
		pg.ScrollProduct();
		pg.AddtoCart();
		CartPages cp=new CartPages(driver);
		cp.CartButton();
		String item_details=cp.PageValida();
		System.out.println("Verify Product Details are displayed:" +item_details);
		cp.Checkout();// TC_CART_005
		

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
