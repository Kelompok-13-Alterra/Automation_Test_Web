Feature: logout

  @logout
  Scenario: logout from account
    Given I am on the login pages
    When I enter Email "admin3@gmail.com"
    And I enter Password "admin3"
    And I click Login button
    And I am on the dashboard page
    And I click logout button
    Then I click yes button of logout
#    And I am on the landing pages

  @logout
  Scenario: cancel logout from account
    Given I am on the login pages
    When I enter Email "admin3@gmail.com"
    And I enter Password "admin3"
    And I click Login button
    And I am on the dashboard page
    And I click logout button
    Then I click back button of logout
    Then I am on the dashboard page