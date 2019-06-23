#Author: syntax
Feature: Add Employee

Background:
Given I logged in into OrangeHRM
And I click on PIM link
And I click on  Add Employee link

@smoke @addEmployee
Scenario Outline: Valid Add Employee

And I provide "<FirstName>", "<MiddleName>", "<LastName>" and "<Location>"
And I click on save button
Then I see "<FirstName>", "<LastName>" is displayed
Examples:
|FirstName|MiddleName|LastName|Location    |
|Jane     |J         |Smith   |Smart Office|
|James    |S         |West    |Tech Office |
|Jackie   |N         |Eats    |HQ          |

@regression
Scenario: Add Employee and Create Login Details
When I provide employee details from "EmployeeDetails"
And I click on create login details
And I provide all mandatory fileds
And I click on save button
And I see employee is added succesfully

@regression
Scenario: Add Employee Label Verification
Then I see following labels
|First Name |
|Middle Name|
|Last Name  |
|Employee Id|
|Location   |
|Create Login Details|


