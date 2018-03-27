@tag
Feature: MYT-3766 Expanding the Payment Adjustment for an invoice

  Background: 
    Given User is Registered in MyToll and user has full financial access

  @tag1
  Scenario: User wants to expand the payment adjustments in an invoice in TDF
     When User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |        137289 |
    When User selects Search Type as below
      | SearchType |
      | Invoice    |
    When User enters Invoice number for search
      | Search Invoice number |
      |               3873939 |
    And User clicks on Search
    Then User be able to view Invoice details as below
      | InvoiceDate      | InvoiceNumber | DueDate          | Chargeamount | Paid  | Outstanding |
      | Sun, 24 Dec 2017 |       3873939 | Tue, 23 Jan 2018 | $2198.68      | $2198.68 | $0.00     |
    When User clicks on an invoice to view invoice details
    Then User be able to view Invoice details in the invoice summary screen
      | TollCarrier              | Date             | InvoiceNumber   | DueDate          | Chargeamount | Paid  | Outstanding | AccountNumber | OutstandingHeader | NumberOfResults |
      | Intermodal & Specialised | Sun, 24 Dec 2017 | INVOICE 3873939 | Tue, 23 Jan 2018 | $2198.68      | $2198.68 | $0.00     |        137289 | OUTSTANDING       |              29 |
    When User expands the Outstanding
     When User clicks on following Consignment
     |Consignment| 
     |2868570961|
    When User expands the Payment Adjustments section
    Then User can view following details
      | Date | Reference No | Note | Amount |
      |      |              |      |        |
