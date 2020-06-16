Feature: Testing the login feature of application
Background: 
Given the browser is Launched
And the application is loaded

Scenario: Testing the login feture with valid data
When the user enters the valid username
And the user enters the valid password
And the user clickd the Login Button
Then dashboard should be displayed

Scenario: Testing Forgot password link
When User clicks on forgot password link
Then Forgot your password component should be displayed
