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
    When Admin clicks Login "<data>" button
    Then verify "<output>" admin landed page
      | data              | output                     |
      | Loginpage_valid   | Admin landed on Right page |
      | LoginPage_Invalid | HTTP response >=400        |

  @tag2
  Scenario Outline: Verify the header of the login page
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see "<output>" in the header
      | data             | output                          |
      | Loginpage_header | Please login to LMS application |
      | Loginpage_text   | Please login to LMS application |

  @tag3
  Scenario Outline: Verify text field is present
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see two text field

  @tag6
  Scenario Outline: Verify text on the first text field
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should "user" in the first text field and "asterik" symbol

  @tag7
  Scenario Outline: Verify text on the second text field
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should "password" in the second text field and "asterik" symbol

  @tag8
  Scenario Outline: Verify the alignment input field for the login
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see input field on the centre of the page

  @tag9
  Scenario Outline: verify Login is present
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see login button

  @tag10
  Scenario Outline: Verify the alignment of the login button
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see login button on the centre of the page

  @tag11
  Scenario Outline: Verify forgot username/password  and Reset password link
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see forgot username/password  and Reset password link

  @tag12
  Scenario Outline: Verify input descriptive test in user and password field
    Given Admin is in home page
    When Admin clicks Login button
    Then Admin should see user and password in gray color

  @tag13
  Scenario Outline: Validate login with credentials
    Given Admin is in home page
    When Admin enter "<sheetName>" credentials  and clicks login button
    Then Admin should land on dashboard page "<datakey>"
      | sheetName                | datakey                 |
      | LoginPage                | Login_validcrediential  |
      | LoginPage                | Login_InvalidCrediential|
      | LoginPage                | Login_onlyuser          |
      | LoginPage                | Login_onlypswd          |
      | LoginPage                | Login_blank             |
      | LoginPage                | Login_blankpswd         |

  @tag14
  Scenario Outline: verify login button action through keyboard
    Given Admin is in home page
    When Admin enter valid credentials  and clicks login button through keyboard
    Then Admin should land on dashboard page

  @tag15
  Scenario Outline: verify login button action through mouse
    Given Admin is in home page
    When Admin enter valid credentials  and clicks login button through mouse
    Then Admin should land on dashboard page

  @tag16_ForgotUsername/password_1
  Scenario Outline: Verify forgot username or password link
    Given Admin is in login page
    When Admin clicks  forgot username or password link
    Then Admin should land on "<Message>" forgot username or password page
      | Link                  | Message                    |
      | ForgotUsernamelink    | Admin landed on forgot username or password link|
      | ForgotUsernamebroken  | HTTP response >=400        |

  @tag17
  Scenario Outline: verify input descriptive text for Email
    Given Admin is in login page
    When Admin clicks forgot username or password link
    Then Admin should see "Email" text in gray color and text field with asterik

  @tag18
  Scenario Outline: Verify send link button is present
    Given Admin is in login page
    When Admin clicks forgot username or password link
    Then Admin should see "send Link"  button

  @tag19
  Scenario Outline: Verify text spelling
    Given Admin is in login page
    When Admin clicks forgot username or password link
    Then Admin should see correct spellings in all fields

  @tag20
  Scenario Outline: Verify the alignment of the send link button
    Given Admin is in login page
    When Admin clicks forgot username or password link
    Then Admin should see send link button in center of the page

  @tag21
  Scenario Outline: Validate email sent for forgot password
    Given Admin is in forgot username and password page
    When Admin enters valid email id and clicks send link button
    Then Admin should receive link in mail for reset username / password

  @tag22
  Scenario Outline: Validate email sent for forgot password with invalid email id
    Given Admin is in forgot username and password page
    When Admin enters invalid email id and clicks send link button
    Then Admin should not receive link in mail for reset username / password

  @tag23_Reset_Password
  Scenario Outline: Verify  reset password link
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should land on reset password page

  @tag24_Reset_Password
  Scenario Outline: Verify  text in the page
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see correct spellings in all fields

  @tag25_Reset_Password
  Scenario Outline: Verify submit button is present
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see "submit"  button

  @tag26
  Scenario Outline: Verify the alignment of the  submit button
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see submit button in center of the page

  @tag27
  Scenario Outline: Verify text box is present is the page
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see two text box

  @tag28
  Scenario Outline: Verify first label text
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see "Type in new password" in the first label text

  @tag29
  Scenario Outline: Verify second label text
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see "Retype password" in the second label text

  @tag30
  Scenario Outline: verify text box is in disabled
    Given Admin is in login page
    When Admin clicks reset password link
    Then Admin should see text box in disabled state

  @tag31
  Scenario Outline: verify text box is in enabled in new password field
    Given Admin reset password page
    When Admin clicks on type in new password field
    Then Admin should see text box is enabled state

  @tag32
  Scenario Outline: verify text box is in enabled in retype password field
    Given Admin reset password page
    When Admin clicks on retype password field
    Then Admin should see text box is enabled state

  @tag33
  Scenario Outline: Validate reset password with scenario details
    Given Admin reset password page
    When Admin enters details and clicks submit button 
    Then Admin should recieve "<TypeNewpswd>","<Retypepswd>","<Message>" Please click here to login
      | Scenario |TypeNewpswd | Retypepswd | Message                      |
      | Valid    | Latha      | Latha123   | Your password has been reset |
      | Invalid  | Lathas     | Luck123    | Please try again             |
      | Blank    |            |            | Please try again             |
      | Mismatch | Luck123    | Latha      | Please try again             |
