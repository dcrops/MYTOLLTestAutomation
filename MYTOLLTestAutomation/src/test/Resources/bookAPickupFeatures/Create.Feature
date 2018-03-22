Feature: MYT-5885 User needs to Edit Sender Address from 'Book a pickup' page

Background:
		Given User is Registered in MyToll and is on Book a pickup page

Scenario: User wants to Print and/or Share my pick up booking in TGX
  When User clicks on ADD NEW LINES to add an another item and User enters following input data for the line item
      | Item description     | Billing Type | No of Items | Item Type | Length | Width | Height | TotalCubicVolume | TotalWeight | SenderReference | ReceiverReference |
      | Automation Template2 | Express      |          20 | Misc      |    200 |   200 |    200 |              150 |         900 | Ref567          | Ref987            |
       When User selects dispatch date as tomorrow
    Then User be able to see second item details entered in Review Your Pickup screen
      | ItemDescription     | Service    | Mode | ChargeTo | NoOfItems | PalletSpaces | Length | Width | Height | TotalWeight | DangerousGoods | FoodItem |
      | Automation Template | DG Express | Rail | Sender   |        10 |            6 |    100 |   100 |    100 |         900 | Yes            | No       |
    When User selects Toll Carrier and Account Number
      | TollCarrier         | AccountNumber |
      | Toll Priority (Aus) | 200BHY        |
    And User selects a existing Sender address from the Sender field
      | Sender      |
      | NZ Post Ltd |
    When User enter following input data to Add Item for Prio Aus
      | Service                    | Destination | DescriptionOfGoods |
      | Global - Express Documents | WELLINGTON  | Test Description   |
