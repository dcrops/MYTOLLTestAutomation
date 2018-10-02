@tag
Feature: MYT-2704 View my current invoices

  Background: 
    Given User is Registered in MyToll and user has full financial access

  @tag1
  Scenario: User wants to view my current trial balance in TDF
    Given User selects below Toll carrier and the account number that has full financial access
      | TollCarrier            | AccountNumber                |
      | Toll Energy and Marine |  G28406 |
    When User selects Search Type as below
      | SearchType |
      | Invoice    |
    When User enters Search Invoice number for TE
      | Search Invoice number |
      |                36540 |
    And User clicks on Search
    When User clicks on Account Summary to view trial balance
    Then User be able to see all my invoices display for the current period
      | InvoiceNumber |
      |               |
    Then User be able to view following heading details in  Current Trial Balance screen.
      | DateOfInvoice | InvoiceNumber  | ChargeAmount  | PaidAmount | Outstanding |
      | Invoice date  | Invoice number | Charge amount | Paid       | Outstanding |
    And User be able to see "Total Invoices" and "Total Amount Due" for all invoices listed.
    When User clicks on Ascending
    Then Current invoices should be sorted in ascending order
    When User clicks on Descending
    Then Current invoices should be sorted in descending order
	Then User Closes the Browser