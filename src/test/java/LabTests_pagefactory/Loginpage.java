package LabTests_pagefactory;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//*[@id=\"loginPopup\"]")
	WebElement usericon;
	
	@FindBy(xpath="//*[@id=\"headlessui-dialog-panel-3\"]/div[2]/div/div/div/form/div[1]/div/input")
	WebElement mobno;
	
	
	@FindBy(xpath="//button[@color='primary']")
	WebElement conti;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement otp_input;
	
	@FindBy(xpath="//*[@id=\"headlessui-dialog-panel-3\"]/div[2]/div/div/div/form/div/div[3]/button")
	WebElement click_button;
	
	public void user_icon() {
		usericon.click();
	}
	 
	public void mob_no(String mobnoo) {
		mobno.sendKeys(mobnoo);
	}
	public void mob_click() {
		conti.click();
	}
	public void otp_in() {
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter otp");
	      String otp=sc.next();
	       otp_input.sendKeys(otp);
		
	}
	public void otp_click() {
		click_button.click();
	}


}
