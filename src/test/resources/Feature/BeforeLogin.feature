Feature: Before login page feature

  @DealItem
  Scenario: Add third deal product to cart
    Given user is on home page
    When user click on today-deals
    Then user is on today deals page
    When user click on third item
    And add minimum quantity and add product to cart
    Then minimum quantity should be one

  @Mobiles
  Scenario: Get last mobile details
    Given user is on home page
    When user search for mobiles
    Then list of mobiles should shown
    When user get last mobile
    Then Mobiles details will be shown

  @LeftNav
  Scenario: open left nav and go back to menu
    Given user is on home page
    When user click on left nav
    Then nav should be displayed
    When user click on mobiles
    Then back to main menu is displayed
    When user click on close button
    Then main menu should be closed
