#Author: Hima

@user
Feature: userpage validation
  
  Background:
   Given user Logged on the LMS portal 
    
  @user_01
  Scenario: validate landing in userpage
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   Then Admin should see the "Manage User" in the URL
 
  @user_02
  Scenario: Validate header in the User Page
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   Then Admin should see the "Manage User" in the header
    
  @user_03
  Scenario: Validate pagenation in the User Page
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar	
   Then Admin should see the pagination controls under the data table
 
  @user_04
  Scenario: Validate data table headers in the User Page
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   Then Admin Should see the data table with headers Id, Name, location, Phone Number, Edit/Delete
    
  @user_05
  Scenario: Validate delete button in User Page
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   Then Admin should be able to see the "Delete" icon button that is disabled
    
  @user_06
  Scenario: Validate "+ A New user" button in User Page
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   Then Admin should be able to see the "+ A New User" button
   
  @user_07
  Scenario: Validate "+ A Assign staff" button in User Page
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar 
   Then Admin should be able to see "+ Assign staff" button  
    
  @user_08
  Scenario: Validate search box in User Page
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   Then Admin should be able to see the search text box
    
  @user_09
  Scenario: Validate data rows
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   Then Each row in the data table should have a checkbox 
   
  @user_10
  Scenario: Validate data rows
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   Then Each row in the data table should have a edit icon that is enabled
  
  @user_11
  Scenario: Validate data rows
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   Then Each row in the data table should have a delete icon that is enabled
    
  @user_12
  Scenario: Validate pop up for adding user
   Given Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   And Admin clicks "+ A New User" button
   Then A new pop up with User details appears
   
    
    