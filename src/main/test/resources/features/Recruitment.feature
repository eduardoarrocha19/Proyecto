Feature: Recruitment

  Scenario: Add a new candidate
    Given the user is logged in
    When the user navigates to the Recruitment page
    And the user adds a new candidate
    Then the candidate should be added successfully