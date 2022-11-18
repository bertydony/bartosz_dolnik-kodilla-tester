Feature: Fizz Buzz. This is a Fizz Buzz game.

  Scenario Outline: When number is divide by 3 say "Fizz", when by 5 says "Buzz", by both say "Fizz Buzz", in other
  case says "None".

    Given given number is <number>
    When When is not 'None' make action
    Then Is given <answer>
    Examples:
      | number | answer      |
      | 3      | "Fizz"      |
      | 5      | "Buzz"      |
      | 15     | "Fizz Buzz" |
      | 20     | "Buzz"      |
      | 45     | "Fizz Buzz" |
      | 63     | "Fizz"      |
      | 2      | "None"      |


