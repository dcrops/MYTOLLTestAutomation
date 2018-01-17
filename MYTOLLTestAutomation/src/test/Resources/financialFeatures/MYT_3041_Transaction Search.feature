@tag
Feature: MYT-3041 Transaction Search

  Background: 
    Given User is Registered in MyToll

  Scenario: User search Transactions for my Account in TDF
    When User selects following fields for search invoices in my account
      | TollCarrier              | AccountBillingNumber | Type        | TransactionNumber |
      | Intermodal & Specialised |                      | Transaction |              1234 |
    And User keeps Date Range to current month
    And User clicks on Search
    Then User can see Invoice Search Results section display the entered fields
      | TollCarrier              | AccountBillingNumber | Type        | TransactionNumber |
      | Intermodal & Specialised |                      | Transaction |              1234 |
    Then User can see default Date Range
    Then User be able to see following details in search results
      | InvoiceDate | InvoiceNumber | DueDate | ChargeAmount | AmountDue | PaidAmount | NumberOfInvoices |
    Then User be able to view "Shipments", "Miscellaneous Invoices", "Debit / Credit Notes", "Other" Transactions

  Scenario: User search Transactions for my Account in TDF
    When User selects following fields for search invoices in my account
      | TollCarrier              | AccountBillingNumber | Type        | TransactionNumber |
      | Intermodal & Specialised |                      | Transaction |              1234 |
    And User clicks on Search
    Then User can see Invoice Search Results section display the entered fields
      | TollCarrier              | AccountBillingNumber | Type        | TransactionNumber |
      | Intermodal & Specialised |                      | Transaction |              1234 |
    Then User be able to see following details in search results
      | InvoiceDate | InvoiceNumber | DueDate | ChargeAmount | AmountDue | PaidAmount | NumberOfInvoices |
    Then User be able to view "Shipments", "Miscellaneous Invoices", "Debit / Credit Notes", "Other" Transactions

  Scenario: User search Transactions for my Account in TDF
    When User selects following fields for search invoices in my account
      | TollCarrier              | AccountBillingNumber | Type        |
      | Intermodal & Specialised |                      | Transaction |
    And User enters Date Range
    And User clicks on Search
    Then User can see Invoice Search Results section display the entered fields
      | TollCarrier              | AccountBillingNumber | Type        |
      | Intermodal & Specialised |                      | Transaction |
    Then User can see entered Date Range
    Then User be able to see following details in search results
      | InvoiceDate | InvoiceNumber | DueDate | ChargeAmount | AmountDue | PaidAmount | NumberOfInvoices |
    Then User be able to view "Shipments", "Miscellaneous Invoices", "Debit / Credit Notes", "Other" Transactions
