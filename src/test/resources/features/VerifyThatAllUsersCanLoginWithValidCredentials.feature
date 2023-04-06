Feature: Login functionality ( As a user, I should be able to log in to the system with valid credentials and land on the "Activity Stream" page after successful login. )

  @AGL-347
  Scenario Outline: All users can log in with valid credentials (We have 3 types of users such as Helpdesk, Human Resource, and Marketing). All users should land on the "Activity Stream" page after successful login.
    Given User opens the Application URL in any supported browser in order to login the system
    When User writes the  "<username>" into the username box in the authorization window.
    And User writes the  "<password>" into the password box in the authorization window.
    And User clicks the login button in the authorization window.
    Then User should be able to see "<his/her own username details>" on the dropdown which is at the right top corner of the Activity Stream page.
    Examples:
      | username                      | password | his/her own username details |
      | hr1@cybertekschool.com        | UserUser | hr1                          |
      | hr2@cybertekschool.com        | UserUser | hr2                          |
      | hr3@cybertekschool.com        | UserUser | hr3                          |
      | helpdesk1@cybertekschool.com  | UserUser | helpdesk1                    |
      | helpdesk2@cybertekschool.com  | UserUser | helpdesk2                    |
      | helpdesk3@cybertekschool.com  | UserUser | helpdesk3                    |
      | marketing1@cybertekschool.com | UserUser | marketing1                   |
      | marketing2@cybertekschool.com | UserUser | marketing2                   |
      | marketing3@cybertekschool.com | UserUser | marketing3                   |



