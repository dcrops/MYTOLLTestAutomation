@tag
Feature: MYT-2709 View my 90 day trial balance

  Background: 
    Given User is Registered in MyToll


  @tag1
  Scenario: User wants to view my 90 days trial balance in TDF
    Given User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as Outstanding
    And User clicks on Search
    When User clicks on Current invoices to view Current trial balance
    Then User be able to see all my invoices display for the current period
    Then User be able to view following heading details in  Current Trial Balance screen.
      | DateOfInvoice | InvoiceNumber  | ChargeAmount  | PaidAmount | Outstanding |
      | Invoice date  | Invoice number | Charge amount | Paid       | Outstanding |
    And User be able to see "Total Invoices" and "Total Amount Due" for all invoices listed.
    When User clicks on Ascending
    Then Current invoices should be sorted in ascending order
    When User clicks on Descending
    Then Current invoices should be sorted in descending order
