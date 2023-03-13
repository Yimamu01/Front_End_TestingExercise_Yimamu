
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
      And  user enter "<Password>" in the Password Confirmation box
      And user click on Creat an Account Confirmation button
      Then user be able to the message "logged-in"

      Examples:
        | FirstName | lastName | Email | Password |
        |  John01 | Max01 | Max01@gmail.com|Test123456|
        |  John02 | Max02 | Max02@gmail.com|Test123456|
        |  John03 | Max03 | Max03@gmail.com|Test123456|
        |  John04 | Max04 | Max04@gmail.com|Test123456|
        |  John05 | Max05 | Max05@gmail.com|Test123456|
        |  John06 | Max06 | Max06@gmail.com|Test123456|
        |  John07 | Max07 | Max07@gmail.com|Test123456|


  Scenario: 003 Verify the Email box can differentiate a proper email format
    When user click on create an account button
    And  user enter first name in the First Name Box
    And  user enter last name in the Last Name Box
    And  user enter an invalid email format
    And  user enter password in the Password Box
    And  user enter password in the Password Confirmation Box
    And  user click on Creat an Account Confirmation button
    Then user should be able to see an error message "Please enter a valid email address (Ex: johndoe@domain.com)"

  @wip
  Scenario: 004 Verify the Password Confirmation Box can differentiate the dissimilar password
    When user click on create an account button
    And  user enter first name in the First Name Box
    And  user enter last name in the Last Name Box
    And  user enter an invalid email format
    And  user enter password in the Password Box
    And  user enter dissimilar password in the Password Confirmation Box
    And  user click on Creat an Account Confirmation button
    Then user should be able to see an error message in the Password Confirmation Box "Please enter the same value again."
