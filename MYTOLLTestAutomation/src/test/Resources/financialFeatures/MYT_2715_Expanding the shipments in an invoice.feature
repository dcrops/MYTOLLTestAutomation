@tag
Feature: MYT-2715 Expanding the shipments in an invoice

  Background: 
    Given User is Registered in MyToll

  Scenario: User wants to expand the invoice to view and access my connotes for the invoice in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice to view invoice details
		And User expand a Shipment
		When User expands the Outstanding
		Then User be able to view following shipment details
		|Reference|DispatchDate|ChargeAmount|BillingCode|DeliveryDate|CubicMetres/Volume|DeclaredWeight|ChargeWeight|ChargeItems|Service|
		Then User be able to see more details of shipment
		|SenderCompany|SenderSuburb|SenderState|ReceiverCompany|ReceiverSuburb|ReceiverState|DebtorCompany|DebtorSuburb|DebtorState|
		Then User must see following fields
		|ChargesHeading|PaymentAdjustmentHeading|
		|Charges|Payment Adjustment|