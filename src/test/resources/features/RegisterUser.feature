@TC01
Feature: Register Functionality

  //Background: For the scenarios in the Search Functionality, user is expected to be on on the homepage

  @Register @Smoke
  Scenario: Register User
    Given Open the Application URL in any supported browser
    Then  Verify that home page is visible successfully
    And   Click on my account button from the left hand side menu
    Then  Verify New Customer is visible
    And   Click on the create my profile button
    Then  Verify that Create my profile is visible
    And   Fill all the required fields
    And   Select checkbox Sign up for our newsletter!
    And   Click Create My Profile button