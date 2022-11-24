Feature: working on web applications

  Scenario: Amazon page
    Given user is in Amazon page
    When user clicks all links and navigate back
    Then user get url and title of page and store in exel sheet
    And get screenshot
    And closing the browser
