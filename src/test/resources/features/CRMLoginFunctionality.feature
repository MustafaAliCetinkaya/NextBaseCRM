@login
Feature: CRM login feature
  User Story:
  All users can log in with valid credentials (We have 3 types of users such as Helpdesk, Human Resource, and Marketing).
  All users should land on the "Activity Stream" page after successful login.

  Accounts are: helpdesk, hr, marketing

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the CRM login page

  @valid
  Scenario Template: Login with valid credentials
    When user enters username "<username>"
    And user enters password "<password>"
    Then user should see the Activity Stream page
    Examples: valid login credentials for all 3 users
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | helpdesk2@cybertekschool.com  | UserUser |
      | helpdesk3@cybertekschool.com  | UserUser |
      | hr1@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | hr3@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | marketing2@cybertekschool.com | UserUser |
      | marketing3@cybertekschool.com | UserUser |

  @invalid
  Scenario Template: Login with invalid credentials
    When user enters username "<username>"
    And user enters password "<password>"
    Then user should not see the Activity Stream page
    Examples: invalid login credentials for all 3 users
      | username                      | password |
      | helpdesk1@cybertekschool.com  | User     |
      | hr1@cybertekschool.com        | User     |
      | marketing1@cybertekschool.com | User     |
      | abcdef123@cybertekschool.com  | User     |
      | abcdef123@cybertekschool.com  | UserUser |
      | helpdesk1@cybertekschool.com  |          |
      | hr1@cybertekschool.com        |          |
      | marketing1@cybertekschool.com |          |
      |                               | UserUser |
      |                               |          |

  @invalid_5_times
  Scenario: Login with invalid credentials for 5 times
    When user enters username
    And user enters password
    Then user should see the error message "Please try again after one minute"


