#Author: Hima

@user_Add
Feature: Add new user
  
  Background:
   Given user Logged on the LMS portal 
   And Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   And Admin clicks "+ A New User" button
    
  
  
  @user_13
  Scenario Outline: Check if the fields exist in pop up
    Given new pop up with user details appears
    When Admin clicks "User" from navigation bar
    Then The pop up should include the fields from "<SheetName>" and "<Testcase>"
    
    Examples: 
      | SheetName | Testcase    |
      | user      | skipping optional    |
    
  @user_14
  Scenario Outline: Check if Middle name, linkedIn url, email, user comments.under graduate,post graduate,time zone are optional  
   Given The new pop up with user details appears
   When Fill in all the fields except optional fields with valid values from "<SheetName>" and "<Testcase>"
   And click submit
   Then The newly added user should be present in the data table in Manage User page 
                                                                                                                                                                                                            
   Examples: 
      | SheetName | Testcase    |
      | user      | skipping optional    |
      
  @user_15
  Scenario Outline: Check if the program details are added in data table
   Given The new pop up with user details appears
   When Fill in all the fields with valid values from "<SheetName>" and "<Testcase>"
   And click submit
   Then The newly added user should be present in the data table in Manage User page 
                                                                                                                                                                                                            
   Examples: 
      | SheetName | Testcase    |
      | user      | Filling all Fields |
  
  @user_16
  Scenario Outline: Check for error messages for invalid fields
   Given The new pop up with user details appears
   When any of the fields have invalid values from "<SheetName>" and "<Testcase>"
   Then Error message should appear
                                                                                                                                                                                                            
   Examples: 
      | SheetName | Testcase    |
      | user      | Invalid Entries |
 
 @user_17
  Scenario Outline: Check for error messages for mandatory fields
   Given The new pop up with user details appears
   When Any of the mandatory fields are blank from "<SheetName>" and "<Testcase>"
   Then Error message should appear
                                                                                                                                                                                                            
   Examples: 
      | SheetName | Testcase    |
      | user      | missing mandatory |
      
  