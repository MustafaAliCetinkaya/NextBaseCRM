Feature: CRM search feature
  User Story:
  As a user, I should be able to filter and search on Activity Stream; so that I can find what I want.
  1. User can search by "Author"
  2. User can search by "To"

  Accounts are: helpdesk, hr, marketing

  Background: For the scenarios in the feature file, user is expected to be on Activity Stream page

  @AGL-413
  Scenario Outline: User can search by Author
    Given User enters "<username>" and password and logins
    When user clicks Filter and search bar
    And user enters "Wooden Spoon" into Author text bar and clicks the name in the menu
    And user clicks the Search button
    Then user sees Author: "Wooden Spoon" in Filter and search bar
    Examples: Credentials
      | username                      |
      | helpdesk1@cybertekschool.com  |
      | marketing1@cybertekschool.com |
      | hr1@cybertekschool.com        |

  @AGL-414
  Scenario Outline: User can search by To
    Given User enters "<username>" and password and logins
    When user clicks Filter and search bar
    And user enters "Wooden Spoon" into To text bar and clicks the name in the menu
    And user clicks the Search button
    Then user sees To: "Wooden Spoon" in Filter and search bar
    Examples: Credentials
      | username                      |
      | helpdesk1@cybertekschool.com  |
      | marketing1@cybertekschool.com |
      | hr1@cybertekschool.com        |