@tag
Feature: MYT-2715 Expanding the shipments in an invoice

  Background: 
    Given User is Registered in MyToll
    
    Scenario: User with BU ADMIN access selects 'other' and add an own account in TDF
    When User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountDetail |
      | Intermodal & Specialised |    Other           |
     Then User enters the "Account Number" 
     When user select Search Type
     And User clicks on Search
     Then User can access and view the Account summary for that account
     

      Scenario: User with BU ADMIN access selects 'other' and add an others account in TDF
    When User is in My Invoices screen selecting below Toll carrier and the account
      | TollCarrier              | AccountDetail |
      | Intermodal & Specialised |    Other           |
     Then User enters the "Account Number" of others
     When user select Search Type
     And User clicks on Search
     Then User can access and view the Account summary for that account