Feature: After login page feature

  Background: user login amazon account
    Given user is on login page
    When user enter "shaikarifa.asha@gmail.com" and click on continue button
    And user enter "Arifa@786" and click on submit button
    Then user enters Home page

  @Prime
  Scenario: Get delivery date of displayed item by enable prime
    Given user is on home page after login
    When user enable prime checkbox
    Then get the first displayed item
    And display delivery date of item

  @Reorder
  Scenario: user reorders the previous years product
    Given user is on orders page
    When user select previous orders
    And Reorder the first product
    Then user navigate to checkout page
    When user added new address
    Then added address should be visible
    When user added payment method
    Then added payment method should be visible

