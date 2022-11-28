Feature: This feature will perform functional testing of Shop Page

  Background:
    Then user verifies that shop page header is "Shop"

  @functional @tc002
  Scenario: Verify that login button is clickable
    And user click on login button of shop page
    Then user verifies that login page header is "Login"

  @functional @tc018
  Scenario: Check the visibility of view button for items
    Then user moves pointer to items one by one and verify that view button is visible
