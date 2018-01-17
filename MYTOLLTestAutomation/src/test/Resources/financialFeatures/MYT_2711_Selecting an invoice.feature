@tag
Feature: MYT_2711 Selecting an invoice

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User wants to view all the details in the invoice in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as Outstanding
    And User clicks on Search
    When User clicks on an invoice to view invoice details
    Then User be able to view following details in invoice details screen.
      | InvoiceNumber | Carrier                  | Account Number | Date issued | ChargeAmount  | PaidAmount | Outstanding |
      | Invoice 123   | Intermodal & Specialised |                |             | Charge amount | Paid       | Outstanding |
    And User be able to see two sections in the invoice details screen as "OUTSTANDING" and "PAYMENTS".
    When User selects Outstanding
    Then User see all the outstanding shipments relating to this invoice
      | ShipmentID  | ChargeAmount  | Outstanding | Download                |
      | Shipment id | Charge Amount | Outstanding | View shipment documents |
    And User expand the line
    When User selects Payments
    Then User see all the shipments relating to this invoice
      | ShipmentID  | ChargeAmount  | Outstanding | Download                |
      | Shipment id | Charge Amount | Outstanding | View shipment documents |
    And User expand the line
    When User clicks Back button
    Then User navigates back to My Invoices Screen
      | ScreenHeading |
      | My Invoices   |
