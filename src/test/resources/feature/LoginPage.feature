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
@LoginPage_Verification
Feature: LoginPage_Verification
  I want to use this template for my feature file

  @tag1
  Scenario: Verify the login page
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should land on the login page 

  @tag2
  Scenario Outline: Verify for broken link
    Given Admin is in home page
    When Admin clicks Login button
    Then  HTTP response >= 400. Then the link is broken

         
       @tag3
  Scenario Outline: Verify tht header of the login page
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see "Please login to LMS application" in the header

         
      
       @tag4
  Scenario Outline: Verify the text spelling in login page 
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see "Please login to LMS application" in the header

      
       @tag5
  Scenario Outline: Verify text field is present
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see two text field
    
    @tag6
  Scenario Outline: Verify text on the first text field
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should "user" in the first text field
    
     @tag7
  Scenario Outline: Verify asterik next to user text
    Given Admin is in home page
    When  Admin clicks Login button
    Then  Admin should see * symbol next to user text
    
     @tag8
  Scenario Outline: Verify text on the second text field
    Given Admin is in home page
    When Admin clicks Login button
    Then  Admin should "password" in the second text field
    
    @tag9
  Scenario Outline: Verify asterik next to password text
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see * symbol next to password text
    
     @tag10
  Scenario Outline: Verify the alignment input field for the login
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see input field on the centre of the page
    
     @tag11
  Scenario Outline: verify Login is present
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see login button 
    
     @tag12
  Scenario Outline: Verify the alignment of the login button
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see login button on the centre of the page
    
    @tag13
  Scenario Outline: Verify forgot username or password link
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see forgot username or password link 
    
      @tag14
  Scenario Outline: Verify for the Reset password link
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see reset password link 
    
     @tag15
  Scenario Outline: Verify input descriptive test in user field
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see user in gray color
    
     @tag16
  Scenario Outline: Verify input descriptive test in password field
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see password in gray color
    
     @tag17
  Scenario Outline: Validate login with valid credentials
    Given Admin is in home page
    When Admin enter valid credentials  and clicks login button 
    Then Admin should land on dashboard page
    
    @tag18
  Scenario Outline: Validate login with invalid credentials
    Given Admin is in home page
    When Admin enter invalid credentials  and clicks login button 
    Then Error message please check username/password
    
    @tag19
  Scenario Outline: Validate login with valid credentials in username
    Given Admin is in home page
    When Admin enter valid username  and clicks login button 
    Then Error message please check password
    
      @tag20
  Scenario Outline: Validate login with valid credentials in password
    Given Admin is in home page
    When  Admin enter valid  password  and clicks login button 
    Then  Error message please check username
    
     @tag21
  Scenario Outline: Validate login with blank username credentials
    Given Admin is in home page
    When  Admin enter blank in username and clicks login button 
    Then  Error message please check username/password
    
     @tag22
  Scenario Outline: Validate login with blank password credentials
    Given Admin is in home page
    When  Admin enter blank in password  and clicks login button 
    Then  Error message please check username/password
    
    @tag23
  Scenario Outline: validate login with empty values in both field
    Given Admin is in home page
    When  Admin clicks Login button with empty values in both columns
    Then  Error message please check username/password
    
     @tag24
  Scenario Outline: verify login button action through keyboard
    Given Admin is in home page
    When  Admin enter valid credentials  and clicks login button through keyboard
    Then  Admin should land on dashboard page
    
     @tag25
  Scenario Outline: verify login button action through mouse
    Given Admin is in home page
    When  Admin enter valid credentials  and clicks login button through mouse
    Then  Admin should land on dashboard page
    
      @tag26_ForgotUsername/password_1
  Scenario Outline: Verify forgot username or password link
    Given Admin is in login page
    When  Admin clicks forgot username or password link
    Then  Admin should land on forgot username or password page
    
    @tag27_ForgotUsername/password_2
  Scenario Outline: verify broken link for forgotUsername/Password
    Given Admin is in login page
    When  Admin clicks forgot username or password link
    Then  HTTP response >= 400. Then the link is broken
    
    @tag28
  Scenario Outline: verify input descriptive text for Email
    Given Admin is in login page
    When  Admin clicks forgot username or password link
    Then  Admin should see "Email" text in gray color
    
     @tag29
  Scenario Outline: Verify email text in text field
    Given Admin is in login page
    When  Admin clicks forgot username or password link
    Then  Admin should see "Email" in text field
    
    @tag30
  Scenario Outline: Verify send link button is present	
    Given Admin is in login page
    When  Admin clicks forgot username or password link
    Then  Admin should see "send Link"  button
    
     @tag31
  Scenario Outline: Verify asterik near Email text
    Given Admin is in login page
    When  Admin clicks forgot username or password link
    Then  Admin should see asterik symbol need Email
    
     @tag32
  Scenario Outline: Verify text spelling 
    Given Admin is in login page
    When  Admin clicks forgot username or password link
    Then  Admin should see correct spellings in all fields 
    
     @tag33
  Scenario Outline: Verify the alignment of the send link button
    Given Admin is in login page
    When  Admin clicks forgot username or password link
    Then  Admin should see send link button in center of the page
    
     @tag34
  Scenario Outline: Validate email sent for forgot password
    Given Admin is in forgot username and password page
    When  Admin enters valid email id and clicks send link button
    Then  Admin should receive link in mail for reset username / password
    
    @tag35
  Scenario Outline: Validate email sent for forgot password with invalid email id
    Given Admin is in forgot username and password page
    When  Admin enters invalid email id and clicks send link button
    Then  Admin should not receive link in mail for reset username / password
    
     @tag36_Reset_Password
  Scenario Outline: Verify  reset password link
    Given Admin is in login page
    When  Admin clicks reset password link
    Then  Admin should land on reset password page
    
     @tag37_Reset_Password
  Scenario Outline: Verify  text in the page
    Given Admin is in login page
    When  Admin clicks reset password link
    Then  Admin should see correct spellings in all fields 
    
     @tag38_Reset_Password
  Scenario Outline: Verify submit button is present
    Given Admin is in login page
    When  Admin clicks reset password link
    Then  Admin should see "submit"  button
    
     @tag39
  Scenario Outline: Verify the alignment of the  submit button
    Given Admin is in login page
    When  Admin clicks reset password link
    Then  Admin should see submit button in center of the page
    
      @tag40
  Scenario Outline: Verify text box is present is the page
    Given Admin is in login page
    When  Admin clicks reset password link
    Then  Admin should see two text box
    
     @tag41
  Scenario Outline: Verify first label text
    Given Admin is in login page
    When  Admin clicks reset password link
    Then  Admin should see "Type in new password" in the first label text
    
    @tag42
  Scenario Outline: Verify second label text
    Given Admin is in login page
    When  Admin clicks reset password link
    Then  Admin should see "Retype password" in the second label text
    
     @tag43
  Scenario Outline: verify text box is in disabled
    Given Admin is in login page
    When  Admin clicks reset password link
    Then  Admin should see text box in disabled state
    
     
     @tag44
  Scenario Outline: verify text box is in enabled in new password field
    Given Admin reset password page
    When  Admin clicks on type in new password field
    Then  Admin should see text box is enabled state
    
     @tag45
  Scenario Outline: verify text box is in enabled in retype password field
    Given Admin reset password page
    When  Admin clicks on retype password field
    Then  Admin should see text box is enabled state
    
     @tag46
  Scenario Outline: Validate reset password with valid details
    Given Admin reset password page
    When  Admin enters same password on both field and clicks submit button
    Then  Admin should recieve  : "Your password has been reset". Please click here to login
    
     @tag47
  Scenario Outline: Validate reset password with invalid details
    Given Admin reset password page
    When  Admin enters same password on both field with invalid details and clicks submit button
    Then  Error message " Please try agin"
    
     @tag48
  Scenario Outline: Validate reset password with empty details
    Given Admin reset password page
    When  Admin enters  empty details on both fieldand clicks submit button
    Then  Error message " Please try agin"
    
     @tag49
  Scenario Outline: Validate reset password mismatch values
    Given Admin reset password page
    When  Admin enters  mismatch values and clicks submit button
    Then  Error message " Please try agin"
    
    
    
    
    
    
    
    
    
    
    
    
    
    																
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      