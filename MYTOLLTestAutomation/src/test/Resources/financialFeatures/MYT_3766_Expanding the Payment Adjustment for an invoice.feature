@tag
Feature: MYT-3766 Expanding the Payment Adjustment for an invoice

  Background: 
    Given User is Registered in MyToll and user has full financial access

  @tag1
  Scenario: User wants to expand the payment adjustments in an invoice in TDF
     When User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |        614060 |
    When User selects Search Type as below
      | SearchType |
      | Invoice    |
    When User enters Invoice number for search
      | Search Invoice number |
      |               3598970 |
    And User clicks on Search
    Then User be able to view Invoice details as below
      | InvoiceDate      | InvoiceNumber | DueDate          | Chargeamount | Paid  | Outstanding |
      | Sun, 22 Jan 2017 |       3598970 | Sun, 29 Jan 2017 | $9683.37      | $9683.37 | $0.00     |
    When User clicks on an invoice to view invoice details
    Then User be able to view Invoice details in the invoice summary screen
      | TollCarrier              | Date             | InvoiceNumber   | DueDate          | Chargeamount | Paid  | Outstanding | AccountNumber | OutstandingHeader | NumberOfResults |
      | Intermodal | Sun, 22 Jan 2017 | INVOICE 3598970 | Sun, 29 Jan 2017 | $9683.37      | $9683.37 | $0.00     |        614060 | OUTSTANDING       |             6 |
    When User expands the Outstanding
     When User clicks on following Consignment
     |Consignment| 
     |6014841|
    When User expands the Payment Adjustments section
    |PaymentAdjustments|
    | PAYMENT ADJUSTMENTS|
    Then User can view following details
      | Date | Reference No1 |Reference No2| Note | Amount1 |Amount2|
      |      |      234567        | 4561234 |    |    $ 745.36    |$ 745.37|
