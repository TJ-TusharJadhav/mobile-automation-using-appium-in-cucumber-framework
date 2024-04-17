 Feature:  validate team member
 Background:
 Given open the application
 When I enter the email "salmankhan@mailinator.com"
 And I enter the password "salmankhan@mailinator.com"
 And I click the login button
 And click team member option
Scenario: validate team member
And check the user first name
And check the user last name
And check the user email
And check the user phone no.

