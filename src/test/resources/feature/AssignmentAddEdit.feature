#Author: Hima

@assignment
Feature: Assignment module 

  Background:
   Given Admin logged into LMS portal 
   When Admin clicks assignment button on the navigation bar 
  
  @assignment_26
  Scenario: Verify Assignment details popup window
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see a popup  with  heading "Assignment details"
 
   
  @assignment_27
  Scenario Outline: Verify input fields in Assignment details popup window
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see input fields Text from "<SheetName>" and "<Testcase>"
   Examples: 
      | SheetName | Testcase    |
      | Assignment | NewAssignment    |
      
  @assignment_28
  Scenario: Verify text box present in Assignment details popup window 
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then 8 textbox should be  present in Assignment details popup window
    
   @assignment_29
  Scenario: Verify drop down in Batch Number  in Assignment details popup window 
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  dropdown option for Batch Number
   
    @assignment_30
    Scenario: Verify drop down in Program name  in Assignment details popup window 
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  dropdown option for Program name
    
    @assignment_31
    Scenario: Verify calendar icon in Assignment due date  in Assignment details popup window 
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  calendar icon for assignment due date
    
    @assignment_32
    Scenario: Verify save button is present
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  save button in the Assignment detail popup window
    
    @assignment_33
    Scenario: Verify cancel button is present
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  cancel button in the Assignment detail popup window
    
    
    @assignment_34
    Scenario: Verify close button in  Assignment details popup window
    Given Admin is on manage assignment Page
    When Admin click +Add new assignment button
    Then Admin should see  close button on the Assignment details popup window