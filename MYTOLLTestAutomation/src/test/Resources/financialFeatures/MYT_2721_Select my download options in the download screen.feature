@tag
Feature: MYT-2721 Select my download options in the download screen

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User selects my download option as Simple Spreadsheet in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    When User selects Printed Invoice as the document to download
    When User selects Download Simple Spreadsheet
    Then User must receive the Spreadsheet of the invoice data
      | BU | Account | Invoice | Invoice Date | Due Date | Type | Date | Connote/Transaction | Customer Ref | Sender | Sender Suburb | Receiver | Receiver Suburb | Description | Items | Weight kgs | Declared weight | Volume | Declared Volume | Charge | GST | Charge + GST |

  @tag1
  Scenario: User selects my download option as Detailed Spreadsheet in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    When User selects Printed Invoice as the document to download
    When User selects Download Detailed Spreadsheet
    Then User must receive the Spreadsheet of the invoice data
      | Basic Charge | Freight Charge | Fuel Charge | Connote Fee | Rate type | Service | Mode | Origin | destination | commoddity | full load | Min Amount$ | Max Amount $ | UOM qty/UOM | Break total charge |

  @tag1
  Scenario: User selects my download option as Consignment Note Images (Finance) in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    When User selects Consignment Note Images (Finance) to download
    Then User must receive the Consignment note

  @tag1
  Scenario: User selects my download option as Consignment Note Images (Finance) in Toll Prio
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier   | AccountNumber |
      | Toll Priority |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    When User selects Consignment Note Images (Finance) to download
    Then User must receive the Consignment note

  @tag1
  Scenario: User selects my download option as select POD Images in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    When User selects  POD Images to download
    Then User must receive the POD as the document in the download

  @tag1
  Scenario: User selects my download option as select POD Images in Toll Prio
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier   | AccountNumber |
      | Toll Priority |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    When User selects select select POD Images to download
    Then User must receive the POD as the document in the download
