Feature: Cucumber Realty Assignment

  Scenario Outline: To verify whether application allows the user to get registered upon entering valid credentials
    Given Navigate to Realty realestate URL
    When I  click on login/Register button
    Then Login Screen is displayed
    And Click on Register Tab
    Then Registration Screen is displayed
    When Enter valid credentials "<email>" ,"<firstname>","<lastname>"
    Then Credentials are entered
    And Click on Register button
    Then Registration successful
    
 
    
 Examples:
  |email|            |firstname|     |lastname|
  |nikxy@gmail.com|  |niks|          |shar|
  |dalepq@gmail.com| |dale|          |SA|
  
  
  Scenario Outline: Login to Realty Application
  
  Given Navigate to Realty realestate URL
    When I  click on login/Register button
    Then Login Screen is displayed
    And Enter login Credentials "<email>","<password>"
    And Click on Sign in 
    Then Profile is displayed
    
    Examples:
  |email|            |password|     
  |nikxy@gmail.com|  |pwd1|         
  |dalepq@gmail.com| |pwd2| 
  
  Scenario Outline: Forgot password
  
  Given Navigate to Realty realestate URL
    When I  click on login/Register button
    Then Click on Lost Your Password
    And Enter email "<email>"
    Then Click on Reset Password
    And Enter Password "<password>"
    And Enter password in repeat password box "<password>"
    Then click on Reset
    
      Examples:
  |email|            |password|     
  |nikxy@gmail.com|  |pwd1|         
  |dalepq@gmail.com| |pwd2| 
    
  
           
  
  
  
  
    
    
    
    
    
   
