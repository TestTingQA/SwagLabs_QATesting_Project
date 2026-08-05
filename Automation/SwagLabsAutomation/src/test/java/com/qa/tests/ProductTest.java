
	package com.qa.tests;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.qa.base.BaseTest;
	import com.qa.pages.LoginPage;
	import com.qa.pages.ProductPage;

	public class ProductTest extends BaseTest
	{
		
		
		@Test
		
		public void VerifyProduct()
		{
			
		
		LoginPage lp=new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		ProductPage pg=new ProductPage(driver);
		pg.ScrollProduct();
		pg.AddtoCart();
		String cartvalue=pg.CartCount();
		System.out.println("Cart Count is:"+cartvalue); // Test case PL_003
		pg.Removebtn(); //Testcase Pl_006
		boolean cartval_afterremove=pg.isCartDisplayed();
		System.out.println("After removed the item Cart Count:"+cartval_afterremove);
		pg.SortBy();
	
		
		
		
		
		}
	}



