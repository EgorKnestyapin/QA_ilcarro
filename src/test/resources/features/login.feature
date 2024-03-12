Feature: Login

  @validData
  Scenario: Check User can login with valid data
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message displayed
    And User quits browser

  @invalidPassword
  Scenario Outline: Check User can't login with invalid password
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error message displayed
    And User quits browser
    Examples:
      | email        | password   |
      | john1@gm.com | Qwerty1234 |
      | john1@gm.com | qwerty123$ |
      | john1@gm.com | QWERTY123$ |
      | john1@gm.com | Qwertyyyy$ |
      | john1@gm.com | 123456789$ |
      | john1@gm.com | $$$$$$$$$$ |