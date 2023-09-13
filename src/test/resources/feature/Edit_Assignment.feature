#Author: Hima

@assignment
Feature: 

  Background:
   Given Admin logged into LMS portal 
   When Admin clicks assignment button on the navigation bar 
   
 
  @assignment_53
  Scenario: Verify Edit assignment popup window
    Given Admin is on manage assignment Page
    When Admin clicks Edit button in data table 
    Then Edit popup window appears with heading Assignment Details
    
  @assignment_54
  Scenario: Verify values in popup window
    Given Admin is on manage assignment Page
    When Admin clicks Edit button from one of the row in data table  
    Then Edit popup window appears with same row values in the all fields
    
  @assignment_55
  Scenario Outline: Validate admin able to update assignment with valid data in mandatory fields
    Given Admin is in  Edit assignment detail popup window
    When Admin enters all mandatory field values with valid data from "<SheetName>" and "<Testcase>"
    And clicks save button  
    Then Admin should see updated assignment details is added in the data table 
    
    Examples: 
      | SheetName | Testcase    |
      | Assignment | updateAssignment |
      
  @assignment_56
  Scenario Outline: Validate admin able to update assignment with invalid data in mandatory fields
    Given Admin is in  Edit assignment detail popup window
    When Admin enters all mandatory field values with invalid data from "<SheetName>" and "<Testcase>"
    And clicks save button  
    Then Error message should appear in alert 
    
    Examples: 
      | SheetName | Testcase    |
      | Assignment | invalidValues |
      
   @assignment_57
   Scenario Outline: Validate admin able to update assignment with valid data  in all fields
    Given Admin is in  Edit assignment detail popup window
    When Admin enters values in all fields with valid data from "<SheetName>" and "<Testcase>"
    And clicks save button  
    Then Admin should see updated assignment details is added in the data table 
    
    Examples: 
      | SheetName | Testcase    |
      | Assignment | updateValidAllFields |
      
   @assignment_58
   Scenario Outline: Validate admin able to update assignment with invalid data  in optional fields
    Given Admin is in  Edit assignment detail popup window
    When Admin enters with invalid data in optional fields from "<SheetName>" and "<Testcase>"
    And clicks save button  
    Then Error message should appear in alert 
    
    Examples: 
      | SheetName | Testcase    |
      | Assignment | InvalidOptionalFieldsUpdate |
      
   @assignment_59
   Scenario Outline: Validate admin able to update assignment missing program name
    Given Admin is in  Edit assignment detail popup window
    When Admin enters  data missing value in program name from "<SheetName>" and "<Testcase>"
    And clicks save button  
    Then Program Name is missing 
    
    Examples: 
      | SheetName | Testcase    |
      | Assignment | MissingProgramName |
      
   @assignment_60
   Scenario Outline: Validate admin able to update assignment missing Batch number
    Given Admin is in  Edit assignment detail popup window
    When Admin enters  data missing value in Batch number from "<SheetName>" and "<Testcase>"
    And clicks save button  
    Then Batch number is missing 
    
    Examples: 
      | SheetName | Testcase    |
      | Assignment | MissingBatchNumber |
      
   @assignment_61
   Scenario Outline: Validate admin able to update assignment missing Assignment name
    Given Admin is in  Edit assignment detail popup window
    When Admin enters  data missing value in Assignment name from "<SheetName>" and "<Testcase>"
    And clicks save button  
    Then Assignment Name is missing 
    
    Examples: 
      | SheetName | Testcase    |
      | Assignment | MissingAssignmentName |
      
   @assignment_62
    Scenario Outline: Validate admin able to update assignment missing Assignment Due date
     Given Admin is in  assignment details popup window
     When Admin enters  data missing value in Assignment due date from "<SheetName>" and "<Testcase>" 
     And clicks save button
     Then Assignment due date is missing
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | MissingAssignmentDuedate |     
      
    @assignment_63
    Scenario Outline: Validate admin able to update assignment missing Grade by
     Given Admin is in  assignment details popup window
     When Admin enters  data missing value in Grade by from "<SheetName>" and "<Testcase>" 
     And clicks save button
     Then Grade by is missing
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | MissingGradeBy |       
      
   @assignment_64
    Scenario Outline: Validate  admin able to update assignment passing past date  
     Given Admin is in  assignment details popup window
     When Admin enters passed date in the due date field from "<SheetName>" and "<Testcase>" 
     And clicks save button
     Then Assignment cannot be created for the passed date
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | PassedDate | 
      
   @assignment_65
    Scenario: Validate cancel button function in assignment details popup window 
     Given Admin is in  assignment details popup window
     When Admin clicks Cancel button without entering values in the fields
     Then Admin should land on manage assignment page   
     
   @assignment_66 
    Scenario Outline: Validate cancel button function in assignment details popup window with values in field
     Given Admin is in  assignment details popup window
     When Admin clicks Cancel button entering values in the fields from "<SheetName>" and "<Testcase>" 
     Then Admin should land on manage assignment page 
     And validate new assignment is not created in the data table
    
    Examples: 
      | SheetName | Testcase |
      | Assignment | validAllFields |       
   