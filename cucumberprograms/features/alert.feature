Feature: working on web applications

  Scenario Outline: dezlearn.com
    Given user is in dezlern page
    When user gets title and url
    Then user works on alert messages
    Then user gets screenshot
    And user closes window
