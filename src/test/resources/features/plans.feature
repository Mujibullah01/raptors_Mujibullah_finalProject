@Regression
Feature: Plans page validation

Background:
  Given Click on Login Button
  When Enter UserName Value "supervisor" and Password value "tek_supervisor"
  And Click on Sign In Button
  And Click on Plans Button

  Scenario: Validate 4 row of data in Plans page.
    When Validate all four rows


  Scenario: Validate Create Date is today's date in (EST Time zone) and Date Expire is a day after
    Then Validate create date is today's date
    Then Validate expire date is day after