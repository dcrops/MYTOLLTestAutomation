@tag
Feature: MYT_2700 View and access my Account Summary

  Background: 
    Given User is Registered in MyToll and user has full financial access

  @tag1
  Scenario: User wants to view and access Account Summary in TDF
    When User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |        137289 |
    When User selects Search Type as below
      | SearchType |
      | Invoice    |
    Then User be able to view below details
      | TollCarrier              | AccountNumber | Total Due | 30Days  | 60Days  | 90Days  | 120Days    | Total ChargeAmount          |
      | Intermodal & Specialised |        137289 | CURRENT   | 30 DAYS | 60 DAYS | 90 DAYS | 120 DAYS + | TOTAL CHARGE AMOUNT$5464.56 |

  @tag2
  Scenario: User wants to view and access Account Summary in PRIO
    Given User selects below Toll carrier and the account that has full financial access
      | TollCarrier         | AccountNumber |
      | Toll Priority (Aus) | 0007CDS       |
    Then User be able to search invoices using following deatils
      | InvoiceSearchHeading | DateRangeHeading |
      | Invoice              | Date range       |
    When User enters Search Invoice number
      | Search Invoice number |
      | P60575241             |
    And User clicks on Search
    Then User be able to view Recent Invoice and Invoice Download
      | InvoiceDate      | InvoiceNumber | Chargeamount | ShipmentsView | Download |
      | Fri, 24 Nov 2017 | P60575241     | $1222.50     | View          | Download |
    When User selects Search Invoice by Date range
    And User clicks on Search
    Then User be able to view Recent Invoices and Invoice Download
      | InvoiceDate      | InvoiceNumber | Chargeamount | ShipmentsView | Download |
      | Fri, 24 Nov 2017 | P60575241     | $1222.50     | View          | Download |

  @tag3
  Scenario: User wants to view and access Account Summary in Toll IPEC
    Given User selects below Toll carrier and the account that has full financial access
      | TollCarrier | AccountNumber |
      | Toll IPEC   | NA4271        |
    Then User be able to enter Invoice Number for download
      | Invoice Number |
      |           0594 |
    And User clicks on Download Results
    Then User Can see download successful message
      | Message                                 |
      | Download request submitted successfully |
    And User clicks on Delete
    Then User be able to view Download results as follow
      | FileName             | Status      | Size |
      | IPEC_NA4271_0594.zip | In Progress | NA   |
