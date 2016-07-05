package com.Java.MercuryTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Main {

		WebDriver driver = new FirefoxDriver();
		Homepage homepage = new Homepage(driver);
		
	@BeforeTest
	public void launchSite() {
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	public void checkLinks() {
		homepage.listLinks();
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}

}
