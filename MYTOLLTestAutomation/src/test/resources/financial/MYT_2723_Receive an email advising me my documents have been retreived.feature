@tag
Feature: MYT-2723 Receive an email advising me my documents have been retreived

  Background: 
    Given User is Registered in MyToll

     @tag1
  Scenario: User receives an email advising my documents have been retrieved in TDF
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    When User selects Printed Invoice as the document to download
    When User selects Download Simple Spreadsheet
    When User receives an email request advising the file has been downloaded
    When User logs back into My Invoices screen
    Then User must see the zip file of the documents user requested is displayed
    When User selects my zip file to open
    Then User can open all the documents
    
       @tag1
  Scenario: User receives an email advising my documents have been retrieved in Prio
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Toll Priority (Aus) |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    When User selects Printed Invoice as the document to download
    When User selects Download Simple Spreadsheet
    When User receives an email request advising the file has been downloaded
    When User logs back into My Invoices screen
    Then User must see the zip file of the documents user requested is displayed
    When User selects my zip file to open
    Then User can open all the documents
    
       @tag1
  Scenario: User receives an email advising my documents have been retrieved in Toll IPEC
    Given User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountNumber |
      | Toll IPEC |               |
    When User selects status as All
    And User clicks on Search
    When User clicks on an invoice
    When User selects Printed Invoice as the document to download
    When User selects Download Simple Spreadsheet
    When User receives an email request advising the file has been downloaded
    When User logs back into My Invoices screen
    Then User must see the zip file of the documents user requested is displayed
    When User selects my zip file to open
    Then User can open all the documents