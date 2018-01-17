@tag
Feature: MYT-3767 Expanding the Payments for an invoice

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User wants to expand the payment in an invoice in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice to view invoice details
    And User expands a Shipment
    When User expands the Payments
    Then User must see following details
      | Cheque number | Payment Date | Account No | Invoice Number | Invoice date | Amount Paid |
      |               |              |            |                |              |             |

  @tag1
  Scenario: User wants to expand the line/item in payment in an invoice in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice to view invoice details
    And User expands a Shipment
    When User expands the Payments
    And User expands a payment line/item
    Then User be able to view following shipment details
      | Reference | DispatchDate | ChargeAmount | BillingCode | DeliveryDate | CubicMetres/Volume | DeclaredWeight | ChargeWeight | ChargeItems | Service |
    Then User be able to see more details of shipment
      | SenderCompany | SenderSuburb | SenderState | ReceiverCompany | ReceiverSuburb | ReceiverState | DebtorCompany | DebtorSuburb | DebtorState |
    Then User must see following fields
      | ChargesHeading | PaymentAdjustmentHeading |
      | Charges        | Payment Adjustment       |
      When User selects to view full shipment details
      Then User must be taken to the Track and trace screen for this shipment
      When User finishes viewing shipment information
      Then User be able to go back to My Invoices screen
