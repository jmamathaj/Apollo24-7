
Feature: Appointment for Lab tests

  
  Background: Login to the application
  Given I want to login to apollo247
  When I enter mobile number as "9391548398"
  And click on continue
  And I enter otp
  And click on verify otp
  Then the login is successful
	
	
  #Scenario: Add members to page   
   # Given I am on the lab tests page 
   # When I selectd a particular test it display all tests
   #	And  add test to cart
  #	And go to cart 
   # And click on memebrs to add
  #	And provide the required deatils
  #	Then confirm the details
 	   
 	
  Scenario: Book Lab test appointment
    Given I am on the lab tests page 
    When I selectd a particular test it display all tests
   	And  add test to cart
   	And go to cart
    And select the person
    And confirm the appointment
    Then I should see a address
    

   Scenario: search lab test by category
    Given I am on the lab tests page 
    When I  click on search bar
    And I enter specific testname
    Then I should see relevant tests 
       
  
   Scenario: View test details of lab test
  	Given I am on the lab tests page 
    When I selectd a particular test it display all tests
  	And I click on spectific test for details
  	Then it should show detailed information about the test
  	
 # @SmokeTest		
  Scenario: selecting sort by visible values 
  	Given I am on the lab tests page 
    When I selectd a particular test it display all tests
  	And I click on sort by
  	And I selectd sort value
  	Then it should sort by selected value
  	
  Scenario Outline: select multiple tests
  	Given I am on the lab tests page 
    When I  click on search bar
    And I search for specific test as <TestName>
  	And add that test to cart
  	Then adding tests is successful
   	Examples: 
    		  | TestName   |
    		  |"pregnancy" |
      		| "Women"    |
    
  
  
 
 
  
  