Feature: MYT-5885 User needs to Edit Sender Address from 'Book a pickup' page

Background:
		Given User is Registered in MyToll and is on Book a pickup page

Scenario: User wants to Print and/or Share my pick up booking in TGX
    When User selects Toll Carrier and Account Number
      | TollCarrier         | AccountNumber |
      | Toll Priority (Aus) | 200BHY        |
    And User selects a existing Sender address from the Sender field
      | Sender      |
      | NZ Post Ltd |
    When User enter following input data to Add Item for Prio Aus
      | Service                    | Destination | DescriptionOfGoods |
      | Global - Express Documents | WELLINGTON  | Test Description   |
