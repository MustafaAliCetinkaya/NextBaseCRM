Feature: Login functionality
  @AGL-393
  Scenario: As a user, I should not be able see the password in bullet signs by default. User can see the "Remember Me" link exists and is clickable on the login page. "Forgot Password" link exists and is clickable on the login page.
    Given User opens the Application URL in any supported browser in order to login the system
    Then Check whether the page title is written correctly
    And Check whether the login box header is written correctly
    And  Check whether the remember me text is written correctly
    And  Check whether the "FORGOT YOUR PASSWORD?" text is written correctly
    And  Check if the link which is label as forgot password link is working properly
    And  Check whether the text on the login button is written correctly
    Then  Check whether the placeholder texts in the password and username boxes are written correctly


