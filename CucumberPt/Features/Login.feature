Feature: Facebook login feature

Scenario: Verify the display of fb login page

Given User is on fb home page
When User authenticates on Login page
Then User should be able to login