package LabTests_pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gotocart {
	WebDriver driver;
	public Gotocart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//div[@class='jss40']//button[2]")
	WebElement goto_cart;
	
	public void goto_cart_page() {
		goto_cart.click();
	}

}
