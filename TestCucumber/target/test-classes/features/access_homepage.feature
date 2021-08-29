Feature: Search for a trip
  As a user
  I want to access the homepage
  So that I can perform a search for a trip

  Scenario: Return trip for 2 adults and 1 child
    Given user navigates to the homepage
    When the user provides a Departure location
    And the user provides a Destination location
    And the user provides a Depart date
    And the user provides a Return date
    And the user provides the amount of adults
    And the user provides the amount of children
    And the user clicks on Search
    Then the flight options are loaded
