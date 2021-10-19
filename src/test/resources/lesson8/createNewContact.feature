
Feature: create new contact
  Background:
    Given I am authorized


  Scenario:
      Given I am at new contact page
      When I fill first name
      And I fill last name
      And I select arrow
      And I put organisation
      And I fill job title
      And I click save button
      Then I can see success message


