@wip
Feature: Verifyig the foundation year
  Scenario: The foundation year should see be same
    Given the user access HomePage
    When the user navigate to "zahlen-daten-fakten"
    Then the foundation years are same at "HomePage" and "zahlen-daten-fakten Page"
