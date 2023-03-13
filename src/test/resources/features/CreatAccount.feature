
Feature: As a user, I can create an account
  Background:
    Given user in on home page

  @Regression
     Scenario: 001 Verify the user can create an account
       When user click on create an account button
       And  user enter first name in the First Name Box
       And  user enter last name in the Last Name Box
       And  user enter email in the Email box
       And  user enter password in the Password Box
       And  user enter password in the Password Confirmation Box
       And  user click on Creat an Account Confirmation button
       Then user be able to the message "logged-in"

  @MultipleAccounts
    Scenario Outline: 002 Create multiple accounts
      When user click on create an account button
      And user enter "<FirstName>" in the First Name Box
      And user enter "<lastName>" in the Last Name Box
      And use enter "<Email>" in the Email Box
      And user enter "<Password>" in the Password box
      And user enter "<Password>" in the Password Confirmation box
      And user click on Creat an Account Confirmation button
      And user be able to the message "logged-in"
      Then user click on log-out button


      Examples:
        | FirstName | lastName | Email | Password |
        |  Sam01 | Adam01 |sam01@gmail.com|Test123456|
        |  Sam02 | Adam02 |sam02@gmail.com|Test123456|
        |  Sam03 | Adam03 |sam03@gmail.com|Test123456|
        |  Sam04 | Adam04 |sam04f@gmail.com|Test123456|
        |  Sam05 | Adam05 |sam05f@gmail.com|Test123456|



@wip01
  Scenario: 003 Verify the Email box can differentiate a proper email format
    When user click on create an account button
    And  user enter first name in the First Name Box
    And  user enter last name in the Last Name Box
    And  user enter an invalid email format
    And  user enter password in the Password Box
    And  user enter password in the Password Confirmation Box
    And  user click on Creat an Account Confirmation button
    Then user should be able to see an error message "Please enter a valid email address (Ex: johndoe@domain.com)"

  @wip02
  Scenario: 004 Verify the Password Confirmation Box can differentiate the dissimilar password
    When user click on create an account button
    And  user enter first name in the First Name Box
    And  user enter last name in the Last Name Box
    And  user enter email in the Email box
    And  user enter password in the Password Box
    And  user enter dissimilar password in the Password Confirmation Box
    And  user click on Creat an Account Confirmation button
    Then user should be able to see an error message in the Password Confirmation Box "Please enter the same value again."
