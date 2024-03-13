Feature: modify leave balances
  Background:  loginPage
  Given open the application
  When I enter the email "salmankhan@mailinator.com"
  And I enter the password "salmankhan@mailinator.com"
  And I click the login button
  And click the leave managment option in dashboard
  And click the modify leave balances option
  

  Scenario: verify the modify leave balances functionality
  And select the team members
  And select the leave type
  And select the set option in drop-down
  And enter the number of leaves
  And click the save button in modify leave balance
  And click the save button on modify leave balance
  Then check if the successfully message has been shown to the modify leave balances