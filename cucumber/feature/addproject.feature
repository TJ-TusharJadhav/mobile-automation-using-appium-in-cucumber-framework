 Feature: projects
  Background: 
  Given open the application 
  When I enter the email "salmankhan@mailinator.com"
  And I enter the password "salmankhan@mailinator.com"
  And I click the login button
  When click the projects option in dashboard 
  And click the add project button
  
@tag11
  Scenario: verify the add project functionality
  And enter the project name "project 1" 
  And enter the description "Enter the description" 
  And click the add button in add project form
  And Check if a new project has been added 
  @tag13
  Scenario: Verify empty field error in add project form
  And click the add button in add project form
  And Check the empty text filed meassage  


 
