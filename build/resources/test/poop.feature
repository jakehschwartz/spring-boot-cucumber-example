Feature: the poop can be retrieved
  Scenario: client makes call to GET /poop
    When the client calls /poop
    Then the client receives status code of 200
    And the client receives server version poop