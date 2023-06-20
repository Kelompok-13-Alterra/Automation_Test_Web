Feature: login

  Scenario: As user I have be able to success login
    Given I am on the login pages
    When I enter Email "admin1@gmail.com"
    And I enter Password "admin1"
    And I click Login button
    Then I am on the dashboard page