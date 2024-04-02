package LabTests_pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testdetails {
	WebDriver driver;
	public Testdetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
//	@FindBy(xpath="//*[@id=\\\"mainContainerCT\\\"]/div[1]/div[1]/div/div[1]/a/div")
//	WebElement select_test;
	
	@FindBy(xpath="//a[@class='ix']//div[@class='kx']//p[contains(text(),'Apollo Health Check - Basic')]")
	WebElement test_details;
	
//	public void select_test_category() {
//		select_test.click();
//	}
	
	
//	public void see_testdetails() {
//		test_details.click();
//	}
	
	public void see_testdetails() {
		
	    try{
	    	test_details.click();
	    }catch(StaleElementReferenceException sere){
	        try {
	        	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    }catch (Exception e){}
	        test_details = driver.findElement(By.xpath("//a[@class='ix']//div[@class='kx']//p[contains(text(),'Apollo Health Check - Basic')]"));
	        test_details.click();
	    }
	}

}
