@Regression @Smoke
Feature: Create Account functionality

  Background:
    Given Click on Create Primary Account Button


  Scenario: Create Account form page validate Form Title as Expected
    Then Validate Create Primary Account Holder is exist


    Scenario: Creating an Account on the Primary Account Holder
      When Fill Create Account form "random@gmail.com" "Mujibullah" "Student" "Hafizi" "12/11/2005"
      And Select Gender "Male"
      And Select Title "Mr."
      And Select Marital Status "Single"
      And Click on Create Account Button
      Then Validate "random@gmail.com" on Sign up Page shows as expected


  Scenario: Create account with existing email address and validate error message
        When Fill Create Account form "Mujibullah01@gmail.com" "Mujibullah" "Student" "Hafizi" "12/11/2001"
        And Select Gender "Male"
        And Select Title "Mr."
        And Select Marital Status "Single"
        And Click on Create Account Button
        Then Validate error message "ERROR Account with email Mujibullah01@gmail.com is exist"





