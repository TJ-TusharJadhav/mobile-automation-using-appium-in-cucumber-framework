 Feature:  team memeber
 Background:
Scenario: verify add team member functionality
 Given open the application
 When I enter the email "salmankhan@mailinator.com"
 And I enter the password "salmankhan@mailinator.com"
 And I click the login button
 And click team member option
 And click add team member button
 And Enter first name "Tushar"
 And Enter last name "Jadhav"
 And Enter email
 And Enter phone "1234567890"
 And Enter address "Panchavati"
 And select country "India"
 And select state "Maharashtra"
 And select city "Nashik"
 And Enter pincode "422003"
 And select timezone
 And select joining date
 And enter job title "QA"
 And select report
 And select termination date
 And click save button
 Then check the success message
 
 And click the more buttons
 And select the all roles
 And click the save button 

 And click the work schedule
 And select the work schedule
 And click the save button

 And Enter the Account holder name "Tushar"
 And Enter the Account number "123456789012"
 And IFSC code "SBIN0011513"
 And click save button
  
 And select start date
 And enter basic pay "100"
 And click save button
  
 And click next button
 
 And click save button
 
 And select Opted out option
 And click save button
  
 And select the checkbox
 And enter ESI no "12345678901234567"
 And click save button 
   
 And enter previous employer salary "123"
 And enter previous employer TDS deducted "123"
 And click save button 
  
 And click the back button
 