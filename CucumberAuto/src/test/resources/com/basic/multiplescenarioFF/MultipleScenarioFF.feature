Feature: Create account of Facebook multiplescenario
As a user you need to open facebook homepage and do the validations

Scenario: Validate First Name field91
Given User need to be on Facebook login page
When User enters user first name
Then User checks user first name is present
Then close browser

Scenario: Validate create user multiple fields92
Given User need to be on Facebook login page
When User enters user first name 
And User enters user surname
Then User checks user first name is present
Then User mobile field should be blank
Then close browser
