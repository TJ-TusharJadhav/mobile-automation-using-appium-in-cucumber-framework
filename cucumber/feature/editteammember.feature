Feature:  Edit team memeber
 Background:  
 Given open the application
  When I enter the email "salmankhan@mailinator.com"
  And I enter the password "salmankhan@mailinator.com"
  And I click the login button
 And click team member option
  And select the team member
  @tag1
Scenario: change the role 
 And click the role assignment option
 And click the more buttons
 And select the all roles
 And click the save button
 @tag2
 Scenario: change the workschedule 
 And click the Associated work schedule option
 And click the work schedule
 And select the work schedule
 And click the save button
 @tag3
 Scenario: change the bank details
 And click the bank details option
 And enter the acccount holder name "Khan Aamir"
 And enter the  Account number "12345678901112"
 And enter the IFSC code "abc123"
 And select the savings account option
 And click the save button
  @tag4
 Scenario: change the leaves(paid leave type)
 And click the leaves option
 And click the assign leave type
 And select the leave
 And enter the leave balance "12"
 And click the save button
 