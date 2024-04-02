package LabTests_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Labtestpage {
	WebDriver driver;
	public Labtestpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"fixedHeaderCT\"]/div/div/div[3]/ul/li[4]/a")
	WebElement labtest_page;
	
	public void lab_test_page() {
		labtest_page.click();
	}

}
