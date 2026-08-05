package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.CartPages;
import com.qa.pages.CheckoutPages;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductPage;

public class CheckoutTest extends BaseTest{
	
	
	public void navigateToCheckout()
	
	
	{
		
		LoginPage lp=new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		ProductPage pg=new ProductPage(driver);
		pg.ScrollProduct();
		pg.AddtoCart();
		CartPages cp=new CartPages(driver);
		cp.CartButton();
		cp.Checkout();
		
	}
	@Test
	public void verifyPersonalDetails_ValidDetails()//TC_SL_Checkout_001
	{
		navigateToCheckout();
		CheckoutPages Check=new CheckoutPages(driver);
		Check.PersonalDetails("k", "S", "4567");
		String Checkout_OverviewPageDetails=Check.Checkout_PageInfo();
		System.out.println(Checkout_OverviewPageDetails);
		
		
	}
	@Test
	
	public void verifyPersonalDetails_InValidDetails() //TC_SL_Checkout_003
	{
		navigateToCheckout();
		CheckoutPages Check=new CheckoutPages(driver);
		Check.PersonalDetails("", "", "");
		String CheckoutErrorMesg=Check.Checkout_error();
		System.out.println(CheckoutErrorMesg);
		
		
	}
	
@Test
	public void CheckoutPageOverviewdetails() //TC_SL_Checkout_004
	{
		navigateToCheckout();
		CheckoutPages Check=new CheckoutPages(driver);
		Check.PersonalDetails("k", "S", "4567");
		Check.CheckoutOverviewDetails();
		Check.finishbtn();//TC_SL_Checkout_005
		String OrderMesg=Check.Order_Compl_Mesg();
		System.out.println(OrderMesg);
		
	}
}
