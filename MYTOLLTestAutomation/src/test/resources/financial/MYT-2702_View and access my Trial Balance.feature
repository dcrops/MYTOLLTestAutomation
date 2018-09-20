@tag
Feature: MYT-2702_2704_2705_2709_2010 View and access my Trial Balance

  Background: 
    Given User is Registered in MyToll

  @tag1
  Scenario: User wants to view the total balance outstanding in my Account Summary screen in TDF
    Given User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    When User selects status as Outstanding
    And User clicks on Search
    Then User be able to view following details in Trial Balance screen.
      | Total Due | 30Days  | 60Days  | 90Days  | 120Days  |
      | CURRENT   | 30 DAYS | 60 DAYS | 90 DAYS | 120 DAYS |
    And User be able to see all the invoices for that period
    

  @tag1
  Scenario: User wants to view the invoice status in my Account Summary screen in TDF
    Given User is in my Account Summary screen
    When User selects below Toll carrier and the account that has full financial access
      | TollCarrier              | AccountNumber |
      | Intermodal & Specialised |               |
    Then User be able to view paid invoices and connotes as paid.
    Then User be able to view outstanding invoices and connotes with Amount due
    Then User be able to view partially paid invoices and connotes as partial amount paid and amount due.
 