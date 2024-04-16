Feature: localization
Background: 
  Given open the application
  When click the english language 
  
  Scenario: check the english to marathi localization 
     And select the marathi language
     Then login page should be appear in marathi language 
     
  Scenario: check the english to hindi localization 
     And select the hindi language
     Then login page should be appear in hindi language 

  Scenario: check the english to gujarati localization 
     And select the gujarati language
     Then login page should be appear in gujarati language      
     
     