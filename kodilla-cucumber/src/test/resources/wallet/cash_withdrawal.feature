Feature: Cash Withdrawl
  Scenario: Successful withdraw from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Successful withdraw from a wallet with exact amount
    Given I have deposited $100 in my wallet
    When I request $100
    Then $100 should be dispensed

  Scenario: Unsuccessful withdraw from an empty wallet
    Given my wallet is empty
    When I request $50
    Then the withdrawal should be declined
    And the wallet balance should remain $0


