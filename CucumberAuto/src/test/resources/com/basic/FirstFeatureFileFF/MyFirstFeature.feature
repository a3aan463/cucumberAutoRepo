Feature: Create account of Facebook firstfeature
As a user you need to open facebook homepage and do the validations

Scenario: Validate First Name field41
Given User need to be on Facebook login page
When User enters user first name
Then User checks user first name is present

#Scenario: Validate create user multiple fields
#Given User need to be on Facebook login page
#When User enters user first name 
#And User enters user surname
#Then User checks user first name is present
#But User mobile field should be blank
