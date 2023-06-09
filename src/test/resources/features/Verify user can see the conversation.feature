Feature:As a user, I should be able to find people, documents and more
  by using top-page search bar; so that I can access the searched data

  @wip
  Scenario Outline:Conversation page verification(User can see the conversations)
    Given "<user>" navigates website and enters valid credentials,should see homepage
    When  User on the homepage should write "<searchValue>"  to the search box
    And   User clicks to search button
    And   User should see the conversations keyword
    And   User clicks on the Conversation keyword
    Then  User should see Conversations on the opened page

    Examples:
      | user                           | searchValue   |
      | hr1@cybertekschool.com         | Conversations |
      | marketing35@cybertekschool.com | Conversations |
      | helpdesk35@cybertekschool.com  | Conversations |
