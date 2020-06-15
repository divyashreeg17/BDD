Feature: Testing the login feature of application

Scenario: Testing the login feture with valid data

Given the browser is Launched
And the application is loaded
When the user enters the valid username
And the user enters the valid password
And the user clickd the Login Button
Then dashboard should be displayed