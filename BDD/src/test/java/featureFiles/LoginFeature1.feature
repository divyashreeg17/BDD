Feature: Testing the login feature of application
Background: Launch Browser and load application
Given the browser is Launched
And the application is loaded

Scenario Outline: Testing the login feture with valid admin credentials
When the user enters the credentials as "<userName>" and "<password>"
And the user clickd the Login Button
Then dashboard should be displayed

Examples:
|userName|password|
|admin|manager|
|trainee|trainee|