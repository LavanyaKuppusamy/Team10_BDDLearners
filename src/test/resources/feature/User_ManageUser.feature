#Author: Hima

@user
Feature: User_ManagePage
  
  Background:
   Given user Logged on the LMS portal
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
  
  @user_01
  Scenario: validate landing in userpage
   Then Admin should see the "Manage User" in the URL
 
  @user_02
  Scenario: Validate header in the User Page
   Then Admin should see the "Manage User" in the header
    
  @user_03
  Scenario: Validate pagenation in the User Page
   	Then Admin should see the pagination controls under the data table
 
  @user_04
  Scenario: Validate data table headers in the User Page
  	Then Admin Should see the data table with headers Id, Name, location, Phone Number, Edit/Delete
    
  @user_05
  Scenario: Validate delete button in User Page
   	Then Admin should be able to see the "Delete" icon button that is disabled
    
  @user_06
  Scenario: Validate "+ A New user" button in User Page
    Then Admin should be able to see the "+ A New User" button
   
  @user_07
  Scenario: Validate "+ A Assign staff" button in User Page
    Then Admin should be able to see "+ Assign staff" button  
    
  @user_08
  Scenario: Validate search box in User Page
    Then Admin should be able to see the search text box
    
  @user_09
  Scenario: Validate data rows
    Then Each row in the data table should have a checkbox 
   
  @user_10
  Scenario: Validate data rows
    Then Each row in the data table should have a edit icon that is enabled
  
  @user_11
  Scenario: Validate data rows
    Then Each row in the data table should have a delete icon that is enabled
    