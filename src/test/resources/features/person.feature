Feature: Person

  Scenario: a person called Luke exists
    Given I am born
    When my parents name me "Luke"
    Then I am called "Luke"
    And I am 0 years old
    And I have 5 cukes in my belly

  Scenario: a person called Luke Evans who is 35
    Given I am born
    When my parents name me "Luke" and I am 35 years old
    Then I am called "Luke"
    And I am 35 years old
    And I have 5 cukes in my belly
