Feature: Vehicle

  Scenario: a vehicle is created
    Given a new vehicle is created
    And there is no fuel in the tank
    When I fill up the tank
    Then the vehicles tank is full

  Scenario: a vehicle is created and accelerates
    Given a new vehicle is created
    And I fill up the tank
    When I accelerate 100mph
    Then the vehicles speed is 100mph

  Scenario: a vehicle is created and decelerates
    Given a new vehicle is created
    When I accelerate 100mph
    Then the vehicles speed is 100mph
    When I decelerate 100mph
    Then the vehicles speed is 0mph

  Scenario: a vehicle is created, accelerates then decelerates
    Given a new vehicle is created
    When I accelerate 10mph
    Then the vehicles speed is 10mph
    When I decelerate 5mph
    Then the vehicles speed is 5mph

  Scenario: a vehicle is created, cannot decelerate below 0mph
    Given a new vehicle is created
    When I accelerate 10mph
    Then the vehicles speed is 10mph
    When I decelerate 10mph
    Then the vehicles speed is 0mph

  Scenario: a vehicle is created and breaks down
    Given a new vehicle is created
    When I accelerate 3000mph
    When the engine warning light comes on
    Then the vehicle is broken down
    Then the vehicles speed is 0mph

  Scenario: a vehicle is created and breaks down, then its fixed
    Given a new vehicle is created
    When I accelerate 3000mph
    When the engine warning light comes on
    Then the vehicle is broken down
    Then the vehicles speed is 0mph
    When the vehicle is fixed
    Then the engine warning light goes out

  Scenario: a vehicle gets a new mot
    Given a new vehicle is created
    When my car passes the MOT
    Then I get an MOT Number

  Scenario: a vehicle fails an mot
    Given a new vehicle is created
    When my car fails the MOT
    Then I get do not get an MOT Number

  Scenario Outline: a vehicle is created and accelerates
    Given a new vehicle is created
    And I fill up the tank
    When I accelerate <accelerate>mph
    Then the vehicles speed is <speed>mph

    Examples:
      | accelerate | speed |
      | 100        | 100   |
      | 0          | 0     |