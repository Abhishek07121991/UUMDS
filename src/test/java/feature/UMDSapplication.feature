Feature: UMDS Login application

Background: user is logged in

    Given user is on login page
    When user clicks on the hyperlink
    Then user click on the Authentication
    Then user enters username and password
    And user clicks on login button
    And user is on home page

Scenario: Verify user cam create Profile successfully.

     When user enters Business Profile ID
     And user enters Business Profile Name
     And user enters Business Profile Description
     And user enters Aplication ID
     And user enters Actor ID
     And user enters FAS Role
     And clciks on Add button
     And clicks on submit button
     Then record is added
     
     Scenario: verify user can create an application successfully.

     When user clicks on Add applications
     And user enters Application ID
     And user enters Application name
     And user clicks on add button
     And user clicks on submit button
     Then application is added
     
Scenario: verify user can create an actor successfully.

     When user clicks on Add Actors
     And user enters Actor ID
     And user enters Actor name
     And user clicks on Add button
     And user clicks on Submit button
     Then actor is added
     Then user close the application

