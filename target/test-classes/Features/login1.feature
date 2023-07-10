Feature: login check

  @user
  Scenario Outline: check login is successful with valid credentials

    Given user is  on login pages
    When user enters "<username>" and "<password>"
    And clicks on login button
    Then user is navigated to home page

    Examples:
      |username|password|
      |user1   |user123 |
      |user2   |user123 |


  @admin
  Scenario Outline: check login is successful with valid credentials

    Given user is  on login pages
    When user enters "<username>" and "<password>"
    And clicks on login button
    Then user is navigated to home page

    Examples:
      |username|password|
      |admin1   |admin123 |
      |admin2   |admin123 |