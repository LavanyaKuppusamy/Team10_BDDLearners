#Author: Hima

@user_Add
Feature:UserModule_EditUser
  
  Background:
   Given user Logged on the LMS portal 
   And Admin is on dashboard page after Login
   When Admin clicks "User" from navigation bar
   
   
 @user_18
  Scenario: Validate row level edit icon
   Given The edit icon on row level in data table is enabled
   When Admin clicks the edit icon
   Then A new pop up with User details appears    
   
     
  @user_19
  Scenario Outline: Check if the fields are updated
   Given Admin clicks the edit icon
   When update the fields with valid values from "<SheetName>" and "<Testcase>"
   And click submit
   Then The updated user details should appear on the data table 
                                                                                                                                                                                                            
   Examples: 
      | SheetName | Testcase    |
      | user      | update user |
   
  @user_20
  Scenario Outline:  Check if the update throws error with invalid values
   Given Admin clicks the edit icon
   When Update the fields with invalid values from "<SheetName>" and "<Testcase>"
   Then Error message should appear 
                                                                                                                                                                                                            
   Examples: 
      | SheetName | Testcase    |
      | user      | update invalid |
      
      
      
  @user_21
  Scenario Outline: Check if you get error message when mandatory fields are erased
   Given Admin clicks the edit icon
   When Erase data from mandatory field from "<SheetName>" and "<Testcase>"
   Then Error message should appear 
                                                                                                                                                                                                            
   Examples: 
      | SheetName | Testcase    |
      | user      | update user |
   
  
  @user_22
  Scenario Outline: Check if description field is optional in update
   Given Admin clicks the edit icon
   When Erase data from description field from "<SheetName>" and "<Testcase>"
   Then The updated user details should appear on the data table
                                                                                                                                                                                                            
   Examples: 
      | SheetName | Testcase    |
      | user      | update user |