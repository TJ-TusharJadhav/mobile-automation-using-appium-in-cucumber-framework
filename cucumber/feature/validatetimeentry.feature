Feature: varify the Timeentry in approval side
  #Background:  loginPage
  Scenario: check if the employee time entry appears on approval
  Given open the application
  When I enter the email "salmankhan@mailinator.com"
  And I enter the password "salmankhan@mailinator.com"
  And I click the login button
  And click the projects in dashboard
  And select the project and task
  And check the time entry
  And click the main menu
  And click the timesheet approval in main menu
  And select the team member in timesheet approval
  And select project and task
  And verify the time entry
  