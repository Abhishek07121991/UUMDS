Feature: Free CRM Login feature

Scenario: Free CRM login Tets scenario

Given user is alreday on login page
When title of login page is Free CRM
Then user clicks on login button
Then user enters username and password
And user clicks on login button second time
And user is on home page

Scenario: User is able to create a new contact
Given user is already on contact link
When user mouse over on contact link
Then user clicks on new contact link
Then user enters firstname and lastname
Then user clicks on save button
Then verify new contact created
