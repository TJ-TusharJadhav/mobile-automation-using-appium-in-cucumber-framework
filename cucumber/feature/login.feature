
Feature: Login page validation 
 Background:  
 Given open the application
 @tag1
  Scenario Outline: verify the login with valid credentials
     
     When user enters the email as <email>
     And user enters the password as <password>
     And user click on login button
     Then A login success message should be displayed
    Examples:
    | email                     | password                  |
    | salmankhan@mailinator.com | salmankhan@mailinator.com |
    
     
   @tag2 
   Scenario Outline: verify the login with Invalid credentials 
     
     When user enters the email as <email>
     And user enters the password as <password>
     And user click on login button
     Then A bad credentials message should be displayed
      Examples:
    | email                     | password                  |
    | salmankhan@mailinator.com | salmerthan@mailinator.com |
 @tag3 
  Scenario Outline: verify the login with blank credentials
    
     And user click on login button
     Then A empty emailfield message should be displayed
     Then A empty passwordfield message should be displayed
   
     
     
     