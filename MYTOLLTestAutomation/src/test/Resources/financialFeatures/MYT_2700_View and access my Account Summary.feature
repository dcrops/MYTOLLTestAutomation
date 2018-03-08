@tag
Feature: MYT_2700 View and access my Account Summary

  Background: 
   Given User is Registered in MyToll and user has full financial access

  @tag1
  Scenario: User wants to view and access Account Summary in TDF
    Given User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects Financials or Accounts summary
    Then User be able to view below details
      | TollCarrier              | AccountNumber | Total Due | 30Days  | 60Days  | 90Days  | 120Days  |
      | Intermodal & Specialised |               | CURRENT   | 30 DAYS | 60 DAYS | 90 DAYS | 120 DAYS |

  @tag2
  Scenario: User wants to view and access Account Summary in PRIO
    Given User selects below Toll carrier and the account that has full financial access
      | TollCarrier         | AccountNumber |
      | Toll Priority (Aus) |        401509 |
    Then User be able to search invoices using following deatils
      | InvoiceSearchHeading  | DateRangeHeading |
      | Search invoice number | Date range       |
    When User enters Search Invoice number and Date range
      | Search Invoice number | Date range from | Date range to |
      | abc                   | 01 Jan 2018     | 30 Jan 2018   |
    And User clicks on Search
    Then User be able to view Recent Invoices and Invoice Download

  @tag3
  Scenario: User wants to view and access Account Summary in Toll IPEC
    Given User selects below Toll carrier and the account that has full financial access
      | TollCarrier         | AccountNumber |
      | Toll IPEC |        401509 |
    Then User be able to enter Invoice Number and actual date of invoice
      | Invoice Number | DateOfInvoice |
      | abc123         | 2 Jan 2018    |
    And User clicks on Download Results
    Then User be able to view Download results as follow
      | File | Status | Size | Created |
      |      | Ready  |      |         |
    And User clicks on Delete
