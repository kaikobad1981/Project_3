Feature: User is able to login with valid username and password

Scenario Outline: User should be able to login and varify the account

Given User successfully open the browser
And User enter the valid email id "<username>"
And User enter the valid password "<password>"
When User click on login button
Then User varify the account successfully

Examples:
|username          |password  |
|kaikobad@gmail.com|1234568   |
|kaikobad@gmai.    |12345678  |
|kaikobad@gmail.com|123456789 |
|kaikobad@ga       |123456    |
|kaikoba           |1234      |