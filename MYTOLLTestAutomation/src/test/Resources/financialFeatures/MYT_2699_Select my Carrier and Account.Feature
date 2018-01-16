@tag
Feature: MYT_2699 Select my Carrier and Account

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User wants to select my BU and my account
    Given User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects Financials or Accounts summary
    And User selects BU and Account Number as below
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    Then The screen needs to display the name of the Carrier and the Account Number.
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
      

  @tag2
  Scenario: User wants to select my BU and my account
    Given User selects below Toll carrier and the account that has full financial access
      | TollCarrier | AccountNumber |
      | Toll IPEC   |       2230899 |
    When User selects Financials or Accounts summary
    And User selects BU and Account Number as below
      | TollCarrier | AccountNumber |
      | Toll IPEC   |       2230899 |
    Then The screen needs to display the name of the Carrier and the Account Number.
      | TollCarrier | AccountNumber |
      | Toll IPEC   |       2230899 |
