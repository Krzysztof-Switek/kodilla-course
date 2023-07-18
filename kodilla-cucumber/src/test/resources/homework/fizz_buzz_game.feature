
Feature: FizzBuzz Game

  Scenario Outline: FizzBuzz game returns correct text based on input number
    Given the FizzBuzz game is available
    When the number <input> is provided
    Then the game should return "<expected_output>"

    Examples:
      | input | expected_output |
      | 3     | Fizz            |
      | 5     | Buzz            |
      | 15    | FizzBuzz        |
      | 7     | None            |
      | 30    | FizzBuzz        |
