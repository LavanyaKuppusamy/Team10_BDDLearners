
@Batch
Feature: Batch Page


@tag1
Scenario: Validate landing in Batch page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Admin should see the "Manage Batch" in the URL
   
@tag2
Scenario: Validate header in the Batch Page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar  
  Then Admin should see the "Manage Batch" in the header
  
@tag3
Scenario: Validate pagination in the Batch Page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar 
  Then Admin should see the pagination controls under the data table
  
@tag4
Scenario: Validate dataTable header in the Batch Page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar 
  Then Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete
  
@tag5
Scenario: Validate delete button in the Batch Page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar 
  Then Admin should be able to see the "delete" button that is not enabled
  
@tag6
Scenario: Validate "+A New Batch" button in the Batch Page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Admin should be able to see the "+ A New batch" button
  
@tag7
Scenario: Validate data rows having checkbox
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Each row in the data table should have a checkbox

@tag8
Scenario: Validate data rows having edit icon
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Each row in the data table should have a edit icon that is enabled

@tag9
Scenario: Validate data rows having delete icon
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Each row in the data table should have a delete icon that is enabled
   
@tag10
Scenario: Validate pop up for adding batch
  Given Admin is on dashboard page after Login
  When Admin clicks "+ A New Batch" button
  Then A new pop up with Batch details appears


   