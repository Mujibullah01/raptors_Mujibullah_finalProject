@Regression
Feature: Login Functionality
  Background:
    Given Click on Login Button


  Scenario: Login functionality with valid credential
    When Enter UserName Value "supervisor" and Password value "tek_supervisor"
    And Click on Sign In Button
    Then Validate user navigate to Customer Service Portal

@LoginInValid
  Scenario Outline: Negative Test. login functionality with invalid credential wrong username and valid password
    When Enter UserName Value "<username>" and Password value "<password>"
    And Click on Sign In Button
    Then Validate login error message "<errorMessage>"
    Examples:
      | username      | password           |errorMessage              |
      | Mujib         | tek_supervisor     |ERROR User Mujib not found|
      | supervisor    | WrongPassword      |ERROR Password not matched|
