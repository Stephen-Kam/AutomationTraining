package com.Java.MercuryTours;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;


public class Homepage {

	WebDriver driver;
	
	//Top Navigation Links
	@FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement register;
	
	
	public Homepage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void listLinks(){
		
		List<WebElement> aList = driver.findElements(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/*"));
		//List<WebElement> aList = driver.findElements(By.tagName("a"));
		for (int i=0; i < aList.size(); i++) {
			aList.get(i).click();
			System.out.println(driver.getTitle());
			checkText(i);
			driver.navigate().back();
			//aList = driver.findElements(By.tagName("a"));
			aList = driver.findElements(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/*"));
		}
	}
	
	public void checkText(int i) {
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
	}
	
}
