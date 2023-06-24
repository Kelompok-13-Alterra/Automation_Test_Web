Feature: Co-Working Space

  As an admin
  I want to access Co-Working Space feature
  So that I can use the feature of the website

  @CreateCoWoringSpace
  Scenario: Create Co-Working Space with the correct data
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on co working space name
    And I click button create co working space
    And I enter correct name "Gogo"
    And I enter correct address "Jalan Raya No.2"
    And I enter correct office description "Free WiFi"
    And I enter correct price "199000"
    And I enter correct capacity "50"
    And I enter correct open time "08:00:00"
    And I enter correct closing time "11:30:00"
    And I click correct speaker button
    And I click correct projector button
    And I click correct whiteboard button
    Then I click create co working space button
    And I see massage successfully for create co working space

  @CreateCoWoringSpace
  Scenario: Create Co-Working Space without data
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on co working space name
    And I click button create co working space
    And I enter incorrect name1 ""
    And I enter incorrect address1 "Jalan Melon No.3"
    And I enter incorrect office description1 ""
    And I enter incorrect price1 ""
    And I enter incorrect capacity1 "70"
    And I enter incorrect open time1 "09:00:00"
    And I enter incorrect closing time1 "10:30:00"
    Then I click create co working space button
    And I see massage error

  @EditCoWorKingSpace
  Scenario: Edit Co-Working Space with the correct data and click yes
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on co working space name
    And I click edit button
    And I enter name ""
    And I enter price ""
    And I enter open time ""
    Then I click change Co-Working Space
    And I click yes for change data
    And I see notification successfully for change

  @EditCoWorKingSpace
  Scenario: Edit Co-Working Space without data
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on co working space name
    And I click edit button
    And I enter address "Jl Raya Barat Daya No.2"
    And I enter office description "Free WiFi and comfortable place"
    And I enter capacity "70"
    Then I click change Co-Working Space
    And I see massage error for change data

  @EditCoWorKingSpace
  Scenario: Edit Co-Working Space with the correct data and click back
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on co working space name
    And I click edit button
    And I enter name1 ""
    And I enter price1 ""
    And I enter open time1 ""
    Then I click change Co-Working Space
    And I click back for no change data
    And I back on the edit co working page

  @DeleteCoWorkingSpace
  Scenario: Delete Co-Working Space with no answer
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    When I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on co working space name
    And I click button delete
    And I click back for no delete
    And I on the co working space information page

  @DeleteCoWorkingSpace
  Scenario: Delete Co-Working Space with the answer yes
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    When I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on co working space name
    And I click button delete
    And I click yes for delete
    Then I can see notification successfully delete