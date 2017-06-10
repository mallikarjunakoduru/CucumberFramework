@tag
Feature: Basic Login Logout Feature

  @Smoke
  Scenario: Sign im and sign out
    Given I open automationpractice website
    When I sign in
    Then I sign out