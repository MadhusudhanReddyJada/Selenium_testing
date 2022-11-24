Feature: working on web browsers
Scenario: orangehrm web site
Given open orangeHRM site
When login witn username and password by pom
Then caputreing data after login
And close current window