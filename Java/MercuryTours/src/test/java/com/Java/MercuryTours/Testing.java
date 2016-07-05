package com.Java.MercuryTours;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class Testing {
	
	public Testing() {
	}
	
	public String checkText(int i){
		List<String> stringList = new ArrayList<String>();
		stringList.add("Welcome back to Mercury Tours");
		stringList.add("To create your account");
		stringList.add("This section of our web site");
		stringList.add("This section of our web site");
		
		return stringList.get(i);
	}
	
	public WebDriver checkTitle(WebDriver driver, int i) {
		switch (i) {
		case 0:
			Assert.assertTrue("Check title is correct", driver.getTitle().contains("Sign-on: Mercury Tours"));
			break;
		case 1:
			Assert.assertTrue("Check title is correct", driver.getTitle().contains("Register: Mercury Tours"));
			break;
		case 2-3:
			Assert.assertTrue("Check title is correct", driver.getTitle().contains("Under Construction: Mercury Tours"));
			break;
		}
		return driver;
	}
}
