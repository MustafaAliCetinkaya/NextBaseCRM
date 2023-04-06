@AGL-400
Feature: Training functions.
  Agile Story: As a user, I should be able to land on Services menu;
  so that I can use Training functions.

  Background:
    Given User goes to url


  @AGL-397
  Scenario Outline: User can display his or her courses.

    When User enters valid "<username>" and "<password>"
    And User clicks to Login Button and goes to Home page
    And User goes to Services page
    And User clicks to Training tab
    And User clicks to My Courses tab
    Then User can display the courses

    Examples:
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | hr1@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |

  @AGL-398
  Scenario Outline: User can display his/her grades.

    When User enters valid "<username>" and "<password>"
    And User clicks to Login Button and goes to Home page
    And User goes to Services page
    And User clicks to Training tab
    When User clicks to Grade Book tab
    Then User can display the grades

    Examples:
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | hr1@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |

  @AGL-399
  Scenario Outline: User can edit his/her personal data under Student's Profile

    When User enters valid "<username>" and "<password>"
    And User clicks to Login Button and goes to Home page
    And User goes to Services page
    And User clicks to Training tab
    When User clicks to Profile tab
    Then User can edit personal data under Profile

    Examples:
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | hr1@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |