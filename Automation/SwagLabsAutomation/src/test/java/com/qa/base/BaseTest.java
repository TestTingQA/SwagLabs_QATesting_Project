package com.qa.base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void setup()
	
	{
		
		ChromeOptions options = new ChromeOptions();

        // Disable password manager + security popups
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.default_content_setting_values.notifications", 2);

        options.setExperimentalOption("prefs", prefs);

        // Clean browser session
        options.addArguments("--incognito");
        options.addArguments("--disable-popup-blocking");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	
	@AfterMethod
	
	public void CloseBrowser()
	{
		
		driver.quit();
	}

	
	

}
