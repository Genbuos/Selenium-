Feature: Rahul Shetty Academy - Sign up page

  Scenario: Validate Successful Login
    Given I access the Academy's page
    When I enter an username
    And I enter  a password
    And I click the submit button
    Then I should be presented with a successful Signed in message