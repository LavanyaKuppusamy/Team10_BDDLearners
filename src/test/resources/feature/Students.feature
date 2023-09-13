@tagStudentPageVerification
Feature: Student Page Verififcation

  @tag1
  Scenario: Validate the title of the page
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see the Student details Page Title

  @tag2
  Scenario Outline: Validate response time from dashboard page to student page
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Maximum navigation time in milliseconds, defaults to 30 seconds

  @tag3
  Scenario Outline: Validate the broken link
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then HTTP response >= 400. Then the link is broken

  @tag4
  Scenario Outline: Verify LMS title
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see LMS -Learning management system  as title

  @tag5
  Scenario Outline: Verify the alignment of the Student detail title
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Student Detail title should be in centre of the page

  @tag6
  Scenario Outline: Validate drop down is present in the page
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then 2 dropdowns should be present in the page

  @tag7
  Scenario Outline: Validate search bar in select student name drop down
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see search box inside the drop down

  @tag8
  Scenario Outline: Validate search bar in select batch id drop down
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see search box inside  batch id drop down

  @tag9
  Scenario Outline: Validate text spelling student name
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see correct spelling select student name

  @tag10
  Scenario Outline: Validate text spelling select batch id
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see correct spelling select  batch id text

  @tag11
  Scenario Outline: Validate only numbers inside select batch id
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see only numbers inside batch id drop down

  @tag12
  Scenario Outline: Validate gray color in student name drop down
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see select student name in gray color

  @tag13
  Scenario Outline: Validate gray color in batch id drop down
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see select batch ID in gray color

  @tag14
  Scenario Outline: Validate first drop down label is select student name
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see select student name in first

  @tag15
  Scenario Outline: Validate second drop down label is select batch id
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should see select batch id in second

  @tag16
  Scenario Outline: Validate scroll down inside student name dropdown
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should able to scroll down to select the name

  @tag17
  Scenario Outline: Validate scroll down inside batch id dropdown
    Given Admin is on dashboard page after Login
    When Admin clicks "Student" on the navigation bar
    Then Admin should able to scroll down to select the batch id

  @tag18
  Scenario Outline: Validate select student name is fading
    Given Admin is on dashboard page after Login
    When Admin select student name from the drop down
    Then Admin shouldn't see select student name text

  @tag19
  Scenario Outline: Validate select batch id  is fading
    Given Admin is on dashboard page after Login
    When Admin select batch id from the drop down
    Then Admin shouldn't see select batch id text

  @tag20
  Scenario Outline: Validate select student name using search box
    Given Admin is on student details page
    When Admin clicks select student name and  enters x alphabet in the search box
    Then Admin should see student name start with x is listed below

  @tag21
  Scenario Outline: Validate select batch id using search box
    Given Admin is on student details page
    When Admin  clicks select batch id and enter x number in the search box
    Then Admin should see batch id start with x is listed below

  @tag22
  Scenario Outline: Validate selecting only  student name  will not display any details
    Given Admin is on student details page
    When Admin selects only student name
    Then Student details shouldn't be displayed

  @tag23
  Scenario Outline: Validate selecting only  batch id  will not display any details
    Given Admin is on student details page
    When Admin selects only  batch id
    Then batch id details shouldn't be displayed

  @tag24
  Scenario Outline: Validate selecting student name and batch id
    Given Admin is on student details page
    When Admin selects  student name and batch id
    Then Particular student informations should be display

  @tag25
  Scenario Outline: Program link on navigation bar
    Given Admin is on student details page
    When Admin clicks on program link on student  page
    Then Admin is redirected to Program page

  @tag26
  Scenario Outline: Batch link on navigation bar
    Given Admin is on student details page
    When Admin clicks on Batch link on student page
    Then Admin is redirected to Batch page

  @tag27
  Scenario Outline: Class link on navigation bar
    Given Admin is on student details page
    When Admin clicks on Class link on student page
    Then Admin is redirected to Class page

  @tag28
  Scenario Outline: User link on navigation bar
    Given Admin is on student details page
    When Admin clicks on User link on student page
    Then Admin is redirected to User page

  @tag29
  Scenario Outline: Assignment link on navigation bar
    Given Admin is on student details page
    When Admin clicks on Assignment link on student page
    Then Admin is redirected to Assignment page

  @tag30
  Scenario Outline: Attendance link on navigation bar
    Given Admin is on student details page
    When Admin clicks on Attendance link on student page
    Then Admin is redirected to Attendance page

  @tag31
  Scenario Outline: Logout link on navigation bar
    Given Admin is on student details page
    When Admin clicks on Logout link on student page
    Then Admin is redirected to Login page

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
