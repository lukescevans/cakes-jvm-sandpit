Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I eat 2 cukes
    Then I should have 44 cukes in my belly

  Scenario: enter search term
    Given I am on the Home page
    When I search for the search term "Honda Civic"
    Then the page title should contain "Gumtree"
