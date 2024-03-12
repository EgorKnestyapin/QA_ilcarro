Feature: Add new car feature

  @addingCar
  Scenario: Check User can add new car
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Let the car work link
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message displayed
    And User clicks on Ok button
    And User enters location
    And User enters car details
    And User enters about info
    And User uploads photo
    And User clicks on Submit button
    Then User verifies Car added message displayed
    And User quits browser