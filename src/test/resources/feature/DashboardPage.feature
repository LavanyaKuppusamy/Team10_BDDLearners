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
@DashboardPage
Feature: Dashboard_page
  I want to use this template for my feature file
  
  
  Background: Admin clicks Login butter after giving correct URL
  Given: Navigate to Login page 
  

  @tag1
    Scenario: Verify after login  admin lands on manage program as dashboard page
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should see manage program as header 
    

  @tag2
  Scenario Outline: Verify the response time
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button 
    Then  Maximum navigation time in milliseconds, defaults to 30 seconds
   
   
   @tag3
  Scenario Outline: Verify broken link
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button 
    Then HTTP response >= 400. Then the link is broken
    
    @tag4
  Scenario Outline: Verify LMS title 
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should see LMS -Learning management system  as title 
    
    @tag5
  Scenario Outline: Verify  LMS title alignment
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button 
    Then LMS title should be on the top left corner of page
    
    @tag6
  Scenario Outline: Validate navigation bar text
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should see correct spelling in navigation bar text
    
    @tag7
  Scenario Outline: Validate LMS title has correct spelling ang space
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should see correct spelling and space in LMS title
    
     @tag8
  Scenario Outline: Validate alignment for navigation bar
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should see the navigation bar text on the top right side
    
       
     @tag9
  Scenario Outline: Validate the navigation bar order
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should see student, program, batch, Class, User, Assignment, Attendence and Logout
    
    @tag10
  Scenario Outline: Verify the logout button
    Given Admin is in dashboard page
    When Admin click Logout button on navigation bar
    Then Admin should land on login in page
    
    
   