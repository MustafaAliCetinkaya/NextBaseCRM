Feature: Login functionality ( As a user, I should be able to log in to the system with valid credentials)

  @AGL-347
  Scenario Outline: All users can log in with valid credentials (We have 3 types of users such as Helpdesk, Human Resource, and Marketing). All users should land on the "Activity Stream" page after successful login.
    Given User opens the application in any supported browser in order to login the system
    When User writes the  "<username>" into the username box in the authorization window.
    And User writes the  "<password>" into the password box in the authorization window.
    And User clicks the login button in the authorization window.
    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
