Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $<request>
    Then $<dispensed> should be dispensed
    Examples:
      | request | dispensed |
      | 30      | 30        |
      | 0       | 0         |
      | -1      | 0         |
      | 1000    | 1000      |

