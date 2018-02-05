@tag
Feature: MYT_6298 Toll Mining Services Financials

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User has full financial access and wants to select Account Summary or My Financials
    Given User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Toll Mining Services |               |
    When User selects Financials or Accounts summary
    And User selects view invoice details for my account
    Then User be able to see My Invoice details
      | ScreenHeading |
      | My Invoices   |
    Then User be able to see Account summary is displaying following details
      | TollCarrier              | AccountNumber |
      | Toll Mining Services |               |

  @tag3
  Scenario: User doesn't have full financial access and not be able to select Financials or Accounts summary
    Given User doesn't have full financial access to at least one account
    Then User must not be able to select Financials or Accounts summary
    And User must not be able to view invoice details for any account