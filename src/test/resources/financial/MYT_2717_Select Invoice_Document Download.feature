@tag
Feature: MYT-2717 Select Invoice/Document Download

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User wants to select Invoice/Document Download in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    Then User must see Invoice/Document Download is enabled
    When User selects Download Invoice
    Then User must see the following selections
      | Invoice Imaged | Consignment Note | Finance Connote | POD | Simple Spreadsheet | Detailed Spreadsheet |

  @tag2
  Scenario: User wants to select Invoice/Document Download in Prio
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier         | AccountNumber |
      | Toll Priority (AUS) |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    Then User must see Invoice/Document Download is enabled
    When User selects Download Invoice
    Then User must see the following selections
      | Invoice Imaged | Consignment Note | Finance Connote | POD | Simple Spreadsheet | Detailed Spreadsheet |

  @tag3
  Scenario: User wants to select Invoice/Document Download in IPEC
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier | AccountNumber |
      | Toll IPEC   |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    Then User must see Invoice/Document Download is enabled
    When User selects Download Invoice
    Then User must not see Download popup
