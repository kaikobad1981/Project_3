Feature: User is able to login with valid username and password
@smoke
Scenario: User should be able to login and varify the account

Given User successfully open the browser
And User enter the valid email id "kaikobad@gmail.com"
And User enter the valid password "12345678"
When User click on login button
Then User varify the account successfully
