Feature: My Timesheet
  Background:  login 

 @tag1 
Scenario: check the monthly filter is clickable
Given open the application
When I enter the email "salmankhan@mailinator.com"
And I enter the password "salmankhan@mailinator.com"
And I click the login button
When click the my timesheet option in dashboard
And click the monthly filter
And select the month in mytimesheet
And click the ok button 
And selected month should be select 

@tag2 
Scenario: check the weekly filter is clickable
And click the weekly filter
And select the week
And click the ok button 
And selected week should be select 
 
 @tag3 
Scenario: check the daily filter is clickable
And click the daily filter
And select the date in my timesheet
And click the ok button 
And selected date should be select 

#@tag4 
#Scenario: check the project wish is clickable
#And click the project wish
#And verify the project wish
#
 #@tag4 
#Scenario: check the date wish is clickable
#And click the date wish
#And verify the date wish