#Author: Hima
@assignment
Feature: Add new assignment 

  Background:
   Given Admin click +Add new assignment button after reaching to manage assignment page
   
  @assignment_35
  Scenario Outline: Validate admin able to add new assignment with valid data in mandatory fields
    Given Admin is in  assignment details popup window
    When Admin enters all mandatory field values with valid data valid values from "<SheetName>" and "<Testcase>" 
    Then Admin should see new assignment details is added in the data table
    
    Examples: 
      | SheetName | Testcase    |
      | Assignment | NewAssignment |
      
  @assignment_36
  Scenario Outline: Validate admin able to add new assignment with invalid data in mandatory fields
    Given Admin is in  assignment details popup window
    When Admin enters all mandatory field values with invalid data from "<SheetName>" and "<Testcase>" 
    And clicks save button
    Then Error message should appear in alert
    
    Examples: 
      | SheetName | Testcase    |
      | Assignment | invalidValues |
      
  @assignment_37
  Scenario Outline: Validate admin able to add new assignment with valid data  in all fields
    Given Admin is in  assignment details popup window
    When Admin enters values in all fields with valid data from "<SheetName>" and "<Testcase>" 
    And clicks save button
    Then Admin should see new assignment details is added in the data table
    
    Examples: 
      | SheetName | Testcase    |
      | Assignment | validAllFields |
   
    
  @assignment_38 
  Scenario Outline: Validate admin able to add new assignment with invalid data  in optional fields
    Given Admin is in  assignment details popup window
    When Admin enters with invalid data in optional fields from "<SheetName>" and "<Testcase>" 
    And clicks save button
    Then Error message should appear in alert
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | InvalidOptionalFields |    
      
    @assignment_39
    Scenario Outline: Validate admin able to add new assignment missing program name
     Given Admin is in  assignment details popup window
     When Admin enters  data missing value in program name from "<SheetName>" and "<Testcase>" 
     And clicks save button
     Then Program Name is missing
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | MissingProgramName |  
      
    @assignment_40
    Scenario Outline: Validate admin able to add new assignment missing Batch number
     Given Admin is in  assignment details popup window
     When Admin enters  data missing value in Batch number from "<SheetName>" and "<Testcase>" 
     And clicks save button
     Then Batch number is missing
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | MissingBatchNumber |     
      
    @assignment_41
    Scenario Outline: Validate admin able to add new assignment missing Assignment name
     Given Admin is in  assignment details popup window
     When Admin enters  data missing value in Assignment name from "<SheetName>" and "<Testcase>" 
     And clicks save button
     Then Assignment Name is missing
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | MissingAssignmentName |      
      
    @assignment_42
    Scenario Outline: Validate admin able to add new assignment missing Assignment Due date
     Given Admin is in  assignment details popup window
     When Admin enters  data missing value in Assignment due date from "<SheetName>" and "<Testcase>" 
     And clicks save button
     Then Assignment due date is missing
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | MissingAssignmentDuedate |     
      
    @assignment_43
    Scenario Outline: Validate admin able to add new assignment missing Grade by
     Given Admin is in  assignment details popup window
     When Admin enters  data missing value in Grade by from "<SheetName>" and "<Testcase>" 
     And clicks save button
     Then Grade by is missing
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | MissingGradeBy |       
      
    
    @assignment_44
    Scenario Outline: Validate  admin able to add new assignment passing past date 
     Given Admin is in  assignment details popup window
     When Admin enters passed date in the due date field from "<SheetName>" and "<Testcase>" 
     And clicks save button
     Then Assignment cannot be created for the passed date
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | PassedDate |    
      
    @assignment_45
    Scenario: Validate date picker 
     Given Admin is in  assignment details popup window
     When Admin clicks date from date picker 
     Then selected date should be their in class date text box ASSIGN
    
    @assignment_46
    Scenario: validate date picker should be correct format
     Given Admin is in  assignment details popup window
     When Admin clicks date from date picker 
     Then selected date should be in  mm/dd/yyyy format
    
    @assignment_47
    Scenario: Validate right arrow in data picker to navigate to next month
     Given Admin is in  assignment details popup window
     When Admin clicks right arrow in the date picker near month
     Then Next month calender should visible 
     
    @assignment_48
    Scenario: Validate left arrow in data picker to navigate to next month
     Given Admin is in  assignment details popup window
     When Admin clicks left arrow in the date picker near month
     Then previous month calender should visible_ASSIGNMENT
  
    @assignment_49
    Scenario: Validate current date is highlighted in the date picker
     Given Admin is in  assignment details popup window
     When Admin clicks date from date picker
     Then Admin should see current date is highlighted in the date picker   
     
    @assignment_50
    Scenario: Validate selected date is highlighted in the date picker
     Given Admin is in  assignment details popup window
     When Admin clicks date picker button 
     And selects future date
     Then Admin should see current date is highlighted in the date picker   
   
     
    @assignment_51
    Scenario: Validate cancel button function in assignment details popup window 
     Given Admin is in  assignment details popup window
     When Admin clicks Cancel button without entering values in the fields
     Then Admin should land on manage assignment page  
    
    @assignment_52
    Scenario Outline: Validate cancel button function in assignment details popup window with values in field
     Given Admin is in  assignment details popup window
     When Admin clicks Cancel button entering values in the fields from "<SheetName>" and "<Testcase>" 
     Then Admin should land on manage assignment page 
     And validate new assignment is not created in the data table
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | validAllFields |