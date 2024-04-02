package LabTests_pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fullbodypage {
	WebDriver driver;
	public Fullbodypage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="(//p[text()='Full Body Checkup'])[1]")
	WebElement fullbody_test;
	
	@FindBy(xpath="//div[1][@class='SingleTypeListing_box__FkDWj undefined hideWidget']//button")
	WebElement fbadd_test;
	
	@FindBy(id="headlessui-listbox-button-1")
	WebElement sortby;
	
	@FindBy(id="headlessui-listbox-option-3")
	WebElement select_sortvalue;
	
public void fullbody_page() {
	driver.navigate().refresh();
    try{
        fullbody_test.click();
    }catch(StaleElementReferenceException sere){
        try {
        	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
    }catch (Exception e){}
        fullbody_test = driver.findElement(By.xpath("(//p[text()='Full Body Checkup'])[1]"));
                fullbody_test.click();
    }
}
	

	public void add_testfb() {
		fbadd_test.click();
	}
	public void sort_by() {
		sortby.click();
	}
	public void sortvalue_select() {
		
		select_sortvalue.click();
	}
}