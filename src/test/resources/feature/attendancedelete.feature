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
@user
Feature: Attendence Delete User
  
 Background:
   Given user Logged on the LMS portal 
   And Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   
 @user_23
  Scenario: Validate row level delete icon
   Given The delete icon on row level in data table is enabled
   When Admin clicks the delete icon 
   Then Alert appears with yes and No option
                                                                                                                                                                                                            

	@user_24
  Scenario: Validate accept alert
   Given Admin clicks the delete icon
   When Admin click yes option 
   Then User deleted alert pops and user is no more available in data table
   
   
   
  @user_25
  Scenario: Validate reject alert
   Given Admin clicks the delete icon
   When Admin click No option 
   Then User is still listed in data table
   
  @user_26
  Scenario: Validate the delete icon below the header 
   Given None of the checkboxes in data table are selected
   Then The delete icon under the "Manage User" header should be disabled
   
   @user_27
 	 Scenario: Check for single row delete
    Given One of the checkbox row is selected
    When Click delete icon below "Manage User" header
    Then The respective row in the data table is deleted

  @user_27
 	 Scenario: Check for multi row delete
    Given Two or more checkboxes or row is selected
    When Click delete icon below "Manage User" header
    Then The respective row in the data table is deleted