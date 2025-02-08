Feature: Flight search on Vueling

  Narrative:
  In order to find available flights
  As a user of the Vueling website
  I want to be able to search for flights based on my criteria

  Scenario: Search for a one-way flight from Madrid to Barcelona
    Given I am on the Vueling homepage
    When I search for a flight with the following details:
      | Origin  | Destination | Date      | Trip Type | Passengers |
      | Madrid  | Barcelona   | 01/06/2025 | One-way   | 1          |
    Then I see available flights in the search results