Feature: Database User Space

  As an admin
  I want to access Database User Space feature
  So that I can see data user on the website

  @DatabaseUser
  Scenario: Edit data in see all data user aktif and nonaktif page with correct data and save
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on database user name
    And I click button see all in data user
    And I click change button
    And I enter username "halo"
    And I enter user email ""
    And I enter user password "hiya1234"
    When I click change account
    And I click yes for change account
    And I see notification successfully for change data account

  @DatabaseUser
  Scenario: Edit data in see all data user aktif and nonaktif page with correct data and back in page edit
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on database user name
    And I click button see all in data user
    And I click change button
    And I enter username1 "puluu"
    And I enter user email1 ""
    And I enter user password1 "hiya12"
    When I click change account
    And I click back for no change account
    And I am back in edit data account page

  @DatabaseUser
  Scenario: Edit data in see all data user aktif and nonaktif page without data
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on database user name
    And I click button see all in data user
    And I click change button
    And I enter username2 "Gogo bio"
    And I enter user email2 ""
    And I enter user password2 ""
    When I click change account
    And I see notification massage error

  @DatabaseUser
  Scenario: Delete data in see all data user aktif and nonaktif page and click back
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on database user name
    And I click button see all in data user
    And I click delete button in list user
    And I click back for no delete data user
    And I am back in database user page

  @DatabaseUser
  Scenario: Delete data in see all data user aktif and nonaktif page and yes for delete
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on database user name
    And I click button see all in data user
    And I click delete button in list user
    And i click yes for delete data user
    And I see notification successfully for delete data user

  @DatabaseUser
  Scenario: Detail data in see all buyer's assessment page
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on database user name
    And I click button see all in data buyer assessment
    And I click details
    And I can see assessment from buyer

  @DatabaseUser
  Scenario: Delete data in see all buyer's assessment page and click back
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on database user name
    And I click button see all in data buyer assessment
    And I click delete button in buyer assessment
    And I click back for no delete buyer assessment
    And I back in database user page

  @DatabaseUser
  Scenario: Delete data in see all buyer's assessment page and yes for delete
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on database user name
    And I click button see all in data buyer assessment
    And I click delete button in buyer assessment
    And I click yes for delete buyer assessment
    And I see notification successfully for delete data buyer assessment

  @DatabaseUser
  Scenario: Detail data in see all buyer's assessment page
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on database user name
    And I click button see all in order data
    And I can see customer order data