Feature: Login page functionality

  Scenario Outline:User try different logins
    Given User is on new login page
    When User enters "<username>" and "<password>"
    Then User should be routed to dashboard

    Examples:
    |username|password|
    |aman    |asdf    |
    |slav    |xxxc    |
    |adarsh  |cvbnm   |


