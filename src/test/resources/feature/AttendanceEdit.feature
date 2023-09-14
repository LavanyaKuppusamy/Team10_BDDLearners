@tag
Feature: Attendence Edit Page


 @tag43
  Scenario Outline: Admin click +Add New Attendance button after reaching to Manage attendance page
    Given Admin lands on attendance details page by clicking on New Attendance
    And Admin fills the values for add attendance page with "<programName>", "<className>", "<studentName>", "<attendance>", "<attendanceDate>"
    When Admin clicks on "<confirmButton>"
    Then Admin gets save confirmation "<message>"

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
    Given Admin lands on attendance details page by clicking on Edit Attendance
    And Admin fills the values for add attendance page with "<programName>", "<className>", "<studentName>", "<attendance>", "<attendanceDate>"
    When Admin clicks on "<confirmButton>"
    Then Admin gets save confirmation "<message>"

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