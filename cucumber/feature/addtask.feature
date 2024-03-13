Feature: Task
  Background:  login 
  Given open the application
  When I enter the email "salmankhan@mailinator.com"
  And I enter the password "salmankhan@mailinator.com"
  And I click the login button
  When click the projects option in dashboard 
  And select the project
  And click add task button
  
@tag1231
  Scenario: verify the add task functionality
  And enter the task name "Task 1" 
  And enter the description in add task form "Enter the description" 
  And click the add button in add task form
  And Check if a new task has been added 
@tag1324
  Scenario: Verify empty field error in add task form
  And click the add button in add task form
  And Check the empty text filed meassage in add task form