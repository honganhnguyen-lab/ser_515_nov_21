Feature: Compute a Square
  As a user
  I want to compute a square function
  So that I can get my ICA credit!

  Scenario: Compute a value when input is negative and output is positive
    Given I have an integer square "-5"
    When I compute the square function of this number
    Then I should return a positive number after square

  Scenario: Compute a value when both are positive
    Given I have an integer square "4"
    When I compute the square function of this number
    Then I should return a positive number after square

