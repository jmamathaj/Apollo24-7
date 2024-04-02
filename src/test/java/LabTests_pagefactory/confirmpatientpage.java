package LabTests_pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmpatientpage {
	WebDriver driver;
	public confirmpatientpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//div[@class='SelectCartPatient_patientsWrap__YWp3p'][1]//img")
	WebElement sel_patient;
	
//	@FindBy(xpath="//div[@class='SelectCartPatient_footer__ADwhX']/button")
//	WebElement conti_patient;
	
	@FindBy(xpath="//*[contains(text(),'CONTINUE')]")
	WebElement conti_patient;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[2]/button")
	WebElement addmem_icon;
	
	@FindBy(xpath="//*[text()='Save']")
	WebElement savepatient_data;
	
	@FindBy(xpath="//*[contains(text(),'CONFIRM')]")
	WebElement confirm_patientdata;
	
	public void select_patient(){
		sel_patient.click();
	}
	public void continue_patient() {
		conti_patient.click();
	}
	public void add_icon() {
		addmem_icon.click();
	}
	
	public void save_patient_data() {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Actions action=new Actions(driver);
		action.moveToElement(savepatient_data);
		action.build().perform();
	//	savepatient_data.click();
	}
	
	public void confirm_patient_data() {
		confirm_patientdata.click();
	}
	
	
	

}
