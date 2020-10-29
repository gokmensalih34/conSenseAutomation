@wip
Feature: Verifying the foundation year
  Scenario: The user should see the foundation year same at Home page and other pages
    Given the user access HomePage
    When the user navigate to "zahlen-daten-fakten"
    Then the foundation years are same at "HomePage" and "zahlen-daten-fakten Page"
