Feature: Create account of Facebook parameterization
As a user you need to open facebook homepage and do the validations

Scenario: Validate First Name field101
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

Scenario: Validate create user multiple fields102
Given User need to be on Facebook login page
When User enters user "Ryan" first name 
And User enters user "Jack" surname
Then User checks user "Ryan" first name is present
Then User mobile field should be blank
Then close browser
