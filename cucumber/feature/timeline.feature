Feature: timeline
  Background: login
  Given open the application
  When I enter the email "salmankhan@mailinator.com"
  And I enter the password "salmankhan@mailinator.com"
  And I click the login button
  When click the projects option in dashboard 
  And select the project
  And select the task
  And click add button in timeline
  
  @tag1 
  Scenario: Verify single day time entry functionality in project
  And select date in timeline
  And select time in timeline
  And click save button in timeline
  And check the success message in timeline
  
  Scenario: Verify dual day time entry functionality in project
  #And select date in timeline
  #And select time in timeline
  #And click save button in timeline
  #And check the success message in timeline