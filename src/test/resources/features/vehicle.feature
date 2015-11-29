Feature: Vehicle

  Scenario: a vehicle is created
    Given a new vehicle is created
    And there is no fuel in the tank
    When I fill up the tank
    Then the vehicles tank is full

  Scenario: a vehicle is created and accelerates
    Given a new vehicle is created
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

  Scenario: a vehicle is created and breaks down
    Given a new vehicle is created
    When I accelerate 3000mph
    When the engine warning light comes on
    Then the vehicle is broken down
    Then the vehicles speed is 0mph

  Scenario: a vehicle gets a new mot
    Given a new vehicle is created
    When my car passes the MOT
    Then I get an MOT Number