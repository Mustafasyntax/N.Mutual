#Author:  syntax
@sprint3
Feature: Login
Background:
Given I see OrangeHRM logo

  @smoke @test
  Scenario: Valid Login
   
    When I enter valid username and password
    And I click login button
    Then I successfully logged in

  @regression 
  Scenario: Invalid login
 
    When I enter invalid username and password
    And I click login button
    Then I see error message is displayed
   @regression 
    Scenario: Error message validation
    When I enter invalid username and password I see errorMessage
    |UserName|Password  |ErrorMessage        |
    |Admin   |Admin123  |Invalid Credentials |
    |Admin1  |Syntax123!|Invalid Credentials1|
    
    
    
      
    
