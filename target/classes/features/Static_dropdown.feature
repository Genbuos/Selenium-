Feature: Select 3 adults and select done

  Scenario: Validate 3 adults selected and select done
    Given I access the spicejet page
    When I select the passenger drop down
    And I add to more adults
    And I click done
    Then I should should have 3 adults in the passenger div