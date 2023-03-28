Feature: User should be able to create and send a massage.
  @AGL-SendMessage
  Scenario Template: As a user, I should be able to send messages by clicking on message tab on the Active Stream Page.
    Given User already logged into the system with valid  "<username>" and "<password>"
    When User clicks on the message button on the Active Stream Page
    And User writes any message into the writing panel on the message window
    And User clicks the send button in the message window
    Then Check whether the written texts are displayed on the Active Stream Page correctly
    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | helpdesk2@cybertekschool.com  | UserUser |
      | marketing2@cybertekschool.com | UserUser |
      | hr3@cybertekschool.com        | UserUser |
      | helpdesk3@cybertekschool.com  | UserUser |
      | marketing3@cybertekschool.com | UserUser |
      | helpdesk4@cybertekschool.com  | UserUser |
      | hr4@cybertekschool.com        | UserUser |
      | marketing4@cybertekschool.com | UserUser |

