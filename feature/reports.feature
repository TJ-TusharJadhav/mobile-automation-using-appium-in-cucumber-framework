Feature: reports
  Background:  loginPage
  Given open the application
  When I enter the email "salmankhan@mailinator.com"
  And I enter the password "salmankhan@mailinator.com"
  And I click the login button
  And click the reports option in dashboard 
  And click the timesheet reports option in dashboard
  @tag1
  Scenario: verify the functionality of downloading the monthly report
  And select the project in report 
  And select the monthly redio button in duration field
  And select the month
  And select the project wish option in grouping field 
  And select the hhmm format in time format field 
  And click the download button in reports