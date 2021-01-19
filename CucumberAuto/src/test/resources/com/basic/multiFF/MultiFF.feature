Feature: Create account of Facebook multi
As a user you need to open facebook homepage and do the validations

Scenario: Validate First Name field81
Given User need to be on Facebook login page 1
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

Scenario: Validate create user multiple fields82
Given User need to be on Facebook login page 1
When User enters user "Ryan" first name 
And User enters user "Jack" surname 1
Then User checks user "Ryan" first name is present
Then User mobile field should be blank 1
Then close browser
