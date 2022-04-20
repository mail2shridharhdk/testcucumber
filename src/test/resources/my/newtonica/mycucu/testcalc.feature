Feature: I want to do Math calculation


Scenario: Add 100
 Given User has a calculator
 When user adds 100
 Then result must be 100
 
 Scenario: Add 200
 Given User has a calculator
 When user adds 200
 Then result must be 200
 
 
 Scenario: substract
 Given User has a calculator
 When user substract 200 and 100
 Then result substracted must be 100
 