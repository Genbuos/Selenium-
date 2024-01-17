Feature: WebDriver University - Contact us page

  Scenario: Validate successful submission
    Given I access the webdriver university contact page
    When I enter a first name
    And I enter a last name
    And I enter a email address
    And I enter a comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message