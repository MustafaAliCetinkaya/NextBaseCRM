Feature: Login functionality ( As a user, I should not be able to log in to the system with invalid credentials. )

  @AGL-352
  Scenario Outline: Any user can not log in with invalid credentials (We have 3 types of users such as Helpdesk, Human Resource, and Marketing).
    Given User opens the Application URL in any supported browser in order to login the system
    When User writes the  "<username>" into the username box in the authorization window.
    And User writes the  "<password>" into the password box in the authorization window.
    And User clicks the login button in the authorization window.
    Then  User should not be able to log in and a warning message should be displayed on the top left corner of the login box.
    Examples://T-F, F-T, F-F, T-E, E-T, E-E
      | username                       | password   |
      | hr1@cybertekschool.com         | UserUser1  |
      | hr01@cybertekschool.com        | UserUser   |
      | hr01@cybertekschool.com        | UserUser01 |
      | hr1@cybertekschool.com         |            |
      |                                | UserUser   |
      |                                |            |
      | hr2@cybertekschool.com         | UserUser2  |
      | hr02@cybertekschool.com        | UserUser   |
      | hr02@cybertekschool.com        | UserUser02 |
      | hr2@cybertekschool.com         |            |
      |                                | UserUser   |
      |                                |            |
      | hr3@cybertekschool.com         | UserUser3  |
      | hr03@cybertekschool.com        | UserUser   |
      | hr03@cybertekschool.com        | UserUser03 |
      | hr3@cybertekschool.com         |            |
      |                                | UserUser   |
      |                                |            |
      | helpdesk1@cybertekschool.com   | UserUser1  |
      | helpdesk01@cybertekschool.com  | UserUser   |
      | helpdesk01@cybertekschool.com  | UserUser01 |
      | helpdesk1@cybertekschool.com   |            |
      |                                | UserUser   |
      |                                |            |
      | helpdesk2@cybertekschool.com   | UserUser2  |
      | helpdesk02@cybertekschool.com  | UserUser   |
      | helpdesk02@cybertekschool.com  | UserUser02 |
      | helpdesk2@cybertekschool.com   |            |
      |                                | UserUser   |
      |                                |            |
      | helpdesk3@cybertekschool.com   | UserUser3  |
      | helpdesk03@cybertekschool.com  | UserUser   |
      | helpdesk03@cybertekschool.com  | UserUser03 |
      | helpdesk3@cybertekschool.com   |            |
      |                                | UserUser   |
      |                                |            |
      | marketing1@cybertekschool.com  | UserUser1  |
      | marketing01@cybertekschool.com | UserUser   |
      | marketing01@cybertekschool.com | UserUser01 |
      | marketing1@cybertekschool.com  |            |
      |                                | UserUser   |
      |                                |            |
      | marketing2@cybertekschool.com  | UserUser2  |
      | marketing02@cybertekschool.com | UserUser   |
      | marketing02@cybertekschool.com | UserUser02 |
      | marketing2@cybertekschool.com  |            |
      |                                | UserUser   |
      |                                |            |
      | marketing3@cybertekschool.com  | UserUser3  |
      | marketing03@cybertekschool.com | UserUser   |
      | marketing03@cybertekschool.com | UserUser03 |
      | marketing3@cybertekschool.com  |            |
      |                                | UserUser   |
      |                                |            |



