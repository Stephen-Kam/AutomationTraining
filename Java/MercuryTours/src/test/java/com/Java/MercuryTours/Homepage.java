package com.Java.MercuryTours;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage {

	WebDriver driver;
	
	Testing testing = new Testing();
	
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
			Assert.assertTrue("Check Text", driver.findElement(By.tagName("body")).getText().contains(testing.checkText(i)));
			testing.checkTitle(driver, i);
			driver.navigate().back();
			//aList = driver.findElements(By.tagName("a"));
			aList = driver.findElements(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/*"));
		}
	}

}
