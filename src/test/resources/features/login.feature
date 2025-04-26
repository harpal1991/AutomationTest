#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Parabank login functionality
  I want to use this template for my feature file

   Scenario: Valid login with correct credentials
    Given I launch the Parabank application
    When I login with username "admin" and password "admin"
    Then I should see the account overview page

  Scenario: Invalid login with incorrect credentials
    Given I launch the Parabank application
    When I login with username "wronguser" and password "wrongpass"
    Then I should see an error message indicating login failure