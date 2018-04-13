Feature: MYT_2698 Select Financials

  Background: 
       Given User is Registered in MyToll 

  @tag1
  Scenario: User wants to expand the Charges section of an invoice to view and access my connotes for the invoice in TDF
    Then User be able to see "CHARGES" section for following Consignment
     | Consignment |
      |  6270032307 |
       