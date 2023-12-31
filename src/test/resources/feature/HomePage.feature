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
@HomePageVerification
Feature: HomePageVerification
  I want to use this template for my feature file

  @HomePageVerification_1
  Scenario: Verify admin is able to land on home page
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should land on the home page

  @HomePageVerification_2
  Scenario Outline: Verify admin is able to land on home page with invalid URL
    Given Admin launch the browser
    When Admin gives the invalid LMS portal URL
    Then Admin should recieve 404 page not found error

  @HomePageVerification_3
  Scenario Outline: Verify for broken link
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then HTTP response >= 400. Then the link is broken

  @HomePageVerification_4
  Scenario Outline: Verify the text spelling in the page
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see correct spellings in all fields

  @HomePageVerification_5
  Scenario Outline: Verify the logo of the LMS
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see correct logo of the LMS

  @HomePageVerification_6
  Scenario Outline: Verify the logo properly aligned
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see logo is properly aligned

  @HomePageVerification_7
  Scenario Outline: Verify login button is present
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see login button

  @HomePageVerification_8
  Scenario Outline: Verify login button is clickable
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should able to click the Login button

    
   