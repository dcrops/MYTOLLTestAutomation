@tag
Feature: MYT-3766 Expanding the Payment Adjustment for an invoice

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User wants to expand the payment adjustments in an invoice in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice to view invoice details
    And User expands a Shipment
    When User expands the Outstanding
    When User expands the Payment Adjustments section
    Then User can view following details
      | Date | Reference No | Note | Amount |
      |      |              |      |        |
