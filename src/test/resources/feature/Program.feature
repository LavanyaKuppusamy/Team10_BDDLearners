@tag
Feature: Program Page
  
 
  @tag2
  Scenario Outline: Create a New Program
    Given Admin lands on program details page by clicking on New Program
    And Admin enters program details with "<Name>","<Description>" and "<Status>"
    When Admin clicks on Program "<Confirmation>" button
    Then Admin gets following pop up message "<Message>"
    And Admin lands on Manage Program
    Examples: 
      | Name  | Description | Status  | Confirmation |     Message     |
      | java56| Java Batch  | Active  |   Save       | Program Created |
      | java56| Java Batch  | Active  |   Cancel     | Program Created |

      
    Scenario Outline: Add a new Program Negative scenarios
    Given Admin lands on program details page by clicking on New Program
    And Admin enters program details with "<Name>","<Description>" and "<Status>"
    When Admin clicks on Program "<Confirmation>" button
    Then Admin gets following pop up message "<Message>"
    And Admin lands on Manage Program
    
   Examples: 
      | Name  | Description | Status  | Confirmation |     Message               |
      | java56| Java Batch  |         |   Save       | Status is mandatory field |
      |       | Java Batch  | Active  |   Save       | Name is mandatory field   |
      | 5564  | $%$&        | Active  |   Save       | Error message Alert       |
         
      
    Scenario Outline: Update Program details
    Given Admin lands on program details page by clicking on Edit Program
    And Admin edit program details with "<Name>","<Description>" and "<Status>"
    When Admin clicks on Program "<Confirmation>" button
    Then Admin gets following pop up message "<Message>"
    And Admin lands on Manage Program
    Examples: 
      | Name  | Description | Status  | Confirmation |     Message     |
      | java56| Java Batch  | Active  |   Save       | Successfully Updated Program |
      | java56| Java Batch  | Active  |   Cancel     | NA              |
      
      
       
    Scenario Outline: Delete multiple Program
    Given Admin is on Manage Program Page 
    And Admin select one program 
    When Admin clicks Delete Checkbox 
    Then Admin should see a alert open with heading "<Confirm>" button for deletion
    And Admin gets following message "<Message>"
    Examples: 
      | Confirm | Messsage |
      |  Yes    | Sucessfully Deleted |
      |  No     | NA |
     
      
      
      
    Scenario Outline: Delete multiple Program
    Given Admin is on Manage Program Page 
    And Admin select multiple program 
    When Admin clicks multiple Delete button  
    Then Admin should see a alert open with heading "<Confirm>" button for deletion
    And Admin gets following message "<Message>"
    Examples: 
       | Confirm | Messsage |
      |  Yes    | Sucessfully Deleted |
      |  No     | NA |
      
      
      
      
      
      
      