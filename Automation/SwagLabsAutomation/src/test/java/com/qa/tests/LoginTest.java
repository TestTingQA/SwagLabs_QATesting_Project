package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductPage;

public class LoginTest extends BaseTest
{
	
	
	@Test
	public void validloginTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		
		//Simple Validation
		String ExpectedUrl="https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(driver.getCurrentUrl(),ExpectedUrl);
		System.out.println("User LoggedIn Successfully");
		System.out.println("Alert accepted successfully");
		
	}
	@Test(enabled=false)
	public void InvalidLoginTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login("standard_use", "secret_sauc");
		String ActualOp=lp.errormessage();
		String ExpectedtOp="Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ActualOp, ExpectedtOp);
		System.out.println("Error message verified for Invalid User");
		
		
		
		
	}

}
