Feature: working on web applications

  Scenario Outline: newtours page
    Given user is in newtours page
    When user click on register button
    Then user select <country> from dropdown
    And user close the window

    Examples: 
      | country |
      | india   |
