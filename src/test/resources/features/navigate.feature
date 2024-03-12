Feature: Main Page

  @navigate
  Scenario: Verify Main Page title is displayed
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    Then User verifies Main page title is displayed
    And User quits browser