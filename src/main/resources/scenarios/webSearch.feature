@Web_Testing
Feature: Google Search

  @Web_Testing
  Scenario: Search Quantum
    Given I am on Google Search Page
    When I search for "quantum perfecto"
    Then it should have "Introducing Quantum Framework" in search results
    Then I am on Google Search Page