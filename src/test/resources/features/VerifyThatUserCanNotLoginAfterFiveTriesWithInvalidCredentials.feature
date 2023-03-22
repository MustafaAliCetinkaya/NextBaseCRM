Feature: Login functionality

  @AGL-3
  Scenario: As a user, I should not be able to try to login after 5 tries with invalid credentials. An Error message saying "Please try again after one minute" should be displayed.
    Given User opens the Application URL in any supported browser in order to login the system
    When User tries to login with invalid credentials
    Then User clicks the login button in the authorization window.
    And  User should not be able to log in and  an error message saying "Please try again after one minute" should be displayed.


