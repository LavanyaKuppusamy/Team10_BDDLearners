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
@tag
Feature: Manage Class Page Verification feature
  I want to use this template for my feature file

  @tag1
Scenario: Verify landing in class page
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Admin should see URL with Manage Class
@tag2
Scenario: Capture the response time to navigate to manage class page
Given Admin is on dashboard page
When clicks Class button on the navigation bar
Then Get the response time for navigation to manage class page
@tag3
Scenario: Verify Manage Class Page Header
Given Admin is displayed with dashboard page
When clicks Class button
Then Admin sees header with Manage Class
@tag4
Scenario: Validate text in manage class page (write code for this)
Given Admin is displayed with dashboard page
When clicks Class button on the navigation bar and get all text from the portal page
Then Admin should see correct spelling for the all the fields
@tag5
Scenario: Verify delete icon below the header
Given Admin is on dashboardpage
When click Class button
Then Admin should see disabled delete icon below the Manage Class
@tag6
Scenario: Verify search bar on the class page
Given Admin is on dashboardpage on application
When click Class button on bar
Then Admin should see search bar on the class page
@tag7
Scenario: Verify add new class button on class page
Given Admin is on dashboardpage of application
When click Class button on bar
Then Admin should see Add New Class button on the class page
@tag8
Scenario Outline: Verify data table on the class page
Given Admin is on dashboardpage of application
When click Class button on bar
Then Admin should see data table on the Manage Class Page With Check box symbol, Batch Id, Class No, Class Date, Class Topic, Staff Id, Description, Comments, Notes, Recording, Edit Delete following column headers
@tag9
Scenario: Verify Edit icon in the data table
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Edit Icon in each row of data table only when entries are available
	 @tag10
Scenario: Verify Edit icon when no data in the table
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Edit Icon will not be present in data table
@tag11
Scenario: Verify delete icon in the data table
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Delete Icon in each row of data table only when entries are available
@tag12
Scenario: Verify delete icon when no data in the table
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Admin cant see delete Icon in data table
@tag13
Scenario: Verify sort icon in the data table
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Admin should see sort icon near the column headers except for Edit and Delete
@tag14
Scenario: Verify sort icon in the data table
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Admin should see sort icon near the column headers except for Edit and Delete
@tag15
Scenario: Verify check box in the data table
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Admin should see check box in the all rows of data table
@tab16
Scenario: Verify check box in the data table
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Above the footer Admin should see the text as Showing x to y of z entries below the table.
@tag17
Scenario: Verify check box in the data table
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Admin should see the pagination controls under the data table
@tag18
Scenario: Validate footer text
Given Admin is on dashboard page after Login
When Admin clicks Class button on the navigation bar
Then Admin should see the text with total number classes in the data table. (In total there are number of classes)
@tag19
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters <Batch id> into search box
Then Displays entries with that <Batch Id >
Examples:
| Class no | Batch id | Class Date | Class Topic | Staff id |
| 4 | 4666 | 9/10/2023 | Python | U22 |
@tag20
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters <Batch Id> which is not existing the table into search box
Then Displays empty details in the data table
Examples:
| Batch Id | Batch id | Class Date | Class Topic | Staff id |
| U1 |||||
@tag21
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters <class no>,<Batch id>, <Class Date>, <Class Topic>,<Staff id> into search box
Then Displays entries with that <class no>
Examples:
| Class no | Batch id | Class Date | Class Topic | Staff id |
| 1 | 4612 | 9/10/2023 | Python | U12 |
@tag22
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters invalid <class no>into search box
Then Displays empty details in the data table
Examples:
| Class no | Batch id | Class Date | Class Topic | Staff id |
| x2 |||||
@tagtag23
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters valid <Class Topic> into search box
Then Displays entries with that <class Topic>
Examples:
| Class no | Batch id | Class Date | Class Topic | Staff id |
| 4 | 2465 | 9/10/2023 | Python | U18 |
@tag24
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters invalid <Class Topic> into search box
Then Displays empty details in the data table
Examples:
| Class no | Batch id | Class Date | Class Topic | Staff id |
||||||
@tag25
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters invalid <Class Topic> into search box
Then Displays empty details in the data table
Examples:
| Class no | Batch id | Class Date | Class Topic | Staff id |
|||| APython ||
@tag26
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters valid <Staff id> into search box
Then Displays entries with that staff id
Examples:
| Class no | Batch id | Class Date | Class Topic | Staff id |
| 4 | 2465 | 9/10/2023 | Python | U18 |
@tag27
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters invalid <staff id> into search box
Then Displays empty details in the data table
Examples:
| Class no | Batch id | Class Date | Class Topic | Staff id |
||||| U000000 |
@tag28
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters valid <Class Date> into search box
Then Displays entries with that class date
Examples:
| Class no | Batch id | Class Date | Class Topic | Staff id |
| 4 | 2465 | 9/10/2023 | Python | U18 |
@tag29
Scenario Outline: Validate search box function
Given Admin is on Manage Class Page
When Admin enters invalid <Class Date> into search box
Then Displays empty details in the data table
Examples:
| Class no | Batch id | Class Date | Class Topic | Staff id |
||| 0/00/2023|||

@classdetailspopupwindow
Scenario: Verify class details popup window
Given Admin is on dashboard page after Login
When Admin click +Add New Class button
Then Admin should see a popup with heading class details
@tag31
Scenario: Verify class details popup window
Given Admin is on dashboard page after Login
When Admin click +Add New Class button
Then Admin should see a popup with heading class details
@tag32
Scenario: Verify input fields in class details popup window
Given Admin is on dashboard page after Login
When Admin click Add New Class button
Then Admin should see input fields Text Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)
@tag33
Scenario: Verify text box present in class details popup window
Given Admin is on dashboard page after Login
When Admin click Add New Class button
Then Six textbox should be present in Class details popup window
@tag34
Scenario: Verify drop down in Batch Id in class details popup window
Given Admin is on dashboard page after Login
When Admin click +Add New Class button
Then Admin should see dropdown option for Batch ID
@tag35
Scenario: Verify drop down in Staff Id in class details popup window
Given Admin is on dashboard page after Login
When Admin click +Add New Class button
Then Admin should see dropdown option for Staff Id
@tag36
Scenario: Verify calendar icon in class date in class details popup window
Given Admin is on dashboard page after Login
When Admin click +Add New Class button
Then Admin should see calendar icon for class date
@tag37
Scenario: Verify save button is present
Given Admin is on dashboard page after Login
When Admin click +Add New Class button
Then Admin should see save button in the class detail popup window
@tag38
Scenario: Verify cancel button is present
Given Admin is on dashboard page after Login
When Admin click +Add New Class button
Then Admin should see cancel button in the class detail popup window
@tag39
Scenario: Verify close button in class details popup window
Given Admin is on dashboard page after Login
When Admin click +Add New Class button
Then Admin should see close button on the class details popup window
@AddNewClasscompleteit
Scenario: Validate all batch id is reflecting in the dropdown
Given Admin is in class detail popup window
When Admin clicks Batch ID dropdown
Then Batch id in the drop down should match with Batch id manage batch page table
@tag41
Scenario: Validate admin able to add new class with valid data in mandatory fields
Given Admin is in class detail popup window
When Admin enters all mandatory field values with valid data and clicks save button<Batch ID>,<No of Classes>, <Class Date>, <Staff Id>)
Then Admin should see new class details is added in the data table
| Batch ID | No of Classes | Class Date | Staff Id |
@tag42
Scenario Outline: Validate admin able to add new class with invalid data in mandatory fields
Given Admin is in class detail popup window
When Admin enters all mandatory field values with invalid data and clicks save button <Batch ID> , <No of Classes>, <Class Date>, <Staff Id>
Then Error message should appear in alert
Examples:
| Batch ID | No of Classes | Class Date |Staff Id |
@tag43
Scenario Outline: Validate admin able to add new class with valid data in all fields
Given Admin is in class detail popup window
When Admin enters values in all fields with valid data and clicks save button <Batch ID> , <No of Classes>, <Class Date>, <Staff Id> , <Class description>, <Comments>, <Notes>, <Recordings>
Then Admin should see new class details is added in the data table
Examples:
| Batch ID | No of Classes | Class Date | Staff Id | Class description | Comments | Notes | Recordings |
@tag44
Scenario Outline: Validate admin able to add new class with invalid data in optional fields
Given Admin is in class detail popup window
When Admin enters with invalid data in optional fields and clicks save button <Batch ID> , <No of Classes>, <Class Date>, <Staff Id>
Then Error message should appear in alert
Examples:
| Batch ID |No of Classes | Class Date |Staff Id |
@tag45
Scenario Outline: Validate admin able to add new class missing Batch Id
Given Admin is in class detail popup window
When Admin enters data missing value in Batch ID and clicks save button <Batch ID> , <No of Classes>, <Class Date>, <Staff Id>
Then Batch Id is missing
| Batch ID |No of Classes | Class Date |Staff Id |
|          | 2            | 09/12/2023 |          |
@tag46
Scenario: Validate admin able to add new class missing No of Class
Given Admin is in class detail popup window
When Admin enters data missing value in No of class and clicks save button <Batch ID> , <Class Date>, <Staff Id>
Then No of classes is missing
| Batch ID | Class No | Class Date |Staff Id |
| 74645 | 2 | 09/12/2023 | U576 |
@tag47
Scenario: Validate admin able to add new class missing Class Date
Given Admin is in class detail popup window
When Admin enters data missing value in class date and clicks save button <Batch ID> , <No of Classes>, <Class Date>, <Staff Id>
Then class date is missing
|Batch ID| No of Classes | Class Date | Staff Id|
| 7832 | 4 || U642 |
@tag48
Scenario Outline: Validate admin able to add new class missing staff id
Given Admin is in class detail popup window
When Admin enters data missing value in staff id and clicks save button <Batch ID> , <No of Classes>, <Class Date>
Then staff id is missing
Examples:
| Batch ID |No of Classes | Class Date |
| 8539 | 2 | 09/12/2023 |
@tag49
Scenario Outline: Validate admin able to add new class passing past date
Given Admin is in class detail popup window
When Admin enters passed date in the class date field and clicks save button <Batch ID> , <No of Classes>,<Class Date>, <Staff Id>
Then class cannot be created for the passed date
Examples:
| Batch ID |No of Classes | Class Date |
| 8539 | 2 | 09/10/2023 |
@tag50
Scenario: Validate date picker
Given Admin is in class detail popup window
When Admin clicks date from date picker
Then selected date should be there in class date text box
@tag51
Scenario: validate date picker should be correct format
Given Admin is in class detail popup window
When Admin clicks date from date picker
Then selected date should be in mm/dd/yyyy format
@tag52
Scenario: Validate right arrow in data picker to navigate to next month
Given Admin is in class detail popup window
When Admin clicks right arrow in the date picker near month
Then Next month calender should visible
@tag53
Scenario: Validate left arrow in data picker to navigate to previous month
Given Admin is in class detail popup window
When Admin clicks left arrow in the date picker near month
Then previous month calender should visible
@tag54
Scenario: Validate current date is highlighted in the date picker
Given Admin is in class detail popup window
When Admin clicks date picker button
Then Admin should see current date is highlited in the date picker
@tag55
Scenario: Validate selected date is highlighted in the date picker
Given Admin is in class detail popup window
When Admin clicks date picker button and selects future date
Then Admin should see selected date is highlited in the date picker
@tag56
Scenario: Validate cancel button function in class details popup window
Given Admin is in class detail popup window
When Admin clicks Cancel button without entering values in the fields
Then Admin should land on Manage Class page
@tag57
Scenario: Validate cancel button function in class details popup window with values in field
Given Admin is in class detail popup window
When Admin clicks Cancel button entering values in the fields
Then Admin should land on Manage Class Page and validate new class is not created in the data table

@Deleteclassvalidation
Scenario: Verify Delete class alert
Given Admin is in Manage class page
When Admin clicks delete button in data table row level
Then Admin should see alert
@tag59
Scenario: Verify accept enabled in alert
Given Admin is in Manage class page
When Admin clicks delete button in data table row level
Then Alert should have "yes" button to accept
@tag60
Scenario: Verify reject enabled in alert
Given Admin is in Manage class page
When Admin clicks delete button in data table row level
Then Alert should have "No" button to reject
@tag61
Scenario: Verify Validate accept in alert
Given Admin is in delete alert
When Admin clicks yes button
Then Success message and validate particular class details are deleted from the data table
@tag62
Scenario: Validate reject in alert
Given Admin is in delete alert
When Admin clicks no button
Then Admin should land on manage class page and validate particular class details are not deleted from the data table
@Deletemultipleclassvalidation
Scenario: Verify delete multiple class button is enabled
Given Admin is in Manage class page
When Admin clicks single row level check box in the data table
Then Admin should see delete icon below the header is enabled
@tag64
Scenario: verify tick mark is visible after clicking on check box
Given Admin is in Manage class page
When Admin clicks single row level check box in the data table
Then Admin should see tick mark in check box
@tag65
Scenario: verify admin able to click multiple check box
Given Admin is in Manage class page
When Admin clicks multiple row level check box in the data table
Then Admin should see tick mark in check box of the selected rows
@tag66
Scenario: Verify accept alert in delete multiple class function by selecting single checkbox
Given Admin is in delete alert
When Admin clicks yes button
Then Success message and validate particular class details are deleted from the data table
@tag67
Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
Given Admin is in delete alert
When Admin clicks no button
Then Admin should land on manage class page and validate particular class details are not deleted from the data table
@tag68
Scenario: Verify accept alert in delete multiple class function by selecting multiple checkbox
Given Admin is in delete alert
When Admin clicks yes button
Then Admin should land on manage class page and validate particular class details are deleted from the data table
@tag69
Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
Given Admin is in delete alert
When Admin clicks no button
Then Admin should land on manage class page and validate particular class details are not deleted from the data table



  