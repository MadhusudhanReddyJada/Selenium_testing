Feature: working on web applications

  Scenario Outline: newtours.com
    Given user opens newtours page
    When user login with uname password by property list
    Then user  capturs screenshot
    And user closes current window

   