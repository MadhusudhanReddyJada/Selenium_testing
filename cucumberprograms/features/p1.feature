Feature: working on web applications

  Scenario: new tours page
    Given user is in new tours page
    When user gets uname and password from property list
    Then user uses pom for uname and password
    Then user need to click on register link button
    And get screenshot
    And gat country names into excel sheet
    And user is navigate to home page and close
