



Feature: Google Search

  Scenario: Title of your Scenario
       Given Navigate to Google Search Application
       When i enter Search keyword
       Then Click on first search result
       And Close browser
  
  Scenario Outline: Google Test dat given
       #Given Navigate to Google Search Application
       When i enter Search keyword "<Keyword>"
       #Then Click on first search result
       #And Close browser
  
  Examples:
  |Keyword||Coloumn2|
  |Selenium||adas|
  |Jira|    |asad|
  