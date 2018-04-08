Feature: MYT_2698 Select Financials

  Background: 
       Given User is Registered in MyToll 

  @tag1
  Scenario: User wants to expand the Charges section of an invoice to view and access my connotes for the invoice in TDF
   When User selects Toll carrier and the account that has full financial access
      | TollCarrier            | AccountNumber                |
      | Toll Energy and Marine | G28405 SANTOS LIMITED (EABU) |
       