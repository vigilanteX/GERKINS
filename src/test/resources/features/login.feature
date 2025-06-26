Feature: This is a login feature


  Scenario: Success login with valid credentials
    Given User is on login page
    When User enter credentails correctly and submit
    Then User should land on dashboard