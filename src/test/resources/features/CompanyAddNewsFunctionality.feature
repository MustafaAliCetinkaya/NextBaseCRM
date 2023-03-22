@TCAddingAndRemovingImages
Feature: Adding and removing images functionality ( As a user, I should be able to add news under Company.)

  //Background: For the scenarios in the adding and removing images functionality, , user is expected to be logged into on the system.

  @AddingByUsingImagePath
  Scenario Outline: User should be able to add and remove a picture under details tab
    Given Open the Application URL in any supported browser in order to login the system
    When User writes the  "<username>" into the username box in the authorization window.
    When User writes the  "<password>" into the password box in the authorization window.
    Then User clicks the login button in the authorization window.
    And  User should be able to logged into the system.
    And  User clicks on the Company link from the dashboard main menu on the left.
    And  User clicks on the Add News button from the company page.
    And  User clicks on the Details tab from the new open window which is near the preview text tab.
    And  User clicks on the upload image icon which is between dropdown menu and upload document icon, when the details tab opens.
    And  User clicks on the dropdown menu icon which is at the top right corner of the dashed rectangular box.
    And  User clicks on the insert file path option from the opened dropdown menu.
    And  User pastes pathname of the selected image into the automatically opened input box which is label as "Link:".
    And  User clicks on the add button.
    Then User should be able to see the loading bar after the add button is clicked.
    Then User should be able to see the uploaded image in the rectangular box.
    And  User clicks on the X icon which is located on the lower right corner of the uploaded image in order to remove the image, after image is loaded and seen in the rectangular box.
    Then User should be able to see Drag&Drop an image text when the image is removed from the box.
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
