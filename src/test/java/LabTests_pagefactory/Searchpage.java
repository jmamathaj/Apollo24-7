package LabTests_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
	WebDriver driver;
	public Searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//*[@id=\"fixedHeaderCT\"]/div/div[1]/div[2]/div/div[1]/input")
	WebElement select_search;
	
	@FindBy(xpath="//input[@placeholder='Search for lab tests']")
	WebElement search_input;
	
	@FindBy(xpath="//li[1]/div[1]/div[2]/div/button")
	WebElement adding_test;
	
	public void select_searchbar() {
		select_search.click();
	}
	public void searchbar_input(String sinput) {
		search_input.sendKeys(sinput);
	}
	
	public void add_test() {
		adding_test.click();
	}

}
