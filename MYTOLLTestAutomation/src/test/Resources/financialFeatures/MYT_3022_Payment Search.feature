@tag
Feature: MYT-3022 Payment Search

  Background: 
    Given User is Registered in MyToll

@tag1
  Scenario: User search Payments for my Account in TDF
    When User selects following fields for search invoices in my account
      | TollCarrier              | AccountBillingNumber | Type    | NoReference |
      | Intermodal & Specialised |                      | Payment |        1234 |
    And User keeps Date Range to current month
    And User clicks on Search
    Then User can see Invoice Search Results section display the entered fields
      | TollCarrier              | AccountBillingNumber | Type    | NoReference |
      | Intermodal & Specialised |                      | Payment |        1234 |
    Then User can see default Date Range
    Then User be able to see following details in search results
      | InvoiceDate | InvoiceNumber | DueDate | ChargeAmount | AmountDue | PaidAmount | NumberOfInvoices |

@tag2
  Scenario: User search Payments for my Account in TDF
    When User selects following fields for search invoices in my account
      | TollCarrier              | AccountBillingNumber | Type    | NoReference |
      | Intermodal & Specialised |                      | Payment |        1234 |
    And User clicks on Search
    Then User can see Invoice Search Results section display the entered fields
      | TollCarrier              | AccountBillingNumber | Type    | NoReference |
      | Intermodal & Specialised |                      | Payment |        1234 |
    Then User be able to see following details in search results
      | InvoiceDate | InvoiceNumber | DueDate | ChargeAmount | AmountDue | PaidAmount | NumberOfInvoices |

@tag3
  Scenario: User search Payments for my Account in TDF
    When User selects following fields for search invoices in my account
      | TollCarrier              | AccountBillingNumber | Type    |
      | Intermodal & Specialised |                      | Payment |
    And User selects Date Range
    And User clicks on Search
    Then User can see Invoice Search Results section display the entered fields
      | TollCarrier              | AccountBillingNumber | Type    | NoReference |
      | Intermodal & Specialised |                      | Payment |        1234 |
    Then User be able to see following details in search results
      | InvoiceDate | InvoiceNumber | DueDate | ChargeAmount | AmountDue | PaidAmount | NumberOfInvoices |
