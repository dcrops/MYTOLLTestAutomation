@tag
Feature: MYT-2775 Invoice Search

  Background: 
    Given User is Registered in MyToll

@tag1
  Scenario: User search Invoices for my Account in TDF
    When User selects following fields for search invoices in my account
      | TollCarrier              | AccountDetail | Type    | Status      |
      | Intermodal & Specialised |               | Invoice | Outstanding |
    And User keeps Date Range to current month
    And User clicks on Search
    Then User can see Invoice Search Results section display the entered fields
      | TollCarrier              | AccountDetail | Type    | Status      | DateRange |
      | Intermodal & Specialised |               | Invoice | Outstanding | Current   |
    Then User can see following details in search results
      | InvoiceDate | InvoiceNumber | DueDate | ChargeAmount | AmountDue | PaidAmount | NumberOfInvoices |

@tag1
  Scenario: User search Invoices for my Account in TDF
    When User selects following fields for search invoices in my account
      | TollCarrier              | AccountDetail | Type    | InvoiceNumber |
      | Intermodal & Specialised |               | Invoice |               |
    Then User cannot select Status that is disabled
    And User clicks on Search
    Then User can see Invoice Search Results section display the entered fields
      | TollCarrier              | AccountDetail | Type    | Invoice Number |
      | Intermodal & Specialised |               | Invoice |                |
    Then User can see following details in search results
      | InvoiceDate | InvoiceNumber | DueDate | ChargeAmount | AmountDue | PaidAmount | NumberOfInvoices |

@tag1
  Scenario: User search Invoices for my Account in TDF
    When User selects following fields for search invoices in my account
      | TollCarrier              | AccountDetail | Type       |
      | Intermodal & Specialised |               | Date Range |
    And User selects Date Range
    And User clicks on Search
    Then User can see Invoice Search Results section display the entered fields
      | TollCarrier              | AccountDetail | Type       |
      | Intermodal & Specialised |               | Date Range |
    Then User can see following details in search results
      | InvoiceDate | InvoiceNumber | DueDate | ChargeAmount | AmountDue | PaidAmount | NumberOfInvoices |
