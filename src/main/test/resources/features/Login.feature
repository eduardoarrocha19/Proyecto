Feature: Login

  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user logs in with valid credentials
    Then the user should see the home page