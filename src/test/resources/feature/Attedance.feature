@tag
Feature: Attendance Manage Page verification

  @tag1
  Scenario: Validate the header of the page
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see the Manage attendance in header

  @tag2
  Scenario: Validate response time from dashboard page to attendance page
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Maximum navigation time in milliseconds, defaults to 30 seconds

  @tag3
  Scenario: Validate the broken link
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then HTTP response >= 400. Then the link is broken

  @tag4
  Scenario: Verify LMS title
    Given Admin is on dashboard page after Login page
    When dmin clicks "Attendance" on the navigation bar
    Then Admin should see LMS -Learning management system  as title

  @tag5
  Scenario: Verify the alignment of the Manage Attendance header
    Given Admin is on dashboard page after Login page page
    When Admin clicks "Attendance" on the navigation bar
    Then Manage attendance header should be in left side of the page

  @tag6
  Scenario: Validate text in manage attendancepage
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" button on the navigation bar and get all text from the portal page
    Then Admin should see correct spelling for the all the fields

  @tag7
  Scenario: Verify delete icon below the header
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see disabled delete icon below the "Manage Attendance"

  @tag8
  Scenario: Verify search bar on the class page
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see search bar on the attendance page

  @tag9
  Scenario: Verify add new Attendance button  on Attendance page
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see +Add New Attendance button on the attendance page

  @tag10
  Scenario: Verify data table on the attendance page
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see data table on the Manage Attendance Page With following column headers. (Check box symbol,Class ID, Student Id,Preasent, Edit /Delete)

  @tag11
  Scenario: Verify Edit icon in the data table
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Edit Icon in each row of data table only  when entries are available

  @tag12
  Scenario: Verify Edit icon when no data in the table
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Edit Icon will not be present in data table

  @tag13
  Scenario: Verify delete icon in the data table
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Delete Icon in each row of data table only  when entries are available

  @tag14
  Scenario: Verify delete icon when no data in the table
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Admin cant see delete  Icon in data table

  @tag15
  Scenario: Verify sort icon in the data table
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see sort icon near the column headers except for Edit and Delete

  @tag16
  Scenario: Verify check box in the data table
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see check box in the all rows  of data table

  @tag17
  Scenario: Validate the number entries displaying
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table. x- starting record number on that page,y-ending record number on that page z-Total number of records

  @tag18
  Scenario: Verify Pagination control below the data table
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see the pagination controls under the data table

  @tag19
  Scenario: Validate footer  text
    Given Admin is on dashboard page after Login page
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see the text with total number classes in the data table. ( " In total there are number of classes")

  @tag20
  Scenario: Verify all label text
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see correct spellings in the label

  @tag21
  Scenario: Verify dropdown box is present
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then 4 dropdown should be present

  @tag22
  Scenario: Verify close button in attendance details popup window
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see  close button on the attendance details popup window

  @tag23
  Scenario: Verify the alignment of the close button
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Close button should on the top right corner

  @tag24
  Scenario: Verify the text on first dropdown select a program name
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then First dropdown box "select a program name" text  should be present

  @tag25
  Scenario: Verify the text on second dropdown select a program name
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Second dropdown box "select class name" text  should be present

  @tag26
  Scenario: Verify the text on third dropdown select a program name
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Third dropdown box "select students" text  should be present

  @tag27
  Scenario: Verify the text on Fourth dropdown select a program name
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Fourth dropdown box "select attendance" text  should be present

  @tag28
  Scenario: Verify all the text inside the dropdown box is gray color
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin  should text in gray color

  @tag29
  Scenario Outline: Verify save button is present
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see  save button in the class detail popup window

  @tag30
  Scenario Outline: Verify cancel button is present
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see  cancel button in the class detail popup window

  @tag31
  Scenario Outline: Verify order of the label in attendance details page
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date.

  @tag32
  Scenario Outline: Validate all program name is reflecting in the dropdown
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Program Name in the drop down should match with  program name in  manage program page table

  @tag33
  Scenario Outline: Validate all class name  is reflecting in the dropdown
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Class Name in the drop down should match with  class name in  manage class page table

  @tag34
  Scenario Outline: Validate attendance field dropdown all mandatory keywords
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Attendance field should have keywords such as - present, absent, late, excused

  @tag35
  Scenario Outline: Verify spellings in the attendance field drop down
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see correct spellings in dropdown text

  @tag36
  Scenario Outline: Validate date picker
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then selected date should be their in class date text box

  @tag37
  Scenario Outline: validate date picker should be correct format
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then selected date should be in  mm/dd/yyyy formatsv

  @tag38
  Scenario Outline: Validate right arrow in data picker to navigate to next month
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Next month calender should visible

  @tag39
  Scenario Outline: Validate left arrow in data picker to navigate to previous month
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then previous month calender should visible

  @tag40
  Scenario Outline: Validate current date is highlighted in the date picker
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see current date is highled in the date picker

  @tag41
  Scenario Outline: Validate selected date is highlighted in the date picker
    Given Admin is in  attendance details popup window
    When Admin clicks date picker button and selects future date
    Then Admin should see selected date is highled in the date picker

  @tag43
  Scenario Outline: Admin click +Add New Attendance button after reaching to Manage attendance page
    Given Admin is in  attendance details popup window
    And Admin fills the values for add attendance page with <programName>, <className>, <studentName>, <attendance>, <attendanceDate>
    When Admin clicks on <confirmButton>
    Then Admin gets save confirmation <message>

    Examples: 
      | programName | className | studentName | attendance | attendanceDate | confirmButton | message                    |
      | program1    | class1    | student1    | present    | 09/11/23       | Save          | New attendance added       |
      |             | class2    | student2    | present    | 09/12/23       | Save          | program name is missing    |
      | program3    |           | student3    | absent     | 09/12/23       | save          | class name is missing      |
      | program4    | Class4    |             | present    | 09/12/23       | Save          | student name is missing    |
      | program5    | class5    | student5    |            | 09/12/23       | save          | attendance is missing      |
      | program6    | class6    | student6    | present    |                | Save          | attendance date is missing |
      | program7    | class7    | student7    | present    | 09/12/25       | Save          | Invalidate attendance date |

  @tag44
  Scenario Outline: Update attendance data
    Given Admin is in  attendance details popup window
    And Admin fills the values for add attendance page with <programName>, <className>, <studentName>, <attendance>, <attendanceDate>
    When Admin clicks on <confirmButton>
    Then Admin gets save confirmation <message>

    Examples: 
      | programName | className | studentName | attendance | attendanceDate | confirmButton | message                    |
      | program1    | class1    | student1    | present    | 09/11/23       | Save          | Successfully updated       |
      | program1    | class1    | student1    | absent     | 09/11/23       | cancel        | NA                         |
      |             | class2    | student2    | present    | 09/12/23       | Save          | program name is missing    |
      | program3    |           | student3    | absent     | 09/12/23       | save          | class name is missing      |
      | program4    | Class4    |             | present    | 09/12/23       | Save          | student name is missing    |
      | program5    | class5    | student5    |            | 09/12/23       | save          | attendance is missing      |
      | program6    | class6    | student6    | present    |                | Save          | attendance date is missing |
      | program7    | class7    | student7    | present    | 09/12/25       | Save          | Invalidate attendance date |

  @tag45
  Scenario Outline: delete multiple attendance data
    Given Admin is in manage attendance page
    And Admin clicks "<Action>" button
    When Admin should see alert open with  "<confirmButton> "
    Then Admin gets following "<message>"

    Examples: 
      | Action | confirmButton | message              |
      | Delete | Yes           | successfully deleted |
      | Delete | No            | NA                   |
      | Cancel | Yes           | NA                   |
