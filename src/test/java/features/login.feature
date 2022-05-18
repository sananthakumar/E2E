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
@tag
Feature: Login to Application Flipkart
  

  @tag1
  Scenario: Positive test validtaing login 
    Given Initialize the browser with the "chrome"
    And Navigate to "https://www.flipkart.com/" site
    And Click on login button in homepage to land on login page
    When user enters "9994704312" and "Ananth@123" and click login
    Then Validate the user is successfully logged in

