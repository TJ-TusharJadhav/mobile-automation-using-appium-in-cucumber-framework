 Feature: add leave types
  Background:  loginPage
  
  

  Scenario: verify the add leave types functionality
  Given open the application
  When I enter the email "salmankhan@mailinator.com"
  And I enter the password "salmankhan@mailinator.com"
  And I click the login button
  And click the leave managment option in dashboard 
  And click the leave types option
  And click the add leave type button
  And enter the leave type name  
  And enter the description in leave type field 
  And click the is balance tracked 
  And click the save button in add leave type form
  Then Check if a new leave type has been added in leave type field  

  Scenario: Verify empty field error in add leave form
  And click the add leave type button
  And click the save button in add leave type form
  Then Check the empty text filed meassage in leave type field  

