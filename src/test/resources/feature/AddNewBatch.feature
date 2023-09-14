
@tag
Feature: AddDeleteEdit Batch validation

@tag1
 Scenario: Check if the fields exist in popup
   Given A new pop up with Batch details appears
   Then The pop up should include the fields Name ,Description as text box, Program Name as drop down, Status as radio button ,Number of classes as text box
   

 @tag2
 Scenario: Check if description is optional field
 Given A new pop up with Batch details appears
 Then User finds description field is optional
 
 @tag3
 Scenario Outline: Check if the program details are added in data table
 Given A new pop up with Batch details appears
 When Admin enters batch details with "<Name>","<Description>","<Program Name>","<Status>","<Number of classes>" and click "<confirmation>"button
 Then User find a "<Message>"new batch created or not
  
 Examples: 
      | Name | Program Name     |Description| Status | Number of classes | Confirmation |Message|
      |132   |BDDLearners-SDET10|Selenium   |Active  |18                 |save          |Batch created|
      |135   |BDDLearners-SDET12|API        |Active  |20                 |Cancel        |Batch Not created|
      
  @tag4
  Scenario Outline: Check for eror mesrsages for invalid fields
  Given A new pop up with Batch details appears
  When any of the fields have invalid "<Name>","<Description>","<Program Name>","<Status>","<Number of classes>" and click "<Confirmation>" button values
  Then Error "<Message>" should appear
  Examples: 
      | Name | Program Name     |Description| Status | Number of classes | Confirmation |Message                     |
      |@$@1  |BDDLearners-SDET  |Selenium   |Active  |1                  |save          | Name is invalid             |
      |10    |BDDLearners-SDET12|API        |Active  | *                 |save          |Number of classes is invalid|
  
  @tag5
  Scenario Outline: Check for error messages for mandatory fields
  Given A new pop up with Batch details appears
  When any of the fields have invalid "<Name>","<Description>","<Program Name>","<Status>","<Number of classes>" and click "<Confirmation>" button values
  Then Error "<Message>" should appear
  Examples: 
      | Name | Program Name       |Description| Status | Number of classes | Confirmation |Message                 |
      |      |BDDLearners-SDET15  |Selenium   |Active  |6                  |save          | Missing Mandatory field|
      |10    |                    |API        |Active  | 15                |save          |Missing Mandatory field |
      |      |BDDLearners-SDET26  |Selenium   |        |  10               |save          | Missing Mandatory field|
      |10    |BDDLearners-SDET28  |API        |Active  |                   |save          |Missing Mandatory field |
    
  
  @tag6_DeleteBatch 
  Scenario: Validate row level delete icon
  Given The delete icon on row level in data table is enabled
  When Admin clicks the delete icon
  Then Alert appears with yes and No option
  
  @tag7
  Scenario: Validate accept alert
  Given Admin clicks the delete icon
  When You click yes option
  Then Batch deleted alert pops and batch is no more available in data table
  
  @tag8
  Scenario: Validate reject alert
  Given Admin clicks the delete icon_ADD
  When you click No option
  Then Batch is still listed in data table
  
  @tag7_DeleteMultipleBatches 
  Scenario: Validate the delete icon below the header 
  Given None of the checkboxes in data table are selected
  Then The delete icon under the "Manage Batch" header should be disabled_ADD
  
  @tag9
  Scenario: Check for single row delete
  Given One of the checkboxes/row is selected
  When Click delete icon below "Manage Batch" header
  Then The respective row in the data table is deleted
  
  @tag9
  Scenario: Check for multi row delete
  Given Two or more checkboxes/row is selected
  When Click delete icon below "Manage Batch" header
  Then The respective row in the data table is deleted_ADDBATCH
  
  @tag10_EditBatch
  Scenario: Validate row level edit icon
  Given The edit icon on row level in data table is enabled
  When Admin clicks the edit icon
  Then A new pop up with Batch details appears
  
  @tag11
  Scenario Outline: The updated batch details should appear on the data table
  Given Admin clicks the edit icon
  When Update the fields with valid values "<SheetName>" and "<rowNo>"and click Save
  Then The updated batch details should appear on the data table
  Examples:
  |SheetName| rowNo|
  |Batch    |0     |
  
  
  @tag12
  Scenario Outline: Check if the update throws error with invalid values
  Given Admin clicks the edit icon
  When Update the fields with invalid values "<SheetName>" and "<rowNo>" and click save
  Then Error message should appear
   Examples:
  |SheetName| rowNo|
  |Batch    |1    |
  
  @tag13
  Scenario Outline: Check if you get error message when mandatory fields are erased
  Given Admin clicks the edit icon
  When Erase data from mandatory field "<SheetName>" and "<rowNo>"
  Then Error message should appear
   Examples:
  |SheetName| rowNo|
  |Batch    |2    |
  
  
  @tag14
  Scenario Outline: Check if description field is optional in update
  Given Admin clicks the edit icon
  When Erase data from description field "<SheetName>" and "<rowNo>"
  Then The updated batch details should appear on the data table
   Examples:
  |SheetName| rowNo|
  |Batch    |3     |
  