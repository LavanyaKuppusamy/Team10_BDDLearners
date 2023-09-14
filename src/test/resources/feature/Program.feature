#@tag
#Feature: Validate Program Page
  

 # @tag1
 # Scenario: Validate elements on Program page
 #   Given Admin is on dashboard page after Login
 #   When Admin clicks "Program" on the navigation bar
 #  Then Admin should see URL with "Manage Program"
 #  And Admin should see a heading with text "Manage Program" on the page
 #  And Admin should see the entries label format as "Showing 1 to 5 of 25 entries" on program page
 #  And Admin should see the footer as "In total there are 25 programs"
 #  And Admin should see a Delete button on the top left hand side as Disabled
 #   And Admin should see a "+A New Program" button on the program page above the data table
 #  And Admin should see the number of records displayed on the page are 5
 #  And Admin should see Search bar with text as "Search..."
 #  And Admin should see the Edit and Delete buttons on each row of the data table
 #  And Admin should see check box on the left side in all rows of the data table 
 #  And Admin should see the sort arrow icon beside to each column header except Edit and Delete 
 #  And Admin should see following column headers "Program Name, Program Description, Program Status, Edit,Delete"
 
 # @tag2
 #Scenario Outline: Create a New Program
 #  Given Admin is on "Program Details" Popup window
 #  And Admin enters program details with "<Name>","<Description>" and "<Status>"
 #  When User clicks on Program "<Confirmation>" button
 #  Then User gets Program save confirmation "<Message>"
 #  And User lands on Manage Program
 #  Examples: 
 #    | Name  | Description | Status  | Confirmation |     Message     |
 #    | java56| Java Batch  | Active  |   Save       | Program Created |
 #    | java56| Java Batch  | Active  |   Cancel     | Program Created |

      
 #  Scenario Outline: Add a new Program Negative scenarios
 #  Given Admin is on "Program Details" Popup window
 #  And Admin enters following program details with "<Name>","<Description>" and "<Status>"
 #  When Admin clicks on Program "<Confirmation>" button
 #  Then Admin gets Alert message "<Message>"
 #
 #  And Admin lands on Manage Program
    
 #  Examples: 
 #    | Name  | Description | Status  | Confirmation |     Message               |
 #    | java56| Java Batch  |         |   Save       | Status is mandatory field |
 #    |       | Java Batch  | Active  |   Save       | Name is mandatory field   |
 #    | 5564  | $%$&        | Active  |   Save       | Error message Alert       |
         
 #    When Admin clicks "Cancel/Close(X)" Icon on Program Details form
 #    Then Program Details popup window should be closed without saving
      
      
 #  Scenario Outline: Update Program details
 #  Given Admin is on "Program Details" Popup window
 #  And Admin edit program details with "<Name>","<Description>" and "<Status>"
 #  When User clicks on Program "<Confirmation>" button
 #  Then User gets Program save confirmation "<Message>"
 #  And User lands on Manage Program
 #  Examples: 
 #    | Name  | Description | Status  | Confirmation |     Message     |
 #    | java56| Java Batch  | Active  |   Save       | Successfully Updated Program |
 #    | java56| Java Batch  | Active  |   Cancel     | NA              |
      
      
       
 #  Scenario Outline: Delete multiple Program
 #  Given Admin is on Manage Program Page 
 #  And Admin select one program 
 #  When Admin clicks "<Action>" Checkbox 
 #  Then Admin should see a alert open with heading "<Confirm>" button for deletion
 #  And Admin gets following message "<Message>"
 #  Examples: 
 #    | Action  | Confirm | Messsage |
 #     | Delete  |  Yes    | Sucessfully Deleted |
 #     | Delete  |  No     | NA |
 #    | Cancel |   NA        | NA |
      
      
      
  #  Scenario Outline: Delete multiple Program
  # Given Admin is on Manage Program Page 
  # And Admin select multiple program 
  # When Admin clicks "<Action>" Checkbox 
  # Then Admin should see a alert open with heading "<Confirm>" button for deletion
  # And Admin gets following message "<Message>"
  # Examples: 
  #   | Action  | Confirm | Messsage |
  #   | Delete  |  Yes    | Sucessfully Deleted |
  #   | Delete  |  No     | NA |
  #   | Cancel |   NA        | NA |
      
      
      
      
      
      