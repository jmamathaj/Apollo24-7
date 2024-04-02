package StepDefinition;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LabTests_pagefactory.Fullbodypage;
import LabTests_pagefactory.Gotocart;
import LabTests_pagefactory.Labtestpage;
import LabTests_pagefactory.Loginpage;
import LabTests_pagefactory.Searchpage;
import LabTests_pagefactory.Testdetails;
import LabTests_pagefactory.confirmpatientpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApolloLabTests {
	WebDriver driver;
//	WebDriverManager.chromedriver().setup();

	@Given("I want to login to apollo247")
	public void i_want_to_login_to_apollo247() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.setProperty("Webdriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chrome.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-geolocation");
		
		driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://www.apollo247.com/");
        String winHandle = driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement user = driver.findElement(By.id("loginPopup"));
//        user.click();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Loginpage l= new Loginpage(driver);
		l.user_icon();
	}

	@When("I enter mobile number as {string}")
	public void i_enter_mobile_number_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
//	     WebElement mobno=driver.findElement(By.xpath("//*[@id=\"headlessui-dialog-panel-3\"]/div[2]/div/div/div/form/div[1]/div/input"));
//	     mobno.sendKeys(string);
		 Loginpage l= new Loginpage(driver);
		 l.mob_no(string);

		
	}

	@When("click on continue")
	public void click_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		WebElement cont=driver.findElement(By.xpath("//*[@id=\"headlessui-dialog-panel-3\"]/div[2]/div/div/div/form/div[3]/div/input"));
		cont.click();
		//driver.findElement(By.xpath("//button[@color='primary']")).click();
		Loginpage l= new Loginpage(driver);
		l.mob_click();

	}

	@When("I enter otp")
	public void i_enter_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	      //driver.findElement(By.xpath("//button[@color='primary']")).click();
//	      Scanner sc=new Scanner(System.in);
//	      System.out.println("enter otp");
//	      String otp=sc.next();
//	      WebElement otp_input=driver.findElement(By.xpath("//input[@type='tel']"));
//	      otp_input.sendKeys(otp);
		Loginpage l= new Loginpage(driver);
		l.otp_in();

		
	}

	@When("click on verify otp")
	public void click_on_verify_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement click_button=driver.findElement(By.xpath("//*[@id=\"headlessui-dialog-panel-3\"]/div[2]/div/div/div/form/div/div[3]/button"));
//		click_button.click();
		Loginpage l= new Loginpage(driver);
		l.otp_click();


	}

	@Then("the login is successful")
	public void the_login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("I am on the lab tests page")
	public void i_am_on_the_lab_tests_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement labtest_page=driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[3]/ul/li[4]/a/p"));
//		labtest_page.click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		Labtestpage lp=new Labtestpage(driver);
		lp.lab_test_page();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

	}

	@When("I selectd a particular test it display all tests")
	public void i_selectd_a_particular_test_it_display_all_tests() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement fullbody_test=driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div[2]/div/div[1]/a/div/div[2]/p"));
//		fullbody_test.click();
		 driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		 String winHandle = driver.getWindowHandle();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-geolocation");
		 driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		//String winHandle1 = driver.getWindowHandle();
		Fullbodypage fp=new Fullbodypage(driver);
		fp.fullbody_page();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);

		
	   
	}

	@When("add test to cart")
	public void add_test_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement add_cart=driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/button"));
//		add_cart.click();
		Fullbodypage fb=new Fullbodypage(driver);
		fb.add_testfb();
		
	}


	@When("go to cart")
	public void go_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement goto_cart=driver.findElement(By.xpath("//*[@id='mainContainerCT']/div/div/div[2]/div[2]/div[2]/button[2]/span"));
//		goto_cart.click();
		Gotocart gc=new Gotocart(driver);
		gc.goto_cart_page();

	}
/*---------------------------
	@When("click on memebrs to add")
	public void click_on_memebrs_to_add() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement add_members=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[2]/button/span"));
//		add_members.click();
		confirmpatientpage cp=new confirmpatientpage(driver);
		cp.add_icon();
		
		

	}

	@When("provide the required deatils")
	public void provide_the_required_deatils() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	     firstname.sendKeys("user");
	     
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     WebElement lastname= driver.findElement(By.xpath("//input[@placeholder='Last name']"));
	    lastname.sendKeys("test");
	     
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     WebElement date_of_birth=driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']"));
	     date_of_birth.sendKeys("01/12/1998");
	     
	    
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     WebElement gender= driver.findElement(By.xpath("//*[contains(text(),'Female')]"));
	     gender.click(); 
	    
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     WebElement relation_Dropdown = driver.findElement(By.xpath("//div[@class='MuiSelect-root jss24 MuiSelect-select MuiSelect-selectMenu jss25 MuiInputBase-input MuiInput-input']"));
	    relation_Dropdown.click();
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    WebElement relation_selection=driver.findElement(By.xpath("//li[2][@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']"));
	    relation_selection.click();
	}

	@Then("confirm the details")
	public void confirm_the_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
//	    WebElement save_data=driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[2]/button[2]"));
//	    save_data.click();
//	    
//	    WebElement confirm_data=driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div[2]/div/div[2]/button[2]"));
//	    confirm_data.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//WebElement element=driver.findElement(By.xpath("//*[text()='Save']"));
		
		
		
		confirmpatientpage cp=new confirmpatientpage(driver);
		cp.save_patient_data();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		confirmpatientpage cp1=new confirmpatientpage(driver);
		cp1.confirm_patient_data();
	}-------------------*/
	@When("select the person")
	public void select_the_person() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		 WebElement add_patient=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/img"));
//	      add_patient.click();
		confirmpatientpage cp=new confirmpatientpage(driver);
		cp.select_patient();
		
	}

	@When("confirm the appointment")
	public void confirm_the_appointment() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement confirm_person=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/button/span"));		
//		confirm_person.click();
		confirmpatientpage cp=new confirmpatientpage(driver);
		cp.continue_patient();

		
	}

	@Then("I should see a address")
	public void i_should_see_a_address() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	@When("I  click on search bar")
	public void i_click_on_search_bar() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement select_search=driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div[1]/div[2]/div/div[1]/input"));
//		select_search.click();
		Searchpage sp=new Searchpage(driver);
		sp.select_searchbar();
	}

	@When("I enter specific testname")
	public void i_enter_specific_testname() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//	    WebElement test_name=driver.findElement(By.xpath("//*[@id=\"fixedSearchCT\"]/div/div/div/input"));
//	    test_name.sendKeys("cardiovascular");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Searchpage sp=new Searchpage(driver);
		sp.searchbar_input("cardiovascular");


	}

	@Then("I should see relevant tests")
	public void i_should_see_relevant_tests() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	
	
	@When("I click on spectific test for details")
	public void i_click_on_spectific_test_for_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement testdetails=driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/a/div[2]/p[1]"));
//	    testdetails.click();
//		Fullbodypage fb=new Fullbodypage(driver);
//		fb.fullbody_page();
		Testdetails td=new Testdetails(driver);
		td.see_testdetails();
	}

	@Then("it should show detailed information about the test")
	public void it_should_show_detailed_information_about_the_test() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,200)");
		
	}
	@When("I click on sort by")
	public void i_click_on_sort_by() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		Fullbodypage fp=new Fullbodypage(driver);
		fp.sort_by();
	}

	@When("I selectd sort value")
	public void i_selectd_sort_value() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		Fullbodypage fp=new Fullbodypage(driver);
		fp.sortvalue_select();
	}

	@Then("it should sort by selected value")
	public void it_should_sort_by_selected_value() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}



	
	
	@When("I search for specific test as {string}")
	public void i_search_for_specific_test_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement search_bar=driver.findElement(By.xpath("//*[@id=\"fixedSearchCT\"]/div/div/div/input"));
//		search_bar.sendKeys(string);
		Searchpage sp=new Searchpage(driver);
		sp.searchbar_input(string);
	}

	@When("add that test to cart")
	public void add_that_test_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement add_test=driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div[1]/div[3]/div/div/div[1]/div[2]/div/div[1]/div[2]/ul/li[1]/div/div[2]/div/button"));
//		add_test.click();
//		 WebElement cancel=driver.findElement(By.xpath("//*[@id=\"fixedSearchCT\"]/div/div[2]/img"));
//	     cancel.click();
		Searchpage sp= new Searchpage(driver);
		sp.add_test();
	}

	@Then("adding tests is successful")
	public void adding_tests_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}









}
