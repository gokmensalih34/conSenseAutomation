@wip
Feature: Verifying Tabs
  Scenario: Verifying Tabs at HomePage
    Given the user access HomePage
    Then the page title is "ConSense GmbH – Die Software für Prozess- und Qualitätsmanagement: ConSense"
    And the user see the following at "HomePage"
      | Home             |
      | ConSense         |
      | Lösungen         |
      | Dienstleistungen |
      | Branchen         |
      | Normen           |
      | Referenzen       |
      | Karriere         |
      | Aktuelles        |
      | Kontakt          |
