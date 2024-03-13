Feature: workschedule
  Background:  login 
  Given open the application
  When I enter the email "salmankhan@mailinator.com"
  And I enter the password "salmankhan@mailinator.com"
  And I click the login button
  When click the workschedules option in dashboard 
  And click the add workschedule button
 @tag1 
Scenario: verify the add workschedule functionality
And enter the name "Night Shift 1" 
And select the date 
And select the expected hours 
And select the week off days
And click the add button 
And enter the holiday name "15 Feb"
And select date 
And click the save button on holidays pop-up window
And click the save button 
Then Check if a new work schedule has been added
 @tag2
Scenario: Verify empty field error in workschedule
And click the save button 
Then check the empty filed meassge in name field
And  check the empty filed meassge in Start date field
