
@tag
Feature: Program page functionality check

  @tag1
  Scenario: Pagination Next page link
    Given Admin is on Manage Program page
    When Admin clicks Next page link on the program table 
    Then Admin should see the Pagination has "Next" link
    

  @tag2
  Scenario: Pagination Last page link
    Given Admin is on Manage Program page
    When Admin clicks Last page link
    Then Admin should see the last page record on the table with Next page link are disabled
    
   @tag3
  Scenario: Title of your scenario outline
    Given Admin is on Manage Program page
    When Admin clicks First page link
    Then Admin should see the previous page record on the table with pagination has previous page link
    
    
   @tag4
  Scenario: Title of your scenario outline
    Given Admin is on Manage Program page
    When Admin clicks Start page link
    Then Admin should see the very first page record on the table with Previous page link are disabled
    
    @tag5
  Scenario: Validates Sorting(data ordering) on the Program Data table
    Given Admin is on Manage Program page
    When Admin clicks on the Ascending or Descending arrow button on program page
      | Program Name        |
      | Program Description |
      | Program Status      |
    Then Admin can see the results in Ascending or Descending order on program page
    
    
     @tag6
  Scenario: Navigation from Program to other pages
    Given Admin is on Manage Program page
    When Admin clicks on the link page button on program page
      | Student        |
      | Batch |
      | Class      |
      | User |
      | Assignment |
      | Attendance |
      | Logout  |
    Then Admin is re-directed to following page
   
    @tag7_Program_elements_Validations
  Scenario: Validate landing in Program page
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see URL with "Manage Program"
    
      @tag8_Program_elements_Validations
  Scenario: Validate the heading
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see a heading with text "Manage Program" on the page
    
     @tag9_Program_elements_Validations
  Scenario: Validate the text and pagination icon below the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the text as "Showing 1 to 5 of 25 entries" along with Pagination icon below the table. 
    
     @tag10_Program_elements_Validations
  Scenario: Validate the footer
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the footer as "In total there are 25 programs".
    
     @tag11_Program_elements_Validations
  Scenario: Validating the default state of Delete button
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see a Delete button on the top left hand side as Disabled
    
    
     @tag12_Program_elements_Validations
  Scenario: Validate Add New Program 
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see a "+A New Program" button on the program page above the data table
    
    
     @tag13_Program_elements_Validations
  Scenario: Validate that number of records (rows of data in the table) displayed
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the number of records (rows of data in the table) displayed on the page are 5
    
    
     @tag14_Program_elements_Validations
  Scenario: Verify Sort arrow icon on the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the sort arrow icon beside to each column header except Edit and Delete 
    
    
     @tag15_Program_elements_Validations
  Scenario: Verify Check box on the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see check box on the left side in all rows of the data table 
    
      @tag16_Program_elements_Validations
  Scenario: Verify Edit and Delete buttons
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the Edit and Delete buttons on each row of the data table
    
      @tag17_Program_elements_Validations
  Scenario: Verify Search bar on the Program page
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see Search bar with text as "Search..."
    
      @tag18_Program_elements_Validations
  Scenario: Verify data table on the Program page
    Given Admin is on dashboard page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see data table on the Manage Program Page with following column headers 
    | Program Name |
    | Program Description |
    | Program Status |
    | Edit |
    | Delete |
    
    
   Scenario Outline: Search box
    Given Admin is on Manage Program page
    When Admin enters Program search content into search box "<Content>"
    Then Admin see the Program search result

    Examples: 
      | Content |
      | SDET    |
      | LMA-Hackathon |
      | Active |
      | NA |

   