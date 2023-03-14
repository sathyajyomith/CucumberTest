Feature: Login functionality
Background:
Given salesforce application
Scenario: Correct Login
When user on "Loginpage"
When user enters the username as "hi@tekarch.com"
When  user enters  password as "Tryhard2work"
When click in the login button
When user on "HomePage"
Then verify the page