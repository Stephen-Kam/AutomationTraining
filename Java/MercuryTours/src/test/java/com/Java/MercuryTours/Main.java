package com.Java.MercuryTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import junit.framework.Assert;

public class Main {

		WebDriver driver = new FirefoxDriver();
		Homepage homepage = new Homepage(driver);
		
	@BeforeTest
	public void launchSite() {
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	public void navigateToRegister() {
		homepage.register.click();
		System.out.println(driver.getTitle());
		Assert.assertTrue("Check title is correct", driver.getTitle().contains("Register: Mercury Tours"));
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

}
