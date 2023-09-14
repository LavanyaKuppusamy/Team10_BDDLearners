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
@Assignment
Feature: Assignment Manage Page Verification
  I want to use this template for my feature file

  @tag1
  Scenario: Verify landing in manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see URL with "Manage assignment"

  @tag2
  Scenario Outline: Capture the response time to navigate to manage assignment page
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Get the response time for navigation from dashboard page to manage assignment page
    
    @tag3
  Scenario Outline: Verify manage assignment page Header
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see header with "Manage assignment"
    
     @tag4
  Scenario Outline: Validate text in manage assignment page
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see correct spelling for the all the fields
    
     @tag5
  Scenario Outline: Verify delete icon below the header
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see disabled delete icon below the "Manage assignment" ASSIGNMENT
    
     @tag6
  Scenario Outline: Verify search bar on the manage assignment page
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see search bar on the manage assignment page
    
    @tag7
  Scenario Outline: Verify add new assignment button  on manage assignment page
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see +Add New assignment button on the manage assignment page
    
     @tag8
  Scenario Outline: Verify data table on the manage assignment page
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see data table on the manage assignment page With following column headers
    
     @tag9
  Scenario Outline: Verify Edit icon in the data table
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Edit Icon in each row of data table only  when entries are available
    
    
     @tag10
  Scenario Outline: Verify Edit icon when no data in the table
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Edit Icon will not be present in data table
    
    @tag11
  Scenario Outline: Verify delete icon in the data table
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Delete Icon in each row of data table only  when entries are available ASSIGNMENT
    
    @tag12
  Scenario Outline: Verify delete icon when no data in the table
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Delete Icon will not be present in data table
    
    @tag13
  Scenario Outline: Verify sort icon in the data table
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see sort icon near the column headers except for Edit and Delete
    
     @tag14
  Scenario Outline: Verify sort icon in the data table
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see sort icon near the column headers except for Edit and Delete
    
     @tag15
  Scenario Outline: Verify check box in the data table
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see check box in the all rows  of data table when entries available
    
     @tag16
  Scenario Outline: Validate the number entries displaying
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Above the footer Admin should see the text as "Showing x to y of z entries" below the table. 
    
    @tag17
  Scenario Outline: Verify Pagination control below the data table
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see the pagination controls under the data table
    
    @tag18
  Scenario Outline: Validate footer  text
    Given Admin is on dashboard page after Login
    When  Admin clicks "assignment" button on the navigation bar
    Then  Admin should see the text with total number assignments in the data table.
    
     @tag19
  Scenario Outline: Validate search box function
    Given Admin is on manage assignment page
    When  Admin enters "<Searchtext>" into search box  
    Then  Displays entries with that "<Output>"
    
    |Data                           |Searchtext        | Output                                           |
    |Assignment Name                | SDET             | Display entries with that assignment Name        |
    |Invalid Assignment Name        | 123$$            | Displays Empty details in data table             |
    |Assignment description         | selenium         |Displays entries with that assignment description |
    |Invalid Assignment description | ^^&&&&           |Displays Empty details in data table              |
    |Assignment due date            | 12/12/2023       |Displays entries with that assignment due date    |
    |Invalid assignment due date    | 58/12/2023       |Displays Empty details in data table              |
    |Grade value                    | 1                |Displays entries with that assignment  grade      |
    |Invalid grade value            | **               | Displays empty details in the data table         |     
    
    
     @DeleteMultipleClassValidation
  Scenario Outline: Verify delete multiple class  button is enabled
    Given Admin is in manage assignment page
    When  Admin clicks single  row level check box in the data table
    Then  Admin should see delete icon below the header is enabled
    
    @DeleteMultipleClassValidation_2
  Scenario Outline: Verify alert in delete multiple class function by selecting single checkbox
    Given Admin Clicks single row
    When  Admin clicks Options button
    Then  Redirected to assignment page and selected assignment details are "<Output>" from the data table
    
    |Alert        |Options          |Output     |
    |Accept       |yes              |Deleted    |  
    |Reject       |No               |Not Deleted|
    
    
    @DeleteMultipleClassValidation_3
  Scenario Outline: Verify alert in delete multiple class function by selecting Multiple checkbox
    Given Admin Clicks Multiple row
    When  Admin clicks Options button
    Then  Redirected to assignment page and selected assignment details are "<Output>" from the data table
    
    |Alert        |Options          |Output     |
    |Accept       |yes              |Deleted    |  
    |Reject       |No               |Not Deleted|
    
    
    @DeleteAssignmentvalidation
     Scenario Outline: Verify Delete Assignment alert
    Given Admin is in manage assignment page
    When  Admin clicks delete button in data table row level
    Then  Admin should see dialog box
    
     @DeleteAssignmentvalidation_1
     Scenario Outline: Verify  accept enabled in alert
    Given Admin is in manage assignment page
    When  Admin clicks delete button in data table row level
    Then  Alert should have "yes" button to accept and Records deleted from table
    
     @DeleteAssignmentvalidation_2
    Scenario Outline: Verify  accept enabled in alert
    Given Admin is in manage assignment page
    When  Admin clicks delete button in data table row level
    Then  Alert should have "No" button to accept and Records are Not deleted from table
    
  
    



    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  